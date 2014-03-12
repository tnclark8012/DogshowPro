// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2014-03-11 19:56:30

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREED_CLASSIFIER", "BREED_COUNT", "BREED_MISC", "BREED_NAME", "BREED_NAME_SUFFIX", "CLUB_INDICATOR", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", "END_WORD", "FOLLOWING_TIME", "FRAG_BEST_IN_SHOW", "FRAG_BREED_ATTRIBUTE", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", "FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP", "FRAG_MONTH", "FRAG_PROPER_NAME", "FRAG_RALLY_CLASS_NAME", "FRAG_RALLY_CLASS_SECTION", "FRAG_RALLY_ENTRANT_GROUP", "FRAG_RALLY_SINGLE_ENTRANT", "FRAG_RING", "FRAG_SEX", "FRAG_SPECIAL_GROUP_NAME", "FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", "FRAG_TO_FOLLOW", "FRAG_WEEK_DAY", "FallThrough", "GROUP", "GROUP_ENDING_ANNOUNCEMENT", "GROUP_NAME", "GROUP_RING", "HYPHEN", "INT", "JUDGE_NAME", "JUNIOR_CLASS", "NON_CONFORMATION_CLASS_LEVEL", "NON_CONFORMATION_CLASS_NAME", "NON_CONFORMATION_CLASS_SECTION", "NON_CONFORMATION_CLASS_SUFFIX", "NON_CONFORMATION_SECOND_LINE", "NON_CONF_SECOND_LINE_COMMENT", "PARENTHETICAL", "PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "RALLY_CLASS", "RALLY_ENTRY", "RALLY_ENTRY_TITLE", "RING", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", "WS"
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
	public static final int HYPHEN=44;
	public static final int INT=45;
	public static final int JUDGE_NAME=46;
	public static final int JUNIOR_CLASS=47;
	public static final int NON_CONFORMATION_CLASS_LEVEL=48;
	public static final int NON_CONFORMATION_CLASS_NAME=49;
	public static final int NON_CONFORMATION_CLASS_SECTION=50;
	public static final int NON_CONFORMATION_CLASS_SUFFIX=51;
	public static final int NON_CONFORMATION_SECOND_LINE=52;
	public static final int NON_CONF_SECOND_LINE_COMMENT=53;
	public static final int PARENTHETICAL=54;
	public static final int PARENTHETICAL_INT=55;
	public static final int PARENTHETICAL_NAME=56;
	public static final int PHONE_NUMBER=57;
	public static final int RALLY_CLASS=58;
	public static final int RALLY_ENTRY=59;
	public static final int RALLY_ENTRY_TITLE=60;
	public static final int RING=61;
	public static final int SPECIAL_SUFFIX=62;
	public static final int STANDALONE_COMMENT=63;
	public static final int TIME=64;
	public static final int WORD=65;
	public static final int WS=66;

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:1: start returns [JsonObject json] : (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		String mComment =null;
		JsonObject mRing =null;

		json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:3: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:4: (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:4: (mComment= big_comment )+
			int cnt1=0;
			loop1:
			do {
				int alt1=2;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:5: mComment= big_comment
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:94: ( ( ring )=>mRing= ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:95: ( ring )=>mRing= ring
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:225:1: ring returns [JsonObject json] : ( special_ring_header )? mTitle= ring_title mRing= inner_ring ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		String mTitle =null;
		JsonObject mRing =null;

		json = new JsonObject();boolean hasHeader=false; if(debug){System.out.println("ring...");}mLastBreedName = null;String title = null;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:3: ( ( special_ring_header )? mTitle= ring_title mRing= inner_ring )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:7: ( special_ring_header )? mTitle= ring_title mRing= inner_ring
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:7: ( special_ring_header )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CLUB_INDICATOR) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:227:8: special_ring_header
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:1: ring_title returns [String str] : ( ( RING INT ) | ( GROUP RING ) );
	public final String ring_title() throws RecognitionException {
		String str = null;


		Token RING1=null;
		Token INT2=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:32: ( ( RING INT ) | ( GROUP RING ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:34: ( RING INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:34: ( RING INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:35: RING INT
					{
					RING1=(Token)match(input,RING,FOLLOW_RING_in_ring_title132); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(RING1!=null?RING1.getText():null);}
					INT2=(Token)match(input,INT,FOLLOW_INT_in_ring_title135); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + (INT2!=null?INT2.getText():null);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:87: ( GROUP RING )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:87: ( GROUP RING )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:228:88: GROUP RING
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:230:1: special_ring_header returns [String str] : CLUB_INDICATOR HYPHEN INT ( COMMENT )* ;
	public final String special_ring_header() throws RecognitionException {
		String str = null;


		Token CLUB_INDICATOR3=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:231:3: ( CLUB_INDICATOR HYPHEN INT ( COMMENT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:3: CLUB_INDICATOR HYPHEN INT ( COMMENT )*
			{
			CLUB_INDICATOR3=(Token)match(input,CLUB_INDICATOR,FOLLOW_CLUB_INDICATOR_in_special_ring_header167); if (state.failed) return str;
			if ( state.backtracking==0 ) {str=(CLUB_INDICATOR3!=null?CLUB_INDICATOR3.getText():null);if(mLastComment!=null){Breeds breed = Breeds.find(mLastComment);if(breed!=null){mSpecialtyGroup=null;mSpecialtyBreed = breed.getPrimaryName();latestBreed=mSpecialtyBreed;}else{mSpecialtyBreed=null;BreedGroup group = BreedGroup.find(mLastComment);if(group!=null)mSpecialtyGroup=group.getName();}}}
			match(input,HYPHEN,FOLLOW_HYPHEN_in_special_ring_header170); if (state.failed) return str;
			match(input,INT,FOLLOW_INT_in_special_ring_header172); if (state.failed) return str;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:351: ( COMMENT )*
			loop5:
			do {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMENT) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:236:351: COMMENT
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:237:1: inner_ring returns [JsonObject json] : ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) );
	public final JsonObject inner_ring() throws RecognitionException {
		JsonObject json = null;


		JsonObject mGroupBlock =null;
		JsonObject mJugeBlock =null;

		json = new JsonObject();JsonArray judgeBlocks = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:2: ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:6: ( group_block )=>mGroupBlock= group_block ( comment )*
					{
					pushFollow(FOLLOW_group_block_in_inner_ring200);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:82: ( comment )*
					loop6:
					do {
						int alt6=2;
						alt6 = dfa6.predict(input);
						switch (alt6) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:83: comment
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:7: ( (mJugeBlock= judge_block )+ )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:7: ( (mJugeBlock= judge_block )+ )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:8: (mJugeBlock= judge_block )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:8: (mJugeBlock= judge_block )+
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:240:9: mJugeBlock= judge_block
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:241:1: judge_block returns [JsonObject json] : mName= judge_name (mBlock= timeblock )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		JsonObject mName =null;
		JsonObject mBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray();nextJudgeIsNewRing = true;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:5: (mName= judge_name (mBlock= timeblock )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:9: mName= judge_name (mBlock= timeblock )+
			{
			pushFollow(FOLLOW_judge_name_in_judge_block249);
			mName=judge_name();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {if(!mRelational){mCurrentJudge = mName;judgeSet.add(mCurrentJudge.get("Judge").getAsString());}mergeJson(json, mName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:146: (mBlock= timeblock )+
			int cnt9=0;
			loop9:
			do {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==INT||LA9_0==TIME) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:243:147: mBlock= timeblock
					{
					pushFollow(FOLLOW_timeblock_in_judge_block255);
					mBlock=timeblock();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {array.add(mBlock);}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:244:1: judge_name returns [JsonObject json] : ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ ) ;
	public final JsonObject judge_name() throws RecognitionException {
		JsonObject json = null;


		Token JUDGE_NAME4=null;
		Token COMMENT5=null;
		Token PARENTHETICAL6=null;
		Token PARENTHETICAL_INT7=null;

		json = new JsonObject(); String str = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:2: ( ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:4: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:4: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:5: ( JUDGE_NAME )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:5: ( JUDGE_NAME )+
					int cnt10=0;
					loop10:
					do {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==JUDGE_NAME) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:246:6: JUDGE_NAME
							{
							JUDGE_NAME4=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_name280); if (state.failed) return json;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:3: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:3: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					int cnt11=0;
					loop11:
					do {
						int alt11=4;
						switch ( input.LA(1) ) {
						case COMMENT:
							{
							alt11=1;
							}
							break;
						case PARENTHETICAL:
							{
							alt11=2;
							}
							break;
						case PARENTHETICAL_INT:
							{
							alt11=3;
							}
							break;
						}
						switch (alt11) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:4: COMMENT
							{
							COMMENT5=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_judge_name289); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(COMMENT5!=null?COMMENT5.getText():null)+" ";}
							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:37: PARENTHETICAL
							{
							PARENTHETICAL6=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_judge_name292); if (state.failed) return json;
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL6!=null?PARENTHETICAL6.getText():null)+" ";}
							}
							break;
						case 3 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:247:82: PARENTHETICAL_INT
							{
							PARENTHETICAL_INT7=(Token)match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_judge_name295); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:248:1: big_comment returns [String str] : (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) ;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:3: ( (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
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
				if ( (synpred16_test()) ) {
					alt13=1;
				}
				else if ( (synpred19_test()) ) {
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
				if ( (synpred16_test()) ) {
					alt13=1;
				}
				else if ( (synpred17_test()) ) {
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
				if ( (synpred16_test()) ) {
					alt13=1;
				}
				else if ( (synpred18_test()) ) {
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
				if ( (synpred16_test()) ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:8: mComment= comment
					{
					pushFollow(FOLLOW_comment_in_big_comment326);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:42: TIME
					{
					TIME8=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment329); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME8!=null?TIME8.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:64: PHONE_NUMBER
					{
					PHONE_NUMBER9=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_big_comment332); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER9!=null?PHONE_NUMBER9.getText():null);}
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:102: BREED_NAME
					{
					BREED_NAME10=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment335); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME10!=null?BREED_NAME10.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:136: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX11=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment338); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX11!=null?SPECIAL_SUFFIX11.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:178: GROUP_RING
					{
					GROUP_RING12=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment341); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_RING12!=null?GROUP_RING12.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:212: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE13=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment344); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:252:1: comment returns [String str] : ( non_header_comment | non_ring_title_comment | PARENTHETICAL_INT | BREED_COUNT | NON_CONFORMATION_CLASS_NAME | GROUP | GROUP_NAME | HYPHEN | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL |integer= INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) ;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:3: ( ( non_header_comment | non_ring_title_comment | PARENTHETICAL_INT | BREED_COUNT | NON_CONFORMATION_CLASS_NAME | GROUP | GROUP_NAME | HYPHEN | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL |integer= INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:5: ( non_header_comment | non_ring_title_comment | PARENTHETICAL_INT | BREED_COUNT | NON_CONFORMATION_CLASS_NAME | GROUP | GROUP_NAME | HYPHEN | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL |integer= INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:5: ( non_header_comment | non_ring_title_comment | PARENTHETICAL_INT | BREED_COUNT | NON_CONFORMATION_CLASS_NAME | GROUP | GROUP_NAME | HYPHEN | BREED_NAME | BREED_CLASSIFIER | TIME | COMMENT | PARENTHETICAL |integer= INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:6: non_header_comment
					{
					pushFollow(FOLLOW_non_header_comment_in_comment367);
					non_header_comment();
					state._fsp--;
					if (state.failed) return str;
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:25: non_ring_title_comment
					{
					pushFollow(FOLLOW_non_ring_title_comment_in_comment369);
					non_ring_title_comment();
					state._fsp--;
					if (state.failed) return str;
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:48: PARENTHETICAL_INT
					{
					match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_comment371); if (state.failed) return str;
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:66: BREED_COUNT
					{
					match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_comment373); if (state.failed) return str;
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:78: NON_CONFORMATION_CLASS_NAME
					{
					NON_CONFORMATION_CLASS_NAME14=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment375); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME14!=null?NON_CONFORMATION_CLASS_NAME14.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:146: GROUP
					{
					match(input,GROUP,FOLLOW_GROUP_in_comment378); if (state.failed) return str;
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:152: GROUP_NAME
					{
					GROUP_NAME15=(Token)match(input,GROUP_NAME,FOLLOW_GROUP_NAME_in_comment380); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_NAME15!=null?GROUP_NAME15.getText():null);}
					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:186: HYPHEN
					{
					match(input,HYPHEN,FOLLOW_HYPHEN_in_comment383); if (state.failed) return str;
					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:193: BREED_NAME
					{
					BREED_NAME16=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_comment385); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME16!=null?BREED_NAME16.getText():null);}
					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:227: BREED_CLASSIFIER
					{
					BREED_CLASSIFIER17=(Token)match(input,BREED_CLASSIFIER,FOLLOW_BREED_CLASSIFIER_in_comment388); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_CLASSIFIER17!=null?BREED_CLASSIFIER17.getText():null);}
					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:273: TIME
					{
					TIME18=(Token)match(input,TIME,FOLLOW_TIME_in_comment391); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(TIME18!=null?TIME18.getText():null);}
					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:295: COMMENT
					{
					COMMENT19=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment394); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT19!=null?COMMENT19.getText():null);}
					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:323: PARENTHETICAL
					{
					PARENTHETICAL20=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment397); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL20!=null?PARENTHETICAL20.getText():null);}
					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:363: integer= INT
					{
					integer=(Token)match(input,INT,FOLLOW_INT_in_comment402); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=integer.getText();}
					}
					break;
				case 15 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:399: ELLIPSIS
					{
					ELLIPSIS21=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment405); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS21!=null?ELLIPSIS21.getText():null);}
					}
					break;
				case 16 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:429: DATE
					{
					DATE22=(Token)match(input,DATE,FOLLOW_DATE_in_comment408); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE22!=null?DATE22.getText():null);}
					}
					break;
				case 17 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:451: PHONE_NUMBER
					{
					PHONE_NUMBER23=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment411); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER23!=null?PHONE_NUMBER23.getText():null);}
					}
					break;
				case 18 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:254:489: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE24=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment414); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:255:1: non_header_comment :{...}? CLUB_INDICATOR ;
	public final void non_header_comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:2: ({...}? CLUB_INDICATOR )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:256:4: {...}? CLUB_INDICATOR
			{
			if ( !((!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING")))) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "non_header_comment", "!(input.LT(2).getText().equals(\"-\") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals(\"RING\"))");
			}
			match(input,CLUB_INDICATOR,FOLLOW_CLUB_INDICATOR_in_non_header_comment425); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:257:1: non_ring_title_comment :{...}? RING ;
	public final void non_ring_title_comment() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:2: ({...}? RING )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:258:4: {...}? RING
			{
			if ( !((!(parseIntSafely(input.LT(2).getText(),-1)!=-1))) ) {
				if (state.backtracking>0) {state.failed=true; return ;}
				throw new FailedPredicateException(input, "non_ring_title_comment", "!(parseIntSafely(input.LT(2).getText(),-1)!=-1)");
			}
			match(input,RING,FOLLOW_RING_in_non_ring_title_comment434); if (state.failed) return ;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:259:1: timeblock_comment returns [String str] : ( GROUP_NAME | non_header_comment | HYPHEN | NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING ) ;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:3: ( ( GROUP_NAME | non_header_comment | HYPHEN | NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:5: ( GROUP_NAME | non_header_comment | HYPHEN | NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:5: ( GROUP_NAME | non_header_comment | HYPHEN | NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT | GROUP_RING )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:6: GROUP_NAME
					{
					GROUP_NAME25=(Token)match(input,GROUP_NAME,FOLLOW_GROUP_NAME_in_timeblock_comment454); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_NAME25!=null?GROUP_NAME25.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:40: non_header_comment
					{
					pushFollow(FOLLOW_non_header_comment_in_timeblock_comment457);
					non_header_comment();
					state._fsp--;
					if (state.failed) return str;
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:59: HYPHEN
					{
					match(input,HYPHEN,FOLLOW_HYPHEN_in_timeblock_comment459); if (state.failed) return str;
					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:66: NON_CONFORMATION_CLASS_NAME
					{
					NON_CONFORMATION_CLASS_NAME26=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment461); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME26!=null?NON_CONFORMATION_CLASS_NAME26.getText():null);}
					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:134: BREED_NAME
					{
					BREED_NAME27=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_timeblock_comment464); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(BREED_NAME27!=null?BREED_NAME27.getText():null);}
					}
					break;
				case 6 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:168: COMMENT
					{
					COMMENT28=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment467); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(COMMENT28!=null?COMMENT28.getText():null);}
					}
					break;
				case 7 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:196: PARENTHETICAL
					{
					PARENTHETICAL29=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_timeblock_comment470); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PARENTHETICAL29!=null?PARENTHETICAL29.getText():null);}
					}
					break;
				case 8 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:236: INT
					{
					INT30=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment473); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(INT30!=null?INT30.getText():null);}
					}
					break;
				case 9 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:256: ELLIPSIS
					{
					ELLIPSIS31=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment476); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(ELLIPSIS31!=null?ELLIPSIS31.getText():null);}
					}
					break;
				case 10 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:286: DATE
					{
					DATE32=(Token)match(input,DATE,FOLLOW_DATE_in_timeblock_comment479); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(DATE32!=null?DATE32.getText():null);}
					}
					break;
				case 11 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:308: PHONE_NUMBER
					{
					PHONE_NUMBER33=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment482); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER33!=null?PHONE_NUMBER33.getText():null);}
					}
					break;
				case 12 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:346: SPECIAL_SUFFIX
					{
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment485); if (state.failed) return str;
					}
					break;
				case 13 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:361: NON_CONF_SECOND_LINE_COMMENT
					{
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_timeblock_comment487); if (state.failed) return str;
					}
					break;
				case 14 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:261:390: GROUP_RING
					{
					match(input,GROUP_RING,FOLLOW_GROUP_RING_in_timeblock_comment489); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:264:1: ring_comment returns [String str] : ( STANDALONE_COMMENT | (tComment= timeblock_comment ) | ( GROUP ~ RING ) );
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT34=null;
		Token GROUP35=null;
		String tComment =null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:5: ( STANDALONE_COMMENT | (tComment= timeblock_comment ) | ( GROUP ~ RING ) )
			int alt16=3;
			switch ( input.LA(1) ) {
			case STANDALONE_COMMENT:
				{
				alt16=1;
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
				alt16=2;
				}
				break;
			case GROUP:
				{
				alt16=3;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:9: STANDALONE_COMMENT
					{
					STANDALONE_COMMENT34=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment511); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT34!=null?STANDALONE_COMMENT34.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:59: (tComment= timeblock_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:59: (tComment= timeblock_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:60: tComment= timeblock_comment
					{
					pushFollow(FOLLOW_timeblock_comment_in_ring_comment517);
					tComment=timeblock_comment();
					state._fsp--;
					if (state.failed) return str;
					if ( state.backtracking==0 ) {str=tComment;}
					}

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:103: ( GROUP ~ RING )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:103: ( GROUP ~ RING )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:265:104: GROUP ~ RING
					{
					GROUP35=(Token)match(input,GROUP,FOLLOW_GROUP_in_ring_comment522); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:267:1: timeblock returns [JsonObject json] : ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )* ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token INT36=null;
		Token TIME37=null;
		JsonArray rings =null;
		String mComment =null;

		json = new JsonObject(); String comment = ""; String time = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:2: ( ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:4: ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:269:4: ( ( INT FOLLOWING_TIME ) | TIME )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:6: ( INT FOLLOWING_TIME )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:270:6: ( INT FOLLOWING_TIME )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:271:3: INT FOLLOWING_TIME
					{
					INT36=(Token)match(input,INT,FOLLOW_INT_in_timeblock559); if (state.failed) return json;
					if ( state.backtracking==0 ) {
									currentBlockTime=(INT36!=null?INT36.getText():null);
									json.addProperty("BlockStart", currentBlockTime);
								}
					match(input,FOLLOWING_TIME,FOLLOW_FOLLOWING_TIME_in_timeblock569); if (state.failed) return json;
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:278:7: TIME
					{
					TIME37=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock586); if (state.failed) return json;
					if ( state.backtracking==0 ) {
						     		currentBlockTime=(TIME37!=null?TIME37.getText():null);
						     		json.addProperty("BlockStart", currentBlockTime);
						     	}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:284:5: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*
			loop19:
			do {
				int alt19=2;
				alt19 = dfa19.predict(input);
				switch (alt19) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:285:6: rings= inner_timeblock ({...}? =>mComment= timeblock_comment )*
					{
					pushFollow(FOLLOW_inner_timeblock_in_timeblock617);
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:296:6: ({...}? =>mComment= timeblock_comment )*
					loop18:
					do {
						int alt18=2;
						switch ( input.LA(1) ) {
						case CLUB_INDICATOR:
							{
							int LA18_2 = input.LA(2);
							if ( (((((!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING")))&&(!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING"))))&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case COMMENT:
							{
							int LA18_3 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA18_4 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case INT:
							{
							int LA18_5 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case GROUP_NAME:
							{
							int LA18_6 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case HYPHEN:
							{
							int LA18_7 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case NON_CONFORMATION_CLASS_NAME:
							{
							int LA18_8 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case BREED_NAME:
							{
							int LA18_9 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case ELLIPSIS:
							{
							int LA18_10 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case DATE:
							{
							int LA18_11 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case PHONE_NUMBER:
							{
							int LA18_12 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case SPECIAL_SUFFIX:
							{
							int LA18_13 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case NON_CONF_SECOND_LINE_COMMENT:
							{
							int LA18_14 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						case GROUP_RING:
							{
							int LA18_15 = input.LA(2);
							if ( (((synpred55_test()&&synpred55_test())&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {
								alt18=1;
							}

							}
							break;
						}
						switch (alt18) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:7: {...}? =>mComment= timeblock_comment
							{
							if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
								if (state.backtracking>0) {state.failed=true; return json;}
								throw new FailedPredicateException(input, "timeblock", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
							}
							pushFollow(FOLLOW_timeblock_comment_in_timeblock645);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:315:1: non_group_ring returns [JsonObject json] : INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) ;
	public final JsonObject non_group_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT38=null;
		JsonObject mRingWithBreed =null;
		JsonObject mRingWithoutBreed =null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:316:32: ( INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:317:2: INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
			{
			INT38=(Token)match(input,INT,FOLLOW_INT_in_non_group_ring700); if (state.failed) return json;
			if ( state.backtracking==0 ) {mCurrentCount = parseIntSafely((INT38!=null?INT38.getText():null),0); json.addProperty("Count", mCurrentCount);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:318:2: ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:2: (mRingWithBreed= ring_with_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:2: (mRingWithBreed= ring_with_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:319:3: mRingWithBreed= ring_with_breed
					{
					pushFollow(FOLLOW_ring_with_breed_in_non_group_ring710);
					mRingWithBreed=ring_with_breed();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mRingWithBreed);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:2: (mRingWithoutBreed= ring_without_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:2: (mRingWithoutBreed= ring_without_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:320:3: mRingWithoutBreed= ring_without_breed
					{
					pushFollow(FOLLOW_ring_without_breed_in_non_group_ring719);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:324:1: inner_timeblock returns [JsonArray array] : ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? =>rComment= ring_comment )+ ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject mName =null;
		JsonObject nonGroupRing =null;
		JsonObject mRallyWalkthrough =null;
		String rComment =null;

		array = new JsonArray();JsonObject toAdd = null;int countAhead = 0;String comment="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:2: ( ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? =>rComment= ring_comment )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? =>rComment= ring_comment )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:326:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) |{...}? =>rComment= ring_comment )+
			int cnt23=0;
			loop23:
			do {
				int alt23=3;
				switch ( input.LA(1) ) {
				case GROUP_NAME:
					{
					int LA23_1 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case CLUB_INDICATOR:
					{
					int LA23_2 = input.LA(2);
					if ( (((((!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING")))&&(!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING"))))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case HYPHEN:
					{
					int LA23_3 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case NON_CONFORMATION_CLASS_NAME:
					{
					int LA23_4 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case BREED_NAME:
					{
					int LA23_5 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case COMMENT:
					{
					int LA23_6 = input.LA(2);
					if ( (synpred60_test()) ) {
						alt23=1;
					}
					else if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA23_7 = input.LA(2);
					if ( (synpred60_test()) ) {
						alt23=1;
					}
					else if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case INT:
					{
					int LA23_8 = input.LA(2);
					if ( (synpred60_test()) ) {
						alt23=1;
					}
					else if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case ELLIPSIS:
					{
					int LA23_9 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case DATE:
					{
					int LA23_10 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case PHONE_NUMBER:
					{
					int LA23_11 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case SPECIAL_SUFFIX:
					{
					int LA23_12 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case NON_CONF_SECOND_LINE_COMMENT:
					{
					int LA23_13 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case GROUP_RING:
					{
					int LA23_14 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case GROUP:
					{
					int LA23_16 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				case JUDGE_NAME:
					{
					int LA23_17 = input.LA(2);
					if ( (synpred60_test()) ) {
						alt23=1;
					}

					}
					break;
				case PARENTHETICAL_INT:
					{
					int LA23_18 = input.LA(2);
					if ( (synpred60_test()) ) {
						alt23=1;
					}

					}
					break;
				case RALLY_CLASS:
					{
					int LA23_19 = input.LA(2);
					if ( (synpred60_test()) ) {
						alt23=1;
					}

					}
					break;
				case STANDALONE_COMMENT:
					{
					int LA23_20 = input.LA(2);
					if ( ((((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))&&synpred61_test())) ) {
						alt23=2;
					}

					}
					break;
				}
				switch (alt23) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:5: (mName= judge_name )? nonGroupRing= non_group_ring
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:5: (mName= judge_name )?
							int alt21=2;
							int LA21_0 = input.LA(1);
							if ( (LA21_0==COMMENT||LA21_0==JUDGE_NAME||(LA21_0 >= PARENTHETICAL && LA21_0 <= PARENTHETICAL_INT)) ) {
								alt21=1;
							}
							switch (alt21) {
								case 1 :
									// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:6: mName= judge_name
									{
									pushFollow(FOLLOW_judge_name_in_inner_timeblock760);
									mName=judge_name();
									state._fsp--;
									if (state.failed) return array;
									if ( state.backtracking==0 ) {mCurrentJudge = mName;judgeSet.add(mName.get("Judge").getAsString());}
									}
									break;

							}

							pushFollow(FOLLOW_non_group_ring_in_inner_timeblock772);
							nonGroupRing=non_group_ring();
							state._fsp--;
							if (state.failed) return array;
							if ( state.backtracking==0 ) {
									  	nonGroupRing.addProperty("BlockStart",currentBlockTime);
									  	nonGroupRing.addProperty("Number",mCurrentRingNumber);
									  	addCurrentJudge(nonGroupRing);
									  	nonGroupRing.add("CountAhead",new JsonPrimitive(countAhead));
									  	countAhead+=mCurrentCount;//nonGroupRing.get("Count").getAsInt();
									  	if(!nonGroupRing.has("Skip"))array.add(nonGroupRing);
									  	}
							}
							break;
						case 2 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:5: (mRallyWalkthrough= rally_walkthrough )
							{
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:5: (mRallyWalkthrough= rally_walkthrough )
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:6: mRallyWalkthrough= rally_walkthrough
							{
							pushFollow(FOLLOW_rally_walkthrough_in_inner_timeblock789);
							mRallyWalkthrough=rally_walkthrough();
							state._fsp--;
							if (state.failed) return array;
							if ( state.backtracking==0 ) {
									  	mRallyWalkthrough.addProperty("BlockStart",currentBlockTime);
									  	mCurrentCount = 0;
										mRallyWalkthrough.addProperty("Count", mCurrentCount);
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:5: {...}? =>rComment= ring_comment
					{
					if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
						if (state.backtracking>0) {state.failed=true; return array;}
						throw new FailedPredicateException(input, "inner_timeblock", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
					}
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock819);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:356:1: rally_walkthrough returns [JsonObject json] : RALLY_CLASS ;
	public final JsonObject rally_walkthrough() throws RecognitionException {
		JsonObject json = null;


		Token RALLY_CLASS39=null;

		json = new JsonObject();json.addProperty("RingType","Rally");mCurrentCount = 0;json.addProperty("Count",mCurrentCount);
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:357:128: ( RALLY_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:358:3: RALLY_CLASS
			{
			RALLY_CLASS39=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_walkthrough848); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:360:1: ring_with_breed returns [JsonObject json] : breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) ;
	public final JsonObject ring_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT40=null;
		JsonObject breedName =null;
		JsonObject suffix =null;
		JsonObject obedience =null;

		json = new JsonObject();json.addProperty("RingType","Unassigned");
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:361:74: (breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:362:2: breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			{
			pushFollow(FOLLOW_breed_name_in_ring_with_breed867);
			breedName=breed_name();
			state._fsp--;
			if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("RingType", "Conformation");mergeJson(json,breedName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:363:2: (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			int alt25=3;
			switch ( input.LA(1) ) {
			case SPECIAL_SUFFIX:
				{
				int LA25_1 = input.LA(2);
				if ( (synpred62_test()) ) {
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
					if ( (synpred63_test()) ) {
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:3: suffix= special_suffix
					{
					pushFollow(FOLLOW_special_suffix_in_ring_with_breed878);
					suffix=special_suffix();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,suffix);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:3: (obedience= obedience_with_breed )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:3: (obedience= obedience_with_breed )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:4: obedience= obedience_with_breed
					{
					pushFollow(FOLLOW_obedience_with_breed_in_ring_with_breed887);
					obedience=obedience_with_breed();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("Skip",true);}
					}

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:3: ( ( BREED_COUNT )? )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:3: ( ( BREED_COUNT )? )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:4: ( BREED_COUNT )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:4: ( BREED_COUNT )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==BREED_COUNT) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:366:5: BREED_COUNT
							{
							BREED_COUNT40=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_ring_with_breed896); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:368:1: obedience_with_breed returns [JsonObject json] : HYPHEN ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) ;
	public final JsonObject obedience_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token mEntry=null;
		Token mNumber=null;

		json = new JsonObject(); json.addProperty("Type", "Obedience"); json.addProperty("Class",mCurrentClass);
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:369:112: ( HYPHEN ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:2: HYPHEN ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
			{
			match(input,HYPHEN,FOLLOW_HYPHEN_in_obedience_with_breed917); if (state.failed) return json;
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:9: ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:10: (mEntry= NON_CONFORMATION_SECOND_LINE )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:10: (mEntry= NON_CONFORMATION_SECOND_LINE )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:11: mEntry= NON_CONFORMATION_SECOND_LINE
					{
					mEntry=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed923); if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("obedienceEntries",(mEntry!=null?mEntry.getText():null)); }
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:101: (mNumber= INT )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:101: (mNumber= INT )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:370:102: mNumber= INT
					{
					mNumber=(Token)match(input,INT,FOLLOW_INT_in_obedience_with_breed930); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:372:1: special_suffix returns [JsonObject json] : SPECIAL_SUFFIX ;
	public final JsonObject special_suffix() throws RecognitionException {
		JsonObject json = null;


		Token SPECIAL_SUFFIX41=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:373:32: ( SPECIAL_SUFFIX )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:374:2: SPECIAL_SUFFIX
			{
			SPECIAL_SUFFIX41=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_suffix949); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:376:1: breed_name returns [JsonObject json] : ( BREED_NAME | BREED_CLASSIFIER ) ( BREED_NAME_SUFFIX )? ;
	public final JsonObject breed_name() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME42=null;
		Token BREED_CLASSIFIER43=null;
		Token BREED_NAME_SUFFIX44=null;

		json = new JsonObject(); String breedName ="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:377:55: ( ( BREED_NAME | BREED_CLASSIFIER ) ( BREED_NAME_SUFFIX )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:3: ( BREED_NAME | BREED_CLASSIFIER ) ( BREED_NAME_SUFFIX )?
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:3: ( BREED_NAME | BREED_CLASSIFIER )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:378:4: BREED_NAME
					{
					BREED_NAME42=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name969); if (state.failed) return json;
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:395:10: BREED_CLASSIFIER
					{
					BREED_CLASSIFIER43=(Token)match(input,BREED_CLASSIFIER,FOLLOW_BREED_CLASSIFIER_in_breed_name972); if (state.failed) return json;
					if ( state.backtracking==0 ) {
									breedName=mLastBreedName;json.addProperty("BreedAttribute",(BREED_CLASSIFIER43!=null?BREED_CLASSIFIER43.getText():null).trim());
									addToJsonFromAttribute(json,(BREED_CLASSIFIER43!=null?BREED_CLASSIFIER43.getText():null));
					    		}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:10: ( BREED_NAME_SUFFIX )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==BREED_NAME_SUFFIX) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:399:11: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX44=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name981); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:402:1: ring_without_breed returns [JsonObject json] : ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) | (mSpecial= special_suffix ) );
	public final JsonObject ring_without_breed() throws RecognitionException {
		JsonObject json = null;


		JsonObject mJuniorRing =null;
		JsonObject mEmptyRing =null;
		JsonObject mRallyRing =null;
		JsonObject mNonConformationRing =null;
		JsonObject mSpecial =null;

		json = new JsonObject(); json.addProperty("RingType","Unassigned");JsonObject ring;
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:403:91: ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) | (mSpecial= special_suffix ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:2: (mJuniorRing= junior_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:2: (mJuniorRing= junior_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:404:3: mJuniorRing= junior_ring
					{
					pushFollow(FOLLOW_junior_ring_in_ring_without_breed1006);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mJuniorRing);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:2: (mEmptyRing= empty_breed_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:2: (mEmptyRing= empty_breed_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:405:3: mEmptyRing= empty_breed_ring
					{
					pushFollow(FOLLOW_empty_breed_ring_in_ring_without_breed1015);
					mEmptyRing=empty_breed_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mEmptyRing);json.addProperty("BreedName",mLastBreedName);}
					}

					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:406:2: (mRallyRing= rally_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:406:2: (mRallyRing= rally_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:406:3: mRallyRing= rally_ring
					{
					pushFollow(FOLLOW_rally_ring_in_ring_without_breed1024);
					mRallyRing=rally_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mRallyRing);json.addProperty("RingType","Rally");if(!mRallyRing.has("RallyName"))json.addProperty("Skip",true);}
					}

					}
					break;
				case 4 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:407:2: (mNonConformationRing= non_conformation_ring )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:407:2: (mNonConformationRing= non_conformation_ring )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:407:3: mNonConformationRing= non_conformation_ring
					{
					pushFollow(FOLLOW_non_conformation_ring_in_ring_without_breed1033);
					mNonConformationRing=non_conformation_ring();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {mergeJson(json,mNonConformationRing);}
					}

					}
					break;
				case 5 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:408:2: (mSpecial= special_suffix )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:408:2: (mSpecial= special_suffix )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:408:3: mSpecial= special_suffix
					{
					pushFollow(FOLLOW_special_suffix_in_ring_without_breed1042);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:420:1: rally_ring returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )? );
	public final JsonObject rally_ring() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		json = new JsonObject();String entries = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:421:53: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )? )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:3: (rallyComment= rally_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:3: (rallyComment= rally_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:422:4: rallyComment= rally_comment
					{
					pushFollow(FOLLOW_rally_comment_in_rally_ring1070);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyComment", rallyComment);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:3: (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )?
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:3: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:423:5: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring1081);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:3: ( (line= rally_entry_line )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:4: (line= rally_entry_line )*
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:4: (line= rally_entry_line )*
					loop30:
					do {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==INT) ) {
							switch ( input.LA(2) ) {
							case INT:
								{
								int LA30_4 = input.LA(3);
								if ( (LA30_4==BREED_NAME) ) {
									int LA30_5 = input.LA(4);
									if ( (LA30_5==HYPHEN) ) {
										int LA30_6 = input.LA(5);
										if ( (LA30_6==RALLY_ENTRY) ) {
											alt30=1;
										}

									}

								}

								}
								break;
							case BREED_NAME:
								{
								int LA30_5 = input.LA(3);
								if ( (LA30_5==HYPHEN) ) {
									int LA30_6 = input.LA(4);
									if ( (LA30_6==RALLY_ENTRY) ) {
										alt30=1;
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
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:424:5: line= rally_entry_line
							{
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring1091);
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:3: ( NON_CONF_SECOND_LINE_COMMENT )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==NON_CONF_SECOND_LINE_COMMENT) ) {
						int LA31_1 = input.LA(2);
						if ( (synpred74_test()) ) {
							alt31=1;
						}
					}
					switch (alt31) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:3: NON_CONF_SECOND_LINE_COMMENT
							{
							match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_ring1100); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:427:1: empty_breed_ring returns [JsonObject json] : ( BREED_COUNT ) ;
	public final JsonObject empty_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT45=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:428:33: ( ( BREED_COUNT ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:3: ( BREED_COUNT )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:3: ( BREED_COUNT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:429:4: BREED_COUNT
			{
			BREED_COUNT45=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_empty_breed_ring1122); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:431:1: non_conformation_breed_ring returns [JsonObject json] : BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) ;
	public final JsonObject non_conformation_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME46=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:431:55: ( BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:432:2: BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE )
			{
			BREED_NAME46=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_non_conformation_breed_ring1137); if (state.failed) return json;
			if ( state.backtracking==0 ) {json.addProperty("NonConformationBreed",(BREED_NAME46!=null?BREED_NAME46.getText():null));}
			match(input,COMMENT,FOLLOW_COMMENT_in_non_conformation_breed_ring1140); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:434:1: breed_ring returns [JsonObject json] : BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME47=null;
		Token BREED_NAME_SUFFIX48=null;
		Token BREED_COUNT49=null;

		json = new JsonObject();String breedName = "";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:435:55: ( BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:436:2: BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			BREED_NAME47=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring1163); if (state.failed) return json;
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME47!=null?BREED_NAME47.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:10: ( BREED_NAME_SUFFIX )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==BREED_NAME_SUFFIX) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:11: BREED_NAME_SUFFIX
					{
					BREED_NAME_SUFFIX48=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring1167); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX48!=null?BREED_NAME_SUFFIX48.getText():null);}
					}
					break;

			}

			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:120: ( BREED_COUNT )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==BREED_COUNT) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:444:121: BREED_COUNT
					{
					BREED_COUNT49=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring1175); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:447:1: special_ring returns [JsonObject json] : ( BREED_NAME )? ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME50=null;
		Token SPECIAL_SUFFIX51=null;

		json = new JsonObject();String breedName= ""; String suffix="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:448:71: ( ( BREED_NAME )? ( SPECIAL_SUFFIX )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:449:3: ( BREED_NAME )? ( SPECIAL_SUFFIX )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:449:3: ( BREED_NAME )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==BREED_NAME) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:449:4: BREED_NAME
					{
					BREED_NAME50=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring1200); if (state.failed) return json;
					if ( state.backtracking==0 ) {breedName+=(BREED_NAME50!=null?BREED_NAME50.getText():null);}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:449:47: ( SPECIAL_SUFFIX )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:449:48: SPECIAL_SUFFIX
					{
					SPECIAL_SUFFIX51=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring1206); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:460:1: group_ring returns [String str] : ( ( GROUP_NAME GROUP ) | GROUP_RING ) HYPHEN ( JUDGE_NAME | COMMENT | PARENTHETICAL )+ ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_NAME52=null;
		Token GROUP53=null;
		Token GROUP_RING54=null;
		Token JUDGE_NAME55=null;
		Token COMMENT56=null;
		Token PARENTHETICAL57=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:2: ( ( ( GROUP_NAME GROUP ) | GROUP_RING ) HYPHEN ( JUDGE_NAME | COMMENT | PARENTHETICAL )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:5: ( ( GROUP_NAME GROUP ) | GROUP_RING ) HYPHEN ( JUDGE_NAME | COMMENT | PARENTHETICAL )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:5: ( ( GROUP_NAME GROUP ) | GROUP_RING )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:6: ( GROUP_NAME GROUP )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:6: ( GROUP_NAME GROUP )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:7: GROUP_NAME GROUP
					{
					GROUP_NAME52=(Token)match(input,GROUP_NAME,FOLLOW_GROUP_NAME_in_group_ring1230); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_NAME52!=null?GROUP_NAME52.getText():null);}
					GROUP53=(Token)match(input,GROUP,FOLLOW_GROUP_in_group_ring1233); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + (GROUP53!=null?GROUP53.getText():null);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:73: GROUP_RING
					{
					GROUP_RING54=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring1237); if (state.failed) return str;
					if ( state.backtracking==0 ) {str=(GROUP_RING54!=null?GROUP_RING54.getText():null);}
					}
					break;

			}

			match(input,HYPHEN,FOLLOW_HYPHEN_in_group_ring1241); if (state.failed) return str;
			if ( state.backtracking==0 ) {str+=" -";}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:127: ( JUDGE_NAME | COMMENT | PARENTHETICAL )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:128: JUDGE_NAME
					{
					JUDGE_NAME55=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_group_ring1245); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + (JUDGE_NAME55!=null?JUDGE_NAME55.getText():null);}
					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:169: COMMENT
					{
					COMMENT56=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_group_ring1248); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + (COMMENT56!=null?COMMENT56.getText():null);}
					}
					break;
				case 3 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:461:204: PARENTHETICAL
					{
					PARENTHETICAL57=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_group_ring1251); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:462:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME58=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT
			{
			TIME58=(Token)match(input,TIME,FOLLOW_TIME_in_group_block1272); if (state.failed) return json;
			if ( state.backtracking==0 ) {currentBlockTime=(TIME58!=null?TIME58.getText():null);json.addProperty("BlockStart", currentBlockTime);}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:88: ( STANDALONE_COMMENT )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==STANDALONE_COMMENT) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:88: STANDALONE_COMMENT
					{
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block1275); if (state.failed) return json;
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:108: (mRing= group_ring )+
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:464:109: mRing= group_ring
					{
					pushFollow(FOLLOW_group_ring_in_group_block1281);
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
			match(input,GROUP_ENDING_ANNOUNCEMENT,FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block1289); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:470:1: non_conformation_ring returns [JsonObject json] : NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )* ;
	public final JsonObject non_conformation_ring() throws RecognitionException {
		JsonObject json = null;


		Token NON_CONFORMATION_CLASS_NAME59=null;
		Token NON_CONFORMATION_SECOND_LINE60=null;

		json = new JsonObject(); json.addProperty("RingType", "Non-conformation"); JsonArray rings = new JsonArray();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:472:2: ( NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )* )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:472:4: NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE )? ( NON_CONF_SECOND_LINE_COMMENT )*
			{
			NON_CONFORMATION_CLASS_NAME59=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring1313); if (state.failed) return json;
			if ( state.backtracking==0 ) {
							mCurrentClass=(NON_CONFORMATION_CLASS_NAME59!=null?NON_CONFORMATION_CLASS_NAME59.getText():null);
							json.addProperty("Class",mCurrentClass);
						}
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:477:3: ( NON_CONFORMATION_SECOND_LINE )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==NON_CONFORMATION_SECOND_LINE) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:478:4: NON_CONFORMATION_SECOND_LINE
					{
					NON_CONFORMATION_SECOND_LINE60=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring1328); if (state.failed) return json;
					if ( state.backtracking==0 ) {
										json.addProperty("Entrants",(NON_CONFORMATION_SECOND_LINE60!=null?NON_CONFORMATION_SECOND_LINE60.getText():null));
									}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:489:3: ( NON_CONF_SECOND_LINE_COMMENT )*
			loop42:
			do {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA42_2 = input.LA(2);
					if ( (synpred87_test()) ) {
						alt42=1;
					}

				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:489:4: NON_CONF_SECOND_LINE_COMMENT
					{
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring1349); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:492:1: rally_ring_block returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) );
	public final JsonObject rally_ring_block() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		String entries = ""; json = new JsonObject();json.addProperty("RingType","Rally"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){addCurrentJudge(json);json.addProperty("Number",mCurrentRingNumber);}
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:3: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) )
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:5: (rallyComment= rally_comment )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:5: (rallyComment= rally_comment )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:6: rallyComment= rally_comment
					{
					pushFollow(FOLLOW_rally_comment_in_rally_ring_block1373);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("comment", rallyComment);}
					}

					}
					break;
				case 2 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:80: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring_block1381);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:138: ( (line= rally_entry_line )* )
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:139: (line= rally_entry_line )*
					{
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:139: (line= rally_entry_line )*
					loop43:
					do {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==INT||(LA43_0 >= RALLY_ENTRY && LA43_0 <= RALLY_ENTRY_TITLE)) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:494:140: line= rally_entry_line
							{
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring_block1388);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:495:1: rally_ring_name returns [String str] : RALLY_CLASS ;
	public final String rally_ring_name() throws RecognitionException {
		String str = null;


		Token RALLY_CLASS61=null;

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:496:2: ( RALLY_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:496:4: RALLY_CLASS
			{
			RALLY_CLASS61=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_ring_name1405); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:499:1: rally_entry_line returns [String str] : ( (intOne= INT )? ( RALLY_ENTRY_TITLE )? (count= INT breed= BREED_NAME HYPHEN )? RALLY_ENTRY ) ;
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
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:500:16: ( ( (intOne= INT )? ( RALLY_ENTRY_TITLE )? (count= INT breed= BREED_NAME HYPHEN )? RALLY_ENTRY ) )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:3: ( (intOne= INT )? ( RALLY_ENTRY_TITLE )? (count= INT breed= BREED_NAME HYPHEN )? RALLY_ENTRY )
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:3: ( (intOne= INT )? ( RALLY_ENTRY_TITLE )? (count= INT breed= BREED_NAME HYPHEN )? RALLY_ENTRY )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:4: (intOne= INT )? ( RALLY_ENTRY_TITLE )? (count= INT breed= BREED_NAME HYPHEN )? RALLY_ENTRY
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:4: (intOne= INT )?
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
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:5: intOne= INT
					{
					intOne=(Token)match(input,INT,FOLLOW_INT_in_rally_entry_line1430); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=intOne.getText();}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:42: ( RALLY_ENTRY_TITLE )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==RALLY_ENTRY_TITLE) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:43: RALLY_ENTRY_TITLE
					{
					RALLY_ENTRY_TITLE62=(Token)match(input,RALLY_ENTRY_TITLE,FOLLOW_RALLY_ENTRY_TITLE_in_rally_entry_line1436); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=(RALLY_ENTRY_TITLE62!=null?RALLY_ENTRY_TITLE62.getText():null);}
					}
					break;

			}

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:94: (count= INT breed= BREED_NAME HYPHEN )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==INT) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:501:95: count= INT breed= BREED_NAME HYPHEN
					{
					count=(Token)match(input,INT,FOLLOW_INT_in_rally_entry_line1444); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" "+(count!=null?count.getText():null);}
					breed=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_rally_entry_line1449); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=" " + breed.getText();}
					HYPHEN63=(Token)match(input,HYPHEN,FOLLOW_HYPHEN_in_rally_entry_line1452); if (state.failed) return str;
					if ( state.backtracking==0 ) {str+=(HYPHEN63!=null?HYPHEN63.getText():null); }
					}
					break;

			}

			RALLY_ENTRY64=(Token)match(input,RALLY_ENTRY,FOLLOW_RALLY_ENTRY_in_rally_entry_line1457); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:503:1: rally_comment returns [String str] : ( NON_CONF_SECOND_LINE_COMMENT )+ ;
	public final String rally_comment() throws RecognitionException {
		String str = null;


		Token NON_CONF_SECOND_LINE_COMMENT65=null;

		str="";
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:504:16: ( ( NON_CONF_SECOND_LINE_COMMENT )+ )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			{
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			int cnt48=0;
			loop48:
			do {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA48_2 = input.LA(2);
					if ( (synpred93_test()) ) {
						alt48=1;
					}

				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:4: NON_CONF_SECOND_LINE_COMMENT
					{
					NON_CONF_SECOND_LINE_COMMENT65=(Token)match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1478); if (state.failed) return str;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:512:1: junior_ring returns [JsonObject json] : JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token JUNIOR_CLASS66=null;

		json = new JsonObject();
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:513:33: ( JUNIOR_CLASS )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:514:3: JUNIOR_CLASS
			{
			JUNIOR_CLASS66=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring1503); if (state.failed) return json;
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:742:1: test : BREED_NAME ;
	public final void test() throws RecognitionException {
		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:742:6: ( BREED_NAME )
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:742:8: BREED_NAME
			{
			match(input,BREED_NAME,FOLLOW_BREED_NAME_in_test3039); if (state.failed) return ;
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

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:5: (mComment= big_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:5: mComment= big_comment
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:95: ( ring )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:222:96: ring
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
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:83: ( comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:239:83: comment
		{
		pushFollow(FOLLOW_comment_in_synpred7_test204);
		comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred7_test

	// $ANTLR start synpred16_test
	public final void synpred16_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:8: (mComment= comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:8: mComment= comment
		{
		pushFollow(FOLLOW_comment_in_synpred16_test326);
		mComment=comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred16_test

	// $ANTLR start synpred17_test
	public final void synpred17_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:42: ( TIME )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:42: TIME
		{
		match(input,TIME,FOLLOW_TIME_in_synpred17_test329); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred17_test

	// $ANTLR start synpred18_test
	public final void synpred18_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:64: ( PHONE_NUMBER )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:64: PHONE_NUMBER
		{
		match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_synpred18_test332); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred18_test

	// $ANTLR start synpred19_test
	public final void synpred19_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:102: ( BREED_NAME )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:250:102: BREED_NAME
		{
		match(input,BREED_NAME,FOLLOW_BREED_NAME_in_synpred19_test335); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred19_test

	// $ANTLR start synpred55_test
	public final void synpred55_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:7: ({...}? =>mComment= timeblock_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:7: {...}? =>mComment= timeblock_comment
		{
		if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred55_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
		}
		pushFollow(FOLLOW_timeblock_comment_in_synpred55_test645);
		mComment=timeblock_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred55_test

	// $ANTLR start synpred56_test
	public final void synpred56_test_fragment() throws RecognitionException {
		JsonArray rings =null;
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:285:6: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:285:6: rings= inner_timeblock ({...}? =>mComment= timeblock_comment )*
		{
		pushFollow(FOLLOW_inner_timeblock_in_synpred56_test617);
		rings=inner_timeblock();
		state._fsp--;
		if (state.failed) return ;
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:296:6: ({...}? =>mComment= timeblock_comment )*
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
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:297:7: {...}? =>mComment= timeblock_comment
				{
				if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
					if (state.backtracking>0) {state.failed=true; return ;}
					throw new FailedPredicateException(input, "synpred56_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
				}
				pushFollow(FOLLOW_timeblock_comment_in_synpred56_test645);
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
	// $ANTLR end synpred56_test

	// $ANTLR start synpred60_test
	public final void synpred60_test_fragment() throws RecognitionException {
		JsonObject mName =null;
		JsonObject nonGroupRing =null;
		JsonObject mRallyWalkthrough =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:5: ( ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:327:5: ( (mName= judge_name )? nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) )
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
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:5: (mName= judge_name )? nonGroupRing= non_group_ring
				{
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:5: (mName= judge_name )?
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==COMMENT||LA53_0==JUDGE_NAME||(LA53_0 >= PARENTHETICAL && LA53_0 <= PARENTHETICAL_INT)) ) {
					alt53=1;
				}
				switch (alt53) {
					case 1 :
						// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:328:6: mName= judge_name
						{
						pushFollow(FOLLOW_judge_name_in_synpred60_test760);
						mName=judge_name();
						state._fsp--;
						if (state.failed) return ;
						}
						break;

				}

				pushFollow(FOLLOW_non_group_ring_in_synpred60_test772);
				nonGroupRing=non_group_ring();
				state._fsp--;
				if (state.failed) return ;
				}
				break;
			case 2 :
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:5: (mRallyWalkthrough= rally_walkthrough )
				{
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:5: (mRallyWalkthrough= rally_walkthrough )
				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:338:6: mRallyWalkthrough= rally_walkthrough
				{
				pushFollow(FOLLOW_rally_walkthrough_in_synpred60_test789);
				mRallyWalkthrough=rally_walkthrough();
				state._fsp--;
				if (state.failed) return ;
				}

				}
				break;

		}

		}

	}
	// $ANTLR end synpred60_test

	// $ANTLR start synpred61_test
	public final void synpred61_test_fragment() throws RecognitionException {
		String rComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:5: ({...}? =>rComment= ring_comment )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:350:5: {...}? =>rComment= ring_comment
		{
		if ( !((!areJudgeNames(input.LT(1).getText(), input.LT(2).getText()))) ) {
			if (state.backtracking>0) {state.failed=true; return ;}
			throw new FailedPredicateException(input, "synpred61_test", "!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())");
		}
		pushFollow(FOLLOW_ring_comment_in_synpred61_test819);
		rComment=ring_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred61_test

	// $ANTLR start synpred62_test
	public final void synpred62_test_fragment() throws RecognitionException {
		JsonObject suffix =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:3: (suffix= special_suffix )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:364:3: suffix= special_suffix
		{
		pushFollow(FOLLOW_special_suffix_in_synpred62_test878);
		suffix=special_suffix();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred62_test

	// $ANTLR start synpred63_test
	public final void synpred63_test_fragment() throws RecognitionException {
		JsonObject obedience =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:3: ( (obedience= obedience_with_breed ) )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:3: (obedience= obedience_with_breed )
		{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:3: (obedience= obedience_with_breed )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:365:4: obedience= obedience_with_breed
		{
		pushFollow(FOLLOW_obedience_with_breed_in_synpred63_test887);
		obedience=obedience_with_breed();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred63_test

	// $ANTLR start synpred74_test
	public final void synpred74_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:3: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:425:3: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred74_test1100); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred74_test

	// $ANTLR start synpred87_test
	public final void synpred87_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:489:4: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:489:4: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred87_test1349); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred87_test

	// $ANTLR start synpred93_test
	public final void synpred93_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:4: ( NON_CONF_SECOND_LINE_COMMENT )
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:505:4: NON_CONF_SECOND_LINE_COMMENT
		{
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred93_test1478); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred93_test

	// Delegated rules

	public final boolean synpred93_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred93_test_fragment(); // can never throw exception
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
	public final boolean synpred74_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred74_test_fragment(); // can never throw exception
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
	public final boolean synpred56_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred56_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred87_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred87_test_fragment(); // can never throw exception
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
	public final boolean synpred55_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred55_test_fragment(); // can never throw exception
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
	public final boolean synpred61_test() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred61_test_fragment(); // can never throw exception
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
		"\46\uffff";
	static final String DFA1_eofS =
		"\46\uffff";
	static final String DFA1_minS =
		"\4\4\1\uffff\3\4\1\0\1\4\1\uffff\12\4\3\0\3\4\3\0\10\4";
	static final String DFA1_maxS =
		"\4\100\1\uffff\3\100\1\0\1\100\1\uffff\12\100\3\0\3\100\3\0\10\100";
	static final String DFA1_acceptS =
		"\4\uffff\1\1\5\uffff\1\2\33\uffff";
	static final String DFA1_specialS =
		"\10\uffff\1\0\14\uffff\1\4\1\5\1\6\3\uffff\1\3\1\2\1\1\10\uffff}>";
	static final String[] DFA1_transitionS = {
			"\2\4\1\uffff\1\4\1\uffff\1\1\3\4\33\uffff\1\3\1\uffff\4\4\3\uffff\1\4"+
			"\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\1\2\1\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\5\1\4\3\uffff"+
			"\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\3\4\1\6\3\uffff\1"+
			"\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\4\4\3\uffff\1\4\2"+
			"\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\1\7\1\4\1\uffff\1\4",
			"",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\3\4\1\10\3\uffff\1"+
			"\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\13\2\4\33\uffff\1\4\1\uffff\4\4\1\12"+
			"\2\uffff\1\4\2\uffff\1\4\1\uffff\1\14\1\15\1\uffff\1\4\3\uffff\2\4\1"+
			"\uffff\1\11",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\17\2\4\33\uffff\1\4\1\uffff\4\4\1\12"+
			"\2\uffff\1\4\2\uffff\1\4\1\uffff\1\20\1\21\1\uffff\1\4\3\uffff\2\4\1"+
			"\uffff\1\16",
			"\1\uffff",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\1\22\1\23\2\4\3\uffff"+
			"\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\12\1\4",
			"",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\13\2\4\33\uffff\1\4\1\uffff\3\4\1\24"+
			"\3\uffff\1\4\2\uffff\1\4\1\uffff\1\14\1\15\1\uffff\1\4\3\uffff\2\4\1"+
			"\uffff\1\25",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\13\2\4\33\uffff\1\4\1\uffff\3\4\1\24"+
			"\3\uffff\1\4\2\uffff\1\4\1\uffff\1\14\1\15\1\uffff\1\4\3\uffff\2\4\1"+
			"\uffff\1\26",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\13\2\4\33\uffff\1\4\1\uffff\3\4\1\24"+
			"\3\uffff\1\4\2\uffff\1\4\1\uffff\1\14\1\15\1\uffff\1\4\3\uffff\2\4\1"+
			"\uffff\1\27",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\1\30\1\31\2\4\3\uffff"+
			"\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\12\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\17\2\4\33\uffff\1\4\1\uffff\3\4\1\32"+
			"\3\uffff\1\4\2\uffff\1\4\1\uffff\1\20\1\21\1\uffff\1\4\3\uffff\2\4\1"+
			"\uffff\1\33",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\17\2\4\33\uffff\1\4\1\uffff\3\4\1\32"+
			"\3\uffff\1\4\2\uffff\1\4\1\uffff\1\20\1\21\1\uffff\1\4\3\uffff\2\4\1"+
			"\uffff\1\34",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\17\2\4\33\uffff\1\4\1\uffff\3\4\1\32"+
			"\3\uffff\1\4\2\uffff\1\4\1\uffff\1\20\1\21\1\uffff\1\4\3\uffff\2\4\1"+
			"\uffff\1\35",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\36\1\uffff\4\4\3\uffff\1\4\2"+
			"\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\37\1\4\3\uffff"+
			"\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\2\uffff\1\12\30\uffff\1\4\1\uffff\4\4\3"+
			"\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1"+
			"\4",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\40\1\uffff\4\4\3\uffff\1\4\2"+
			"\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\41\1\4\3\uffff"+
			"\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\2\uffff\1\12\30\uffff\1\4\1\uffff\4\4\3"+
			"\uffff\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1"+
			"\4",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\37\1\4\3\uffff"+
			"\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\42\2\4\33\uffff\1\4\1\uffff\4\4\1\12"+
			"\2\uffff\1\4\2\uffff\1\4\1\uffff\1\43\1\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\2\4\1\uffff\1\4\1\uffff\4\4\33\uffff\1\4\1\uffff\2\4\1\41\1\4\3\uffff"+
			"\1\4\2\uffff\1\4\1\uffff\2\4\1\uffff\1\4\3\uffff\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\44\2\4\33\uffff\1\4\1\uffff\4\4\1\12"+
			"\2\uffff\1\4\2\uffff\1\4\1\uffff\1\45\1\4\1\uffff\1\4\3\uffff\2\4\1\uffff"+
			"\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\42\2\4\33\uffff\1\4\1\12\1\22\1\23\2"+
			"\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\43\1\4\1\uffff\1\4\3\uffff"+
			"\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\42\2\4\33\uffff\1\4\1\12\1\22\1\23\2"+
			"\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\43\1\4\1\uffff\1\4\3\uffff"+
			"\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\44\2\4\33\uffff\1\4\1\12\1\30\1\31\2"+
			"\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\45\1\4\1\uffff\1\4\3\uffff"+
			"\2\4\1\uffff\1\4",
			"\2\4\1\uffff\1\4\1\uffff\1\4\1\44\2\4\33\uffff\1\4\1\12\1\30\1\31\2"+
			"\4\1\12\2\uffff\1\4\2\uffff\1\4\1\uffff\1\45\1\4\1\uffff\1\4\3\uffff"+
			"\2\4\1\uffff\1\4"
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
			return "()+ loopback of 222:4: (mComment= big_comment )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA1_8 = input.LA(1);
						 
						int index1_8 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING")))&&(!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING"))))&&synpred1_test())) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_8);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA1_29 = input.LA(1);
						 
						int index1_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_29);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA1_28 = input.LA(1);
						 
						int index1_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_28);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA1_27 = input.LA(1);
						 
						int index1_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_test()) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_27);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA1_21 = input.LA(1);
						 
						int index1_21 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_21);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA1_22 = input.LA(1);
						 
						int index1_22 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_22);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA1_23 = input.LA(1);
						 
						int index1_23 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred1_test()&&synpred1_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 4;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index1_23);
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
		"\44\uffff";
	static final String DFA6_eofS =
		"\1\1\1\uffff\3\5\1\uffff\3\5\1\uffff\12\5\3\uffff\2\5\3\uffff\10\5";
	static final String DFA6_minS =
		"\1\4\1\uffff\3\4\1\uffff\3\4\1\0\12\4\3\0\2\4\3\0\10\4";
	static final String DFA6_maxS =
		"\1\100\1\uffff\3\100\1\uffff\3\100\1\0\12\100\3\0\2\100\3\0\10\100";
	static final String DFA6_acceptS =
		"\1\uffff\1\2\3\uffff\1\1\36\uffff";
	static final String DFA6_specialS =
		"\11\uffff\1\0\12\uffff\1\4\1\5\1\6\2\uffff\1\3\1\2\1\1\10\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\5\1\uffff\1\5\1\uffff\1\2\3\5\33\uffff\1\4\1\uffff\1\5\1\uffff\2\5"+
			"\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\3\2\uffff"+
			"\1\5",
			"",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\1\uffff\1\6\1"+
			"\5\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1"+
			"\7\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\1\uffff\2\5\3"+
			"\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\10\2\uffff\1"+
			"\5",
			"",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1"+
			"\11\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\13\2\5\33\uffff\1\5\1\uffff\1\5\1\uffff"+
			"\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\14\1\15\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\12",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\17\2\5\33\uffff\1\5\1\uffff\1\5\1\uffff"+
			"\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\20\1\21\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\16",
			"\1\uffff",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\22\1\1\2\5\3\uffff"+
			"\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\1\uffff\1\1\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\13\2\5\33\uffff\1\5\1\uffff\1\5\1\uffff"+
			"\1\5\1\23\3\uffff\1\5\2\uffff\1\5\1\uffff\1\14\1\15\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\24",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\13\2\5\33\uffff\1\5\1\uffff\1\5\1\uffff"+
			"\1\5\1\23\3\uffff\1\5\2\uffff\1\5\1\uffff\1\14\1\15\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\25",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\13\2\5\33\uffff\1\5\1\uffff\1\5\1\uffff"+
			"\1\5\1\23\3\uffff\1\5\2\uffff\1\5\1\uffff\1\14\1\15\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\26",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\27\1\1\2\5\3\uffff"+
			"\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\1\uffff\1\1\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\17\2\5\33\uffff\1\5\1\uffff\1\5\1\uffff"+
			"\1\5\1\30\3\uffff\1\5\2\uffff\1\5\1\uffff\1\20\1\21\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\31",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\17\2\5\33\uffff\1\5\1\uffff\1\5\1\uffff"+
			"\1\5\1\30\3\uffff\1\5\2\uffff\1\5\1\uffff\1\20\1\21\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\32",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\17\2\5\33\uffff\1\5\1\uffff\1\5\1\uffff"+
			"\1\5\1\30\3\uffff\1\5\2\uffff\1\5\1\uffff\1\20\1\21\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\33",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\34\1\uffff\1\5\1\uffff\2\5\3"+
			"\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff\1"+
			"\5",
			"\2\5\1\uffff\1\5\1\uffff\4\5\2\uffff\1\1\30\uffff\1\5\1\uffff\1\5\1"+
			"\uffff\2\5\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1"+
			"\5\2\uffff\1\5",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\35\1\uffff\1\5\1\uffff\2\5\3"+
			"\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff\1"+
			"\5",
			"\2\5\1\uffff\1\5\1\uffff\4\5\2\uffff\1\1\30\uffff\1\5\1\uffff\1\5\1"+
			"\uffff\2\5\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1"+
			"\5\2\uffff\1\5",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\1\uffff\1\36\1"+
			"\5\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\2\5\1\uffff\1\5\1\uffff\4\5\33\uffff\1\5\1\uffff\1\5\1\uffff\1\37\1"+
			"\5\3\uffff\1\5\2\uffff\1\5\1\uffff\2\5\1\uffff\1\5\3\uffff\1\5\2\uffff"+
			"\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\40\2\5\33\uffff\1\5\1\uffff\1\5\1\uffff"+
			"\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\41\1\5\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\42\2\5\33\uffff\1\5\1\uffff\1\5\1\uffff"+
			"\2\5\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\43\1\5\1\uffff\1\5\3\uffff"+
			"\1\5\2\uffff\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\40\2\5\33\uffff\1\5\1\1\1\22\1\1\2\5"+
			"\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\41\1\5\1\uffff\1\5\3\uffff\1\5"+
			"\2\uffff\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\40\2\5\33\uffff\1\5\1\1\1\22\1\1\2\5"+
			"\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\41\1\5\1\uffff\1\5\3\uffff\1\5"+
			"\2\uffff\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\42\2\5\33\uffff\1\5\1\1\1\27\1\1\2\5"+
			"\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\43\1\5\1\uffff\1\5\3\uffff\1\5"+
			"\2\uffff\1\5",
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\42\2\5\33\uffff\1\5\1\1\1\27\1\1\2\5"+
			"\1\1\2\uffff\1\5\2\uffff\1\5\1\uffff\1\43\1\5\1\uffff\1\5\3\uffff\1\5"+
			"\2\uffff\1\5"
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
			return "()* loopback of 239:82: ( comment )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA6_9 = input.LA(1);
						 
						int index6_9 = input.index();
						input.rewind();
						s = -1;
						if ( ((((!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING")))&&(!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING"))))&&synpred7_test())) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_9);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA6_27 = input.LA(1);
						 
						int index6_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_27);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA6_26 = input.LA(1);
						 
						int index6_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_26);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA6_25 = input.LA(1);
						 
						int index6_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred7_test()) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_25);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA6_20 = input.LA(1);
						 
						int index6_20 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_20);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA6_21 = input.LA(1);
						 
						int index6_21 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_21);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA6_22 = input.LA(1);
						 
						int index6_22 = input.index();
						input.rewind();
						s = -1;
						if ( (((synpred7_test()&&synpred7_test())&&(!(parseIntSafely(input.LT(2).getText(),-1)!=-1)))) ) {s = 5;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index6_22);
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
		"\17\uffff";
	static final String DFA19_eofS =
		"\1\1\1\uffff\1\11\5\uffff\1\11\1\uffff\1\11\4\uffff";
	static final String DFA19_minS =
		"\1\7\1\uffff\1\7\1\4\1\55\2\0\1\12\1\4\1\uffff\1\7\1\4\2\12\1\0";
	static final String DFA19_maxS =
		"\1\100\1\uffff\1\100\1\102\1\100\2\0\2\100\1\uffff\1\100\1\76\2\100\1"+
		"\0";
	static final String DFA19_acceptS =
		"\1\uffff\1\2\7\uffff\1\1\5\uffff";
	static final String DFA19_specialS =
		"\5\uffff\1\2\1\1\7\uffff\1\0}>";
	static final String[] DFA19_transitionS = {
			"\1\11\1\uffff\1\2\1\5\2\11\33\uffff\1\3\1\uffff\3\11\1\10\1\4\2\uffff"+
			"\1\11\3\uffff\1\11\1\6\1\7\1\uffff\2\11\2\uffff\1\1\2\11\1\1",
			"",
			"\1\11\1\uffff\4\11\33\uffff\1\11\1\uffff\2\11\1\12\2\11\2\uffff\1\11"+
			"\3\uffff\3\11\1\uffff\2\11\2\uffff\4\11",
			"\71\11\1\1\5\11",
			"\1\13\1\4\21\uffff\1\1",
			"\1\uffff",
			"\1\uffff",
			"\1\14\42\uffff\1\13\10\uffff\1\15\1\7\10\uffff\1\1",
			"\2\11\1\uffff\1\11\1\uffff\4\11\2\uffff\1\1\30\uffff\1\11\1\uffff\6"+
			"\11\1\uffff\1\11\3\uffff\3\11\1\uffff\2\11\2\uffff\4\11",
			"",
			"\1\11\1\uffff\4\11\33\uffff\1\11\1\uffff\3\11\1\16\1\11\2\uffff\1\11"+
			"\3\uffff\3\11\1\uffff\2\11\2\uffff\4\11",
			"\2\11\1\uffff\1\11\7\uffff\1\1\37\uffff\1\11\1\uffff\1\11\3\uffff\1"+
			"\11\4\uffff\1\11\3\uffff\1\11",
			"\1\14\42\uffff\1\13\10\uffff\1\15\1\7\10\uffff\1\1",
			"\1\14\42\uffff\1\13\10\uffff\1\15\1\7\10\uffff\1\1",
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
			return "()* loopback of 284:5: (rings= inner_timeblock ({...}? =>mComment= timeblock_comment )* )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA19_14 = input.LA(1);
						 
						int index19_14 = input.index();
						input.rewind();
						s = -1;
						if ( ((((synpred56_test()&&synpred56_test())&&(!(input.LT(2).getText().equals("-") && parseIntSafely(input.LT(3).getText(),-1)!=-1 && input.LT(4).getText().equals("RING"))))&&(!areJudgeNames(input.LT(1).getText(), input.LT(2).getText())))) ) {s = 9;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_14);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA19_6 = input.LA(1);
						 
						int index19_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_test()) ) {s = 9;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index19_6);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA19_5 = input.LA(1);
						 
						int index19_5 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_test()) ) {s = 9;}
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

	public static final BitSet FOLLOW_big_comment_in_start63 = new BitSet(new long[]{0x62D23D0000001EB0L,0x0000000000000001L});
	public static final BitSet FOLLOW_ring_in_start76 = new BitSet(new long[]{0x2000010000000200L});
	public static final BitSet FOLLOW_EOF_in_start83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_header_in_ring108 = new BitSet(new long[]{0x2000010000000000L});
	public static final BitSet FOLLOW_ring_title_in_ring115 = new BitSet(new long[]{0x00C0400000000400L,0x0000000000000001L});
	public static final BitSet FOLLOW_inner_ring_in_ring120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_in_ring_title132 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_INT_in_ring_title135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_ring_title142 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_RING_in_ring_title144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLUB_INDICATOR_in_special_ring_header167 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_HYPHEN_in_special_ring_header170 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_INT_in_special_ring_header172 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMENT_in_special_ring_header174 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_group_block_in_inner_ring200 = new BitSet(new long[]{0x22D2350000001EB2L,0x0000000000000001L});
	public static final BitSet FOLLOW_comment_in_inner_ring204 = new BitSet(new long[]{0x22D2350000001EB2L,0x0000000000000001L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring219 = new BitSet(new long[]{0x00C0400000000402L});
	public static final BitSet FOLLOW_judge_name_in_judge_block249 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_timeblock_in_judge_block255 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_name280 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_COMMENT_in_judge_name289 = new BitSet(new long[]{0x00C0000000000402L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_judge_name292 = new BitSet(new long[]{0x00C0000000000402L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_judge_name295 = new BitSet(new long[]{0x00C0000000000402L});
	public static final BitSet FOLLOW_comment_in_big_comment326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_big_comment332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_header_comment_in_comment367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_ring_title_comment_in_comment369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_comment371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_comment373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_comment378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_NAME_in_comment380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HYPHEN_in_comment383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_comment385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_CLASSIFIER_in_comment388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_comment391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_comment397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLUB_INDICATOR_in_non_header_comment425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_in_non_ring_title_comment434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_NAME_in_timeblock_comment454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_header_comment_in_timeblock_comment457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HYPHEN_in_timeblock_comment459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_timeblock_comment464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_timeblock_comment467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_timeblock_comment470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock_comment473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_timeblock_comment476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_timeblock_comment479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_timeblock_comment482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_timeblock_comment487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_timeblock_comment489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_ring_comment517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_ring_comment522 = new BitSet(new long[]{0xDFFFFFFFFFFFFFF0L,0x0000000000000007L});
	public static final BitSet FOLLOW_set_in_ring_comment525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock559 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_FOLLOWING_TIME_in_timeblock569 = new BitSet(new long[]{0xC6E27D0000001E82L});
	public static final BitSet FOLLOW_TIME_in_timeblock586 = new BitSet(new long[]{0xC6E27D0000001E82L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock617 = new BitSet(new long[]{0xC6E27D0000001E82L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock645 = new BitSet(new long[]{0xC6E27D0000001E82L});
	public static final BitSet FOLLOW_INT_in_non_group_ring700 = new BitSet(new long[]{0x44228000000000B0L});
	public static final BitSet FOLLOW_ring_with_breed_in_non_group_ring710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_without_breed_in_non_group_ring719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_name_in_inner_timeblock760 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_non_group_ring_in_inner_timeblock772 = new BitSet(new long[]{0xC6E27D0000001E82L});
	public static final BitSet FOLLOW_rally_walkthrough_in_inner_timeblock789 = new BitSet(new long[]{0xC6E27D0000001E82L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock819 = new BitSet(new long[]{0xC6E27D0000001E82L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_walkthrough848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_name_in_ring_with_breed867 = new BitSet(new long[]{0x4000100000000022L});
	public static final BitSet FOLLOW_special_suffix_in_ring_with_breed878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_ring_with_breed887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_ring_with_breed896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HYPHEN_in_obedience_with_breed917 = new BitSet(new long[]{0x0010200000000000L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_obedience_with_breed930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_suffix949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name969 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_BREED_CLASSIFIER_in_breed_name972 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_ring_without_breed1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_breed_ring_in_ring_without_breed1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_in_ring_without_breed1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_conformation_ring_in_ring_without_breed1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_suffix_in_ring_without_breed1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring1070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring1081 = new BitSet(new long[]{0x1820200000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring1091 = new BitSet(new long[]{0x1820200000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_ring1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_empty_breed_ring1122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_non_conformation_breed_ring1137 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMENT_in_non_conformation_breed_ring1140 = new BitSet(new long[]{0x0010200000000000L});
	public static final BitSet FOLLOW_set_in_non_conformation_breed_ring1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring1163 = new BitSet(new long[]{0x0000000000000122L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring1167 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring1200 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring1206 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_GROUP_NAME_in_group_ring1230 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_GROUP_in_group_ring1233 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring1237 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_HYPHEN_in_group_ring1241 = new BitSet(new long[]{0x0040400000000400L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_group_ring1245 = new BitSet(new long[]{0x0040400000000402L});
	public static final BitSet FOLLOW_COMMENT_in_group_ring1248 = new BitSet(new long[]{0x0040400000000402L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_group_ring1251 = new BitSet(new long[]{0x0040400000000402L});
	public static final BitSet FOLLOW_TIME_in_group_block1272 = new BitSet(new long[]{0x80000C0000000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block1275 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block1281 = new BitSet(new long[]{0x00000E0000000000L});
	public static final BitSet FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring1313 = new BitSet(new long[]{0x0030000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring1328 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring1349 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring_block1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring_block1381 = new BitSet(new long[]{0x1800200000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring_block1388 = new BitSet(new long[]{0x1800200000000002L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_ring_name1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_rally_entry_line1430 = new BitSet(new long[]{0x1800200000000000L});
	public static final BitSet FOLLOW_RALLY_ENTRY_TITLE_in_rally_entry_line1436 = new BitSet(new long[]{0x0800200000000000L});
	public static final BitSet FOLLOW_INT_in_rally_entry_line1444 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BREED_NAME_in_rally_entry_line1449 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_HYPHEN_in_rally_entry_line1452 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_RALLY_ENTRY_in_rally_entry_line1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1478 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring1503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_test3039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_synpred1_test63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred2_test71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred7_test204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred16_test326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_synpred17_test329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_synpred18_test332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_synpred19_test335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred55_test645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred56_test617 = new BitSet(new long[]{0x42623C0000001E82L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred56_test645 = new BitSet(new long[]{0x42623C0000001E82L});
	public static final BitSet FOLLOW_judge_name_in_synpred60_test760 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_non_group_ring_in_synpred60_test772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_walkthrough_in_synpred60_test789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_synpred61_test819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_suffix_in_synpred62_test878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_synpred63_test887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred74_test1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred87_test1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred93_test1478 = new BitSet(new long[]{0x0000000000000002L});
}
