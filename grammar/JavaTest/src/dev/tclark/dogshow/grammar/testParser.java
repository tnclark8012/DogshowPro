// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2014-01-05 15:02:29

//TODO Puppy groups
package dev.tclark.dogshow.grammar;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.regex.Pattern;          
import java.util.regex.Matcher;

import com.google.gson.JsonElement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class testParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREED_CLASSIFIER", "BREED_COUNT", "BREED_MISC", "BREED_NAME", "BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "END_WORD", "FOLLOWING_TIME", "FRAG_BEST_IN_SHOW", "FRAG_BREED_ATTRIBUTE", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP", "FRAG_GROUP_NAME", "FRAG_MONTH", "FRAG_PROPER_NAME", "FRAG_RALLY_CLASS_NAME", "FRAG_RALLY_CLASS_SECTION", "FRAG_RALLY_ENTRANT_GROUP", "FRAG_RALLY_SINGLE_ENTRANT", "FRAG_RING", "FRAG_SEX", "FRAG_SPECIAL_GROUP_NAME", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_TO_FOLLOW", "FRAG_WEEK_DAY", "FallThrough", "GROUP_ENDING_ANNOUNCEMENT", "GROUP_NAME", "GROUP_RING", "INT", "JUDGE_NAME", "JUNIOR_CLASS", "NON_CONFORMATION_CLASS_LEVEL", "NON_CONFORMATION_CLASS_NAME", "NON_CONFORMATION_CLASS_SECTION", "NON_CONFORMATION_CLASS_SUFFIX", "NON_CONFORMATION_SECOND_LINE", "NON_CONF_SECOND_LINE_COMMENT", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "RALLY_CLASS", "RALLY_ENTRY", "RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
	};

	public static final int EOF=-1;
	public static final int BREED_CLASSIFIER=4;
	public static final int BREED_COUNT=5;
	public static final int BREED_MISC=6;
	public static final int BREED_NAME=7;
	public static final int BREED_NAME_SUFFIX=8;
	public static final int COMMENT=9;
	public static final int DATE=10;
	public static final int ELLIPSIS=11;
	public static final int END_PUNCTUATION=12;
	public static final int END_WORD=13;
	public static final int FOLLOWING_TIME=14;
	public static final int FRAG_BEST_IN_SHOW=15;
	public static final int FRAG_BREED_ATTRIBUTE=16;
	public static final int FRAG_BREED_NAME_ALT=17;
	public static final int FRAG_BREED_NAME_CATEGORY=18;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=19;
	public static final int FRAG_BREED_NAME_SINGLE=20;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=21;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP=22;
	public static final int FRAG_GROUP_NAME=23;
	public static final int FRAG_MONTH=24;
	public static final int FRAG_PROPER_NAME=25;
	public static final int FRAG_RALLY_CLASS_NAME=26;
	public static final int FRAG_RALLY_CLASS_SECTION=27;
	public static final int FRAG_RALLY_ENTRANT_GROUP=28;
	public static final int FRAG_RALLY_SINGLE_ENTRANT=29;
	public static final int FRAG_RING=30;
	public static final int FRAG_SEX=31;
	public static final int FRAG_SPECIAL_GROUP_NAME=32;
	public static final int FRAG_SPEC_CHAR=33;
	public static final int FRAG_SPEC_WORD_CHAR=34;
	public static final int FRAG_TIME_LABEL=35;
	public static final int FRAG_TITLE=36;
	public static final int FRAG_TO_FOLLOW=37;
	public static final int FRAG_WEEK_DAY=38;
	public static final int FallThrough=39;
	public static final int GROUP_ENDING_ANNOUNCEMENT=40;
	public static final int GROUP_NAME=41;
	public static final int GROUP_RING=42;
	public static final int INT=43;
	public static final int JUDGE_NAME=44;
	public static final int JUNIOR_CLASS=45;
	public static final int NON_CONFORMATION_CLASS_LEVEL=46;
	public static final int NON_CONFORMATION_CLASS_NAME=47;
	public static final int NON_CONFORMATION_CLASS_SECTION=48;
	public static final int NON_CONFORMATION_CLASS_SUFFIX=49;
	public static final int NON_CONFORMATION_SECOND_LINE=50;
	public static final int NON_CONF_SECOND_LINE_COMMENT=51;
	public static final int PARENTHETICAL=52;
	public static final int PARENTHETICAL_INT=53;
	public static final int PARENTHETICAL_NAME=54;
	public static final int PHONE_NUMBER=55;
	public static final int RALLY_CLASS=56;
	public static final int RALLY_ENTRY=57;
	public static final int RING_TITLE=58;
	public static final int SPECIAL_SUFFIX=59;
	public static final int STANDALONE_COMMENT=60;
	public static final int TIME=61;
	public static final int WORD=62;
	public static final int WS=63;

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
	JsonObject mCurrentJudge = null;
	int mCurrentRingNumber = -1;
	String mLastBreedName = null;
	String mCurrentClass = null;
	//Tracks all judges as they are parsed
	Set<String> judgeSet = new HashSet<String>();
	boolean nextJudgeIsNewRing = false;
	String latestBreed = "";
	// end non-relational

	public void setRelationalParse(boolean value)
	{
		mRelational = value;
	}

	public void addCurrentJudge(JsonObject json)
	{
	mergeJson(json,mCurrentJudge);
	if(mCurrentJudge.has("NewJudgeRing"))mCurrentJudge.remove("NewJudgeRing");
	}
	/**
	* Checks if strings are part of a judge's name who's been discovered. Used to assure that judges' names which look like comments (no title or parenthetical int following) are not matched as such
	*/
	public boolean areJudgeNames(String str1, String str2)
	{
		for(String s : judgeSet){
			if( s.contains(str1) && s.contains(str2))
			{
			
			return true;
			}
		}
		return false;
	}
	public String stripJudgeCount(String judgeText){
		return judgeText.replaceAll("\\(\\d+\\)","");
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:176:1: start returns [JsonObject json] : (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		String mComment =null;
		JsonObject mRing =null;

		json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:3: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:4: (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:4: (mComment= big_comment )+
			int cnt1=0;
			loop1:
			do {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==BREED_CLASSIFIER||LA1_0==BREED_NAME||(LA1_0 >= COMMENT && LA1_0 <= ELLIPSIS)||(LA1_0 >= GROUP_RING && LA1_0 <= INT)||LA1_0==NON_CONFORMATION_CLASS_NAME||LA1_0==NON_CONFORMATION_SECOND_LINE||LA1_0==PARENTHETICAL||LA1_0==PHONE_NUMBER||LA1_0==SPECIAL_SUFFIX||LA1_0==TIME) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:5: mComment= big_comment
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:94: ( ( ring )=>mRing= ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:95: ( ring )=>mRing= ring
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:1: ring returns [JsonObject json] : RING_TITLE mRing= inner_ring ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		Token RING_TITLE1=null;
		JsonObject mRing =null;

		json = new JsonObject();if(debug){System.out.println("ring...");}
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:183:3: ( RING_TITLE mRing= inner_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:183:7: RING_TITLE mRing= inner_ring
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:1: inner_ring returns [JsonObject json] : ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) );
	public final JsonObject inner_ring() throws RecognitionException {
		JsonObject json = null;


		JsonObject mGroupBlock =null;
		JsonObject mJugeBlock =null;

		json = new JsonObject();JsonArray judgeBlocks = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:2: ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:6: ( group_block )=>mGroupBlock= group_block ( comment )*
					{
					pushFollow(FOLLOW_group_block_in_inner_ring140);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:82: ( comment )*
					loop3:
					do {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==BREED_CLASSIFIER||LA3_0==BREED_NAME||(LA3_0 >= COMMENT && LA3_0 <= ELLIPSIS)||LA3_0==INT||LA3_0==NON_CONFORMATION_CLASS_NAME||LA3_0==NON_CONFORMATION_SECOND_LINE||LA3_0==PARENTHETICAL||LA3_0==PHONE_NUMBER||LA3_0==TIME) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:82: comment
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:7: ( (mJugeBlock= judge_block )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:7: ( (mJugeBlock= judge_block )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:8: (mJugeBlock= judge_block )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:8: (mJugeBlock= judge_block )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:9: mJugeBlock= judge_block
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:188:1: judge_block returns [JsonObject json] : mName= judge_name (mBlock= timeblock )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		JsonObject mName =null;
		JsonObject mBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray();nextJudgeIsNewRing = true;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:190:5: (mName= judge_name (mBlock= timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:190:9: mName= judge_name (mBlock= timeblock )+
			{
			pushFollow(FOLLOW_judge_name_in_judge_block187);
			mName=judge_name();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {if(!mRelational){mCurrentJudge = mName;judgeSet.add(mCurrentJudge.get("Judge").getAsString());}mergeJson(json, mName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:190:146: (mBlock= timeblock )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:190:147: mBlock= timeblock
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:191:1: judge_name returns [JsonObject json] : ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ ) ;
	public final JsonObject judge_name() throws RecognitionException {
		JsonObject json = null;


		Token JUDGE_NAME2=null;
		Token COMMENT3=null;
		Token PARENTHETICAL4=null;
		Token PARENTHETICAL_INT5=null;

		json = new JsonObject(); String str = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:2: ( ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:4: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:4: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==JUDGE_NAME) ) {
				alt9=1;
			}
			else if ( (LA9_0==COMMENT||(LA9_0 >= PARENTHETICAL && LA9_0 <= PARENTHETICAL_INT)) ) {
				alt9=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:5: ( JUDGE_NAME )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:5: ( JUDGE_NAME )+
					int cnt7=0;
					loop7:
					do {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==JUDGE_NAME) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:6: JUDGE_NAME
							{
							JUDGE_NAME2=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_name218); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(JUDGE_NAME2!=null?JUDGE_NAME2.getText():null);}
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

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:194:3: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:194:3: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					int cnt8=0;
					loop8:
					do {
						int alt8=4;
						switch ( input.LA(1) ) {
						case COMMENT:
							{
							alt8=1;
							}
							break;
						case PARENTHETICAL:
							{
							alt8=2;
							}
							break;
						case PARENTHETICAL_INT:
							{
							alt8=3;
							}
							break;
						}
						switch (alt8) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:194:4: COMMENT
							{
							COMMENT3=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_judge_name227); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(COMMENT3!=null?COMMENT3.getText():null)+" ";}
							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:194:37: PARENTHETICAL
							{
							PARENTHETICAL4=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_judge_name230); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL4!=null?PARENTHETICAL4.getText():null)+" ";}
							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:194:82: PARENTHETICAL_INT
							{
							PARENTHETICAL_INT5=(Token)match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_judge_name233); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL_INT5!=null?PARENTHETICAL_INT5.getText():null);}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return json;}
								EarlyExitException eee =
									new EarlyExitException(8, input);
								throw eee;
						}
						cnt8++;
					} while (true);

					}
					break;

			}

			if ( state.backtracking==0 ) {if(nextJudgeIsNewRing == true||str.matches(".*\\(\\d+\\).*")){ nextJudgeIsNewRing = false;json.addProperty("NewJudgeRing",true); }str = str.replaceAll("[\r\n]"," ");json.addProperty("Judge",stripJudgeCount(str).trim());}
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
	// $ANTLR end "judge_name"



	// $ANTLR start "big_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:1: big_comment returns [String str] : (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) ;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:3: ( (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			int alt10=7;
			switch ( input.LA(1) ) {
			case BREED_CLASSIFIER:
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:8: mComment= comment
					{
					pushFollow(FOLLOW_comment_in_big_comment264);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:42: TIME
					{
					TIME6=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment267); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME6!=null?TIME6.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:64: PHONE_NUMBER
					{
					PHONE_NUMBER7=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_big_comment270); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER7!=null?PHONE_NUMBER7.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:102: BREED_NAME
					{
					BREED_NAME8=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment273); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME8!=null?BREED_NAME8.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:136: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX9=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment276); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX9!=null?SPECIAL_SUFFIX9.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:178: GROUP_RING
					{
					GROUP_RING10=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment279); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_RING10!=null?GROUP_RING10.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:212: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE11=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment282); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:199:1: comment returns [String str] : ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) ;
	public final String comment() throws RecognitionException {
		String str = null;


		Token NON_CONFORMATION_CLASS_NAME12=null;
		Token BREED_NAME13=null;
		Token BREED_CLASSIFIER14=null;
		Token TIME15=null;
		Token COMMENT16=null;
		Token PARENTHETICAL17=null;
		Token INT18=null;
		Token ELLIPSIS19=null;
		Token DATE20=null;
		Token PHONE_NUMBER21=null;
		Token NON_CONFORMATION_SECOND_LINE22=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:3: ( ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
			int alt11=11;
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
			case BREED_CLASSIFIER:
				{
				alt11=3;
				}
				break;
			case TIME:
				{
				alt11=4;
				}
				break;
			case COMMENT:
				{
				alt11=5;
				}
				break;
			case PARENTHETICAL:
				{
				alt11=6;
				}
				break;
			case INT:
				{
				alt11=7;
				}
				break;
			case ELLIPSIS:
				{
				alt11=8;
				}
				break;
			case DATE:
				{
				alt11=9;
				}
				break;
			case PHONE_NUMBER:
				{
				alt11=10;
				}
				break;
			case NON_CONFORMATION_SECOND_LINE:
				{
				alt11=11;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:6: NON_CONFORMATION_CLASS_NAME
					{
					NON_CONFORMATION_CLASS_NAME12=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment305); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME12!=null?NON_CONFORMATION_CLASS_NAME12.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:74: BREED_NAME
					{
					BREED_NAME13=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_comment308); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME13!=null?BREED_NAME13.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:108: BREED_CLASSIFIER
					{
					BREED_CLASSIFIER14=(Token)match(input,BREED_CLASSIFIER,FOLLOW_BREED_CLASSIFIER_in_comment311); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_CLASSIFIER14!=null?BREED_CLASSIFIER14.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:154: TIME
					{
					TIME15=(Token)match(input,TIME,FOLLOW_TIME_in_comment314); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME15!=null?TIME15.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:176: COMMENT
					{
					COMMENT16=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment317); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT16!=null?COMMENT16.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:204: PARENTHETICAL
					{
					PARENTHETICAL17=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment320); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL17!=null?PARENTHETICAL17.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:244: INT
					{
					INT18=(Token)match(input,INT,FOLLOW_INT_in_comment323); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT18!=null?INT18.getText():null);}
					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:264: ELLIPSIS
					{
					ELLIPSIS19=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment326); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS19!=null?ELLIPSIS19.getText():null);}
					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:294: DATE
					{
					DATE20=(Token)match(input,DATE,FOLLOW_DATE_in_comment329); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE20!=null?DATE20.getText():null);}
					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:316: PHONE_NUMBER
					{
					PHONE_NUMBER21=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment332); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER21!=null?PHONE_NUMBER21.getText():null);}
					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:354: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE22=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment335); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_SECOND_LINE22!=null?NON_CONFORMATION_SECOND_LINE22.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:202:1: timeblock_comment returns [String str] : ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING ) ;
	public final String timeblock_comment() throws RecognitionException {
		String str = null;


		Token NON_CONFORMATION_CLASS_NAME23=null;
		Token BREED_NAME24=null;
		Token COMMENT25=null;
		Token PARENTHETICAL26=null;
		Token INT27=null;
		Token ELLIPSIS28=null;
		Token DATE29=null;
		Token PHONE_NUMBER30=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:3: ( ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING )
			int alt12=11;
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
			case NON_CONF_SECOND_LINE_COMMENT:
				{
				alt12=10;
				}
				break;
			case GROUP_RING:
				{
				alt12=11;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:6: NON_CONFORMATION_CLASS_NAME
					{
					NON_CONFORMATION_CLASS_NAME23=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment357); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME23!=null?NON_CONFORMATION_CLASS_NAME23.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:74: BREED_NAME
					{
					BREED_NAME24=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_timeblock_comment360); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME24!=null?BREED_NAME24.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:108: COMMENT
					{
					COMMENT25=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment363); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT25!=null?COMMENT25.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:136: PARENTHETICAL
					{
					PARENTHETICAL26=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_timeblock_comment366); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL26!=null?PARENTHETICAL26.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:176: INT
					{
					INT27=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment369); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT27!=null?INT27.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:196: ELLIPSIS
					{
					ELLIPSIS28=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment372); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS28!=null?ELLIPSIS28.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:226: DATE
					{
					DATE29=(Token)match(input,DATE,FOLLOW_DATE_in_timeblock_comment375); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE29!=null?DATE29.getText():null);}
					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:248: PHONE_NUMBER
					{
					PHONE_NUMBER30=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment378); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER30!=null?PHONE_NUMBER30.getText():null);}
					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:286: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment381); if (state.failed) return str;
					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:301: NON_CONF_SECOND_LINE_COMMENT
					{
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_timeblock_comment383); if (state.failed) return str;
					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:330: GROUP_RING
					{
					match(input,GROUP_RING,FOLLOW_GROUP_RING_in_timeblock_comment385); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:1: ring_comment returns [String str] : ( STANDALONE_COMMENT | timeblock_comment );
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT31=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:5: ( STANDALONE_COMMENT | timeblock_comment )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==STANDALONE_COMMENT) ) {
				alt13=1;
			}
			else if ( (LA13_0==BREED_NAME||(LA13_0 >= COMMENT && LA13_0 <= ELLIPSIS)||(LA13_0 >= GROUP_RING && LA13_0 <= INT)||LA13_0==NON_CONFORMATION_CLASS_NAME||(LA13_0 >= NON_CONF_SECOND_LINE_COMMENT && LA13_0 <= PARENTHETICAL)||LA13_0==PHONE_NUMBER||LA13_0==SPECIAL_SUFFIX) ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:9: STANDALONE_COMMENT
					{
					STANDALONE_COMMENT31=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment407); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT31!=null?STANDALONE_COMMENT31.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:59: timeblock_comment
					{
					pushFollow(FOLLOW_timeblock_comment_in_ring_comment410);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:210:1: timeblock returns [JsonObject json] : ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )* ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token INT32=null;
		Token TIME33=null;
		JsonArray rings =null;
		String mComment =null;

		json = new JsonObject(); String comment = ""; String time = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:212:2: ( ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:212:4: ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:212:4: ( ( INT FOLLOWING_TIME ) | TIME )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:6: ( INT FOLLOWING_TIME )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:6: ( INT FOLLOWING_TIME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:214:3: INT FOLLOWING_TIME
					{
					INT32=(Token)match(input,INT,FOLLOW_INT_in_timeblock442); if (state.failed) return json;
					if ( state.backtracking==0 ) {
									currentBlockTime=(INT32!=null?INT32.getText():null);
									json.addProperty("BlockStart", currentBlockTime);
								}
					match(input,FOLLOWING_TIME,FOLLOW_FOLLOWING_TIME_in_timeblock452); if (state.failed) return json;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:221:7: TIME
					{
					TIME33=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock469); if (state.failed) return json;
					if ( state.backtracking==0 ) {
						     		currentBlockTime=(TIME33!=null?TIME33.getText():null);
						     		json.addProperty("BlockStart", currentBlockTime);
						     	}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:5: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*
			loop16:
			do {
				int alt16=2;
				alt16 = dfa16.predict(input);
				switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:6: rings= inner_timeblock ({...}? =>mComment= timeblock_comment )*
					{
					pushFollow(FOLLOW_inner_timeblock_in_timeblock500);
					rings=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {
						   		if(json.has("Rings")){
						   			JsonArray already=json.getAsJsonArray("Rings");
						   			already.addAll(rings);
						   			json.add("Rings",already);
						   		}
						   		else{
						   			json.add("Rings", rings);
						   		}
						   		}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:6: ({...}? =>mComment= timeblock_comment )*
					loop15:
					do {
						int alt15=2;
						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA15_2 = input.LA(2);
							if ( (((synpred41_test()&&synpred41_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA15_3 = input.LA(2);
							if ( (((synpred41_test()&&synpred41_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case INT:
							{
							int LA15_4 = input.LA(2);
							if ( (((synpred41_test()&&synpred41_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case NON_CONFORMATION_CLASS_NAME:
							{
							int LA15_5 = input.LA(2);
							if ( (((synpred41_test()&&synpred41_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case BREED_NAME:
							{
							int LA15_6 = input.LA(2);
							if ( (((synpred41_test()&&synpred41_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case ELLIPSIS:
							{
							int LA15_7 = input.LA(2);
							if ( (((synpred41_test()&&synpred41_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case DATE:
							{
							int LA15_8 = input.LA(2);
							if ( (((synpred41_test()&&synpred41_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case PHONE_NUMBER:
							{
							int LA15_9 = input.LA(2);
							if ( (((synpred41_test()&&synpred41_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case SPECIAL_SUFFIX:
							{
							int LA15_10 = input.LA(2);
							if ( (((synpred41_test()&&synpred41_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case NON_CONF_SECOND_LINE_COMMENT:
							{
							int LA15_11 = input.LA(2);
							if ( (((synpred41_test()&&synpred41_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case GROUP_RING:
							{
							int LA15_12 = input.LA(2);
							if ( (((synpred41_test()&&synpred41_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						}
						switch (alt15) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:7: {...}? =>mComment= timeblock_comment
							{
							if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
								if (state.backtracking>0) {state.failed=true; return json;}
								throw new FailedPredicateException(input, "timeblock", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
							}
							pushFollow(FOLLOW_timeblock_comment_in_timeblock528);
							mComment=timeblock_comment();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {
								   			comment+=mComment;
								   			}
							}
							break;

						default :
							break loop15;
						}
					} while (true);

					if ( state.backtracking==0 ) {
						   		if(!comment.equals("")){
						   			json.add("timeblock_comment",new JsonPrimitive(comment));
						   		}
						   		}
					}
					break;

				default :
					break loop16;
				}
			} while (true);

			if ( state.backtracking==0 ) {
				   	if(!mRelational&&json.has("Rings")){
				   		mShowRings.addAll(json.getAsJsonArray("Rings"));
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
	// $ANTLR end "timeblock"



	// $ANTLR start "non_group_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:257:1: non_group_ring returns [JsonObject json] : INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) ;
	public final JsonObject non_group_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT34=null;
		JsonObject mRingWithBreed =null;
		JsonObject mRingWithoutBreed =null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:32: ( INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:2: INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
			{
			INT34=(Token)match(input,INT,FOLLOW_INT_in_non_group_ring583); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Count", parseIntSafely((INT34!=null?INT34.getText():null),0));}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:2: ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BREED_CLASSIFIER||LA17_0==BREED_NAME) ) {
				alt17=1;
			}
			else if ( (LA17_0==BREED_COUNT||LA17_0==JUNIOR_CLASS||LA17_0==NON_CONFORMATION_CLASS_NAME||LA17_0==NON_CONF_SECOND_LINE_COMMENT||LA17_0==RALLY_CLASS||LA17_0==SPECIAL_SUFFIX) ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:2: (mRingWithBreed= ring_with_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:2: (mRingWithBreed= ring_with_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:3: mRingWithBreed= ring_with_breed
					{
					pushFollow(FOLLOW_ring_with_breed_in_non_group_ring593);
					mRingWithBreed=ring_with_breed();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mRingWithBreed);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:2: (mRingWithoutBreed= ring_without_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:2: (mRingWithoutBreed= ring_without_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:3: mRingWithoutBreed= ring_without_breed
					{
					pushFollow(FOLLOW_ring_without_breed_in_non_group_ring602);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:266:1: inner_timeblock returns [JsonArray array] : ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? => ring_comment )+ ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject mName =null;
		JsonObject nonGroupRing =null;
		JsonObject mRallyWalkthrough =null;

		array = new JsonArray();JsonObject toAdd = null;int countAhead = 0;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:2: ( ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? => ring_comment )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? => ring_comment )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? => ring_comment )+
			int cnt20=0;
			loop20:
			do {
				int alt20=3;
				switch ( input.LA(1) ) {
				case NON_CONFORMATION_CLASS_NAME:
					{
					int LA20_1 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				case BREED_NAME:
					{
					int LA20_2 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				case COMMENT:
					{
					int LA20_3 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt20=1;
					}
					else if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA20_4 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt20=1;
					}
					else if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				case INT:
					{
					int LA20_5 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt20=1;
					}
					else if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				case ELLIPSIS:
					{
					int LA20_6 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				case DATE:
					{
					int LA20_7 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				case PHONE_NUMBER:
					{
					int LA20_8 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				case SPECIAL_SUFFIX:
					{
					int LA20_9 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				case NON_CONF_SECOND_LINE_COMMENT:
					{
					int LA20_10 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				case GROUP_RING:
					{
					int LA20_11 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				case JUDGE_NAME:
					{
					int LA20_13 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt20=1;
					}

					}
					break;
				case PARENTHETICAL_INT:
					{
					int LA20_14 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt20=1;
					}

					}
					break;
				case RALLY_CLASS:
					{
					int LA20_15 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt20=1;
					}

					}
					break;
				case STANDALONE_COMMENT:
					{
					int LA20_16 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred47_test())) ) {
						alt20=2;
					}

					}
					break;
				}
				switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==COMMENT||(LA19_0 >= INT && LA19_0 <= JUDGE_NAME)||(LA19_0 >= PARENTHETICAL && LA19_0 <= PARENTHETICAL_INT)) ) {
						alt19=1;
					}
					else if ( (LA19_0==RALLY_CLASS) ) {
						alt19=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return array;}
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:5: (mName= judge_name )? nonGroupRing= non_group_ring
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:5: (mName= judge_name )?
							int alt18=2;
							int LA18_0 = input.LA(1);
							if ( (LA18_0==COMMENT||LA18_0==JUDGE_NAME||(LA18_0 >= PARENTHETICAL && LA18_0 <= PARENTHETICAL_INT)) ) {
								alt18=1;
							}
							switch (alt18) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:6: mName= judge_name
									{
									pushFollow(FOLLOW_judge_name_in_inner_timeblock643);
									mName=judge_name();
									state._fsp--;
									if (state.failed) return array;
									if ( state.backtracking==0 ) {mCurrentJudge = mName;judgeSet.add(mName.get("Judge").getAsString());}
									}
									break;

							}

							pushFollow(FOLLOW_non_group_ring_in_inner_timeblock655);
							nonGroupRing=non_group_ring();
							state._fsp--;
							if (state.failed) return array;
							if ( state.backtracking==0 ) {
									  	nonGroupRing.addProperty("BlockStart",currentBlockTime);
									  	nonGroupRing.addProperty("Number",mCurrentRingNumber);
									  	addCurrentJudge(nonGroupRing);
									  	nonGroupRing.add("CountAhead",new JsonPrimitive(countAhead));
									  	countAhead+=nonGroupRing.get("Count").getAsInt();
									  	if(!nonGroupRing.has("Skip"))array.add(nonGroupRing);
									  	}
							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:5: (mRallyWalkthrough= rally_walkthrough )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:5: (mRallyWalkthrough= rally_walkthrough )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:6: mRallyWalkthrough= rally_walkthrough
							{
							pushFollow(FOLLOW_rally_walkthrough_in_inner_timeblock672);
							mRallyWalkthrough=rally_walkthrough();
							state._fsp--;
							if (state.failed) return array;
							if ( state.backtracking==0 ) {
									  	mRallyWalkthrough.addProperty("BlockStart",currentBlockTime);
										mRallyWalkthrough.addProperty("Count", 0);
									  	mRallyWalkthrough.addProperty("Number",mCurrentRingNumber);
									  	mRallyWalkthrough.add("CountAhead",new JsonPrimitive(countAhead));
										addCurrentJudge(mRallyWalkthrough);
									  	if(!mRallyWalkthrough.has("Skip"))array.add(mRallyWalkthrough);
									  	}
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:291:5: {...}? => ring_comment
					{
					if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
						if (state.backtracking>0) {state.failed=true; return array;}
						throw new FailedPredicateException(input, "inner_timeblock", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
					}
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock700);
					ring_comment();
					state._fsp--;
					if (state.failed) return array;
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					if (state.backtracking>0) {state.failed=true; return array;}
						EarlyExitException eee =
							new EarlyExitException(20, input);
						throw eee;
				}
				cnt20++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:296:1: rally_walkthrough returns [JsonObject json] : RALLY_CLASS ;
	public final JsonObject rally_walkthrough() throws RecognitionException {
		JsonObject json = null;


		Token RALLY_CLASS35=null;

		json = new JsonObject();json.addProperty("RingType","Rally");json.addProperty("Count",0);
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:98: ( RALLY_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:298:3: RALLY_CLASS
			{
			RALLY_CLASS35=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_walkthrough727); if (state.failed) return json;
			if ( state.backtracking==0 ) {String title = (RALLY_CLASS35!=null?RALLY_CLASS35.getText():null); json.addProperty("RallyName", title.replace(" Walkthrough", "")); json.addProperty("IsWalkthrough",true); }
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:300:1: ring_with_breed returns [JsonObject json] : breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) ;
	public final JsonObject ring_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT36=null;
		JsonObject breedName =null;
		JsonObject suffix =null;
		JsonObject obedience =null;

		json = new JsonObject();json.addProperty("RingType","Unassigned");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:74: (breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:2: breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			{
			pushFollow(FOLLOW_breed_name_in_ring_with_breed746);
			breedName=breed_name();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("RingType", "Conformation");mergeJson(json,breedName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:2: (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			int alt22=3;
			switch ( input.LA(1) ) {
			case SPECIAL_SUFFIX:
				{
				int LA22_1 = input.LA(2);
				if ( (synpred48_test()) ) {
					alt22=1;
				}
				else if ( (true) ) {
					alt22=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return json;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
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
					alt22=2;
					}
					break;
				case INT:
					{
					int LA22_6 = input.LA(3);
					if ( (synpred49_test()) ) {
						alt22=2;
					}
					else if ( (true) ) {
						alt22=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return json;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 22, 6, input);
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
				case GROUP_RING:
				case JUDGE_NAME:
				case NON_CONFORMATION_CLASS_NAME:
				case NON_CONF_SECOND_LINE_COMMENT:
				case PARENTHETICAL:
				case PARENTHETICAL_INT:
				case PHONE_NUMBER:
				case RALLY_CLASS:
				case RING_TITLE:
				case SPECIAL_SUFFIX:
				case STANDALONE_COMMENT:
				case TIME:
					{
					alt22=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return json;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 2, input);
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
			case GROUP_RING:
			case INT:
			case JUDGE_NAME:
			case NON_CONFORMATION_CLASS_NAME:
			case NON_CONF_SECOND_LINE_COMMENT:
			case PARENTHETICAL:
			case PARENTHETICAL_INT:
			case PHONE_NUMBER:
			case RALLY_CLASS:
			case RING_TITLE:
			case STANDALONE_COMMENT:
			case TIME:
				{
				alt22=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:3: suffix= special_suffix
					{
					pushFollow(FOLLOW_special_suffix_in_ring_with_breed757);
					suffix=special_suffix();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,suffix);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:3: (obedience= obedience_with_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:3: (obedience= obedience_with_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:4: obedience= obedience_with_breed
					{
					pushFollow(FOLLOW_obedience_with_breed_in_ring_with_breed766);
					obedience=obedience_with_breed();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("Skip",true);}
					}

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:3: ( ( BREED_COUNT )? )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:3: ( ( BREED_COUNT )? )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:4: ( BREED_COUNT )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:4: ( BREED_COUNT )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==BREED_COUNT) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:5: BREED_COUNT
							{
							BREED_COUNT36=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_ring_with_breed775); if (state.failed) return json;
							if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT36!=null?BREED_COUNT36.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:308:1: obedience_with_breed returns [JsonObject json] : COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) ;
	public final JsonObject obedience_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token mEntry=null;
		Token mNumber=null;

		json = new JsonObject(); json.addProperty("Type", "Obedience"); json.addProperty("Class",mCurrentClass);
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:309:112: ( COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:2: COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
			{
			match(input,COMMENT,FOLLOW_COMMENT_in_obedience_with_breed796); if (state.failed) return json;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:10: ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==NON_CONFORMATION_SECOND_LINE) ) {
				alt23=1;
			}
			else if ( (LA23_0==INT) ) {
				alt23=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:11: (mEntry= NON_CONFORMATION_SECOND_LINE )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:11: (mEntry= NON_CONFORMATION_SECOND_LINE )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:12: mEntry= NON_CONFORMATION_SECOND_LINE
					{
					mEntry=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed802); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("obedienceEntries",(mEntry!=null?mEntry.getText():null)); }
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:102: (mNumber= INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:102: (mNumber= INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:103: mNumber= INT
					{
					mNumber=(Token)match(input,INT,FOLLOW_INT_in_obedience_with_breed809); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:312:1: special_suffix returns [JsonObject json] : SPECIAL_SUFFIX ;
	public final JsonObject special_suffix() throws RecognitionException {
		JsonObject json = null;


		Token SPECIAL_SUFFIX37=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:32: ( SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:2: SPECIAL_SUFFIX
			{
			SPECIAL_SUFFIX37=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_suffix828); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("SpecialSuffix",(SPECIAL_SUFFIX37!=null?SPECIAL_SUFFIX37.getText():null));if(isSweepstakes((SPECIAL_SUFFIX37!=null?SPECIAL_SUFFIX37.getText():null)))json.addProperty("IsSweepstakes",true);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:1: breed_name returns [JsonObject json] : ( BREED_NAME | BREED_CLASSIFIER ) ( BREED_NAME_SUFFIX )? ;
	public final JsonObject breed_name() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME38=null;
		Token BREED_CLASSIFIER39=null;
		Token BREED_NAME_SUFFIX40=null;

		json = new JsonObject(); String breedName ="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:55: ( ( BREED_NAME | BREED_CLASSIFIER ) ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:318:3: ( BREED_NAME | BREED_CLASSIFIER ) ( BREED_NAME_SUFFIX )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:318:3: ( BREED_NAME | BREED_CLASSIFIER )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==BREED_NAME) ) {
				alt24=1;
			}
			else if ( (LA24_0==BREED_CLASSIFIER) ) {
				alt24=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:318:4: BREED_NAME
					{
					BREED_NAME38=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name848); if (state.failed) return json;
					if ( state.backtracking==0 ) {
					    		breedName+=(BREED_NAME38!=null?BREED_NAME38.getText():null);
					    		if(isVeteran(breedName)){
					    			breedName=mLastBreedName;
					    			json.addProperty("IsVeteran",true);
					    		}
					    		else{
					    			mLastBreedName=breedName;
					    		}}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:10: BREED_CLASSIFIER
					{
					BREED_CLASSIFIER39=(Token)match(input,BREED_CLASSIFIER,FOLLOW_BREED_CLASSIFIER_in_breed_name851); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName=mLastBreedName;json.addProperty("BreedAttribute",(BREED_CLASSIFIER39!=null?BREED_CLASSIFIER39.getText():null).trim());}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:120: ( BREED_NAME_SUFFIX )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==BREED_NAME_SUFFIX) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:121: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX40=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name856); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("BreedSuffix", (BREED_NAME_SUFFIX40!=null?BREED_NAME_SUFFIX40.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:1: ring_without_breed returns [JsonObject json] : ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) | (mSpecial= special_suffix ) );
	public final JsonObject ring_without_breed() throws RecognitionException {
		JsonObject json = null;


		JsonObject mJuniorRing =null;
		JsonObject mEmptyRing =null;
		JsonObject mRallyRing =null;
		JsonObject mNonConformationRing =null;
		JsonObject mSpecial =null;

		json = new JsonObject(); json.addProperty("RingType","Unassigned");JsonObject ring;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:91: ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) | (mSpecial= special_suffix ) )
			int alt26=5;
			switch ( input.LA(1) ) {
			case JUNIOR_CLASS:
				{
				alt26=1;
				}
				break;
			case BREED_COUNT:
				{
				alt26=2;
				}
				break;
			case NON_CONF_SECOND_LINE_COMMENT:
			case RALLY_CLASS:
				{
				alt26=3;
				}
				break;
			case NON_CONFORMATION_CLASS_NAME:
				{
				alt26=4;
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt26=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:2: (mJuniorRing= junior_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:2: (mJuniorRing= junior_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:3: mJuniorRing= junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_ring_without_breed881);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mJuniorRing);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:2: (mEmptyRing= empty_breed_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:2: (mEmptyRing= empty_breed_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:3: mEmptyRing= empty_breed_ring
					{
					pushFollow(FOLLOW_empty_breed_ring_in_ring_without_breed890);
					mEmptyRing=empty_breed_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mEmptyRing);}
					}

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:333:2: (mRallyRing= rally_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:333:2: (mRallyRing= rally_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:333:3: mRallyRing= rally_ring
					{
					pushFollow(FOLLOW_rally_ring_in_ring_without_breed899);
					mRallyRing=rally_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mRallyRing);json.addProperty("RingType","Rally");if(!mRallyRing.has("RallyName"))json.addProperty("Skip",true);}
					}

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:2: (mNonConformationRing= non_conformation_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:2: (mNonConformationRing= non_conformation_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:334:3: mNonConformationRing= non_conformation_ring
					{
					pushFollow(FOLLOW_non_conformation_ring_in_ring_without_breed908);
					mNonConformationRing=non_conformation_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mNonConformationRing);}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:2: (mSpecial= special_suffix )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:2: (mSpecial= special_suffix )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:3: mSpecial= special_suffix
					{
					pushFollow(FOLLOW_special_suffix_in_ring_without_breed917);
					mSpecial=special_suffix();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json, mSpecial);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:1: rally_ring returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )? );
	public final JsonObject rally_ring() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		json = new JsonObject();String entries = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:53: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )? )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt29=1;
			}
			else if ( (LA29_0==RALLY_CLASS) ) {
				alt29=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:3: (rallyComment= rally_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:3: (rallyComment= rally_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:4: rallyComment= rally_comment
					{
					pushFollow(FOLLOW_rally_comment_in_rally_ring945);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyComment", rallyComment);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:3: (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:3: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:5: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring956);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:3: ( (line= rally_entry_line )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:4: (line= rally_entry_line )*
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:4: (line= rally_entry_line )*
					loop27:
					do {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==INT) ) {
							int LA27_2 = input.LA(2);
							if ( (LA27_2==RALLY_ENTRY) ) {
								alt27=1;
							}

						}
						else if ( (LA27_0==RALLY_ENTRY) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:5: line= rally_entry_line
							{
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring966);
							line=rally_entry_line();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {entries+=line+"|";}
							}
							break;

						default :
							break loop27;
						}
					} while (true);

					}

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:3: ( NON_CONF_SECOND_LINE_COMMENT )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==NON_CONF_SECOND_LINE_COMMENT) ) {
						int LA28_1 = input.LA(2);
						if ( (synpred60_test()) ) {
							alt28=1;
						}
					}
					switch (alt28) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:3: NON_CONF_SECOND_LINE_COMMENT
							{
							match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_ring975); if (state.failed) return json;
							}
							break;

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:354:1: empty_breed_ring returns [JsonObject json] : ( BREED_COUNT ) ;
	public final JsonObject empty_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT41=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:355:33: ( ( BREED_COUNT ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:356:3: ( BREED_COUNT )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:356:3: ( BREED_COUNT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:356:4: BREED_COUNT
			{
			BREED_COUNT41=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_empty_breed_ring997); if (state.failed) return json;
			if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT41!=null?BREED_COUNT41.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:358:1: non_conformation_breed_ring returns [JsonObject json] : BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) ;
	public final JsonObject non_conformation_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME42=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:358:55: ( BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:359:2: BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE )
			{
			BREED_NAME42=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_non_conformation_breed_ring1012); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("NonConformationBreed",(BREED_NAME42!=null?BREED_NAME42.getText():null));}
			match(input,COMMENT,FOLLOW_COMMENT_in_non_conformation_breed_ring1015); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:1: breed_ring returns [JsonObject json] : BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME43=null;
		Token BREED_NAME_SUFFIX44=null;
		Token BREED_COUNT45=null;

		json = new JsonObject();String breedName = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:55: ( BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:2: BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			BREED_NAME43=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring1038); if (state.failed) return json;
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME43!=null?BREED_NAME43.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:10: ( BREED_NAME_SUFFIX )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==BREED_NAME_SUFFIX) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:11: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX44=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring1042); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX44!=null?BREED_NAME_SUFFIX44.getText():null);}
					}
					break;

			}

			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:120: ( BREED_COUNT )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==BREED_COUNT) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:121: BREED_COUNT
					{
					BREED_COUNT45=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring1050); if (state.failed) return json;
					if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT45!=null?BREED_COUNT45.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:1: special_ring returns [JsonObject json] : ( BREED_NAME )? ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME46=null;
		Token SPECIAL_SUFFIX47=null;

		json = new JsonObject();String breedName= ""; String suffix="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:71: ( ( BREED_NAME )? ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:3: ( BREED_NAME )? ( SPECIAL_SUFFIX )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:3: ( BREED_NAME )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==BREED_NAME) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:4: BREED_NAME
					{
					BREED_NAME46=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring1075); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName+=(BREED_NAME46!=null?BREED_NAME46.getText():null);}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:47: ( SPECIAL_SUFFIX )+
			int cnt33=0;
			loop33:
			do {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==SPECIAL_SUFFIX) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:48: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX47=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring1081); if (state.failed) return json;
					if ( state.backtracking==0 ) {suffix+= " " + (SPECIAL_SUFFIX47!=null?SPECIAL_SUFFIX47.getText():null);}
					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(33, input);
						throw eee;
				}
				cnt33++;
			} while (true);

			if ( state.backtracking==0 ) {
					//breedName+= (SPECIAL_SUFFIX47!=null?SPECIAL_SUFFIX47.getText():null);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:387:1: group_ring returns [String str] : GROUP_RING ( COMMENT | PARENTHETICAL )+ ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_RING48=null;
		Token COMMENT49=null;
		Token PARENTHETICAL50=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:2: ( GROUP_RING ( COMMENT | PARENTHETICAL )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:5: GROUP_RING ( COMMENT | PARENTHETICAL )+
			{
			GROUP_RING48=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring1103); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(GROUP_RING48!=null?GROUP_RING48.getText():null);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:39: ( COMMENT | PARENTHETICAL )+
			int cnt34=0;
			loop34:
			do {
				int alt34=3;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==COMMENT) ) {
					alt34=1;
				}
				else if ( (LA34_0==PARENTHETICAL) ) {
					alt34=2;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:40: COMMENT
					{
					COMMENT49=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_group_ring1107); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + (COMMENT49!=null?COMMENT49.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:75: PARENTHETICAL
					{
					PARENTHETICAL50=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_group_ring1110); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+= " " + (PARENTHETICAL50!=null?PARENTHETICAL50.getText():null);}
					}
					break;

				default :
					if ( cnt34 >= 1 ) break loop34;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(34, input);
						throw eee;
				}
				cnt34++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:389:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME51=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT
			{
			TIME51=(Token)match(input,TIME,FOLLOW_TIME_in_group_block1131); if (state.failed) return json;
			if ( state.backtracking==0 ) {currentBlockTime=(TIME51!=null?TIME51.getText():null);json.addProperty("BlockStart", currentBlockTime);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:88: ( STANDALONE_COMMENT )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==STANDALONE_COMMENT) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:88: STANDALONE_COMMENT
					{
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block1134); if (state.failed) return json;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:108: (mRing= group_ring )+
			int cnt36=0;
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==GROUP_RING) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:391:109: mRing= group_ring
					{
					pushFollow(FOLLOW_group_ring_in_group_block1140);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {if(!mRelational){json = new JsonObject();json.addProperty("RingType","Group");String[] arr = parseGroupRing(mRing);json.addProperty("Group", arr[0]);json.addProperty("Judge",arr[1]);json.addProperty("BlockStart",currentBlockTime);mShowRings.add(json);}else{rings.add(new JsonPrimitive(mRing));}}
					}
					break;

				default :
					if ( cnt36 >= 1 ) break loop36;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(36, input);
						throw eee;
				}
				cnt36++;
			} while (true);

			if ( state.backtracking==0 ) {if(mRelational){json.add("Rings", rings);}}
			match(input,GROUP_ENDING_ANNOUNCEMENT,FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block1148); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:397:1: non_conformation_ring returns [JsonObject json] : NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )* ;
	public final JsonObject non_conformation_ring() throws RecognitionException {
		JsonObject json = null;


		Token NON_CONFORMATION_CLASS_NAME52=null;
		Token NON_CONFORMATION_SECOND_LINE53=null;

		json = new JsonObject(); json.addProperty("RingType", "Non-conformation"); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:2: ( NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:4: NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )*
			{
			NON_CONFORMATION_CLASS_NAME52=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring1172); if (state.failed) return json;
			if ( state.backtracking==0 ) {
							mCurrentClass=(NON_CONFORMATION_CLASS_NAME52!=null?NON_CONFORMATION_CLASS_NAME52.getText():null);
							json.addProperty("Class",mCurrentClass);
						}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:3: ( NON_CONFORMATION_SECOND_LINE )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==NON_CONFORMATION_SECOND_LINE) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:4: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE53=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring1187); if (state.failed) return json;
					if ( state.backtracking==0 ) {
										json.addProperty("Entrants",(NON_CONFORMATION_SECOND_LINE53!=null?NON_CONFORMATION_SECOND_LINE53.getText():null));
									}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:3: ( NON_CONF_SECOND_LINE_COMMENT )*
			loop38:
			do {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA38_2 = input.LA(2);
					if ( (synpred71_test()) ) {
						alt38=1;
					}

				}

				switch (alt38) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:4: NON_CONF_SECOND_LINE_COMMENT
					{
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring1208); if (state.failed) return json;
					}
					break;

				default :
					break loop38;
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
	// $ANTLR end "non_conformation_ring"



	// $ANTLR start "rally_ring_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:1: rally_ring_block returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) );
	public final JsonObject rally_ring_block() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		String entries = ""; json = new JsonObject();json.addProperty("RingType","Rally"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){addCurrentJudge(json);json.addProperty("Number",mCurrentRingNumber);}
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:3: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt40=1;
			}
			else if ( (LA40_0==RALLY_CLASS) ) {
				alt40=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:5: (rallyComment= rally_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:5: (rallyComment= rally_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:6: rallyComment= rally_comment
					{
					pushFollow(FOLLOW_rally_comment_in_rally_ring_block1232);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("comment", rallyComment);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:80: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring_block1240);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:138: ( (line= rally_entry_line )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:139: (line= rally_entry_line )*
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:139: (line= rally_entry_line )*
					loop39:
					do {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==INT||LA39_0==RALLY_ENTRY) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:140: line= rally_entry_line
							{
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring_block1247);
							line=rally_entry_line();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {entries+=line+"|";}
							}
							break;

						default :
							break loop39;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:1: rally_ring_name returns [String str] : RALLY_CLASS ;
	public final String rally_ring_name() throws RecognitionException {
		String str = null;


		Token RALLY_CLASS54=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:2: ( RALLY_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:4: RALLY_CLASS
			{
			RALLY_CLASS54=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_ring_name1264); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(RALLY_CLASS54!=null?RALLY_CLASS54.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:426:1: rally_entry_line returns [String str] : ( ( INT )? RALLY_ENTRY ) ;
	public final String rally_entry_line() throws RecognitionException {
		String str = null;


		Token INT55=null;
		Token RALLY_ENTRY56=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:427:16: ( ( ( INT )? RALLY_ENTRY ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:428:3: ( ( INT )? RALLY_ENTRY )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:428:3: ( ( INT )? RALLY_ENTRY )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:428:4: ( INT )? RALLY_ENTRY
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:428:4: ( INT )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==INT) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:428:4: INT
					{
					INT55=(Token)match(input,INT,FOLLOW_INT_in_rally_entry_line1286); if (state.failed) return str;
					}
					break;

			}

			if ( state.backtracking==0 ) {str+=(INT55!=null?INT55.getText():null);}
			RALLY_ENTRY56=(Token)match(input,RALLY_ENTRY,FOLLOW_RALLY_ENTRY_in_rally_entry_line1290); if (state.failed) return str;
			if ( state.backtracking==0 ) {str+=" "+(RALLY_ENTRY56!=null?RALLY_ENTRY56.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:430:1: rally_comment returns [String str] : ( NON_CONF_SECOND_LINE_COMMENT )+ ;
	public final String rally_comment() throws RecognitionException {
		String str = null;


		Token NON_CONF_SECOND_LINE_COMMENT57=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:431:16: ( ( NON_CONF_SECOND_LINE_COMMENT )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:432:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:432:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			int cnt42=0;
			loop42:
			do {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA42_2 = input.LA(2);
					if ( (synpred75_test()) ) {
						alt42=1;
					}

				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:432:4: NON_CONF_SECOND_LINE_COMMENT
					{
					NON_CONF_SECOND_LINE_COMMENT57=(Token)match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1311); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" "+(NON_CONF_SECOND_LINE_COMMENT57!=null?NON_CONF_SECOND_LINE_COMMENT57.getText():null);}
					}
					break;

				default :
					if ( cnt42 >= 1 ) break loop42;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(42, input);
						throw eee;
				}
				cnt42++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:439:1: junior_ring returns [JsonObject json] : JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token JUNIOR_CLASS58=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:440:33: ( JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:441:3: JUNIOR_CLASS
			{
			JUNIOR_CLASS58=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring1336); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("RingType","Junior");json.addProperty("ClassName", (JUNIOR_CLASS58!=null?JUNIOR_CLASS58.getText():null));}
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:95: ( ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:178:96: ring
		{
		pushFollow(FOLLOW_ring_in_synpred2_test71);
		ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred2_test

	// $ANTLR start synpred13_test
	public final void synpred13_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:8: (mComment= comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:8: mComment= comment
		{
		pushFollow(FOLLOW_comment_in_synpred13_test264);
		mComment=comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred13_test

	// $ANTLR start synpred14_test
	public final void synpred14_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:42: ( TIME )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:42: TIME
		{
		match(input,TIME,FOLLOW_TIME_in_synpred14_test267); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred14_test

	// $ANTLR start synpred15_test
	public final void synpred15_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:64: ( PHONE_NUMBER )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:64: PHONE_NUMBER
		{
		match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_synpred15_test270); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred15_test

	// $ANTLR start synpred16_test
	public final void synpred16_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:102: ( BREED_NAME )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:197:102: BREED_NAME
		{
		match(input,BREED_NAME,FOLLOW_BREED_NAME_in_synpred16_test273); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred16_test

	// $ANTLR start synpred41_test
	public final void synpred41_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:7: ({...}? =>mComment= timeblock_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:7: {...}? =>mComment= timeblock_comment
		{
		if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred41_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
		}
		pushFollow(FOLLOW_timeblock_comment_in_synpred41_test528);
		mComment=timeblock_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred41_test

	// $ANTLR start synpred42_test
	public final void synpred42_test_fragment() throws RecognitionException {
		JsonArray rings =null;
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:6: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:6: rings= inner_timeblock ({...}? =>mComment= timeblock_comment )*
		{
		pushFollow(FOLLOW_inner_timeblock_in_synpred42_test500);
		rings=inner_timeblock();
		state._fsp--;
		if (state.failed) return ;
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:6: ({...}? =>mComment= timeblock_comment )*
		loop45:
		do {
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==NON_CONFORMATION_CLASS_NAME) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt45=1;
			}
			else if ( (LA45_0==BREED_NAME) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt45=1;
			}
			else if ( (LA45_0==COMMENT) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt45=1;
			}
			else if ( (LA45_0==PARENTHETICAL) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt45=1;
			}
			else if ( (LA45_0==INT) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt45=1;
			}
			else if ( (LA45_0==ELLIPSIS) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt45=1;
			}
			else if ( (LA45_0==DATE) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt45=1;
			}
			else if ( (LA45_0==PHONE_NUMBER) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt45=1;
			}
			else if ( (LA45_0==SPECIAL_SUFFIX) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt45=1;
			}
			else if ( (LA45_0==NON_CONF_SECOND_LINE_COMMENT) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt45=1;
			}
			else if ( (LA45_0==GROUP_RING) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt45=1;
			}

			switch (alt45) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:7: {...}? =>mComment= timeblock_comment
				{
				if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
					if (state.backtracking>0) {state.failed=true; return ;}
					throw new FailedPredicateException(input, "synpred42_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
				}
				pushFollow(FOLLOW_timeblock_comment_in_synpred42_test528);
				mComment=timeblock_comment();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				break loop45;
			}
		} while (true);

		}

	}
	// $ANTLR end synpred42_test

	// $ANTLR start synpred46_test
	public final void synpred46_test_fragment() throws RecognitionException {
		JsonObject mName =null;
		JsonObject nonGroupRing =null;
		JsonObject mRallyWalkthrough =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
		int alt48=2;
		int LA48_0 = input.LA(1);
		if ( (LA48_0==COMMENT||(LA48_0 >= INT && LA48_0 <= JUDGE_NAME)||(LA48_0 >= PARENTHETICAL && LA48_0 <= PARENTHETICAL_INT)) ) {
			alt48=1;
		}
		else if ( (LA48_0==RALLY_CLASS) ) {
			alt48=2;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return ;}
			NoViableAltException nvae =
				new NoViableAltException("", 48, 0, input);
			throw nvae;
		}
		switch (alt48) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:5: (mName= judge_name )? nonGroupRing= non_group_ring
				{
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:5: (mName= judge_name )?
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==COMMENT||LA47_0==JUDGE_NAME||(LA47_0 >= PARENTHETICAL && LA47_0 <= PARENTHETICAL_INT)) ) {
					alt47=1;
				}
				switch (alt47) {
					case 1 :
						// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:6: mName= judge_name
						{
						pushFollow(FOLLOW_judge_name_in_synpred46_test643);
						mName=judge_name();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

				}

				pushFollow(FOLLOW_non_group_ring_in_synpred46_test655);
				nonGroupRing=non_group_ring();
				state._fsp--;
				if (state.failed) return ;
				}
				break;
			case 2 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:5: (mRallyWalkthrough= rally_walkthrough )
				{
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:5: (mRallyWalkthrough= rally_walkthrough )
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:280:6: mRallyWalkthrough= rally_walkthrough
				{
				pushFollow(FOLLOW_rally_walkthrough_in_synpred46_test672);
				mRallyWalkthrough=rally_walkthrough();
				state._fsp--;
				if (state.failed) return ;
				}

				}
				break;

		}

		}

	}
	// $ANTLR end synpred46_test

	// $ANTLR start synpred47_test
	public final void synpred47_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:291:5: ({...}? => ring_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:291:5: {...}? => ring_comment
		{
		if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred47_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
		}
		pushFollow(FOLLOW_ring_comment_in_synpred47_test700);
		ring_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred47_test

	// $ANTLR start synpred48_test
	public final void synpred48_test_fragment() throws RecognitionException {
		JsonObject suffix =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:3: (suffix= special_suffix )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:304:3: suffix= special_suffix
		{
		pushFollow(FOLLOW_special_suffix_in_synpred48_test757);
		suffix=special_suffix();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred48_test

	// $ANTLR start synpred49_test
	public final void synpred49_test_fragment() throws RecognitionException {
		JsonObject obedience =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:3: ( (obedience= obedience_with_breed ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:3: (obedience= obedience_with_breed )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:3: (obedience= obedience_with_breed )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:4: obedience= obedience_with_breed
		{
		pushFollow(FOLLOW_obedience_with_breed_in_synpred49_test766);
		obedience=obedience_with_breed();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred49_test

	// $ANTLR start synpred60_test
	public final void synpred60_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:3: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:3: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred60_test975); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred60_test

	// $ANTLR start synpred71_test
	public final void synpred71_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:4: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:4: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred71_test1208); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred71_test

	// $ANTLR start synpred75_test
	public final void synpred75_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:432:4: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:432:4: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred75_test1311); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred75_test

	// Delegated rules

	public final boolean synpred49_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred49_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred48_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred48_test_fragment(); // can never throw exception
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
	public final boolean synpred46_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred46_test_fragment(); // can never throw exception
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
	public final boolean synpred75_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred75_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred60_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred60_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA16 dfa16 = new DFA16(this);
	static final String DFA16_eotS =
		"\13\uffff";
	static final String DFA16_eofS =
		"\1\1\5\uffff\1\7\4\uffff";
	static final String DFA16_minS =
		"\1\7\1\uffff\1\53\2\0\1\11\1\4\1\uffff\1\4\2\11";
	static final String DFA16_maxS =
		"\1\75\1\uffff\1\75\2\0\2\75\1\uffff\1\73\2\75";
	static final String DFA16_acceptS =
		"\1\uffff\1\2\5\uffff\1\1\3\uffff";
	static final String DFA16_specialS =
		"\3\uffff\1\0\1\1\6\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\7\1\uffff\1\3\2\7\36\uffff\1\7\1\6\1\2\2\uffff\1\7\3\uffff\1\7\1\4"+
			"\1\5\1\uffff\2\7\1\uffff\1\1\2\7\1\1",
			"",
			"\1\10\1\2\20\uffff\1\1",
			"\1\uffff",
			"\1\uffff",
			"\1\11\41\uffff\1\10\10\uffff\1\12\1\5\7\uffff\1\1",
			"\2\7\1\uffff\1\7\1\uffff\3\7\2\uffff\1\1\33\uffff\4\7\1\uffff\1\7\3"+
			"\uffff\3\7\1\uffff\2\7\1\uffff\4\7",
			"",
			"\2\7\1\uffff\1\7\6\uffff\1\1\36\uffff\1\7\1\uffff\1\7\3\uffff\1\7\4"+
			"\uffff\1\7\2\uffff\1\7",
			"\1\11\41\uffff\1\10\10\uffff\1\12\1\5\7\uffff\1\1",
			"\1\11\41\uffff\1\10\10\uffff\1\12\1\5\7\uffff\1\1"
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 227:5: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA16_3 = input.LA(1);
						 
						int index16_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred42_test()) ) {s = 7;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index16_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA16_4 = input.LA(1);
						 
						int index16_4 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred42_test()) ) {s = 7;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index16_4);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 16, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_big_comment_in_start63 = new BitSet(new long[]{0x2C948C0000000E90L});
	public static final BitSet FOLLOW_ring_in_start76 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_EOF_in_start83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring109 = new BitSet(new long[]{0x2030100000000200L});
	public static final BitSet FOLLOW_inner_ring_in_ring114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring140 = new BitSet(new long[]{0x2094880000000E92L});
	public static final BitSet FOLLOW_comment_in_inner_ring143 = new BitSet(new long[]{0x2094880000000E92L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring157 = new BitSet(new long[]{0x0030100000000202L});
	public static final BitSet FOLLOW_judge_name_in_judge_block187 = new BitSet(new long[]{0x2000080000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block193 = new BitSet(new long[]{0x2000080000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_name218 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_COMMENT_in_judge_name227 = new BitSet(new long[]{0x0030000000000202L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_judge_name230 = new BitSet(new long[]{0x0030000000000202L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_judge_name233 = new BitSet(new long[]{0x0030000000000202L});
	public static final BitSet FOLLOW_comment_in_big_comment264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_big_comment270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_comment308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_CLASSIFIER_in_comment311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_comment314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_comment320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_timeblock_comment360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_timeblock_comment363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_timeblock_comment366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock_comment369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_timeblock_comment372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_timeblock_comment375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_timeblock_comment378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_timeblock_comment383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_timeblock_comment385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_ring_comment410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock442 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_FOLLOWING_TIME_in_timeblock452 = new BitSet(new long[]{0x19B89C0000000E82L});
	public static final BitSet FOLLOW_TIME_in_timeblock469 = new BitSet(new long[]{0x19B89C0000000E82L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock500 = new BitSet(new long[]{0x19B89C0000000E82L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock528 = new BitSet(new long[]{0x19B89C0000000E82L});
	public static final BitSet FOLLOW_INT_in_non_group_ring583 = new BitSet(new long[]{0x0908A000000000B0L});
	public static final BitSet FOLLOW_ring_with_breed_in_non_group_ring593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_without_breed_in_non_group_ring602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_name_in_inner_timeblock643 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_non_group_ring_in_inner_timeblock655 = new BitSet(new long[]{0x19B89C0000000E82L});
	public static final BitSet FOLLOW_rally_walkthrough_in_inner_timeblock672 = new BitSet(new long[]{0x19B89C0000000E82L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock700 = new BitSet(new long[]{0x19B89C0000000E82L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_walkthrough727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_name_in_ring_with_breed746 = new BitSet(new long[]{0x0800000000000222L});
	public static final BitSet FOLLOW_special_suffix_in_ring_with_breed757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_ring_with_breed766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_ring_with_breed775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_obedience_with_breed796 = new BitSet(new long[]{0x0004080000000000L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_obedience_with_breed809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_suffix828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name848 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_BREED_CLASSIFIER_in_breed_name851 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_ring_without_breed881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_breed_ring_in_ring_without_breed890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_in_ring_without_breed899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_conformation_ring_in_ring_without_breed908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_suffix_in_ring_without_breed917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring956 = new BitSet(new long[]{0x0208080000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring966 = new BitSet(new long[]{0x0208080000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_ring975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_empty_breed_ring997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_non_conformation_breed_ring1012 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COMMENT_in_non_conformation_breed_ring1015 = new BitSet(new long[]{0x0004080000000000L});
	public static final BitSet FOLLOW_set_in_non_conformation_breed_ring1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring1038 = new BitSet(new long[]{0x0000000000000122L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring1042 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring1050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring1075 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring1081 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring1103 = new BitSet(new long[]{0x0010000000000200L});
	public static final BitSet FOLLOW_COMMENT_in_group_ring1107 = new BitSet(new long[]{0x0010000000000202L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_group_ring1110 = new BitSet(new long[]{0x0010000000000202L});
	public static final BitSet FOLLOW_TIME_in_group_block1131 = new BitSet(new long[]{0x1000040000000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block1134 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block1140 = new BitSet(new long[]{0x0000050000000000L});
	public static final BitSet FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring1172 = new BitSet(new long[]{0x000C000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring1187 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring1208 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring_block1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring_block1240 = new BitSet(new long[]{0x0200080000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring_block1247 = new BitSet(new long[]{0x0200080000000002L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_ring_name1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_rally_entry_line1286 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RALLY_ENTRY_in_rally_entry_line1290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1311 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred2_test71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred13_test264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_synpred14_test267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_synpred15_test270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_synpred16_test273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred41_test528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred42_test500 = new BitSet(new long[]{0x08988C0000000E82L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred42_test528 = new BitSet(new long[]{0x08988C0000000E82L});
	public static final BitSet FOLLOW_judge_name_in_synpred46_test643 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_non_group_ring_in_synpred46_test655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_walkthrough_in_synpred46_test672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_synpred47_test700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_suffix_in_synpred48_test757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_synpred49_test766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred60_test975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred71_test1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred75_test1311 = new BitSet(new long[]{0x0000000000000002L});
}
