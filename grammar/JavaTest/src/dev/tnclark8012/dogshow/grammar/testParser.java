// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2014-03-22 10:55:24

//TODO Puppy groups
package dev.tnclark8012.dogshow.grammar;
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
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;
import dev.tnclark8012.dogshow.shared.DogshowEnums.BreedGroup;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class testParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREED_CLASSIFIER", "BREED_COUNT", "BREED_MISC", "BREED_NAME", "BREED_NAME_SUFFIX", "CLUB_INDICATOR", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "END_WORD", "FOLLOWING_TIME", "FRAG_BEST_IN_SHOW", "FRAG_BREED_ATTRIBUTE", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP", "FRAG_MONTH", "FRAG_PROPER_NAME", "FRAG_RALLY_CLASS_NAME", "FRAG_RALLY_CLASS_SECTION", "FRAG_RALLY_ENTRANT_GROUP", "FRAG_RALLY_SINGLE_ENTRANT", "FRAG_RING", "FRAG_SEX", "FRAG_SPECIAL_GROUP_NAME", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_TO_FOLLOW", "FRAG_WEEK_DAY", "FallThrough", "GROUP", "GROUP_ENDING_ANNOUNCEMENT", "GROUP_NAME", "GROUP_RING", "GROUP_TYPE", "HYPHEN", "INT", "JUDGE_NAME", "JUNIOR_CLASS", "NON_CONFORMATION_CLASS_LEVEL", "NON_CONFORMATION_CLASS_NAME", "NON_CONFORMATION_CLASS_SECTION", "NON_CONFORMATION_CLASS_SUFFIX", "NON_CONFORMATION_SECOND_LINE", "NON_CONF_SECOND_LINE_COMMENT", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "RALLY_CLASS", "RALLY_ENTRY", "RALLY_ENTRY_TITLE", "RING", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
	};

	public static final int EOF=-1;
	public static final int BREED_CLASSIFIER=4;
	public static final int BREED_COUNT=5;
	public static final int BREED_MISC=6;
	public static final int BREED_NAME=7;
	public static final int BREED_NAME_SUFFIX=8;
	public static final int CLUB_INDICATOR=9;
	public static final int COMMENT=10;
	public static final int DATE=11;
	public static final int ELLIPSIS=12;
	public static final int END_PUNCTUATION=13;
	public static final int END_WORD=14;
	public static final int FOLLOWING_TIME=15;
	public static final int FRAG_BEST_IN_SHOW=16;
	public static final int FRAG_BREED_ATTRIBUTE=17;
	public static final int FRAG_BREED_NAME_ALT=18;
	public static final int FRAG_BREED_NAME_CATEGORY=19;
	public static final int FRAG_BREED_NAME_CATEGORY_SUFFIX=20;
	public static final int FRAG_BREED_NAME_SINGLE=21;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX=22;
	public static final int FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP=23;
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
	public static final int GROUP=40;
	public static final int GROUP_ENDING_ANNOUNCEMENT=41;
	public static final int GROUP_NAME=42;
	public static final int GROUP_RING=43;
	public static final int GROUP_TYPE=44;
	public static final int HYPHEN=45;
	public static final int INT=46;
	public static final int JUDGE_NAME=47;
	public static final int JUNIOR_CLASS=48;
	public static final int NON_CONFORMATION_CLASS_LEVEL=49;
	public static final int NON_CONFORMATION_CLASS_NAME=50;
	public static final int NON_CONFORMATION_CLASS_SECTION=51;
	public static final int NON_CONFORMATION_CLASS_SUFFIX=52;
	public static final int NON_CONFORMATION_SECOND_LINE=53;
	public static final int NON_CONF_SECOND_LINE_COMMENT=54;
	public static final int PARENTHETICAL=55;
	public static final int PARENTHETICAL_INT=56;
	public static final int PARENTHETICAL_NAME=57;
	public static final int PHONE_NUMBER=58;
	public static final int RALLY_CLASS=59;
	public static final int RALLY_ENTRY=60;
	public static final int RALLY_ENTRY_TITLE=61;
	public static final int RING=62;
	public static final int SPECIAL_SUFFIX=63;
	public static final int STANDALONE_COMMENT=64;
	public static final int TIME=65;
	public static final int WORD=66;
	public static final int WS=67;

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
	int mCurrentCount;
	String mLastComment;
	boolean isSpecialtyRing;
	String mSpecialtyBreed;
	String mSpecialtyGroup;
	int mCountAhead;
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

	  
	  private int parseIntSafely(String str, int defaultValue){
	  	try{
	  		return Integer.parseInt(str.trim());
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
		private void addToJsonFromAttribute(JsonObject json, String attribute)
		{
			boolean special = isSweepstakes(attribute);
			if(special)json.addProperty("IsSweepstakes", true);
			if(isVeteran(attribute))json.addProperty("IsVeteran", true);
			String countName = null;
			if( attribute.contains(" Dog") )
			{
				if(special)
				{
					countName = "SpecialDogCount";
				}
				else
				{
					countName = "DogCount";
				}
			}
			else if( attribute.contains(" Bitch") )
			{
				if(special)
				{
					countName = "SpecialBitchCount";
				}
				else
				{
					countName = "BitchCount";
				}
			}
			else
			{
				return;
			}
			json.addProperty(countName, mCurrentCount);
		}
		/**
		* Is breedName is a veteran entry?
		*/
		private boolean isVeteran(String breedName)
		{
			if( breedName == null) return false;
			return breedName.contains("Veteran");
		}
		
		/**
		* Is breed name if breedName is a sweepsatakes entry?
		*/
		private boolean isSweepstakes(String breedName)
		{
			if( breedName == null) return false;
			return breedName.contains("Sweepstakes") || breedName.contains("Special");
		}
	  
	  



	// $ANTLR start "start"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:215:1: start returns [JsonObject json] : (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		String mComment =null;
		JsonObject mRing =null;

		json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:3: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:4: (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:4: (mComment= big_comment )+
			int cnt1=0;
			loop1:
			do {
				int alt1=2;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:5: mComment= big_comment
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:94: ( ( ring )=>mRing= ring )+
			int cnt2=0;
			loop2:
			do {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CLUB_INDICATOR) && (synpred2_test())) {
					alt2=1;
				}
				else if ( (LA2_0==RING) && (synpred2_test())) {
					alt2=1;
				}
				else if ( (LA2_0==GROUP) && (synpred2_test())) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:95: ( ring )=>mRing= ring
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:1: ring returns [JsonObject json] : ( special_ring_header )? mTitle= ring_title mRing= inner_ring ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		String mTitle =null;
		JsonObject mRing =null;

		json = new JsonObject();boolean hasHeader=false; if(debug){System.out.println("ring...");}mLastBreedName = null;String title = null;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:3: ( ( special_ring_header )? mTitle= ring_title mRing= inner_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:7: ( special_ring_header )? mTitle= ring_title mRing= inner_ring
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:7: ( special_ring_header )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CLUB_INDICATOR) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:8: special_ring_header
					{
					pushFollow(FOLLOW_special_ring_header_in_ring108);
					special_ring_header();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {hasHeader=true;isSpecialtyRing=true;}
					}
					break;

			}

			pushFollow(FOLLOW_ring_title_in_ring115);
			mTitle=ring_title();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {if(!hasHeader){isSpecialtyRing=false;}title=mTitle;json.addProperty("Title", title); json.addProperty("Number", parseRingNumber(title));if(!mRelational){mCurrentRingNumber=parseRingNumber(title);}}
			pushFollow(FOLLOW_inner_ring_in_ring120);
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



	// $ANTLR start "ring_title"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:1: ring_title returns [String str] : ( ( RING INT ) | ( GROUP RING ) );
	public final String ring_title() throws RecognitionException {
		String str = null;


		Token RING1=null;
		Token INT2=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:32: ( ( RING INT ) | ( GROUP RING ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==RING) ) {
				alt4=1;
			}
			else if ( (LA4_0==GROUP) ) {
				alt4=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:34: ( RING INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:34: ( RING INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:35: RING INT
					{
					RING1=(Token)match(input,RING,FOLLOW_RING_in_ring_title132); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(RING1!=null?RING1.getText():null);}
					INT2=(Token)match(input,INT,FOLLOW_INT_in_ring_title135); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + (INT2!=null?INT2.getText():null);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:87: ( GROUP RING )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:87: ( GROUP RING )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:88: GROUP RING
					{
					match(input,GROUP,FOLLOW_GROUP_in_ring_title142); if (state.failed) return str;
					match(input,RING,FOLLOW_RING_in_ring_title144); if (state.failed) return str;
					if ( state.backtracking==0 ) {str="GROUP RING";}
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
	// $ANTLR end "ring_title"



	// $ANTLR start "special_ring_header"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:225:1: special_ring_header returns [String str] : CLUB_INDICATOR HYPHEN INT ( COMMENT )* ;
	public final String special_ring_header() throws RecognitionException {
		String str = null;


		Token CLUB_INDICATOR3=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:226:3: ( CLUB_INDICATOR HYPHEN INT ( COMMENT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:231:3: CLUB_INDICATOR HYPHEN INT ( COMMENT )*
			{
			CLUB_INDICATOR3=(Token)match(input,CLUB_INDICATOR,FOLLOW_CLUB_INDICATOR_in_special_ring_header167); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(CLUB_INDICATOR3!=null?CLUB_INDICATOR3.getText():null);if(mLastComment!=null){Breeds breed = Breeds.find(mLastComment);if(breed!=null){mSpecialtyGroup=null;mSpecialtyBreed = breed.getPrimaryName();latestBreed=mSpecialtyBreed;}else{mSpecialtyBreed=null;BreedGroup group = BreedGroup.find(mLastComment);if(group!=null)mSpecialtyGroup=group.getName();}}}
			match(input,HYPHEN,FOLLOW_HYPHEN_in_special_ring_header170); if (state.failed) return str;
			match(input,INT,FOLLOW_INT_in_special_ring_header172); if (state.failed) return str;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:231:351: ( COMMENT )*
			loop5:
			do {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMENT) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:231:351: COMMENT
					{
					match(input,COMMENT,FOLLOW_COMMENT_in_special_ring_header174); if (state.failed) return str;
					}
					break;

				default :
					break loop5;
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
		return str;
	}
	// $ANTLR end "special_ring_header"



	// $ANTLR start "inner_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:232:1: inner_ring returns [JsonObject json] : ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) );
	public final JsonObject inner_ring() throws RecognitionException {
		JsonObject json = null;


		JsonObject mGroupBlock =null;
		JsonObject mJugeBlock =null;

		json = new JsonObject();JsonArray judgeBlocks = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:2: ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==TIME) ) {
				alt8=1;
			}
			else if ( (LA8_0==COMMENT||LA8_0==JUDGE_NAME||(LA8_0 >= PARENTHETICAL && LA8_0 <= PARENTHETICAL_INT)) ) {
				alt8=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:6: ( group_block )=>mGroupBlock= group_block ( comment )*
					{
					pushFollow(FOLLOW_group_block_in_inner_ring200);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:82: ( comment )*
					loop6:
					do {
						int alt6=2;
						alt6 = dfa6.predict(input);
						switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:83: comment
							{
							pushFollow(FOLLOW_comment_in_inner_ring204);
							comment();
							state._fsp--;
							if (state.failed) return json;
							}
							break;

						default :
							break loop6;
						}
					} while (true);

					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:7: ( (mJugeBlock= judge_block )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:7: ( (mJugeBlock= judge_block )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:8: (mJugeBlock= judge_block )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:8: (mJugeBlock= judge_block )+
					int cnt7=0;
					loop7:
					do {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==COMMENT||LA7_0==JUDGE_NAME||(LA7_0 >= PARENTHETICAL && LA7_0 <= PARENTHETICAL_INT)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:235:9: mJugeBlock= judge_block
							{
							pushFollow(FOLLOW_judge_block_in_inner_ring219);
							mJugeBlock=judge_block();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {judgeBlocks.add(mJugeBlock);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:1: judge_block returns [JsonObject json] : mName= judge_name ( (tBlock= timeblock ) | (mBlock= inner_timeblock ) )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		JsonObject mName =null;
		JsonObject tBlock =null;
		JsonArray mBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray();nextJudgeIsNewRing = true;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:5: (mName= judge_name ( (tBlock= timeblock ) | (mBlock= inner_timeblock ) )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:9: mName= judge_name ( (tBlock= timeblock ) | (mBlock= inner_timeblock ) )+
			{
			pushFollow(FOLLOW_judge_name_in_judge_block249);
			mName=judge_name();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {if(!mRelational){mCurrentJudge = mName;judgeSet.add(mCurrentJudge.get("Judge").getAsString());}mergeJson(json, mName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:146: ( (tBlock= timeblock ) | (mBlock= inner_timeblock ) )+
			int cnt9=0;
			loop9:
			do {
				int alt9=3;
				switch ( input.LA(1) ) {
				case CLUB_INDICATOR:
					{
					int LA9_2 = input.LA(2);
					if ( (LA9_2==HYPHEN) ) {
						int LA9_11 = input.LA(3);
						if ( (LA9_11==INT) ) {
							int LA9_12 = input.LA(4);
							if ( ((((synpred11_test()&&synpred11_test())&&(!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING"))))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt9=2;
							}

						}
						else if ( (LA9_11==EOF||LA9_11==BREED_NAME||(LA9_11 >= CLUB_INDICATOR && LA9_11 <= ELLIPSIS)||LA9_11==GROUP||(LA9_11 >= GROUP_NAME && LA9_11 <= HYPHEN)||LA9_11==JUDGE_NAME||LA9_11==NON_CONFORMATION_CLASS_NAME||(LA9_11 >= NON_CONF_SECOND_LINE_COMMENT && LA9_11 <= PARENTHETICAL_INT)||(LA9_11 >= PHONE_NUMBER && LA9_11 <= RALLY_CLASS)||(LA9_11 >= RING && LA9_11 <= TIME)) ) {
							alt9=2;
						}

					}
					else if ( (LA9_2==EOF||LA9_2==BREED_NAME||(LA9_2 >= CLUB_INDICATOR && LA9_2 <= ELLIPSIS)||LA9_2==GROUP||(LA9_2 >= GROUP_NAME && LA9_2 <= GROUP_TYPE)||(LA9_2 >= INT && LA9_2 <= JUDGE_NAME)||LA9_2==NON_CONFORMATION_CLASS_NAME||(LA9_2 >= NON_CONF_SECOND_LINE_COMMENT && LA9_2 <= PARENTHETICAL_INT)||(LA9_2 >= PHONE_NUMBER && LA9_2 <= RALLY_CLASS)||(LA9_2 >= RING && LA9_2 <= TIME)) ) {
						alt9=2;
					}

					}
					break;
				case GROUP:
					{
					int LA9_3 = input.LA(2);
					if ( ((LA9_3 >= BREED_CLASSIFIER && LA9_3 <= RALLY_ENTRY_TITLE)||(LA9_3 >= SPECIAL_SUFFIX && LA9_3 <= WS)) ) {
						alt9=2;
					}

					}
					break;
				case JUDGE_NAME:
					{
					int LA9_4 = input.LA(2);
					if ( (synpred11_test()) ) {
						alt9=2;
					}

					}
					break;
				case COMMENT:
					{
					int LA9_5 = input.LA(2);
					if ( (synpred11_test()) ) {
						alt9=2;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA9_6 = input.LA(2);
					if ( (synpred11_test()) ) {
						alt9=2;
					}

					}
					break;
				case PARENTHETICAL_INT:
					{
					int LA9_7 = input.LA(2);
					if ( (synpred11_test()) ) {
						alt9=2;
					}

					}
					break;
				case INT:
					{
					int LA9_8 = input.LA(2);
					if ( (LA9_8==FOLLOWING_TIME) ) {
						alt9=1;
					}
					else if ( (LA9_8==EOF||(LA9_8 >= BREED_CLASSIFIER && LA9_8 <= BREED_COUNT)||LA9_8==BREED_NAME||(LA9_8 >= CLUB_INDICATOR && LA9_8 <= ELLIPSIS)||LA9_8==GROUP||(LA9_8 >= GROUP_NAME && LA9_8 <= JUNIOR_CLASS)||LA9_8==NON_CONFORMATION_CLASS_NAME||(LA9_8 >= NON_CONF_SECOND_LINE_COMMENT && LA9_8 <= PARENTHETICAL_INT)||(LA9_8 >= PHONE_NUMBER && LA9_8 <= RALLY_CLASS)||(LA9_8 >= RING && LA9_8 <= TIME)) ) {
						alt9=2;
					}

					}
					break;
				case TIME:
					{
					alt9=1;
					}
					break;
				case BREED_NAME:
				case DATE:
				case ELLIPSIS:
				case GROUP_NAME:
				case GROUP_RING:
				case GROUP_TYPE:
				case HYPHEN:
				case NON_CONFORMATION_CLASS_NAME:
				case NON_CONF_SECOND_LINE_COMMENT:
				case PHONE_NUMBER:
				case RALLY_CLASS:
				case SPECIAL_SUFFIX:
				case STANDALONE_COMMENT:
					{
					alt9=2;
					}
					break;
				}
				switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:147: (tBlock= timeblock )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:147: (tBlock= timeblock )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:148: tBlock= timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block256);
					tBlock=timeblock();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {array.add(tBlock);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:186: (mBlock= inner_timeblock )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:186: (mBlock= inner_timeblock )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:187: mBlock= inner_timeblock
					{
					pushFollow(FOLLOW_inner_timeblock_in_judge_block263);
					mBlock=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {array.add(mBlock);    if(!mRelational&&mBlock!=null){mShowRings.addAll(mBlock);}}
					}

					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(9, input);
						throw eee;
				}
				cnt9++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:1: judge_name returns [JsonObject json] : ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ ) ;
	public final JsonObject judge_name() throws RecognitionException {
		JsonObject json = null;


		Token JUDGE_NAME4=null;
		Token COMMENT5=null;
		Token PARENTHETICAL6=null;
		Token PARENTHETICAL_INT7=null;

		json = new JsonObject(); String str = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:2: ( ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:4: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:4: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==JUDGE_NAME) ) {
				alt12=1;
			}
			else if ( (LA12_0==COMMENT||(LA12_0 >= PARENTHETICAL && LA12_0 <= PARENTHETICAL_INT)) ) {
				alt12=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:5: ( JUDGE_NAME )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:5: ( JUDGE_NAME )+
					int cnt10=0;
					loop10:
					do {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==JUDGE_NAME) ) {
							int LA10_2 = input.LA(2);
							if ( (synpred12_test()) ) {
								alt10=1;
							}

						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:6: JUDGE_NAME
							{
							JUDGE_NAME4=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_name289); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(JUDGE_NAME4!=null?JUDGE_NAME4.getText():null);}
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							if (state.backtracking>0) {state.failed=true; return json;}
								EarlyExitException eee =
									new EarlyExitException(10, input);
								throw eee;
						}
						cnt10++;
					} while (true);

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:3: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:3: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					int cnt11=0;
					loop11:
					do {
						int alt11=4;
						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA11_2 = input.LA(2);
							if ( (synpred14_test()) ) {
								alt11=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA11_3 = input.LA(2);
							if ( (synpred15_test()) ) {
								alt11=2;
							}

							}
							break;
						case PARENTHETICAL_INT:
							{
							int LA11_4 = input.LA(2);
							if ( (synpred16_test()) ) {
								alt11=3;
							}

							}
							break;
						}
						switch (alt11) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:4: COMMENT
							{
							COMMENT5=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_judge_name298); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(COMMENT5!=null?COMMENT5.getText():null)+" ";}
							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:37: PARENTHETICAL
							{
							PARENTHETICAL6=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_judge_name301); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL6!=null?PARENTHETICAL6.getText():null)+" ";}
							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:82: PARENTHETICAL_INT
							{
							PARENTHETICAL_INT7=(Token)match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_judge_name304); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL_INT7!=null?PARENTHETICAL_INT7.getText():null);}
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							if (state.backtracking>0) {state.failed=true; return json;}
								EarlyExitException eee =
									new EarlyExitException(11, input);
								throw eee;
						}
						cnt11++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:1: big_comment returns [String str] : (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) ;
	public final String big_comment() throws RecognitionException {
		String str = null;


		Token TIME8=null;
		Token PHONE_NUMBER9=null;
		Token BREED_NAME10=null;
		Token SPECIAL_SUFFIX11=null;
		Token GROUP_RING12=null;
		Token NON_CONFORMATION_SECOND_LINE13=null;
		String mComment =null;

		str = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:3: ( (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			int alt13=7;
			switch ( input.LA(1) ) {
			case BREED_CLASSIFIER:
			case BREED_COUNT:
			case CLUB_INDICATOR:
			case COMMENT:
			case DATE:
			case ELLIPSIS:
			case GROUP:
			case GROUP_NAME:
			case HYPHEN:
			case INT:
			case NON_CONFORMATION_CLASS_NAME:
			case PARENTHETICAL:
			case PARENTHETICAL_INT:
			case RING:
				{
				alt13=1;
				}
				break;
			case BREED_NAME:
				{
				int LA13_2 = input.LA(2);
				if ( (synpred17_test()) ) {
					alt13=1;
				}
				else if ( (synpred20_test()) ) {
					alt13=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case TIME:
				{
				int LA13_3 = input.LA(2);
				if ( (synpred17_test()) ) {
					alt13=1;
				}
				else if ( (synpred18_test()) ) {
					alt13=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case PHONE_NUMBER:
				{
				int LA13_4 = input.LA(2);
				if ( (synpred17_test()) ) {
					alt13=1;
				}
				else if ( (synpred19_test()) ) {
					alt13=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NON_CONFORMATION_SECOND_LINE:
				{
				int LA13_5 = input.LA(2);
				if ( (synpred17_test()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=7;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt13=5;
				}
				break;
			case GROUP_RING:
				{
				alt13=6;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:8: mComment= comment
					{
					pushFollow(FOLLOW_comment_in_big_comment335);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:42: TIME
					{
					TIME8=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment338); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME8!=null?TIME8.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:64: PHONE_NUMBER
					{
					PHONE_NUMBER9=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_big_comment341); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER9!=null?PHONE_NUMBER9.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:102: BREED_NAME
					{
					BREED_NAME10=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment344); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME10!=null?BREED_NAME10.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:136: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX11=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment347); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX11!=null?SPECIAL_SUFFIX11.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:178: GROUP_RING
					{
					GROUP_RING12=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment350); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_RING12!=null?GROUP_RING12.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:212: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE13=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment353); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_SECOND_LINE13!=null?NON_CONFORMATION_SECOND_LINE13.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:1: comment returns [String str] : ( non_header_comment | non_ring_title_comment | PARENTHETICAL_INT | BREED_COUNT | NON_CONFORMATION_CLASS_NAME | GROUP | GROUP_NAME | HYPHEN | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL |integer= INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) ;
	public final String comment() throws RecognitionException {
		String str = null;


		Token integer=null;
		Token NON_CONFORMATION_CLASS_NAME14=null;
		Token GROUP_NAME15=null;
		Token BREED_NAME16=null;
		Token BREED_CLASSIFIER17=null;
		Token TIME18=null;
		Token COMMENT19=null;
		Token PARENTHETICAL20=null;
		Token ELLIPSIS21=null;
		Token DATE22=null;
		Token PHONE_NUMBER23=null;
		Token NON_CONFORMATION_SECOND_LINE24=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:3: ( ( non_header_comment | non_ring_title_comment | PARENTHETICAL_INT | BREED_COUNT | NON_CONFORMATION_CLASS_NAME | GROUP | GROUP_NAME | HYPHEN | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL |integer= INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:5: ( non_header_comment | non_ring_title_comment | PARENTHETICAL_INT | BREED_COUNT | NON_CONFORMATION_CLASS_NAME | GROUP | GROUP_NAME | HYPHEN | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL |integer= INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:5: ( non_header_comment | non_ring_title_comment | PARENTHETICAL_INT | BREED_COUNT | NON_CONFORMATION_CLASS_NAME | GROUP | GROUP_NAME | HYPHEN | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL |integer= INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
			int alt14=18;
			switch ( input.LA(1) ) {
			case CLUB_INDICATOR:
				{
				alt14=1;
				}
				break;
			case RING:
				{
				alt14=2;
				}
				break;
			case PARENTHETICAL_INT:
				{
				alt14=3;
				}
				break;
			case BREED_COUNT:
				{
				alt14=4;
				}
				break;
			case NON_CONFORMATION_CLASS_NAME:
				{
				alt14=5;
				}
				break;
			case GROUP:
				{
				alt14=6;
				}
				break;
			case GROUP_NAME:
				{
				alt14=7;
				}
				break;
			case HYPHEN:
				{
				alt14=8;
				}
				break;
			case BREED_NAME:
				{
				alt14=9;
				}
				break;
			case BREED_CLASSIFIER:
				{
				alt14=10;
				}
				break;
			case TIME:
				{
				alt14=11;
				}
				break;
			case COMMENT:
				{
				alt14=12;
				}
				break;
			case PARENTHETICAL:
				{
				alt14=13;
				}
				break;
			case INT:
				{
				alt14=14;
				}
				break;
			case ELLIPSIS:
				{
				alt14=15;
				}
				break;
			case DATE:
				{
				alt14=16;
				}
				break;
			case PHONE_NUMBER:
				{
				alt14=17;
				}
				break;
			case NON_CONFORMATION_SECOND_LINE:
				{
				alt14=18;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:6: non_header_comment
					{
					pushFollow(FOLLOW_non_header_comment_in_comment376);
					non_header_comment();
					state._fsp--;
					if (state.failed) return str;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:25: non_ring_title_comment
					{
					pushFollow(FOLLOW_non_ring_title_comment_in_comment378);
					non_ring_title_comment();
					state._fsp--;
					if (state.failed) return str;
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:48: PARENTHETICAL_INT
					{
					match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_comment380); if (state.failed) return str;
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:66: BREED_COUNT
					{
					match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_comment382); if (state.failed) return str;
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:78: NON_CONFORMATION_CLASS_NAME
					{
					NON_CONFORMATION_CLASS_NAME14=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment384); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME14!=null?NON_CONFORMATION_CLASS_NAME14.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:146: GROUP
					{
					match(input,GROUP,FOLLOW_GROUP_in_comment387); if (state.failed) return str;
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:152: GROUP_NAME
					{
					GROUP_NAME15=(Token)match(input,GROUP_NAME,FOLLOW_GROUP_NAME_in_comment389); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_NAME15!=null?GROUP_NAME15.getText():null);}
					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:186: HYPHEN
					{
					match(input,HYPHEN,FOLLOW_HYPHEN_in_comment392); if (state.failed) return str;
					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:193: BREED_NAME
					{
					BREED_NAME16=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_comment394); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME16!=null?BREED_NAME16.getText():null);}
					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:227: BREED_CLASSIFIER
					{
					BREED_CLASSIFIER17=(Token)match(input,BREED_CLASSIFIER,FOLLOW_BREED_CLASSIFIER_in_comment397); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_CLASSIFIER17!=null?BREED_CLASSIFIER17.getText():null);}
					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:273: TIME
					{
					TIME18=(Token)match(input,TIME,FOLLOW_TIME_in_comment400); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME18!=null?TIME18.getText():null);}
					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:295: COMMENT
					{
					COMMENT19=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment403); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT19!=null?COMMENT19.getText():null);}
					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:323: PARENTHETICAL
					{
					PARENTHETICAL20=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment406); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL20!=null?PARENTHETICAL20.getText():null);}
					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:363: integer= INT
					{
					integer=(Token)match(input,INT,FOLLOW_INT_in_comment411); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=integer.getText();}
					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:399: ELLIPSIS
					{
					ELLIPSIS21=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment414); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS21!=null?ELLIPSIS21.getText():null);}
					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:429: DATE
					{
					DATE22=(Token)match(input,DATE,FOLLOW_DATE_in_comment417); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE22!=null?DATE22.getText():null);}
					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:451: PHONE_NUMBER
					{
					PHONE_NUMBER23=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment420); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER23!=null?PHONE_NUMBER23.getText():null);}
					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:249:489: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE24=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment423); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_SECOND_LINE24!=null?NON_CONFORMATION_SECOND_LINE24.getText():null);}
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



	// $ANTLR start "non_header_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:1: non_header_comment :{...}? CLUB_INDICATOR ;
	public final void non_header_comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:251:2: ({...}? CLUB_INDICATOR )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:251:4: {...}? CLUB_INDICATOR
			{
			if ( !((!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING")))) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "non_header_comment", "!(input.LT(2).getText().equals(\"-\") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals(\"RING\"))");
			}
			match(input,CLUB_INDICATOR,FOLLOW_CLUB_INDICATOR_in_non_header_comment434); if (state.failed) return ;
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
	// $ANTLR end "non_header_comment"



	// $ANTLR start "non_ring_title_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:252:1: non_ring_title_comment :{...}? RING ;
	public final void non_ring_title_comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:253:2: ({...}? RING )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:253:4: {...}? RING
			{
			if ( !((!(parseIntSafely(input.LT(2).getText(),-1)!=-1))) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "non_ring_title_comment", "!(parseIntSafely(input.LT(2).getText(),-1)!=-1)");
			}
			match(input,RING,FOLLOW_RING_in_non_ring_title_comment443); if (state.failed) return ;
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
	// $ANTLR end "non_ring_title_comment"



	// $ANTLR start "timeblock_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:1: timeblock_comment returns [String str] : ( GROUP_NAME | non_header_comment | HYPHEN | NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING ) ;
	public final String timeblock_comment() throws RecognitionException {
		String str = null;


		Token GROUP_NAME25=null;
		Token NON_CONFORMATION_CLASS_NAME26=null;
		Token BREED_NAME27=null;
		Token COMMENT28=null;
		Token PARENTHETICAL29=null;
		Token INT30=null;
		Token ELLIPSIS31=null;
		Token DATE32=null;
		Token PHONE_NUMBER33=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:3: ( ( GROUP_NAME | non_header_comment | HYPHEN | NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:5: ( GROUP_NAME | non_header_comment | HYPHEN | NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:5: ( GROUP_NAME | non_header_comment | HYPHEN | NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING )
			int alt15=14;
			switch ( input.LA(1) ) {
			case GROUP_NAME:
				{
				alt15=1;
				}
				break;
			case CLUB_INDICATOR:
				{
				alt15=2;
				}
				break;
			case HYPHEN:
				{
				alt15=3;
				}
				break;
			case NON_CONFORMATION_CLASS_NAME:
				{
				alt15=4;
				}
				break;
			case BREED_NAME:
				{
				alt15=5;
				}
				break;
			case COMMENT:
				{
				alt15=6;
				}
				break;
			case PARENTHETICAL:
				{
				alt15=7;
				}
				break;
			case INT:
				{
				alt15=8;
				}
				break;
			case ELLIPSIS:
				{
				alt15=9;
				}
				break;
			case DATE:
				{
				alt15=10;
				}
				break;
			case PHONE_NUMBER:
				{
				alt15=11;
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt15=12;
				}
				break;
			case NON_CONF_SECOND_LINE_COMMENT:
				{
				alt15=13;
				}
				break;
			case GROUP_RING:
				{
				alt15=14;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:6: GROUP_NAME
					{
					GROUP_NAME25=(Token)match(input,GROUP_NAME,FOLLOW_GROUP_NAME_in_timeblock_comment463); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_NAME25!=null?GROUP_NAME25.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:40: non_header_comment
					{
					pushFollow(FOLLOW_non_header_comment_in_timeblock_comment466);
					non_header_comment();
					state._fsp--;
					if (state.failed) return str;
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:59: HYPHEN
					{
					match(input,HYPHEN,FOLLOW_HYPHEN_in_timeblock_comment468); if (state.failed) return str;
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:66: NON_CONFORMATION_CLASS_NAME
					{
					NON_CONFORMATION_CLASS_NAME26=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment470); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME26!=null?NON_CONFORMATION_CLASS_NAME26.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:134: BREED_NAME
					{
					BREED_NAME27=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_timeblock_comment473); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME27!=null?BREED_NAME27.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:168: COMMENT
					{
					COMMENT28=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment476); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT28!=null?COMMENT28.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:196: PARENTHETICAL
					{
					PARENTHETICAL29=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_timeblock_comment479); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL29!=null?PARENTHETICAL29.getText():null);}
					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:236: INT
					{
					INT30=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment482); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT30!=null?INT30.getText():null);}
					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:256: ELLIPSIS
					{
					ELLIPSIS31=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment485); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS31!=null?ELLIPSIS31.getText():null);}
					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:286: DATE
					{
					DATE32=(Token)match(input,DATE,FOLLOW_DATE_in_timeblock_comment488); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE32!=null?DATE32.getText():null);}
					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:308: PHONE_NUMBER
					{
					PHONE_NUMBER33=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment491); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER33!=null?PHONE_NUMBER33.getText():null);}
					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:346: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment494); if (state.failed) return str;
					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:361: NON_CONF_SECOND_LINE_COMMENT
					{
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_timeblock_comment496); if (state.failed) return str;
					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:390: GROUP_RING
					{
					match(input,GROUP_RING,FOLLOW_GROUP_RING_in_timeblock_comment498); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:1: ring_comment returns [String str] : ( GROUP_TYPE | STANDALONE_COMMENT | (tComment= timeblock_comment ) | ( GROUP ~ RING ) );
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT34=null;
		Token GROUP35=null;
		String tComment =null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:5: ( GROUP_TYPE | STANDALONE_COMMENT | (tComment= timeblock_comment ) | ( GROUP ~ RING ) )
			int alt16=4;
			switch ( input.LA(1) ) {
			case GROUP_TYPE:
				{
				alt16=1;
				}
				break;
			case STANDALONE_COMMENT:
				{
				alt16=2;
				}
				break;
			case BREED_NAME:
			case CLUB_INDICATOR:
			case COMMENT:
			case DATE:
			case ELLIPSIS:
			case GROUP_NAME:
			case GROUP_RING:
			case HYPHEN:
			case INT:
			case NON_CONFORMATION_CLASS_NAME:
			case NON_CONF_SECOND_LINE_COMMENT:
			case PARENTHETICAL:
			case PHONE_NUMBER:
			case SPECIAL_SUFFIX:
				{
				alt16=3;
				}
				break;
			case GROUP:
				{
				alt16=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:9: GROUP_TYPE
					{
					match(input,GROUP_TYPE,FOLLOW_GROUP_TYPE_in_ring_comment520); if (state.failed) return str;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:20: STANDALONE_COMMENT
					{
					STANDALONE_COMMENT34=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment522); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT34!=null?STANDALONE_COMMENT34.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:70: (tComment= timeblock_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:70: (tComment= timeblock_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:71: tComment= timeblock_comment
					{
					pushFollow(FOLLOW_timeblock_comment_in_ring_comment528);
					tComment=timeblock_comment();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) {str=tComment;}
					}

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:114: ( GROUP ~ RING )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:114: ( GROUP ~ RING )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:260:115: GROUP ~ RING
					{
					GROUP35=(Token)match(input,GROUP,FOLLOW_GROUP_in_ring_comment533); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP35!=null?GROUP35.getText():null);}
					if ( (input.LA(1) >= BREED_CLASSIFIER && input.LA(1) <= RALLY_ENTRY_TITLE)||(input.LA(1) >= SPECIAL_SUFFIX && input.LA(1) <= WS) ) {
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:262:1: timeblock returns [JsonObject json] : ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )* ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token INT36=null;
		Token TIME37=null;
		JsonArray rings =null;
		String mComment =null;

		json = new JsonObject(); String comment = ""; String time = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:2: ( ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:4: ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:4: ( ( INT FOLLOWING_TIME ) | TIME )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==INT) ) {
				alt17=1;
			}
			else if ( (LA17_0==TIME) ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:6: ( INT FOLLOWING_TIME )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:6: ( INT FOLLOWING_TIME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:266:3: INT FOLLOWING_TIME
					{
					INT36=(Token)match(input,INT,FOLLOW_INT_in_timeblock570); if (state.failed) return json;
					if ( state.backtracking==0 ) {
									currentBlockTime=(INT36!=null?INT36.getText():null);
									json.addProperty("BlockStart", currentBlockTime);
									mCountAhead = 0;
								}
					match(input,FOLLOWING_TIME,FOLLOW_FOLLOWING_TIME_in_timeblock580); if (state.failed) return json;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:274:7: TIME
					{
					TIME37=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock597); if (state.failed) return json;
					if ( state.backtracking==0 ) {
						     		currentBlockTime=(TIME37!=null?TIME37.getText():null);
						     		json.addProperty("BlockStart", currentBlockTime);
						     		mCountAhead = 0;
						     	}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:281:5: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*
			loop19:
			do {
				int alt19=2;
				alt19 = dfa19.predict(input);
				switch (alt19) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:282:6: rings= inner_timeblock ({...}? =>mComment= timeblock_comment )*
					{
					pushFollow(FOLLOW_inner_timeblock_in_timeblock628);
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:293:6: ({...}? =>mComment= timeblock_comment )*
					loop18:
					do {
						int alt18=2;
						switch ( input.LA(1) ) {
						case CLUB_INDICATOR:
							{
							int LA18_2 = input.LA(2);
							if ( (((((!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING")))&&(!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING"))))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case COMMENT:
							{
							int LA18_3 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA18_4 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case INT:
							{
							int LA18_5 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case GROUP_NAME:
							{
							int LA18_6 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case HYPHEN:
							{
							int LA18_7 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case NON_CONFORMATION_CLASS_NAME:
							{
							int LA18_8 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case BREED_NAME:
							{
							int LA18_9 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case ELLIPSIS:
							{
							int LA18_10 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case DATE:
							{
							int LA18_11 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case PHONE_NUMBER:
							{
							int LA18_12 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case SPECIAL_SUFFIX:
							{
							int LA18_13 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case NON_CONF_SECOND_LINE_COMMENT:
							{
							int LA18_14 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						case GROUP_RING:
							{
							int LA18_15 = input.LA(2);
							if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred57_test())) ) {
								alt18=1;
							}

							}
							break;
						}
						switch (alt18) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:7: {...}? =>mComment= timeblock_comment
							{
							if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
								if (state.backtracking>0) {state.failed=true; return json;}
								throw new FailedPredicateException(input, "timeblock", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
							}
							pushFollow(FOLLOW_timeblock_comment_in_timeblock656);
							mComment=timeblock_comment();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {
								   			comment+=mComment;
								   			}
							}
							break;

						default :
							break loop18;
						}
					} while (true);

					if ( state.backtracking==0 ) {
						   		if(!comment.equals("")){
						   			json.add("timeblock_comment",new JsonPrimitive(comment));
						   			mLastComment=comment;
						   		}
						   		}
					}
					break;

				default :
					break loop19;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:312:1: non_group_ring returns [JsonObject json] : INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) ;
	public final JsonObject non_group_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT38=null;
		JsonObject mRingWithBreed =null;
		JsonObject mRingWithoutBreed =null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:313:32: ( INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:314:2: INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
			{
			INT38=(Token)match(input,INT,FOLLOW_INT_in_non_group_ring711); if (state.failed) return json;
			if ( state.backtracking==0 ) {mCurrentCount = parseIntSafely((INT38!=null?INT38.getText():null),0); json.addProperty("Count", mCurrentCount);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:315:2: ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==BREED_CLASSIFIER||LA20_0==BREED_NAME) ) {
				alt20=1;
			}
			else if ( (LA20_0==BREED_COUNT||LA20_0==JUNIOR_CLASS||LA20_0==NON_CONFORMATION_CLASS_NAME||LA20_0==NON_CONF_SECOND_LINE_COMMENT||LA20_0==RALLY_CLASS||LA20_0==SPECIAL_SUFFIX) ) {
				alt20=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:2: (mRingWithBreed= ring_with_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:2: (mRingWithBreed= ring_with_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:3: mRingWithBreed= ring_with_breed
					{
					pushFollow(FOLLOW_ring_with_breed_in_non_group_ring721);
					mRingWithBreed=ring_with_breed();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mRingWithBreed);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:2: (mRingWithoutBreed= ring_without_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:2: (mRingWithoutBreed= ring_without_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:3: mRingWithoutBreed= ring_without_breed
					{
					pushFollow(FOLLOW_ring_without_breed_in_non_group_ring730);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:321:1: inner_timeblock returns [JsonArray array] : ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? =>rComment= ring_comment )+ ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject mName =null;
		JsonObject nonGroupRing =null;
		JsonObject mRallyWalkthrough =null;
		String rComment =null;

		array = new JsonArray();JsonObject toAdd = null;String comment="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:2: ( ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? =>rComment= ring_comment )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? =>rComment= ring_comment )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:323:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? =>rComment= ring_comment )+
			int cnt23=0;
			loop23:
			do {
				int alt23=3;
				switch ( input.LA(1) ) {
				case CLUB_INDICATOR:
					{
					int LA23_2 = input.LA(2);
					if ( (((((!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING")))&&(!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING"))))&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case GROUP:
					{
					int LA23_3 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case JUDGE_NAME:
					{
					int LA23_4 = input.LA(2);
					if ( (synpred62_test()) ) {
						alt23=1;
					}

					}
					break;
				case COMMENT:
					{
					int LA23_5 = input.LA(2);
					if ( (synpred62_test()) ) {
						alt23=1;
					}
					else if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA23_6 = input.LA(2);
					if ( (synpred62_test()) ) {
						alt23=1;
					}
					else if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case PARENTHETICAL_INT:
					{
					int LA23_7 = input.LA(2);
					if ( (synpred62_test()) ) {
						alt23=1;
					}

					}
					break;
				case INT:
					{
					int LA23_8 = input.LA(2);
					if ( (synpred62_test()) ) {
						alt23=1;
					}
					else if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case RALLY_CLASS:
					{
					int LA23_9 = input.LA(2);
					if ( (synpred62_test()) ) {
						alt23=1;
					}

					}
					break;
				case GROUP_TYPE:
					{
					int LA23_10 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case STANDALONE_COMMENT:
					{
					int LA23_11 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case GROUP_NAME:
					{
					int LA23_12 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case HYPHEN:
					{
					int LA23_13 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case NON_CONFORMATION_CLASS_NAME:
					{
					int LA23_14 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case BREED_NAME:
					{
					int LA23_15 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case ELLIPSIS:
					{
					int LA23_16 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case DATE:
					{
					int LA23_17 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case PHONE_NUMBER:
					{
					int LA23_18 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case SPECIAL_SUFFIX:
					{
					int LA23_19 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case NON_CONF_SECOND_LINE_COMMENT:
					{
					int LA23_20 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				case GROUP_RING:
					{
					int LA23_21 = input.LA(2);
					if ( (((synpred63_test()&&synpred63_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
						alt23=2;
					}

					}
					break;
				}
				switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==COMMENT||(LA22_0 >= INT && LA22_0 <= JUDGE_NAME)||(LA22_0 >= PARENTHETICAL && LA22_0 <= PARENTHETICAL_INT)) ) {
						alt22=1;
					}
					else if ( (LA22_0==RALLY_CLASS) ) {
						alt22=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return array;}
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}
					switch (alt22) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:5: (mName= judge_name )? nonGroupRing= non_group_ring
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:5: (mName= judge_name )?
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==COMMENT||LA21_0==JUDGE_NAME||(LA21_0 >= PARENTHETICAL && LA21_0 <= PARENTHETICAL_INT)) ) {
								alt21=1;
							}
							switch (alt21) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:6: mName= judge_name
									{
									pushFollow(FOLLOW_judge_name_in_inner_timeblock771);
									mName=judge_name();
									state._fsp--;
									if (state.failed) return array;
									if ( state.backtracking==0 ) {mCurrentJudge = mName;judgeSet.add(mName.get("Judge").getAsString());}
									}
									break;

							}

							pushFollow(FOLLOW_non_group_ring_in_inner_timeblock783);
							nonGroupRing=non_group_ring();
							state._fsp--;
							if (state.failed) return array;
							if ( state.backtracking==0 ) {
									  	nonGroupRing.addProperty("BlockStart",currentBlockTime);
									  	nonGroupRing.addProperty("Number",mCurrentRingNumber);
									  	addCurrentJudge(nonGroupRing);
									  	nonGroupRing.add("CountAhead",new JsonPrimitive(mCountAhead));
									  	mCountAhead+=mCurrentCount;//nonGroupRing.get("Count").getAsInt();
									  	if(!nonGroupRing.has("Skip"))array.add(nonGroupRing);
									  	}
							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:5: (mRallyWalkthrough= rally_walkthrough )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:5: (mRallyWalkthrough= rally_walkthrough )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:6: mRallyWalkthrough= rally_walkthrough
							{
							pushFollow(FOLLOW_rally_walkthrough_in_inner_timeblock800);
							mRallyWalkthrough=rally_walkthrough();
							state._fsp--;
							if (state.failed) return array;
							if ( state.backtracking==0 ) {
									  	mRallyWalkthrough.addProperty("BlockStart",currentBlockTime);
									  	mCurrentCount = 0;
										mRallyWalkthrough.addProperty("Count", mCurrentCount);
									  	mRallyWalkthrough.addProperty("Number",mCurrentRingNumber);
									  	mRallyWalkthrough.add("CountAhead",new JsonPrimitive(mCountAhead));
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:5: {...}? =>rComment= ring_comment
					{
					if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
						if (state.backtracking>0) {state.failed=true; return array;}
						throw new FailedPredicateException(input, "inner_timeblock", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
					}
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock830);
					rComment=ring_comment();
					state._fsp--;
					if (state.failed) return array;
					if ( state.backtracking==0 ) {comment+=" "+rComment;}
					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					if (state.backtracking>0) {state.failed=true; return array;}
						EarlyExitException eee =
							new EarlyExitException(23, input);
						throw eee;
				}
				cnt23++;
			} while (true);

			if ( state.backtracking==0 ) {
					  mLastComment=comment;}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:353:1: rally_walkthrough returns [JsonObject json] : RALLY_CLASS ;
	public final JsonObject rally_walkthrough() throws RecognitionException {
		JsonObject json = null;


		Token RALLY_CLASS39=null;

		json = new JsonObject();json.addProperty("RingType","Rally");mCurrentCount = 0;json.addProperty("Count",mCurrentCount);
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:354:128: ( RALLY_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:355:3: RALLY_CLASS
			{
			RALLY_CLASS39=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_walkthrough859); if (state.failed) return json;
			if ( state.backtracking==0 ) {String title = (RALLY_CLASS39!=null?RALLY_CLASS39.getText():null); json.addProperty("RallyName", title.replace(" Walkthrough", "")); json.addProperty("IsWalkthrough",true); }
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:357:1: ring_with_breed returns [JsonObject json] : breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) ;
	public final JsonObject ring_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT40=null;
		JsonObject breedName =null;
		JsonObject suffix =null;
		JsonObject obedience =null;

		json = new JsonObject();json.addProperty("RingType","Unassigned");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:358:74: (breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:359:2: breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			{
			pushFollow(FOLLOW_breed_name_in_ring_with_breed878);
			breedName=breed_name();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("RingType", "Conformation");mergeJson(json,breedName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:360:2: (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			int alt25=3;
			switch ( input.LA(1) ) {
			case SPECIAL_SUFFIX:
				{
				int LA25_1 = input.LA(2);
				if ( (synpred64_test()) ) {
					alt25=1;
				}
				else if ( (true) ) {
					alt25=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return json;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case HYPHEN:
				{
				switch ( input.LA(2) ) {
				case NON_CONFORMATION_SECOND_LINE:
					{
					alt25=2;
					}
					break;
				case INT:
					{
					int LA25_6 = input.LA(3);
					if ( (synpred65_test()) ) {
						alt25=2;
					}
					else if ( (true) ) {
						alt25=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return json;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 25, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case EOF:
				case BREED_NAME:
				case CLUB_INDICATOR:
				case COMMENT:
				case DATE:
				case ELLIPSIS:
				case GROUP:
				case GROUP_NAME:
				case GROUP_RING:
				case GROUP_TYPE:
				case HYPHEN:
				case JUDGE_NAME:
				case NON_CONFORMATION_CLASS_NAME:
				case NON_CONF_SECOND_LINE_COMMENT:
				case PARENTHETICAL:
				case PARENTHETICAL_INT:
				case PHONE_NUMBER:
				case RALLY_CLASS:
				case RING:
				case SPECIAL_SUFFIX:
				case STANDALONE_COMMENT:
				case TIME:
					{
					alt25=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return json;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 2, input);
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
			case CLUB_INDICATOR:
			case COMMENT:
			case DATE:
			case ELLIPSIS:
			case GROUP:
			case GROUP_NAME:
			case GROUP_RING:
			case GROUP_TYPE:
			case INT:
			case JUDGE_NAME:
			case NON_CONFORMATION_CLASS_NAME:
			case NON_CONF_SECOND_LINE_COMMENT:
			case PARENTHETICAL:
			case PARENTHETICAL_INT:
			case PHONE_NUMBER:
			case RALLY_CLASS:
			case RING:
			case STANDALONE_COMMENT:
			case TIME:
				{
				alt25=3;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:3: suffix= special_suffix
					{
					pushFollow(FOLLOW_special_suffix_in_ring_with_breed889);
					suffix=special_suffix();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,suffix);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:3: (obedience= obedience_with_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:3: (obedience= obedience_with_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:4: obedience= obedience_with_breed
					{
					pushFollow(FOLLOW_obedience_with_breed_in_ring_with_breed898);
					obedience=obedience_with_breed();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("Skip",true);}
					}

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:3: ( ( BREED_COUNT )? )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:3: ( ( BREED_COUNT )? )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:4: ( BREED_COUNT )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:4: ( BREED_COUNT )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==BREED_COUNT) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:5: BREED_COUNT
							{
							BREED_COUNT40=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_ring_with_breed907); if (state.failed) return json;
							if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT40!=null?BREED_COUNT40.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:1: obedience_with_breed returns [JsonObject json] : HYPHEN ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) ;
	public final JsonObject obedience_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token mEntry=null;
		Token mNumber=null;

		json = new JsonObject(); json.addProperty("Type", "Obedience"); json.addProperty("Class",mCurrentClass);
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:112: ( HYPHEN ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:2: HYPHEN ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
			{
			match(input,HYPHEN,FOLLOW_HYPHEN_in_obedience_with_breed928); if (state.failed) return json;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:9: ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==NON_CONFORMATION_SECOND_LINE) ) {
				alt26=1;
			}
			else if ( (LA26_0==INT) ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:10: (mEntry= NON_CONFORMATION_SECOND_LINE )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:10: (mEntry= NON_CONFORMATION_SECOND_LINE )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:11: mEntry= NON_CONFORMATION_SECOND_LINE
					{
					mEntry=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed934); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("obedienceEntries",(mEntry!=null?mEntry.getText():null)); }
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:101: (mNumber= INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:101: (mNumber= INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:367:102: mNumber= INT
					{
					mNumber=(Token)match(input,INT,FOLLOW_INT_in_obedience_with_breed941); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:1: special_suffix returns [JsonObject json] : SPECIAL_SUFFIX ;
	public final JsonObject special_suffix() throws RecognitionException {
		JsonObject json = null;


		Token SPECIAL_SUFFIX41=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:32: ( SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:371:2: SPECIAL_SUFFIX
			{
			SPECIAL_SUFFIX41=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_suffix960); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("SpecialSuffix",(SPECIAL_SUFFIX41!=null?SPECIAL_SUFFIX41.getText():null));if(isSweepstakes((SPECIAL_SUFFIX41!=null?SPECIAL_SUFFIX41.getText():null)))json.addProperty("IsSweepstakes",true);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:1: breed_name returns [JsonObject json] : ( BREED_NAME | BREED_CLASSIFIER ) ( BREED_NAME_SUFFIX )? ;
	public final JsonObject breed_name() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME42=null;
		Token BREED_CLASSIFIER43=null;
		Token BREED_NAME_SUFFIX44=null;

		json = new JsonObject(); String breedName ="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:55: ( ( BREED_NAME | BREED_CLASSIFIER ) ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:3: ( BREED_NAME | BREED_CLASSIFIER ) ( BREED_NAME_SUFFIX )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:3: ( BREED_NAME | BREED_CLASSIFIER )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==BREED_NAME) ) {
				alt27=1;
			}
			else if ( (LA27_0==BREED_CLASSIFIER) ) {
				alt27=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:375:4: BREED_NAME
					{
					BREED_NAME42=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name980); if (state.failed) return json;
					if ( state.backtracking==0 ) {
					    		breedName+=(BREED_NAME42!=null?BREED_NAME42.getText():null);
								if(isSweepstakes((BREED_NAME42!=null?BREED_NAME42.getText():null))){
									breedName=mLastBreedName;
									json.addProperty("IsSweepstakes",true);
								}
								else
								{
									mLastBreedName=breedName;
								}
								
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:392:10: BREED_CLASSIFIER
					{
					BREED_CLASSIFIER43=(Token)match(input,BREED_CLASSIFIER,FOLLOW_BREED_CLASSIFIER_in_breed_name983); if (state.failed) return json;
					if ( state.backtracking==0 ) {
									breedName=mLastBreedName;json.addProperty("BreedAttribute",(BREED_CLASSIFIER43!=null?BREED_CLASSIFIER43.getText():null).trim());
									addToJsonFromAttribute(json,(BREED_CLASSIFIER43!=null?BREED_CLASSIFIER43.getText():null));
					    		}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:10: ( BREED_NAME_SUFFIX )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==BREED_NAME_SUFFIX) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:396:11: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX44=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name992); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("BreedSuffix", (BREED_NAME_SUFFIX44!=null?BREED_NAME_SUFFIX44.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:1: ring_without_breed returns [JsonObject json] : ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) | (mSpecial= special_suffix ) );
	public final JsonObject ring_without_breed() throws RecognitionException {
		JsonObject json = null;


		JsonObject mJuniorRing =null;
		JsonObject mEmptyRing =null;
		JsonObject mRallyRing =null;
		JsonObject mNonConformationRing =null;
		JsonObject mSpecial =null;

		json = new JsonObject(); json.addProperty("RingType","Unassigned");JsonObject ring;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:400:91: ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) | (mSpecial= special_suffix ) )
			int alt29=5;
			switch ( input.LA(1) ) {
			case JUNIOR_CLASS:
				{
				alt29=1;
				}
				break;
			case BREED_COUNT:
				{
				alt29=2;
				}
				break;
			case NON_CONF_SECOND_LINE_COMMENT:
			case RALLY_CLASS:
				{
				alt29=3;
				}
				break;
			case NON_CONFORMATION_CLASS_NAME:
				{
				alt29=4;
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt29=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:2: (mJuniorRing= junior_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:2: (mJuniorRing= junior_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:401:3: mJuniorRing= junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_ring_without_breed1017);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mJuniorRing);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:2: (mEmptyRing= empty_breed_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:2: (mEmptyRing= empty_breed_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:3: mEmptyRing= empty_breed_ring
					{
					pushFollow(FOLLOW_empty_breed_ring_in_ring_without_breed1026);
					mEmptyRing=empty_breed_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mEmptyRing);json.addProperty("BreedName",mLastBreedName);}
					}

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:2: (mRallyRing= rally_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:2: (mRallyRing= rally_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:3: mRallyRing= rally_ring
					{
					pushFollow(FOLLOW_rally_ring_in_ring_without_breed1035);
					mRallyRing=rally_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mRallyRing);json.addProperty("RingType","Rally");if(!mRallyRing.has("RallyName"))json.addProperty("Skip",true);}
					}

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:2: (mNonConformationRing= non_conformation_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:2: (mNonConformationRing= non_conformation_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:3: mNonConformationRing= non_conformation_ring
					{
					pushFollow(FOLLOW_non_conformation_ring_in_ring_without_breed1044);
					mNonConformationRing=non_conformation_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mNonConformationRing);}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:2: (mSpecial= special_suffix )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:2: (mSpecial= special_suffix )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:3: mSpecial= special_suffix
					{
					pushFollow(FOLLOW_special_suffix_in_ring_without_breed1053);
					mSpecial=special_suffix();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json, mSpecial);json.addProperty("BreedName",mLastBreedName);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:417:1: rally_ring returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )? );
	public final JsonObject rally_ring() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		json = new JsonObject();String entries = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:418:53: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )? )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt32=1;
			}
			else if ( (LA32_0==RALLY_CLASS) ) {
				alt32=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:3: (rallyComment= rally_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:3: (rallyComment= rally_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:419:4: rallyComment= rally_comment
					{
					pushFollow(FOLLOW_rally_comment_in_rally_ring1081);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyComment", rallyComment);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:420:3: (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:420:3: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:420:5: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring1092);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:3: ( (line= rally_entry_line )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:4: (line= rally_entry_line )*
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:4: (line= rally_entry_line )*
					loop30:
					do {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==INT) ) {
							switch ( input.LA(2) ) {
							case BREED_NAME:
								{
								int LA30_4 = input.LA(3);
								if ( (LA30_4==HYPHEN) ) {
									int LA30_6 = input.LA(4);
									if ( (LA30_6==RALLY_ENTRY) ) {
										alt30=1;
									}

								}

								}
								break;
							case INT:
								{
								int LA30_5 = input.LA(3);
								if ( (LA30_5==BREED_NAME) ) {
									int LA30_4 = input.LA(4);
									if ( (LA30_4==HYPHEN) ) {
										int LA30_6 = input.LA(5);
										if ( (LA30_6==RALLY_ENTRY) ) {
											alt30=1;
										}

									}

								}

								}
								break;
							case RALLY_ENTRY:
							case RALLY_ENTRY_TITLE:
								{
								alt30=1;
								}
								break;
							}
						}
						else if ( ((LA30_0 >= RALLY_ENTRY && LA30_0 <= RALLY_ENTRY_TITLE)) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:5: line= rally_entry_line
							{
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring1102);
							line=rally_entry_line();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {entries+=line+"|";}
							}
							break;

						default :
							break loop30;
						}
					} while (true);

					}

					}

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:3: ( NON_CONF_SECOND_LINE_COMMENT )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==NON_CONF_SECOND_LINE_COMMENT) ) {
						int LA31_1 = input.LA(2);
						if ( (synpred76_test()) ) {
							alt31=1;
						}
					}
					switch (alt31) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:3: NON_CONF_SECOND_LINE_COMMENT
							{
							match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_ring1111); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:1: empty_breed_ring returns [JsonObject json] : ( BREED_COUNT ) ;
	public final JsonObject empty_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT45=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:33: ( ( BREED_COUNT ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:426:3: ( BREED_COUNT )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:426:3: ( BREED_COUNT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:426:4: BREED_COUNT
			{
			BREED_COUNT45=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_empty_breed_ring1133); if (state.failed) return json;
			if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT45!=null?BREED_COUNT45.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:428:1: non_conformation_breed_ring returns [JsonObject json] : BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) ;
	public final JsonObject non_conformation_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME46=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:428:55: ( BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:2: BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE )
			{
			BREED_NAME46=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_non_conformation_breed_ring1148); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("NonConformationBreed",(BREED_NAME46!=null?BREED_NAME46.getText():null));}
			match(input,COMMENT,FOLLOW_COMMENT_in_non_conformation_breed_ring1151); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:431:1: breed_ring returns [JsonObject json] : BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME47=null;
		Token BREED_NAME_SUFFIX48=null;
		Token BREED_COUNT49=null;

		json = new JsonObject();String breedName = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:432:55: ( BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:433:2: BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			BREED_NAME47=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring1174); if (state.failed) return json;
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME47!=null?BREED_NAME47.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:441:10: ( BREED_NAME_SUFFIX )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==BREED_NAME_SUFFIX) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:441:11: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX48=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring1178); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX48!=null?BREED_NAME_SUFFIX48.getText():null);}
					}
					break;

			}

			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:441:120: ( BREED_COUNT )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==BREED_COUNT) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:441:121: BREED_COUNT
					{
					BREED_COUNT49=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring1186); if (state.failed) return json;
					if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT49!=null?BREED_COUNT49.getText():null));}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:1: special_ring returns [JsonObject json] : ( BREED_NAME )? ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME50=null;
		Token SPECIAL_SUFFIX51=null;

		json = new JsonObject();String breedName= ""; String suffix="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:445:71: ( ( BREED_NAME )? ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:3: ( BREED_NAME )? ( SPECIAL_SUFFIX )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:3: ( BREED_NAME )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==BREED_NAME) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:4: BREED_NAME
					{
					BREED_NAME50=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring1211); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName+=(BREED_NAME50!=null?BREED_NAME50.getText():null);}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:47: ( SPECIAL_SUFFIX )+
			int cnt36=0;
			loop36:
			do {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==SPECIAL_SUFFIX) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:446:48: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX51=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring1217); if (state.failed) return json;
					if ( state.backtracking==0 ) {suffix+= " " + (SPECIAL_SUFFIX51!=null?SPECIAL_SUFFIX51.getText():null);}
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

			if ( state.backtracking==0 ) {
					//breedName+= (SPECIAL_SUFFIX51!=null?SPECIAL_SUFFIX51.getText():null);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:457:1: group_ring returns [String str] : ( ( GROUP_NAME GROUP ) | GROUP_RING ) HYPHEN ( JUDGE_NAME | COMMENT | PARENTHETICAL )+ ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_NAME52=null;
		Token GROUP53=null;
		Token GROUP_RING54=null;
		Token JUDGE_NAME55=null;
		Token COMMENT56=null;
		Token PARENTHETICAL57=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:2: ( ( ( GROUP_NAME GROUP ) | GROUP_RING ) HYPHEN ( JUDGE_NAME | COMMENT | PARENTHETICAL )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:5: ( ( GROUP_NAME GROUP ) | GROUP_RING ) HYPHEN ( JUDGE_NAME | COMMENT | PARENTHETICAL )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:5: ( ( GROUP_NAME GROUP ) | GROUP_RING )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==GROUP_NAME) ) {
				alt37=1;
			}
			else if ( (LA37_0==GROUP_RING) ) {
				alt37=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:6: ( GROUP_NAME GROUP )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:6: ( GROUP_NAME GROUP )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:7: GROUP_NAME GROUP
					{
					GROUP_NAME52=(Token)match(input,GROUP_NAME,FOLLOW_GROUP_NAME_in_group_ring1241); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_NAME52!=null?GROUP_NAME52.getText():null);}
					GROUP53=(Token)match(input,GROUP,FOLLOW_GROUP_in_group_ring1244); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + (GROUP53!=null?GROUP53.getText():null);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:73: GROUP_RING
					{
					GROUP_RING54=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring1248); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_RING54!=null?GROUP_RING54.getText():null);}
					}
					break;

			}

			match(input,HYPHEN,FOLLOW_HYPHEN_in_group_ring1252); if (state.failed) return str;
			if ( state.backtracking==0 ) {str+=" -";}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:127: ( JUDGE_NAME | COMMENT | PARENTHETICAL )+
			int cnt38=0;
			loop38:
			do {
				int alt38=4;
				switch ( input.LA(1) ) {
				case JUDGE_NAME:
					{
					alt38=1;
					}
					break;
				case COMMENT:
					{
					alt38=2;
					}
					break;
				case PARENTHETICAL:
					{
					alt38=3;
					}
					break;
				}
				switch (alt38) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:128: JUDGE_NAME
					{
					JUDGE_NAME55=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_group_ring1256); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + (JUDGE_NAME55!=null?JUDGE_NAME55.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:169: COMMENT
					{
					COMMENT56=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_group_ring1259); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + (COMMENT56!=null?COMMENT56.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:458:204: PARENTHETICAL
					{
					PARENTHETICAL57=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_group_ring1262); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+= " " + (PARENTHETICAL57!=null?PARENTHETICAL57.getText():null);}
					}
					break;

				default :
					if ( cnt38 >= 1 ) break loop38;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(38, input);
						throw eee;
				}
				cnt38++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:459:1: group_block returns [JsonObject json] : TIME ( GROUP_TYPE )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME58=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:2: ( TIME ( GROUP_TYPE )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:4: TIME ( GROUP_TYPE )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT
			{
			TIME58=(Token)match(input,TIME,FOLLOW_TIME_in_group_block1283); if (state.failed) return json;
			if ( state.backtracking==0 ) {currentBlockTime=(TIME58!=null?TIME58.getText():null);json.addProperty("BlockStart", currentBlockTime);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:88: ( GROUP_TYPE )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==GROUP_TYPE) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:88: GROUP_TYPE
					{
					match(input,GROUP_TYPE,FOLLOW_GROUP_TYPE_in_group_block1286); if (state.failed) return json;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:100: (mRing= group_ring )+
			int cnt40=0;
			loop40:
			do {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( ((LA40_0 >= GROUP_NAME && LA40_0 <= GROUP_RING)) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:101: mRing= group_ring
					{
					pushFollow(FOLLOW_group_ring_in_group_block1292);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {if(!mRelational){json = new JsonObject();json.addProperty("RingType","Group");String[] arr = parseGroupRing(mRing);json.addProperty("Group", arr[0]);json.addProperty("Judge",arr[1]);json.addProperty("BlockStart",currentBlockTime);mShowRings.add(json);}else{rings.add(new JsonPrimitive(mRing));}}
					}
					break;

				default :
					if ( cnt40 >= 1 ) break loop40;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(40, input);
						throw eee;
				}
				cnt40++;
			} while (true);

			if ( state.backtracking==0 ) {if(mRelational){json.add("Rings", rings);}}
			match(input,GROUP_ENDING_ANNOUNCEMENT,FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block1300); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:467:1: non_conformation_ring returns [JsonObject json] : NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )* ;
	public final JsonObject non_conformation_ring() throws RecognitionException {
		JsonObject json = null;


		Token NON_CONFORMATION_CLASS_NAME59=null;
		Token NON_CONFORMATION_SECOND_LINE60=null;

		json = new JsonObject(); json.addProperty("RingType", "Non-conformation"); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:469:2: ( NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:469:4: NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )*
			{
			NON_CONFORMATION_CLASS_NAME59=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring1324); if (state.failed) return json;
			if ( state.backtracking==0 ) {
							mCurrentClass=(NON_CONFORMATION_CLASS_NAME59!=null?NON_CONFORMATION_CLASS_NAME59.getText():null);
							json.addProperty("Class",mCurrentClass);
						}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:474:3: ( NON_CONFORMATION_SECOND_LINE )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==NON_CONFORMATION_SECOND_LINE) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:475:4: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE60=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring1339); if (state.failed) return json;
					if ( state.backtracking==0 ) {
										json.addProperty("Entrants",(NON_CONFORMATION_SECOND_LINE60!=null?NON_CONFORMATION_SECOND_LINE60.getText():null));
									}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:486:3: ( NON_CONF_SECOND_LINE_COMMENT )*
			loop42:
			do {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA42_2 = input.LA(2);
					if ( (synpred89_test()) ) {
						alt42=1;
					}

				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:486:4: NON_CONF_SECOND_LINE_COMMENT
					{
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring1360); if (state.failed) return json;
					}
					break;

				default :
					break loop42;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:489:1: rally_ring_block returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) );
	public final JsonObject rally_ring_block() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		String entries = ""; json = new JsonObject();json.addProperty("RingType","Rally"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){addCurrentJudge(json);json.addProperty("Number",mCurrentRingNumber);}
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:3: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt44=1;
			}
			else if ( (LA44_0==RALLY_CLASS) ) {
				alt44=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:5: (rallyComment= rally_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:5: (rallyComment= rally_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:6: rallyComment= rally_comment
					{
					pushFollow(FOLLOW_rally_comment_in_rally_ring_block1384);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("comment", rallyComment);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:80: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring_block1392);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:138: ( (line= rally_entry_line )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:139: (line= rally_entry_line )*
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:139: (line= rally_entry_line )*
					loop43:
					do {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==INT||(LA43_0 >= RALLY_ENTRY && LA43_0 <= RALLY_ENTRY_TITLE)) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:491:140: line= rally_entry_line
							{
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring_block1399);
							line=rally_entry_line();
							state._fsp--;
							if (state.failed) return json;
							if ( state.backtracking==0 ) {entries+=line+"|";}
							}
							break;

						default :
							break loop43;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:492:1: rally_ring_name returns [String str] : RALLY_CLASS ;
	public final String rally_ring_name() throws RecognitionException {
		String str = null;


		Token RALLY_CLASS61=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:493:2: ( RALLY_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:493:4: RALLY_CLASS
			{
			RALLY_CLASS61=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_ring_name1416); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(RALLY_CLASS61!=null?RALLY_CLASS61.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:496:1: rally_entry_line returns [String str] : ( (intOne= INT )? ( RALLY_ENTRY_TITLE )? (count= INT breed= BREED_NAME HYPHEN )? RALLY_ENTRY ) ;
	public final String rally_entry_line() throws RecognitionException {
		String str = null;


		Token intOne=null;
		Token count=null;
		Token breed=null;
		Token RALLY_ENTRY_TITLE62=null;
		Token HYPHEN63=null;
		Token RALLY_ENTRY64=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:497:16: ( ( (intOne= INT )? ( RALLY_ENTRY_TITLE )? (count= INT breed= BREED_NAME HYPHEN )? RALLY_ENTRY ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:498:3: ( (intOne= INT )? ( RALLY_ENTRY_TITLE )? (count= INT breed= BREED_NAME HYPHEN )? RALLY_ENTRY )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:498:3: ( (intOne= INT )? ( RALLY_ENTRY_TITLE )? (count= INT breed= BREED_NAME HYPHEN )? RALLY_ENTRY )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:498:4: (intOne= INT )? ( RALLY_ENTRY_TITLE )? (count= INT breed= BREED_NAME HYPHEN )? RALLY_ENTRY
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:498:4: (intOne= INT )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==INT) ) {
				int LA45_1 = input.LA(2);
				if ( (LA45_1==INT||(LA45_1 >= RALLY_ENTRY && LA45_1 <= RALLY_ENTRY_TITLE)) ) {
					alt45=1;
				}
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:498:5: intOne= INT
					{
					intOne=(Token)match(input,INT,FOLLOW_INT_in_rally_entry_line1441); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=intOne.getText();}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:498:42: ( RALLY_ENTRY_TITLE )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==RALLY_ENTRY_TITLE) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:498:43: RALLY_ENTRY_TITLE
					{
					RALLY_ENTRY_TITLE62=(Token)match(input,RALLY_ENTRY_TITLE,FOLLOW_RALLY_ENTRY_TITLE_in_rally_entry_line1447); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=(RALLY_ENTRY_TITLE62!=null?RALLY_ENTRY_TITLE62.getText():null);}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:498:94: (count= INT breed= BREED_NAME HYPHEN )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==INT) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:498:95: count= INT breed= BREED_NAME HYPHEN
					{
					count=(Token)match(input,INT,FOLLOW_INT_in_rally_entry_line1455); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" "+(count!=null?count.getText():null);}
					breed=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_rally_entry_line1460); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + breed.getText();}
					HYPHEN63=(Token)match(input,HYPHEN,FOLLOW_HYPHEN_in_rally_entry_line1463); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=(HYPHEN63!=null?HYPHEN63.getText():null); }
					}
					break;

			}

			RALLY_ENTRY64=(Token)match(input,RALLY_ENTRY,FOLLOW_RALLY_ENTRY_in_rally_entry_line1468); if (state.failed) return str;
			if ( state.backtracking==0 ) {str+=" "+(RALLY_ENTRY64!=null?RALLY_ENTRY64.getText():null);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:500:1: rally_comment returns [String str] : ( NON_CONF_SECOND_LINE_COMMENT )+ ;
	public final String rally_comment() throws RecognitionException {
		String str = null;


		Token NON_CONF_SECOND_LINE_COMMENT65=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:16: ( ( NON_CONF_SECOND_LINE_COMMENT )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			int cnt48=0;
			loop48:
			do {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA48_2 = input.LA(2);
					if ( (synpred95_test()) ) {
						alt48=1;
					}

				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:4: NON_CONF_SECOND_LINE_COMMENT
					{
					NON_CONF_SECOND_LINE_COMMENT65=(Token)match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1489); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" "+(NON_CONF_SECOND_LINE_COMMENT65!=null?NON_CONF_SECOND_LINE_COMMENT65.getText():null);}
					}
					break;

				default :
					if ( cnt48 >= 1 ) break loop48;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(48, input);
						throw eee;
				}
				cnt48++;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:509:1: junior_ring returns [JsonObject json] : JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token JUNIOR_CLASS66=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:510:33: ( JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:511:3: JUNIOR_CLASS
			{
			JUNIOR_CLASS66=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring1514); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("RingType","Junior");json.addProperty("ClassName", (JUNIOR_CLASS66!=null?JUNIOR_CLASS66.getText():null));if(isSpecialtyRing){if(mSpecialtyBreed!=null){json.addProperty("BreedName",latestBreed);}else if(mSpecialtyGroup!=null){json.addProperty("GroupName", mSpecialtyGroup);}}}
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



	// $ANTLR start "test"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:739:1: test : BREED_NAME ;
	public final void test() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:739:6: ( BREED_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:739:8: BREED_NAME
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_test3050); if (state.failed) return ;
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
	// $ANTLR end "test"

	// $ANTLR start synpred1_test
	public final void synpred1_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:5: (mComment= big_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:5: mComment= big_comment
		{
		pushFollow(FOLLOW_big_comment_in_synpred1_test63);
		mComment=big_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred1_test

	// $ANTLR start synpred2_test
	public final void synpred2_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:95: ( ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:217:96: ring
		{
		pushFollow(FOLLOW_ring_in_synpred2_test71);
		ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred2_test

	// $ANTLR start synpred7_test
	public final void synpred7_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:83: ( comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:234:83: comment
		{
		pushFollow(FOLLOW_comment_in_synpred7_test204);
		comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred7_test

	// $ANTLR start synpred11_test
	public final void synpred11_test_fragment() throws RecognitionException {
		JsonArray mBlock =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:186: ( (mBlock= inner_timeblock ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:186: (mBlock= inner_timeblock )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:186: (mBlock= inner_timeblock )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:238:187: mBlock= inner_timeblock
		{
		pushFollow(FOLLOW_inner_timeblock_in_synpred11_test263);
		mBlock=inner_timeblock();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred11_test

	// $ANTLR start synpred12_test
	public final void synpred12_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:6: ( JUDGE_NAME )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:6: JUDGE_NAME
		{
		match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_synpred12_test289); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred12_test

	// $ANTLR start synpred14_test
	public final void synpred14_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:4: ( COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:4: COMMENT
		{
		match(input,COMMENT,FOLLOW_COMMENT_in_synpred14_test298); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred14_test

	// $ANTLR start synpred15_test
	public final void synpred15_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:37: ( PARENTHETICAL )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:37: PARENTHETICAL
		{
		match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_synpred15_test301); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred15_test

	// $ANTLR start synpred16_test
	public final void synpred16_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:82: ( PARENTHETICAL_INT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:242:82: PARENTHETICAL_INT
		{
		match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_synpred16_test304); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred16_test

	// $ANTLR start synpred17_test
	public final void synpred17_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:8: (mComment= comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:8: mComment= comment
		{
		pushFollow(FOLLOW_comment_in_synpred17_test335);
		mComment=comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred17_test

	// $ANTLR start synpred18_test
	public final void synpred18_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:42: ( TIME )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:42: TIME
		{
		match(input,TIME,FOLLOW_TIME_in_synpred18_test338); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred18_test

	// $ANTLR start synpred19_test
	public final void synpred19_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:64: ( PHONE_NUMBER )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:64: PHONE_NUMBER
		{
		match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_synpred19_test341); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred19_test

	// $ANTLR start synpred20_test
	public final void synpred20_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:102: ( BREED_NAME )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:245:102: BREED_NAME
		{
		match(input,BREED_NAME,FOLLOW_BREED_NAME_in_synpred20_test344); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred20_test

	// $ANTLR start synpred57_test
	public final void synpred57_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:7: ({...}? =>mComment= timeblock_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:7: {...}? =>mComment= timeblock_comment
		{
		if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred57_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
		}
		pushFollow(FOLLOW_timeblock_comment_in_synpred57_test656);
		mComment=timeblock_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred57_test

	// $ANTLR start synpred58_test
	public final void synpred58_test_fragment() throws RecognitionException {
		JsonArray rings =null;
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:282:6: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:282:6: rings= inner_timeblock ({...}? =>mComment= timeblock_comment )*
		{
		pushFollow(FOLLOW_inner_timeblock_in_synpred58_test628);
		rings=inner_timeblock();
		state._fsp--;
		if (state.failed) return ;
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:293:6: ({...}? =>mComment= timeblock_comment )*
		loop51:
		do {
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==GROUP_NAME) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==CLUB_INDICATOR) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==HYPHEN) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==NON_CONFORMATION_CLASS_NAME) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==BREED_NAME) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==COMMENT) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==PARENTHETICAL) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==INT) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==ELLIPSIS) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==DATE) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==PHONE_NUMBER) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==SPECIAL_SUFFIX) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==NON_CONF_SECOND_LINE_COMMENT) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}
			else if ( (LA51_0==GROUP_RING) && ((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) {
				alt51=1;
			}

			switch (alt51) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:294:7: {...}? =>mComment= timeblock_comment
				{
				if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
					if (state.backtracking>0) {state.failed=true; return ;}
					throw new FailedPredicateException(input, "synpred58_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
				}
				pushFollow(FOLLOW_timeblock_comment_in_synpred58_test656);
				mComment=timeblock_comment();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				break loop51;
			}
		} while (true);

		}

	}
	// $ANTLR end synpred58_test

	// $ANTLR start synpred62_test
	public final void synpred62_test_fragment() throws RecognitionException {
		JsonObject mName =null;
		JsonObject nonGroupRing =null;
		JsonObject mRallyWalkthrough =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
		int alt54=2;
		int LA54_0 = input.LA(1);
		if ( (LA54_0==COMMENT||(LA54_0 >= INT && LA54_0 <= JUDGE_NAME)||(LA54_0 >= PARENTHETICAL && LA54_0 <= PARENTHETICAL_INT)) ) {
			alt54=1;
		}
		else if ( (LA54_0==RALLY_CLASS) ) {
			alt54=2;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return ;}
			NoViableAltException nvae =
				new NoViableAltException("", 54, 0, input);
			throw nvae;
		}
		switch (alt54) {
			case 1 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:5: (mName= judge_name )? nonGroupRing= non_group_ring
				{
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:5: (mName= judge_name )?
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==COMMENT||LA53_0==JUDGE_NAME||(LA53_0 >= PARENTHETICAL && LA53_0 <= PARENTHETICAL_INT)) ) {
					alt53=1;
				}
				switch (alt53) {
					case 1 :
						// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:325:6: mName= judge_name
						{
						pushFollow(FOLLOW_judge_name_in_synpred62_test771);
						mName=judge_name();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

				}

				pushFollow(FOLLOW_non_group_ring_in_synpred62_test783);
				nonGroupRing=non_group_ring();
				state._fsp--;
				if (state.failed) return ;
				}
				break;
			case 2 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:5: (mRallyWalkthrough= rally_walkthrough )
				{
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:5: (mRallyWalkthrough= rally_walkthrough )
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:335:6: mRallyWalkthrough= rally_walkthrough
				{
				pushFollow(FOLLOW_rally_walkthrough_in_synpred62_test800);
				mRallyWalkthrough=rally_walkthrough();
				state._fsp--;
				if (state.failed) return ;
				}

				}
				break;

		}

		}

	}
	// $ANTLR end synpred62_test

	// $ANTLR start synpred63_test
	public final void synpred63_test_fragment() throws RecognitionException {
		String rComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:5: ({...}? =>rComment= ring_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:347:5: {...}? =>rComment= ring_comment
		{
		if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred63_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
		}
		pushFollow(FOLLOW_ring_comment_in_synpred63_test830);
		rComment=ring_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred63_test

	// $ANTLR start synpred64_test
	public final void synpred64_test_fragment() throws RecognitionException {
		JsonObject suffix =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:3: (suffix= special_suffix )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:3: suffix= special_suffix
		{
		pushFollow(FOLLOW_special_suffix_in_synpred64_test889);
		suffix=special_suffix();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred64_test

	// $ANTLR start synpred65_test
	public final void synpred65_test_fragment() throws RecognitionException {
		JsonObject obedience =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:3: ( (obedience= obedience_with_breed ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:3: (obedience= obedience_with_breed )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:3: (obedience= obedience_with_breed )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:4: obedience= obedience_with_breed
		{
		pushFollow(FOLLOW_obedience_with_breed_in_synpred65_test898);
		obedience=obedience_with_breed();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred65_test

	// $ANTLR start synpred76_test
	public final void synpred76_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:3: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:3: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred76_test1111); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred76_test

	// $ANTLR start synpred89_test
	public final void synpred89_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:486:4: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:486:4: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred89_test1360); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred89_test

	// $ANTLR start synpred95_test
	public final void synpred95_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:4: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:502:4: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred95_test1489); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred95_test

	// Delegated rules

	public final boolean synpred65_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred65_test_fragment(); // can never throw exception
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
	public final boolean synpred62_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred62_test_fragment(); // can never throw exception
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
	public final boolean synpred89_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred89_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred95_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred95_test_fragment(); // can never throw exception
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
	public final boolean synpred57_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred57_test_fragment(); // can never throw exception
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
	public final boolean synpred19_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_test_fragment(); // can never throw exception
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
	public final boolean synpred76_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred76_test_fragment(); // can never throw exception
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
	public final boolean synpred63_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred63_test_fragment(); // can never throw exception
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
	public final boolean synpred1_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_test_fragment(); // can never throw exception
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
	public final boolean synpred17_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred64_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred64_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA6 dfa6 = new DFA6(this);
	protected DFA19 dfa19 = new DFA19(this);
	static final String DFA1_eotS =
		"\u00b8\uffff";
	static final String DFA1_eofS =
		"\u00b8\uffff";
	static final String DFA1_minS =
		"\4\4\1\uffff\3\4\1\0\1\4\1\uffff\11\4\4\0\1\4\12\0\1\4\34\0\2\4\4\0\1"+
		"\4\12\0\1\4\34\0\2\4\41\0\2\4\41\0\4\4";
	static final String DFA1_maxS =
		"\4\101\1\uffff\3\101\1\0\1\101\1\uffff\11\101\4\0\1\101\12\0\1\103\34"+
		"\0\2\101\4\0\1\101\12\0\1\103\34\0\2\101\41\0\2\101\41\0\4\101";
	static final String DFA1_acceptS =
		"\4\uffff\1\1\5\uffff\1\2\u00ad\uffff";
	static final String DFA1_specialS =
		"\10\uffff\1\22\13\uffff\1\115\1\143\1\153\1\u0089\1\uffff\1\55\1\177\1"+
		"\43\1\33\1\165\1\71\1\125\1\101\1\5\1\15\1\uffff\1\114\1\142\1\152\1\u0088"+
		"\1\54\1\176\1\42\1\32\1\164\1\70\1\124\1\100\1\6\1\16\1\116\1\144\1\154"+
		"\1\u008a\1\56\1\u0080\1\44\1\34\1\166\1\72\1\126\1\102\1\7\1\17\2\uffff"+
		"\1\117\1\145\1\155\1\u008b\1\uffff\1\57\1\u0081\1\45\1\35\1\167\1\73\1"+
		"\127\1\103\1\10\1\20\1\uffff\1\120\1\146\1\156\1\u008c\1\60\1\u0082\1"+
		"\46\1\36\1\170\1\74\1\130\1\104\1\11\1\21\1\113\1\141\1\151\1\u0087\1"+
		"\53\1\175\1\41\1\31\1\163\1\67\1\123\1\77\1\4\1\14\2\uffff\1\112\1\150"+
		"\1\u0086\1\140\1\52\1\174\1\40\1\30\1\162\1\66\1\122\1\76\1\3\1\13\1\u0096"+
		"\1\134\1\24\1\u0084\1\u0094\1\u008e\1\172\1\u0092\1\160\1\u0091\1\136"+
		"\1\132\1\110\1\106\1\62\1\1\1\64\1\26\1\50\2\uffff\1\111\1\147\1\u0085"+
		"\1\137\1\51\1\173\1\37\1\27\1\161\1\65\1\121\1\75\1\2\1\12\1\u0095\1\133"+
		"\1\23\1\u0083\1\u0093\1\u008d\1\171\1\u0090\1\157\1\u008f\1\135\1\131"+
		"\1\107\1\105\1\61\1\0\1\63\1\25\1\47\4\uffff}>";
	static final String[] DFA1_transitionS = {
			"\2\4\1\uffff\1\4\1\uffff\1\1\3\4\33\uffff\1\3\1\uffff\2\4\1\uffff\2\4"+
			"\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\1\2\1\4\1\uffff"+
			"\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\uffff\1\5\1"+
			"\4\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\uffff\1\4\1"+
			"\6\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\uffff\2\4\3"+
			"\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\1\7\1\4\1\uffff"+
			"\1\4",
			"",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\uffff\1\4\1"+
			"\10\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\13\2\4\33\uffff\1\4\1\uffff\2\4\1\uffff"+
			"\2\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\14\1\15\1\uffff\1\4\3\uffff"+
			"\2\4\1\uffff\1\11",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\17\2\4\33\uffff\1\4\1\uffff\2\4\1\uffff"+
			"\2\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\20\1\21\1\uffff\1\4\3\uffff"+
			"\2\4\1\uffff\1\16",
			"\1\uffff",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\1\22\1\23\1\12\2\4"+
			"\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"",
			"\2\4\1\uffff\1\35\1\uffff\1\32\1\26\1\37\1\36\33\uffff\1\43\1\uffff"+
			"\1\31\1\42\1\12\1\33\1\24\1\12\2\uffff\1\34\2\uffff\1\4\1\12\1\27\1\30"+
			"\1\uffff\1\40\1\12\2\uffff\1\4\1\41\1\12\1\25",
			"\2\4\1\uffff\1\54\1\uffff\1\51\1\46\1\56\1\55\33\uffff\1\43\1\uffff"+
			"\1\50\1\61\1\12\1\52\1\44\1\12\2\uffff\1\53\2\uffff\1\4\1\12\1\47\1\30"+
			"\1\uffff\1\57\1\12\2\uffff\1\4\1\60\1\12\1\45",
			"\2\4\1\uffff\1\72\1\uffff\1\67\1\64\1\74\1\73\33\uffff\1\43\1\uffff"+
			"\1\66\1\77\1\12\1\70\1\62\1\12\2\uffff\1\71\2\uffff\1\4\1\12\1\65\1\30"+
			"\1\uffff\1\75\1\12\2\uffff\1\4\1\76\1\12\1\63",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\1\100\1\101\1\12\2"+
			"\4\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\2\4\1\uffff\1\113\1\uffff\1\110\1\104\1\115\1\114\33\uffff\1\121\1"+
			"\uffff\1\107\1\120\1\12\1\111\1\102\1\12\2\uffff\1\112\2\uffff\1\4\1"+
			"\12\1\105\1\106\1\uffff\1\116\1\12\2\uffff\1\4\1\117\1\12\1\103",
			"\2\4\1\uffff\1\132\1\uffff\1\127\1\124\1\134\1\133\33\uffff\1\121\1"+
			"\uffff\1\126\1\137\1\12\1\130\1\122\1\12\2\uffff\1\131\2\uffff\1\4\1"+
			"\12\1\125\1\106\1\uffff\1\135\1\12\2\uffff\1\4\1\136\1\12\1\123",
			"\2\4\1\uffff\1\150\1\uffff\1\145\1\142\1\152\1\151\33\uffff\1\121\1"+
			"\uffff\1\144\1\155\1\12\1\146\1\140\1\12\2\uffff\1\147\2\uffff\1\4\1"+
			"\12\1\143\1\106\1\uffff\1\153\1\12\2\uffff\1\4\1\154\1\12\1\141",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\156\1\uffff\2\4\1\uffff\2\4"+
			"\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\uffff\1\157"+
			"\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\4\1\uffff\1\170\1\uffff\1\165\1\161\1\172\1\171\33\uffff\1\43\1\uffff"+
			"\1\164\1\175\1\12\1\166\1\160\1\12\2\uffff\1\167\2\uffff\1\4\1\12\1\162"+
			"\1\30\1\uffff\1\173\1\12\2\uffff\1\4\1\174\1\12\1\163",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0086\1\u0081\1\12\1\u0085\1\12\1\176\1\u0088\1\u008c\1\u008b\33"+
			"\12\1\177\1\12\1\u0083\1\u0090\1\12\1\u0084\1\u008a\3\12\1\u0082\2\12"+
			"\1\u008e\1\12\1\u0089\1\u0080\1\12\1\u008d\3\12\1\4\1\u008f\1\12\1\u0087"+
			"\2\12",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\u0091\1\uffff\2\4\1\uffff\2"+
			"\4\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\uffff\1\u0092"+
			"\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\4\1\uffff\1\u009b\1\uffff\1\u0098\1\u0094\1\u009d\1\u009c\33\uffff"+
			"\1\121\1\uffff\1\u0097\1\u00a0\1\12\1\u0099\1\u0093\1\12\2\uffff\1\u009a"+
			"\2\uffff\1\4\1\12\1\u0095\1\106\1\uffff\1\u009e\1\12\2\uffff\1\4\1\u009f"+
			"\1\12\1\u0096",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u00a9\1\u00a4\1\12\1\u00a8\1\12\1\u00a1\1\u00ab\1\u00af\1\u00ae\33"+
			"\12\1\u00a2\1\12\1\u00a6\1\u00b3\1\12\1\u00a7\1\u00ad\3\12\1\u00a5\2"+
			"\12\1\u00b1\1\12\1\u00ac\1\u00a3\1\12\1\u00b0\3\12\1\4\1\u00b2\1\12\1"+
			"\u00aa\2\12",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\uffff\1\157"+
			"\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\u00b4\2\4\33\uffff\1\4\1\uffff\2\4\1"+
			"\uffff\2\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\u00b5\1\4\1\uffff\1"+
			"\4\3\uffff\2\4\1\uffff\1\4",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\uffff\1\u0092"+
			"\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\u00b6\2\4\33\uffff\1\4\1\uffff\2\4\1"+
			"\uffff\2\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\u00b7\1\4\1\uffff\1"+
			"\4\3\uffff\2\4\1\uffff\1\4",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\u00b4\2\4\33\uffff\1\4\1\12\1\22\1\23"+
			"\1\uffff\2\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\u00b5\1\4\1\uffff"+
			"\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\u00b4\2\4\33\uffff\1\4\1\12\1\22\1\23"+
			"\1\uffff\2\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\u00b5\1\4\1\uffff"+
			"\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\u00b6\2\4\33\uffff\1\4\1\12\1\100\1\101"+
			"\1\uffff\2\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\u00b7\1\4\1\uffff"+
			"\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\u00b6\2\4\33\uffff\1\4\1\12\1\100\1\101"+
			"\1\uffff\2\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\u00b7\1\4\1\uffff"+
			"\1\4\3\uffff\2\4\1\uffff\1\4"
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 217:4: (mComment= big_comment )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA1_176 = input.LA(1);
						 
						int index1_176 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_176);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA1_141 = input.LA(1);
						 
						int index1_141 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_141);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA1_159 = input.LA(1);
						 
						int index1_159 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_159);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA1_124 = input.LA(1);
						 
						int index1_124 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_124);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA1_108 = input.LA(1);
						 
						int index1_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_108);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA1_33 = input.LA(1);
						 
						int index1_33 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_33);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA1_48 = input.LA(1);
						 
						int index1_48 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_48);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA1_62 = input.LA(1);
						 
						int index1_62 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_62);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA1_79 = input.LA(1);
						 
						int index1_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_79);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA1_94 = input.LA(1);
						 
						int index1_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_94);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA1_160 = input.LA(1);
						 
						int index1_160 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_160);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA1_125 = input.LA(1);
						 
						int index1_125 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_125);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA1_109 = input.LA(1);
						 
						int index1_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_109);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA1_34 = input.LA(1);
						 
						int index1_34 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_34);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA1_49 = input.LA(1);
						 
						int index1_49 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_49);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA1_63 = input.LA(1);
						 
						int index1_63 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_63);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA1_80 = input.LA(1);
						 
						int index1_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_80);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA1_95 = input.LA(1);
						 
						int index1_95 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_95);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA1_8 = input.LA(1);
						 
						int index1_8 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING")))&&(!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING"))))&&synpred1_test())) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_8);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA1_163 = input.LA(1);
						 
						int index1_163 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_163);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA1_128 = input.LA(1);
						 
						int index1_128 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_128);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA1_178 = input.LA(1);
						 
						int index1_178 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_178);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA1_143 = input.LA(1);
						 
						int index1_143 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_143);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA1_154 = input.LA(1);
						 
						int index1_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_154);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA1_119 = input.LA(1);
						 
						int index1_119 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_119);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA1_103 = input.LA(1);
						 
						int index1_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_103);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA1_43 = input.LA(1);
						 
						int index1_43 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_43);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA1_28 = input.LA(1);
						 
						int index1_28 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_28);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA1_57 = input.LA(1);
						 
						int index1_57 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_57);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA1_74 = input.LA(1);
						 
						int index1_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_74);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA1_89 = input.LA(1);
						 
						int index1_89 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_89);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA1_153 = input.LA(1);
						 
						int index1_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_153);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA1_118 = input.LA(1);
						 
						int index1_118 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_118);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA1_102 = input.LA(1);
						 
						int index1_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_102);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA1_42 = input.LA(1);
						 
						int index1_42 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_42);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA1_27 = input.LA(1);
						 
						int index1_27 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_27);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA1_56 = input.LA(1);
						 
						int index1_56 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_56);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA1_73 = input.LA(1);
						 
						int index1_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_73);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA1_88 = input.LA(1);
						 
						int index1_88 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_88);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA1_179 = input.LA(1);
						 
						int index1_179 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_179);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA1_144 = input.LA(1);
						 
						int index1_144 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_144);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA1_151 = input.LA(1);
						 
						int index1_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_151);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA1_116 = input.LA(1);
						 
						int index1_116 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_116);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA1_100 = input.LA(1);
						 
						int index1_100 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_100);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA1_40 = input.LA(1);
						 
						int index1_40 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_40);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA1_25 = input.LA(1);
						 
						int index1_25 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_25);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA1_54 = input.LA(1);
						 
						int index1_54 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_54);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA1_71 = input.LA(1);
						 
						int index1_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_71);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA1_86 = input.LA(1);
						 
						int index1_86 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_86);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA1_175 = input.LA(1);
						 
						int index1_175 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_175);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA1_140 = input.LA(1);
						 
						int index1_140 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_140);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA1_177 = input.LA(1);
						 
						int index1_177 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_177);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA1_142 = input.LA(1);
						 
						int index1_142 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_142);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA1_156 = input.LA(1);
						 
						int index1_156 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_156);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA1_121 = input.LA(1);
						 
						int index1_121 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_121);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA1_105 = input.LA(1);
						 
						int index1_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_105);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA1_45 = input.LA(1);
						 
						int index1_45 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_45);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA1_30 = input.LA(1);
						 
						int index1_30 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_30);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA1_59 = input.LA(1);
						 
						int index1_59 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_59);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA1_76 = input.LA(1);
						 
						int index1_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_76);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA1_91 = input.LA(1);
						 
						int index1_91 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_91);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA1_158 = input.LA(1);
						 
						int index1_158 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_158);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA1_123 = input.LA(1);
						 
						int index1_123 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_123);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA1_107 = input.LA(1);
						 
						int index1_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_107);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA1_47 = input.LA(1);
						 
						int index1_47 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_47);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA1_32 = input.LA(1);
						 
						int index1_32 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_32);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA1_61 = input.LA(1);
						 
						int index1_61 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_61);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA1_78 = input.LA(1);
						 
						int index1_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_78);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA1_93 = input.LA(1);
						 
						int index1_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_93);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA1_174 = input.LA(1);
						 
						int index1_174 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_174);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA1_139 = input.LA(1);
						 
						int index1_139 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_139);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA1_173 = input.LA(1);
						 
						int index1_173 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_173);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA1_138 = input.LA(1);
						 
						int index1_138 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_138);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA1_147 = input.LA(1);
						 
						int index1_147 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_147);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA1_112 = input.LA(1);
						 
						int index1_112 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_112);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA1_96 = input.LA(1);
						 
						int index1_96 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_96);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA1_36 = input.LA(1);
						 
						int index1_36 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_36);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA1_20 = input.LA(1);
						 
						int index1_20 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_20);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA1_50 = input.LA(1);
						 
						int index1_50 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_50);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA1_66 = input.LA(1);
						 
						int index1_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_66);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA1_82 = input.LA(1);
						 
						int index1_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_82);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA1_157 = input.LA(1);
						 
						int index1_157 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_157);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA1_122 = input.LA(1);
						 
						int index1_122 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_122);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA1_106 = input.LA(1);
						 
						int index1_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_106);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA1_46 = input.LA(1);
						 
						int index1_46 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_46);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA1_31 = input.LA(1);
						 
						int index1_31 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_31);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA1_60 = input.LA(1);
						 
						int index1_60 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_60);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA1_77 = input.LA(1);
						 
						int index1_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_77);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA1_92 = input.LA(1);
						 
						int index1_92 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_92);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA1_172 = input.LA(1);
						 
						int index1_172 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_172);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA1_137 = input.LA(1);
						 
						int index1_137 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_137);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA1_162 = input.LA(1);
						 
						int index1_162 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_162);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA1_127 = input.LA(1);
						 
						int index1_127 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_127);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA1_171 = input.LA(1);
						 
						int index1_171 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_171);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA1_136 = input.LA(1);
						 
						int index1_136 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_136);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA1_150 = input.LA(1);
						 
						int index1_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_150);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA1_115 = input.LA(1);
						 
						int index1_115 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_115);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA1_97 = input.LA(1);
						 
						int index1_97 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_97);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA1_37 = input.LA(1);
						 
						int index1_37 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_37);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA1_21 = input.LA(1);
						 
						int index1_21 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_21);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA1_51 = input.LA(1);
						 
						int index1_51 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_51);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA1_67 = input.LA(1);
						 
						int index1_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_67);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA1_83 = input.LA(1);
						 
						int index1_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_83);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA1_148 = input.LA(1);
						 
						int index1_148 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_148);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA1_113 = input.LA(1);
						 
						int index1_113 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_113);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA1_98 = input.LA(1);
						 
						int index1_98 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_98);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA1_38 = input.LA(1);
						 
						int index1_38 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_38);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA1_22 = input.LA(1);
						 
						int index1_22 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_22);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA1_52 = input.LA(1);
						 
						int index1_52 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_52);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA1_68 = input.LA(1);
						 
						int index1_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_68);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA1_84 = input.LA(1);
						 
						int index1_84 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_84);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA1_169 = input.LA(1);
						 
						int index1_169 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_169);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA1_134 = input.LA(1);
						 
						int index1_134 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_134);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA1_155 = input.LA(1);
						 
						int index1_155 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_155);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA1_120 = input.LA(1);
						 
						int index1_120 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_120);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA1_104 = input.LA(1);
						 
						int index1_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_104);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA1_44 = input.LA(1);
						 
						int index1_44 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_44);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA1_29 = input.LA(1);
						 
						int index1_29 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_29);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA1_58 = input.LA(1);
						 
						int index1_58 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_58);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA1_75 = input.LA(1);
						 
						int index1_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_75);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA1_90 = input.LA(1);
						 
						int index1_90 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_90);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA1_167 = input.LA(1);
						 
						int index1_167 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_167);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA1_132 = input.LA(1);
						 
						int index1_132 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_132);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA1_152 = input.LA(1);
						 
						int index1_152 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_152);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA1_117 = input.LA(1);
						 
						int index1_117 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_117);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA1_101 = input.LA(1);
						 
						int index1_101 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_101);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA1_41 = input.LA(1);
						 
						int index1_41 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_41);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA1_26 = input.LA(1);
						 
						int index1_26 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_26);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA1_55 = input.LA(1);
						 
						int index1_55 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_55);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA1_72 = input.LA(1);
						 
						int index1_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_72);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA1_87 = input.LA(1);
						 
						int index1_87 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_87);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA1_164 = input.LA(1);
						 
						int index1_164 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_164);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA1_129 = input.LA(1);
						 
						int index1_129 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_129);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA1_149 = input.LA(1);
						 
						int index1_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_149);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA1_114 = input.LA(1);
						 
						int index1_114 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_114);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA1_99 = input.LA(1);
						 
						int index1_99 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_99);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA1_39 = input.LA(1);
						 
						int index1_39 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_39);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA1_23 = input.LA(1);
						 
						int index1_23 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_23);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA1_53 = input.LA(1);
						 
						int index1_53 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_53);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA1_69 = input.LA(1);
						 
						int index1_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_69);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA1_85 = input.LA(1);
						 
						int index1_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_85);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA1_166 = input.LA(1);
						 
						int index1_166 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_166);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA1_131 = input.LA(1);
						 
						int index1_131 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_131);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA1_170 = input.LA(1);
						 
						int index1_170 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_170);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA1_168 = input.LA(1);
						 
						int index1_168 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_168);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA1_135 = input.LA(1);
						 
						int index1_135 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_135);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA1_133 = input.LA(1);
						 
						int index1_133 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_133);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA1_165 = input.LA(1);
						 
						int index1_165 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_165);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA1_130 = input.LA(1);
						 
						int index1_130 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_130);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA1_161 = input.LA(1);
						 
						int index1_161 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_161);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA1_126 = input.LA(1);
						 
						int index1_126 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_126);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 1, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA6_eotS =
		"\u00a2\uffff";
	static final String DFA6_eofS =
		"\1\1\1\uffff\3\5\1\uffff\3\5\1\uffff\11\5\4\uffff\1\5\10\uffff\1\5\30"+
		"\uffff\1\5\4\uffff\1\5\10\uffff\1\5\30\uffff\1\5\35\uffff\1\5\35\uffff"+
		"\6\5";
	static final String DFA6_minS =
		"\1\4\1\uffff\3\4\1\uffff\3\4\1\0\11\4\4\0\1\4\10\0\1\4\30\0\1\4\4\0\1"+
		"\4\10\0\1\4\30\0\1\4\35\0\1\4\35\0\6\4";
	static final String DFA6_maxS =
		"\1\101\1\uffff\3\101\1\uffff\3\101\1\0\11\101\4\0\1\101\10\0\1\103\30"+
		"\0\1\101\4\0\1\101\10\0\1\103\30\0\1\101\35\0\1\101\35\0\6\101";
	static final String DFA6_acceptS =
		"\1\uffff\1\2\3\uffff\1\1\u009c\uffff";
	static final String DFA6_specialS =
		"\11\uffff\1\32\11\uffff\1\75\1\14\1\175\1\42\1\uffff\1\132\1\104\1\114"+
		"\1\156\1\62\1\52\1\23\1\3\1\uffff\1\74\1\13\1\174\1\41\1\131\1\103\1\113"+
		"\1\155\1\61\1\51\1\22\1\2\1\73\1\12\1\173\1\43\1\133\1\105\1\115\1\157"+
		"\1\63\1\53\1\24\1\4\1\uffff\1\76\1\15\1\176\1\44\1\uffff\1\134\1\106\1"+
		"\116\1\160\1\64\1\54\1\25\1\5\1\uffff\1\77\1\16\1\177\1\45\1\135\1\107"+
		"\1\117\1\161\1\65\1\55\1\26\1\6\1\100\1\17\1\u0080\1\46\1\136\1\110\1"+
		"\120\1\162\1\66\1\56\1\27\1\7\1\uffff\1\72\1\172\1\40\1\11\1\130\1\102"+
		"\1\112\1\154\1\60\1\50\1\21\1\1\1\122\1\140\1\34\1\36\1\70\1\126\1\31"+
		"\1\124\1\142\1\146\1\144\1\150\1\152\1\166\1\164\1\170\1\u0082\1\uffff"+
		"\1\71\1\171\1\37\1\10\1\127\1\101\1\111\1\153\1\57\1\47\1\20\1\0\1\121"+
		"\1\137\1\33\1\35\1\67\1\125\1\30\1\123\1\141\1\145\1\143\1\147\1\151\1"+
		"\165\1\163\1\167\1\u0081\6\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\5\1\uffff\1\5\1\uffff\1\2\3\5\33\uffff\1\4\1\uffff\1\5\2\uffff\2\5"+
			"\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\3\2\uffff"+
			"\1\5",
			"",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\2\uffff\1\6\1"+
			"\5\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\2\uffff\1\5\1"+
			"\7\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\2\uffff\2\5\3"+
			"\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\10\2\uffff\1"+
			"\5",
			"",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\2\uffff\1\5\1"+
			"\11\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\13\2\5\33\uffff\1\5\1\uffff\1\5\2\uffff"+
			"\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\14\1\15\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\12",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\17\2\5\33\uffff\1\5\1\uffff\1\5\2\uffff"+
			"\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\20\1\21\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\16",
			"\1\uffff",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\22\2\1\2\5\3\uffff"+
			"\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff\1\5",
			"\2\5\1\uffff\1\34\1\uffff\1\31\1\25\1\36\1\35\33\uffff\1\40\1\uffff"+
			"\1\30\2\1\1\32\1\23\1\1\2\uffff\1\33\2\uffff\1\5\1\1\1\26\1\27\1\uffff"+
			"\1\37\1\1\2\uffff\1\5\2\1\1\24",
			"\2\5\1\uffff\1\51\1\uffff\1\46\1\43\1\53\1\52\33\uffff\1\40\1\uffff"+
			"\1\45\2\1\1\47\1\41\1\1\2\uffff\1\50\2\uffff\1\5\1\1\1\44\1\27\1\uffff"+
			"\1\54\1\1\2\uffff\1\5\2\1\1\42",
			"\2\5\1\uffff\1\65\1\uffff\1\62\1\57\1\67\1\66\33\uffff\1\40\1\uffff"+
			"\1\61\2\1\1\63\1\55\1\1\2\uffff\1\64\2\uffff\1\5\1\1\1\60\1\27\1\uffff"+
			"\1\70\1\1\2\uffff\1\5\2\1\1\56",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\71\2\1\2\5\3\uffff"+
			"\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff\1\5",
			"\2\5\1\uffff\1\103\1\uffff\1\100\1\74\1\105\1\104\33\uffff\1\107\1\uffff"+
			"\1\77\2\1\1\101\1\72\1\1\2\uffff\1\102\2\uffff\1\5\1\1\1\75\1\76\1\uffff"+
			"\1\106\1\1\2\uffff\1\5\2\1\1\73",
			"\2\5\1\uffff\1\120\1\uffff\1\115\1\112\1\122\1\121\33\uffff\1\107\1"+
			"\uffff\1\114\2\1\1\116\1\110\1\1\2\uffff\1\117\2\uffff\1\5\1\1\1\113"+
			"\1\76\1\uffff\1\123\1\1\2\uffff\1\5\2\1\1\111",
			"\2\5\1\uffff\1\134\1\uffff\1\131\1\126\1\136\1\135\33\uffff\1\107\1"+
			"\uffff\1\130\2\1\1\132\1\124\1\1\2\uffff\1\133\2\uffff\1\5\1\1\1\127"+
			"\1\76\1\uffff\1\137\1\1\2\uffff\1\5\2\1\1\125",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\140\1\uffff\1\5\2\uffff\2\5"+
			"\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\5\1\uffff\1\151\1\uffff\1\146\1\142\1\153\1\152\33\uffff\1\40\1\uffff"+
			"\1\145\2\1\1\147\1\141\1\1\2\uffff\1\150\2\uffff\1\5\1\1\1\143\1\27\1"+
			"\uffff\1\154\1\1\2\uffff\1\5\2\1\1\144",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\165\1\160\1\1\1\164\1\1\1\155\1\167\1\173\1\172\33\1\1\156\1\1\1"+
			"\162\2\1\1\163\1\171\3\1\1\161\2\1\1\175\1\1\1\170\1\157\1\1\1\174\3"+
			"\1\1\5\2\1\1\166\2\1",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\176\1\uffff\1\5\2\uffff\2\5"+
			"\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\5\1\uffff\1\u0087\1\uffff\1\u0084\1\u0080\1\u0089\1\u0088\33\uffff"+
			"\1\107\1\uffff\1\u0083\2\1\1\u0085\1\177\1\1\2\uffff\1\u0086\2\uffff"+
			"\1\5\1\1\1\u0081\1\76\1\uffff\1\u008a\1\1\2\uffff\1\5\2\1\1\u0082",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0093\1\u008e\1\1\1\u0092\1\1\1\u008b\1\u0095\1\u0099\1\u0098\33"+
			"\1\1\u008c\1\1\1\u0090\2\1\1\u0091\1\u0097\3\1\1\u008f\2\1\1\u009b\1"+
			"\1\1\u0096\1\u008d\1\1\1\u009a\3\1\1\5\2\1\1\u0094\2\1",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\2\uffff\1\u009c"+
			"\1\5\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\2\uffff\1\u009d"+
			"\1\5\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\u009e\2\5\33\uffff\1\5\1\uffff\1\5\2"+
			"\uffff\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\u009f\1\5\1\uffff\1"+
			"\5\3\uffff\1\5\2\uffff\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\u00a0\2\5\33\uffff\1\5\1\uffff\1\5\2"+
			"\uffff\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\u00a1\1\5\1\uffff\1"+
			"\5\3\uffff\1\5\2\uffff\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\u009e\2\5\33\uffff\1\5\1\1\1\22\1\1\1"+
			"\uffff\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\u009f\1\5\1\uffff\1"+
			"\5\3\uffff\1\5\2\uffff\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\u009e\2\5\33\uffff\1\5\1\1\1\22\1\1\1"+
			"\uffff\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\u009f\1\5\1\uffff\1"+
			"\5\3\uffff\1\5\2\uffff\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\u00a0\2\5\33\uffff\1\5\1\1\1\71\1\1\1"+
			"\uffff\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\u00a1\1\5\1\uffff\1"+
			"\5\3\uffff\1\5\2\uffff\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\u00a0\2\5\33\uffff\1\5\1\1\1\71\1\1\1"+
			"\uffff\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\u00a1\1\5\1\uffff\1"+
			"\5\3\uffff\1\5\2\uffff\1\5"
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
			return "()* loopback of 234:82: ( comment )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_138 = input.LA(1);
						 
						int index6_138 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_138);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA6_108 = input.LA(1);
						 
						int index6_108 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_108);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA6_44 = input.LA(1);
						 
						int index6_44 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_44);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA6_31 = input.LA(1);
						 
						int index6_31 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_31);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA6_56 = input.LA(1);
						 
						int index6_56 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_56);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA6_70 = input.LA(1);
						 
						int index6_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_70);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA6_83 = input.LA(1);
						 
						int index6_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_83);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA6_95 = input.LA(1);
						 
						int index6_95 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_95);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA6_130 = input.LA(1);
						 
						int index6_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_130);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA6_100 = input.LA(1);
						 
						int index6_100 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_100);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA6_46 = input.LA(1);
						 
						int index6_46 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_46);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA6_34 = input.LA(1);
						 
						int index6_34 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_34);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA6_20 = input.LA(1);
						 
						int index6_20 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_20);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA6_59 = input.LA(1);
						 
						int index6_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_59);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA6_73 = input.LA(1);
						 
						int index6_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_73);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA6_85 = input.LA(1);
						 
						int index6_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_85);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA6_137 = input.LA(1);
						 
						int index6_137 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_137);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA6_107 = input.LA(1);
						 
						int index6_107 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_107);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA6_43 = input.LA(1);
						 
						int index6_43 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_43);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA6_30 = input.LA(1);
						 
						int index6_30 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_30);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA6_55 = input.LA(1);
						 
						int index6_55 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_55);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA6_69 = input.LA(1);
						 
						int index6_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_69);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA6_82 = input.LA(1);
						 
						int index6_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_82);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA6_94 = input.LA(1);
						 
						int index6_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_94);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA6_145 = input.LA(1);
						 
						int index6_145 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_145);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA6_115 = input.LA(1);
						 
						int index6_115 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_115);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA6_9 = input.LA(1);
						 
						int index6_9 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING")))&&(!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING"))))&&synpred7_test())) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_9);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA6_141 = input.LA(1);
						 
						int index6_141 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_141);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA6_111 = input.LA(1);
						 
						int index6_111 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_111);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA6_142 = input.LA(1);
						 
						int index6_142 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_142);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA6_112 = input.LA(1);
						 
						int index6_112 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_112);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA6_129 = input.LA(1);
						 
						int index6_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_129);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA6_99 = input.LA(1);
						 
						int index6_99 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_99);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA6_36 = input.LA(1);
						 
						int index6_36 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_36);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA6_22 = input.LA(1);
						 
						int index6_22 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_22);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA6_48 = input.LA(1);
						 
						int index6_48 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_48);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA6_61 = input.LA(1);
						 
						int index6_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_61);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA6_75 = input.LA(1);
						 
						int index6_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_75);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA6_87 = input.LA(1);
						 
						int index6_87 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_87);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA6_136 = input.LA(1);
						 
						int index6_136 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_136);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA6_106 = input.LA(1);
						 
						int index6_106 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_106);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA6_42 = input.LA(1);
						 
						int index6_42 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_42);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA6_29 = input.LA(1);
						 
						int index6_29 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_29);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA6_54 = input.LA(1);
						 
						int index6_54 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_54);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA6_68 = input.LA(1);
						 
						int index6_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_68);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA6_81 = input.LA(1);
						 
						int index6_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_81);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA6_93 = input.LA(1);
						 
						int index6_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_93);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA6_135 = input.LA(1);
						 
						int index6_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_135);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA6_105 = input.LA(1);
						 
						int index6_105 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_105);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA6_41 = input.LA(1);
						 
						int index6_41 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_41);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA6_28 = input.LA(1);
						 
						int index6_28 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_28);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA6_53 = input.LA(1);
						 
						int index6_53 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_53);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA6_67 = input.LA(1);
						 
						int index6_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_67);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA6_80 = input.LA(1);
						 
						int index6_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_80);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA6_92 = input.LA(1);
						 
						int index6_92 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_92);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA6_143 = input.LA(1);
						 
						int index6_143 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_143);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA6_113 = input.LA(1);
						 
						int index6_113 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_113);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA6_127 = input.LA(1);
						 
						int index6_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_127);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA6_97 = input.LA(1);
						 
						int index6_97 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_97);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA6_45 = input.LA(1);
						 
						int index6_45 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_45);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA6_33 = input.LA(1);
						 
						int index6_33 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_33);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA6_19 = input.LA(1);
						 
						int index6_19 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_19);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA6_58 = input.LA(1);
						 
						int index6_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_58);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA6_72 = input.LA(1);
						 
						int index6_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_72);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA6_84 = input.LA(1);
						 
						int index6_84 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_84);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA6_132 = input.LA(1);
						 
						int index6_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_132);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA6_102 = input.LA(1);
						 
						int index6_102 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_102);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA6_38 = input.LA(1);
						 
						int index6_38 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_38);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA6_25 = input.LA(1);
						 
						int index6_25 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_25);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA6_50 = input.LA(1);
						 
						int index6_50 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_50);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA6_64 = input.LA(1);
						 
						int index6_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_64);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA6_77 = input.LA(1);
						 
						int index6_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_77);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA6_89 = input.LA(1);
						 
						int index6_89 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_89);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA6_133 = input.LA(1);
						 
						int index6_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_133);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA6_103 = input.LA(1);
						 
						int index6_103 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_103);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA6_39 = input.LA(1);
						 
						int index6_39 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_39);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA6_26 = input.LA(1);
						 
						int index6_26 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_26);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA6_51 = input.LA(1);
						 
						int index6_51 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_51);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA6_65 = input.LA(1);
						 
						int index6_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_65);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA6_78 = input.LA(1);
						 
						int index6_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_78);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA6_90 = input.LA(1);
						 
						int index6_90 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_90);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA6_139 = input.LA(1);
						 
						int index6_139 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_139);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA6_109 = input.LA(1);
						 
						int index6_109 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_109);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA6_146 = input.LA(1);
						 
						int index6_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_146);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA6_116 = input.LA(1);
						 
						int index6_116 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_116);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA6_144 = input.LA(1);
						 
						int index6_144 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_144);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA6_114 = input.LA(1);
						 
						int index6_114 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_114);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA6_131 = input.LA(1);
						 
						int index6_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_131);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA6_101 = input.LA(1);
						 
						int index6_101 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_101);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA6_37 = input.LA(1);
						 
						int index6_37 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_37);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA6_24 = input.LA(1);
						 
						int index6_24 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_24);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA6_49 = input.LA(1);
						 
						int index6_49 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_49);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA6_63 = input.LA(1);
						 
						int index6_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_63);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA6_76 = input.LA(1);
						 
						int index6_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_76);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA6_88 = input.LA(1);
						 
						int index6_88 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_88);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA6_140 = input.LA(1);
						 
						int index6_140 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_140);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA6_110 = input.LA(1);
						 
						int index6_110 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_110);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA6_147 = input.LA(1);
						 
						int index6_147 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_147);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA6_117 = input.LA(1);
						 
						int index6_117 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_117);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA6_149 = input.LA(1);
						 
						int index6_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_149);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA6_119 = input.LA(1);
						 
						int index6_119 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_119);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA6_148 = input.LA(1);
						 
						int index6_148 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_148);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA6_118 = input.LA(1);
						 
						int index6_118 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_118);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA6_150 = input.LA(1);
						 
						int index6_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_150);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA6_120 = input.LA(1);
						 
						int index6_120 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_120);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA6_151 = input.LA(1);
						 
						int index6_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_151);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA6_121 = input.LA(1);
						 
						int index6_121 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_121);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA6_134 = input.LA(1);
						 
						int index6_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_134);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA6_104 = input.LA(1);
						 
						int index6_104 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_104);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA6_40 = input.LA(1);
						 
						int index6_40 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_40);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA6_27 = input.LA(1);
						 
						int index6_27 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_27);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA6_52 = input.LA(1);
						 
						int index6_52 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_52);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA6_66 = input.LA(1);
						 
						int index6_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_66);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA6_79 = input.LA(1);
						 
						int index6_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_79);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA6_91 = input.LA(1);
						 
						int index6_91 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_91);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA6_153 = input.LA(1);
						 
						int index6_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_153);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA6_123 = input.LA(1);
						 
						int index6_123 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_123);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA6_152 = input.LA(1);
						 
						int index6_152 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_152);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA6_122 = input.LA(1);
						 
						int index6_122 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_122);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA6_154 = input.LA(1);
						 
						int index6_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_154);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA6_124 = input.LA(1);
						 
						int index6_124 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_124);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA6_128 = input.LA(1);
						 
						int index6_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_128);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA6_98 = input.LA(1);
						 
						int index6_98 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_98);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA6_47 = input.LA(1);
						 
						int index6_47 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_47);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA6_35 = input.LA(1);
						 
						int index6_35 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_35);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA6_21 = input.LA(1);
						 
						int index6_21 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_21);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA6_60 = input.LA(1);
						 
						int index6_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_60);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA6_74 = input.LA(1);
						 
						int index6_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_74);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA6_86 = input.LA(1);
						 
						int index6_86 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_86);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA6_155 = input.LA(1);
						 
						int index6_155 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_155);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA6_125 = input.LA(1);
						 
						int index6_125 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_125);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 6, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA19_eotS =
		"\45\uffff";
	static final String DFA19_eofS =
		"\1\1\27\uffff\1\1\1\uffff\2\1\11\uffff";
	static final String DFA19_minS =
		"\1\7\1\uffff\1\0\1\4\1\7\2\0\1\7\16\0\1\uffff\1\0\1\4\4\7\10\0";
	static final String DFA19_maxS =
		"\1\101\1\uffff\1\0\1\103\1\101\2\0\1\101\16\0\1\uffff\1\0\5\101\10\0";
	static final String DFA19_acceptS =
		"\1\uffff\1\2\24\uffff\1\1\16\uffff";
	static final String DFA19_specialS =
		"\2\uffff\1\10\2\uffff\1\31\1\30\1\uffff\1\12\1\6\1\11\1\26\1\2\1\27\1"+
		"\22\1\4\1\23\1\5\1\25\1\21\1\17\1\13\1\uffff\1\0\5\uffff\1\7\1\16\1\3"+
		"\1\20\1\24\1\1\1\14\1\15}>";
	static final String[] DFA19_transitionS = {
			"\1\17\1\uffff\1\2\1\5\1\21\1\20\33\uffff\1\3\1\uffff\1\14\1\25\1\12\1"+
			"\15\1\10\1\4\2\uffff\1\16\3\uffff\1\24\1\6\1\7\1\uffff\1\22\1\11\2\uffff"+
			"\1\1\1\23\1\13\1\1",
			"",
			"\1\uffff",
			"\72\27\1\1\5\27",
			"\1\1\1\uffff\4\1\33\uffff\1\1\1\uffff\4\1\1\30\1\31\2\uffff\1\1\3\uffff"+
			"\3\1\1\uffff\2\1\3\uffff\3\1",
			"\1\uffff",
			"\1\uffff",
			"\1\1\1\uffff\1\1\1\32\2\1\33\uffff\1\1\1\uffff\4\1\1\30\1\1\2\uffff"+
			"\1\1\3\uffff\1\1\1\33\1\34\1\uffff\2\1\3\uffff\3\1",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\36\1\40\1\uffff\1\35\1\uffff\4\1\2\uffff\1\1\30\uffff\1\1\1\uffff"+
			"\6\1\1\37\1\uffff\1\43\3\uffff\1\41\2\1\1\uffff\1\1\1\42\2\uffff\1\1"+
			"\1\44\2\1",
			"\1\1\1\uffff\4\1\33\uffff\1\1\1\uffff\4\1\1\30\1\31\2\uffff\1\1\3\uffff"+
			"\3\1\1\uffff\2\1\3\uffff\3\1",
			"\1\1\1\uffff\1\1\1\32\2\1\33\uffff\1\1\1\uffff\4\1\1\30\1\1\2\uffff"+
			"\1\1\3\uffff\1\1\1\33\1\34\1\uffff\2\1\2\uffff\4\1",
			"\1\1\1\uffff\1\1\1\32\2\1\33\uffff\1\1\1\uffff\4\1\1\30\1\1\2\uffff"+
			"\1\1\3\uffff\1\1\1\33\1\34\1\uffff\2\1\2\uffff\4\1",
			"\1\1\1\uffff\1\1\1\32\2\1\33\uffff\1\1\1\uffff\4\1\1\30\1\1\2\uffff"+
			"\1\1\3\uffff\1\1\1\33\1\34\1\uffff\2\1\3\uffff\3\1",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 281:5: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA19_23 = input.LA(1);
						 
						int index19_23 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_23);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA19_34 = input.LA(1);
						 
						int index19_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_34);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA19_12 = input.LA(1);
						 
						int index19_12 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_12);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA19_31 = input.LA(1);
						 
						int index19_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_31);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA19_15 = input.LA(1);
						 
						int index19_15 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_15);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA19_17 = input.LA(1);
						 
						int index19_17 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_17);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA19_9 = input.LA(1);
						 
						int index19_9 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_9);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA19_29 = input.LA(1);
						 
						int index19_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_29);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA19_2 = input.LA(1);
						 
						int index19_2 = input.index();
						input.rewind();
						s = -1;
						if ( (((((!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING")))&&(!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING"))))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_2);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA19_10 = input.LA(1);
						 
						int index19_10 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_10);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA19_8 = input.LA(1);
						 
						int index19_8 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_8);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA19_21 = input.LA(1);
						 
						int index19_21 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_21);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA19_35 = input.LA(1);
						 
						int index19_35 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_35);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA19_36 = input.LA(1);
						 
						int index19_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_36);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA19_30 = input.LA(1);
						 
						int index19_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_30);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA19_20 = input.LA(1);
						 
						int index19_20 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_20);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA19_32 = input.LA(1);
						 
						int index19_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_32);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA19_19 = input.LA(1);
						 
						int index19_19 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_19);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA19_14 = input.LA(1);
						 
						int index19_14 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_14);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA19_16 = input.LA(1);
						 
						int index19_16 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_16);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA19_33 = input.LA(1);
						 
						int index19_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_33);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA19_18 = input.LA(1);
						 
						int index19_18 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_18);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA19_11 = input.LA(1);
						 
						int index19_11 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_11);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA19_13 = input.LA(1);
						 
						int index19_13 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred58_test())) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_13);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA19_6 = input.LA(1);
						 
						int index19_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_6);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA19_5 = input.LA(1);
						 
						int index19_5 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred58_test()) ) {s = 22;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_5);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 19, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_big_comment_in_start63 = new BitSet(new long[]{0xC5A46D0000001EB0L,0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_start76 = new BitSet(new long[]{0x4000010000000200L});
	public static final BitSet FOLLOW_EOF_in_start83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_header_in_ring108 = new BitSet(new long[]{0x4000010000000000L});
	public static final BitSet FOLLOW_ring_title_in_ring115 = new BitSet(new long[]{0x0180800000000400L,0x0000000000000002L});
	public static final BitSet FOLLOW_inner_ring_in_ring120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_in_ring_title132 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_INT_in_ring_title135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_ring_title142 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RING_in_ring_title144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLUB_INDICATOR_in_special_ring_header167 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_HYPHEN_in_special_ring_header170 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_INT_in_special_ring_header172 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMENT_in_special_ring_header174 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_group_block_in_inner_ring200 = new BitSet(new long[]{0x45A4650000001EB2L,0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_inner_ring204 = new BitSet(new long[]{0x45A4650000001EB2L,0x0000000000000002L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring219 = new BitSet(new long[]{0x0180800000000402L});
	public static final BitSet FOLLOW_judge_name_in_judge_block249 = new BitSet(new long[]{0x8DC4FD0000001E80L,0x0000000000000003L});
	public static final BitSet FOLLOW_timeblock_in_judge_block256 = new BitSet(new long[]{0x8DC4FD0000001E82L,0x0000000000000003L});
	public static final BitSet FOLLOW_inner_timeblock_in_judge_block263 = new BitSet(new long[]{0x8DC4FD0000001E82L,0x0000000000000003L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_name289 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_COMMENT_in_judge_name298 = new BitSet(new long[]{0x0180000000000402L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_judge_name301 = new BitSet(new long[]{0x0180000000000402L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_judge_name304 = new BitSet(new long[]{0x0180000000000402L});
	public static final BitSet FOLLOW_comment_in_big_comment335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_big_comment341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_header_comment_in_comment376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_ring_title_comment_in_comment378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_comment380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_comment382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_comment387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_NAME_in_comment389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HYPHEN_in_comment392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_comment394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_CLASSIFIER_in_comment397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_comment400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_comment406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLUB_INDICATOR_in_non_header_comment434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_in_non_ring_title_comment443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_NAME_in_timeblock_comment463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_header_comment_in_timeblock_comment466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HYPHEN_in_timeblock_comment468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_timeblock_comment473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_timeblock_comment476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_timeblock_comment479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock_comment482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_timeblock_comment485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_timeblock_comment488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_timeblock_comment491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_timeblock_comment496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_timeblock_comment498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_TYPE_in_ring_comment520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_ring_comment528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_ring_comment533 = new BitSet(new long[]{0xBFFFFFFFFFFFFFF0L,0x000000000000000FL});
	public static final BitSet FOLLOW_set_in_ring_comment536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock570 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_FOLLOWING_TIME_in_timeblock580 = new BitSet(new long[]{0x8DC4FD0000001E82L,0x0000000000000001L});
	public static final BitSet FOLLOW_TIME_in_timeblock597 = new BitSet(new long[]{0x8DC4FD0000001E82L,0x0000000000000001L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock628 = new BitSet(new long[]{0x8DC4FD0000001E82L,0x0000000000000001L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock656 = new BitSet(new long[]{0x8DC4FD0000001E82L,0x0000000000000001L});
	public static final BitSet FOLLOW_INT_in_non_group_ring711 = new BitSet(new long[]{0x88450000000000B0L});
	public static final BitSet FOLLOW_ring_with_breed_in_non_group_ring721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_without_breed_in_non_group_ring730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_name_in_inner_timeblock771 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_non_group_ring_in_inner_timeblock783 = new BitSet(new long[]{0x8DC4FD0000001E82L,0x0000000000000001L});
	public static final BitSet FOLLOW_rally_walkthrough_in_inner_timeblock800 = new BitSet(new long[]{0x8DC4FD0000001E82L,0x0000000000000001L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock830 = new BitSet(new long[]{0x8DC4FD0000001E82L,0x0000000000000001L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_walkthrough859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_name_in_ring_with_breed878 = new BitSet(new long[]{0x8000200000000022L});
	public static final BitSet FOLLOW_special_suffix_in_ring_with_breed889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_ring_with_breed898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_ring_with_breed907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HYPHEN_in_obedience_with_breed928 = new BitSet(new long[]{0x0020400000000000L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_obedience_with_breed941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_suffix960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name980 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_BREED_CLASSIFIER_in_breed_name983 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_ring_without_breed1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_breed_ring_in_ring_without_breed1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_in_ring_without_breed1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_conformation_ring_in_ring_without_breed1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_suffix_in_ring_without_breed1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring1092 = new BitSet(new long[]{0x3040400000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring1102 = new BitSet(new long[]{0x3040400000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_ring1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_empty_breed_ring1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_non_conformation_breed_ring1148 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_non_conformation_breed_ring1151 = new BitSet(new long[]{0x0020400000000000L});
	public static final BitSet FOLLOW_set_in_non_conformation_breed_ring1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring1174 = new BitSet(new long[]{0x0000000000000122L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring1178 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring1211 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring1217 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_GROUP_NAME_in_group_ring1241 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_GROUP_in_group_ring1244 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring1248 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_HYPHEN_in_group_ring1252 = new BitSet(new long[]{0x0080800000000400L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_group_ring1256 = new BitSet(new long[]{0x0080800000000402L});
	public static final BitSet FOLLOW_COMMENT_in_group_ring1259 = new BitSet(new long[]{0x0080800000000402L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_group_ring1262 = new BitSet(new long[]{0x0080800000000402L});
	public static final BitSet FOLLOW_TIME_in_group_block1283 = new BitSet(new long[]{0x00001C0000000000L});
	public static final BitSet FOLLOW_GROUP_TYPE_in_group_block1286 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block1292 = new BitSet(new long[]{0x00000E0000000000L});
	public static final BitSet FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block1300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring1324 = new BitSet(new long[]{0x0060000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring1339 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring1360 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring_block1384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring_block1392 = new BitSet(new long[]{0x3000400000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring_block1399 = new BitSet(new long[]{0x3000400000000002L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_ring_name1416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_rally_entry_line1441 = new BitSet(new long[]{0x3000400000000000L});
	public static final BitSet FOLLOW_RALLY_ENTRY_TITLE_in_rally_entry_line1447 = new BitSet(new long[]{0x1000400000000000L});
	public static final BitSet FOLLOW_INT_in_rally_entry_line1455 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BREED_NAME_in_rally_entry_line1460 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_HYPHEN_in_rally_entry_line1463 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RALLY_ENTRY_in_rally_entry_line1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1489 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring1514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_test3050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_synpred1_test63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred2_test71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred7_test204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred11_test263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_synpred12_test289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_synpred14_test298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_synpred15_test301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_synpred16_test304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred17_test335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_synpred18_test338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_synpred19_test341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_synpred20_test344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred57_test656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred58_test628 = new BitSet(new long[]{0x84C46C0000001E82L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred58_test656 = new BitSet(new long[]{0x84C46C0000001E82L});
	public static final BitSet FOLLOW_judge_name_in_synpred62_test771 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_non_group_ring_in_synpred62_test783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_walkthrough_in_synpred62_test800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_synpred63_test830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_suffix_in_synpred64_test889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_synpred65_test898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred76_test1111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred89_test1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred95_test1489 = new BitSet(new long[]{0x0000000000000002L});
}
