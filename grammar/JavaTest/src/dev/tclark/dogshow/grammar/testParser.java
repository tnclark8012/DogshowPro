// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2014-01-04 21:08:42

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:175:1: start returns [JsonObject json] : (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		String mComment =null;
		JsonObject mRing =null;

		json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:3: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:4: (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:4: (mComment= big_comment )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:5: mComment= big_comment
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:94: ( ( ring )=>mRing= ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:95: ( ring )=>mRing= ring
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:180:1: ring returns [JsonObject json] : RING_TITLE mRing= inner_ring ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		Token RING_TITLE1=null;
		JsonObject mRing =null;

		json = new JsonObject();if(debug){System.out.println("ring...");}
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:182:3: ( RING_TITLE mRing= inner_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:182:7: RING_TITLE mRing= inner_ring
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:183:1: inner_ring returns [JsonObject json] : ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) );
	public final JsonObject inner_ring() throws RecognitionException {
		JsonObject json = null;


		JsonObject mGroupBlock =null;
		JsonObject mJugeBlock =null;

		json = new JsonObject();JsonArray judgeBlocks = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:2: ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:6: ( group_block )=>mGroupBlock= group_block ( comment )*
					{
					pushFollow(FOLLOW_group_block_in_inner_ring140);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:82: ( comment )*
					loop3:
					do {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==BREED_NAME||(LA3_0 >= COMMENT && LA3_0 <= ELLIPSIS)||LA3_0==INT||LA3_0==NON_CONFORMATION_CLASS_NAME||LA3_0==NON_CONFORMATION_SECOND_LINE||LA3_0==PARENTHETICAL||LA3_0==PHONE_NUMBER||LA3_0==TIME) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:82: comment
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:7: ( (mJugeBlock= judge_block )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:7: ( (mJugeBlock= judge_block )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:8: (mJugeBlock= judge_block )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:8: (mJugeBlock= judge_block )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:186:9: mJugeBlock= judge_block
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:1: judge_block returns [JsonObject json] : mName= judge_name (mBlock= timeblock )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		JsonObject mName =null;
		JsonObject mBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray();nextJudgeIsNewRing = true;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:189:5: (mName= judge_name (mBlock= timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:189:9: mName= judge_name (mBlock= timeblock )+
			{
			pushFollow(FOLLOW_judge_name_in_judge_block187);
			mName=judge_name();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {if(!mRelational){mCurrentJudge = mName;judgeSet.add(mCurrentJudge.get("Judge").getAsString());}mergeJson(json, mName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:189:146: (mBlock= timeblock )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:189:147: mBlock= timeblock
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:190:1: judge_name returns [JsonObject json] : ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ ) ;
	public final JsonObject judge_name() throws RecognitionException {
		JsonObject json = null;


		Token JUDGE_NAME2=null;
		Token COMMENT3=null;
		Token PARENTHETICAL4=null;
		Token PARENTHETICAL_INT5=null;

		json = new JsonObject(); String str = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:192:2: ( ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:192:4: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:192:4: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:192:5: ( JUDGE_NAME )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:192:5: ( JUDGE_NAME )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:192:6: JUDGE_NAME
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:3: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:3: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:4: COMMENT
							{
							COMMENT3=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_judge_name227); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(COMMENT3!=null?COMMENT3.getText():null)+" ";}
							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:37: PARENTHETICAL
							{
							PARENTHETICAL4=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_judge_name230); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL4!=null?PARENTHETICAL4.getText():null)+" ";}
							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:82: PARENTHETICAL_INT
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:194:1: big_comment returns [String str] : (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) ;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:3: ( (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:8: mComment= comment
					{
					pushFollow(FOLLOW_comment_in_big_comment264);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:42: TIME
					{
					TIME6=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment267); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME6!=null?TIME6.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:64: PHONE_NUMBER
					{
					PHONE_NUMBER7=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_big_comment270); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER7!=null?PHONE_NUMBER7.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:102: BREED_NAME
					{
					BREED_NAME8=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment273); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME8!=null?BREED_NAME8.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:136: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX9=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment276); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX9!=null?SPECIAL_SUFFIX9.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:178: GROUP_RING
					{
					GROUP_RING10=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment279); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_RING10!=null?GROUP_RING10.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:212: NON_CONFORMATION_SECOND_LINE
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:198:1: comment returns [String str] : ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) ;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:3: ( ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:6: NON_CONFORMATION_CLASS_NAME
					{
					NON_CONFORMATION_CLASS_NAME12=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment305); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME12!=null?NON_CONFORMATION_CLASS_NAME12.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:74: BREED_NAME
					{
					BREED_NAME13=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_comment308); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME13!=null?BREED_NAME13.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:108: TIME
					{
					TIME14=(Token)match(input,TIME,FOLLOW_TIME_in_comment311); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME14!=null?TIME14.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:130: COMMENT
					{
					COMMENT15=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment314); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT15!=null?COMMENT15.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:158: PARENTHETICAL
					{
					PARENTHETICAL16=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment317); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL16!=null?PARENTHETICAL16.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:198: INT
					{
					INT17=(Token)match(input,INT,FOLLOW_INT_in_comment320); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT17!=null?INT17.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:218: ELLIPSIS
					{
					ELLIPSIS18=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment323); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS18!=null?ELLIPSIS18.getText():null);}
					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:248: DATE
					{
					DATE19=(Token)match(input,DATE,FOLLOW_DATE_in_comment326); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE19!=null?DATE19.getText():null);}
					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:270: PHONE_NUMBER
					{
					PHONE_NUMBER20=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment329); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER20!=null?PHONE_NUMBER20.getText():null);}
					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:200:308: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE21=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment332); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:1: timeblock_comment returns [String str] : ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING ) ;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:3: ( ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:6: NON_CONFORMATION_CLASS_NAME
					{
					NON_CONFORMATION_CLASS_NAME22=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment354); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME22!=null?NON_CONFORMATION_CLASS_NAME22.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:74: BREED_NAME
					{
					BREED_NAME23=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_timeblock_comment357); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME23!=null?BREED_NAME23.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:108: COMMENT
					{
					COMMENT24=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment360); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT24!=null?COMMENT24.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:136: PARENTHETICAL
					{
					PARENTHETICAL25=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_timeblock_comment363); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL25!=null?PARENTHETICAL25.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:176: INT
					{
					INT26=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment366); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT26!=null?INT26.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:196: ELLIPSIS
					{
					ELLIPSIS27=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment369); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS27!=null?ELLIPSIS27.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:226: DATE
					{
					DATE28=(Token)match(input,DATE,FOLLOW_DATE_in_timeblock_comment372); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE28!=null?DATE28.getText():null);}
					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:248: PHONE_NUMBER
					{
					PHONE_NUMBER29=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment375); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER29!=null?PHONE_NUMBER29.getText():null);}
					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:286: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment378); if (state.failed) return str;
					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:301: NON_CONF_SECOND_LINE_COMMENT
					{
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_timeblock_comment380); if (state.failed) return str;
					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:203:330: GROUP_RING
					{
					match(input,GROUP_RING,FOLLOW_GROUP_RING_in_timeblock_comment382); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:1: ring_comment returns [String str] : ( STANDALONE_COMMENT | timeblock_comment );
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT30=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:5: ( STANDALONE_COMMENT | timeblock_comment )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:9: STANDALONE_COMMENT
					{
					STANDALONE_COMMENT30=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment404); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT30!=null?STANDALONE_COMMENT30.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:59: timeblock_comment
					{
					pushFollow(FOLLOW_timeblock_comment_in_ring_comment407);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:209:1: timeblock returns [JsonObject json] : ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )* ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token INT31=null;
		Token TIME32=null;
		JsonArray rings =null;
		String mComment =null;

		json = new JsonObject(); String comment = ""; String time = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:2: ( ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:4: ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:4: ( ( INT FOLLOWING_TIME ) | TIME )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:212:6: ( INT FOLLOWING_TIME )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:212:6: ( INT FOLLOWING_TIME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:3: INT FOLLOWING_TIME
					{
					INT31=(Token)match(input,INT,FOLLOW_INT_in_timeblock439); if (state.failed) return json;
					if ( state.backtracking==0 ) {
									currentBlockTime=(INT31!=null?INT31.getText():null);
									json.addProperty("Time", currentBlockTime);
								}
					match(input,FOLLOWING_TIME,FOLLOW_FOLLOWING_TIME_in_timeblock449); if (state.failed) return json;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:7: TIME
					{
					TIME32=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock466); if (state.failed) return json;
					if ( state.backtracking==0 ) {
						     		currentBlockTime=(TIME32!=null?TIME32.getText():null);
						     		json.addProperty("Time", currentBlockTime);
						     	}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:226:5: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*
			loop16:
			do {
				int alt16=2;
				alt16 = dfa16.predict(input);
				switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:6: rings= inner_timeblock ({...}? =>mComment= timeblock_comment )*
					{
					pushFollow(FOLLOW_inner_timeblock_in_timeblock497);
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:6: ({...}? =>mComment= timeblock_comment )*
					loop15:
					do {
						int alt15=2;
						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA15_2 = input.LA(2);
							if ( (((synpred40_test()&&synpred40_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA15_3 = input.LA(2);
							if ( (((synpred40_test()&&synpred40_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case INT:
							{
							int LA15_4 = input.LA(2);
							if ( (((synpred40_test()&&synpred40_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case NON_CONFORMATION_CLASS_NAME:
							{
							int LA15_5 = input.LA(2);
							if ( (((synpred40_test()&&synpred40_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case BREED_NAME:
							{
							int LA15_6 = input.LA(2);
							if ( (((synpred40_test()&&synpred40_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case ELLIPSIS:
							{
							int LA15_7 = input.LA(2);
							if ( (((synpred40_test()&&synpred40_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case DATE:
							{
							int LA15_8 = input.LA(2);
							if ( (((synpred40_test()&&synpred40_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case PHONE_NUMBER:
							{
							int LA15_9 = input.LA(2);
							if ( (((synpred40_test()&&synpred40_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case SPECIAL_SUFFIX:
							{
							int LA15_10 = input.LA(2);
							if ( (((synpred40_test()&&synpred40_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case NON_CONF_SECOND_LINE_COMMENT:
							{
							int LA15_11 = input.LA(2);
							if ( (((synpred40_test()&&synpred40_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						case GROUP_RING:
							{
							int LA15_12 = input.LA(2);
							if ( (((synpred40_test()&&synpred40_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt15=1;
							}

							}
							break;
						}
						switch (alt15) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:7: {...}? =>mComment= timeblock_comment
							{
							if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
								if (state.backtracking>0) {state.failed=true; return json;}
								throw new FailedPredicateException(input, "timeblock", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
							}
							pushFollow(FOLLOW_timeblock_comment_in_timeblock525);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:1: non_group_ring returns [JsonObject json] : INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) ;
	public final JsonObject non_group_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT33=null;
		JsonObject mRingWithBreed =null;
		JsonObject mRingWithoutBreed =null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:257:32: ( INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:2: INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
			{
			INT33=(Token)match(input,INT,FOLLOW_INT_in_non_group_ring580); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("Count", parseIntSafely((INT33!=null?INT33.getText():null),0));}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:2: ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==BREED_NAME) ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:2: (mRingWithBreed= ring_with_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:2: (mRingWithBreed= ring_with_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:3: mRingWithBreed= ring_with_breed
					{
					pushFollow(FOLLOW_ring_with_breed_in_non_group_ring590);
					mRingWithBreed=ring_with_breed();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mRingWithBreed);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:2: (mRingWithoutBreed= ring_without_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:2: (mRingWithoutBreed= ring_without_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:3: mRingWithoutBreed= ring_without_breed
					{
					pushFollow(FOLLOW_ring_without_breed_in_non_group_ring599);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:1: inner_timeblock returns [JsonArray array] : ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? => ring_comment )+ ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject mName =null;
		JsonObject nonGroupRing =null;
		JsonObject mRallyWalkthrough =null;

		array = new JsonArray();JsonObject toAdd = null;int countAhead = 0;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:2: ( ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? => ring_comment )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? => ring_comment )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? => ring_comment )+
			int cnt20=0;
			loop20:
			do {
				int alt20=3;
				switch ( input.LA(1) ) {
				case NON_CONFORMATION_CLASS_NAME:
					{
					int LA20_1 = input.LA(2);
					if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				case BREED_NAME:
					{
					int LA20_2 = input.LA(2);
					if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				case COMMENT:
					{
					int LA20_3 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt20=1;
					}
					else if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA20_4 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt20=1;
					}
					else if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				case INT:
					{
					int LA20_5 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt20=1;
					}
					else if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				case ELLIPSIS:
					{
					int LA20_6 = input.LA(2);
					if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				case DATE:
					{
					int LA20_7 = input.LA(2);
					if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				case PHONE_NUMBER:
					{
					int LA20_8 = input.LA(2);
					if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				case SPECIAL_SUFFIX:
					{
					int LA20_9 = input.LA(2);
					if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				case NON_CONF_SECOND_LINE_COMMENT:
					{
					int LA20_10 = input.LA(2);
					if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				case GROUP_RING:
					{
					int LA20_11 = input.LA(2);
					if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				case JUDGE_NAME:
					{
					int LA20_13 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt20=1;
					}

					}
					break;
				case PARENTHETICAL_INT:
					{
					int LA20_14 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt20=1;
					}

					}
					break;
				case RALLY_CLASS:
					{
					int LA20_15 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt20=1;
					}

					}
					break;
				case STANDALONE_COMMENT:
					{
					int LA20_16 = input.LA(2);
					if ( (((synpred46_test()&&synpred46_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt20=2;
					}

					}
					break;
				}
				switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: (mName= judge_name )? nonGroupRing= non_group_ring
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: (mName= judge_name )?
							int alt18=2;
							int LA18_0 = input.LA(1);
							if ( (LA18_0==COMMENT||LA18_0==JUDGE_NAME||(LA18_0 >= PARENTHETICAL && LA18_0 <= PARENTHETICAL_INT)) ) {
								alt18=1;
							}
							switch (alt18) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:6: mName= judge_name
									{
									pushFollow(FOLLOW_judge_name_in_inner_timeblock640);
									mName=judge_name();
									state._fsp--;
									if (state.failed) return array;
									if ( state.backtracking==0 ) {mCurrentJudge = mName;judgeSet.add(mName.get("Judge").getAsString());}
									}
									break;

							}

							pushFollow(FOLLOW_non_group_ring_in_inner_timeblock652);
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:5: (mRallyWalkthrough= rally_walkthrough )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:5: (mRallyWalkthrough= rally_walkthrough )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:6: mRallyWalkthrough= rally_walkthrough
							{
							pushFollow(FOLLOW_rally_walkthrough_in_inner_timeblock669);
							mRallyWalkthrough=rally_walkthrough();
							state._fsp--;
							if (state.failed) return array;
							if ( state.backtracking==0 ) {
									  	mRallyWalkthrough.addProperty("BlockStart",currentBlockTime);
									  	mRallyWalkthrough.addProperty("Number",mCurrentRingNumber);
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:288:5: {...}? => ring_comment
					{
					if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
						if (state.backtracking>0) {state.failed=true; return array;}
						throw new FailedPredicateException(input, "inner_timeblock", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
					}
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock697);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:293:1: rally_walkthrough returns [JsonObject json] : RALLY_CLASS ;
	public final JsonObject rally_walkthrough() throws RecognitionException {
		JsonObject json = null;


		Token RALLY_CLASS34=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:33: ( RALLY_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:295:3: RALLY_CLASS
			{
			RALLY_CLASS34=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_walkthrough724); if (state.failed) return json;
			if ( state.backtracking==0 ) {String title = (RALLY_CLASS34!=null?RALLY_CLASS34.getText():null); json.addProperty("RallyName", title.replace(" Walkthrough", "")); json.addProperty("IsWalkthrough",true); }
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:1: ring_with_breed returns [JsonObject json] : breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) ;
	public final JsonObject ring_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT35=null;
		JsonObject breedName =null;
		JsonObject suffix =null;
		JsonObject obedience =null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:298:32: (breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:299:2: breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			{
			pushFollow(FOLLOW_breed_name_in_ring_with_breed743);
			breedName=breed_name();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {mergeJson(json,breedName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:300:2: (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			int alt22=3;
			switch ( input.LA(1) ) {
			case SPECIAL_SUFFIX:
				{
				int LA22_1 = input.LA(2);
				if ( (synpred47_test()) ) {
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
					if ( (synpred48_test()) ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:3: suffix= special_suffix
					{
					pushFollow(FOLLOW_special_suffix_in_ring_with_breed754);
					suffix=special_suffix();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,suffix);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:3: (obedience= obedience_with_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:3: (obedience= obedience_with_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:4: obedience= obedience_with_breed
					{
					pushFollow(FOLLOW_obedience_with_breed_in_ring_with_breed763);
					obedience=obedience_with_breed();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("Skip",true);}
					}

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:3: ( ( BREED_COUNT )? )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:3: ( ( BREED_COUNT )? )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:4: ( BREED_COUNT )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:4: ( BREED_COUNT )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==BREED_COUNT) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:303:5: BREED_COUNT
							{
							BREED_COUNT35=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_ring_with_breed772); if (state.failed) return json;
							if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT35!=null?BREED_COUNT35.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:305:1: obedience_with_breed returns [JsonObject json] : COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) ;
	public final JsonObject obedience_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token mEntry=null;
		Token mNumber=null;

		json = new JsonObject(); json.addProperty("Class",mCurrentClass);
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:306:73: ( COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:2: COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
			{
			match(input,COMMENT,FOLLOW_COMMENT_in_obedience_with_breed793); if (state.failed) return json;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:10: ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:11: (mEntry= NON_CONFORMATION_SECOND_LINE )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:11: (mEntry= NON_CONFORMATION_SECOND_LINE )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:12: mEntry= NON_CONFORMATION_SECOND_LINE
					{
					mEntry=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed799); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("obedienceEntries",(mEntry!=null?mEntry.getText():null)); }
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:102: (mNumber= INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:102: (mNumber= INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:307:103: mNumber= INT
					{
					mNumber=(Token)match(input,INT,FOLLOW_INT_in_obedience_with_breed806); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:309:1: special_suffix returns [JsonObject json] : SPECIAL_SUFFIX ;
	public final JsonObject special_suffix() throws RecognitionException {
		JsonObject json = null;


		Token SPECIAL_SUFFIX36=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:310:32: ( SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:311:2: SPECIAL_SUFFIX
			{
			SPECIAL_SUFFIX36=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_suffix825); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("SpecialSuffix",(SPECIAL_SUFFIX36!=null?SPECIAL_SUFFIX36.getText():null));if(isSweepstakes((SPECIAL_SUFFIX36!=null?SPECIAL_SUFFIX36.getText():null)))json.addProperty("IsSweepstakes",true);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:1: breed_name returns [JsonObject json] : BREED_NAME ( BREED_NAME_SUFFIX )? ;
	public final JsonObject breed_name() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME37=null;
		Token BREED_NAME_SUFFIX38=null;

		json = new JsonObject(); String breedName ="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:55: ( BREED_NAME ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:315:3: BREED_NAME ( BREED_NAME_SUFFIX )?
			{
			BREED_NAME37=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name844); if (state.failed) return json;
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME37!=null?BREED_NAME37.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:10: ( BREED_NAME_SUFFIX )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==BREED_NAME_SUFFIX) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:11: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX38=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name848); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("BreedSuffix", (BREED_NAME_SUFFIX38!=null?BREED_NAME_SUFFIX38.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:1: ring_without_breed returns [JsonObject json] : ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) | (mSpecial= special_suffix ) );
	public final JsonObject ring_without_breed() throws RecognitionException {
		JsonObject json = null;


		JsonObject mJuniorRing =null;
		JsonObject mEmptyRing =null;
		JsonObject mRallyRing =null;
		JsonObject mNonConformationRing =null;
		JsonObject mSpecial =null;

		json = new JsonObject(); JsonObject ring;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:49: ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) | (mSpecial= special_suffix ) )
			int alt25=5;
			switch ( input.LA(1) ) {
			case JUNIOR_CLASS:
				{
				alt25=1;
				}
				break;
			case BREED_COUNT:
				{
				alt25=2;
				}
				break;
			case NON_CONF_SECOND_LINE_COMMENT:
			case RALLY_CLASS:
				{
				alt25=3;
				}
				break;
			case NON_CONFORMATION_CLASS_NAME:
				{
				alt25=4;
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt25=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:2: (mJuniorRing= junior_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:2: (mJuniorRing= junior_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:3: mJuniorRing= junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_ring_without_breed873);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mJuniorRing);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:2: (mEmptyRing= empty_breed_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:2: (mEmptyRing= empty_breed_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:329:3: mEmptyRing= empty_breed_ring
					{
					pushFollow(FOLLOW_empty_breed_ring_in_ring_without_breed882);
					mEmptyRing=empty_breed_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mEmptyRing);}
					}

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:2: (mRallyRing= rally_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:2: (mRallyRing= rally_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:330:3: mRallyRing= rally_ring
					{
					pushFollow(FOLLOW_rally_ring_in_ring_without_breed891);
					mRallyRing=rally_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mRallyRing);if(!mRallyRing.has("RallyName"))json.addProperty("Skip",true);}
					}

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:2: (mNonConformationRing= non_conformation_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:2: (mNonConformationRing= non_conformation_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:331:3: mNonConformationRing= non_conformation_ring
					{
					pushFollow(FOLLOW_non_conformation_ring_in_ring_without_breed900);
					mNonConformationRing=non_conformation_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mNonConformationRing);}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:2: (mSpecial= special_suffix )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:2: (mSpecial= special_suffix )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:332:3: mSpecial= special_suffix
					{
					pushFollow(FOLLOW_special_suffix_in_ring_without_breed909);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:344:1: rally_ring returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )? );
	public final JsonObject rally_ring() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		json = new JsonObject();String entries = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:345:53: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )? )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt28=1;
			}
			else if ( (LA28_0==RALLY_CLASS) ) {
				alt28=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:346:3: (rallyComment= rally_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:346:3: (rallyComment= rally_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:346:4: rallyComment= rally_comment
					{
					pushFollow(FOLLOW_rally_comment_in_rally_ring937);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyComment", rallyComment);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:3: (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:3: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:5: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring948);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:3: ( (line= rally_entry_line )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:4: (line= rally_entry_line )*
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:4: (line= rally_entry_line )*
					loop26:
					do {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==INT) ) {
							int LA26_2 = input.LA(2);
							if ( (LA26_2==RALLY_ENTRY) ) {
								alt26=1;
							}

						}
						else if ( (LA26_0==RALLY_ENTRY) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:348:5: line= rally_entry_line
							{
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring958);
							line=rally_entry_line();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {entries+=line+"|";}
							}
							break;

						default :
							break loop26;
						}
					} while (true);

					}

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:3: ( NON_CONF_SECOND_LINE_COMMENT )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==NON_CONF_SECOND_LINE_COMMENT) ) {
						int LA27_1 = input.LA(2);
						if ( (synpred58_test()) ) {
							alt27=1;
						}
					}
					switch (alt27) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:3: NON_CONF_SECOND_LINE_COMMENT
							{
							match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_ring967); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:351:1: empty_breed_ring returns [JsonObject json] : ( BREED_COUNT ) ;
	public final JsonObject empty_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT39=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:352:33: ( ( BREED_COUNT ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:353:3: ( BREED_COUNT )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:353:3: ( BREED_COUNT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:353:4: BREED_COUNT
			{
			BREED_COUNT39=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_empty_breed_ring989); if (state.failed) return json;
			if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT39!=null?BREED_COUNT39.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:355:1: non_conformation_breed_ring returns [JsonObject json] : BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) ;
	public final JsonObject non_conformation_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME40=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:355:55: ( BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:356:2: BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE )
			{
			BREED_NAME40=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_non_conformation_breed_ring1004); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("NonConformationBreed",(BREED_NAME40!=null?BREED_NAME40.getText():null));}
			match(input,COMMENT,FOLLOW_COMMENT_in_non_conformation_breed_ring1007); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:358:1: breed_ring returns [JsonObject json] : BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME41=null;
		Token BREED_NAME_SUFFIX42=null;
		Token BREED_COUNT43=null;

		json = new JsonObject();String breedName = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:359:55: ( BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:360:2: BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			BREED_NAME41=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring1030); if (state.failed) return json;
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME41!=null?BREED_NAME41.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:10: ( BREED_NAME_SUFFIX )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==BREED_NAME_SUFFIX) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:11: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX42=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring1034); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX42!=null?BREED_NAME_SUFFIX42.getText():null);}
					}
					break;

			}

			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:120: ( BREED_COUNT )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==BREED_COUNT) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:121: BREED_COUNT
					{
					BREED_COUNT43=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring1042); if (state.failed) return json;
					if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT43!=null?BREED_COUNT43.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:1: special_ring returns [JsonObject json] : ( BREED_NAME )? ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME44=null;
		Token SPECIAL_SUFFIX45=null;

		json = new JsonObject();String breedName= ""; String suffix="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:372:71: ( ( BREED_NAME )? ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:3: ( BREED_NAME )? ( SPECIAL_SUFFIX )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:3: ( BREED_NAME )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==BREED_NAME) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:4: BREED_NAME
					{
					BREED_NAME44=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring1067); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName+=(BREED_NAME44!=null?BREED_NAME44.getText():null);}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:47: ( SPECIAL_SUFFIX )+
			int cnt32=0;
			loop32:
			do {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==SPECIAL_SUFFIX) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:48: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX45=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring1073); if (state.failed) return json;
					if ( state.backtracking==0 ) {suffix+= " " + (SPECIAL_SUFFIX45!=null?SPECIAL_SUFFIX45.getText():null);}
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

			if ( state.backtracking==0 ) {
					//breedName+= (SPECIAL_SUFFIX45!=null?SPECIAL_SUFFIX45.getText():null);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:384:1: group_ring returns [String str] : GROUP_RING ( COMMENT | PARENTHETICAL )+ ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_RING46=null;
		Token COMMENT47=null;
		Token PARENTHETICAL48=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:2: ( GROUP_RING ( COMMENT | PARENTHETICAL )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:5: GROUP_RING ( COMMENT | PARENTHETICAL )+
			{
			GROUP_RING46=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring1095); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(GROUP_RING46!=null?GROUP_RING46.getText():null);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:39: ( COMMENT | PARENTHETICAL )+
			int cnt33=0;
			loop33:
			do {
				int alt33=3;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==COMMENT) ) {
					alt33=1;
				}
				else if ( (LA33_0==PARENTHETICAL) ) {
					alt33=2;
				}

				switch (alt33) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:40: COMMENT
					{
					COMMENT47=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_group_ring1099); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + (COMMENT47!=null?COMMENT47.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:385:75: PARENTHETICAL
					{
					PARENTHETICAL48=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_group_ring1102); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+= " " + (PARENTHETICAL48!=null?PARENTHETICAL48.getText():null);}
					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(33, input);
						throw eee;
				}
				cnt33++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:386:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME49=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT
			{
			TIME49=(Token)match(input,TIME,FOLLOW_TIME_in_group_block1123); if (state.failed) return json;
			if ( state.backtracking==0 ) {currentBlockTime=(TIME49!=null?TIME49.getText():null);json.addProperty("TIME", currentBlockTime);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:82: ( STANDALONE_COMMENT )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==STANDALONE_COMMENT) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:82: STANDALONE_COMMENT
					{
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block1126); if (state.failed) return json;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:102: (mRing= group_ring )+
			int cnt35=0;
			loop35:
			do {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==GROUP_RING) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:388:103: mRing= group_ring
					{
					pushFollow(FOLLOW_group_ring_in_group_block1132);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {if(!mRelational){json = new JsonObject();String[] arr = parseGroupRing(mRing);json.addProperty("Group", arr[0]);json.addProperty("Judge",arr[1]);json.addProperty("Time",currentBlockTime);mShowRings.add(json);}else{rings.add(new JsonPrimitive(mRing));}}
					}
					break;

				default :
					if ( cnt35 >= 1 ) break loop35;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(35, input);
						throw eee;
				}
				cnt35++;
			} while (true);

			if ( state.backtracking==0 ) {if(mRelational){json.add("Rings", rings);}}
			match(input,GROUP_ENDING_ANNOUNCEMENT,FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block1140); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:394:1: non_conformation_ring returns [JsonObject json] : NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )* ;
	public final JsonObject non_conformation_ring() throws RecognitionException {
		JsonObject json = null;


		Token NON_CONFORMATION_CLASS_NAME50=null;
		Token NON_CONFORMATION_SECOND_LINE51=null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:2: ( NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:4: NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )*
			{
			NON_CONFORMATION_CLASS_NAME50=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring1164); if (state.failed) return json;
			if ( state.backtracking==0 ) {
							mCurrentClass=(NON_CONFORMATION_CLASS_NAME50!=null?NON_CONFORMATION_CLASS_NAME50.getText():null);
							json.addProperty("Class",mCurrentClass);
						}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:3: ( NON_CONFORMATION_SECOND_LINE )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==NON_CONFORMATION_SECOND_LINE) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:4: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE51=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring1179); if (state.failed) return json;
					if ( state.backtracking==0 ) {
										json.addProperty("Entrants",(NON_CONFORMATION_SECOND_LINE51!=null?NON_CONFORMATION_SECOND_LINE51.getText():null));
									}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:3: ( NON_CONF_SECOND_LINE_COMMENT )*
			loop37:
			do {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA37_2 = input.LA(2);
					if ( (synpred69_test()) ) {
						alt37=1;
					}

				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:4: NON_CONF_SECOND_LINE_COMMENT
					{
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring1200); if (state.failed) return json;
					}
					break;

				default :
					break loop37;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:416:1: rally_ring_block returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) );
	public final JsonObject rally_ring_block() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		String entries = ""; json = new JsonObject();json.addProperty("Empty","rally: not captured"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){addCurrentJudge(json);json.addProperty("Number",mCurrentRingNumber);}
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:3: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt39=1;
			}
			else if ( (LA39_0==RALLY_CLASS) ) {
				alt39=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:5: (rallyComment= rally_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:5: (rallyComment= rally_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:6: rallyComment= rally_comment
					{
					pushFollow(FOLLOW_rally_comment_in_rally_ring_block1224);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("comment", rallyComment);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:80: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring_block1232);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:138: ( (line= rally_entry_line )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:139: (line= rally_entry_line )*
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:139: (line= rally_entry_line )*
					loop38:
					do {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==INT||LA38_0==RALLY_ENTRY) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:140: line= rally_entry_line
							{
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring_block1239);
							line=rally_entry_line();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {entries+=line+"|";}
							}
							break;

						default :
							break loop38;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:1: rally_ring_name returns [String str] : RALLY_CLASS ;
	public final String rally_ring_name() throws RecognitionException {
		String str = null;


		Token RALLY_CLASS52=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:420:2: ( RALLY_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:420:4: RALLY_CLASS
			{
			RALLY_CLASS52=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_ring_name1256); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(RALLY_CLASS52!=null?RALLY_CLASS52.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:1: rally_entry_line returns [String str] : ( ( INT )? RALLY_ENTRY ) ;
	public final String rally_entry_line() throws RecognitionException {
		String str = null;


		Token INT53=null;
		Token RALLY_ENTRY54=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:16: ( ( ( INT )? RALLY_ENTRY ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:3: ( ( INT )? RALLY_ENTRY )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:3: ( ( INT )? RALLY_ENTRY )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:4: ( INT )? RALLY_ENTRY
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:4: ( INT )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==INT) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:4: INT
					{
					INT53=(Token)match(input,INT,FOLLOW_INT_in_rally_entry_line1278); if (state.failed) return str;
					}
					break;

			}

			if ( state.backtracking==0 ) {str+=(INT53!=null?INT53.getText():null);}
			RALLY_ENTRY54=(Token)match(input,RALLY_ENTRY,FOLLOW_RALLY_ENTRY_in_rally_entry_line1282); if (state.failed) return str;
			if ( state.backtracking==0 ) {str+=" "+(RALLY_ENTRY54!=null?RALLY_ENTRY54.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:427:1: rally_comment returns [String str] : ( NON_CONF_SECOND_LINE_COMMENT )+ ;
	public final String rally_comment() throws RecognitionException {
		String str = null;


		Token NON_CONF_SECOND_LINE_COMMENT55=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:428:16: ( ( NON_CONF_SECOND_LINE_COMMENT )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			int cnt41=0;
			loop41:
			do {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA41_2 = input.LA(2);
					if ( (synpred73_test()) ) {
						alt41=1;
					}

				}

				switch (alt41) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:4: NON_CONF_SECOND_LINE_COMMENT
					{
					NON_CONF_SECOND_LINE_COMMENT55=(Token)match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1303); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" "+(NON_CONF_SECOND_LINE_COMMENT55!=null?NON_CONF_SECOND_LINE_COMMENT55.getText():null);}
					}
					break;

				default :
					if ( cnt41 >= 1 ) break loop41;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(41, input);
						throw eee;
				}
				cnt41++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:1: junior_ring returns [JsonObject json] : JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token JUNIOR_CLASS56=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:437:33: ( JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:438:3: JUNIOR_CLASS
			{
			JUNIOR_CLASS56=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring1328); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("ClassName", (JUNIOR_CLASS56!=null?JUNIOR_CLASS56.getText():null));}
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:95: ( ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:177:96: ring
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

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:8: (mComment= comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:8: mComment= comment
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:42: ( TIME )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:42: TIME
		{
		match(input,TIME,FOLLOW_TIME_in_synpred14_test267); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred14_test

	// $ANTLR start synpred15_test
	public final void synpred15_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:64: ( PHONE_NUMBER )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:64: PHONE_NUMBER
		{
		match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_synpred15_test270); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred15_test

	// $ANTLR start synpred16_test
	public final void synpred16_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:102: ( BREED_NAME )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:196:102: BREED_NAME
		{
		match(input,BREED_NAME,FOLLOW_BREED_NAME_in_synpred16_test273); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred16_test

	// $ANTLR start synpred40_test
	public final void synpred40_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:7: ({...}? =>mComment= timeblock_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:7: {...}? =>mComment= timeblock_comment
		{
		if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred40_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
		}
		pushFollow(FOLLOW_timeblock_comment_in_synpred40_test525);
		mComment=timeblock_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred40_test

	// $ANTLR start synpred41_test
	public final void synpred41_test_fragment() throws RecognitionException {
		JsonArray rings =null;
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:6: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:6: rings= inner_timeblock ({...}? =>mComment= timeblock_comment )*
		{
		pushFollow(FOLLOW_inner_timeblock_in_synpred41_test497);
		rings=inner_timeblock();
		state._fsp--;
		if (state.failed) return ;
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:6: ({...}? =>mComment= timeblock_comment )*
		loop44:
		do {
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==NON_CONFORMATION_CLASS_NAME) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt44=1;
			}
			else if ( (LA44_0==BREED_NAME) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt44=1;
			}
			else if ( (LA44_0==COMMENT) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt44=1;
			}
			else if ( (LA44_0==PARENTHETICAL) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt44=1;
			}
			else if ( (LA44_0==INT) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt44=1;
			}
			else if ( (LA44_0==ELLIPSIS) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt44=1;
			}
			else if ( (LA44_0==DATE) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt44=1;
			}
			else if ( (LA44_0==PHONE_NUMBER) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt44=1;
			}
			else if ( (LA44_0==SPECIAL_SUFFIX) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt44=1;
			}
			else if ( (LA44_0==NON_CONF_SECOND_LINE_COMMENT) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt44=1;
			}
			else if ( (LA44_0==GROUP_RING) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt44=1;
			}

			switch (alt44) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:7: {...}? =>mComment= timeblock_comment
				{
				if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
					if (state.backtracking>0) {state.failed=true; return ;}
					throw new FailedPredicateException(input, "synpred41_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
				}
				pushFollow(FOLLOW_timeblock_comment_in_synpred41_test525);
				mComment=timeblock_comment();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				break loop44;
			}
		} while (true);

		}

	}
	// $ANTLR end synpred41_test

	// $ANTLR start synpred45_test
	public final void synpred45_test_fragment() throws RecognitionException {
		JsonObject mName =null;
		JsonObject nonGroupRing =null;
		JsonObject mRallyWalkthrough =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:268:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
		int alt47=2;
		int LA47_0 = input.LA(1);
		if ( (LA47_0==COMMENT||(LA47_0 >= INT && LA47_0 <= JUDGE_NAME)||(LA47_0 >= PARENTHETICAL && LA47_0 <= PARENTHETICAL_INT)) ) {
			alt47=1;
		}
		else if ( (LA47_0==RALLY_CLASS) ) {
			alt47=2;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return ;}
			NoViableAltException nvae =
				new NoViableAltException("", 47, 0, input);
			throw nvae;
		}
		switch (alt47) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: (mName= judge_name )? nonGroupRing= non_group_ring
				{
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:5: (mName= judge_name )?
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==COMMENT||LA46_0==JUDGE_NAME||(LA46_0 >= PARENTHETICAL && LA46_0 <= PARENTHETICAL_INT)) ) {
					alt46=1;
				}
				switch (alt46) {
					case 1 :
						// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:6: mName= judge_name
						{
						pushFollow(FOLLOW_judge_name_in_synpred45_test640);
						mName=judge_name();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

				}

				pushFollow(FOLLOW_non_group_ring_in_synpred45_test652);
				nonGroupRing=non_group_ring();
				state._fsp--;
				if (state.failed) return ;
				}
				break;
			case 2 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:5: (mRallyWalkthrough= rally_walkthrough )
				{
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:5: (mRallyWalkthrough= rally_walkthrough )
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:279:6: mRallyWalkthrough= rally_walkthrough
				{
				pushFollow(FOLLOW_rally_walkthrough_in_synpred45_test669);
				mRallyWalkthrough=rally_walkthrough();
				state._fsp--;
				if (state.failed) return ;
				}

				}
				break;

		}

		}

	}
	// $ANTLR end synpred45_test

	// $ANTLR start synpred46_test
	public final void synpred46_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:288:5: ({...}? => ring_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:288:5: {...}? => ring_comment
		{
		if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred46_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
		}
		pushFollow(FOLLOW_ring_comment_in_synpred46_test697);
		ring_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred46_test

	// $ANTLR start synpred47_test
	public final void synpred47_test_fragment() throws RecognitionException {
		JsonObject suffix =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:3: (suffix= special_suffix )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:301:3: suffix= special_suffix
		{
		pushFollow(FOLLOW_special_suffix_in_synpred47_test754);
		suffix=special_suffix();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred47_test

	// $ANTLR start synpred48_test
	public final void synpred48_test_fragment() throws RecognitionException {
		JsonObject obedience =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:3: ( (obedience= obedience_with_breed ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:3: (obedience= obedience_with_breed )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:3: (obedience= obedience_with_breed )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:302:4: obedience= obedience_with_breed
		{
		pushFollow(FOLLOW_obedience_with_breed_in_synpred48_test763);
		obedience=obedience_with_breed();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred48_test

	// $ANTLR start synpred58_test
	public final void synpred58_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:3: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:349:3: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred58_test967); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred58_test

	// $ANTLR start synpred69_test
	public final void synpred69_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:4: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:413:4: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred69_test1200); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred69_test

	// $ANTLR start synpred73_test
	public final void synpred73_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:4: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:4: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred73_test1303); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred73_test

	// Delegated rules

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
	public final boolean synpred40_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred40_test_fragment(); // can never throw exception
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
	public final boolean synpred58_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred58_test_fragment(); // can never throw exception
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
	public final boolean synpred69_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred69_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred73_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred73_test_fragment(); // can never throw exception
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


	protected DFA16 dfa16 = new DFA16(this);
	static final String DFA16_eotS =
		"\13\uffff";
	static final String DFA16_eofS =
		"\1\1\5\uffff\1\7\4\uffff";
	static final String DFA16_minS =
		"\1\6\1\uffff\1\52\2\0\1\10\1\4\1\uffff\1\4\2\10";
	static final String DFA16_maxS =
		"\1\74\1\uffff\1\74\2\0\2\74\1\uffff\1\72\2\74";
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
			"\1\7\1\uffff\1\7\1\uffff\3\7\2\uffff\1\1\33\uffff\4\7\1\uffff\1\7\3"+
			"\uffff\3\7\1\uffff\2\7\1\uffff\4\7",
			"",
			"\1\7\1\uffff\1\7\6\uffff\1\1\36\uffff\1\7\1\uffff\1\7\3\uffff\1\7\4"+
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
			return "()* loopback of 226:5: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*";
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
						if ( (synpred41_test()) ) {s = 7;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index16_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA16_4 = input.LA(1);
						 
						int index16_4 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred41_test()) ) {s = 7;}
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
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_name218 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_COMMENT_in_judge_name227 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_judge_name230 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_judge_name233 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_comment_in_big_comment264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_big_comment270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_comment308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_comment311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_comment317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_timeblock_comment357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_timeblock_comment360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_timeblock_comment363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock_comment366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_timeblock_comment369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_timeblock_comment372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_timeblock_comment375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_timeblock_comment380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_timeblock_comment382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_ring_comment407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock439 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FOLLOWING_TIME_in_timeblock449 = new BitSet(new long[]{0x0CDC4E0000000742L});
	public static final BitSet FOLLOW_TIME_in_timeblock466 = new BitSet(new long[]{0x0CDC4E0000000742L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock497 = new BitSet(new long[]{0x0CDC4E0000000742L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock525 = new BitSet(new long[]{0x0CDC4E0000000742L});
	public static final BitSet FOLLOW_INT_in_non_group_ring580 = new BitSet(new long[]{0x0484500000000050L});
	public static final BitSet FOLLOW_ring_with_breed_in_non_group_ring590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_without_breed_in_non_group_ring599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_name_in_inner_timeblock640 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_non_group_ring_in_inner_timeblock652 = new BitSet(new long[]{0x0CDC4E0000000742L});
	public static final BitSet FOLLOW_rally_walkthrough_in_inner_timeblock669 = new BitSet(new long[]{0x0CDC4E0000000742L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock697 = new BitSet(new long[]{0x0CDC4E0000000742L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_walkthrough724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_name_in_ring_with_breed743 = new BitSet(new long[]{0x0400000000000112L});
	public static final BitSet FOLLOW_special_suffix_in_ring_with_breed754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_ring_with_breed763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_ring_with_breed772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_obedience_with_breed793 = new BitSet(new long[]{0x0002040000000000L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_obedience_with_breed806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_suffix825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name844 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_ring_without_breed873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_breed_ring_in_ring_without_breed882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_in_ring_without_breed891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_conformation_ring_in_ring_without_breed900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_suffix_in_ring_without_breed909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring948 = new BitSet(new long[]{0x0104040000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring958 = new BitSet(new long[]{0x0104040000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_ring967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_empty_breed_ring989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_non_conformation_breed_ring1004 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_non_conformation_breed_ring1007 = new BitSet(new long[]{0x0002040000000000L});
	public static final BitSet FOLLOW_set_in_non_conformation_breed_ring1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring1030 = new BitSet(new long[]{0x0000000000000092L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring1034 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring1067 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring1073 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring1095 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_group_ring1099 = new BitSet(new long[]{0x0008000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_group_ring1102 = new BitSet(new long[]{0x0008000000000102L});
	public static final BitSet FOLLOW_TIME_in_group_block1123 = new BitSet(new long[]{0x0800020000000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block1126 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block1132 = new BitSet(new long[]{0x0000028000000000L});
	public static final BitSet FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring1164 = new BitSet(new long[]{0x0006000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring1179 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring1200 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring_block1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring_block1232 = new BitSet(new long[]{0x0100040000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring_block1239 = new BitSet(new long[]{0x0100040000000002L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_ring_name1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_rally_entry_line1278 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RALLY_ENTRY_in_rally_entry_line1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1303 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred2_test71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred13_test264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_synpred14_test267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_synpred15_test270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_synpred16_test273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred40_test525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred41_test497 = new BitSet(new long[]{0x044C460000000742L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred41_test525 = new BitSet(new long[]{0x044C460000000742L});
	public static final BitSet FOLLOW_judge_name_in_synpred45_test640 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_non_group_ring_in_synpred45_test652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_walkthrough_in_synpred45_test669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_synpred46_test697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_suffix_in_synpred47_test754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_synpred48_test763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred58_test967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred69_test1200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred73_test1303 = new BitSet(new long[]{0x0000000000000002L});
}
