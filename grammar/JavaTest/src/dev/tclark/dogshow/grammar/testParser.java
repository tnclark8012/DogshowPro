// $ANTLR 3.5 C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g 2013-11-08 22:09:57

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREED_COUNT", "BREED_MISC", "BREED_NAME", 
		"BREED_NAME_SUFFIX", "COMMENT", "DATE", "ELLIPSIS", "END_PUNCTUATION", 
		"END_WORD", "FRAG_BREED_NAME_ALT", "FRAG_BREED_NAME_CATEGORY", "FRAG_BREED_NAME_CATEGORY_SUFFIX", 
		"FRAG_BREED_NAME_SINGLE", "FRAG_BREED_NAME_SPECIAL_SUFFIX", "FRAG_GROUP_NAME", 
		"FRAG_MONTH", "FRAG_PROPER_NAME", "FRAG_RING", "FRAG_SPECIAL_GROUP_NAME", 
		"FRAG_SPEC_CHAR", "FRAG_SPEC_WORD_CHAR", "FRAG_TIME_LABEL", "FRAG_TITLE", 
		"FRAG_WEEK_DAY", "FallThrough", "GROUP_RING", "INT", "JUDGE_NAME", "JUNIOR_CLASS", 
		"NON_CONFORMATION_CLASS_LEVEL", "NON_CONFORMATION_CLASS_NAME", "NON_CONFORMATION_SECOND_LINE", 
		"NON_CONF_SECOND_LINE", "NON_CONF_SECOND_LINE_COMMENT", "PARENTHETICAL", 
		"PARENTHETICAL_INT", "PARENTHETICAL_NAME", "PHONE_NUMBER", "RALLY_CLASS", 
		"RALLY_CLASS_LEVEL", "RALLY_CLASS_NAME", "RALLY_CLASS_TYPE", "RALLY_CLASS_WITH_TYPE", 
		"RALLY_RING_LINE", "RALLY_STANDALONE_COMMENT", "RALLY_TOKEN", "RALLY_TOKEN_WITH_TYPE", 
		"RING_TITLE", "SPECIAL_SUFFIX", "STANDALONE_COMMENT", "TIME", "WORD", 
		"WS"
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
	public static final int FRAG_RING=21;
	public static final int FRAG_SPECIAL_GROUP_NAME=22;
	public static final int FRAG_SPEC_CHAR=23;
	public static final int FRAG_SPEC_WORD_CHAR=24;
	public static final int FRAG_TIME_LABEL=25;
	public static final int FRAG_TITLE=26;
	public static final int FRAG_WEEK_DAY=27;
	public static final int FallThrough=28;
	public static final int GROUP_RING=29;
	public static final int INT=30;
	public static final int JUDGE_NAME=31;
	public static final int JUNIOR_CLASS=32;
	public static final int NON_CONFORMATION_CLASS_LEVEL=33;
	public static final int NON_CONFORMATION_CLASS_NAME=34;
	public static final int NON_CONFORMATION_SECOND_LINE=35;
	public static final int NON_CONF_SECOND_LINE=36;
	public static final int NON_CONF_SECOND_LINE_COMMENT=37;
	public static final int PARENTHETICAL=38;
	public static final int PARENTHETICAL_INT=39;
	public static final int PARENTHETICAL_NAME=40;
	public static final int PHONE_NUMBER=41;
	public static final int RALLY_CLASS=42;
	public static final int RALLY_CLASS_LEVEL=43;
	public static final int RALLY_CLASS_NAME=44;
	public static final int RALLY_CLASS_TYPE=45;
	public static final int RALLY_CLASS_WITH_TYPE=46;
	public static final int RALLY_RING_LINE=47;
	public static final int RALLY_STANDALONE_COMMENT=48;
	public static final int RALLY_TOKEN=49;
	public static final int RALLY_TOKEN_WITH_TYPE=50;
	public static final int RING_TITLE=51;
	public static final int SPECIAL_SUFFIX=52;
	public static final int STANDALONE_COMMENT=53;
	public static final int TIME=54;
	public static final int WORD=55;
	public static final int WS=56;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred23_test", "synpred21_test", "test_breed", "synpred8_test", 
		"rally_ring_block", "synpred22_test", "junior_ring", "synpred40_test", 
		"synpred28_test", "synpred35_test", "synpred20_test", "ring", "synpred17_test", 
		"synpred49_test", "synpred45_test", "synpred43_test", "synpred36_test", 
		"synpred42_test", "synpred41_test", "synpred14_test", "synpred9_test", 
		"rally_ring_name", "judge_block", "synpred1_test", "judge_name", "synpred27_test", 
		"synpred32_test", "breed_ring", "synpred47_test", "group_block", "test_special", 
		"synpred7_test", "ring_comment", "synpred48_test", "inner_ring", "timeblock_comment", 
		"big_comment", "synpred3_test", "synpred10_test", "synpred15_test", "synpred25_test", 
		"synpred26_test", "synpred16_test", "comment", "synpred13_test", "synpred50_test", 
		"synpred12_test", "synpred2_test", "synpred24_test", "synpred11_test", 
		"inner_timeblock", "synpred19_test", "timeblock", "synpred30_test", "group_ring", 
		"synpred38_test", "synpred4_test", "synpred44_test", "synpred29_test", 
		"special_ring", "synpred33_test", "non_conformation_ring", "synpred39_test", 
		"synpred31_test", "synpred18_test", "synpred34_test", "start", "synpred37_test", 
		"synpred46_test", "rally_comment", "synpred5_test", "synpred6_test"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    true, false, false, true, false, true, false, false, false, false, 
		    false, false, false, false, true, false, false, false, false, false, 
		    false, false
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
	public final void test_special() throws RecognitionException{
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
			while (true) {
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
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
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

	}
	// $ANTLR end "test_special"



	// $ANTLR start "test_breed"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:122:1: test_breed : breed_ring ;
	public final void test_breed() throws RecognitionException{
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
		dbg.location(123, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "test_breed");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "test_breed"



	// $ANTLR start "start"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:124:1: start returns [JsonObject json] : (mComment= big_comment )+ ( ( ring )=>mRing= ring )+ EOF ;
	public final JsonObject start() throws RecognitionException{
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
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==BREED_NAME||(LA2_0 >= COMMENT && LA2_0 <= ELLIPSIS)||(LA2_0 >= GROUP_RING && LA2_0 <= INT)||LA2_0==PARENTHETICAL||LA2_0==PHONE_NUMBER||LA2_0==SPECIAL_SUFFIX||LA2_0==TIME) ) {
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
					EarlyExitException eee = new EarlyExitException(2, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt2++;
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(126,54);
			if ( state.backtracking==0 ) {json.addProperty("Comment", comments);}dbg.location(126,94);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:94: ( ( ring )=>mRing= ring )+
			int cnt3=0;
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
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
					EarlyExitException eee = new EarlyExitException(3, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt3++;
			}
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
	public final JsonObject ring() throws RecognitionException{
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
	public final JsonObject inner_ring() throws RecognitionException{
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
			else if ( (LA6_0==COMMENT||LA6_0==JUDGE_NAME||LA6_0==PARENTHETICAL) ) {
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
					while (true) {
						int alt4=2;
						try { dbg.enterDecision(4, decisionCanBacktrack[4]);

						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= COMMENT && LA4_0 <= ELLIPSIS)||LA4_0==INT||LA4_0==PARENTHETICAL||LA4_0==PHONE_NUMBER||LA4_0==TIME) ) {
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
					}
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
					while (true) {
						int alt5=2;
						try { dbg.enterDecision(5, decisionCanBacktrack[5]);

						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMENT||LA5_0==JUDGE_NAME||LA5_0==PARENTHETICAL) ) {
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
							EarlyExitException eee = new EarlyExitException(5, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt5++;
					}
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
	public final JsonObject judge_block() throws RecognitionException{
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
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==TIME) ) {
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
					EarlyExitException eee = new EarlyExitException(7, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt7++;
			}
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:139:1: judge_name returns [String str] : ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL )+ );
	public final String judge_name() throws RecognitionException{
		String str = null;


		Token JUDGE_NAME2=null;

		str = "";
		try { dbg.enterRule(getGrammarFileName(), "judge_name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(139, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:2: ( ( JUDGE_NAME )+ | ( COMMENT | PARENTHETICAL )+ )
			int alt10=2;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

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
					while (true) {
						int alt8=2;
						try { dbg.enterDecision(8, decisionCanBacktrack[8]);

						int LA8_0 = input.LA(1);
						if ( (LA8_0==JUDGE_NAME) ) {
							alt8=1;
						}

						} finally {dbg.exitDecision(8);}

						switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:5: JUDGE_NAME
							{
							dbg.location(141,5);
							JUDGE_NAME2=(Token)match(input,JUDGE_NAME,FOLLOW_JUDGE_NAME_in_judge_name239); if (state.failed) return str;dbg.location(141,15);
							if ( state.backtracking==0 ) {str=(JUDGE_NAME2!=null?JUDGE_NAME2.getText():null);}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return str;}
							EarlyExitException eee = new EarlyExitException(8, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt8++;
					}
					} finally {dbg.exitSubRule(8);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:41: ( COMMENT | PARENTHETICAL )+
					{
					dbg.location(141,41);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:141:41: ( COMMENT | PARENTHETICAL )+
					int cnt9=0;
					try { dbg.enterSubRule(9);

					loop9:
					while (true) {
						int alt9=2;
						try { dbg.enterDecision(9, decisionCanBacktrack[9]);

						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMENT||LA9_0==PARENTHETICAL) ) {
							alt9=1;
						}

						} finally {dbg.exitDecision(9);}

						switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:
							{
							dbg.location(141,41);
							if ( input.LA(1)==COMMENT||input.LA(1)==PARENTHETICAL ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return str;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								dbg.recognitionException(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							if (state.backtracking>0) {state.failed=true; return str;}
							EarlyExitException eee = new EarlyExitException(9, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt9++;
					}
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
		dbg.location(141, 64);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:142:1: big_comment returns [String str] : (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING ) ;
	public final String big_comment() throws RecognitionException{
		String str = null;


		Token TIME3=null;
		Token PHONE_NUMBER4=null;
		Token BREED_NAME5=null;
		Token SPECIAL_SUFFIX6=null;
		Token GROUP_RING7=null;
		String mComment =null;

		str = "";
		try { dbg.enterRule(getGrammarFileName(), "big_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(142, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:3: ( (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			{
			dbg.location(144,7);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:7: (mComment= comment | TIME | PHONE_NUMBER | BREED_NAME | SPECIAL_SUFFIX | GROUP_RING )
			int alt11=6;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

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
						dbg.recognitionException(nvae);
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
						dbg.recognitionException(nvae);
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
					pushFollow(FOLLOW_comment_in_big_comment275);
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
					TIME3=(Token)match(input,TIME,FOLLOW_TIME_in_big_comment278); if (state.failed) return str;dbg.location(144,46);
					if ( state.backtracking==0 ) {str=(TIME3!=null?TIME3.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:64: PHONE_NUMBER
					{
					dbg.location(144,64);
					PHONE_NUMBER4=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_big_comment281); if (state.failed) return str;dbg.location(144,76);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER4!=null?PHONE_NUMBER4.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:102: BREED_NAME
					{
					dbg.location(144,102);
					BREED_NAME5=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_big_comment284); if (state.failed) return str;dbg.location(144,112);
					if ( state.backtracking==0 ) {str=(BREED_NAME5!=null?BREED_NAME5.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:136: SPECIAL_SUFFIX
					{
					dbg.location(144,136);
					SPECIAL_SUFFIX6=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_big_comment287); if (state.failed) return str;dbg.location(144,150);
					if ( state.backtracking==0 ) {str=(SPECIAL_SUFFIX6!=null?SPECIAL_SUFFIX6.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:178: GROUP_RING
					{
					dbg.location(144,178);
					GROUP_RING7=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_big_comment290); if (state.failed) return str;dbg.location(144,188);
					if ( state.backtracking==0 ) {str=(GROUP_RING7!=null?GROUP_RING7.getText():null);}
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
		dbg.location(144, 211);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:146:1: comment returns [String str] : ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER ) ;
	public final String comment() throws RecognitionException{
		String str = null;


		Token TIME8=null;
		Token COMMENT9=null;
		Token PARENTHETICAL10=null;
		Token INT11=null;
		Token ELLIPSIS12=null;
		Token DATE13=null;
		Token PHONE_NUMBER14=null;

		str="";
		try { dbg.enterRule(getGrammarFileName(), "comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(146, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:3: ( ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:5: ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER )
			{
			dbg.location(148,5);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:5: ( TIME | COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER )
			int alt12=7;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:6: TIME
					{
					dbg.location(148,6);
					TIME8=(Token)match(input,TIME,FOLLOW_TIME_in_comment313); if (state.failed) return str;dbg.location(148,10);
					if ( state.backtracking==0 ) {str=(TIME8!=null?TIME8.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:28: COMMENT
					{
					dbg.location(148,28);
					COMMENT9=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_comment316); if (state.failed) return str;dbg.location(148,35);
					if ( state.backtracking==0 ) {str=(COMMENT9!=null?COMMENT9.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:56: PARENTHETICAL
					{
					dbg.location(148,56);
					PARENTHETICAL10=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_comment319); if (state.failed) return str;dbg.location(148,69);
					if ( state.backtracking==0 ) {str=(PARENTHETICAL10!=null?PARENTHETICAL10.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:96: INT
					{
					dbg.location(148,96);
					INT11=(Token)match(input,INT,FOLLOW_INT_in_comment322); if (state.failed) return str;dbg.location(148,99);
					if ( state.backtracking==0 ) {str=(INT11!=null?INT11.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:116: ELLIPSIS
					{
					dbg.location(148,116);
					ELLIPSIS12=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_comment325); if (state.failed) return str;dbg.location(148,124);
					if ( state.backtracking==0 ) {str=(ELLIPSIS12!=null?ELLIPSIS12.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:146: DATE
					{
					dbg.location(148,146);
					DATE13=(Token)match(input,DATE,FOLLOW_DATE_in_comment328); if (state.failed) return str;dbg.location(148,150);
					if ( state.backtracking==0 ) {str=(DATE13!=null?DATE13.getText():null);}
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:148:168: PHONE_NUMBER
					{
					dbg.location(148,168);
					PHONE_NUMBER14=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_comment331); if (state.failed) return str;dbg.location(148,180);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER14!=null?PHONE_NUMBER14.getText():null);}
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
		dbg.location(148, 205);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:149:1: timeblock_comment returns [String str] : ( COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER ) ;
	public final String timeblock_comment() throws RecognitionException{
		String str = null;


		Token COMMENT15=null;
		Token PARENTHETICAL16=null;
		Token INT17=null;
		Token ELLIPSIS18=null;
		Token DATE19=null;
		Token PHONE_NUMBER20=null;

		str="";
		try { dbg.enterRule(getGrammarFileName(), "timeblock_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(149, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:3: ( ( COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:5: ( COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER )
			{
			dbg.location(151,5);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:5: ( COMMENT | PARENTHETICAL | INT | ELLIPSIS | DATE | PHONE_NUMBER )
			int alt13=6;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

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

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:6: COMMENT
					{
					dbg.location(151,6);
					COMMENT15=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_timeblock_comment353); if (state.failed) return str;dbg.location(151,13);
					if ( state.backtracking==0 ) {str=(COMMENT15!=null?COMMENT15.getText():null);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:34: PARENTHETICAL
					{
					dbg.location(151,34);
					PARENTHETICAL16=(Token)match(input,PARENTHETICAL,FOLLOW_PARENTHETICAL_in_timeblock_comment356); if (state.failed) return str;dbg.location(151,47);
					if ( state.backtracking==0 ) {str=(PARENTHETICAL16!=null?PARENTHETICAL16.getText():null);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:74: INT
					{
					dbg.location(151,74);
					INT17=(Token)match(input,INT,FOLLOW_INT_in_timeblock_comment359); if (state.failed) return str;dbg.location(151,77);
					if ( state.backtracking==0 ) {str=(INT17!=null?INT17.getText():null);}
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:94: ELLIPSIS
					{
					dbg.location(151,94);
					ELLIPSIS18=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_timeblock_comment362); if (state.failed) return str;dbg.location(151,102);
					if ( state.backtracking==0 ) {str=(ELLIPSIS18!=null?ELLIPSIS18.getText():null);}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:124: DATE
					{
					dbg.location(151,124);
					DATE19=(Token)match(input,DATE,FOLLOW_DATE_in_timeblock_comment365); if (state.failed) return str;dbg.location(151,128);
					if ( state.backtracking==0 ) {str=(DATE19!=null?DATE19.getText():null);}
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:151:146: PHONE_NUMBER
					{
					dbg.location(151,146);
					PHONE_NUMBER20=(Token)match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_timeblock_comment368); if (state.failed) return str;dbg.location(151,158);
					if ( state.backtracking==0 ) {str=(PHONE_NUMBER20!=null?PHONE_NUMBER20.getText():null);}
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
		dbg.location(151, 183);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:154:1: ring_comment returns [String str] : STANDALONE_COMMENT ;
	public final String ring_comment() throws RecognitionException{
		String str = null;


		Token STANDALONE_COMMENT21=null;

		try { dbg.enterRule(getGrammarFileName(), "ring_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(154, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:5: ( STANDALONE_COMMENT )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:155:9: STANDALONE_COMMENT
			{
			dbg.location(155,9);
			STANDALONE_COMMENT21=(Token)match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_ring_comment391); if (state.failed) return str;dbg.location(155,27);
			if ( state.backtracking==0 ) {str=(STANDALONE_COMMENT21!=null?STANDALONE_COMMENT21.getText():null);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(155, 57);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:157:1: timeblock returns [JsonObject json] : ( TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )* ;
	public final JsonObject timeblock() throws RecognitionException{
		JsonObject json = null;


		Token TIME22=null;
		JsonArray rings =null;
		String mComment =null;

		json = new JsonObject(); String comment = ""; String time = "";
		try { dbg.enterRule(getGrammarFileName(), "timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(157, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:2: ( ( TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )* )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:4: ( TIME ) (rings= inner_timeblock (mComment= timeblock_comment )* )*
			{
			dbg.location(159,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:4: ( TIME )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:5: TIME
			{
			dbg.location(159,5);
			TIME22=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock414); if (state.failed) return json;dbg.location(159,9);
			if ( state.backtracking==0 ) {currentBlockTime=(TIME22!=null?TIME22.getText():null);json.addProperty("Time", currentBlockTime);}
			}
			dbg.location(159,84);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:84: (rings= inner_timeblock (mComment= timeblock_comment )* )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==INT||(LA15_0 >= RALLY_STANDALONE_COMMENT && LA15_0 <= RALLY_TOKEN)||LA15_0==STANDALONE_COMMENT) ) {
					alt15=1;
				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:85: rings= inner_timeblock (mComment= timeblock_comment )*
					{
					dbg.location(159,90);
					pushFollow(FOLLOW_inner_timeblock_in_timeblock421);
					rings=inner_timeblock();
					state._fsp--;
					if (state.failed) return json;dbg.location(159,106);
					if ( state.backtracking==0 ) {if(json.has("Rings")){JsonArray already=json.getAsJsonArray("Rings");already.addAll(rings);json.add("Rings",already);}else{json.add("Rings", rings);}}dbg.location(159,258);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:258: (mComment= timeblock_comment )*
					try { dbg.enterSubRule(14);

					loop14:
					while (true) {
						int alt14=2;
						try { dbg.enterDecision(14, decisionCanBacktrack[14]);

						switch ( input.LA(1) ) {
						case COMMENT:
							{
							int LA14_2 = input.LA(2);
							if ( (synpred29_test()) ) {
								alt14=1;
							}

							}
							break;
						case INT:
							{
							int LA14_3 = input.LA(2);
							if ( (LA14_3==EOF||(LA14_3 >= COMMENT && LA14_3 <= ELLIPSIS)||(LA14_3 >= INT && LA14_3 <= JUDGE_NAME)||LA14_3==PARENTHETICAL||LA14_3==PHONE_NUMBER||(LA14_3 >= RALLY_STANDALONE_COMMENT && LA14_3 <= RALLY_TOKEN)||LA14_3==RING_TITLE||(LA14_3 >= STANDALONE_COMMENT && LA14_3 <= TIME)) ) {
								alt14=1;
							}

							}
							break;
						case PARENTHETICAL:
							{
							int LA14_4 = input.LA(2);
							if ( (synpred29_test()) ) {
								alt14=1;
							}

							}
							break;
						case DATE:
						case ELLIPSIS:
						case PHONE_NUMBER:
							{
							alt14=1;
							}
							break;
						}
						} finally {dbg.exitDecision(14);}

						switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:259: mComment= timeblock_comment
							{
							dbg.location(159,267);
							pushFollow(FOLLOW_timeblock_comment_in_timeblock427);
							mComment=timeblock_comment();
							state._fsp--;
							if (state.failed) return json;dbg.location(159,285);
							if ( state.backtracking==0 ) {comment+=mComment;}
							}
							break;

						default :
							break loop14;
						}
					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(159,312);
					if ( state.backtracking==0 ) {if(!comment.equals("")){json.add("timeblock_comment",new JsonPrimitive(comment));}}
					}
					break;

				default :
					break loop15;
				}
			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(159,398);
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
		dbg.location(159, 484);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:160:1: inner_timeblock returns [JsonArray array] : (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+ ;
	public final JsonArray inner_timeblock() throws RecognitionException{
		JsonArray array = null;


		JsonObject mSpecialRing =null;
		JsonObject mJuniorRing =null;
		JsonObject mBreedRing =null;
		JsonObject mConformation =null;
		JsonObject mRallyRing =null;

		array = new JsonArray();int countAhead = 0;
		try { dbg.enterRule(getGrammarFileName(), "inner_timeblock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(160, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:2: ( (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+
			{
			dbg.location(162,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:4: (mSpecialRing= special_ring |mJuniorRing= junior_ring | ( ( breed_ring )=>mBreedRing= breed_ring ) | (mConformation= non_conformation_ring ) | (mRallyRing= rally_ring_block ) | ( ring_comment ) )+
			int cnt16=0;
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=7;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				switch ( input.LA(1) ) {
				case INT:
					{
					int LA16_2 = input.LA(2);
					if ( (synpred31_test()) ) {
						alt16=1;
					}
					else if ( (synpred32_test()) ) {
						alt16=2;
					}
					else if ( (synpred34_test()) ) {
						alt16=3;
					}
					else if ( (synpred35_test()) ) {
						alt16=4;
					}
					else if ( (synpred36_test()) ) {
						alt16=5;
					}

					}
					break;
				case RALLY_TOKEN:
					{
					int LA16_3 = input.LA(2);
					if ( (synpred36_test()) ) {
						alt16=5;
					}

					}
					break;
				case RALLY_STANDALONE_COMMENT:
					{
					int LA16_4 = input.LA(2);
					if ( (synpred36_test()) ) {
						alt16=5;
					}

					}
					break;
				case STANDALONE_COMMENT:
					{
					int LA16_5 = input.LA(2);
					if ( (synpred37_test()) ) {
						alt16=6;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:5: mSpecialRing= special_ring
					{
					dbg.location(162,17);
					pushFollow(FOLLOW_special_ring_in_inner_timeblock455);
					mSpecialRing=special_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,30);
					if ( state.backtracking==0 ) {mSpecialRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mSpecialRing.get("Count").getAsInt();array.add(mSpecialRing);}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:167: mJuniorRing= junior_ring
					{
					dbg.location(162,178);
					pushFollow(FOLLOW_junior_ring_in_inner_timeblock460);
					mJuniorRing=junior_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,190);
					if ( state.backtracking==0 ) {mJuniorRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mJuniorRing.get("Count").getAsInt();array.add(mJuniorRing);}
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:324: ( ( breed_ring )=>mBreedRing= breed_ring )
					{
					dbg.location(162,324);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:324: ( ( breed_ring )=>mBreedRing= breed_ring )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:325: ( breed_ring )=>mBreedRing= breed_ring
					{
					dbg.location(162,349);
					pushFollow(FOLLOW_breed_ring_in_inner_timeblock470);
					mBreedRing=breed_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,360);
					if ( state.backtracking==0 ) {mBreedRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mBreedRing.get("Count").getAsInt();array.add(mBreedRing);}
					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:492: (mConformation= non_conformation_ring )
					{
					dbg.location(162,492);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:492: (mConformation= non_conformation_ring )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:493: mConformation= non_conformation_ring
					{
					dbg.location(162,506);
					pushFollow(FOLLOW_non_conformation_ring_in_inner_timeblock477);
					mConformation=non_conformation_ring();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,528);
					if ( state.backtracking==0 ) {array.add(mConformation);}
					}

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:557: (mRallyRing= rally_ring_block )
					{
					dbg.location(162,557);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:557: (mRallyRing= rally_ring_block )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:558: mRallyRing= rally_ring_block
					{
					dbg.location(162,568);
					pushFollow(FOLLOW_rally_ring_block_in_inner_timeblock484);
					mRallyRing=rally_ring_block();
					state._fsp--;
					if (state.failed) return array;dbg.location(162,585);
					if ( state.backtracking==0 ) {array.add(mRallyRing);}
					}

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:611: ( ring_comment )
					{
					dbg.location(162,611);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:611: ( ring_comment )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:612: ring_comment
					{
					dbg.location(162,612);
					pushFollow(FOLLOW_ring_comment_in_inner_timeblock489);
					ring_comment();
					state._fsp--;
					if (state.failed) return array;
					}

					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					if (state.backtracking>0) {state.failed=true; return array;}
					EarlyExitException eee = new EarlyExitException(16, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt16++;
			}
			} finally {dbg.exitSubRule(16);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(162, 626);

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
	public final JsonObject junior_ring() throws RecognitionException{
		JsonObject json = null;


		Token INT23=null;
		Token JUNIOR_CLASS24=null;

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
			INT23=(Token)match(input,INT,FOLLOW_INT_in_junior_ring513); if (state.failed) return json;dbg.location(166,10);
			if ( state.backtracking==0 ) {json.addProperty("Count",parseIntSafely((INT23!=null?INT23.getText():null), 0));}dbg.location(166,68);
			JUNIOR_CLASS24=(Token)match(input,JUNIOR_CLASS,FOLLOW_JUNIOR_CLASS_in_junior_ring516); if (state.failed) return json;dbg.location(166,80);
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
	public final JsonObject special_ring() throws RecognitionException{
		JsonObject json = null;


		Token INT25=null;
		Token BREED_NAME26=null;
		Token SPECIAL_SUFFIX27=null;

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
			INT25=(Token)match(input,INT,FOLLOW_INT_in_special_ring537); if (state.failed) return json;dbg.location(169,9);
			if ( state.backtracking==0 ) {json.addProperty("Count", parseIntSafely((INT25!=null?INT25.getText():null), 0));}dbg.location(169,68);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:68: ( BREED_NAME )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==BREED_NAME) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:69: BREED_NAME
					{
					dbg.location(169,69);
					BREED_NAME26=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_special_ring541); if (state.failed) return json;dbg.location(169,79);
					if ( state.backtracking==0 ) {breedName+=(BREED_NAME26!=null?BREED_NAME26.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(169,112);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:112: ( SPECIAL_SUFFIX )+
			int cnt18=0;
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==SPECIAL_SUFFIX) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:169:113: SPECIAL_SUFFIX
					{
					dbg.location(169,113);
					SPECIAL_SUFFIX27=(Token)match(input,SPECIAL_SUFFIX,FOLLOW_SPECIAL_SUFFIX_in_special_ring547); if (state.failed) return json;dbg.location(170,3);
					if ( state.backtracking==0 ) {suffix+= " " + (SPECIAL_SUFFIX27!=null?SPECIAL_SUFFIX27.getText():null);}
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					if (state.backtracking>0) {state.failed=true; return json;}
					EarlyExitException eee = new EarlyExitException(18, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt18++;
			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(170,44);
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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:180:1: group_ring returns [String str] : GROUP_RING ;
	public final String group_ring() throws RecognitionException{
		String str = null;


		Token GROUP_RING28=null;

		try { dbg.enterRule(getGrammarFileName(), "group_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(180, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:2: ( GROUP_RING )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:181:5: GROUP_RING
			{
			dbg.location(181,5);
			GROUP_RING28=(Token)match(input,GROUP_RING,FOLLOW_GROUP_RING_in_group_ring569); if (state.failed) return str;dbg.location(181,15);
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
		dbg.location(181, 37);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:182:1: group_block returns [JsonObject json] : TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ ;
	public final JsonObject group_block() throws RecognitionException{
		JsonObject json = null;


		Token TIME29=null;
		String mRing =null;

		json = new JsonObject(); JsonArray rings = new JsonArray();
		try { dbg.enterRule(getGrammarFileName(), "group_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(182, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:2: ( TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:4: TIME ( STANDALONE_COMMENT )? (mRing= group_ring )+
			{
			dbg.location(184,4);
			TIME29=(Token)match(input,TIME,FOLLOW_TIME_in_group_block588); if (state.failed) return json;dbg.location(184,8);
			if ( state.backtracking==0 ) {currentBlockTime=(TIME29!=null?TIME29.getText():null);json.addProperty("TIME", currentBlockTime);}dbg.location(184,82);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:82: ( STANDALONE_COMMENT )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==STANDALONE_COMMENT) ) {
				alt19=1;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:82: STANDALONE_COMMENT
					{
					dbg.location(184,82);
					match(input,STANDALONE_COMMENT,FOLLOW_STANDALONE_COMMENT_in_group_block591); if (state.failed) return json;
					}
					break;

			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(184,102);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:102: (mRing= group_ring )+
			int cnt20=0;
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==GROUP_RING) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:184:103: mRing= group_ring
					{
					dbg.location(184,108);
					pushFollow(FOLLOW_group_ring_in_group_block597);
					mRing=group_ring();
					state._fsp--;
					if (state.failed) return json;dbg.location(184,120);
					if ( state.backtracking==0 ) {if(!mRelational){json = new JsonObject();String[] arr = parseGroupRing(mRing);json.addProperty("Group", arr[0]);json.addProperty("Judge",arr[1]);json.addProperty("Time",currentBlockTime);mShowRings.add(json);}else{rings.add(new JsonPrimitive(mRing));}}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					if (state.backtracking>0) {state.failed=true; return json;}
					EarlyExitException eee = new EarlyExitException(20, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt20++;
			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(184,376);
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
		dbg.location(184, 419);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "group_block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return json;
	}
	// $ANTLR end "group_block"



	// $ANTLR start "breed_ring"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:185:1: breed_ring returns [JsonObject json] : INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? ;
	public final JsonObject breed_ring() throws RecognitionException{
		JsonObject json = null;


		Token INT30=null;
		Token BREED_NAME31=null;
		Token BREED_NAME_SUFFIX32=null;
		Token BREED_COUNT33=null;

		json = new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}String breedName = "";int total = 0;
		try { dbg.enterRule(getGrammarFileName(), "breed_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(185, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:5: ( INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )? )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:187:9: INT BREED_NAME ( BREED_NAME_SUFFIX )? ( BREED_COUNT )?
			{
			dbg.location(187,9);
			INT30=(Token)match(input,INT,FOLLOW_INT_in_breed_ring625); if (state.failed) return json;dbg.location(187,12);
			if ( state.backtracking==0 ) {total = parseIntSafely((INT30!=null?INT30.getText():null), 0);json.addProperty("Count", total);}dbg.location(187,85);
			BREED_NAME31=(Token)match(input,BREED_NAME,FOLLOW_BREED_NAME_in_breed_ring628); if (state.failed) return json;dbg.location(187,95);
			if ( state.backtracking==0 ) {
			    		breedName+=(BREED_NAME31!=null?BREED_NAME31.getText():null);
			    		if(isVeteran(breedName)){
			    			breedName=mLastBreedName;
			    			json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=breedName;
			    		}}dbg.location(195,10);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:10: ( BREED_NAME_SUFFIX )?
			int alt21=2;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==BREED_NAME_SUFFIX) ) {
				alt21=1;
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:11: BREED_NAME_SUFFIX
					{
					dbg.location(195,11);
					BREED_NAME_SUFFIX32=(Token)match(input,BREED_NAME_SUFFIX,FOLLOW_BREED_NAME_SUFFIX_in_breed_ring632); if (state.failed) return json;dbg.location(195,28);
					if ( state.backtracking==0 ) {breedName += " " + (BREED_NAME_SUFFIX32!=null?BREED_NAME_SUFFIX32.getText():null);}
					}
					break;

			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(195,76);
			if ( state.backtracking==0 ) {json.addProperty("BreedName", breedName);}dbg.location(195,120);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:120: ( BREED_COUNT )?
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==BREED_COUNT) ) {
				alt22=1;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:195:121: BREED_COUNT
					{
					dbg.location(195,121);
					BREED_COUNT33=(Token)match(input,BREED_COUNT,FOLLOW_BREED_COUNT_in_breed_ring640); if (state.failed) return json;dbg.location(195,132);
					if ( state.backtracking==0 ) {int counted = addBreedCountToJson(json, (BREED_COUNT33!=null?BREED_COUNT33.getText():null));assert (counted==total);}
					}
					break;

			}
			} finally {dbg.exitSubRule(22);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(195, 218);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:199:1: non_conformation_ring returns [JsonObject json] : ( INT NON_CONFORMATION_CLASS_NAME ( NON_CONF_SECOND_LINE | INT ) ( NON_CONF_SECOND_LINE_COMMENT )* ) ;
	public final JsonObject non_conformation_ring() throws RecognitionException{
		JsonObject json = null;


		json = new JsonObject();json.addProperty("Empty","obedience: not captured"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}
		try { dbg.enterRule(getGrammarFileName(), "non_conformation_ring");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(199, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:2: ( ( INT NON_CONFORMATION_CLASS_NAME ( NON_CONF_SECOND_LINE | INT ) ( NON_CONF_SECOND_LINE_COMMENT )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:4: ( INT NON_CONFORMATION_CLASS_NAME ( NON_CONF_SECOND_LINE | INT ) ( NON_CONF_SECOND_LINE_COMMENT )* )
			{
			dbg.location(201,4);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:4: ( INT NON_CONFORMATION_CLASS_NAME ( NON_CONF_SECOND_LINE | INT ) ( NON_CONF_SECOND_LINE_COMMENT )* )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:5: INT NON_CONFORMATION_CLASS_NAME ( NON_CONF_SECOND_LINE | INT ) ( NON_CONF_SECOND_LINE_COMMENT )*
			{
			dbg.location(201,5);
			match(input,INT,FOLLOW_INT_in_non_conformation_ring664); if (state.failed) return json;dbg.location(201,9);
			match(input,NON_CONFORMATION_CLASS_NAME,FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring666); if (state.failed) return json;dbg.location(201,37);
			if ( input.LA(1)==INT||input.LA(1)==NON_CONF_SECOND_LINE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return json;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(201,64);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:64: ( NON_CONF_SECOND_LINE_COMMENT )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==NON_CONF_SECOND_LINE_COMMENT) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:201:65: NON_CONF_SECOND_LINE_COMMENT
					{
					dbg.location(201,65);
					match(input,NON_CONF_SECOND_LINE_COMMENT,FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring675); if (state.failed) return json;
					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}

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
		dbg.location(201, 95);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:202:1: rally_ring_block returns [JsonObject json] : ( ( rally_comment ) | ( rally_ring_name ( RALLY_RING_LINE )* ) );
	public final JsonObject rally_ring_block() throws RecognitionException{
		JsonObject json = null;


		json = new JsonObject();json.addProperty("Empty","rally: not captured"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}
		try { dbg.enterRule(getGrammarFileName(), "rally_ring_block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(202, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:3: ( ( rally_comment ) | ( rally_ring_name ( RALLY_RING_LINE )* ) )
			int alt25=2;
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			switch ( input.LA(1) ) {
			case RALLY_TOKEN:
				{
				int LA25_1 = input.LA(2);
				if ( (synpred46_test()) ) {
					alt25=1;
				}
				else if ( (true) ) {
					alt25=2;
				}

				}
				break;
			case RALLY_STANDALONE_COMMENT:
				{
				alt25=1;
				}
				break;
			case INT:
				{
				alt25=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return json;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: ( rally_comment )
					{
					dbg.location(204,5);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: ( rally_comment )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:6: rally_comment
					{
					dbg.location(204,6);
					pushFollow(FOLLOW_rally_comment_in_rally_ring_block696);
					rally_comment();
					state._fsp--;
					if (state.failed) return json;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:21: ( rally_ring_name ( RALLY_RING_LINE )* )
					{
					dbg.location(204,21);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:21: ( rally_ring_name ( RALLY_RING_LINE )* )
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:23: rally_ring_name ( RALLY_RING_LINE )*
					{
					dbg.location(204,23);
					pushFollow(FOLLOW_rally_ring_name_in_rally_ring_block701);
					rally_ring_name();
					state._fsp--;
					if (state.failed) return json;dbg.location(204,39);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:39: ( RALLY_RING_LINE )*
					try { dbg.enterSubRule(24);

					loop24:
					while (true) {
						int alt24=2;
						try { dbg.enterDecision(24, decisionCanBacktrack[24]);

						int LA24_0 = input.LA(1);
						if ( (LA24_0==RALLY_RING_LINE) ) {
							alt24=1;
						}

						} finally {dbg.exitDecision(24);}

						switch (alt24) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:39: RALLY_RING_LINE
							{
							dbg.location(204,39);
							match(input,RALLY_RING_LINE,FOLLOW_RALLY_RING_LINE_in_rally_ring_block703); if (state.failed) return json;
							}
							break;

						default :
							break loop24;
						}
					}
					} finally {dbg.exitSubRule(24);}

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
		dbg.location(204, 55);

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
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:205:1: rally_ring_name : ( INT RALLY_TOKEN_WITH_TYPE | RALLY_TOKEN );
	public final void rally_ring_name() throws RecognitionException{
		try { dbg.enterRule(getGrammarFileName(), "rally_ring_name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(205, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:2: ( INT RALLY_TOKEN_WITH_TYPE | RALLY_TOKEN )
			int alt26=2;
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==INT) ) {
				alt26=1;
			}
			else if ( (LA26_0==RALLY_TOKEN) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:4: INT RALLY_TOKEN_WITH_TYPE
					{
					dbg.location(206,4);
					match(input,INT,FOLLOW_INT_in_rally_ring_name713); if (state.failed) return;dbg.location(206,8);
					match(input,RALLY_TOKEN_WITH_TYPE,FOLLOW_RALLY_TOKEN_WITH_TYPE_in_rally_ring_name715); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:206:30: RALLY_TOKEN
					{
					dbg.location(206,30);
					match(input,RALLY_TOKEN,FOLLOW_RALLY_TOKEN_in_rally_ring_name717); if (state.failed) return;
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
		dbg.location(206, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rally_ring_name");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rally_ring_name"



	// $ANTLR start "rally_comment"
	// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:207:1: rally_comment : ( RALLY_TOKEN ( RALLY_CLASS_TYPE )? )? RALLY_STANDALONE_COMMENT ;
	public final void rally_comment() throws RecognitionException{
		try { dbg.enterRule(getGrammarFileName(), "rally_comment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(207, 0);

		try {
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:2: ( ( RALLY_TOKEN ( RALLY_CLASS_TYPE )? )? RALLY_STANDALONE_COMMENT )
			dbg.enterAlt(1);

			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:3: ( RALLY_TOKEN ( RALLY_CLASS_TYPE )? )? RALLY_STANDALONE_COMMENT
			{
			dbg.location(208,3);
			// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:3: ( RALLY_TOKEN ( RALLY_CLASS_TYPE )? )?
			int alt28=2;
			try { dbg.enterSubRule(28);
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==RALLY_TOKEN) ) {
				alt28=1;
			}
			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:4: RALLY_TOKEN ( RALLY_CLASS_TYPE )?
					{
					dbg.location(208,4);
					match(input,RALLY_TOKEN,FOLLOW_RALLY_TOKEN_in_rally_comment725); if (state.failed) return;dbg.location(208,16);
					// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:16: ( RALLY_CLASS_TYPE )?
					int alt27=2;
					try { dbg.enterSubRule(27);
					try { dbg.enterDecision(27, decisionCanBacktrack[27]);

					int LA27_0 = input.LA(1);
					if ( (LA27_0==RALLY_CLASS_TYPE) ) {
						alt27=1;
					}
					} finally {dbg.exitDecision(27);}

					switch (alt27) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:208:16: RALLY_CLASS_TYPE
							{
							dbg.location(208,16);
							match(input,RALLY_CLASS_TYPE,FOLLOW_RALLY_CLASS_TYPE_in_rally_comment727); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(27);}

					}
					break;

			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(208,36);
			match(input,RALLY_STANDALONE_COMMENT,FOLLOW_RALLY_STANDALONE_COMMENT_in_rally_comment732); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(208, 59);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rally_comment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rally_comment"

	// $ANTLR start synpred3_test
	public final void synpred3_test_fragment() throws RecognitionException{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:95: ( ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:126:96: ring
		{
		dbg.location(126,96);
		pushFollow(FOLLOW_ring_in_synpred3_test93);
		ring();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_test

	// $ANTLR start synpred13_test
	public final void synpred13_test_fragment() throws RecognitionException{
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:8: (mComment= comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:8: mComment= comment
		{
		dbg.location(144,16);
		pushFollow(FOLLOW_comment_in_synpred13_test275);
		mComment=comment();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred13_test

	// $ANTLR start synpred14_test
	public final void synpred14_test_fragment() throws RecognitionException{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:42: ( TIME )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:42: TIME
		{
		dbg.location(144,42);
		match(input,TIME,FOLLOW_TIME_in_synpred14_test278); if (state.failed) return;
		}

	}
	// $ANTLR end synpred14_test

	// $ANTLR start synpred15_test
	public final void synpred15_test_fragment() throws RecognitionException{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:64: ( PHONE_NUMBER )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:144:64: PHONE_NUMBER
		{
		dbg.location(144,64);
		match(input,PHONE_NUMBER,FOLLOW_PHONE_NUMBER_in_synpred15_test281); if (state.failed) return;
		}

	}
	// $ANTLR end synpred15_test

	// $ANTLR start synpred29_test
	public final void synpred29_test_fragment() throws RecognitionException{
		String mComment =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:259: (mComment= timeblock_comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:159:259: mComment= timeblock_comment
		{
		dbg.location(159,267);
		pushFollow(FOLLOW_timeblock_comment_in_synpred29_test427);
		mComment=timeblock_comment();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred29_test

	// $ANTLR start synpred31_test
	public final void synpred31_test_fragment() throws RecognitionException{
		JsonObject mSpecialRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:5: (mSpecialRing= special_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:5: mSpecialRing= special_ring
		{
		dbg.location(162,17);
		pushFollow(FOLLOW_special_ring_in_synpred31_test455);
		mSpecialRing=special_ring();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred31_test

	// $ANTLR start synpred32_test
	public final void synpred32_test_fragment() throws RecognitionException{
		JsonObject mJuniorRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:167: (mJuniorRing= junior_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:167: mJuniorRing= junior_ring
		{
		dbg.location(162,178);
		pushFollow(FOLLOW_junior_ring_in_synpred32_test460);
		mJuniorRing=junior_ring();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred32_test

	// $ANTLR start synpred34_test
	public final void synpred34_test_fragment() throws RecognitionException{
		JsonObject mBreedRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:324: ( ( ( breed_ring )=>mBreedRing= breed_ring ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:324: ( ( breed_ring )=>mBreedRing= breed_ring )
		{
		dbg.location(162,324);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:324: ( ( breed_ring )=>mBreedRing= breed_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:325: ( breed_ring )=>mBreedRing= breed_ring
		{
		dbg.location(162,349);
		pushFollow(FOLLOW_breed_ring_in_synpred34_test470);
		mBreedRing=breed_ring();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred34_test

	// $ANTLR start synpred35_test
	public final void synpred35_test_fragment() throws RecognitionException{
		JsonObject mConformation =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:492: ( (mConformation= non_conformation_ring ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:492: (mConformation= non_conformation_ring )
		{
		dbg.location(162,492);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:492: (mConformation= non_conformation_ring )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:493: mConformation= non_conformation_ring
		{
		dbg.location(162,506);
		pushFollow(FOLLOW_non_conformation_ring_in_synpred35_test477);
		mConformation=non_conformation_ring();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred35_test

	// $ANTLR start synpred36_test
	public final void synpred36_test_fragment() throws RecognitionException{
		JsonObject mRallyRing =null;

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:557: ( (mRallyRing= rally_ring_block ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:557: (mRallyRing= rally_ring_block )
		{
		dbg.location(162,557);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:557: (mRallyRing= rally_ring_block )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:558: mRallyRing= rally_ring_block
		{
		dbg.location(162,568);
		pushFollow(FOLLOW_rally_ring_block_in_synpred36_test484);
		mRallyRing=rally_ring_block();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred36_test

	// $ANTLR start synpred37_test
	public final void synpred37_test_fragment() throws RecognitionException{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:611: ( ( ring_comment ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:611: ( ring_comment )
		{
		dbg.location(162,611);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:611: ( ring_comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:162:612: ring_comment
		{
		dbg.location(162,612);
		pushFollow(FOLLOW_ring_comment_in_synpred37_test489);
		ring_comment();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred37_test

	// $ANTLR start synpred46_test
	public final void synpred46_test_fragment() throws RecognitionException{
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: ( ( rally_comment ) )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: ( rally_comment )
		{
		dbg.location(204,5);
		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:5: ( rally_comment )
		dbg.enterAlt(1);

		// C:\\Users\\Taylor\\Documents\\GitHub\\dogshow\\grammar\\ANTLR\\test.g:204:6: rally_comment
		{
		dbg.location(204,6);
		pushFollow(FOLLOW_rally_comment_in_synpred46_test696);
		rally_comment();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred46_test

	// Delegated rules

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
	public final boolean synpred37_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred37_test_fragment(); // can never throw exception
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
	public final boolean synpred36_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred36_test_fragment(); // can never throw exception
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
	public final boolean synpred35_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred35_test_fragment(); // can never throw exception
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
	public final boolean synpred34_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred34_test_fragment(); // can never throw exception
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
	public final boolean synpred31_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred31_test_fragment(); // can never throw exception
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
	public final boolean synpred29_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred29_test_fragment(); // can never throw exception
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
	public final boolean synpred32_test() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred32_test_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_special_ring_in_test_special47 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_breed_ring_in_test_breed61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_big_comment_in_start85 = new BitSet(new long[]{0x0058024060000740L});
	public static final BitSet FOLLOW_ring_in_start98 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EOF_in_start105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RING_TITLE_in_ring131 = new BitSet(new long[]{0x0040004080000100L});
	public static final BitSet FOLLOW_inner_ring_in_ring136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_block_in_inner_ring162 = new BitSet(new long[]{0x0040024040000702L});
	public static final BitSet FOLLOW_comment_in_inner_ring165 = new BitSet(new long[]{0x0040024040000702L});
	public static final BitSet FOLLOW_judge_block_in_inner_ring179 = new BitSet(new long[]{0x0000004080000102L});
	public static final BitSet FOLLOW_judge_name_in_judge_block209 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_timeblock_in_judge_block215 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_JUDGE_NAME_in_judge_name239 = new BitSet(new long[]{0x0000000080000002L});
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
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_ring_comment391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_timeblock414 = new BitSet(new long[]{0x0023000040000002L});
	public static final BitSet FOLLOW_inner_timeblock_in_timeblock421 = new BitSet(new long[]{0x0023024040000702L});
	public static final BitSet FOLLOW_timeblock_comment_in_timeblock427 = new BitSet(new long[]{0x0023024040000702L});
	public static final BitSet FOLLOW_special_ring_in_inner_timeblock455 = new BitSet(new long[]{0x0023000040000002L});
	public static final BitSet FOLLOW_junior_ring_in_inner_timeblock460 = new BitSet(new long[]{0x0023000040000002L});
	public static final BitSet FOLLOW_breed_ring_in_inner_timeblock470 = new BitSet(new long[]{0x0023000040000002L});
	public static final BitSet FOLLOW_non_conformation_ring_in_inner_timeblock477 = new BitSet(new long[]{0x0023000040000002L});
	public static final BitSet FOLLOW_rally_ring_block_in_inner_timeblock484 = new BitSet(new long[]{0x0023000040000002L});
	public static final BitSet FOLLOW_ring_comment_in_inner_timeblock489 = new BitSet(new long[]{0x0023000040000002L});
	public static final BitSet FOLLOW_INT_in_junior_ring513 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_JUNIOR_CLASS_in_junior_ring516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_special_ring537 = new BitSet(new long[]{0x0010000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_special_ring541 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SPECIAL_SUFFIX_in_special_ring547 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_GROUP_RING_in_group_ring569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_group_block588 = new BitSet(new long[]{0x0020000020000000L});
	public static final BitSet FOLLOW_STANDALONE_COMMENT_in_group_block591 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_group_ring_in_group_block597 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_INT_in_breed_ring625 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BREED_NAME_in_breed_ring628 = new BitSet(new long[]{0x0000000000000092L});
	public static final BitSet FOLLOW_BREED_NAME_SUFFIX_in_breed_ring632 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_BREED_COUNT_in_breed_ring640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_non_conformation_ring664 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_NON_CONFORMATION_CLASS_NAME_in_non_conformation_ring666 = new BitSet(new long[]{0x0000001040000000L});
	public static final BitSet FOLLOW_set_in_non_conformation_ring668 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_NON_CONF_SECOND_LINE_COMMENT_in_non_conformation_ring675 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_rally_comment_in_rally_ring_block696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_name_in_rally_ring_block701 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_RALLY_RING_LINE_in_rally_ring_block703 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_INT_in_rally_ring_name713 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_RALLY_TOKEN_WITH_TYPE_in_rally_ring_name715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RALLY_TOKEN_in_rally_ring_name717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RALLY_TOKEN_in_rally_comment725 = new BitSet(new long[]{0x0001200000000000L});
	public static final BitSet FOLLOW_RALLY_CLASS_TYPE_in_rally_comment727 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_RALLY_STANDALONE_COMMENT_in_rally_comment732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_in_synpred3_test93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comment_in_synpred13_test275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIME_in_synpred14_test278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PHONE_NUMBER_in_synpred15_test281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeblock_comment_in_synpred29_test427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_special_ring_in_synpred31_test455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_junior_ring_in_synpred32_test460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breed_ring_in_synpred34_test470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_non_conformation_ring_in_synpred35_test477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_ring_block_in_synpred36_test484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ring_comment_in_synpred37_test489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rally_comment_in_synpred46_test696 = new BitSet(new long[]{0x0000000000000002L});
}
