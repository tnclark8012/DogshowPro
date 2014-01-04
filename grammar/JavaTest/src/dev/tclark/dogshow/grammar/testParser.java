// $ANTLR 3.x C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g 2014-01-03 15:55:21

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

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class testParser extends DebugParser {
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


public static final String[] ruleNames = new String[] {
	"invalidRule", "synpred11_test", "synpred51_test", "rally_entry_line", 
    "synpred12_test", "synpred17_test", "synpred24_test", "synpred6_test", 
    "obedience_with_breed", "synpred19_test", "synpred58_test", "synpred48_test", 
    "synpred41_test", "ring", "synpred30_test", "synpred69_test", "synpred67_test", 
    "synpred9_test", "synpred18_test", "comment", "rally_comment", "synpred29_test", 
    "special_ring", "ring_without_breed", "timeblock_comment", "timeblock", 
    "synpred57_test", "synpred46_test", "synpred13_test", "synpred39_test", 
    "synpred63_test", "start", "synpred32_test", "inner_ring", "non_conformation_breed_ring", 
    "rally_ring", "synpred43_test", "synpred4_test", "judge_block", "synpred53_test", 
    "synpred1_test", "synpred28_test", "junior_ring", "synpred54_test", 
    "synpred70_test", "synpred61_test", "synpred56_test", "synpred49_test", 
    "synpred60_test", "synpred36_test", "synpred16_test", "synpred31_test", 
    "synpred59_test", "group_block", "synpred26_test", "synpred40_test", 
    "synpred25_test", "synpred55_test", "synpred50_test", "synpred64_test", 
    "synpred5_test", "synpred20_test", "synpred10_test", "synpred7_test", 
    "synpred34_test", "synpred8_test", "synpred37_test", "synpred47_test", 
    "inner_timeblock", "non_group_ring", "ring_comment", "synpred33_test", 
    "synpred21_test", "synpred23_test", "synpred52_test", "synpred62_test", 
    "big_comment", "synpred45_test", "synpred38_test", "synpred27_test", 
    "rally_ring_block", "synpred42_test", "synpred22_test", "rally_ring_name", 
    "group_ring", "empty_breed_ring", "rally_walkthrough", "ring_with_breed", 
    "synpred68_test", "synpred66_test", "synpred15_test", "non_conformation_ring", 
    "breed_ring", "synpred44_test", "special_suffix", "synpred14_test", 
    "judge_name", "breed_name", "synpred35_test", "synpred65_test", "synpred2_test", 
    "synpred3_test"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
	false, // invalid decision
	false, false, false, false, false, false, true, true, false, true, false, 
	    false, false, false, true, true, false, true, false, true, false, false, 
	    false, false, true, false, false, false, false, false, false, false, 
	    false, true, false, false, false, true, false, false, false
};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public testParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public testParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

public testParser(TokenStream input, DebugEventListener dbg) {
	super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
	dbg.semanticPredicate(result, predicate);
	return result;
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
		try { dbg.enterRule(getGrammarFileName(), "start");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(147, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:3: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:4: (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF
			{
			dbg.location(149,4);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:4: (mComment= big_comment )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			do {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==BREED_NAME||(LA1_0 >= COMMENT && LA1_0 <= ELLIPSIS)||(LA1_0 >= GROUP_RING && LA1_0 <= INT)||LA1_0==NON_CONFORMATION_CLASS_NAME||LA1_0==NON_CONFORMATION_SECOND_LINE||LA1_0==PARENTHETICAL||LA1_0==PHONE_NUMBER||LA1_0==SPECIAL_SUFFIX||LA1_0==TIME) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:5: mComment= big_comment
					{
					dbg.location(149,13);
					pushFollow(FOLLOW_big_comment_in_start63);
					mComment=big_comment();
					state._fsp--;
					if (state.failed) return json;dbg.location(149,25);
					if ( state.backtracking==0 ) {comments+=mComment;}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(1, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt1++;
			} while (true);
			} finally {dbg.exitSubRule(1);}
			dbg.location(149,54);
			if ( state.backtracking==0 ) {json.addProperty("Comment", comments);}dbg.location(149,94);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:94: ( ( ring )=>mRing= ring )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			do {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==RING_TITLE) && (synpred2_test())) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:95: ( ring )=>mRing= ring
					{
					dbg.location(149,108);
					pushFollow(FOLLOW_ring_in_start76);
					mRing=ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(149,113);
					if ( state.backtracking==0 ) {ringArray.add(mRing);}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(2, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt2++;
			} while (true);
			} finally {dbg.exitSubRule(2);}
			dbg.location(149,145);
			if ( state.backtracking==0 ) {json.add("Rings", ringArray); if(!mRelational){json = new JsonObject(); json.add("Rings", mShowRings);}}dbg.location(149,251);
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
		dbg.location(149, 253);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "start");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		try { dbg.enterRule(getGrammarFileName(), "ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(152, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:154:3: ( RING_TITLE mRing= inner_ring )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:154:7: RING_TITLE mRing= inner_ring
			{
			dbg.location(154,7);
			RING_TITLE1=(Token)match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring109); if (state.failed) return json;dbg.location(154,17);
			if ( state.backtracking==0 ) {json.addProperty("Title", (RING_TITLE1!=null?RING_TITLE1.getText():null)); json.addProperty("Number", parseRingNumber((RING_TITLE1!=null?RING_TITLE1.getText():null)));if(!mRelational){mCurrentRingNumber=parseRingNumber((RING_TITLE1!=null?RING_TITLE1.getText():null));}}dbg.location(154,203);
			pushFollow(FOLLOW_inner_ring_in_ring114);
			mRing=inner_ring();
			state._fsp--;
			if (state.failed) return json;dbg.location(154,214);
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
		dbg.location(154, 239);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		try { dbg.enterRule(getGrammarFileName(), "inner_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(155, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:2: ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) )
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					{
					dbg.location(157,5);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:6: ( group_block )=>mGroupBlock= group_block ( comment )*
					{
					dbg.location(157,32);
					pushFollow(FOLLOW_group_block_in_inner_ring140);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;dbg.location(157,44);
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}dbg.location(157,82);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:82: ( comment )*
					try { dbg.enterSubRule(3);

					loop3:
					do {
						int alt3=2;
						try { dbg.enterDecision(3, decisionCanBacktrack[3]);

						int LA3_0 = input.LA(1);
						if ( (LA3_0==BREED_NAME||(LA3_0 >= COMMENT && LA3_0 <= ELLIPSIS)||LA3_0==INT||LA3_0==NON_CONFORMATION_CLASS_NAME||LA3_0==NON_CONFORMATION_SECOND_LINE||LA3_0==PARENTHETICAL||LA3_0==PHONE_NUMBER||LA3_0==TIME) ) {
							alt3=1;
						}

						} finally {dbg.exitDecision(3);}

						switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:157:82: comment
							{
							dbg.location(157,82);
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
					} finally {dbg.exitSubRule(3);}

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:158:7: ( (mJugeBlock= judge_block )+ )
					{
					dbg.location(158,7);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:158:7: ( (mJugeBlock= judge_block )+ )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:158:8: (mJugeBlock= judge_block )+
					{
					dbg.location(158,8);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:158:8: (mJugeBlock= judge_block )+
					int cnt4=0;
					try { dbg.enterSubRule(4);

					loop4:
					do {
						int alt4=2;
						try { dbg.enterDecision(4, decisionCanBacktrack[4]);

						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMENT||LA4_0==JUDGE_NAME||(LA4_0 >= PARENTHETICAL && LA4_0 <= PARENTHETICAL_INT)) ) {
							alt4=1;
						}

						} finally {dbg.exitDecision(4);}

						switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:158:9: mJugeBlock= judge_block
							{
							dbg.location(158,19);
							pushFollow(FOLLOW_judge_block_in_inner_ring157);
							mJugeBlock=judge_block();
							state._fsp--;
							if (state.failed) return json;dbg.location(158,31);
							if ( state.backtracking==0 ) {judgeBlocks.add(mJugeBlock);}
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return json;}
								EarlyExitException eee =
									new EarlyExitException(4, input);
								dbg.recognitionException(eee);

								throw eee;
						}
						cnt4++;
					} while (true);
					} finally {dbg.exitSubRule(4);}
					dbg.location(158,64);
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
		dbg.location(158, 103);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inner_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		try { dbg.enterRule(getGrammarFileName(), "judge_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(159, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:161:5: (mName= judge_name (mBlock= timeblock )+ )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:161:9: mName= judge_name (mBlock= timeblock )+
			{
			dbg.location(161,14);
			pushFollow(FOLLOW_judge_name_in_judge_block187);
			mName=judge_name();
			state._fsp--;
			if (state.failed) return json;dbg.location(161,25);
			if ( state.backtracking==0 ) {if(!mRelational){mCurrentJudge = mName.trim();}json.addProperty("Judge", mName);}dbg.location(161,108);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:161:108: (mBlock= timeblock )+
			int cnt6=0;
			try { dbg.enterSubRule(6);

			loop6:
			do {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==INT||LA6_0==TIME) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:161:109: mBlock= timeblock
					{
					dbg.location(161,115);
					pushFollow(FOLLOW_timeblock_in_judge_block193);
					mBlock=timeblock();
					state._fsp--;
					if (state.failed) return json;dbg.location(161,125);
					if ( state.backtracking==0 ) {array.add(mBlock);}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(6, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt6++;
			} while (true);
			} finally {dbg.exitSubRule(6);}
			dbg.location(161,148);
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
		dbg.location(161, 179);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "judge_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
		try { dbg.enterRule(getGrammarFileName(), "judge_name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(162, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:2: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:4: ( JUDGE_NAME )+
					{
					dbg.location(164,4);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:4: ( JUDGE_NAME )+
					int cnt7=0;
					try { dbg.enterSubRule(7);

					loop7:
					do {
						int alt7=2;
						try { dbg.enterDecision(7, decisionCanBacktrack[7]);

						int LA7_0 = input.LA(1);
						if ( (LA7_0==JUDGE_NAME) ) {
							int LA7_2 = input.LA(2);
							if ( (synpred8_test()) ) {
								alt7=1;
							}

						}

						} finally {dbg.exitDecision(7);}

						switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:5: JUDGE_NAME
							{
							dbg.location(164,5);
							JUDGE_NAME2=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_name217); if (state.failed) return str;dbg.location(164,15);
							if ( state.backtracking==0 ) {str+=(JUDGE_NAME2!=null?JUDGE_NAME2.getText():null);}
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							if (state.backtracking>0) {state.failed=true; return str;}
								EarlyExitException eee =
									new EarlyExitException(7, input);
								dbg.recognitionException(eee);

								throw eee;
						}
						cnt7++;
					} while (true);
					} finally {dbg.exitSubRule(7);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:3: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					{
					dbg.location(165,3);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:3: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					int cnt8=0;
					try { dbg.enterSubRule(8);

					loop8:
					do {
						int alt8=4;
						try { dbg.enterDecision(8, decisionCanBacktrack[8]);

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
						} finally {dbg.exitDecision(8);}

						switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:4: COMMENT
							{
							dbg.location(165,4);
							COMMENT3=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_judge_name226); if (state.failed) return str;dbg.location(165,11);
							if ( state.backtracking==0 ) {str+=(COMMENT3!=null?COMMENT3.getText():null)+" ";}
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:37: PARENTHETICAL
							{
							dbg.location(165,37);
							PARENTHETICAL4=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_judge_name229); if (state.failed) return str;dbg.location(165,50);
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL4!=null?PARENTHETICAL4.getText():null)+" ";}
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:82: PARENTHETICAL_INT
							{
							dbg.location(165,82);
							PARENTHETICAL_INT5=(Token)match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_judge_name232); if (state.failed) return str;dbg.location(165,99);
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL_INT5!=null?PARENTHETICAL_INT5.getText():null)+" ";}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return str;}
								EarlyExitException eee =
									new EarlyExitException(8, input);
								dbg.recognitionException(eee);

								throw eee;
						}
						cnt8++;
					} while (true);
					} finally {dbg.exitSubRule(8);}

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
		dbg.location(165, 135);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "judge_name");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "judge_name"



	// $ANTLR start "big_comment"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:166:1: big_comment returns [String str] : (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) ;
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
		try { dbg.enterRule(getGrammarFileName(), "big_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(166, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:3: ( (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			{
			dbg.location(168,7);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			int alt10=7;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

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
						dbg.recognitionException(nvae);
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
						dbg.recognitionException(nvae);
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
						dbg.recognitionException(nvae);
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
						dbg.recognitionException(nvae);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:8: mComment= comment
					{
					dbg.location(168,16);
					pushFollow(FOLLOW_comment_in_big_comment261);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;dbg.location(168,24);
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:42: TIME
					{
					dbg.location(168,42);
					TIME6=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment264); if (state.failed) return str;dbg.location(168,46);
					if ( state.backtracking==0 ) {str=(TIME6!=null?TIME6.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:64: PHONE_NUMBER
					{
					dbg.location(168,64);
					PHONE_NUMBER7=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_big_comment267); if (state.failed) return str;dbg.location(168,76);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER7!=null?PHONE_NUMBER7.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:102: BREED_NAME
					{
					dbg.location(168,102);
					BREED_NAME8=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment270); if (state.failed) return str;dbg.location(168,112);
					if ( state.backtracking==0 ) {str=(BREED_NAME8!=null?BREED_NAME8.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:136: SPECIAL_SUFFIX
					{
					dbg.location(168,136);
					SPECIAL_SUFFIX9=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment273); if (state.failed) return str;dbg.location(168,150);
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX9!=null?SPECIAL_SUFFIX9.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:178: GROUP_RING
					{
					dbg.location(168,178);
					GROUP_RING10=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment276); if (state.failed) return str;dbg.location(168,188);
					if ( state.backtracking==0 ) {str=(GROUP_RING10!=null?GROUP_RING10.getText():null);}
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:212: NON_CONFORMATION_SECOND_LINE
					{
					dbg.location(168,212);
					NON_CONFORMATION_SECOND_LINE11=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment279); if (state.failed) return str;dbg.location(168,240);
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_SECOND_LINE11!=null?NON_CONFORMATION_SECOND_LINE11.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(168, 281);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "big_comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "big_comment"



	// $ANTLR start "comment"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:170:1: comment returns [String str] : ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) ;
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
		try { dbg.enterRule(getGrammarFileName(), "comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(170, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:3: ( ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
			{
			dbg.location(172,5);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
			int alt11=10;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:6: NON_CONFORMATION_CLASS_NAME
					{
					dbg.location(172,6);
					NON_CONFORMATION_CLASS_NAME12=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment302); if (state.failed) return str;dbg.location(172,33);
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME12!=null?NON_CONFORMATION_CLASS_NAME12.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:74: BREED_NAME
					{
					dbg.location(172,74);
					BREED_NAME13=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_comment305); if (state.failed) return str;dbg.location(172,84);
					if ( state.backtracking==0 ) {str=(BREED_NAME13!=null?BREED_NAME13.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:108: TIME
					{
					dbg.location(172,108);
					TIME14=(Token)match(input,TIME,FOLLOW_TIME_in_comment308); if (state.failed) return str;dbg.location(172,112);
					if ( state.backtracking==0 ) {str=(TIME14!=null?TIME14.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:130: COMMENT
					{
					dbg.location(172,130);
					COMMENT15=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment311); if (state.failed) return str;dbg.location(172,137);
					if ( state.backtracking==0 ) {str=(COMMENT15!=null?COMMENT15.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:158: PARENTHETICAL
					{
					dbg.location(172,158);
					PARENTHETICAL16=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment314); if (state.failed) return str;dbg.location(172,171);
					if ( state.backtracking==0 ) {str=(PARENTHETICAL16!=null?PARENTHETICAL16.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:198: INT
					{
					dbg.location(172,198);
					INT17=(Token)match(input,INT,FOLLOW_INT_in_comment317); if (state.failed) return str;dbg.location(172,201);
					if ( state.backtracking==0 ) {str=(INT17!=null?INT17.getText():null);}
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:218: ELLIPSIS
					{
					dbg.location(172,218);
					ELLIPSIS18=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment320); if (state.failed) return str;dbg.location(172,226);
					if ( state.backtracking==0 ) {str=(ELLIPSIS18!=null?ELLIPSIS18.getText():null);}
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:248: DATE
					{
					dbg.location(172,248);
					DATE19=(Token)match(input,DATE,FOLLOW_DATE_in_comment323); if (state.failed) return str;dbg.location(172,252);
					if ( state.backtracking==0 ) {str=(DATE19!=null?DATE19.getText():null);}
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:270: PHONE_NUMBER
					{
					dbg.location(172,270);
					PHONE_NUMBER20=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment326); if (state.failed) return str;dbg.location(172,282);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER20!=null?PHONE_NUMBER20.getText():null);}
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:172:308: NON_CONFORMATION_SECOND_LINE
					{
					dbg.location(172,308);
					NON_CONFORMATION_SECOND_LINE21=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment329); if (state.failed) return str;dbg.location(172,336);
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_SECOND_LINE21!=null?NON_CONFORMATION_SECOND_LINE21.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(172, 377);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "comment"



	// $ANTLR start "timeblock_comment"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:173:1: timeblock_comment returns [String str] : ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT ) ;
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
		try { dbg.enterRule(getGrammarFileName(), "timeblock_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(173, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:3: ( ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT ) )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT )
			{
			dbg.location(175,5);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX | NON_CONF_SECOND_LINE_COMMENT )
			int alt12=10;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

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
			default:
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:6: NON_CONFORMATION_CLASS_NAME
					{
					dbg.location(175,6);
					NON_CONFORMATION_CLASS_NAME22=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment351); if (state.failed) return str;dbg.location(175,33);
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME22!=null?NON_CONFORMATION_CLASS_NAME22.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:74: BREED_NAME
					{
					dbg.location(175,74);
					BREED_NAME23=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_timeblock_comment354); if (state.failed) return str;dbg.location(175,84);
					if ( state.backtracking==0 ) {str=(BREED_NAME23!=null?BREED_NAME23.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:108: COMMENT
					{
					dbg.location(175,108);
					COMMENT24=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment357); if (state.failed) return str;dbg.location(175,115);
					if ( state.backtracking==0 ) {str=(COMMENT24!=null?COMMENT24.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:136: PARENTHETICAL
					{
					dbg.location(175,136);
					PARENTHETICAL25=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_timeblock_comment360); if (state.failed) return str;dbg.location(175,149);
					if ( state.backtracking==0 ) {str=(PARENTHETICAL25!=null?PARENTHETICAL25.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:176: INT
					{
					dbg.location(175,176);
					INT26=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment363); if (state.failed) return str;dbg.location(175,179);
					if ( state.backtracking==0 ) {str=(INT26!=null?INT26.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:196: ELLIPSIS
					{
					dbg.location(175,196);
					ELLIPSIS27=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment366); if (state.failed) return str;dbg.location(175,204);
					if ( state.backtracking==0 ) {str=(ELLIPSIS27!=null?ELLIPSIS27.getText():null);}
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:226: DATE
					{
					dbg.location(175,226);
					DATE28=(Token)match(input,DATE,FOLLOW_DATE_in_timeblock_comment369); if (state.failed) return str;dbg.location(175,230);
					if ( state.backtracking==0 ) {str=(DATE28!=null?DATE28.getText():null);}
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:248: PHONE_NUMBER
					{
					dbg.location(175,248);
					PHONE_NUMBER29=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment372); if (state.failed) return str;dbg.location(175,260);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER29!=null?PHONE_NUMBER29.getText():null);}
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:286: SPECIAL_SUFFIX
					{
					dbg.location(175,286);
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment375); if (state.failed) return str;
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:175:301: NON_CONF_SECOND_LINE_COMMENT
					{
					dbg.location(175,301);
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_timeblock_comment377); if (state.failed) return str;
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(175, 329);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "timeblock_comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "timeblock_comment"



	// $ANTLR start "ring_comment"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:178:1: ring_comment returns [String str] : ( STANDALONE_COMMENT | timeblock_comment );
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT30=null;

		try { dbg.enterRule(getGrammarFileName(), "ring_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(178, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:179:5: ( STANDALONE_COMMENT | timeblock_comment )
			int alt13=2;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==STANDALONE_COMMENT) ) {
				alt13=1;
			}
			else if ( (LA13_0==BREED_NAME||(LA13_0 >= COMMENT && LA13_0 <= ELLIPSIS)||LA13_0==INT||LA13_0==NON_CONFORMATION_CLASS_NAME||(LA13_0 >= NON_CONF_SECOND_LINE_COMMENT && LA13_0 <= PARENTHETICAL)||LA13_0==PHONE_NUMBER||LA13_0==SPECIAL_SUFFIX) ) {
				alt13=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:179:9: STANDALONE_COMMENT
					{
					dbg.location(179,9);
					STANDALONE_COMMENT30=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment399); if (state.failed) return str;dbg.location(179,27);
					if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT30!=null?STANDALONE_COMMENT30.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:179:59: timeblock_comment
					{
					dbg.location(179,59);
					pushFollow(FOLLOW_timeblock_comment_in_ring_comment402);
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
		dbg.location(179, 75);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ring_comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "ring_comment"



	// $ANTLR start "timeblock"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:181:1: timeblock returns [JsonObject json] : ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )* ;
	public final JsonObject timeblock() throws RecognitionException {
		JsonObject json = null;


		Token INT31=null;
		Token TIME32=null;
		JsonArray rings =null;
		String mComment =null;

		json = new JsonObject(); String comment = ""; String time = "";
		try { dbg.enterRule(getGrammarFileName(), "timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(181, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:2: ( ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )* )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:4: ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )*
			{
			dbg.location(183,4);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:4: ( ( INT FOLLOWING_TIME ) | TIME )
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:5: ( INT FOLLOWING_TIME )
					{
					dbg.location(183,5);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:5: ( INT FOLLOWING_TIME )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:6: INT FOLLOWING_TIME
					{
					dbg.location(183,6);
					INT31=(Token)match(input,INT,FOLLOW_INT_in_timeblock425); if (state.failed) return json;dbg.location(183,9);
					if ( state.backtracking==0 ) {currentBlockTime=(INT31!=null?INT31.getText():null);json.addProperty("Time", currentBlockTime);}dbg.location(183,82);
					match(input,FOLLOWING_TIME,FOLLOW_FOLLOWING_TIME_in_timeblock428); if (state.failed) return json;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:98: TIME
					{
					dbg.location(183,98);
					TIME32=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock431); if (state.failed) return json;dbg.location(183,102);
					if ( state.backtracking==0 ) {currentBlockTime=(TIME32!=null?TIME32.getText():null);json.addProperty("Time", currentBlockTime);}
					}
					break;

			}
			} finally {dbg.exitSubRule(14);}
			dbg.location(183,177);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:177: (rings= inner_timeblock (mComment= timeblock_comment )* )*
			try { dbg.enterSubRule(16);

			loop16:
			do {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				switch ( input.LA(1) ) {
				case JUDGE_NAME:
					{
					int LA16_2 = input.LA(2);
					if ( (synpred40_test()) ) {
						alt16=1;
					}

					}
					break;
				case COMMENT:
					{
					int LA16_3 = input.LA(2);
					if ( (synpred40_test()) ) {
						alt16=1;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA16_4 = input.LA(2);
					if ( (synpred40_test()) ) {
						alt16=1;
					}

					}
					break;
				case PARENTHETICAL_INT:
					{
					int LA16_5 = input.LA(2);
					if ( (synpred40_test()) ) {
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
				case NON_CONF_SECOND_LINE_COMMENT:
				case PHONE_NUMBER:
				case RALLY_CLASS:
				case SPECIAL_SUFFIX:
				case STANDALONE_COMMENT:
					{
					alt16=1;
					}
					break;
				}
				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:178: rings= inner_timeblock (mComment= timeblock_comment )*
					{
					dbg.location(183,183);
					pushFollow(FOLLOW_inner_timeblock_in_timeblock438);
					rings=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;dbg.location(183,199);
					if ( state.backtracking==0 ) {if(json.has("Rings")){JsonArray already=json.getAsJsonArray("Rings");already.addAll(rings);json.add("Rings",already);}else{json.add("Rings", rings);}}dbg.location(183,351);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:351: (mComment= timeblock_comment )*
					try { dbg.enterSubRule(15);

					loop15:
					do {
						int alt15=2;
						try { dbg.enterDecision(15, decisionCanBacktrack[15]);

						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA15_2 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt15=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA15_3 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt15=1;
							}

							}
							break;
						case INT:
							{
							int LA15_4 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt15=1;
							}

							}
							break;
						case NON_CONFORMATION_CLASS_NAME:
							{
							int LA15_5 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt15=1;
							}

							}
							break;
						case BREED_NAME:
							{
							int LA15_6 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt15=1;
							}

							}
							break;
						case ELLIPSIS:
							{
							int LA15_7 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt15=1;
							}

							}
							break;
						case DATE:
							{
							int LA15_8 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt15=1;
							}

							}
							break;
						case PHONE_NUMBER:
							{
							int LA15_9 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt15=1;
							}

							}
							break;
						case SPECIAL_SUFFIX:
							{
							int LA15_10 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt15=1;
							}

							}
							break;
						case NON_CONF_SECOND_LINE_COMMENT:
							{
							int LA15_11 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt15=1;
							}

							}
							break;
						}
						} finally {dbg.exitDecision(15);}

						switch (alt15) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:352: mComment= timeblock_comment
							{
							dbg.location(183,360);
							pushFollow(FOLLOW_timeblock_comment_in_timeblock444);
							mComment=timeblock_comment();
							state._fsp--;
							if (state.failed) return json;dbg.location(183,378);
							if ( state.backtracking==0 ) {comment+=mComment;}
							}
							break;

						default :
							break loop15;
						}
					} while (true);
					} finally {dbg.exitSubRule(15);}
					dbg.location(183,405);
					if ( state.backtracking==0 ) {if(!comment.equals("")){json.add("timeblock_comment",new JsonPrimitive(comment));}}
					}
					break;

				default :
					break loop16;
				}
			} while (true);
			} finally {dbg.exitSubRule(16);}
			dbg.location(183,491);
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
		dbg.location(183, 577);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "timeblock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "timeblock"



	// $ANTLR start "non_group_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:185:1: non_group_ring returns [JsonObject json] : INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) ;
	public final JsonObject non_group_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT33=null;
		JsonObject mRingWithBreed =null;
		JsonObject mRingWithoutBreed =null;

		json = new JsonObject();
		try { dbg.enterRule(getGrammarFileName(), "non_group_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(185, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:186:32: ( INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) ) )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:187:2: INT ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
			{
			dbg.location(187,2);
			INT33=(Token)match(input,INT,FOLLOW_INT_in_non_group_ring467); if (state.failed) return json;dbg.location(187,5);
			if ( state.backtracking==0 ) {json.addProperty("Count", parseIntSafely((INT33!=null?INT33.getText():null),0));}dbg.location(188,2);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:188:2: ( (mRingWithBreed= ring_with_breed ) | (mRingWithoutBreed= ring_without_breed ) )
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:189:2: (mRingWithBreed= ring_with_breed )
					{
					dbg.location(189,2);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:189:2: (mRingWithBreed= ring_with_breed )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:189:3: mRingWithBreed= ring_with_breed
					{
					dbg.location(189,17);
					pushFollow(FOLLOW_ring_with_breed_in_non_group_ring477);
					mRingWithBreed=ring_with_breed();
					state._fsp--;
					if (state.failed) return json;dbg.location(189,33);
					if ( state.backtracking==0 ) {mergeJson(json,mRingWithBreed);}
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:190:2: (mRingWithoutBreed= ring_without_breed )
					{
					dbg.location(190,2);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:190:2: (mRingWithoutBreed= ring_without_breed )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:190:3: mRingWithoutBreed= ring_without_breed
					{
					dbg.location(190,20);
					pushFollow(FOLLOW_ring_without_breed_in_non_group_ring486);
					mRingWithoutBreed=ring_without_breed();
					state._fsp--;
					if (state.failed) return json;dbg.location(190,39);
					if ( state.backtracking==0 ) {mergeJson(json,mRingWithoutBreed);}
					}

					}
					break;

			}
			} finally {dbg.exitSubRule(17);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(191, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "non_group_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "non_group_ring"



	// $ANTLR start "inner_timeblock"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:194:1: inner_timeblock returns [JsonArray array] : (mName= judge_name |nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) | ring_comment )+ ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		String mName =null;
		JsonObject nonGroupRing =null;
		JsonObject mRallyWalkthrough =null;

		array = new JsonArray();int countAhead = 0;
		try { dbg.enterRule(getGrammarFileName(), "inner_timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(194, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:196:2: ( (mName= judge_name |nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) | ring_comment )+ )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:196:5: (mName= judge_name |nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) | ring_comment )+
			{
			dbg.location(196,5);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:196:5: (mName= judge_name |nonGroupRing= non_group_ring | (mRallyWalkthrough= rally_walkthrough ) | ring_comment )+
			int cnt18=0;
			try { dbg.enterSubRule(18);

			loop18:
			do {
				int alt18=5;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				switch ( input.LA(1) ) {
				case NON_CONFORMATION_CLASS_NAME:
					{
					int LA18_1 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt18=4;
					}

					}
					break;
				case BREED_NAME:
					{
					int LA18_2 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt18=4;
					}

					}
					break;
				case COMMENT:
					{
					int LA18_3 = input.LA(2);
					if ( (synpred42_test()) ) {
						alt18=1;
					}
					else if ( (synpred45_test()) ) {
						alt18=4;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA18_4 = input.LA(2);
					if ( (synpred42_test()) ) {
						alt18=1;
					}
					else if ( (synpred45_test()) ) {
						alt18=4;
					}

					}
					break;
				case INT:
					{
					int LA18_5 = input.LA(2);
					if ( (synpred43_test()) ) {
						alt18=2;
					}
					else if ( (synpred45_test()) ) {
						alt18=4;
					}

					}
					break;
				case ELLIPSIS:
					{
					int LA18_6 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt18=4;
					}

					}
					break;
				case DATE:
					{
					int LA18_7 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt18=4;
					}

					}
					break;
				case PHONE_NUMBER:
					{
					int LA18_8 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt18=4;
					}

					}
					break;
				case SPECIAL_SUFFIX:
					{
					int LA18_9 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt18=4;
					}

					}
					break;
				case NON_CONF_SECOND_LINE_COMMENT:
					{
					int LA18_10 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt18=4;
					}

					}
					break;
				case JUDGE_NAME:
					{
					int LA18_12 = input.LA(2);
					if ( (synpred42_test()) ) {
						alt18=1;
					}

					}
					break;
				case PARENTHETICAL_INT:
					{
					int LA18_13 = input.LA(2);
					if ( (synpred42_test()) ) {
						alt18=1;
					}

					}
					break;
				case RALLY_CLASS:
					{
					int LA18_14 = input.LA(2);
					if ( (synpred44_test()) ) {
						alt18=3;
					}

					}
					break;
				case STANDALONE_COMMENT:
					{
					int LA18_15 = input.LA(2);
					if ( (synpred45_test()) ) {
						alt18=4;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:196:6: mName= judge_name
					{
					dbg.location(196,11);
					pushFollow(FOLLOW_judge_name_in_inner_timeblock515);
					mName=judge_name();
					state._fsp--;
					if (state.failed) return array;dbg.location(196,22);
					if ( state.backtracking==0 ) {mCurrentJudge = mName.trim();}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:197:5: nonGroupRing= non_group_ring
					{
					dbg.location(197,17);
					pushFollow(FOLLOW_non_group_ring_in_inner_timeblock525);
					nonGroupRing=non_group_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(198,6);
					if ( state.backtracking==0 ) {
							  	nonGroupRing.addProperty("BlockStart",currentBlockTime);
							  	nonGroupRing.addProperty("Number",mCurrentRingNumber);
							  	nonGroupRing.addProperty("Judge",mCurrentJudge);
							  	nonGroupRing.add("CountAhead",new JsonPrimitive(countAhead));
							  	countAhead+=nonGroupRing.get("Count").getAsInt();
							  	if(!(nonGroupRing.has("type") && nonGroupRing.get("type").getAsString().equals("obedience_with_breed")))array.add(nonGroupRing);
							  	}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:206:5: (mRallyWalkthrough= rally_walkthrough )
					{
					dbg.location(206,5);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:206:5: (mRallyWalkthrough= rally_walkthrough )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:206:6: mRallyWalkthrough= rally_walkthrough
					{
					dbg.location(206,23);
					pushFollow(FOLLOW_rally_walkthrough_in_inner_timeblock542);
					mRallyWalkthrough=rally_walkthrough();
					state._fsp--;
					if (state.failed) return array;dbg.location(207,6);
					if ( state.backtracking==0 ) {
							  	mRallyWalkthrough.addProperty("BlockStart",currentBlockTime);
							  	mRallyWalkthrough.addProperty("Number",mCurrentRingNumber);
							  	mRallyWalkthrough.addProperty("Judge",mCurrentJudge);
							  	array.add(mRallyWalkthrough);
							  	}
					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:213:5: ring_comment
					{
					dbg.location(213,5);
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock557);
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
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt18++;
			} while (true);
			} finally {dbg.exitSubRule(18);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(214, 6);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inner_timeblock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return array;
	}
	// $ANTLR end "inner_timeblock"



	// $ANTLR start "rally_walkthrough"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:218:1: rally_walkthrough returns [JsonObject json] : RALLY_CLASS ;
	public final JsonObject rally_walkthrough() throws RecognitionException {
		JsonObject json = null;


		Token RALLY_CLASS34=null;

		json = new JsonObject();
		try { dbg.enterRule(getGrammarFileName(), "rally_walkthrough");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(218, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:219:33: ( RALLY_CLASS )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:220:3: RALLY_CLASS
			{
			dbg.location(220,3);
			RALLY_CLASS34=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_walkthrough584); if (state.failed) return json;dbg.location(220,14);
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
		dbg.location(220, 155);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rally_walkthrough");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "rally_walkthrough"



	// $ANTLR start "ring_with_breed"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:222:1: ring_with_breed returns [JsonObject json] : breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) ;
	public final JsonObject ring_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT35=null;
		JsonObject breedName =null;
		JsonObject suffix =null;
		JsonObject obedience =null;

		json = new JsonObject();
		try { dbg.enterRule(getGrammarFileName(), "ring_with_breed");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(222, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:223:32: (breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) ) )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:224:2: breedName= breed_name (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			{
			dbg.location(224,11);
			pushFollow(FOLLOW_breed_name_in_ring_with_breed603);
			breedName=breed_name();
			state._fsp--;
			if (state.failed) return json;dbg.location(224,22);
			if ( state.backtracking==0 ) {mergeJson(json,breedName);}dbg.location(225,2);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:225:2: (suffix= special_suffix | (obedience= obedience_with_breed ) | ( ( BREED_COUNT )? ) )
			int alt20=3;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			switch ( input.LA(1) ) {
			case SPECIAL_SUFFIX:
				{
				int LA20_1 = input.LA(2);
				if ( (synpred46_test()) ) {
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
						dbg.recognitionException(nvae);
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
					if ( (synpred47_test()) ) {
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
							dbg.recognitionException(nvae);
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
						dbg.recognitionException(nvae);
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
			case NON_CONF_SECOND_LINE_COMMENT:
			case PARENTHETICAL:
			case PARENTHETICAL_INT:
			case PHONE_NUMBER:
			case RALLY_CLASS:
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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:226:3: suffix= special_suffix
					{
					dbg.location(226,9);
					pushFollow(FOLLOW_special_suffix_in_ring_with_breed614);
					suffix=special_suffix();
					state._fsp--;
					if (state.failed) return json;dbg.location(226,24);
					if ( state.backtracking==0 ) {mergeJson(json,suffix);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:227:3: (obedience= obedience_with_breed )
					{
					dbg.location(227,3);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:227:3: (obedience= obedience_with_breed )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:227:4: obedience= obedience_with_breed
					{
					dbg.location(227,13);
					pushFollow(FOLLOW_obedience_with_breed_in_ring_with_breed623);
					obedience=obedience_with_breed();
					state._fsp--;
					if (state.failed) return json;dbg.location(227,34);
					if ( state.backtracking==0 ) {json.addProperty("type","obedience_with_breed");}
					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:228:3: ( ( BREED_COUNT )? )
					{
					dbg.location(228,3);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:228:3: ( ( BREED_COUNT )? )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:228:4: ( BREED_COUNT )?
					{
					dbg.location(228,4);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:228:4: ( BREED_COUNT )?
					int alt19=2;
					try { dbg.enterSubRule(19);
					try { dbg.enterDecision(19, decisionCanBacktrack[19]);

					int LA19_0 = input.LA(1);
					if ( (LA19_0==BREED_COUNT) ) {
						alt19=1;
					}
					} finally {dbg.exitDecision(19);}

					switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:228:5: BREED_COUNT
							{
							dbg.location(228,5);
							BREED_COUNT35=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_ring_with_breed632); if (state.failed) return json;dbg.location(228,16);
							if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT35!=null?BREED_COUNT35.getText():null));}
							}
							break;

					}
					} finally {dbg.exitSubRule(19);}

					}

					}
					break;

			}
			} finally {dbg.exitSubRule(20);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(228, 80);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ring_with_breed");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "ring_with_breed"



	// $ANTLR start "obedience_with_breed"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:230:1: obedience_with_breed returns [JsonObject json] : COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) ;
	public final JsonObject obedience_with_breed() throws RecognitionException {
		JsonObject json = null;


		Token mEntry=null;
		Token mNumber=null;

		json = new JsonObject(); json.addProperty("Class",mCurrentClass);
		try { dbg.enterRule(getGrammarFileName(), "obedience_with_breed");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(230, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:231:73: ( COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) ) )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:232:2: COMMENT ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
			{
			dbg.location(232,2);
			match(input,COMMENT,FOLLOW_COMMENT_in_obedience_with_breed653); if (state.failed) return json;dbg.location(232,10);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:232:10: ( (mEntry= NON_CONFORMATION_SECOND_LINE ) | (mNumber= INT ) )
			int alt21=2;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:232:11: (mEntry= NON_CONFORMATION_SECOND_LINE )
					{
					dbg.location(232,11);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:232:11: (mEntry= NON_CONFORMATION_SECOND_LINE )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:232:12: mEntry= NON_CONFORMATION_SECOND_LINE
					{
					dbg.location(232,18);
					mEntry=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed659); if (state.failed) return json;dbg.location(232,47);
					if ( state.backtracking==0 ) {json.addProperty("obedienceEntries",(mEntry!=null?mEntry.getText():null)); }
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:232:102: (mNumber= INT )
					{
					dbg.location(232,102);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:232:102: (mNumber= INT )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:232:103: mNumber= INT
					{
					dbg.location(232,110);
					mNumber=(Token)match(input,INT,FOLLOW_INT_in_obedience_with_breed666); if (state.failed) return json;dbg.location(232,114);
					if ( state.backtracking==0 ) {json.addProperty("obedienceEntries",parseIntSafely((mNumber!=null?mNumber.getText():null), 0)); }
					}

					}
					break;

			}
			} finally {dbg.exitSubRule(21);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(232, 188);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "obedience_with_breed");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "obedience_with_breed"



	// $ANTLR start "special_suffix"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:234:1: special_suffix returns [JsonObject json] : SPECIAL_SUFFIX ;
	public final JsonObject special_suffix() throws RecognitionException {
		JsonObject json = null;


		Token SPECIAL_SUFFIX36=null;

		json = new JsonObject();
		try { dbg.enterRule(getGrammarFileName(), "special_suffix");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(234, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:235:32: ( SPECIAL_SUFFIX )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:236:2: SPECIAL_SUFFIX
			{
			dbg.location(236,2);
			SPECIAL_SUFFIX36=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_suffix685); if (state.failed) return json;dbg.location(236,16);
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
		dbg.location(236, 150);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "special_suffix");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "special_suffix"



	// $ANTLR start "breed_name"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:238:1: breed_name returns [JsonObject json] : BREED_NAME ( BREED_NAME_SUFFIX )? ;
	public final JsonObject breed_name() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME37=null;
		Token BREED_NAME_SUFFIX38=null;

		json = new JsonObject(); String breedName ="";
		try { dbg.enterRule(getGrammarFileName(), "breed_name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(238, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:239:55: ( BREED_NAME ( BREED_NAME_SUFFIX )? )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:240:3: BREED_NAME ( BREED_NAME_SUFFIX )?
			{
			dbg.location(240,3);
			BREED_NAME37=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_name704); if (state.failed) return json;dbg.location(240,13);
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME37!=null?BREED_NAME37.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}dbg.location(248,10);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:248:10: ( BREED_NAME_SUFFIX )?
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==BREED_NAME_SUFFIX) ) {
				alt22=1;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:248:11: BREED_NAME_SUFFIX
					{
					dbg.location(248,11);
					BREED_NAME_SUFFIX38=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_name708); if (state.failed) return json;dbg.location(248,28);
					if ( state.backtracking==0 ) {json.addProperty("BreedSuffix", (BREED_NAME_SUFFIX38!=null?BREED_NAME_SUFFIX38.getText():null));}
					}
					break;

			}
			} finally {dbg.exitSubRule(22);}
			dbg.location(248,90);
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
		dbg.location(248, 132);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "breed_name");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "breed_name"



	// $ANTLR start "ring_without_breed"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:251:1: ring_without_breed returns [JsonObject json] : ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) );
	public final JsonObject ring_without_breed() throws RecognitionException {
		JsonObject json = null;


		JsonObject mJuniorRing =null;
		JsonObject mEmptyRing =null;
		JsonObject mRallyRing =null;
		JsonObject mNonConformationRing =null;

		json = new JsonObject(); JsonObject ring;
		try { dbg.enterRule(getGrammarFileName(), "ring_without_breed");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(251, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:252:49: ( (mJuniorRing= junior_ring ) | (mEmptyRing= empty_breed_ring ) | (mRallyRing= rally_ring ) | (mNonConformationRing= non_conformation_ring ) )
			int alt23=4;
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:253:2: (mJuniorRing= junior_ring )
					{
					dbg.location(253,2);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:253:2: (mJuniorRing= junior_ring )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:253:3: mJuniorRing= junior_ring
					{
					dbg.location(253,14);
					pushFollow(FOLLOW_junior_ring_in_ring_without_breed733);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(253,26);
					if ( state.backtracking==0 ) {mergeJson(json,mJuniorRing);}
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:254:2: (mEmptyRing= empty_breed_ring )
					{
					dbg.location(254,2);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:254:2: (mEmptyRing= empty_breed_ring )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:254:3: mEmptyRing= empty_breed_ring
					{
					dbg.location(254,13);
					pushFollow(FOLLOW_empty_breed_ring_in_ring_without_breed742);
					mEmptyRing=empty_breed_ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(254,30);
					if ( state.backtracking==0 ) {mergeJson(json,mEmptyRing);}
					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:255:2: (mRallyRing= rally_ring )
					{
					dbg.location(255,2);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:255:2: (mRallyRing= rally_ring )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:255:3: mRallyRing= rally_ring
					{
					dbg.location(255,13);
					pushFollow(FOLLOW_rally_ring_in_ring_without_breed751);
					mRallyRing=rally_ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(255,24);
					if ( state.backtracking==0 ) {mergeJson(json,mRallyRing);}
					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:256:2: (mNonConformationRing= non_conformation_ring )
					{
					dbg.location(256,2);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:256:2: (mNonConformationRing= non_conformation_ring )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:256:3: mNonConformationRing= non_conformation_ring
					{
					dbg.location(256,23);
					pushFollow(FOLLOW_non_conformation_ring_in_ring_without_breed760);
					mNonConformationRing=non_conformation_ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(256,45);
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
		dbg.location(256, 84);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ring_without_breed");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "ring_without_breed"



	// $ANTLR start "rally_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:268:1: rally_ring returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )? );
	public final JsonObject rally_ring() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		json = new JsonObject();String entries = "";
		try { dbg.enterRule(getGrammarFileName(), "rally_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(268, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:269:53: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )? )
			int alt26=2;
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt26=1;
			}
			else if ( (LA26_0==RALLY_CLASS) ) {
				alt26=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:270:3: (rallyComment= rally_comment )
					{
					dbg.location(270,3);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:270:3: (rallyComment= rally_comment )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:270:4: rallyComment= rally_comment
					{
					dbg.location(270,16);
					pushFollow(FOLLOW_rally_comment_in_rally_ring788);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;dbg.location(270,30);
					if ( state.backtracking==0 ) {json.addProperty("comment", rallyComment);}
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:271:3: (name= rally_ring_name ( (line= rally_entry_line )* ) ) ( NON_CONF_SECOND_LINE_COMMENT )?
					{
					dbg.location(271,3);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:271:3: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:271:5: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					dbg.location(271,9);
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring799);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;dbg.location(271,25);
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}dbg.location(272,3);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:272:3: ( (line= rally_entry_line )* )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:272:4: (line= rally_entry_line )*
					{
					dbg.location(272,4);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:272:4: (line= rally_entry_line )*
					try { dbg.enterSubRule(24);

					loop24:
					do {
						int alt24=2;
						try { dbg.enterDecision(24, decisionCanBacktrack[24]);

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

						} finally {dbg.exitDecision(24);}

						switch (alt24) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:272:5: line= rally_entry_line
							{
							dbg.location(272,9);
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring809);
							line=rally_entry_line();
							state._fsp--;
							if (state.failed) return json;dbg.location(272,26);
							if ( state.backtracking==0 ) {entries+=line+"|";}
							}
							break;

						default :
							break loop24;
						}
					} while (true);
					} finally {dbg.exitSubRule(24);}

					}

					}
					dbg.location(273,3);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:273:3: ( NON_CONF_SECOND_LINE_COMMENT )?
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==NON_CONF_SECOND_LINE_COMMENT) ) {
						int LA25_1 = input.LA(2);
						if ( (synpred56_test()) ) {
							alt25=1;
						}
					}
					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:273:3: NON_CONF_SECOND_LINE_COMMENT
							{
							dbg.location(273,3);
							match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_ring818); if (state.failed) return json;
							}
							break;

					}
					} finally {dbg.exitSubRule(25);}

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
		dbg.location(273, 31);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rally_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "rally_ring"



	// $ANTLR start "empty_breed_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:275:1: empty_breed_ring returns [JsonObject json] : ( BREED_COUNT ) ;
	public final JsonObject empty_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_COUNT39=null;

		json = new JsonObject();
		try { dbg.enterRule(getGrammarFileName(), "empty_breed_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(275, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:276:33: ( ( BREED_COUNT ) )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:277:3: ( BREED_COUNT )
			{
			dbg.location(277,3);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:277:3: ( BREED_COUNT )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:277:4: BREED_COUNT
			{
			dbg.location(277,4);
			BREED_COUNT39=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_empty_breed_ring840); if (state.failed) return json;dbg.location(277,15);
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
		dbg.location(277, 76);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "empty_breed_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "empty_breed_ring"



	// $ANTLR start "non_conformation_breed_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:279:1: non_conformation_breed_ring returns [JsonObject json] : BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) ;
	public final JsonObject non_conformation_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME40=null;

		try { dbg.enterRule(getGrammarFileName(), "non_conformation_breed_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(279, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:279:55: ( BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:280:2: BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE )
			{
			dbg.location(280,2);
			BREED_NAME40=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_non_conformation_breed_ring855); if (state.failed) return json;dbg.location(280,12);
			if ( state.backtracking==0 ) {json.addProperty("NonConformationBreed",(BREED_NAME40!=null?BREED_NAME40.getText():null));}dbg.location(280,73);
			match(input,COMMENT,FOLLOW_COMMENT_in_non_conformation_breed_ring858); if (state.failed) return json;dbg.location(280,81);
			if ( input.LA(1)==INT||input.LA(1)==NON_CONFORMATION_SECOND_LINE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
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
		dbg.location(280, 114);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "non_conformation_breed_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "non_conformation_breed_ring"



	// $ANTLR start "breed_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:282:1: breed_ring returns [JsonObject json] : BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME41=null;
		Token BREED_NAME_SUFFIX42=null;
		Token BREED_COUNT43=null;

		json = new JsonObject();String breedName = "";
		try { dbg.enterRule(getGrammarFileName(), "breed_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(282, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:283:55: ( BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:284:2: BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			dbg.location(284,2);
			BREED_NAME41=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring881); if (state.failed) return json;dbg.location(284,12);
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME41!=null?BREED_NAME41.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}dbg.location(292,10);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:292:10: ( BREED_NAME_SUFFIX )?
			int alt27=2;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==BREED_NAME_SUFFIX) ) {
				alt27=1;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:292:11: BREED_NAME_SUFFIX
					{
					dbg.location(292,11);
					BREED_NAME_SUFFIX42=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring885); if (state.failed) return json;dbg.location(292,28);
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX42!=null?BREED_NAME_SUFFIX42.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(292,76);
			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}dbg.location(292,120);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:292:120: ( BREED_COUNT )?
			int alt28=2;
			try { dbg.enterSubRule(28);
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==BREED_COUNT) ) {
				alt28=1;
			}
			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:292:121: BREED_COUNT
					{
					dbg.location(292,121);
					BREED_COUNT43=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring893); if (state.failed) return json;dbg.location(292,132);
					if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT43!=null?BREED_COUNT43.getText():null));}
					}
					break;

			}
			} finally {dbg.exitSubRule(28);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(292, 194);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "breed_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "breed_ring"



	// $ANTLR start "special_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:295:1: special_ring returns [JsonObject json] : ( BREED_NAME )? ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token BREED_NAME44=null;
		Token SPECIAL_SUFFIX45=null;

		json = new JsonObject();String breedName= ""; String suffix="";
		try { dbg.enterRule(getGrammarFileName(), "special_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(295, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:296:71: ( ( BREED_NAME )? ( SPECIAL_SUFFIX )+ )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:297:3: ( BREED_NAME )? ( SPECIAL_SUFFIX )+
			{
			dbg.location(297,3);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:297:3: ( BREED_NAME )?
			int alt29=2;
			try { dbg.enterSubRule(29);
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			int LA29_0 = input.LA(1);
			if ( (LA29_0==BREED_NAME) ) {
				alt29=1;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:297:4: BREED_NAME
					{
					dbg.location(297,4);
					BREED_NAME44=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring918); if (state.failed) return json;dbg.location(297,14);
					if ( state.backtracking==0 ) {breedName+=(BREED_NAME44!=null?BREED_NAME44.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(29);}
			dbg.location(297,47);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:297:47: ( SPECIAL_SUFFIX )+
			int cnt30=0;
			try { dbg.enterSubRule(30);

			loop30:
			do {
				int alt30=2;
				try { dbg.enterDecision(30, decisionCanBacktrack[30]);

				int LA30_0 = input.LA(1);
				if ( (LA30_0==SPECIAL_SUFFIX) ) {
					alt30=1;
				}

				} finally {dbg.exitDecision(30);}

				switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:297:48: SPECIAL_SUFFIX
					{
					dbg.location(297,48);
					SPECIAL_SUFFIX45=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring924); if (state.failed) return json;dbg.location(298,3);
					if ( state.backtracking==0 ) {suffix+= " " + (SPECIAL_SUFFIX45!=null?SPECIAL_SUFFIX45.getText():null);}
					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(30, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt30++;
			} while (true);
			} finally {dbg.exitSubRule(30);}
			dbg.location(298,44);
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
		dbg.location(306, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "special_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "special_ring"



	// $ANTLR start "group_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:308:1: group_ring returns [String str] : GROUP_RING ( COMMENT | PARENTHETICAL )+ ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_RING46=null;
		Token COMMENT47=null;
		Token PARENTHETICAL48=null;

		try { dbg.enterRule(getGrammarFileName(), "group_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(308, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:309:2: ( GROUP_RING ( COMMENT | PARENTHETICAL )+ )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:309:5: GROUP_RING ( COMMENT | PARENTHETICAL )+
			{
			dbg.location(309,5);
			GROUP_RING46=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring946); if (state.failed) return str;dbg.location(309,15);
			if ( state.backtracking==0 ) {str=(GROUP_RING46!=null?GROUP_RING46.getText():null);}dbg.location(309,39);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:309:39: ( COMMENT | PARENTHETICAL )+
			int cnt31=0;
			try { dbg.enterSubRule(31);

			loop31:
			do {
				int alt31=3;
				try { dbg.enterDecision(31, decisionCanBacktrack[31]);

				int LA31_0 = input.LA(1);
				if ( (LA31_0==COMMENT) ) {
					alt31=1;
				}
				else if ( (LA31_0==PARENTHETICAL) ) {
					alt31=2;
				}

				} finally {dbg.exitDecision(31);}

				switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:309:40: COMMENT
					{
					dbg.location(309,40);
					COMMENT47=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_group_ring950); if (state.failed) return str;dbg.location(309,47);
					if ( state.backtracking==0 ) {str+=" " + (COMMENT47!=null?COMMENT47.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:309:75: PARENTHETICAL
					{
					dbg.location(309,75);
					PARENTHETICAL48=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_group_ring953); if (state.failed) return str;dbg.location(309,88);
					if ( state.backtracking==0 ) {str+= " " + (PARENTHETICAL48!=null?PARENTHETICAL48.getText():null);}
					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(31, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt31++;
			} while (true);
			} finally {dbg.exitSubRule(31);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(309, 123);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "group_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "group_ring"



	// $ANTLR start "group_block"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:310:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME49=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "group_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(310, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:312:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:312:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT
			{
			dbg.location(312,4);
			TIME49=(Token)match(input,TIME,FOLLOW_TIME_in_group_block974); if (state.failed) return json;dbg.location(312,8);
			if ( state.backtracking==0 ) {currentBlockTime=(TIME49!=null?TIME49.getText():null);json.addProperty("TIME", currentBlockTime);}dbg.location(312,82);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:312:82: ( STANDALONE_COMMENT )?
			int alt32=2;
			try { dbg.enterSubRule(32);
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

			int LA32_0 = input.LA(1);
			if ( (LA32_0==STANDALONE_COMMENT) ) {
				alt32=1;
			}
			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:312:82: STANDALONE_COMMENT
					{
					dbg.location(312,82);
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block977); if (state.failed) return json;
					}
					break;

			}
			} finally {dbg.exitSubRule(32);}
			dbg.location(312,102);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:312:102: (mRing= group_ring )+
			int cnt33=0;
			try { dbg.enterSubRule(33);

			loop33:
			do {
				int alt33=2;
				try { dbg.enterDecision(33, decisionCanBacktrack[33]);

				int LA33_0 = input.LA(1);
				if ( (LA33_0==GROUP_RING) ) {
					alt33=1;
				}

				} finally {dbg.exitDecision(33);}

				switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:312:103: mRing= group_ring
					{
					dbg.location(312,108);
					pushFollow(FOLLOW_group_ring_in_group_block983);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(312,120);
					if ( state.backtracking==0 ) {if(!mRelational){json = new JsonObject();String[] arr = parseGroupRing(mRing);json.addProperty("Group", arr[0]);json.addProperty("Judge",arr[1]);json.addProperty("Time",currentBlockTime);mShowRings.add(json);}else{rings.add(new JsonPrimitive(mRing));}}
					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(33, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt33++;
			} while (true);
			} finally {dbg.exitSubRule(33);}
			dbg.location(312,376);
			if ( state.backtracking==0 ) {if(mRelational){json.add("Rings", rings);}}dbg.location(312,421);
			match(input,GROUP_ENDING_ANNOUNCEMENT,FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block991); if (state.failed) return json;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(312, 445);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "group_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "group_block"



	// $ANTLR start "non_conformation_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:318:1: non_conformation_ring returns [JsonObject json] : NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE ) ( NON_CONF_SECOND_LINE_COMMENT )* ;
	public final JsonObject non_conformation_ring() throws RecognitionException {
		JsonObject json = null;


		Token NON_CONFORMATION_CLASS_NAME50=null;
		Token NON_CONFORMATION_SECOND_LINE51=null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "non_conformation_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(318, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:320:2: ( NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE ) ( NON_CONF_SECOND_LINE_COMMENT )* )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:320:4: NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE ) ( NON_CONF_SECOND_LINE_COMMENT )*
			{
			dbg.location(320,4);
			NON_CONFORMATION_CLASS_NAME50=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring1015); if (state.failed) return json;dbg.location(321,4);
			if ( state.backtracking==0 ) {
							mCurrentClass=(NON_CONFORMATION_CLASS_NAME50!=null?NON_CONFORMATION_CLASS_NAME50.getText():null);
							json.addProperty("Class",mCurrentClass);
						}dbg.location(325,3);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:325:3: ( NON_CONFORMATION_SECOND_LINE )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:326:4: NON_CONFORMATION_SECOND_LINE
			{
			dbg.location(326,4);
			NON_CONFORMATION_SECOND_LINE51=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring1030); if (state.failed) return json;dbg.location(327,5);
			if ( state.backtracking==0 ) {
								json.addProperty("Entrants",(NON_CONFORMATION_SECOND_LINE51!=null?NON_CONFORMATION_SECOND_LINE51.getText():null));
							}
			}
			dbg.location(337,3);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:337:3: ( NON_CONF_SECOND_LINE_COMMENT )*
			try { dbg.enterSubRule(34);

			loop34:
			do {
				int alt34=2;
				try { dbg.enterDecision(34, decisionCanBacktrack[34]);

				int LA34_0 = input.LA(1);
				if ( (LA34_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA34_2 = input.LA(2);
					if ( (synpred66_test()) ) {
						alt34=1;
					}

				}

				} finally {dbg.exitDecision(34);}

				switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:337:4: NON_CONF_SECOND_LINE_COMMENT
					{
					dbg.location(337,4);
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring1051); if (state.failed) return json;
					}
					break;

				default :
					break loop34;
				}
			} while (true);
			} finally {dbg.exitSubRule(34);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(337, 33);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "non_conformation_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "non_conformation_ring"



	// $ANTLR start "rally_ring_block"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:340:1: rally_ring_block returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) );
	public final JsonObject rally_ring_block() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		String entries = ""; json = new JsonObject();json.addProperty("Empty","rally: not captured"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}
		try { dbg.enterRule(getGrammarFileName(), "rally_ring_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(340, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:3: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) )
			int alt36=2;
			try { dbg.enterDecision(36, decisionCanBacktrack[36]);

			int LA36_0 = input.LA(1);
			if ( (LA36_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt36=1;
			}
			else if ( (LA36_0==RALLY_CLASS) ) {
				alt36=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(36);}

			switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:5: (rallyComment= rally_comment )
					{
					dbg.location(342,5);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:5: (rallyComment= rally_comment )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:6: rallyComment= rally_comment
					{
					dbg.location(342,18);
					pushFollow(FOLLOW_rally_comment_in_rally_ring_block1075);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;dbg.location(342,32);
					if ( state.backtracking==0 ) {json.addProperty("comment", rallyComment);}
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					{
					dbg.location(342,78);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:80: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					dbg.location(342,84);
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring_block1083);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;dbg.location(342,100);
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}dbg.location(342,138);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:138: ( (line= rally_entry_line )* )
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:139: (line= rally_entry_line )*
					{
					dbg.location(342,139);
					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:139: (line= rally_entry_line )*
					try { dbg.enterSubRule(35);

					loop35:
					do {
						int alt35=2;
						try { dbg.enterDecision(35, decisionCanBacktrack[35]);

						int LA35_0 = input.LA(1);
						if ( (LA35_0==INT||LA35_0==RALLY_ENTRY) ) {
							alt35=1;
						}

						} finally {dbg.exitDecision(35);}

						switch (alt35) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:342:140: line= rally_entry_line
							{
							dbg.location(342,144);
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring_block1090);
							line=rally_entry_line();
							state._fsp--;
							if (state.failed) return json;dbg.location(342,161);
							if ( state.backtracking==0 ) {entries+=line+"|";}
							}
							break;

						default :
							break loop35;
						}
					} while (true);
					} finally {dbg.exitSubRule(35);}

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
		dbg.location(342, 184);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rally_ring_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "rally_ring_block"



	// $ANTLR start "rally_ring_name"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:343:1: rally_ring_name returns [String str] : RALLY_CLASS ;
	public final String rally_ring_name() throws RecognitionException {
		String str = null;


		Token RALLY_CLASS52=null;

		try { dbg.enterRule(getGrammarFileName(), "rally_ring_name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(343, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:344:2: ( RALLY_CLASS )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:344:4: RALLY_CLASS
			{
			dbg.location(344,4);
			RALLY_CLASS52=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_ring_name1107); if (state.failed) return str;dbg.location(344,15);
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
		dbg.location(344, 38);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rally_ring_name");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "rally_ring_name"



	// $ANTLR start "rally_entry_line"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:347:1: rally_entry_line returns [String str] : ( ( INT )? RALLY_ENTRY ) ;
	public final String rally_entry_line() throws RecognitionException {
		String str = null;


		Token INT53=null;
		Token RALLY_ENTRY54=null;

		str="";
		try { dbg.enterRule(getGrammarFileName(), "rally_entry_line");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(347, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:348:16: ( ( ( INT )? RALLY_ENTRY ) )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:349:3: ( ( INT )? RALLY_ENTRY )
			{
			dbg.location(349,3);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:349:3: ( ( INT )? RALLY_ENTRY )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:349:4: ( INT )? RALLY_ENTRY
			{
			dbg.location(349,4);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:349:4: ( INT )?
			int alt37=2;
			try { dbg.enterSubRule(37);
			try { dbg.enterDecision(37, decisionCanBacktrack[37]);

			int LA37_0 = input.LA(1);
			if ( (LA37_0==INT) ) {
				alt37=1;
			}
			} finally {dbg.exitDecision(37);}

			switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:349:4: INT
					{
					dbg.location(349,4);
					INT53=(Token)match(input,INT,FOLLOW_INT_in_rally_entry_line1129); if (state.failed) return str;
					}
					break;

			}
			} finally {dbg.exitSubRule(37);}
			dbg.location(349,8);
			if ( state.backtracking==0 ) {str+=(INT53!=null?INT53.getText():null);}dbg.location(349,26);
			RALLY_ENTRY54=(Token)match(input,RALLY_ENTRY,FOLLOW_RALLY_ENTRY_in_rally_entry_line1133); if (state.failed) return str;dbg.location(349,37);
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
		dbg.location(349, 66);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rally_entry_line");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "rally_entry_line"



	// $ANTLR start "rally_comment"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:351:1: rally_comment returns [String str] : ( NON_CONF_SECOND_LINE_COMMENT )+ ;
	public final String rally_comment() throws RecognitionException {
		String str = null;


		Token NON_CONF_SECOND_LINE_COMMENT55=null;

		str="";
		try { dbg.enterRule(getGrammarFileName(), "rally_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(351, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:352:16: ( ( NON_CONF_SECOND_LINE_COMMENT )+ )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:353:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			{
			dbg.location(353,3);
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:353:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			int cnt38=0;
			try { dbg.enterSubRule(38);

			loop38:
			do {
				int alt38=2;
				try { dbg.enterDecision(38, decisionCanBacktrack[38]);

				int LA38_0 = input.LA(1);
				if ( (LA38_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA38_2 = input.LA(2);
					if ( (synpred70_test()) ) {
						alt38=1;
					}

				}

				} finally {dbg.exitDecision(38);}

				switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:353:4: NON_CONF_SECOND_LINE_COMMENT
					{
					dbg.location(353,4);
					NON_CONF_SECOND_LINE_COMMENT55=(Token)match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1154); if (state.failed) return str;dbg.location(353,32);
					if ( state.backtracking==0 ) {str+=" "+(NON_CONF_SECOND_LINE_COMMENT55!=null?NON_CONF_SECOND_LINE_COMMENT55.getText():null);}
					}
					break;

				default :
					if ( cnt38 >= 1 ) break loop38;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(38, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt38++;
			} while (true);
			} finally {dbg.exitSubRule(38);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(353, 79);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rally_comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "rally_comment"



	// $ANTLR start "junior_ring"
	// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:360:1: junior_ring returns [JsonObject json] : JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token JUNIOR_CLASS56=null;

		json = new JsonObject();
		try { dbg.enterRule(getGrammarFileName(), "junior_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(360, 0);

		try {
			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:361:33: ( JUNIOR_CLASS )
			dbg.enterAlt(1);

			// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:362:3: JUNIOR_CLASS
			{
			dbg.location(362,3);
			JUNIOR_CLASS56=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring1179); if (state.failed) return json;dbg.location(362,15);
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
		dbg.location(362, 66);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "junior_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "junior_ring"

	// $ANTLR start synpred2_test
	public final void synpred2_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:95: ( ring )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:149:96: ring
		{
		dbg.location(149,96);
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
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:164:5: JUDGE_NAME
		{
		dbg.location(164,5);
		match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_synpred8_test217); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred8_test

	// $ANTLR start synpred10_test
	public final void synpred10_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:4: ( COMMENT )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:4: COMMENT
		{
		dbg.location(165,4);
		match(input,COMMENT,FOLLOW_COMMENT_in_synpred10_test226); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred10_test

	// $ANTLR start synpred11_test
	public final void synpred11_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:37: ( PARENTHETICAL )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:37: PARENTHETICAL
		{
		dbg.location(165,37);
		match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_synpred11_test229); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred11_test

	// $ANTLR start synpred12_test
	public final void synpred12_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:82: ( PARENTHETICAL_INT )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:165:82: PARENTHETICAL_INT
		{
		dbg.location(165,82);
		match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_synpred12_test232); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred12_test

	// $ANTLR start synpred13_test
	public final void synpred13_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:8: (mComment= comment )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:8: mComment= comment
		{
		dbg.location(168,16);
		pushFollow(FOLLOW_comment_in_synpred13_test261);
		mComment=comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred13_test

	// $ANTLR start synpred14_test
	public final void synpred14_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:42: ( TIME )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:42: TIME
		{
		dbg.location(168,42);
		match(input,TIME,FOLLOW_TIME_in_synpred14_test264); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred14_test

	// $ANTLR start synpred15_test
	public final void synpred15_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:64: ( PHONE_NUMBER )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:64: PHONE_NUMBER
		{
		dbg.location(168,64);
		match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_synpred15_test267); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred15_test

	// $ANTLR start synpred16_test
	public final void synpred16_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:102: ( BREED_NAME )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:168:102: BREED_NAME
		{
		dbg.location(168,102);
		match(input,BREED_NAME,FOLLOW_BREED_NAME_in_synpred16_test270); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred16_test

	// $ANTLR start synpred39_test
	public final void synpred39_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:352: (mComment= timeblock_comment )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:352: mComment= timeblock_comment
		{
		dbg.location(183,360);
		pushFollow(FOLLOW_timeblock_comment_in_synpred39_test444);
		mComment=timeblock_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred39_test

	// $ANTLR start synpred40_test
	public final void synpred40_test_fragment() throws RecognitionException {
		JsonArray rings =null;
		String mComment =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:178: (rings= inner_timeblock (mComment= timeblock_comment )* )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:178: rings= inner_timeblock (mComment= timeblock_comment )*
		{
		dbg.location(183,183);
		pushFollow(FOLLOW_inner_timeblock_in_synpred40_test438);
		rings=inner_timeblock();
		state._fsp--;
		if (state.failed) return ;dbg.location(183,351);
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:351: (mComment= timeblock_comment )*
		try { dbg.enterSubRule(41);

		loop41:
		do {
			int alt41=2;
			try { dbg.enterDecision(41, decisionCanBacktrack[41]);

			int LA41_0 = input.LA(1);
			if ( (LA41_0==BREED_NAME||(LA41_0 >= COMMENT && LA41_0 <= ELLIPSIS)||LA41_0==INT||LA41_0==NON_CONFORMATION_CLASS_NAME||(LA41_0 >= NON_CONF_SECOND_LINE_COMMENT && LA41_0 <= PARENTHETICAL)||LA41_0==PHONE_NUMBER||LA41_0==SPECIAL_SUFFIX) ) {
				alt41=1;
			}

			} finally {dbg.exitDecision(41);}

			switch (alt41) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:183:352: mComment= timeblock_comment
				{
				dbg.location(183,360);
				pushFollow(FOLLOW_timeblock_comment_in_synpred40_test444);
				mComment=timeblock_comment();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				break loop41;
			}
		} while (true);
		} finally {dbg.exitSubRule(41);}

		}

	}
	// $ANTLR end synpred40_test

	// $ANTLR start synpred42_test
	public final void synpred42_test_fragment() throws RecognitionException {
		String mName =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:196:6: (mName= judge_name )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:196:6: mName= judge_name
		{
		dbg.location(196,11);
		pushFollow(FOLLOW_judge_name_in_synpred42_test515);
		mName=judge_name();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred42_test

	// $ANTLR start synpred43_test
	public final void synpred43_test_fragment() throws RecognitionException {
		JsonObject nonGroupRing =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:197:5: (nonGroupRing= non_group_ring )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:197:5: nonGroupRing= non_group_ring
		{
		dbg.location(197,17);
		pushFollow(FOLLOW_non_group_ring_in_synpred43_test525);
		nonGroupRing=non_group_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred43_test

	// $ANTLR start synpred44_test
	public final void synpred44_test_fragment() throws RecognitionException {
		JsonObject mRallyWalkthrough =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:206:5: ( (mRallyWalkthrough= rally_walkthrough ) )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:206:5: (mRallyWalkthrough= rally_walkthrough )
		{
		dbg.location(206,5);
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:206:5: (mRallyWalkthrough= rally_walkthrough )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:206:6: mRallyWalkthrough= rally_walkthrough
		{
		dbg.location(206,23);
		pushFollow(FOLLOW_rally_walkthrough_in_synpred44_test542);
		mRallyWalkthrough=rally_walkthrough();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred44_test

	// $ANTLR start synpred45_test
	public final void synpred45_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:213:5: ( ring_comment )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:213:5: ring_comment
		{
		dbg.location(213,5);
		pushFollow(FOLLOW_ring_comment_in_synpred45_test557);
		ring_comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred45_test

	// $ANTLR start synpred46_test
	public final void synpred46_test_fragment() throws RecognitionException {
		JsonObject suffix =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:226:3: (suffix= special_suffix )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:226:3: suffix= special_suffix
		{
		dbg.location(226,9);
		pushFollow(FOLLOW_special_suffix_in_synpred46_test614);
		suffix=special_suffix();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred46_test

	// $ANTLR start synpred47_test
	public final void synpred47_test_fragment() throws RecognitionException {
		JsonObject obedience =null;

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:227:3: ( (obedience= obedience_with_breed ) )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:227:3: (obedience= obedience_with_breed )
		{
		dbg.location(227,3);
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:227:3: (obedience= obedience_with_breed )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:227:4: obedience= obedience_with_breed
		{
		dbg.location(227,13);
		pushFollow(FOLLOW_obedience_with_breed_in_synpred47_test623);
		obedience=obedience_with_breed();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred47_test

	// $ANTLR start synpred56_test
	public final void synpred56_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:273:3: ( NON_CONF_SECOND_LINE_COMMENT )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:273:3: NON_CONF_SECOND_LINE_COMMENT
		{
		dbg.location(273,3);
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred56_test818); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred56_test

	// $ANTLR start synpred66_test
	public final void synpred66_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:337:4: ( NON_CONF_SECOND_LINE_COMMENT )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:337:4: NON_CONF_SECOND_LINE_COMMENT
		{
		dbg.location(337,4);
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred66_test1051); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred66_test

	// $ANTLR start synpred70_test
	public final void synpred70_test_fragment() throws RecognitionException {
		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:353:4: ( NON_CONF_SECOND_LINE_COMMENT )
		dbg.enterAlt(1);

		// C:\\Users\\taylorc\\Development\\dogshow\\grammar\\ANTLR\\test.g:353:4: NON_CONF_SECOND_LINE_COMMENT
		{
		dbg.location(353,4);
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred70_test1154); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred70_test

	// Delegated rules

	public final boolean synpred39_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred39_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred66_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred66_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred13_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred2_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred8_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred44_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred44_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred14_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred14_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred40_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred47_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred47_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred12_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred45_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred45_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred10_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred11_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred56_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred56_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred42_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred42_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred15_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred70_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred70_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred46_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred46_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred43_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred43_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred16_test_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
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
	public static final BitSet FOLLOW_COMMENT_in_judge_name226 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_judge_name229 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_judge_name232 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_comment_in_big_comment261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_big_comment267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_comment305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_comment308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_comment314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_timeblock_comment354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_timeblock_comment357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_timeblock_comment360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock_comment363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_timeblock_comment366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_timeblock_comment369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_timeblock_comment372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_timeblock_comment377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_ring_comment402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock425 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FOLLOWING_TIME_in_timeblock428 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_TIME_in_timeblock431 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock438 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock444 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_INT_in_non_group_ring467 = new BitSet(new long[]{0x0084500000000050L});
	public static final BitSet FOLLOW_ring_with_breed_in_non_group_ring477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_without_breed_in_non_group_ring486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_judge_name_in_inner_timeblock515 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_non_group_ring_in_inner_timeblock525 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_rally_walkthrough_in_inner_timeblock542 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock557 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_walkthrough584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_name_in_ring_with_breed603 = new BitSet(new long[]{0x0400000000000112L});
	public static final BitSet FOLLOW_special_suffix_in_ring_with_breed614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_ring_with_breed623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_ring_with_breed632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_obedience_with_breed653 = new BitSet(new long[]{0x0002040000000000L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_obedience_with_breed659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_obedience_with_breed666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_suffix685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_name704 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_name708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_ring_without_breed733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_breed_ring_in_ring_without_breed742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_in_ring_without_breed751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_conformation_ring_in_ring_without_breed760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring799 = new BitSet(new long[]{0x0104040000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring809 = new BitSet(new long[]{0x0104040000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_ring818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_COUNT_in_empty_breed_ring840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_non_conformation_breed_ring855 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_non_conformation_breed_ring858 = new BitSet(new long[]{0x0002040000000000L});
	public static final BitSet FOLLOW_set_in_non_conformation_breed_ring860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring881 = new BitSet(new long[]{0x0000000000000092L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring885 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring918 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring924 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring946 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_group_ring950 = new BitSet(new long[]{0x0008000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_group_ring953 = new BitSet(new long[]{0x0008000000000102L});
	public static final BitSet FOLLOW_TIME_in_group_block974 = new BitSet(new long[]{0x0800020000000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block977 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block983 = new BitSet(new long[]{0x0000028000000000L});
	public static final BitSet FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring1015 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring1030 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring1051 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring_block1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring_block1083 = new BitSet(new long[]{0x0100040000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring_block1090 = new BitSet(new long[]{0x0100040000000002L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_ring_name1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_rally_entry_line1129 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RALLY_ENTRY_in_rally_entry_line1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment1154 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred2_test71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_synpred8_test217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_synpred10_test226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_synpred11_test229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_synpred12_test232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred13_test261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_synpred14_test264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_synpred15_test267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_synpred16_test270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred39_test444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred40_test438 = new BitSet(new long[]{0x044C440000000742L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred40_test444 = new BitSet(new long[]{0x044C440000000742L});
	public static final BitSet FOLLOW_judge_name_in_synpred42_test515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_group_ring_in_synpred43_test525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_walkthrough_in_synpred44_test542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_synpred45_test557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_suffix_in_synpred46_test614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_obedience_with_breed_in_synpred47_test623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred56_test818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred66_test1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred70_test1154 = new BitSet(new long[]{0x0000000000000002L});
}
