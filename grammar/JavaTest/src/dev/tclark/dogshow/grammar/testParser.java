// $ANTLR 3.x C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-11-18 18:44:22

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
	"invalidRule", "synpred5_test", "synpred18_test", "synpred26_test", "synpred47_test", 
    "synpred10_test", "non_conformation_ring", "synpred9_test", "synpred32_test", 
    "synpred11_test", "synpred33_test", "synpred28_test", "synpred2_test", 
    "synpred56_test", "synpred64_test", "rally_comment", "synpred1_test", 
    "synpred38_test", "synpred20_test", "synpred63_test", "synpred22_test", 
    "synpred45_test", "breed_ring", "synpred8_test", "synpred31_test", "synpred42_test", 
    "synpred23_test", "synpred24_test", "synpred53_test", "inner_ring", 
    "rally_ring_name", "synpred62_test", "synpred66_test", "synpred55_test", 
    "test_breed", "synpred35_test", "group_block", "start", "synpred7_test", 
    "synpred29_test", "special_ring", "synpred65_test", "synpred12_test", 
    "test_special", "synpred3_test", "synpred49_test", "synpred25_test", 
    "synpred15_test", "synpred60_test", "synpred51_test", "synpred4_test", 
    "synpred21_test", "synpred50_test", "synpred52_test", "group_ring", 
    "synpred46_test", "judge_block", "synpred44_test", "junior_ring", "synpred61_test", 
    "synpred34_test", "big_comment", "comment", "synpred43_test", "synpred27_test", 
    "synpred6_test", "synpred40_test", "non_conformation_breed_ring", "empty_breed_ring", 
    "rally_ring_block", "synpred58_test", "synpred19_test", "timeblock", 
    "synpred67_test", "synpred13_test", "rally_entry_line", "inner_timeblock", 
    "judge_name", "synpred30_test", "ring", "synpred36_test", "synpred41_test", 
    "synpred14_test", "synpred59_test", "synpred48_test", "synpred39_test", 
    "synpred37_test", "synpred16_test", "synpred54_test", "timeblock_comment", 
    "synpred17_test", "synpred57_test", "ring_comment"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
	false, // invalid decision
	false, false, false, false, false, false, false, true, true, false, true, 
	    false, false, false, false, true, true, true, false, true, false, false, 
	    false, false, false, false, true, false, false, false, false, true, 
	    false, false, false
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
		try { dbg.enterRule(getGrammarFileName(), "test_special");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:13: ( ( special_ring )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:17: ( special_ring )+
			{
			dbg.location(121,17);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:17: ( special_ring )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			do {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==INT) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:121:17: special_ring
					{
					dbg.location(121,17);
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
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt1++;
			} while (true);
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(121, 29);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "test_special");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "test_special"



	// $ANTLR start "test_breed"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:122:1: test_breed : breed_ring ;
	public final void test_breed() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "test_breed");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(122, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:123:5: ( breed_ring )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:123:9: breed_ring
			{
			dbg.location(123,9);
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
		dbg.location(123, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "test_breed");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ;
	}
	// $ANTLR end "test_breed"



	// $ANTLR start "start"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:124:1: start returns [JsonObject json] : (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF ;
	public final JsonObject start() throws RecognitionException {
		JsonObject json = null;


		String mComment =null;
		JsonObject mRing =null;

		json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "start");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(124, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:3: ( (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:4: (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF
			{
			dbg.location(126,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:4: (mComment= big_comment )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			do {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==BREED_NAME||(LA2_0 >= COMMENT && LA2_0 <= ELLIPSIS)||(LA2_0 >= GROUP_RING && LA2_0 <= INT)||LA2_0==NON_CONFORMATION_CLASS_NAME||LA2_0==NON_CONFORMATION_SECOND_LINE||LA2_0==PARENTHETICAL||LA2_0==PHONE_NUMBER||LA2_0==SPECIAL_SUFFIX||LA2_0==TIME) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:5: mComment= big_comment
					{
					dbg.location(126,13);
					pushFollow(FOLLOW_big_comment_in_start85);
					mComment=big_comment();
					state._fsp--;
					if (state.failed) return json;dbg.location(126,25);
					if ( state.backtracking==0 ) {comments+=mComment;}
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
			dbg.location(126,54);
			if ( state.backtracking==0 ) {json.addProperty("Comment", comments);}dbg.location(126,94);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:94: ( ( ring )=>mRing= ring )+
			int cnt3=0;
			try { dbg.enterSubRule(3);

			loop3:
			do {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==RING_TITLE) && (synpred3_test())) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:95: ( ring )=>mRing= ring
					{
					dbg.location(126,108);
					pushFollow(FOLLOW_ring_in_start98);
					mRing=ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(126,113);
					if ( state.backtracking==0 ) {ringArray.add(mRing);}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(3, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt3++;
			} while (true);
			} finally {dbg.exitSubRule(3);}
			dbg.location(126,145);
			if ( state.backtracking==0 ) {json.add("Rings", ringArray); if(!mRelational){json = new JsonObject(); json.add("Rings", mShowRings);}}dbg.location(126,251);
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
		dbg.location(126, 253);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:129:1: ring returns [JsonObject json] : RING_TITLE mRing= inner_ring ;
	public final JsonObject ring() throws RecognitionException {
		JsonObject json = null;


		Token RING_TITLE1=null;
		JsonObject mRing =null;

		json = new JsonObject();if(debug){System.out.println("ring...");}
		try { dbg.enterRule(getGrammarFileName(), "ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(129, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:131:3: ( RING_TITLE mRing= inner_ring )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:131:7: RING_TITLE mRing= inner_ring
			{
			dbg.location(131,7);
			RING_TITLE1=(Token)match(input,RING_TITLE,FOLLOW_RING_TITLE_in_ring131); if (state.failed) return json;dbg.location(131,17);
			if ( state.backtracking==0 ) {json.addProperty("Title", (RING_TITLE1!=null?RING_TITLE1.getText():null)); json.addProperty("Number", parseRingNumber((RING_TITLE1!=null?RING_TITLE1.getText():null)));if(!mRelational){mCurrentRingNumber=parseRingNumber((RING_TITLE1!=null?RING_TITLE1.getText():null));}}dbg.location(131,203);
			pushFollow(FOLLOW_inner_ring_in_ring136);
			mRing=inner_ring();
			state._fsp--;
			if (state.failed) return json;dbg.location(131,214);
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
		dbg.location(131, 239);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:132:1: inner_ring returns [JsonObject json] : ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) );
	public final JsonObject inner_ring() throws RecognitionException {
		JsonObject json = null;


		JsonObject mGroupBlock =null;
		JsonObject mJugeBlock =null;

		json = new JsonObject();JsonArray judgeBlocks = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "inner_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(132, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:2: ( ( ( group_block )=>mGroupBlock= group_block ( comment )* ) | ( (mJugeBlock= judge_block )+ ) )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==TIME) ) {
				alt6=1;
			}
			else if ( (LA6_0==COMMENT||LA6_0==JUDGE_NAME||(LA6_0 >= PARENTHETICAL && LA6_0 <= PARENTHETICAL_INT)) ) {
				alt6=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					{
					dbg.location(134,5);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:5: ( ( group_block )=>mGroupBlock= group_block ( comment )* )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:6: ( group_block )=>mGroupBlock= group_block ( comment )*
					{
					dbg.location(134,32);
					pushFollow(FOLLOW_group_block_in_inner_ring162);
					mGroupBlock=group_block();
					state._fsp--;
					if (state.failed) return json;dbg.location(134,44);
					if ( state.backtracking==0 ) {json.add("GroupRing", mGroupBlock);}dbg.location(134,82);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:82: ( comment )*
					try { dbg.enterSubRule(4);

					loop4:
					do {
						int alt4=2;
						try { dbg.enterDecision(4, decisionCanBacktrack[4]);

						int LA4_0 = input.LA(1);
						if ( (LA4_0==BREED_NAME||(LA4_0 >= COMMENT && LA4_0 <= ELLIPSIS)||LA4_0==INT||LA4_0==NON_CONFORMATION_CLASS_NAME||LA4_0==NON_CONFORMATION_SECOND_LINE||LA4_0==PARENTHETICAL||LA4_0==PHONE_NUMBER||LA4_0==TIME) ) {
							alt4=1;
						}

						} finally {dbg.exitDecision(4);}

						switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:134:82: comment
							{
							dbg.location(134,82);
							pushFollow(FOLLOW_comment_in_inner_ring165);
							comment();
							state._fsp--;
							if (state.failed) return json;
							}
							break;

						default :
							break loop4;
						}
					} while (true);
					} finally {dbg.exitSubRule(4);}

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:7: ( (mJugeBlock= judge_block )+ )
					{
					dbg.location(135,7);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:7: ( (mJugeBlock= judge_block )+ )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:8: (mJugeBlock= judge_block )+
					{
					dbg.location(135,8);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:8: (mJugeBlock= judge_block )+
					int cnt5=0;
					try { dbg.enterSubRule(5);

					loop5:
					do {
						int alt5=2;
						try { dbg.enterDecision(5, decisionCanBacktrack[5]);

						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMENT||LA5_0==JUDGE_NAME||(LA5_0 >= PARENTHETICAL && LA5_0 <= PARENTHETICAL_INT)) ) {
							alt5=1;
						}

						} finally {dbg.exitDecision(5);}

						switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:135:9: mJugeBlock= judge_block
							{
							dbg.location(135,19);
							pushFollow(FOLLOW_judge_block_in_inner_ring179);
							mJugeBlock=judge_block();
							state._fsp--;
							if (state.failed) return json;dbg.location(135,31);
							if ( state.backtracking==0 ) {judgeBlocks.add(mJugeBlock);}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							if (state.backtracking>0) {state.failed=true; return json;}
								EarlyExitException eee =
									new EarlyExitException(5, input);
								dbg.recognitionException(eee);

								throw eee;
						}
						cnt5++;
					} while (true);
					} finally {dbg.exitSubRule(5);}
					dbg.location(135,64);
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
		dbg.location(135, 103);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:136:1: judge_block returns [JsonObject json] : mName= judge_name (mBlock= timeblock )+ ;
	public final JsonObject judge_block() throws RecognitionException {
		JsonObject json = null;


		String mName =null;
		JsonObject mBlock =null;

		json = new JsonObject(); JsonArray array = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "judge_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(136, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:5: (mName= judge_name (mBlock= timeblock )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:9: mName= judge_name (mBlock= timeblock )+
			{
			dbg.location(138,14);
			pushFollow(FOLLOW_judge_name_in_judge_block209);
			mName=judge_name();
			state._fsp--;
			if (state.failed) return json;dbg.location(138,25);
			if ( state.backtracking==0 ) {json.addProperty("Judge", mName); if(!mRelational){mCurrentJudge = mName;}}dbg.location(138,102);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:102: (mBlock= timeblock )+
			int cnt7=0;
			try { dbg.enterSubRule(7);

			loop7:
			do {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==INT||LA7_0==TIME) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:138:103: mBlock= timeblock
					{
					dbg.location(138,109);
					pushFollow(FOLLOW_timeblock_in_judge_block215);
					mBlock=timeblock();
					state._fsp--;
					if (state.failed) return json;dbg.location(138,119);
					if ( state.backtracking==0 ) {array.add(mBlock);}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(7, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt7++;
			} while (true);
			} finally {dbg.exitSubRule(7);}
			dbg.location(138,142);
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
		dbg.location(138, 173);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:139:1: judge_name returns [String str] : ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ );
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
		dbg.location(139, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:2: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+ )
			int alt10=2;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==JUDGE_NAME) ) {
				alt10=1;
			}
			else if ( (LA10_0==COMMENT||(LA10_0 >= PARENTHETICAL && LA10_0 <= PARENTHETICAL_INT)) ) {
				alt10=2;
			}
			else {
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:4: ( JUDGE_NAME )+
					{
					dbg.location(141,4);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:4: ( JUDGE_NAME )+
					int cnt8=0;
					try { dbg.enterSubRule(8);

					loop8:
					do {
						int alt8=2;
						try { dbg.enterDecision(8, decisionCanBacktrack[8]);

						int LA8_0 = input.LA(1);
						if ( (LA8_0==JUDGE_NAME) ) {
							int LA8_2 = input.LA(2);
							if ( (synpred9_test()) ) {
								alt8=1;
							}

						}

						} finally {dbg.exitDecision(8);}

						switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:5: JUDGE_NAME
							{
							dbg.location(141,5);
							JUDGE_NAME2=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_name239); if (state.failed) return str;dbg.location(141,15);
							if ( state.backtracking==0 ) {str+=(JUDGE_NAME2!=null?JUDGE_NAME2.getText():null);}
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
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:42: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					{
					dbg.location(141,42);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:42: ( COMMENT | PARENTHETICAL | PARENTHETICAL_INT )+
					int cnt9=0;
					try { dbg.enterSubRule(9);

					loop9:
					do {
						int alt9=4;
						try { dbg.enterDecision(9, decisionCanBacktrack[9]);

						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA9_2 = input.LA(2);
							if ( (synpred11_test()) ) {
								alt9=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA9_3 = input.LA(2);
							if ( (synpred12_test()) ) {
								alt9=2;
							}

							}
							break;
						case PARENTHETICAL_INT:
							{
							int LA9_4 = input.LA(2);
							if ( (synpred13_test()) ) {
								alt9=3;
							}

							}
							break;
						}
						} finally {dbg.exitDecision(9);}

						switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:43: COMMENT
							{
							dbg.location(141,43);
							COMMENT3=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_judge_name245); if (state.failed) return str;dbg.location(141,50);
							if ( state.backtracking==0 ) {str+=(COMMENT3!=null?COMMENT3.getText():null)+" ";}
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:76: PARENTHETICAL
							{
							dbg.location(141,76);
							PARENTHETICAL4=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_judge_name248); if (state.failed) return str;dbg.location(141,89);
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL4!=null?PARENTHETICAL4.getText():null)+" ";}
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:121: PARENTHETICAL_INT
							{
							dbg.location(141,121);
							PARENTHETICAL_INT5=(Token)match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_judge_name251); if (state.failed) return str;dbg.location(141,138);
							if ( state.backtracking==0 ) {str+=(PARENTHETICAL_INT5!=null?PARENTHETICAL_INT5.getText():null)+" ";}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							if (state.backtracking>0) {state.failed=true; return str;}
								EarlyExitException eee =
									new EarlyExitException(9, input);
								dbg.recognitionException(eee);

								throw eee;
						}
						cnt9++;
					} while (true);
					} finally {dbg.exitSubRule(9);}

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
		dbg.location(141, 174);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:142:1: big_comment returns [String str] : (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) ;
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
		dbg.location(142, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:3: ( (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			{
			dbg.location(144,7);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING | NON_CONFORMATION_SECOND_LINE )
			int alt11=7;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			switch ( input.LA(1) ) {
			case COMMENT:
			case DATE:
			case ELLIPSIS:
			case INT:
			case NON_CONFORMATION_CLASS_NAME:
			case PARENTHETICAL:
				{
				alt11=1;
				}
				break;
			case BREED_NAME:
				{
				int LA11_2 = input.LA(2);
				if ( (synpred14_test()) ) {
					alt11=1;
				}
				else if ( (synpred17_test()) ) {
					alt11=4;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 2, input);
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
				int LA11_3 = input.LA(2);
				if ( (synpred14_test()) ) {
					alt11=1;
				}
				else if ( (synpred15_test()) ) {
					alt11=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 3, input);
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
				int LA11_4 = input.LA(2);
				if ( (synpred14_test()) ) {
					alt11=1;
				}
				else if ( (synpred16_test()) ) {
					alt11=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 4, input);
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
				int LA11_5 = input.LA(2);
				if ( (synpred14_test()) ) {
					alt11=1;
				}
				else if ( (true) ) {
					alt11=7;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return str;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 5, input);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:8: mComment= comment
					{
					dbg.location(144,16);
					pushFollow(FOLLOW_comment_in_big_comment280);
					mComment=comment();
					state._fsp--;
					if (state.failed) return str;dbg.location(144,24);
					if ( state.backtracking==0 ) {str = mComment;}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:42: TIME
					{
					dbg.location(144,42);
					TIME6=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment283); if (state.failed) return str;dbg.location(144,46);
					if ( state.backtracking==0 ) {str=(TIME6!=null?TIME6.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:64: PHONE_NUMBER
					{
					dbg.location(144,64);
					PHONE_NUMBER7=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_big_comment286); if (state.failed) return str;dbg.location(144,76);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER7!=null?PHONE_NUMBER7.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:102: BREED_NAME
					{
					dbg.location(144,102);
					BREED_NAME8=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment289); if (state.failed) return str;dbg.location(144,112);
					if ( state.backtracking==0 ) {str=(BREED_NAME8!=null?BREED_NAME8.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:136: SPECIAL_SUFFIX
					{
					dbg.location(144,136);
					SPECIAL_SUFFIX9=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment292); if (state.failed) return str;dbg.location(144,150);
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX9!=null?SPECIAL_SUFFIX9.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:178: GROUP_RING
					{
					dbg.location(144,178);
					GROUP_RING10=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment295); if (state.failed) return str;dbg.location(144,188);
					if ( state.backtracking==0 ) {str=(GROUP_RING10!=null?GROUP_RING10.getText():null);}
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:212: NON_CONFORMATION_SECOND_LINE
					{
					dbg.location(144,212);
					NON_CONFORMATION_SECOND_LINE11=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment298); if (state.failed) return str;dbg.location(144,240);
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_SECOND_LINE11!=null?NON_CONFORMATION_SECOND_LINE11.getText():null);}
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
		dbg.location(144, 281);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:146:1: comment returns [String str] : ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) ;
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
		dbg.location(146, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:3: ( ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
			{
			dbg.location(148,5);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | NON_CONFORMATION_SECOND_LINE )
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
			case TIME:
				{
				alt12=3;
				}
				break;
			case COMMENT:
				{
				alt12=4;
				}
				break;
			case PARENTHETICAL:
				{
				alt12=5;
				}
				break;
			case INT:
				{
				alt12=6;
				}
				break;
			case ELLIPSIS:
				{
				alt12=7;
				}
				break;
			case DATE:
				{
				alt12=8;
				}
				break;
			case PHONE_NUMBER:
				{
				alt12=9;
				}
				break;
			case NON_CONFORMATION_SECOND_LINE:
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:6: NON_CONFORMATION_CLASS_NAME
					{
					dbg.location(148,6);
					NON_CONFORMATION_CLASS_NAME12=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment321); if (state.failed) return str;dbg.location(148,33);
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME12!=null?NON_CONFORMATION_CLASS_NAME12.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:74: BREED_NAME
					{
					dbg.location(148,74);
					BREED_NAME13=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_comment324); if (state.failed) return str;dbg.location(148,84);
					if ( state.backtracking==0 ) {str=(BREED_NAME13!=null?BREED_NAME13.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:108: TIME
					{
					dbg.location(148,108);
					TIME14=(Token)match(input,TIME,FOLLOW_TIME_in_comment327); if (state.failed) return str;dbg.location(148,112);
					if ( state.backtracking==0 ) {str=(TIME14!=null?TIME14.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:130: COMMENT
					{
					dbg.location(148,130);
					COMMENT15=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment330); if (state.failed) return str;dbg.location(148,137);
					if ( state.backtracking==0 ) {str=(COMMENT15!=null?COMMENT15.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:158: PARENTHETICAL
					{
					dbg.location(148,158);
					PARENTHETICAL16=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment333); if (state.failed) return str;dbg.location(148,171);
					if ( state.backtracking==0 ) {str=(PARENTHETICAL16!=null?PARENTHETICAL16.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:198: INT
					{
					dbg.location(148,198);
					INT17=(Token)match(input,INT,FOLLOW_INT_in_comment336); if (state.failed) return str;dbg.location(148,201);
					if ( state.backtracking==0 ) {str=(INT17!=null?INT17.getText():null);}
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:218: ELLIPSIS
					{
					dbg.location(148,218);
					ELLIPSIS18=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment339); if (state.failed) return str;dbg.location(148,226);
					if ( state.backtracking==0 ) {str=(ELLIPSIS18!=null?ELLIPSIS18.getText():null);}
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:248: DATE
					{
					dbg.location(148,248);
					DATE19=(Token)match(input,DATE,FOLLOW_DATE_in_comment342); if (state.failed) return str;dbg.location(148,252);
					if ( state.backtracking==0 ) {str=(DATE19!=null?DATE19.getText():null);}
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:270: PHONE_NUMBER
					{
					dbg.location(148,270);
					PHONE_NUMBER20=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment345); if (state.failed) return str;dbg.location(148,282);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER20!=null?PHONE_NUMBER20.getText():null);}
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:308: NON_CONFORMATION_SECOND_LINE
					{
					dbg.location(148,308);
					NON_CONFORMATION_SECOND_LINE21=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment348); if (state.failed) return str;dbg.location(148,336);
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_SECOND_LINE21!=null?NON_CONFORMATION_SECOND_LINE21.getText():null);}
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
		dbg.location(148, 377);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:149:1: timeblock_comment returns [String str] : ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX ) ;
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
		dbg.location(149, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:3: ( ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX )
			{
			dbg.location(151,5);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:5: ( NON_CONFORMATION_CLASS_NAME | BREED_NAME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER | SPECIAL_SUFFIX )
			int alt13=9;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
			case NON_CONFORMATION_CLASS_NAME:
				{
				alt13=1;
				}
				break;
			case BREED_NAME:
				{
				alt13=2;
				}
				break;
			case COMMENT:
				{
				alt13=3;
				}
				break;
			case PARENTHETICAL:
				{
				alt13=4;
				}
				break;
			case INT:
				{
				alt13=5;
				}
				break;
			case ELLIPSIS:
				{
				alt13=6;
				}
				break;
			case DATE:
				{
				alt13=7;
				}
				break;
			case PHONE_NUMBER:
				{
				alt13=8;
				}
				break;
			case SPECIAL_SUFFIX:
				{
				alt13=9;
				}
				break;
			default:
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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:6: NON_CONFORMATION_CLASS_NAME
					{
					dbg.location(151,6);
					NON_CONFORMATION_CLASS_NAME22=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment370); if (state.failed) return str;dbg.location(151,33);
					if ( state.backtracking==0 ) {str=(NON_CONFORMATION_CLASS_NAME22!=null?NON_CONFORMATION_CLASS_NAME22.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:74: BREED_NAME
					{
					dbg.location(151,74);
					BREED_NAME23=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_timeblock_comment373); if (state.failed) return str;dbg.location(151,84);
					if ( state.backtracking==0 ) {str=(BREED_NAME23!=null?BREED_NAME23.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:108: COMMENT
					{
					dbg.location(151,108);
					COMMENT24=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment376); if (state.failed) return str;dbg.location(151,115);
					if ( state.backtracking==0 ) {str=(COMMENT24!=null?COMMENT24.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:136: PARENTHETICAL
					{
					dbg.location(151,136);
					PARENTHETICAL25=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_timeblock_comment379); if (state.failed) return str;dbg.location(151,149);
					if ( state.backtracking==0 ) {str=(PARENTHETICAL25!=null?PARENTHETICAL25.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:176: INT
					{
					dbg.location(151,176);
					INT26=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment382); if (state.failed) return str;dbg.location(151,179);
					if ( state.backtracking==0 ) {str=(INT26!=null?INT26.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:196: ELLIPSIS
					{
					dbg.location(151,196);
					ELLIPSIS27=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment385); if (state.failed) return str;dbg.location(151,204);
					if ( state.backtracking==0 ) {str=(ELLIPSIS27!=null?ELLIPSIS27.getText():null);}
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:226: DATE
					{
					dbg.location(151,226);
					DATE28=(Token)match(input,DATE,FOLLOW_DATE_in_timeblock_comment388); if (state.failed) return str;dbg.location(151,230);
					if ( state.backtracking==0 ) {str=(DATE28!=null?DATE28.getText():null);}
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:248: PHONE_NUMBER
					{
					dbg.location(151,248);
					PHONE_NUMBER29=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment391); if (state.failed) return str;dbg.location(151,260);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER29!=null?PHONE_NUMBER29.getText():null);}
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:286: SPECIAL_SUFFIX
					{
					dbg.location(151,286);
					match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment394); if (state.failed) return str;
					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(151, 300);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:154:1: ring_comment returns [String str] : ( STANDALONE_COMMENT | timeblock_comment );
	public final String ring_comment() throws RecognitionException {
		String str = null;


		Token STANDALONE_COMMENT30=null;

		try { dbg.enterRule(getGrammarFileName(), "ring_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(154, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:5: ( STANDALONE_COMMENT | timeblock_comment )
			int alt14=2;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==STANDALONE_COMMENT) ) {
				alt14=1;
			}
			else if ( (LA14_0==BREED_NAME||(LA14_0 >= COMMENT && LA14_0 <= ELLIPSIS)||LA14_0==INT||LA14_0==NON_CONFORMATION_CLASS_NAME||LA14_0==PARENTHETICAL||LA14_0==PHONE_NUMBER||LA14_0==SPECIAL_SUFFIX) ) {
				alt14=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return str;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:9: STANDALONE_COMMENT
					{
					dbg.location(155,9);
					STANDALONE_COMMENT30=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment416); if (state.failed) return str;dbg.location(155,27);
					if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT30!=null?STANDALONE_COMMENT30.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:59: timeblock_comment
					{
					dbg.location(155,59);
					pushFollow(FOLLOW_timeblock_comment_in_ring_comment419);
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
		dbg.location(155, 75);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:157:1: timeblock returns [JsonObject json] : ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )* ;
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
		dbg.location(157, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:2: ( ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )* )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:4: ( ( INT FOLLOWING_TIME ) | TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )*
			{
			dbg.location(159,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:4: ( ( INT FOLLOWING_TIME ) | TIME )
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==INT) ) {
				alt15=1;
			}
			else if ( (LA15_0==TIME) ) {
				alt15=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:5: ( INT FOLLOWING_TIME )
					{
					dbg.location(159,5);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:5: ( INT FOLLOWING_TIME )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:6: INT FOLLOWING_TIME
					{
					dbg.location(159,6);
					INT31=(Token)match(input,INT,FOLLOW_INT_in_timeblock442); if (state.failed) return json;dbg.location(159,9);
					if ( state.backtracking==0 ) {currentBlockTime=(INT31!=null?INT31.getText():null);json.addProperty("Time", currentBlockTime);}dbg.location(159,82);
					match(input,FOLLOWING_TIME,FOLLOW_FOLLOWING_TIME_in_timeblock445); if (state.failed) return json;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:98: TIME
					{
					dbg.location(159,98);
					TIME32=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock448); if (state.failed) return json;dbg.location(159,102);
					if ( state.backtracking==0 ) {currentBlockTime=(TIME32!=null?TIME32.getText():null);json.addProperty("Time", currentBlockTime);}
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(159,177);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:177: (rings= inner_timeblock (mComment= timeblock_comment )* )*
			try { dbg.enterSubRule(17);

			loop17:
			do {
				int alt17=2;
				try { dbg.enterDecision(17, decisionCanBacktrack[17]);

				switch ( input.LA(1) ) {
				case EOF:
					{
					int LA17_1 = input.LA(2);
					if ( (synpred40_test()) ) {
						alt17=1;
					}

					}
					break;
				case RING_TITLE:
					{
					int LA17_2 = input.LA(2);
					if ( (synpred40_test()) ) {
						alt17=1;
					}

					}
					break;
				case JUDGE_NAME:
					{
					int LA17_3 = input.LA(2);
					if ( (synpred40_test()) ) {
						alt17=1;
					}

					}
					break;
				case COMMENT:
					{
					int LA17_4 = input.LA(2);
					if ( (synpred40_test()) ) {
						alt17=1;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA17_5 = input.LA(2);
					if ( (synpred40_test()) ) {
						alt17=1;
					}

					}
					break;
				case PARENTHETICAL_INT:
					{
					int LA17_6 = input.LA(2);
					if ( (synpred40_test()) ) {
						alt17=1;
					}

					}
					break;
				case INT:
					{
					int LA17_7 = input.LA(2);
					if ( (synpred40_test()) ) {
						alt17=1;
					}

					}
					break;
				case TIME:
					{
					int LA17_8 = input.LA(2);
					if ( (synpred40_test()) ) {
						alt17=1;
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
					alt17=1;
					}
					break;
				}
				} finally {dbg.exitDecision(17);}

				switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:178: rings= inner_timeblock (mComment= timeblock_comment )*
					{
					dbg.location(159,183);
					pushFollow(FOLLOW_inner_timeblock_in_timeblock455);
					rings=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;dbg.location(159,199);
					if ( state.backtracking==0 ) {if(json.has("Rings")){JsonArray already=json.getAsJsonArray("Rings");already.addAll(rings);json.add("Rings",already);}else{json.add("Rings", rings);}}dbg.location(159,351);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:351: (mComment= timeblock_comment )*
					try { dbg.enterSubRule(16);

					loop16:
					do {
						int alt16=2;
						try { dbg.enterDecision(16, decisionCanBacktrack[16]);

						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA16_2 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt16=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA16_3 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt16=1;
							}

							}
							break;
						case INT:
							{
							int LA16_4 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt16=1;
							}

							}
							break;
						case NON_CONFORMATION_CLASS_NAME:
							{
							int LA16_5 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt16=1;
							}

							}
							break;
						case BREED_NAME:
							{
							int LA16_6 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt16=1;
							}

							}
							break;
						case ELLIPSIS:
							{
							int LA16_7 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt16=1;
							}

							}
							break;
						case DATE:
							{
							int LA16_8 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt16=1;
							}

							}
							break;
						case PHONE_NUMBER:
							{
							int LA16_9 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt16=1;
							}

							}
							break;
						case SPECIAL_SUFFIX:
							{
							int LA16_10 = input.LA(2);
							if ( (synpred39_test()) ) {
								alt16=1;
							}

							}
							break;
						}
						} finally {dbg.exitDecision(16);}

						switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:352: mComment= timeblock_comment
							{
							dbg.location(159,360);
							pushFollow(FOLLOW_timeblock_comment_in_timeblock461);
							mComment=timeblock_comment();
							state._fsp--;
							if (state.failed) return json;dbg.location(159,378);
							if ( state.backtracking==0 ) {comment+=mComment;}
							}
							break;

						default :
							break loop16;
						}
					} while (true);
					} finally {dbg.exitSubRule(16);}
					dbg.location(159,405);
					if ( state.backtracking==0 ) {if(!comment.equals("")){json.add("timeblock_comment",new JsonPrimitive(comment));}}
					}
					break;

				default :
					break loop17;
				}
			} while (true);
			} finally {dbg.exitSubRule(17);}
			dbg.location(159,491);
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
		dbg.location(159, 577);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "timeblock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "timeblock"



	// $ANTLR start "inner_timeblock"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:160:1: inner_timeblock returns [JsonArray array] : ( judge_name |mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( empty_breed_ring )=>mEmptyBreedRing= empty_breed_ring ) || (mBreedConformation= non_conformation_breed_ring ) ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+ ;
	public final JsonArray inner_timeblock() throws RecognitionException {
		JsonArray array = null;


		JsonObject mSpecialRing =null;
		JsonObject mJuniorRing =null;
		JsonObject mEmptyBreedRing =null;
		JsonObject mBreedConformation =null;
		JsonObject mBreedRing =null;
		JsonObject mConformation =null;
		JsonObject mRallyRing =null;

		array = new JsonArray();int countAhead = 0;
		try { dbg.enterRule(getGrammarFileName(), "inner_timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(160, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:2: ( ( judge_name |mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( empty_breed_ring )=>mEmptyBreedRing= empty_breed_ring ) || (mBreedConformation= non_conformation_breed_ring ) ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:5: ( judge_name |mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( empty_breed_ring )=>mEmptyBreedRing= empty_breed_ring ) || (mBreedConformation= non_conformation_breed_ring ) ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+
			{
			dbg.location(162,5);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:5: ( judge_name |mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( empty_breed_ring )=>mEmptyBreedRing= empty_breed_ring ) || (mBreedConformation= non_conformation_breed_ring ) ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+
			int cnt18=0;
			try { dbg.enterSubRule(18);

			loop18:
			do {
				int alt18=10;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				switch ( input.LA(1) ) {
				case NON_CONFORMATION_CLASS_NAME:
					{
					int LA18_1 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred51_test()) ) {
						alt18=9;
					}

					}
					break;
				case BREED_NAME:
					{
					int LA18_2 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred51_test()) ) {
						alt18=9;
					}

					}
					break;
				case COMMENT:
					{
					int LA18_3 = input.LA(2);
					if ( (synpred41_test()) ) {
						alt18=1;
					}
					else if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred51_test()) ) {
						alt18=9;
					}

					}
					break;
				case PARENTHETICAL:
					{
					int LA18_4 = input.LA(2);
					if ( (synpred41_test()) ) {
						alt18=1;
					}
					else if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred51_test()) ) {
						alt18=9;
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
					else if ( (synpred45_test()) ) {
						alt18=4;
					}
					else if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred48_test()) ) {
						alt18=6;
					}
					else if ( (synpred49_test()) ) {
						alt18=7;
					}
					else if ( (synpred50_test()) ) {
						alt18=8;
					}
					else if ( (synpred51_test()) ) {
						alt18=9;
					}

					}
					break;
				case ELLIPSIS:
					{
					int LA18_6 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred51_test()) ) {
						alt18=9;
					}

					}
					break;
				case DATE:
					{
					int LA18_7 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred51_test()) ) {
						alt18=9;
					}

					}
					break;
				case PHONE_NUMBER:
					{
					int LA18_8 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred51_test()) ) {
						alt18=9;
					}

					}
					break;
				case SPECIAL_SUFFIX:
					{
					int LA18_9 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred51_test()) ) {
						alt18=9;
					}

					}
					break;
				case EOF:
					{
					int LA18_10 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}

					}
					break;
				case RING_TITLE:
					{
					int LA18_11 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}

					}
					break;
				case JUDGE_NAME:
					{
					int LA18_12 = input.LA(2);
					if ( (synpred41_test()) ) {
						alt18=1;
					}
					else if ( (synpred46_test()) ) {
						alt18=5;
					}

					}
					break;
				case PARENTHETICAL_INT:
					{
					int LA18_13 = input.LA(2);
					if ( (synpred41_test()) ) {
						alt18=1;
					}
					else if ( (synpred46_test()) ) {
						alt18=5;
					}

					}
					break;
				case TIME:
					{
					int LA18_14 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}

					}
					break;
				case NON_CONF_SECOND_LINE_COMMENT:
					{
					int LA18_15 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred50_test()) ) {
						alt18=8;
					}

					}
					break;
				case RALLY_CLASS:
					{
					int LA18_16 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred50_test()) ) {
						alt18=8;
					}

					}
					break;
				case STANDALONE_COMMENT:
					{
					int LA18_17 = input.LA(2);
					if ( (synpred46_test()) ) {
						alt18=5;
					}
					else if ( (synpred51_test()) ) {
						alt18=9;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:6: judge_name
					{
					dbg.location(162,6);
					pushFollow(FOLLOW_judge_name_in_inner_timeblock488);
					judge_name();
					state._fsp--;
					if (state.failed) return array;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:17: mSpecialRing= special_ring
					{
					dbg.location(162,29);
					pushFollow(FOLLOW_special_ring_in_inner_timeblock492);
					mSpecialRing=special_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,42);
					if ( state.backtracking==0 ) {mSpecialRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mSpecialRing.get("Count").getAsInt();array.add(mSpecialRing);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:179: mJuniorRing= junior_ring
					{
					dbg.location(162,190);
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock497);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,202);
					if ( state.backtracking==0 ) {mJuniorRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mJuniorRing.get("Count").getAsInt();array.add(mJuniorRing);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:336: ( ( empty_breed_ring )=>mEmptyBreedRing= empty_breed_ring )
					{
					dbg.location(162,336);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:336: ( ( empty_breed_ring )=>mEmptyBreedRing= empty_breed_ring )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:337: ( empty_breed_ring )=>mEmptyBreedRing= empty_breed_ring
					{
					dbg.location(162,372);
					pushFollow(FOLLOW_empty_breed_ring_in_inner_timeblock507);
					mEmptyBreedRing=empty_breed_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,389);
					if ( state.backtracking==0 ) {mEmptyBreedRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mEmptyBreedRing.get("Count").getAsInt();array.add(mEmptyBreedRing);}
					}

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:536: 
					{
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:537: (mBreedConformation= non_conformation_breed_ring ) ( ( breed_ring )=>mBreedRing= breed_ring )
					{
					dbg.location(162,537);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:537: (mBreedConformation= non_conformation_breed_ring )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:538: mBreedConformation= non_conformation_breed_ring
					{
					dbg.location(162,556);
					pushFollow(FOLLOW_non_conformation_breed_ring_in_inner_timeblock515);
					mBreedConformation=non_conformation_breed_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,584);
					if ( state.backtracking==0 ) {array.add(mBreedConformation);}
					}
					dbg.location(162,617);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:617: ( ( breed_ring )=>mBreedRing= breed_ring )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:618: ( breed_ring )=>mBreedRing= breed_ring
					{
					dbg.location(162,642);
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock525);
					mBreedRing=breed_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,653);
					if ( state.backtracking==0 ) {mBreedRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mBreedRing.get("Count").getAsInt();array.add(mBreedRing);}
					}

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:785: (mConformation= non_conformation_ring )
					{
					dbg.location(162,785);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:785: (mConformation= non_conformation_ring )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:786: mConformation= non_conformation_ring
					{
					dbg.location(162,799);
					pushFollow(FOLLOW_non_conformation_ring_in_inner_timeblock532);
					mConformation=non_conformation_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,821);
					if ( state.backtracking==0 ) {array.add(mConformation);}
					}

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:850: (mRallyRing= rally_ring_block )
					{
					dbg.location(162,850);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:850: (mRallyRing= rally_ring_block )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:851: mRallyRing= rally_ring_block
					{
					dbg.location(162,861);
					pushFollow(FOLLOW_rally_ring_block_in_inner_timeblock539);
					mRallyRing=rally_ring_block();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,878);
					if ( state.backtracking==0 ) {array.add(mRallyRing);}
					}

					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:904: ( ring_comment )
					{
					dbg.location(162,904);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:904: ( ring_comment )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:905: ring_comment
					{
					dbg.location(162,905);
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock544);
					ring_comment();
					state._fsp--;
					if (state.failed) return array;
					}

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
		dbg.location(162, 919);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inner_timeblock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return array;
	}
	// $ANTLR end "inner_timeblock"



	// $ANTLR start "junior_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:164:1: junior_ring returns [JsonObject json] : INT JUNIOR_CLASS ;
	public final JsonObject junior_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT33=null;
		Token JUNIOR_CLASS34=null;

		json = new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}
		try { dbg.enterRule(getGrammarFileName(), "junior_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(164, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:166:2: ( INT JUNIOR_CLASS )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:166:7: INT JUNIOR_CLASS
			{
			dbg.location(166,7);
			INT33=(Token)match(input,INT,FOLLOW_INT_in_junior_ring568); if (state.failed) return json;dbg.location(166,10);
			if ( state.backtracking==0 ) {json.addProperty("Count",parseIntSafely((INT33!=null?INT33.getText():null), 0));}dbg.location(166,68);
			JUNIOR_CLASS34=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring571); if (state.failed) return json;dbg.location(166,80);
			if ( state.backtracking==0 ) {json.addProperty("ClassName", (JUNIOR_CLASS34!=null?JUNIOR_CLASS34.getText():null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(166, 131);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "junior_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "junior_ring"



	// $ANTLR start "special_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:167:1: special_ring returns [JsonObject json] : INT ( BREED_NAME )? ( SPECIAL_SUFFIX )+ ;
	public final JsonObject special_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT35=null;
		Token BREED_NAME36=null;
		Token SPECIAL_SUFFIX37=null;

		json = new JsonObject(); String suffix = ""; json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}String breedName = "";
		try { dbg.enterRule(getGrammarFileName(), "special_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(167, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:2: ( INT ( BREED_NAME )? ( SPECIAL_SUFFIX )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:6: INT ( BREED_NAME )? ( SPECIAL_SUFFIX )+
			{
			dbg.location(169,6);
			INT35=(Token)match(input,INT,FOLLOW_INT_in_special_ring592); if (state.failed) return json;dbg.location(169,9);
			if ( state.backtracking==0 ) {json.addProperty("Count", parseIntSafely((INT35!=null?INT35.getText():null), 0));}dbg.location(169,68);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:68: ( BREED_NAME )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==BREED_NAME) ) {
				alt19=1;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:69: BREED_NAME
					{
					dbg.location(169,69);
					BREED_NAME36=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring596); if (state.failed) return json;dbg.location(169,79);
					if ( state.backtracking==0 ) {breedName+=(BREED_NAME36!=null?BREED_NAME36.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(169,112);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:112: ( SPECIAL_SUFFIX )+
			int cnt20=0;
			try { dbg.enterSubRule(20);

			loop20:
			do {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==SPECIAL_SUFFIX) ) {
					int LA20_2 = input.LA(2);
					if ( (synpred53_test()) ) {
						alt20=1;
					}

				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:113: SPECIAL_SUFFIX
					{
					dbg.location(169,113);
					SPECIAL_SUFFIX37=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring602); if (state.failed) return json;dbg.location(170,3);
					if ( state.backtracking==0 ) {suffix+= " " + (SPECIAL_SUFFIX37!=null?SPECIAL_SUFFIX37.getText():null);}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(20, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt20++;
			} while (true);
			} finally {dbg.exitSubRule(20);}
			dbg.location(170,44);
			if ( state.backtracking==0 ) {
					//breedName+= (SPECIAL_SUFFIX37!=null?SPECIAL_SUFFIX37.getText():null);
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
		dbg.location(178, 3);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:180:1: group_ring returns [String str] : GROUP_RING ( COMMENT | PARENTHETICAL )+ ;
	public final String group_ring() throws RecognitionException {
		String str = null;


		Token GROUP_RING38=null;
		Token COMMENT39=null;
		Token PARENTHETICAL40=null;

		try { dbg.enterRule(getGrammarFileName(), "group_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(180, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:2: ( GROUP_RING ( COMMENT | PARENTHETICAL )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:5: GROUP_RING ( COMMENT | PARENTHETICAL )+
			{
			dbg.location(181,5);
			GROUP_RING38=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring624); if (state.failed) return str;dbg.location(181,15);
			if ( state.backtracking==0 ) {str=(GROUP_RING38!=null?GROUP_RING38.getText():null);}dbg.location(181,39);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:39: ( COMMENT | PARENTHETICAL )+
			int cnt21=0;
			try { dbg.enterSubRule(21);

			loop21:
			do {
				int alt21=3;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMENT) ) {
					alt21=1;
				}
				else if ( (LA21_0==PARENTHETICAL) ) {
					alt21=2;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:40: COMMENT
					{
					dbg.location(181,40);
					COMMENT39=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_group_ring628); if (state.failed) return str;dbg.location(181,47);
					if ( state.backtracking==0 ) {str+=" " + (COMMENT39!=null?COMMENT39.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:75: PARENTHETICAL
					{
					dbg.location(181,75);
					PARENTHETICAL40=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_group_ring631); if (state.failed) return str;dbg.location(181,88);
					if ( state.backtracking==0 ) {str+= " " + (PARENTHETICAL40!=null?PARENTHETICAL40.getText():null);}
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(21, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt21++;
			} while (true);
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
		dbg.location(181, 123);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:182:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT ;
	public final JsonObject group_block() throws RecognitionException {
		JsonObject json = null;


		Token TIME41=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "group_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(182, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ GROUP_ENDING_ANNOUNCEMENT
			{
			dbg.location(184,4);
			TIME41=(Token)match(input,TIME,FOLLOW_TIME_in_group_block652); if (state.failed) return json;dbg.location(184,8);
			if ( state.backtracking==0 ) {currentBlockTime=(TIME41!=null?TIME41.getText():null);json.addProperty("TIME", currentBlockTime);}dbg.location(184,82);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:82: ( STANDALONE_COMMENT )?
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==STANDALONE_COMMENT) ) {
				alt22=1;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:82: STANDALONE_COMMENT
					{
					dbg.location(184,82);
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block655); if (state.failed) return json;
					}
					break;

			}
			} finally {dbg.exitSubRule(22);}
			dbg.location(184,102);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:102: (mRing= group_ring )+
			int cnt23=0;
			try { dbg.enterSubRule(23);

			loop23:
			do {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==GROUP_RING) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:103: mRing= group_ring
					{
					dbg.location(184,108);
					pushFollow(FOLLOW_group_ring_in_group_block661);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(184,120);
					if ( state.backtracking==0 ) {if(!mRelational){json = new JsonObject();String[] arr = parseGroupRing(mRing);json.addProperty("Group", arr[0]);json.addProperty("Judge",arr[1]);json.addProperty("Time",currentBlockTime);mShowRings.add(json);}else{rings.add(new JsonPrimitive(mRing));}}
					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					if (state.backtracking>0) {state.failed=true; return json;}
						EarlyExitException eee =
							new EarlyExitException(23, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt23++;
			} while (true);
			} finally {dbg.exitSubRule(23);}
			dbg.location(184,376);
			if ( state.backtracking==0 ) {if(mRelational){json.add("Rings", rings);}}dbg.location(184,421);
			match(input,GROUP_ENDING_ANNOUNCEMENT,FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block669); if (state.failed) return json;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(184, 445);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "group_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "group_block"



	// $ANTLR start "empty_breed_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:1: empty_breed_ring returns [JsonObject json] : INT ( BREED_COUNT ) ;
	public final JsonObject empty_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT42=null;
		Token BREED_COUNT43=null;

		json = new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}String breedName = "";int total = 0;
		try { dbg.enterRule(getGrammarFileName(), "empty_breed_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(185, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:5: ( INT ( BREED_COUNT ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:9: INT ( BREED_COUNT )
			{
			dbg.location(187,9);
			INT42=(Token)match(input,INT,FOLLOW_INT_in_empty_breed_ring691); if (state.failed) return json;dbg.location(187,12);
			if ( state.backtracking==0 ) {total = parseIntSafely((INT42!=null?INT42.getText():null), 0);json.addProperty("Count", total);}dbg.location(187,85);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:85: ( BREED_COUNT )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:86: BREED_COUNT
			{
			dbg.location(187,86);
			BREED_COUNT43=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_empty_breed_ring695); if (state.failed) return json;dbg.location(187,97);
			if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT43!=null?BREED_COUNT43.getText():null));assert (counted==total);}
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
		dbg.location(187, 182);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "empty_breed_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "empty_breed_ring"



	// $ANTLR start "breed_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:191:1: breed_ring returns [JsonObject json] : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token INT44=null;
		Token BREED_NAME45=null;
		Token BREED_NAME_SUFFIX46=null;
		Token BREED_COUNT47=null;

		json = new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}String breedName = "";int total = 0;
		try { dbg.enterRule(getGrammarFileName(), "breed_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(191, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:5: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:193:9: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			dbg.location(193,9);
			INT44=(Token)match(input,INT,FOLLOW_INT_in_breed_ring722); if (state.failed) return json;dbg.location(193,12);
			if ( state.backtracking==0 ) {total = parseIntSafely((INT44!=null?INT44.getText():null), 0);json.addProperty("Count", total);}dbg.location(193,85);
			BREED_NAME45=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring725); if (state.failed) return json;dbg.location(193,95);
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME45!=null?BREED_NAME45.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}dbg.location(201,10);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:10: ( BREED_NAME_SUFFIX )?
			int alt24=2;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==BREED_NAME_SUFFIX) ) {
				alt24=1;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:11: BREED_NAME_SUFFIX
					{
					dbg.location(201,11);
					BREED_NAME_SUFFIX46=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring729); if (state.failed) return json;dbg.location(201,28);
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX46!=null?BREED_NAME_SUFFIX46.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(24);}
			dbg.location(201,76);
			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}dbg.location(201,120);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:120: ( BREED_COUNT )?
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==BREED_COUNT) ) {
				alt25=1;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:121: BREED_COUNT
					{
					dbg.location(201,121);
					BREED_COUNT47=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring737); if (state.failed) return json;dbg.location(201,132);
					if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT47!=null?BREED_COUNT47.getText():null));assert (counted==total);}
					}
					break;

			}
			} finally {dbg.exitSubRule(25);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(201, 218);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "breed_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "breed_ring"



	// $ANTLR start "non_conformation_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:205:1: non_conformation_ring returns [JsonObject json] : (count= INT NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE |entrant= INT ) ( NON_CONF_SECOND_LINE_COMMENT )* ) ;
	public final JsonObject non_conformation_ring() throws RecognitionException {
		JsonObject json = null;


		Token count=null;
		Token entrant=null;
		Token NON_CONFORMATION_CLASS_NAME48=null;
		Token NON_CONFORMATION_SECOND_LINE49=null;

		json = new JsonObject();json.addProperty("Empty","obedience: not captured"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}
		try { dbg.enterRule(getGrammarFileName(), "non_conformation_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(205, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:2: ( (count= INT NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE |entrant= INT ) ( NON_CONF_SECOND_LINE_COMMENT )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:4: (count= INT NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE |entrant= INT ) ( NON_CONF_SECOND_LINE_COMMENT )* )
			{
			dbg.location(207,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:4: (count= INT NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE |entrant= INT ) ( NON_CONF_SECOND_LINE_COMMENT )* )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:5: count= INT NON_CONFORMATION_CLASS_NAME ( NON_CONFORMATION_SECOND_LINE |entrant= INT ) ( NON_CONF_SECOND_LINE_COMMENT )*
			{
			dbg.location(207,10);
			count=(Token)match(input,INT,FOLLOW_INT_in_non_conformation_ring763); if (state.failed) return json;dbg.location(207,14);
			if ( state.backtracking==0 ) {json.addProperty("Count", parseIntSafely((count!=null?count.getText():null),0));}dbg.location(207,74);
			NON_CONFORMATION_CLASS_NAME48=(Token)match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring766); if (state.failed) return json;dbg.location(207,101);
			if ( state.backtracking==0 ) {json.addProperty("Class",(NON_CONFORMATION_CLASS_NAME48!=null?NON_CONFORMATION_CLASS_NAME48.getText():null));}dbg.location(207,164);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:164: ( NON_CONFORMATION_SECOND_LINE |entrant= INT )
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:165: NON_CONFORMATION_SECOND_LINE
					{
					dbg.location(207,165);
					NON_CONFORMATION_SECOND_LINE49=(Token)match(input,NON_CONFORMATION_SECOND_LINE,FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring770); if (state.failed) return json;dbg.location(207,193);
					if ( state.backtracking==0 ) {json.addProperty("Entrants",(NON_CONFORMATION_SECOND_LINE49!=null?NON_CONFORMATION_SECOND_LINE49.getText():null));}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:260: entrant= INT
					{
					dbg.location(207,267);
					entrant=(Token)match(input,INT,FOLLOW_INT_in_non_conformation_ring775); if (state.failed) return json;dbg.location(207,271);
					if ( state.backtracking==0 ) {json.addProperty("Entrants",(entrant!=null?entrant.getText():null));}
					}
					break;

			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(207,318);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:318: ( NON_CONF_SECOND_LINE_COMMENT )*
			try { dbg.enterSubRule(27);

			loop27:
			do {
				int alt27=2;
				try { dbg.enterDecision(27, decisionCanBacktrack[27]);

				int LA27_0 = input.LA(1);
				if ( (LA27_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA27_2 = input.LA(2);
					if ( (synpred61_test()) ) {
						alt27=1;
					}

				}

				} finally {dbg.exitDecision(27);}

				switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:319: NON_CONF_SECOND_LINE_COMMENT
					{
					dbg.location(207,319);
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring780); if (state.failed) return json;
					}
					break;

				default :
					break loop27;
				}
			} while (true);
			} finally {dbg.exitSubRule(27);}

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
		dbg.location(207, 349);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "non_conformation_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "non_conformation_ring"



	// $ANTLR start "non_conformation_breed_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:1: non_conformation_breed_ring returns [JsonObject json] : (count= INT BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) ) ;
	public final JsonObject non_conformation_breed_ring() throws RecognitionException {
		JsonObject json = null;


		Token count=null;
		Token BREED_NAME50=null;

		json= new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}
		try { dbg.enterRule(getGrammarFileName(), "non_conformation_breed_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(208, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:210:2: ( (count= INT BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:210:4: (count= INT BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) )
			{
			dbg.location(210,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:210:4: (count= INT BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:210:5: count= INT BREED_NAME COMMENT ( INT | NON_CONFORMATION_SECOND_LINE )
			{
			dbg.location(210,10);
			count=(Token)match(input,INT,FOLLOW_INT_in_non_conformation_breed_ring803); if (state.failed) return json;dbg.location(210,14);
			if ( state.backtracking==0 ) {json.addProperty("Count",parseIntSafely((count!=null?count.getText():null),0));}dbg.location(210,73);
			BREED_NAME50=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_non_conformation_breed_ring806); if (state.failed) return json;dbg.location(210,83);
			if ( state.backtracking==0 ) {json.addProperty("NonConformationBreed",(BREED_NAME50!=null?BREED_NAME50.getText():null));}dbg.location(210,144);
			match(input,COMMENT,FOLLOW_COMMENT_in_non_conformation_breed_ring809); if (state.failed) return json;dbg.location(210,152);
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(210, 186);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "non_conformation_breed_ring");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "non_conformation_breed_ring"



	// $ANTLR start "rally_ring_block"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:211:1: rally_ring_block returns [JsonObject json] : ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) );
	public final JsonObject rally_ring_block() throws RecognitionException {
		JsonObject json = null;


		String rallyComment =null;
		String name =null;
		String line =null;

		String entries = ""; json = new JsonObject();json.addProperty("Empty","rally: not captured"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}
		try { dbg.enterRule(getGrammarFileName(), "rally_ring_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(211, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:3: ( (rallyComment= rally_comment ) | (name= rally_ring_name ( (line= rally_entry_line )* ) ) )
			int alt29=2;
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			int LA29_0 = input.LA(1);
			if ( (LA29_0==NON_CONF_SECOND_LINE_COMMENT) ) {
				alt29=1;
			}
			else if ( (LA29_0==INT||LA29_0==RALLY_CLASS) ) {
				alt29=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:5: (rallyComment= rally_comment )
					{
					dbg.location(213,5);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:5: (rallyComment= rally_comment )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:6: rallyComment= rally_comment
					{
					dbg.location(213,18);
					pushFollow(FOLLOW_rally_comment_in_rally_ring_block836);
					rallyComment=rally_comment();
					state._fsp--;
					if (state.failed) return json;dbg.location(213,32);
					if ( state.backtracking==0 ) {json.addProperty("comment", rallyComment);}
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					{
					dbg.location(213,78);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:78: (name= rally_ring_name ( (line= rally_entry_line )* ) )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:80: name= rally_ring_name ( (line= rally_entry_line )* )
					{
					dbg.location(213,84);
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring_block844);
					name=rally_ring_name();
					state._fsp--;
					if (state.failed) return json;dbg.location(213,100);
					if ( state.backtracking==0 ) {json.addProperty("RallyName",name);}dbg.location(213,138);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:138: ( (line= rally_entry_line )* )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:139: (line= rally_entry_line )*
					{
					dbg.location(213,139);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:139: (line= rally_entry_line )*
					try { dbg.enterSubRule(28);

					loop28:
					do {
						int alt28=2;
						try { dbg.enterDecision(28, decisionCanBacktrack[28]);

						int LA28_0 = input.LA(1);
						if ( (LA28_0==INT) ) {
							int LA28_2 = input.LA(2);
							if ( (LA28_2==RALLY_ENTRY) ) {
								alt28=1;
							}

						}
						else if ( (LA28_0==RALLY_ENTRY) ) {
							alt28=1;
						}

						} finally {dbg.exitDecision(28);}

						switch (alt28) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:213:140: line= rally_entry_line
							{
							dbg.location(213,144);
							pushFollow(FOLLOW_rally_entry_line_in_rally_ring_block851);
							line=rally_entry_line();
							state._fsp--;
							if (state.failed) return json;dbg.location(213,161);
							if ( state.backtracking==0 ) {entries+=line+"|";}
							}
							break;

						default :
							break loop28;
						}
					} while (true);
					} finally {dbg.exitSubRule(28);}

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
		dbg.location(213, 184);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:214:1: rally_ring_name returns [String str] : ( INT )? RALLY_CLASS ;
	public final String rally_ring_name() throws RecognitionException {
		String str = null;


		Token INT51=null;
		Token RALLY_CLASS52=null;

		str="";
		try { dbg.enterRule(getGrammarFileName(), "rally_ring_name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(214, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:216:2: ( ( INT )? RALLY_CLASS )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:216:4: ( INT )? RALLY_CLASS
			{
			dbg.location(216,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:216:4: ( INT )?
			int alt30=2;
			try { dbg.enterSubRule(30);
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			int LA30_0 = input.LA(1);
			if ( (LA30_0==INT) ) {
				alt30=1;
			}
			} finally {dbg.exitDecision(30);}

			switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:216:4: INT
					{
					dbg.location(216,4);
					INT51=(Token)match(input,INT,FOLLOW_INT_in_rally_ring_name872); if (state.failed) return str;
					}
					break;

			}
			} finally {dbg.exitSubRule(30);}
			dbg.location(216,8);
			if ( state.backtracking==0 ) {str+=(INT51!=null?INT51.getText():null);}dbg.location(216,26);
			RALLY_CLASS52=(Token)match(input,RALLY_CLASS,FOLLOW_RALLY_CLASS_in_rally_ring_name876); if (state.failed) return str;dbg.location(216,37);
			if ( state.backtracking==0 ) {str+=" " + (RALLY_CLASS52!=null?RALLY_CLASS52.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(216, 67);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:218:1: rally_entry_line returns [String str] : ( ( INT )? RALLY_ENTRY ) ;
	public final String rally_entry_line() throws RecognitionException {
		String str = null;


		Token INT53=null;
		Token RALLY_ENTRY54=null;

		str="";
		try { dbg.enterRule(getGrammarFileName(), "rally_entry_line");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(218, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:2: ( ( ( INT )? RALLY_ENTRY ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:4: ( ( INT )? RALLY_ENTRY )
			{
			dbg.location(220,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:4: ( ( INT )? RALLY_ENTRY )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:5: ( INT )? RALLY_ENTRY
			{
			dbg.location(220,5);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:5: ( INT )?
			int alt31=2;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			int LA31_0 = input.LA(1);
			if ( (LA31_0==INT) ) {
				alt31=1;
			}
			} finally {dbg.exitDecision(31);}

			switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:220:5: INT
					{
					dbg.location(220,5);
					INT53=(Token)match(input,INT,FOLLOW_INT_in_rally_entry_line896); if (state.failed) return str;
					}
					break;

			}
			} finally {dbg.exitSubRule(31);}
			dbg.location(220,9);
			if ( state.backtracking==0 ) {str+=(INT53!=null?INT53.getText():null);}dbg.location(220,27);
			RALLY_ENTRY54=(Token)match(input,RALLY_ENTRY,FOLLOW_RALLY_ENTRY_in_rally_entry_line900); if (state.failed) return str;dbg.location(220,38);
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
		dbg.location(220, 67);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:221:1: rally_comment returns [String str] : ( NON_CONF_SECOND_LINE_COMMENT )+ ;
	public final String rally_comment() throws RecognitionException {
		String str = null;


		Token NON_CONF_SECOND_LINE_COMMENT55=null;

		str="";
		try { dbg.enterRule(getGrammarFileName(), "rally_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(221, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:2: ( ( NON_CONF_SECOND_LINE_COMMENT )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			{
			dbg.location(223,3);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:3: ( NON_CONF_SECOND_LINE_COMMENT )+
			int cnt32=0;
			try { dbg.enterSubRule(32);

			loop32:
			do {
				int alt32=2;
				try { dbg.enterDecision(32, decisionCanBacktrack[32]);

				int LA32_0 = input.LA(1);
				if ( (LA32_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					int LA32_2 = input.LA(2);
					if ( (synpred67_test()) ) {
						alt32=1;
					}

				}

				} finally {dbg.exitDecision(32);}

				switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:4: NON_CONF_SECOND_LINE_COMMENT
					{
					dbg.location(223,4);
					NON_CONF_SECOND_LINE_COMMENT55=(Token)match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment918); if (state.failed) return str;dbg.location(223,32);
					if ( state.backtracking==0 ) {str+=" "+(NON_CONF_SECOND_LINE_COMMENT55!=null?NON_CONF_SECOND_LINE_COMMENT55.getText():null);}
					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					if (state.backtracking>0) {state.failed=true; return str;}
						EarlyExitException eee =
							new EarlyExitException(32, input);
						dbg.recognitionException(eee);

						throw eee;
				}
				cnt32++;
			} while (true);
			} finally {dbg.exitSubRule(32);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(223, 79);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rally_comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return str;
	}
	// $ANTLR end "rally_comment"

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:95: ( ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:96: ring
		{
		dbg.location(126,96);
		pushFollow(FOLLOW_ring_in_synpred3_test93);
		ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred3_test

	// $ANTLR start synpred9_test
	public final void synpred9_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:5: ( JUDGE_NAME )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:5: JUDGE_NAME
		{
		dbg.location(141,5);
		match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_synpred9_test239); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred9_test

	// $ANTLR start synpred11_test
	public final void synpred11_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:43: ( COMMENT )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:43: COMMENT
		{
		dbg.location(141,43);
		match(input,COMMENT,FOLLOW_COMMENT_in_synpred11_test245); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred11_test

	// $ANTLR start synpred12_test
	public final void synpred12_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:76: ( PARENTHETICAL )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:76: PARENTHETICAL
		{
		dbg.location(141,76);
		match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_synpred12_test248); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred12_test

	// $ANTLR start synpred13_test
	public final void synpred13_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:121: ( PARENTHETICAL_INT )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:121: PARENTHETICAL_INT
		{
		dbg.location(141,121);
		match(input,PARENTHETICAL_INT,FOLLOW_PARENTHETICAL_INT_in_synpred13_test251); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred13_test

	// $ANTLR start synpred14_test
	public final void synpred14_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:8: (mComment= comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:8: mComment= comment
		{
		dbg.location(144,16);
		pushFollow(FOLLOW_comment_in_synpred14_test280);
		mComment=comment();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred14_test

	// $ANTLR start synpred15_test
	public final void synpred15_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:42: ( TIME )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:42: TIME
		{
		dbg.location(144,42);
		match(input,TIME,FOLLOW_TIME_in_synpred15_test283); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred15_test

	// $ANTLR start synpred16_test
	public final void synpred16_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:64: ( PHONE_NUMBER )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:64: PHONE_NUMBER
		{
		dbg.location(144,64);
		match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_synpred16_test286); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred16_test

	// $ANTLR start synpred17_test
	public final void synpred17_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:102: ( BREED_NAME )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:102: BREED_NAME
		{
		dbg.location(144,102);
		match(input,BREED_NAME,FOLLOW_BREED_NAME_in_synpred17_test289); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred17_test

	// $ANTLR start synpred39_test
	public final void synpred39_test_fragment() throws RecognitionException {
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:352: (mComment= timeblock_comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:352: mComment= timeblock_comment
		{
		dbg.location(159,360);
		pushFollow(FOLLOW_timeblock_comment_in_synpred39_test461);
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

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:178: (rings= inner_timeblock (mComment= timeblock_comment )* )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:178: rings= inner_timeblock (mComment= timeblock_comment )*
		{
		dbg.location(159,183);
		pushFollow(FOLLOW_inner_timeblock_in_synpred40_test455);
		rings=inner_timeblock();
		state._fsp--;
		if (state.failed) return ;dbg.location(159,351);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:351: (mComment= timeblock_comment )*
		try { dbg.enterSubRule(35);

		loop35:
		do {
			int alt35=2;
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			int LA35_0 = input.LA(1);
			if ( (LA35_0==BREED_NAME||(LA35_0 >= COMMENT && LA35_0 <= ELLIPSIS)||LA35_0==INT||LA35_0==NON_CONFORMATION_CLASS_NAME||LA35_0==PARENTHETICAL||LA35_0==PHONE_NUMBER||LA35_0==SPECIAL_SUFFIX) ) {
				alt35=1;
			}

			} finally {dbg.exitDecision(35);}

			switch (alt35) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:352: mComment= timeblock_comment
				{
				dbg.location(159,360);
				pushFollow(FOLLOW_timeblock_comment_in_synpred40_test461);
				mComment=timeblock_comment();
				state._fsp--;
				if (state.failed) return ;
				}
				break;

			default :
				break loop35;
			}
		} while (true);
		} finally {dbg.exitSubRule(35);}

		}

	}
	// $ANTLR end synpred40_test

	// $ANTLR start synpred41_test
	public final void synpred41_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:6: ( judge_name )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:6: judge_name
		{
		dbg.location(162,6);
		pushFollow(FOLLOW_judge_name_in_synpred41_test488);
		judge_name();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred41_test

	// $ANTLR start synpred42_test
	public final void synpred42_test_fragment() throws RecognitionException {
		JsonObject mSpecialRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:17: (mSpecialRing= special_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:17: mSpecialRing= special_ring
		{
		dbg.location(162,29);
		pushFollow(FOLLOW_special_ring_in_synpred42_test492);
		mSpecialRing=special_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred42_test

	// $ANTLR start synpred43_test
	public final void synpred43_test_fragment() throws RecognitionException {
		JsonObject mJuniorRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:179: (mJuniorRing= junior_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:179: mJuniorRing= junior_ring
		{
		dbg.location(162,190);
		pushFollow(FOLLOW_junior_ring_in_synpred43_test497);
		mJuniorRing=junior_ring();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred43_test

	// $ANTLR start synpred45_test
	public final void synpred45_test_fragment() throws RecognitionException {
		JsonObject mEmptyBreedRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:336: ( ( ( empty_breed_ring )=>mEmptyBreedRing= empty_breed_ring ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:336: ( ( empty_breed_ring )=>mEmptyBreedRing= empty_breed_ring )
		{
		dbg.location(162,336);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:336: ( ( empty_breed_ring )=>mEmptyBreedRing= empty_breed_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:337: ( empty_breed_ring )=>mEmptyBreedRing= empty_breed_ring
		{
		dbg.location(162,372);
		pushFollow(FOLLOW_empty_breed_ring_in_synpred45_test507);
		mEmptyBreedRing=empty_breed_ring();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred45_test

	// $ANTLR start synpred46_test
	public final void synpred46_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:536: ()
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:536: 
		{
		}

	}
	// $ANTLR end synpred46_test

	// $ANTLR start synpred48_test
	public final void synpred48_test_fragment() throws RecognitionException {
		JsonObject mBreedConformation =null;
		JsonObject mBreedRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:537: ( (mBreedConformation= non_conformation_breed_ring ) ( ( breed_ring )=>mBreedRing= breed_ring ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:537: (mBreedConformation= non_conformation_breed_ring ) ( ( breed_ring )=>mBreedRing= breed_ring )
		{
		dbg.location(162,537);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:537: (mBreedConformation= non_conformation_breed_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:538: mBreedConformation= non_conformation_breed_ring
		{
		dbg.location(162,556);
		pushFollow(FOLLOW_non_conformation_breed_ring_in_synpred48_test515);
		mBreedConformation=non_conformation_breed_ring();
		state._fsp--;
		if (state.failed) return ;
		}
		dbg.location(162,617);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:617: ( ( breed_ring )=>mBreedRing= breed_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:618: ( breed_ring )=>mBreedRing= breed_ring
		{
		dbg.location(162,642);
		pushFollow(FOLLOW_breed_ring_in_synpred48_test525);
		mBreedRing=breed_ring();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred48_test

	// $ANTLR start synpred49_test
	public final void synpred49_test_fragment() throws RecognitionException {
		JsonObject mConformation =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:785: ( (mConformation= non_conformation_ring ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:785: (mConformation= non_conformation_ring )
		{
		dbg.location(162,785);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:785: (mConformation= non_conformation_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:786: mConformation= non_conformation_ring
		{
		dbg.location(162,799);
		pushFollow(FOLLOW_non_conformation_ring_in_synpred49_test532);
		mConformation=non_conformation_ring();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred49_test

	// $ANTLR start synpred50_test
	public final void synpred50_test_fragment() throws RecognitionException {
		JsonObject mRallyRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:850: ( (mRallyRing= rally_ring_block ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:850: (mRallyRing= rally_ring_block )
		{
		dbg.location(162,850);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:850: (mRallyRing= rally_ring_block )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:851: mRallyRing= rally_ring_block
		{
		dbg.location(162,861);
		pushFollow(FOLLOW_rally_ring_block_in_synpred50_test539);
		mRallyRing=rally_ring_block();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred50_test

	// $ANTLR start synpred51_test
	public final void synpred51_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:904: ( ( ring_comment ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:904: ( ring_comment )
		{
		dbg.location(162,904);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:904: ( ring_comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:905: ring_comment
		{
		dbg.location(162,905);
		pushFollow(FOLLOW_ring_comment_in_synpred51_test544);
		ring_comment();
		state._fsp--;
		if (state.failed) return ;
		}

		}

	}
	// $ANTLR end synpred51_test

	// $ANTLR start synpred53_test
	public final void synpred53_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:113: ( SPECIAL_SUFFIX )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:113: SPECIAL_SUFFIX
		{
		dbg.location(169,113);
		match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_synpred53_test602); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred53_test

	// $ANTLR start synpred61_test
	public final void synpred61_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:319: ( NON_CONF_SECOND_LINE_COMMENT )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:319: NON_CONF_SECOND_LINE_COMMENT
		{
		dbg.location(207,319);
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred61_test780); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred61_test

	// $ANTLR start synpred67_test
	public final void synpred67_test_fragment() throws RecognitionException {
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:4: ( NON_CONF_SECOND_LINE_COMMENT )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:223:4: NON_CONF_SECOND_LINE_COMMENT
		{
		dbg.location(223,4);
		match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred67_test918); if (state.failed) return ;
		}

	}
	// $ANTLR end synpred67_test

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
	public final boolean synpred48_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred48_test_fragment(); // can never throw exception
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
	public final boolean synpred41_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred41_test_fragment(); // can never throw exception
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
	public final boolean synpred50_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred50_test_fragment(); // can never throw exception
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
	public final boolean synpred67_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred67_test_fragment(); // can never throw exception
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
	public final boolean synpred49_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred49_test_fragment(); // can never throw exception
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
	public final boolean synpred9_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred9_test_fragment(); // can never throw exception
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
	public final boolean synpred53_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred53_test_fragment(); // can never throw exception
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
	public final boolean synpred51_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred51_test_fragment(); // can never throw exception
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
	public final boolean synpred17_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred17_test_fragment(); // can never throw exception
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
	public final boolean synpred61_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred61_test_fragment(); // can never throw exception
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
	public final boolean synpred3_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred3_test_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_special_ring_in_test_special47 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start85 = new BitSet(new long[]{0x164A460000000740L});
	public static final BitSet FOLLOW_ring_in_start98 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_EOF_in_start105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring131 = new BitSet(new long[]{0x1018080000000100L});
	public static final BitSet FOLLOW_inner_ring_in_ring136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring162 = new BitSet(new long[]{0x104A440000000742L});
	public static final BitSet FOLLOW_comment_in_inner_ring165 = new BitSet(new long[]{0x104A440000000742L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring179 = new BitSet(new long[]{0x0018080000000102L});
	public static final BitSet FOLLOW_judge_name_in_judge_block209 = new BitSet(new long[]{0x1000040000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block215 = new BitSet(new long[]{0x1000040000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_name239 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_COMMENT_in_judge_name245 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_judge_name248 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_judge_name251 = new BitSet(new long[]{0x0018000000000102L});
	public static final BitSet FOLLOW_comment_in_big_comment280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_big_comment283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_big_comment286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_big_comment289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_big_comment292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_big_comment295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_big_comment298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_comment321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_comment324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_comment327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_comment330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_comment333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_comment336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_comment339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_comment342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_comment345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_comment348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_timeblock_comment370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_timeblock_comment373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_timeblock_comment376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_timeblock_comment379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock_comment382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_timeblock_comment385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_timeblock_comment388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_timeblock_comment391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_timeblock_comment394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_ring_comment419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_timeblock442 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FOLLOWING_TIME_in_timeblock445 = new BitSet(new long[]{0x0CDC4C0000000740L});
	public static final BitSet FOLLOW_TIME_in_timeblock448 = new BitSet(new long[]{0x0CDC4C0000000740L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock455 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock461 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_judge_name_in_inner_timeblock488 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock492 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock497 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_empty_breed_ring_in_inner_timeblock507 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_non_conformation_breed_ring_in_inner_timeblock515 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock525 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_non_conformation_ring_in_inner_timeblock532 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_rally_ring_block_in_inner_timeblock539 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock544 = new BitSet(new long[]{0x0CDC4C0000000742L});
	public static final BitSet FOLLOW_INT_in_junior_ring568 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_special_ring592 = new BitSet(new long[]{0x0400000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring596 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring602 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring624 = new BitSet(new long[]{0x0008000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_group_ring628 = new BitSet(new long[]{0x0008000000000102L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_group_ring631 = new BitSet(new long[]{0x0008000000000102L});
	public static final BitSet FOLLOW_TIME_in_group_block652 = new BitSet(new long[]{0x0800020000000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block655 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block661 = new BitSet(new long[]{0x0000028000000000L});
	public static final BitSet FOLLOW_GROUP_ENDING_ANNOUNCEMENT_in_group_block669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_empty_breed_ring691 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BREED_COUNT_in_empty_breed_ring695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring722 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring725 = new BitSet(new long[]{0x0000000000000092L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring729 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_non_conformation_ring763 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring766 = new BitSet(new long[]{0x0002040000000000L});
	public static final BitSet FOLLOW_NON_CONFORMATION_SECOND_LINE_in_non_conformation_ring770 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_INT_in_non_conformation_ring775 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring780 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_INT_in_non_conformation_breed_ring803 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_non_conformation_breed_ring806 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMENT_in_non_conformation_breed_ring809 = new BitSet(new long[]{0x0002040000000000L});
	public static final BitSet FOLLOW_set_in_non_conformation_breed_ring811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring_block836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring_block844 = new BitSet(new long[]{0x0100040000000002L});
	public static final BitSet FOLLOW_rally_entry_line_in_rally_ring_block851 = new BitSet(new long[]{0x0100040000000002L});
	public static final BitSet FOLLOW_INT_in_rally_ring_name872 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_RALLY_CLASS_in_rally_ring_name876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_rally_entry_line896 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RALLY_ENTRY_in_rally_entry_line900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_rally_comment918 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred3_test93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_synpred9_test239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_synpred11_test245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_in_synpred12_test248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARENTHETICAL_INT_in_synpred13_test251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred14_test280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_synpred15_test283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_synpred16_test286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREED_NAME_in_synpred17_test289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred39_test461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_synpred40_test455 = new BitSet(new long[]{0x0448440000000742L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred40_test461 = new BitSet(new long[]{0x0448440000000742L});
	public static final BitSet FOLLOW_judge_name_in_synpred41_test488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_synpred42_test492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_synpred43_test497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_breed_ring_in_synpred45_test507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_conformation_breed_ring_in_synpred48_test515 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_breed_ring_in_synpred48_test525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_conformation_ring_in_synpred49_test532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_block_in_synpred50_test539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_synpred51_test544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_synpred53_test602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred61_test780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_synpred67_test918 = new BitSet(new long[]{0x0000000000000002L});
}
