// Generated from C:\Users\Taylor\Documents\GitHub\dogshow\grammar\JavaTest\src\dev\tclark\dogshow\grammar\onofrio\OnofrioParser.g4 by ANTLR 4.1
package dev.tnclark8012.dogshow.grammar.onofrio;

//TODO Puppy groups
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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OnofrioParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STANDALONE_COMMENT=18, RALLY_CLASS=13, BREED_COUNT=19, NON_CONF_SECOND_LINE_COMMENT=12, 
		JUNIOR_CLASS=2, ELLIPSIS=26, RING=7, GROUP_BLOCK_TYPE=17, INT=27, BREED_NAME=4, 
		GROUP_NAME=9, BREED_NAME_SUFFIX=6, SPECIAL_SUFFIX=5, PARENTHETICAL_INT=28, 
		CLUB_INDICATOR=31, TIME=23, GROUP=8, NON_CONFORMATION_SECOND_LINE=16, 
		RALLY_ENTRY=15, WS=21, NON_CONFORMATION_CLASS_NAME=11, JUDGE_NAME=20, 
		HYPHEN=30, GROUP_ENDING_ANNOUNCEMENT=33, PARENTHETICAL=29, FOLLOWING_TIME=24, 
		GROUP_RING=10, PHONE_NUMBER=22, FallThrough=34, BREED_CLASSIFIER=3, COMMENT=32, 
		DATE=25, RALLY_ENTRY_TITLE=14, PUPPY_CLASS=1;
	public static final String[] tokenNames = {
		"<INVALID>", "PUPPY_CLASS", "JUNIOR_CLASS", "BREED_CLASSIFIER", "BREED_NAME", 
		"SPECIAL_SUFFIX", "BREED_NAME_SUFFIX", "'RING'", "'GROUP'", "GROUP_NAME", 
		"GROUP_RING", "NON_CONFORMATION_CLASS_NAME", "NON_CONF_SECOND_LINE_COMMENT", 
		"RALLY_CLASS", "'inch: '", "RALLY_ENTRY", "NON_CONFORMATION_SECOND_LINE", 
		"GROUP_BLOCK_TYPE", "'LUNCH'", "BREED_COUNT", "JUDGE_NAME", "WS", "PHONE_NUMBER", 
		"TIME", "'minutes following Best in Show'", "DATE", "ELLIPSIS", "INT", 
		"PARENTHETICAL_INT", "PARENTHETICAL", "'-'", "CLUB_INDICATOR", "COMMENT", 
		"GROUP_ENDING_ANNOUNCEMENT", "FallThrough"
	};
	public static final int
		RULE_start = 0, RULE_ring = 1, RULE_ring_title = 2, RULE_puppy_ring_header = 3, 
		RULE_special_ring_header = 4, RULE_inner_ring = 5, RULE_judge_block = 6, 
		RULE_judge_name = 7, RULE_big_comment = 8, RULE_comment = 9, RULE_non_header_comment = 10, 
		RULE_non_ring_title_comment = 11, RULE_timeblock_comment = 12, RULE_ring_comment = 13, 
		RULE_timeblock = 14, RULE_non_group_ring = 15, RULE_inner_timeblock = 16, 
		RULE_rally_walkthrough = 17, RULE_ring_with_breed = 18, RULE_obedience_with_breed = 19, 
		RULE_special_suffix = 20, RULE_breed_name = 21, RULE_ring_without_breed = 22, 
		RULE_rally_ring = 23, RULE_empty_breed_ring = 24, RULE_non_conformation_breed_ring = 25, 
		RULE_breed_ring = 26, RULE_special_ring = 27, RULE_group_ring = 28, RULE_group_block = 29, 
		RULE_non_conformation_ring = 30, RULE_rally_ring_block = 31, RULE_rally_ring_name = 32, 
		RULE_rally_entry_line = 33, RULE_rally_comment = 34, RULE_junior_ring = 35;
	public static final String[] ruleNames = {
		"start", "ring", "ring_title", "puppy_ring_header", "special_ring_header", 
		"inner_ring", "judge_block", "judge_name", "big_comment", "comment", "non_header_comment", 
		"non_ring_title_comment", "timeblock_comment", "ring_comment", "timeblock", 
		"non_group_ring", "inner_timeblock", "rally_walkthrough", "ring_with_breed", 
		"obedience_with_breed", "special_suffix", "breed_name", "ring_without_breed", 
		"rally_ring", "empty_breed_ring", "non_conformation_breed_ring", "breed_ring", 
		"special_ring", "group_ring", "group_block", "non_conformation_ring", 
		"rally_ring_block", "rally_ring_name", "rally_entry_line", "rally_comment", 
		"junior_ring"
	};

	@Override
	public String getGrammarFileName() { return "OnofrioParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	String currentBlockTime = null;
	boolean debug = false;

	// Non-relational style objects for better JSON
	public boolean mRelational = false;
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
	  
	  

	public OnofrioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public JsonObject json;
		public Big_commentContext mComment;
		public RingContext mRing;
		public TerminalNode EOF() { return getToken(OnofrioParser.EOF, 0); }
		public List<RingContext> ring() {
			return getRuleContexts(RingContext.class);
		}
		public Big_commentContext big_comment(int i) {
			return getRuleContext(Big_commentContext.class,i);
		}
		public List<Big_commentContext> big_comment() {
			return getRuleContexts(Big_commentContext.class);
		}
		public RingContext ring(int i) {
			return getRuleContext(RingContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		((StartContext)_localctx).json =  new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(72); ((StartContext)_localctx).mComment = big_comment();
					comments+=((StartContext)_localctx).mComment.str;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			_localctx.json.addProperty("Comment", comments);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80); ((StartContext)_localctx).mRing = ring();
				ringArray.add(((StartContext)_localctx).mRing.json);
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUPPY_CLASS) | (1L << RING) | (1L << GROUP) | (1L << CLUB_INDICATOR))) != 0) );
			_localctx.json.add("Rings", ringArray); if(!mRelational){((StartContext)_localctx).json =  new JsonObject(); _localctx.json.add("Rings", mShowRings);}
			setState(88); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RingContext extends ParserRuleContext {
		public JsonObject json;
		public boolean hasHeader=false; String title = null;;
		public Ring_titleContext mTitle;
		public Inner_ringContext mRing;
		public Special_ring_headerContext special_ring_header() {
			return getRuleContext(Special_ring_headerContext.class,0);
		}
		public Ring_titleContext ring_title() {
			return getRuleContext(Ring_titleContext.class,0);
		}
		public Puppy_ring_headerContext puppy_ring_header() {
			return getRuleContext(Puppy_ring_headerContext.class,0);
		}
		public Inner_ringContext inner_ring() {
			return getRuleContext(Inner_ringContext.class,0);
		}
		public RingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterRing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitRing(this);
		}
	}

	public final RingContext ring() throws RecognitionException {
		RingContext _localctx = new RingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ring);
		((RingContext)_localctx).json =  new JsonObject(); if(debug){System.out.println("ring...");}mLastBreedName = null;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			switch (_input.LA(1)) {
			case CLUB_INDICATOR:
				{
				setState(90); special_ring_header();
				_localctx.hasHeader=true;isSpecialtyRing=true;
				}
				break;
			case PUPPY_CLASS:
				{
				setState(93); puppy_ring_header();
				}
				break;
			case RING:
			case GROUP:
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(96); ((RingContext)_localctx).mTitle = ring_title();
			if(!_localctx.hasHeader){isSpecialtyRing=false;}_localctx.title=((RingContext)_localctx).mTitle.str;_localctx.json.addProperty("Title", _localctx.title); _localctx.json.addProperty("Number", parseRingNumber(_localctx.title));if(!mRelational){mCurrentRingNumber=parseRingNumber(_localctx.title);}
			}
			setState(99); ((RingContext)_localctx).mRing = inner_ring();
			_localctx.json.add("Ring", ((RingContext)_localctx).mRing.json);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ring_titleContext extends ParserRuleContext {
		public String str;
		public Token RING;
		public Token INT;
		public TerminalNode INT() { return getToken(OnofrioParser.INT, 0); }
		public TerminalNode GROUP() { return getToken(OnofrioParser.GROUP, 0); }
		public TerminalNode RING() { return getToken(OnofrioParser.RING, 0); }
		public Ring_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ring_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterRing_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitRing_title(this);
		}
	}

	public final Ring_titleContext ring_title() throws RecognitionException {
		Ring_titleContext _localctx = new Ring_titleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ring_title);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case RING:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(102); ((Ring_titleContext)_localctx).RING = match(RING);
				_localctx.str=(((Ring_titleContext)_localctx).RING!=null?((Ring_titleContext)_localctx).RING.getText():null);
				setState(104); ((Ring_titleContext)_localctx).INT = match(INT);
				_localctx.str+=" " + (((Ring_titleContext)_localctx).INT!=null?((Ring_titleContext)_localctx).INT.getText():null);
				}
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(106); match(GROUP);
				setState(107); match(RING);
				_localctx.str="GROUP RING";
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Puppy_ring_headerContext extends ParserRuleContext {
		public String str;
		public Token PUPPY_CLASS;
		public TerminalNode PUPPY_CLASS() { return getToken(OnofrioParser.PUPPY_CLASS, 0); }
		public Puppy_ring_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puppy_ring_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterPuppy_ring_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitPuppy_ring_header(this);
		}
	}

	public final Puppy_ring_headerContext puppy_ring_header() throws RecognitionException {
		Puppy_ring_headerContext _localctx = new Puppy_ring_headerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_puppy_ring_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); ((Puppy_ring_headerContext)_localctx).PUPPY_CLASS = match(PUPPY_CLASS);
			((Puppy_ring_headerContext)_localctx).str = (((Puppy_ring_headerContext)_localctx).PUPPY_CLASS!=null?((Puppy_ring_headerContext)_localctx).PUPPY_CLASS.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_ring_headerContext extends ParserRuleContext {
		public String str;
		public Token CLUB_INDICATOR;
		public TerminalNode INT() { return getToken(OnofrioParser.INT, 0); }
		public TerminalNode COMMENT(int i) {
			return getToken(OnofrioParser.COMMENT, i);
		}
		public TerminalNode HYPHEN() { return getToken(OnofrioParser.HYPHEN, 0); }
		public TerminalNode CLUB_INDICATOR() { return getToken(OnofrioParser.CLUB_INDICATOR, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(OnofrioParser.COMMENT); }
		public Special_ring_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_ring_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterSpecial_ring_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitSpecial_ring_header(this);
		}
	}

	public final Special_ring_headerContext special_ring_header() throws RecognitionException {
		Special_ring_headerContext _localctx = new Special_ring_headerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_special_ring_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); ((Special_ring_headerContext)_localctx).CLUB_INDICATOR = match(CLUB_INDICATOR);

			         _localctx.str=(((Special_ring_headerContext)_localctx).CLUB_INDICATOR!=null?((Special_ring_headerContext)_localctx).CLUB_INDICATOR.getText():null);
			         if(mLastComment!=null){
			            Breeds breed = Breeds.find(mLastComment);
			            if(breed!=null){
			                mSpecialtyGroup=null;
			                mSpecialtyBreed = breed.getPrimaryName();
			                latestBreed=mSpecialtyBreed;
			            }
			            else{
			                 mSpecialtyBreed=null;
			                 BreedGroup group = BreedGroup.find(mLastComment);
			                 if(group!=null){
			                    mSpecialtyGroup=group.getName();
			                 }
			            }
			        }
			        
			setState(116); match(HYPHEN);
			setState(117); match(INT);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(118); match(COMMENT);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inner_ringContext extends ParserRuleContext {
		public JsonObject json;
		public JsonArray judgeBlocks = new JsonArray();;
		public Group_blockContext mGroupBlock;
		public Judge_blockContext mJugeBlock;
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public List<Judge_blockContext> judge_block() {
			return getRuleContexts(Judge_blockContext.class);
		}
		public Judge_blockContext judge_block(int i) {
			return getRuleContext(Judge_blockContext.class,i);
		}
		public Group_blockContext group_block() {
			return getRuleContext(Group_blockContext.class,0);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Inner_ringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_ring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterInner_ring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitInner_ring(this);
		}
	}

	public final Inner_ringContext inner_ring() throws RecognitionException {
		Inner_ringContext _localctx = new Inner_ringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inner_ring);
		((Inner_ringContext)_localctx).json =  new JsonObject();
		int _la;
		try {
			int _alt;
			setState(141);
			switch (_input.LA(1)) {
			case TIME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(124); ((Inner_ringContext)_localctx).mGroupBlock = group_block();
				_localctx.json.add("GroupRing", _localctx.mGroupBlock.json);
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(126); comment();
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				}
				break;
			case JUDGE_NAME:
			case PARENTHETICAL_INT:
			case PARENTHETICAL:
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132); ((Inner_ringContext)_localctx).mJugeBlock = judge_block();
					_localctx.judgeBlocks.add(_localctx.mJugeBlock.json);
					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JUDGE_NAME) | (1L << PARENTHETICAL_INT) | (1L << PARENTHETICAL) | (1L << COMMENT))) != 0) );
				_localctx.json.add("JudgeBlocks", _localctx.judgeBlocks);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Judge_blockContext extends ParserRuleContext {
		public JsonObject json;
		public JsonArray array = new JsonArray();;
		public Judge_nameContext mName;
		public TimeblockContext mBlock;
		public List<TimeblockContext> timeblock() {
			return getRuleContexts(TimeblockContext.class);
		}
		public TimeblockContext timeblock(int i) {
			return getRuleContext(TimeblockContext.class,i);
		}
		public Judge_nameContext judge_name() {
			return getRuleContext(Judge_nameContext.class,0);
		}
		public Judge_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judge_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterJudge_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitJudge_block(this);
		}
	}

	public final Judge_blockContext judge_block() throws RecognitionException {
		Judge_blockContext _localctx = new Judge_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_judge_block);
		((Judge_blockContext)_localctx).json =  new JsonObject(); nextJudgeIsNewRing = true;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); ((Judge_blockContext)_localctx).mName = judge_name();
			if(!mRelational){mCurrentJudge = ((Judge_blockContext)_localctx).mName.json;judgeSet.add(mCurrentJudge.get("Judge").getAsString());}mergeJson(_localctx.json, _localctx.mName.json);
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145); ((Judge_blockContext)_localctx).mBlock = timeblock();
				_localctx.array.add(_localctx.mBlock.json);
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TIME || _la==INT );
			_localctx.json.add("TimeBlocks", _localctx.array);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Judge_nameContext extends ParserRuleContext {
		public JsonObject json;
		public String str = "";;
		public Token JUDGE_NAME;
		public Token COMMENT;
		public Token PARENTHETICAL;
		public Token PARENTHETICAL_INT;
		public TerminalNode PARENTHETICAL(int i) {
			return getToken(OnofrioParser.PARENTHETICAL, i);
		}
		public List<TerminalNode> PARENTHETICAL_INT() { return getTokens(OnofrioParser.PARENTHETICAL_INT); }
		public TerminalNode COMMENT(int i) {
			return getToken(OnofrioParser.COMMENT, i);
		}
		public TerminalNode JUDGE_NAME() { return getToken(OnofrioParser.JUDGE_NAME, 0); }
		public TerminalNode PARENTHETICAL_INT(int i) {
			return getToken(OnofrioParser.PARENTHETICAL_INT, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(OnofrioParser.COMMENT); }
		public List<TerminalNode> PARENTHETICAL() { return getTokens(OnofrioParser.PARENTHETICAL); }
		public Judge_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judge_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterJudge_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitJudge_name(this);
		}
	}

	public final Judge_nameContext judge_name() throws RecognitionException {
		Judge_nameContext _localctx = new Judge_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_judge_name);
		((Judge_nameContext)_localctx).json =  new JsonObject();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			switch (_input.LA(1)) {
			case JUDGE_NAME:
				{
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154); ((Judge_nameContext)_localctx).JUDGE_NAME = match(JUDGE_NAME);
					_localctx.str+=(((Judge_nameContext)_localctx).JUDGE_NAME!=null?((Judge_nameContext)_localctx).JUDGE_NAME.getText():null);
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==JUDGE_NAME );
				}
				break;
			case PARENTHETICAL_INT:
			case PARENTHETICAL:
			case COMMENT:
				{
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(166);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(160); ((Judge_nameContext)_localctx).COMMENT = match(COMMENT);
						_localctx.str+=(((Judge_nameContext)_localctx).COMMENT!=null?((Judge_nameContext)_localctx).COMMENT.getText():null)+" ";
						}
						break;
					case PARENTHETICAL:
						{
						setState(162); ((Judge_nameContext)_localctx).PARENTHETICAL = match(PARENTHETICAL);
						_localctx.str+=(((Judge_nameContext)_localctx).PARENTHETICAL!=null?((Judge_nameContext)_localctx).PARENTHETICAL.getText():null)+" ";
						}
						break;
					case PARENTHETICAL_INT:
						{
						setState(164); ((Judge_nameContext)_localctx).PARENTHETICAL_INT = match(PARENTHETICAL_INT);
						_localctx.str+=(((Judge_nameContext)_localctx).PARENTHETICAL_INT!=null?((Judge_nameContext)_localctx).PARENTHETICAL_INT.getText():null);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTHETICAL_INT) | (1L << PARENTHETICAL) | (1L << COMMENT))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(nextJudgeIsNewRing == true||_localctx.str.matches(".*\\(\\d+\\).*")){ nextJudgeIsNewRing = false;_localctx.json.addProperty("NewJudgeRing",true); }((Judge_nameContext)_localctx).str =  _localctx.str.replaceAll("[\r\n]"," ");_localctx.json.addProperty("Judge",stripJudgeCount(_localctx.str).trim());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Big_commentContext extends ParserRuleContext {
		public String str;
		public CommentContext mComment;
		public Token TIME;
		public Token PHONE_NUMBER;
		public Token BREED_NAME;
		public Token SPECIAL_SUFFIX;
		public Token GROUP_RING;
		public Token NON_CONFORMATION_SECOND_LINE;
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode TIME() { return getToken(OnofrioParser.TIME, 0); }
		public TerminalNode BREED_NAME() { return getToken(OnofrioParser.BREED_NAME, 0); }
		public TerminalNode PHONE_NUMBER() { return getToken(OnofrioParser.PHONE_NUMBER, 0); }
		public TerminalNode GROUP_RING() { return getToken(OnofrioParser.GROUP_RING, 0); }
		public TerminalNode NON_CONFORMATION_SECOND_LINE() { return getToken(OnofrioParser.NON_CONFORMATION_SECOND_LINE, 0); }
		public TerminalNode SPECIAL_SUFFIX() { return getToken(OnofrioParser.SPECIAL_SUFFIX, 0); }
		public Big_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_big_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterBig_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitBig_comment(this);
		}
	}

	public final Big_commentContext big_comment() throws RecognitionException {
		Big_commentContext _localctx = new Big_commentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_big_comment);
		((Big_commentContext)_localctx).str =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(174); ((Big_commentContext)_localctx).mComment = comment();
				((Big_commentContext)_localctx).str =  ((Big_commentContext)_localctx).mComment.str;
				}
				break;

			case 2:
				{
				setState(177); ((Big_commentContext)_localctx).TIME = match(TIME);
				((Big_commentContext)_localctx).str = (((Big_commentContext)_localctx).TIME!=null?((Big_commentContext)_localctx).TIME.getText():null);
				}
				break;

			case 3:
				{
				setState(179); ((Big_commentContext)_localctx).PHONE_NUMBER = match(PHONE_NUMBER);
				((Big_commentContext)_localctx).str = (((Big_commentContext)_localctx).PHONE_NUMBER!=null?((Big_commentContext)_localctx).PHONE_NUMBER.getText():null);
				}
				break;

			case 4:
				{
				setState(181); ((Big_commentContext)_localctx).BREED_NAME = match(BREED_NAME);
				((Big_commentContext)_localctx).str = (((Big_commentContext)_localctx).BREED_NAME!=null?((Big_commentContext)_localctx).BREED_NAME.getText():null);
				}
				break;

			case 5:
				{
				setState(183); ((Big_commentContext)_localctx).SPECIAL_SUFFIX = match(SPECIAL_SUFFIX);
				((Big_commentContext)_localctx).str = (((Big_commentContext)_localctx).SPECIAL_SUFFIX!=null?((Big_commentContext)_localctx).SPECIAL_SUFFIX.getText():null);
				}
				break;

			case 6:
				{
				setState(185); ((Big_commentContext)_localctx).GROUP_RING = match(GROUP_RING);
				((Big_commentContext)_localctx).str = (((Big_commentContext)_localctx).GROUP_RING!=null?((Big_commentContext)_localctx).GROUP_RING.getText():null);
				}
				break;

			case 7:
				{
				setState(187); ((Big_commentContext)_localctx).NON_CONFORMATION_SECOND_LINE = match(NON_CONFORMATION_SECOND_LINE);
				((Big_commentContext)_localctx).str = (((Big_commentContext)_localctx).NON_CONFORMATION_SECOND_LINE!=null?((Big_commentContext)_localctx).NON_CONFORMATION_SECOND_LINE.getText():null);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public String str;
		public Token NON_CONFORMATION_CLASS_NAME;
		public Token GROUP_NAME;
		public Token BREED_NAME;
		public Token BREED_CLASSIFIER;
		public Token TIME;
		public Token COMMENT;
		public Token PARENTHETICAL;
		public Token INT;
		public Token ELLIPSIS;
		public Token DATE;
		public Token PHONE_NUMBER;
		public Token NON_CONFORMATION_SECOND_LINE;
		public TerminalNode INT() { return getToken(OnofrioParser.INT, 0); }
		public TerminalNode NON_CONFORMATION_CLASS_NAME() { return getToken(OnofrioParser.NON_CONFORMATION_CLASS_NAME, 0); }
		public TerminalNode TIME() { return getToken(OnofrioParser.TIME, 0); }
		public TerminalNode PHONE_NUMBER() { return getToken(OnofrioParser.PHONE_NUMBER, 0); }
		public TerminalNode GROUP_NAME() { return getToken(OnofrioParser.GROUP_NAME, 0); }
		public Non_header_commentContext non_header_comment() {
			return getRuleContext(Non_header_commentContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(OnofrioParser.ELLIPSIS, 0); }
		public TerminalNode DATE() { return getToken(OnofrioParser.DATE, 0); }
		public TerminalNode PARENTHETICAL_INT() { return getToken(OnofrioParser.PARENTHETICAL_INT, 0); }
		public TerminalNode BREED_COUNT() { return getToken(OnofrioParser.BREED_COUNT, 0); }
		public TerminalNode BREED_NAME() { return getToken(OnofrioParser.BREED_NAME, 0); }
		public Non_ring_title_commentContext non_ring_title_comment() {
			return getRuleContext(Non_ring_title_commentContext.class,0);
		}
		public TerminalNode BREED_CLASSIFIER() { return getToken(OnofrioParser.BREED_CLASSIFIER, 0); }
		public TerminalNode HYPHEN() { return getToken(OnofrioParser.HYPHEN, 0); }
		public TerminalNode COMMENT() { return getToken(OnofrioParser.COMMENT, 0); }
		public TerminalNode PARENTHETICAL() { return getToken(OnofrioParser.PARENTHETICAL, 0); }
		public TerminalNode NON_CONFORMATION_SECOND_LINE() { return getToken(OnofrioParser.NON_CONFORMATION_SECOND_LINE, 0); }
		public TerminalNode GROUP() { return getToken(OnofrioParser.GROUP, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comment);
		((CommentContext)_localctx).str = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(191); non_header_comment();
				}
				break;

			case 2:
				{
				setState(192); non_ring_title_comment();
				}
				break;

			case 3:
				{
				setState(193); match(PARENTHETICAL_INT);
				}
				break;

			case 4:
				{
				setState(194); match(BREED_COUNT);
				}
				break;

			case 5:
				{
				setState(195); ((CommentContext)_localctx).NON_CONFORMATION_CLASS_NAME = match(NON_CONFORMATION_CLASS_NAME);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).NON_CONFORMATION_CLASS_NAME!=null?((CommentContext)_localctx).NON_CONFORMATION_CLASS_NAME.getText():null);
				}
				break;

			case 6:
				{
				setState(197); match(GROUP);
				}
				break;

			case 7:
				{
				setState(198); ((CommentContext)_localctx).GROUP_NAME = match(GROUP_NAME);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).GROUP_NAME!=null?((CommentContext)_localctx).GROUP_NAME.getText():null);
				}
				break;

			case 8:
				{
				setState(200); match(HYPHEN);
				}
				break;

			case 9:
				{
				setState(201); ((CommentContext)_localctx).BREED_NAME = match(BREED_NAME);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).BREED_NAME!=null?((CommentContext)_localctx).BREED_NAME.getText():null);
				}
				break;

			case 10:
				{
				setState(203); ((CommentContext)_localctx).BREED_CLASSIFIER = match(BREED_CLASSIFIER);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).BREED_CLASSIFIER!=null?((CommentContext)_localctx).BREED_CLASSIFIER.getText():null);
				}
				break;

			case 11:
				{
				setState(205); ((CommentContext)_localctx).TIME = match(TIME);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).TIME!=null?((CommentContext)_localctx).TIME.getText():null);
				}
				break;

			case 12:
				{
				setState(207); ((CommentContext)_localctx).COMMENT = match(COMMENT);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).COMMENT!=null?((CommentContext)_localctx).COMMENT.getText():null);
				}
				break;

			case 13:
				{
				setState(209); ((CommentContext)_localctx).PARENTHETICAL = match(PARENTHETICAL);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).PARENTHETICAL!=null?((CommentContext)_localctx).PARENTHETICAL.getText():null);
				}
				break;

			case 14:
				{
				setState(211); ((CommentContext)_localctx).INT = match(INT);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).INT!=null?((CommentContext)_localctx).INT.getText():null);
				}
				break;

			case 15:
				{
				setState(213); ((CommentContext)_localctx).ELLIPSIS = match(ELLIPSIS);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).ELLIPSIS!=null?((CommentContext)_localctx).ELLIPSIS.getText():null);
				}
				break;

			case 16:
				{
				setState(215); ((CommentContext)_localctx).DATE = match(DATE);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).DATE!=null?((CommentContext)_localctx).DATE.getText():null);
				}
				break;

			case 17:
				{
				setState(217); ((CommentContext)_localctx).PHONE_NUMBER = match(PHONE_NUMBER);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).PHONE_NUMBER!=null?((CommentContext)_localctx).PHONE_NUMBER.getText():null);
				}
				break;

			case 18:
				{
				setState(219); ((CommentContext)_localctx).NON_CONFORMATION_SECOND_LINE = match(NON_CONFORMATION_SECOND_LINE);
				((CommentContext)_localctx).str = (((CommentContext)_localctx).NON_CONFORMATION_SECOND_LINE!=null?((CommentContext)_localctx).NON_CONFORMATION_SECOND_LINE.getText():null);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_header_commentContext extends ParserRuleContext {
		public TerminalNode CLUB_INDICATOR() { return getToken(OnofrioParser.CLUB_INDICATOR, 0); }
		public Non_header_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_header_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterNon_header_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitNon_header_comment(this);
		}
	}

	public final Non_header_commentContext non_header_comment() throws RecognitionException {
		Non_header_commentContext _localctx = new Non_header_commentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_non_header_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			if (!(!(_input.LT(2).getText().equals("-") && parseIntSafely(_input.LT(3).getText(),-1)!=-1 && _input.LT(4).getText().equals("RING")))) throw new FailedPredicateException(this, "!(_input.LT(2).getText().equals(\"-\") && parseIntSafely(_input.LT(3).getText(),-1)!=-1 && _input.LT(4).getText().equals(\"RING\"))");
			setState(224); match(CLUB_INDICATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_ring_title_commentContext extends ParserRuleContext {
		public TerminalNode RING() { return getToken(OnofrioParser.RING, 0); }
		public Non_ring_title_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_ring_title_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterNon_ring_title_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitNon_ring_title_comment(this);
		}
	}

	public final Non_ring_title_commentContext non_ring_title_comment() throws RecognitionException {
		Non_ring_title_commentContext _localctx = new Non_ring_title_commentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_non_ring_title_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			if (!(!(parseIntSafely(_input.LT(2).getText(),-1)!=-1))) throw new FailedPredicateException(this, "!(parseIntSafely(_input.LT(2).getText(),-1)!=-1)");
			setState(227); match(RING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timeblock_commentContext extends ParserRuleContext {
		public String str;
		public Token GROUP_NAME;
		public Token NON_CONFORMATION_CLASS_NAME;
		public Token BREED_NAME;
		public Token COMMENT;
		public Token PARENTHETICAL;
		public Token INT;
		public Token ELLIPSIS;
		public Token DATE;
		public Token PHONE_NUMBER;
		public TerminalNode NON_CONFORMATION_CLASS_NAME() { return getToken(OnofrioParser.NON_CONFORMATION_CLASS_NAME, 0); }
		public TerminalNode INT() { return getToken(OnofrioParser.INT, 0); }
		public TerminalNode PHONE_NUMBER() { return getToken(OnofrioParser.PHONE_NUMBER, 0); }
		public TerminalNode GROUP_NAME() { return getToken(OnofrioParser.GROUP_NAME, 0); }
		public TerminalNode GROUP_RING() { return getToken(OnofrioParser.GROUP_RING, 0); }
		public Non_header_commentContext non_header_comment() {
			return getRuleContext(Non_header_commentContext.class,0);
		}
		public TerminalNode NON_CONF_SECOND_LINE_COMMENT() { return getToken(OnofrioParser.NON_CONF_SECOND_LINE_COMMENT, 0); }
		public TerminalNode ELLIPSIS() { return getToken(OnofrioParser.ELLIPSIS, 0); }
		public TerminalNode DATE() { return getToken(OnofrioParser.DATE, 0); }
		public TerminalNode BREED_NAME() { return getToken(OnofrioParser.BREED_NAME, 0); }
		public TerminalNode BREED_CLASSIFIER() { return getToken(OnofrioParser.BREED_CLASSIFIER, 0); }
		public TerminalNode HYPHEN() { return getToken(OnofrioParser.HYPHEN, 0); }
		public TerminalNode COMMENT() { return getToken(OnofrioParser.COMMENT, 0); }
		public TerminalNode PARENTHETICAL() { return getToken(OnofrioParser.PARENTHETICAL, 0); }
		public TerminalNode SPECIAL_SUFFIX() { return getToken(OnofrioParser.SPECIAL_SUFFIX, 0); }
		public Timeblock_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeblock_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterTimeblock_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitTimeblock_comment(this);
		}
	}

	public final Timeblock_commentContext timeblock_comment() throws RecognitionException {
		Timeblock_commentContext _localctx = new Timeblock_commentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_timeblock_comment);
		((Timeblock_commentContext)_localctx).str = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(229); ((Timeblock_commentContext)_localctx).GROUP_NAME = match(GROUP_NAME);
				((Timeblock_commentContext)_localctx).str = (((Timeblock_commentContext)_localctx).GROUP_NAME!=null?((Timeblock_commentContext)_localctx).GROUP_NAME.getText():null);
				}
				break;

			case 2:
				{
				setState(231); non_header_comment();
				}
				break;

			case 3:
				{
				setState(232); match(HYPHEN);
				}
				break;

			case 4:
				{
				setState(233); ((Timeblock_commentContext)_localctx).NON_CONFORMATION_CLASS_NAME = match(NON_CONFORMATION_CLASS_NAME);
				((Timeblock_commentContext)_localctx).str = (((Timeblock_commentContext)_localctx).NON_CONFORMATION_CLASS_NAME!=null?((Timeblock_commentContext)_localctx).NON_CONFORMATION_CLASS_NAME.getText():null);
				}
				break;

			case 5:
				{
				setState(235); ((Timeblock_commentContext)_localctx).BREED_NAME = match(BREED_NAME);
				((Timeblock_commentContext)_localctx).str = (((Timeblock_commentContext)_localctx).BREED_NAME!=null?((Timeblock_commentContext)_localctx).BREED_NAME.getText():null);
				}
				break;

			case 6:
				{
				setState(237); ((Timeblock_commentContext)_localctx).COMMENT = match(COMMENT);
				((Timeblock_commentContext)_localctx).str = (((Timeblock_commentContext)_localctx).COMMENT!=null?((Timeblock_commentContext)_localctx).COMMENT.getText():null);
				}
				break;

			case 7:
				{
				setState(239); ((Timeblock_commentContext)_localctx).PARENTHETICAL = match(PARENTHETICAL);
				((Timeblock_commentContext)_localctx).str = (((Timeblock_commentContext)_localctx).PARENTHETICAL!=null?((Timeblock_commentContext)_localctx).PARENTHETICAL.getText():null);
				}
				break;

			case 8:
				{
				setState(241); ((Timeblock_commentContext)_localctx).INT = match(INT);
				((Timeblock_commentContext)_localctx).str = (((Timeblock_commentContext)_localctx).INT!=null?((Timeblock_commentContext)_localctx).INT.getText():null);
				}
				break;

			case 9:
				{
				setState(243); ((Timeblock_commentContext)_localctx).ELLIPSIS = match(ELLIPSIS);
				((Timeblock_commentContext)_localctx).str = (((Timeblock_commentContext)_localctx).ELLIPSIS!=null?((Timeblock_commentContext)_localctx).ELLIPSIS.getText():null);
				}
				break;

			case 10:
				{
				setState(245); ((Timeblock_commentContext)_localctx).DATE = match(DATE);
				((Timeblock_commentContext)_localctx).str = (((Timeblock_commentContext)_localctx).DATE!=null?((Timeblock_commentContext)_localctx).DATE.getText():null);
				}
				break;

			case 11:
				{
				setState(247); ((Timeblock_commentContext)_localctx).PHONE_NUMBER = match(PHONE_NUMBER);
				((Timeblock_commentContext)_localctx).str = (((Timeblock_commentContext)_localctx).PHONE_NUMBER!=null?((Timeblock_commentContext)_localctx).PHONE_NUMBER.getText():null);
				}
				break;

			case 12:
				{
				setState(249); match(SPECIAL_SUFFIX);
				}
				break;

			case 13:
				{
				setState(250); match(NON_CONF_SECOND_LINE_COMMENT);
				}
				break;

			case 14:
				{
				setState(251); match(GROUP_RING);
				}
				break;

			case 15:
				{
				setState(252); match(BREED_CLASSIFIER);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ring_commentContext extends ParserRuleContext {
		public String str;
		public Token STANDALONE_COMMENT;
		public Timeblock_commentContext tComment;
		public Token GROUP;
		public TerminalNode STANDALONE_COMMENT() { return getToken(OnofrioParser.STANDALONE_COMMENT, 0); }
		public Timeblock_commentContext timeblock_comment() {
			return getRuleContext(Timeblock_commentContext.class,0);
		}
		public TerminalNode RING() { return getToken(OnofrioParser.RING, 0); }
		public TerminalNode GROUP() { return getToken(OnofrioParser.GROUP, 0); }
		public Ring_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ring_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterRing_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitRing_comment(this);
		}
	}

	public final Ring_commentContext ring_comment() throws RecognitionException {
		Ring_commentContext _localctx = new Ring_commentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ring_comment);
		int _la;
		try {
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); ((Ring_commentContext)_localctx).STANDALONE_COMMENT = match(STANDALONE_COMMENT);
				((Ring_commentContext)_localctx).str = (((Ring_commentContext)_localctx).STANDALONE_COMMENT!=null?((Ring_commentContext)_localctx).STANDALONE_COMMENT.getText():null);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(257); ((Ring_commentContext)_localctx).tComment = timeblock_comment();
				((Ring_commentContext)_localctx).str = ((Ring_commentContext)_localctx).tComment.str;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(260); ((Ring_commentContext)_localctx).GROUP = match(GROUP);
				((Ring_commentContext)_localctx).str = (((Ring_commentContext)_localctx).GROUP!=null?((Ring_commentContext)_localctx).GROUP.getText():null);
				setState(262);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==RING) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeblockContext extends ParserRuleContext {
		public JsonObject json;
		public String timeblockComment = ""; String time = "";;
		public Token INT;
		public Token TIME;
		public Inner_timeblockContext rings;
		public Timeblock_commentContext mComment;
		public TerminalNode INT() { return getToken(OnofrioParser.INT, 0); }
		public TerminalNode TIME() { return getToken(OnofrioParser.TIME, 0); }
		public Inner_timeblockContext inner_timeblock(int i) {
			return getRuleContext(Inner_timeblockContext.class,i);
		}
		public Timeblock_commentContext timeblock_comment(int i) {
			return getRuleContext(Timeblock_commentContext.class,i);
		}
		public List<Inner_timeblockContext> inner_timeblock() {
			return getRuleContexts(Inner_timeblockContext.class);
		}
		public TerminalNode FOLLOWING_TIME() { return getToken(OnofrioParser.FOLLOWING_TIME, 0); }
		public List<Timeblock_commentContext> timeblock_comment() {
			return getRuleContexts(Timeblock_commentContext.class);
		}
		public TimeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterTimeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitTimeblock(this);
		}
	}

	public final TimeblockContext timeblock() throws RecognitionException {
		TimeblockContext _localctx = new TimeblockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_timeblock);
		((TimeblockContext)_localctx).json =  new JsonObject(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			switch (_input.LA(1)) {
			case INT:
				{
				{
				setState(265); ((TimeblockContext)_localctx).INT = match(INT);

								currentBlockTime=(((TimeblockContext)_localctx).INT!=null?((TimeblockContext)_localctx).INT.getText():null);
								_localctx.json.addProperty("BlockStart", currentBlockTime);
							
				setState(267); match(FOLLOWING_TIME);
				}
				}
				break;
			case TIME:
				{
				setState(268); ((TimeblockContext)_localctx).TIME = match(TIME);

					     		currentBlockTime=(((TimeblockContext)_localctx).TIME!=null?((TimeblockContext)_localctx).TIME.getText():null);
					     		_localctx.json.addProperty("BlockStart", currentBlockTime);
					     	
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(272); ((TimeblockContext)_localctx).rings = inner_timeblock();

						   		if(_localctx.json.has("Rings")){
						   			JsonArray already=_localctx.json.getAsJsonArray("Rings");
						   			already.addAll(((TimeblockContext)_localctx).rings.array);
						   			_localctx.json.add("Rings",already);
						   		}
						   		else{
						   			_localctx.json.add("Rings", ((TimeblockContext)_localctx).rings.array);
						   		}
						   		
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(274);
							if (!(!areJudgeNames(_input.LT(1).getText(), _input.LT(2).getText()))) throw new FailedPredicateException(this, "!areJudgeNames(_input.LT(1).getText(), _input.LT(2).getText())");
							setState(275); ((TimeblockContext)_localctx).mComment = timeblock_comment();

								   			_localctx.timeblockComment+=((TimeblockContext)_localctx).mComment.str;
								   			
							}
							} 
						}
						setState(282);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					}

						   		if(!_localctx.timeblockComment.equals("")){
						   			_localctx.json.add("timeblock_comment",new JsonPrimitive(_localctx.timeblockComment));
						   			mLastComment=_localctx.timeblockComment;
						   		}
						   		
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}

				   	if(!mRelational&&_localctx.json.has("Rings")){
				   		mShowRings.addAll(_localctx.json.getAsJsonArray("Rings"));
				   	}	
				   	
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_group_ringContext extends ParserRuleContext {
		public JsonObject json;
		public Token INT;
		public Ring_with_breedContext mRingWithBreed;
		public Ring_without_breedContext mRingWithoutBreed;
		public Ring_with_breedContext ring_with_breed() {
			return getRuleContext(Ring_with_breedContext.class,0);
		}
		public TerminalNode INT() { return getToken(OnofrioParser.INT, 0); }
		public Ring_without_breedContext ring_without_breed() {
			return getRuleContext(Ring_without_breedContext.class,0);
		}
		public Non_group_ringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_group_ring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterNon_group_ring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitNon_group_ring(this);
		}
	}

	public final Non_group_ringContext non_group_ring() throws RecognitionException {
		Non_group_ringContext _localctx = new Non_group_ringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_non_group_ring);
		((Non_group_ringContext)_localctx).json =  new JsonObject();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); ((Non_group_ringContext)_localctx).INT = match(INT);
			mCurrentCount = parseIntSafely((((Non_group_ringContext)_localctx).INT!=null?((Non_group_ringContext)_localctx).INT.getText():null),0); _localctx.json.addProperty("Count", mCurrentCount);
			setState(300);
			switch (_input.LA(1)) {
			case BREED_CLASSIFIER:
			case BREED_NAME:
				{
				{
				setState(294); ((Non_group_ringContext)_localctx).mRingWithBreed = ring_with_breed();
				mergeJson(_localctx.json,((Non_group_ringContext)_localctx).mRingWithBreed.json);
				}
				}
				break;
			case JUNIOR_CLASS:
			case SPECIAL_SUFFIX:
			case NON_CONFORMATION_CLASS_NAME:
			case NON_CONF_SECOND_LINE_COMMENT:
			case RALLY_CLASS:
			case BREED_COUNT:
				{
				{
				setState(297); ((Non_group_ringContext)_localctx).mRingWithoutBreed = ring_without_breed();
				mergeJson(_localctx.json,((Non_group_ringContext)_localctx).mRingWithoutBreed.json);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inner_timeblockContext extends ParserRuleContext {
		public JsonArray array;
		public JsonObject toAdd = null;int countAhead = 0;String innerComment="";;
		public Ring_titleContext mTitle;
		public Judge_nameContext mName;
		public Non_group_ringContext nonGroupRing;
		public Rally_walkthroughContext mRallyWalkthrough;
		public Ring_commentContext rComment;
		public Ring_titleContext ring_title(int i) {
			return getRuleContext(Ring_titleContext.class,i);
		}
		public Judge_nameContext judge_name(int i) {
			return getRuleContext(Judge_nameContext.class,i);
		}
		public Rally_walkthroughContext rally_walkthrough(int i) {
			return getRuleContext(Rally_walkthroughContext.class,i);
		}
		public List<Non_group_ringContext> non_group_ring() {
			return getRuleContexts(Non_group_ringContext.class);
		}
		public Ring_commentContext ring_comment(int i) {
			return getRuleContext(Ring_commentContext.class,i);
		}
		public List<Rally_walkthroughContext> rally_walkthrough() {
			return getRuleContexts(Rally_walkthroughContext.class);
		}
		public List<Ring_commentContext> ring_comment() {
			return getRuleContexts(Ring_commentContext.class);
		}
		public List<Ring_titleContext> ring_title() {
			return getRuleContexts(Ring_titleContext.class);
		}
		public Non_group_ringContext non_group_ring(int i) {
			return getRuleContext(Non_group_ringContext.class,i);
		}
		public List<Judge_nameContext> judge_name() {
			return getRuleContexts(Judge_nameContext.class);
		}
		public Inner_timeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_timeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterInner_timeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitInner_timeblock(this);
		}
	}

	public final Inner_timeblockContext inner_timeblock() throws RecognitionException {
		Inner_timeblockContext _localctx = new Inner_timeblockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inner_timeblock);
		((Inner_timeblockContext)_localctx).array =  new JsonArray();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(324);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(318);
						switch (_input.LA(1)) {
						case RING:
						case GROUP:
						case JUDGE_NAME:
						case INT:
						case PARENTHETICAL_INT:
						case PARENTHETICAL:
						case COMMENT:
							{
							setState(310);
							_la = _input.LA(1);
							if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RING) | (1L << GROUP) | (1L << JUDGE_NAME) | (1L << PARENTHETICAL_INT) | (1L << PARENTHETICAL) | (1L << COMMENT))) != 0)) {
								{
								setState(305);
								_la = _input.LA(1);
								if (_la==RING || _la==GROUP) {
									{
									setState(302); ((Inner_timeblockContext)_localctx).mTitle = ring_title();
									if(!mRelational){mCurrentRingNumber=parseRingNumber(((Inner_timeblockContext)_localctx).mTitle.str);}
									}
								}

								{
								setState(307); ((Inner_timeblockContext)_localctx).mName = judge_name();
								mCurrentJudge = ((Inner_timeblockContext)_localctx).mName.json; judgeSet.add(((Inner_timeblockContext)_localctx).mName.json.get("Judge").getAsString());
								}
								}
							}

							setState(312); ((Inner_timeblockContext)_localctx).nonGroupRing = non_group_ring();

									((Inner_timeblockContext)_localctx).nonGroupRing.json.addProperty("BlockStart",currentBlockTime);
									((Inner_timeblockContext)_localctx).nonGroupRing.json.addProperty("Number",mCurrentRingNumber);
									addCurrentJudge(((Inner_timeblockContext)_localctx).nonGroupRing.json);
									((Inner_timeblockContext)_localctx).nonGroupRing.json.add("CountAhead",new JsonPrimitive(_localctx.countAhead));
									_localctx.countAhead+=mCurrentCount;//nonGroupRing.get("Count").getAsInt();
									if(!((Inner_timeblockContext)_localctx).nonGroupRing.json.has("Skip"))_localctx.array.add(((Inner_timeblockContext)_localctx).nonGroupRing.json);
									
							}
							break;
						case RALLY_CLASS:
							{
							{
							setState(315); ((Inner_timeblockContext)_localctx).mRallyWalkthrough = rally_walkthrough();

									((Inner_timeblockContext)_localctx).mRallyWalkthrough.json.addProperty("BlockStart",currentBlockTime);
									mCurrentCount = 0;
									((Inner_timeblockContext)_localctx).mRallyWalkthrough.json.addProperty("Count", mCurrentCount);
									((Inner_timeblockContext)_localctx).mRallyWalkthrough.json.addProperty("Number",mCurrentRingNumber);
									((Inner_timeblockContext)_localctx).mRallyWalkthrough.json.add("CountAhead",new JsonPrimitive(_localctx.countAhead));
									addCurrentJudge(((Inner_timeblockContext)_localctx).mRallyWalkthrough.json);
									if(!((Inner_timeblockContext)_localctx).mRallyWalkthrough.json.has("Skip"))_localctx.array.add(((Inner_timeblockContext)_localctx).mRallyWalkthrough.json);
							                
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;

					case 2:
						{
						setState(320);
						if (!(!areJudgeNames(_input.LT(1).getText(), _input.LT(2).getText()))) throw new FailedPredicateException(this, "!areJudgeNames(_input.LT(1).getText(), _input.LT(2).getText())");
						setState(321); ((Inner_timeblockContext)_localctx).rComment = ring_comment();
						_localctx.innerComment+=" "+(((Inner_timeblockContext)_localctx).rComment!=null?_input.getText(((Inner_timeblockContext)_localctx).rComment.start,((Inner_timeblockContext)_localctx).rComment.stop):null);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=-1 );

					  mLastComment=_localctx.innerComment;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rally_walkthroughContext extends ParserRuleContext {
		public JsonObject json;
		public Token RALLY_CLASS;
		public TerminalNode RALLY_CLASS() { return getToken(OnofrioParser.RALLY_CLASS, 0); }
		public Rally_walkthroughContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rally_walkthrough; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterRally_walkthrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitRally_walkthrough(this);
		}
	}

	public final Rally_walkthroughContext rally_walkthrough() throws RecognitionException {
		Rally_walkthroughContext _localctx = new Rally_walkthroughContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rally_walkthrough);
		((Rally_walkthroughContext)_localctx).json =  new JsonObject();_localctx.json.addProperty("RingType","Rally");mCurrentCount = 0;_localctx.json.addProperty("Count",mCurrentCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); ((Rally_walkthroughContext)_localctx).RALLY_CLASS = match(RALLY_CLASS);
			String title = (((Rally_walkthroughContext)_localctx).RALLY_CLASS!=null?((Rally_walkthroughContext)_localctx).RALLY_CLASS.getText():null); _localctx.json.addProperty("RallyName", title.replace(" Walkthrough", "")); _localctx.json.addProperty("IsWalkthrough",true); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ring_with_breedContext extends ParserRuleContext {
		public JsonObject json;
		public Breed_nameContext breedName;
		public Special_suffixContext suffix;
		public Obedience_with_breedContext obedience;
		public Token BREED_COUNT;
		public TerminalNode BREED_COUNT() { return getToken(OnofrioParser.BREED_COUNT, 0); }
		public Obedience_with_breedContext obedience_with_breed() {
			return getRuleContext(Obedience_with_breedContext.class,0);
		}
		public Special_suffixContext special_suffix() {
			return getRuleContext(Special_suffixContext.class,0);
		}
		public Breed_nameContext breed_name() {
			return getRuleContext(Breed_nameContext.class,0);
		}
		public Ring_with_breedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ring_with_breed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterRing_with_breed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitRing_with_breed(this);
		}
	}

	public final Ring_with_breedContext ring_with_breed() throws RecognitionException {
		Ring_with_breedContext _localctx = new Ring_with_breedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ring_with_breed);
		((Ring_with_breedContext)_localctx).json =  new JsonObject();_localctx.json.addProperty("RingType","Unassigned");
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); ((Ring_with_breedContext)_localctx).breedName = breed_name();

			            _localctx.json.addProperty("RingType", "Conformation");
			            mergeJson(_localctx.json,((Ring_with_breedContext)_localctx).breedName.json);
			            
			setState(345);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(335); ((Ring_with_breedContext)_localctx).suffix = special_suffix();
				mergeJson(_localctx.json,((Ring_with_breedContext)_localctx).suffix.json);
				}
				break;

			case 2:
				{
				{
				setState(338); ((Ring_with_breedContext)_localctx).obedience = obedience_with_breed();
				_localctx.json.addProperty("Skip",true);
				}
				}
				break;

			case 3:
				{
				{
				setState(343);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(341); ((Ring_with_breedContext)_localctx).BREED_COUNT = match(BREED_COUNT);
					int counted = addBreedCountToJson(_localctx.json, (((Ring_with_breedContext)_localctx).BREED_COUNT!=null?((Ring_with_breedContext)_localctx).BREED_COUNT.getText():null));
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
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Obedience_with_breedContext extends ParserRuleContext {
		public JsonObject json;
		public Token mEntry;
		public Token mNumber;
		public TerminalNode INT() { return getToken(OnofrioParser.INT, 0); }
		public TerminalNode HYPHEN() { return getToken(OnofrioParser.HYPHEN, 0); }
		public TerminalNode NON_CONFORMATION_SECOND_LINE() { return getToken(OnofrioParser.NON_CONFORMATION_SECOND_LINE, 0); }
		public Obedience_with_breedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obedience_with_breed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterObedience_with_breed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitObedience_with_breed(this);
		}
	}

	public final Obedience_with_breedContext obedience_with_breed() throws RecognitionException {
		Obedience_with_breedContext _localctx = new Obedience_with_breedContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_obedience_with_breed);
		((Obedience_with_breedContext)_localctx).json =  new JsonObject(); _localctx.json.addProperty("Type", "Obedience"); _localctx.json.addProperty("Class",mCurrentClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(HYPHEN);
			setState(352);
			switch (_input.LA(1)) {
			case NON_CONFORMATION_SECOND_LINE:
				{
				{
				setState(348); ((Obedience_with_breedContext)_localctx).mEntry = match(NON_CONFORMATION_SECOND_LINE);
				_localctx.json.addProperty("obedienceEntries",(((Obedience_with_breedContext)_localctx).mEntry!=null?((Obedience_with_breedContext)_localctx).mEntry.getText():null)); 
				}
				}
				break;
			case INT:
				{
				{
				setState(350); ((Obedience_with_breedContext)_localctx).mNumber = match(INT);
				_localctx.json.addProperty("obedienceEntries",parseIntSafely((((Obedience_with_breedContext)_localctx).mNumber!=null?((Obedience_with_breedContext)_localctx).mNumber.getText():null), 0)); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_suffixContext extends ParserRuleContext {
		public JsonObject json;
		public Token SPECIAL_SUFFIX;
		public TerminalNode SPECIAL_SUFFIX() { return getToken(OnofrioParser.SPECIAL_SUFFIX, 0); }
		public Special_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterSpecial_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitSpecial_suffix(this);
		}
	}

	public final Special_suffixContext special_suffix() throws RecognitionException {
		Special_suffixContext _localctx = new Special_suffixContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_special_suffix);
		((Special_suffixContext)_localctx).json =  new JsonObject();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); ((Special_suffixContext)_localctx).SPECIAL_SUFFIX = match(SPECIAL_SUFFIX);
			_localctx.json.addProperty("SpecialSuffix",(((Special_suffixContext)_localctx).SPECIAL_SUFFIX!=null?((Special_suffixContext)_localctx).SPECIAL_SUFFIX.getText():null));if(isSweepstakes((((Special_suffixContext)_localctx).SPECIAL_SUFFIX!=null?((Special_suffixContext)_localctx).SPECIAL_SUFFIX.getText():null)))_localctx.json.addProperty("IsSweepstakes",true);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Breed_nameContext extends ParserRuleContext {
		public JsonObject json;
		public String breedName="";;
		public Token BREED_NAME;
		public Token BREED_CLASSIFIER;
		public Token BREED_NAME_SUFFIX;
		public TerminalNode BREED_NAME() { return getToken(OnofrioParser.BREED_NAME, 0); }
		public TerminalNode BREED_CLASSIFIER() { return getToken(OnofrioParser.BREED_CLASSIFIER, 0); }
		public TerminalNode BREED_NAME_SUFFIX() { return getToken(OnofrioParser.BREED_NAME_SUFFIX, 0); }
		public Breed_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breed_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterBreed_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitBreed_name(this);
		}
	}

	public final Breed_nameContext breed_name() throws RecognitionException {
		Breed_nameContext _localctx = new Breed_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_breed_name);
		((Breed_nameContext)_localctx).json =  new JsonObject();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			switch (_input.LA(1)) {
			case BREED_NAME:
				{
				setState(357); ((Breed_nameContext)_localctx).BREED_NAME = match(BREED_NAME);

				            _localctx.breedName+=(((Breed_nameContext)_localctx).BREED_NAME!=null?((Breed_nameContext)_localctx).BREED_NAME.getText():null);
				            if(isSweepstakes((((Breed_nameContext)_localctx).BREED_NAME!=null?((Breed_nameContext)_localctx).BREED_NAME.getText():null))){
				                _localctx.breedName=mLastBreedName;
						_localctx.json.addProperty("IsSweepstakes",true);
				            }
				            else
				            {
				                mLastBreedName=_localctx.breedName;
				            }		
				            if(isVeteran(_localctx.breedName)){
				                _localctx.breedName=mLastBreedName;
				    		_localctx.json.addProperty("IsVeteran",true);
				            }
				            else{
				                mLastBreedName=_localctx.breedName;
				            }
				}
				break;
			case BREED_CLASSIFIER:
				{
				setState(359); ((Breed_nameContext)_localctx).BREED_CLASSIFIER = match(BREED_CLASSIFIER);

				                _localctx.breedName=mLastBreedName;
				                _localctx.json.addProperty("BreedAttribute",(((Breed_nameContext)_localctx).BREED_CLASSIFIER!=null?((Breed_nameContext)_localctx).BREED_CLASSIFIER.getText():null).trim());
						addToJsonFromAttribute(_localctx.json,(((Breed_nameContext)_localctx).BREED_CLASSIFIER!=null?((Breed_nameContext)_localctx).BREED_CLASSIFIER.getText():null));
				            
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(365);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(363); ((Breed_nameContext)_localctx).BREED_NAME_SUFFIX = match(BREED_NAME_SUFFIX);
				_localctx.json.addProperty("BreedSuffix", (((Breed_nameContext)_localctx).BREED_NAME_SUFFIX!=null?((Breed_nameContext)_localctx).BREED_NAME_SUFFIX.getText():null));
				}
				break;
			}
			_localctx.json.addProperty("BreedName", _localctx.breedName);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ring_without_breedContext extends ParserRuleContext {
		public JsonObject json;
		public Junior_ringContext mJuniorRing;
		public Empty_breed_ringContext mEmptyRing;
		public Rally_ringContext mRallyRing;
		public Non_conformation_ringContext mNonConformationRing;
		public Special_suffixContext mSpecial;
		public Empty_breed_ringContext empty_breed_ring() {
			return getRuleContext(Empty_breed_ringContext.class,0);
		}
		public Special_suffixContext special_suffix() {
			return getRuleContext(Special_suffixContext.class,0);
		}
		public Rally_ringContext rally_ring() {
			return getRuleContext(Rally_ringContext.class,0);
		}
		public Non_conformation_ringContext non_conformation_ring() {
			return getRuleContext(Non_conformation_ringContext.class,0);
		}
		public Junior_ringContext junior_ring() {
			return getRuleContext(Junior_ringContext.class,0);
		}
		public Ring_without_breedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ring_without_breed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterRing_without_breed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitRing_without_breed(this);
		}
	}

	public final Ring_without_breedContext ring_without_breed() throws RecognitionException {
		Ring_without_breedContext _localctx = new Ring_without_breedContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ring_without_breed);
		((Ring_without_breedContext)_localctx).json =  new JsonObject(); _localctx.json.addProperty("RingType","Unassigned");
		try {
			setState(384);
			switch (_input.LA(1)) {
			case JUNIOR_CLASS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(369); ((Ring_without_breedContext)_localctx).mJuniorRing = junior_ring();

				            mergeJson(_localctx.json,((Ring_without_breedContext)_localctx).mJuniorRing.json);
				            
				}
				}
				break;
			case BREED_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(372); ((Ring_without_breedContext)_localctx).mEmptyRing = empty_breed_ring();

				            mergeJson(_localctx.json,((Ring_without_breedContext)_localctx).mEmptyRing.json);
				            _localctx.json.addProperty("BreedName",mLastBreedName);
				            
				}
				}
				break;
			case NON_CONF_SECOND_LINE_COMMENT:
			case RALLY_CLASS:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(375); ((Ring_without_breedContext)_localctx).mRallyRing = rally_ring();

				            mergeJson(_localctx.json,((Ring_without_breedContext)_localctx).mRallyRing.json);
				            _localctx.json.addProperty("RingType","Rally");
				            if(!((Ring_without_breedContext)_localctx).mRallyRing.json.has("RallyName"))
				            {
				                _localctx.json.addProperty("Skip",true);
				            }
				            
				}
				}
				break;
			case NON_CONFORMATION_CLASS_NAME:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(378); ((Ring_without_breedContext)_localctx).mNonConformationRing = non_conformation_ring();

				            mergeJson(_localctx.json,((Ring_without_breedContext)_localctx).mNonConformationRing.json);
				            
				}
				}
				break;
			case SPECIAL_SUFFIX:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(381); ((Ring_without_breedContext)_localctx).mSpecial = special_suffix();

				            mergeJson(_localctx.json, ((Ring_without_breedContext)_localctx).mSpecial.json);
				            _localctx.json.addProperty("BreedName",mLastBreedName);
				            
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rally_ringContext extends ParserRuleContext {
		public JsonObject json;
		public String entries = "";;
		public Rally_commentContext rallyComment;
		public Rally_ring_nameContext name;
		public Rally_entry_lineContext line;
		public Rally_entry_lineContext rally_entry_line(int i) {
			return getRuleContext(Rally_entry_lineContext.class,i);
		}
		public Rally_ring_nameContext rally_ring_name() {
			return getRuleContext(Rally_ring_nameContext.class,0);
		}
		public Rally_commentContext rally_comment() {
			return getRuleContext(Rally_commentContext.class,0);
		}
		public List<Rally_entry_lineContext> rally_entry_line() {
			return getRuleContexts(Rally_entry_lineContext.class);
		}
		public TerminalNode NON_CONF_SECOND_LINE_COMMENT() { return getToken(OnofrioParser.NON_CONF_SECOND_LINE_COMMENT, 0); }
		public Rally_ringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rally_ring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterRally_ring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitRally_ring(this);
		}
	}

	public final Rally_ringContext rally_ring() throws RecognitionException {
		Rally_ringContext _localctx = new Rally_ringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rally_ring);
		((Rally_ringContext)_localctx).json =  new JsonObject();
		try {
			int _alt;
			setState(402);
			switch (_input.LA(1)) {
			case NON_CONF_SECOND_LINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(386); ((Rally_ringContext)_localctx).rallyComment = rally_comment();
				_localctx.json.addProperty("RallyComment", ((Rally_ringContext)_localctx).rallyComment.str);
				}
				}
				break;
			case RALLY_CLASS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(389); ((Rally_ringContext)_localctx).name = rally_ring_name();
				_localctx.json.addProperty("RallyName",((Rally_ringContext)_localctx).name.str);
				{
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(391); ((Rally_ringContext)_localctx).line = rally_entry_line();
						_localctx.entries+=((Rally_ringContext)_localctx).line.str+"|";
						}
						} 
					}
					setState(398);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				}
				setState(400);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(399); match(NON_CONF_SECOND_LINE_COMMENT);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Empty_breed_ringContext extends ParserRuleContext {
		public JsonObject json;
		public Token BREED_COUNT;
		public TerminalNode BREED_COUNT() { return getToken(OnofrioParser.BREED_COUNT, 0); }
		public Empty_breed_ringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_breed_ring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterEmpty_breed_ring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitEmpty_breed_ring(this);
		}
	}

	public final Empty_breed_ringContext empty_breed_ring() throws RecognitionException {
		Empty_breed_ringContext _localctx = new Empty_breed_ringContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_empty_breed_ring);
		((Empty_breed_ringContext)_localctx).json =  new JsonObject();
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404); ((Empty_breed_ringContext)_localctx).BREED_COUNT = match(BREED_COUNT);
			int counted = addBreedCountToJson(_localctx.json, (((Empty_breed_ringContext)_localctx).BREED_COUNT!=null?((Empty_breed_ringContext)_localctx).BREED_COUNT.getText():null));
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_conformation_breed_ringContext extends ParserRuleContext {
		public JsonObject json;
		public Token BREED_NAME;
		public TerminalNode INT() { return getToken(OnofrioParser.INT, 0); }
		public TerminalNode BREED_NAME() { return getToken(OnofrioParser.BREED_NAME, 0); }
		public TerminalNode COMMENT() { return getToken(OnofrioParser.COMMENT, 0); }
		public TerminalNode NON_CONFORMATION_SECOND_LINE() { return getToken(OnofrioParser.NON_CONFORMATION_SECOND_LINE, 0); }
		public Non_conformation_breed_ringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_conformation_breed_ring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterNon_conformation_breed_ring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitNon_conformation_breed_ring(this);
		}
	}

	public final Non_conformation_breed_ringContext non_conformation_breed_ring() throws RecognitionException {
		Non_conformation_breed_ringContext _localctx = new Non_conformation_breed_ringContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_non_conformation_breed_ring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); ((Non_conformation_breed_ringContext)_localctx).BREED_NAME = match(BREED_NAME);
			_localctx.json.addProperty("NonConformationBreed",(((Non_conformation_breed_ringContext)_localctx).BREED_NAME!=null?((Non_conformation_breed_ringContext)_localctx).BREED_NAME.getText():null));
			setState(409); match(COMMENT);
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==NON_CONFORMATION_SECOND_LINE || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Breed_ringContext extends ParserRuleContext {
		public JsonObject json;
		public String breedName = "";;
		public Token BREED_NAME;
		public Token BREED_NAME_SUFFIX;
		public Token BREED_COUNT;
		public TerminalNode BREED_COUNT() { return getToken(OnofrioParser.BREED_COUNT, 0); }
		public TerminalNode BREED_NAME() { return getToken(OnofrioParser.BREED_NAME, 0); }
		public TerminalNode BREED_NAME_SUFFIX() { return getToken(OnofrioParser.BREED_NAME_SUFFIX, 0); }
		public Breed_ringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breed_ring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterBreed_ring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitBreed_ring(this);
		}
	}

	public final Breed_ringContext breed_ring() throws RecognitionException {
		Breed_ringContext _localctx = new Breed_ringContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_breed_ring);
		((Breed_ringContext)_localctx).json =  new JsonObject();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); ((Breed_ringContext)_localctx).BREED_NAME = match(BREED_NAME);

			    		_localctx.breedName+=(((Breed_ringContext)_localctx).BREED_NAME!=null?((Breed_ringContext)_localctx).BREED_NAME.getText():null);
			    		if(isVeteran(_localctx.breedName)){
			    			_localctx.breedName=mLastBreedName;
			    			_localctx.json.addProperty("IsVeteran",true);
			    		}
			    		else{
			    			mLastBreedName=_localctx.breedName;
			    		}
			setState(416);
			_la = _input.LA(1);
			if (_la==BREED_NAME_SUFFIX) {
				{
				setState(414); ((Breed_ringContext)_localctx).BREED_NAME_SUFFIX = match(BREED_NAME_SUFFIX);
				_localctx.breedName += " " + (((Breed_ringContext)_localctx).BREED_NAME_SUFFIX!=null?((Breed_ringContext)_localctx).BREED_NAME_SUFFIX.getText():null);
				}
			}

			_localctx.json.addProperty("BreedName", _localctx.breedName);
			setState(421);
			_la = _input.LA(1);
			if (_la==BREED_COUNT) {
				{
				setState(419); ((Breed_ringContext)_localctx).BREED_COUNT = match(BREED_COUNT);
				int counted = addBreedCountToJson(_localctx.json, (((Breed_ringContext)_localctx).BREED_COUNT!=null?((Breed_ringContext)_localctx).BREED_COUNT.getText():null));
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_ringContext extends ParserRuleContext {
		public JsonObject json;
		public String breedName= ""; String suffix="";;
		public Token BREED_NAME;
		public Token SPECIAL_SUFFIX;
		public TerminalNode SPECIAL_SUFFIX(int i) {
			return getToken(OnofrioParser.SPECIAL_SUFFIX, i);
		}
		public TerminalNode BREED_NAME() { return getToken(OnofrioParser.BREED_NAME, 0); }
		public List<TerminalNode> SPECIAL_SUFFIX() { return getTokens(OnofrioParser.SPECIAL_SUFFIX); }
		public Special_ringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_ring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterSpecial_ring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitSpecial_ring(this);
		}
	}

	public final Special_ringContext special_ring() throws RecognitionException {
		Special_ringContext _localctx = new Special_ringContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_special_ring);
		((Special_ringContext)_localctx).json =  new JsonObject();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if (_la==BREED_NAME) {
				{
				setState(423); ((Special_ringContext)_localctx).BREED_NAME = match(BREED_NAME);
				_localctx.breedName+=(((Special_ringContext)_localctx).BREED_NAME!=null?((Special_ringContext)_localctx).BREED_NAME.getText():null);
				}
			}

			setState(429); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(427); ((Special_ringContext)_localctx).SPECIAL_SUFFIX = match(SPECIAL_SUFFIX);
				_localctx.suffix+= " " + (((Special_ringContext)_localctx).SPECIAL_SUFFIX!=null?((Special_ringContext)_localctx).SPECIAL_SUFFIX.getText():null);
				}
				}
				setState(431); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SPECIAL_SUFFIX );

			                //breedName+= (((Special_ringContext)_localctx).SPECIAL_SUFFIX!=null?((Special_ringContext)_localctx).SPECIAL_SUFFIX.getText():null);
			                if(isVeteran(_localctx.suffix)){
			                        _localctx.json.addProperty("IsVeteran",true);
			                }
			                _localctx.json.addProperty("IsSweepstakes",true);
			                mLastBreedName = _localctx.breedName;
			                _localctx.json.addProperty("BreedName", _localctx.breedName);
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_ringContext extends ParserRuleContext {
		public String str;
		public Token GROUP_NAME;
		public Token GROUP;
		public Token GROUP_RING;
		public Token JUDGE_NAME;
		public Token COMMENT;
		public Token PARENTHETICAL;
		public TerminalNode PARENTHETICAL(int i) {
			return getToken(OnofrioParser.PARENTHETICAL, i);
		}
		public TerminalNode JUDGE_NAME(int i) {
			return getToken(OnofrioParser.JUDGE_NAME, i);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(OnofrioParser.COMMENT, i);
		}
		public List<TerminalNode> JUDGE_NAME() { return getTokens(OnofrioParser.JUDGE_NAME); }
		public TerminalNode GROUP_NAME() { return getToken(OnofrioParser.GROUP_NAME, 0); }
		public TerminalNode HYPHEN() { return getToken(OnofrioParser.HYPHEN, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(OnofrioParser.COMMENT); }
		public List<TerminalNode> PARENTHETICAL() { return getTokens(OnofrioParser.PARENTHETICAL); }
		public TerminalNode GROUP_RING() { return getToken(OnofrioParser.GROUP_RING, 0); }
		public TerminalNode GROUP() { return getToken(OnofrioParser.GROUP, 0); }
		public Group_ringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_ring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterGroup_ring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitGroup_ring(this);
		}
	}

	public final Group_ringContext group_ring() throws RecognitionException {
		Group_ringContext _localctx = new Group_ringContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_group_ring);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			switch (_input.LA(1)) {
			case GROUP_NAME:
				{
				{
				setState(435); ((Group_ringContext)_localctx).GROUP_NAME = match(GROUP_NAME);
				((Group_ringContext)_localctx).str = (((Group_ringContext)_localctx).GROUP_NAME!=null?((Group_ringContext)_localctx).GROUP_NAME.getText():null);
				setState(437); ((Group_ringContext)_localctx).GROUP = match(GROUP);
				_localctx.str+=" " + (((Group_ringContext)_localctx).GROUP!=null?((Group_ringContext)_localctx).GROUP.getText():null);
				}
				}
				break;
			case GROUP_RING:
				{
				setState(439); ((Group_ringContext)_localctx).GROUP_RING = match(GROUP_RING);
				((Group_ringContext)_localctx).str = (((Group_ringContext)_localctx).GROUP_RING!=null?((Group_ringContext)_localctx).GROUP_RING.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(443); match(HYPHEN);
			_localctx.str+=" -";
			setState(451); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(451);
					switch (_input.LA(1)) {
					case JUDGE_NAME:
						{
						setState(445); ((Group_ringContext)_localctx).JUDGE_NAME = match(JUDGE_NAME);
						_localctx.str+=" " + (((Group_ringContext)_localctx).JUDGE_NAME!=null?((Group_ringContext)_localctx).JUDGE_NAME.getText():null);
						}
						break;
					case COMMENT:
						{
						setState(447); ((Group_ringContext)_localctx).COMMENT = match(COMMENT);
						_localctx.str+=" " + (((Group_ringContext)_localctx).COMMENT!=null?((Group_ringContext)_localctx).COMMENT.getText():null);
						}
						break;
					case PARENTHETICAL:
						{
						setState(449); ((Group_ringContext)_localctx).PARENTHETICAL = match(PARENTHETICAL);
						_localctx.str+= " " + (((Group_ringContext)_localctx).PARENTHETICAL!=null?((Group_ringContext)_localctx).PARENTHETICAL.getText():null);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(453); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_blockContext extends ParserRuleContext {
		public JsonObject json;
		public JsonArray rings = new JsonArray();;
		public Token TIME;
		public Group_ringContext mRing;
		public Group_ringContext group_ring(int i) {
			return getRuleContext(Group_ringContext.class,i);
		}
		public TerminalNode TIME() { return getToken(OnofrioParser.TIME, 0); }
		public List<Group_ringContext> group_ring() {
			return getRuleContexts(Group_ringContext.class);
		}
		public TerminalNode GROUP_BLOCK_TYPE() { return getToken(OnofrioParser.GROUP_BLOCK_TYPE, 0); }
		public TerminalNode GROUP_ENDING_ANNOUNCEMENT() { return getToken(OnofrioParser.GROUP_ENDING_ANNOUNCEMENT, 0); }
		public Group_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterGroup_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitGroup_block(this);
		}
	}

	public final Group_blockContext group_block() throws RecognitionException {
		Group_blockContext _localctx = new Group_blockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_group_block);
		((Group_blockContext)_localctx).json =  new JsonObject(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455); ((Group_blockContext)_localctx).TIME = match(TIME);
			currentBlockTime=(((Group_blockContext)_localctx).TIME!=null?((Group_blockContext)_localctx).TIME.getText():null);_localctx.json.addProperty("BlockStart", currentBlockTime);
			setState(458);
			_la = _input.LA(1);
			if (_la==GROUP_BLOCK_TYPE) {
				{
				setState(457); match(GROUP_BLOCK_TYPE);
				}
			}

			setState(463); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(460); ((Group_blockContext)_localctx).mRing = group_ring();

					                if(!mRelational){
					                    ((Group_blockContext)_localctx).json =  new JsonObject();
					                    _localctx.json.addProperty("RingType","Group");
					                    String[] arr = parseGroupRing(((Group_blockContext)_localctx).mRing.str);
					                    _localctx.json.addProperty("Group", arr[0]);
					                    _localctx.json.addProperty("Judge",arr[1]);
					                    _localctx.json.addProperty("BlockStart",currentBlockTime);
					                    mShowRings.add(_localctx.json);
					                }
					                else {
					                    _localctx.rings.add(new JsonPrimitive(((Group_blockContext)_localctx).mRing.str));
					                }
					                
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(465); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=-1 );

			            if(mRelational){
			                _localctx.json.add("Rings", _localctx.rings);
			            }
			        
			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(468); match(GROUP_ENDING_ANNOUNCEMENT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_conformation_ringContext extends ParserRuleContext {
		public JsonObject json;
		public Token NON_CONFORMATION_CLASS_NAME;
		public Token NON_CONFORMATION_SECOND_LINE;
		public TerminalNode NON_CONF_SECOND_LINE_COMMENT(int i) {
			return getToken(OnofrioParser.NON_CONF_SECOND_LINE_COMMENT, i);
		}
		public TerminalNode NON_CONFORMATION_CLASS_NAME() { return getToken(OnofrioParser.NON_CONFORMATION_CLASS_NAME, 0); }
		public List<TerminalNode> NON_CONF_SECOND_LINE_COMMENT() { return getTokens(OnofrioParser.NON_CONF_SECOND_LINE_COMMENT); }
		public TerminalNode NON_CONFORMATION_SECOND_LINE() { return getToken(OnofrioParser.NON_CONFORMATION_SECOND_LINE, 0); }
		public Non_conformation_ringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_conformation_ring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterNon_conformation_ring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitNon_conformation_ring(this);
		}
	}

	public final Non_conformation_ringContext non_conformation_ring() throws RecognitionException {
		Non_conformation_ringContext _localctx = new Non_conformation_ringContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_non_conformation_ring);
		((Non_conformation_ringContext)_localctx).json =  new JsonObject(); _localctx.json.addProperty("RingType", "Non-conformation"); JsonArray rings = new JsonArray();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471); ((Non_conformation_ringContext)_localctx).NON_CONFORMATION_CLASS_NAME = match(NON_CONFORMATION_CLASS_NAME);

							mCurrentClass=(((Non_conformation_ringContext)_localctx).NON_CONFORMATION_CLASS_NAME!=null?((Non_conformation_ringContext)_localctx).NON_CONFORMATION_CLASS_NAME.getText():null);
							_localctx.json.addProperty("Class",mCurrentClass);
						
			setState(475);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(473); ((Non_conformation_ringContext)_localctx).NON_CONFORMATION_SECOND_LINE = match(NON_CONFORMATION_SECOND_LINE);

									_localctx.json.addProperty("Entrants",(((Non_conformation_ringContext)_localctx).NON_CONFORMATION_SECOND_LINE!=null?((Non_conformation_ringContext)_localctx).NON_CONFORMATION_SECOND_LINE.getText():null));
								
				}
				break;
			}
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(477); match(NON_CONF_SECOND_LINE_COMMENT);
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rally_ring_blockContext extends ParserRuleContext {
		public JsonObject json;
		public String entries = "";;
		public Rally_commentContext rallyComment;
		public Rally_ring_nameContext name;
		public Rally_entry_lineContext line;
		public Rally_entry_lineContext rally_entry_line(int i) {
			return getRuleContext(Rally_entry_lineContext.class,i);
		}
		public Rally_ring_nameContext rally_ring_name() {
			return getRuleContext(Rally_ring_nameContext.class,0);
		}
		public Rally_commentContext rally_comment() {
			return getRuleContext(Rally_commentContext.class,0);
		}
		public List<Rally_entry_lineContext> rally_entry_line() {
			return getRuleContexts(Rally_entry_lineContext.class);
		}
		public Rally_ring_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rally_ring_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterRally_ring_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitRally_ring_block(this);
		}
	}

	public final Rally_ring_blockContext rally_ring_block() throws RecognitionException {
		Rally_ring_blockContext _localctx = new Rally_ring_blockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_rally_ring_block);
		 
		        ((Rally_ring_blockContext)_localctx).json =  new JsonObject();
		        _localctx.json.addProperty("RingType","Rally"); 
		        _localctx.json.addProperty("BlockStart",currentBlockTime);
		        if(!mRelational){
		            addCurrentJudge(_localctx.json);
		            _localctx.json.addProperty("Number",mCurrentRingNumber);
		        }
		        
		int _la;
		try {
			setState(496);
			switch (_input.LA(1)) {
			case NON_CONF_SECOND_LINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(483); ((Rally_ring_blockContext)_localctx).rallyComment = rally_comment();
				_localctx.json.addProperty("comment", ((Rally_ring_blockContext)_localctx).rallyComment.str);
				}
				}
				break;
			case RALLY_CLASS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(486); ((Rally_ring_blockContext)_localctx).name = rally_ring_name();
				_localctx.json.addProperty("RallyName",((Rally_ring_blockContext)_localctx).name.str);
				{
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RALLY_ENTRY_TITLE) | (1L << RALLY_ENTRY) | (1L << INT))) != 0)) {
					{
					{
					setState(488); ((Rally_ring_blockContext)_localctx).line = rally_entry_line();
					_localctx.entries+=((Rally_ring_blockContext)_localctx).line.str+"|";
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rally_ring_nameContext extends ParserRuleContext {
		public String str;
		public Token RALLY_CLASS;
		public TerminalNode RALLY_CLASS() { return getToken(OnofrioParser.RALLY_CLASS, 0); }
		public Rally_ring_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rally_ring_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterRally_ring_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitRally_ring_name(this);
		}
	}

	public final Rally_ring_nameContext rally_ring_name() throws RecognitionException {
		Rally_ring_nameContext _localctx = new Rally_ring_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rally_ring_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498); ((Rally_ring_nameContext)_localctx).RALLY_CLASS = match(RALLY_CLASS);
			((Rally_ring_nameContext)_localctx).str = (((Rally_ring_nameContext)_localctx).RALLY_CLASS!=null?((Rally_ring_nameContext)_localctx).RALLY_CLASS.getText():null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rally_entry_lineContext extends ParserRuleContext {
		public String str;
		public Token intOne;
		public Token RALLY_ENTRY_TITLE;
		public Token count;
		public Token breed;
		public Token HYPHEN;
		public Token RALLY_ENTRY;
		public List<TerminalNode> INT() { return getTokens(OnofrioParser.INT); }
		public TerminalNode BREED_NAME() { return getToken(OnofrioParser.BREED_NAME, 0); }
		public TerminalNode RALLY_ENTRY_TITLE() { return getToken(OnofrioParser.RALLY_ENTRY_TITLE, 0); }
		public TerminalNode RALLY_ENTRY() { return getToken(OnofrioParser.RALLY_ENTRY, 0); }
		public TerminalNode HYPHEN() { return getToken(OnofrioParser.HYPHEN, 0); }
		public TerminalNode INT(int i) {
			return getToken(OnofrioParser.INT, i);
		}
		public Rally_entry_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rally_entry_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterRally_entry_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitRally_entry_line(this);
		}
	}

	public final Rally_entry_lineContext rally_entry_line() throws RecognitionException {
		Rally_entry_lineContext _localctx = new Rally_entry_lineContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_rally_entry_line);
		((Rally_entry_lineContext)_localctx).str = "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(503);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(501); ((Rally_entry_lineContext)_localctx).intOne = match(INT);
				_localctx.str+=(((Rally_entry_lineContext)_localctx).intOne!=null?((Rally_entry_lineContext)_localctx).intOne.getText():null);
				}
				break;
			}
			setState(507);
			_la = _input.LA(1);
			if (_la==RALLY_ENTRY_TITLE) {
				{
				setState(505); ((Rally_entry_lineContext)_localctx).RALLY_ENTRY_TITLE = match(RALLY_ENTRY_TITLE);
				_localctx.str+=(((Rally_entry_lineContext)_localctx).RALLY_ENTRY_TITLE!=null?((Rally_entry_lineContext)_localctx).RALLY_ENTRY_TITLE.getText():null);
				}
			}

			setState(515);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(509); ((Rally_entry_lineContext)_localctx).count = match(INT);
				_localctx.str+=" "+(((Rally_entry_lineContext)_localctx).count!=null?((Rally_entry_lineContext)_localctx).count.getText():null);
				setState(511); ((Rally_entry_lineContext)_localctx).breed = match(BREED_NAME);
				_localctx.str+=" " + (((Rally_entry_lineContext)_localctx).breed!=null?((Rally_entry_lineContext)_localctx).breed.getText():null);
				setState(513); ((Rally_entry_lineContext)_localctx).HYPHEN = match(HYPHEN);
				_localctx.str+=(((Rally_entry_lineContext)_localctx).HYPHEN!=null?((Rally_entry_lineContext)_localctx).HYPHEN.getText():null); 
				}
			}

			setState(517); ((Rally_entry_lineContext)_localctx).RALLY_ENTRY = match(RALLY_ENTRY);
			_localctx.str+=" "+(((Rally_entry_lineContext)_localctx).RALLY_ENTRY!=null?((Rally_entry_lineContext)_localctx).RALLY_ENTRY.getText():null);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rally_commentContext extends ParserRuleContext {
		public String str;
		public Token NON_CONF_SECOND_LINE_COMMENT;
		public TerminalNode NON_CONF_SECOND_LINE_COMMENT(int i) {
			return getToken(OnofrioParser.NON_CONF_SECOND_LINE_COMMENT, i);
		}
		public List<TerminalNode> NON_CONF_SECOND_LINE_COMMENT() { return getTokens(OnofrioParser.NON_CONF_SECOND_LINE_COMMENT); }
		public Rally_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rally_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterRally_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitRally_comment(this);
		}
	}

	public final Rally_commentContext rally_comment() throws RecognitionException {
		Rally_commentContext _localctx = new Rally_commentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_rally_comment);
		((Rally_commentContext)_localctx).str = "";
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(520); ((Rally_commentContext)_localctx).NON_CONF_SECOND_LINE_COMMENT = match(NON_CONF_SECOND_LINE_COMMENT);
					_localctx.str+=" "+(((Rally_commentContext)_localctx).NON_CONF_SECOND_LINE_COMMENT!=null?((Rally_commentContext)_localctx).NON_CONF_SECOND_LINE_COMMENT.getText():null);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(524); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Junior_ringContext extends ParserRuleContext {
		public JsonObject json;
		public Token JUNIOR_CLASS;
		public TerminalNode JUNIOR_CLASS() { return getToken(OnofrioParser.JUNIOR_CLASS, 0); }
		public Junior_ringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_junior_ring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).enterJunior_ring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnofrioParserListener ) ((OnofrioParserListener)listener).exitJunior_ring(this);
		}
	}

	public final Junior_ringContext junior_ring() throws RecognitionException {
		Junior_ringContext _localctx = new Junior_ringContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_junior_ring);
		((Junior_ringContext)_localctx).json =  new JsonObject();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526); ((Junior_ringContext)_localctx).JUNIOR_CLASS = match(JUNIOR_CLASS);

			            _localctx.json.addProperty("RingType","Junior");
			            _localctx.json.addProperty("ClassName", (((Junior_ringContext)_localctx).JUNIOR_CLASS!=null?((Junior_ringContext)_localctx).JUNIOR_CLASS.getText():null));
			            if(isSpecialtyRing){
			                if(mSpecialtyBreed!=null){
			                    _localctx.json.addProperty("BreedName",latestBreed);
			                }
			                else if(mSpecialtyGroup!=null){
			                    _localctx.json.addProperty("GroupName", mSpecialtyGroup);
			                }
			            }
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: return non_header_comment_sempred((Non_header_commentContext)_localctx, predIndex);

		case 11: return non_ring_title_comment_sempred((Non_ring_title_commentContext)_localctx, predIndex);

		case 14: return timeblock_sempred((TimeblockContext)_localctx, predIndex);

		case 16: return inner_timeblock_sempred((Inner_timeblockContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean non_ring_title_comment_sempred(Non_ring_title_commentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return !(parseIntSafely(_input.LT(2).getText(),-1)!=-1);
		}
		return true;
	}
	private boolean inner_timeblock_sempred(Inner_timeblockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return !areJudgeNames(_input.LT(1).getText(), _input.LT(2).getText());
		}
		return true;
	}
	private boolean timeblock_sempred(TimeblockContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return !areJudgeNames(_input.LT(1).getText(), _input.LT(2).getText());
		}
		return true;
	}
	private boolean non_header_comment_sempred(Non_header_commentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return !(_input.LT(2).getText().equals("-") && parseIntSafely(_input.LT(3).getText(),-1)!=-1 && _input.LT(4).getText().equals("RING"));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3$\u0214\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\6\2N\n\2\r\2\16\2O\3\2\3\2\3"+
		"\2\3\2\6\2V\n\2\r\2\16\2W\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3a\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\7\6z\n\6\f\6\16\6}\13\6\3\7\3\7\3\7\7\7\u0082\n\7\f\7"+
		"\16\7\u0085\13\7\3\7\3\7\3\7\6\7\u008a\n\7\r\7\16\7\u008b\3\7\3\7\5\7"+
		"\u0090\n\7\3\b\3\b\3\b\3\b\3\b\6\b\u0097\n\b\r\b\16\b\u0098\3\b\3\b\3"+
		"\t\3\t\6\t\u009f\n\t\r\t\16\t\u00a0\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00a9"+
		"\n\t\r\t\16\t\u00aa\5\t\u00ad\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c0\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e0\n\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0100\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010a"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0111\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u0119\n\20\f\20\16\20\u011c\13\20\3\20\3\20\7\20\u0120\n\20"+
		"\f\20\16\20\u0123\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u012f\n\21\3\22\3\22\3\22\5\22\u0134\n\22\3\22\3\22\3\22\5\22"+
		"\u0139\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0141\n\22\3\22\3\22\3"+
		"\22\3\22\6\22\u0147\n\22\r\22\16\22\u0148\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u015a\n\24\5\24\u015c"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0163\n\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u016c\n\27\3\27\3\27\5\27\u0170\n\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u0183\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u018d\n\31"+
		"\f\31\16\31\u0190\13\31\3\31\5\31\u0193\n\31\5\31\u0195\n\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u01a3\n\34\3\34"+
		"\3\34\3\34\5\34\u01a8\n\34\3\35\3\35\5\35\u01ac\n\35\3\35\3\35\6\35\u01b0"+
		"\n\35\r\35\16\35\u01b1\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01bc"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\6\36\u01c6\n\36\r\36\16"+
		"\36\u01c7\3\37\3\37\3\37\5\37\u01cd\n\37\3\37\3\37\3\37\6\37\u01d2\n\37"+
		"\r\37\16\37\u01d3\3\37\3\37\5\37\u01d8\n\37\3 \3 \3 \3 \5 \u01de\n \3"+
		" \7 \u01e1\n \f \16 \u01e4\13 \3!\3!\3!\3!\3!\3!\3!\3!\7!\u01ee\n!\f!"+
		"\16!\u01f1\13!\5!\u01f3\n!\3\"\3\"\3\"\3#\3#\5#\u01fa\n#\3#\3#\5#\u01fe"+
		"\n#\3#\3#\3#\3#\3#\3#\5#\u0206\n#\3#\3#\3#\3$\3$\6$\u020d\n$\r$\16$\u020e"+
		"\3%\3%\3%\3%\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFH\2\4\3\2\t\t\4\2\22\22\35\35\u024e\2M\3\2\2\2\4`\3\2\2"+
		"\2\6o\3\2\2\2\bq\3\2\2\2\nt\3\2\2\2\f\u008f\3\2\2\2\16\u0091\3\2\2\2\20"+
		"\u00ac\3\2\2\2\22\u00bf\3\2\2\2\24\u00df\3\2\2\2\26\u00e1\3\2\2\2\30\u00e4"+
		"\3\2\2\2\32\u00ff\3\2\2\2\34\u0109\3\2\2\2\36\u0110\3\2\2\2 \u0126\3\2"+
		"\2\2\"\u0146\3\2\2\2$\u014c\3\2\2\2&\u014f\3\2\2\2(\u015d\3\2\2\2*\u0164"+
		"\3\2\2\2,\u016b\3\2\2\2.\u0182\3\2\2\2\60\u0194\3\2\2\2\62\u0196\3\2\2"+
		"\2\64\u0199\3\2\2\2\66\u019e\3\2\2\28\u01ab\3\2\2\2:\u01bb\3\2\2\2<\u01c9"+
		"\3\2\2\2>\u01d9\3\2\2\2@\u01f2\3\2\2\2B\u01f4\3\2\2\2D\u01f9\3\2\2\2F"+
		"\u020c\3\2\2\2H\u0210\3\2\2\2JK\5\22\n\2KL\b\2\1\2LN\3\2\2\2MJ\3\2\2\2"+
		"NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QU\b\2\1\2RS\5\4\3\2ST\b\2\1\2"+
		"TV\3\2\2\2UR\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\b\2\1\2"+
		"Z[\7\2\2\3[\3\3\2\2\2\\]\5\n\6\2]^\b\3\1\2^a\3\2\2\2_a\5\b\5\2`\\\3\2"+
		"\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5\6\4\2cd\b\3\1\2de\3\2\2\2ef\5\f"+
		"\7\2fg\b\3\1\2g\5\3\2\2\2hi\7\t\2\2ij\b\4\1\2jk\7\35\2\2kp\b\4\1\2lm\7"+
		"\n\2\2mn\7\t\2\2np\b\4\1\2oh\3\2\2\2ol\3\2\2\2p\7\3\2\2\2qr\7\3\2\2rs"+
		"\b\5\1\2s\t\3\2\2\2tu\7!\2\2uv\b\6\1\2vw\7 \2\2w{\7\35\2\2xz\7\"\2\2y"+
		"x\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\13\3\2\2\2}{\3\2\2\2~\177\5<"+
		"\37\2\177\u0083\b\7\1\2\u0080\u0082\5\24\13\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0090\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\16\b\2\u0087\u0088\b\7\1\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\7\1\2\u008e"+
		"\u0090\3\2\2\2\u008f~\3\2\2\2\u008f\u0089\3\2\2\2\u0090\r\3\2\2\2\u0091"+
		"\u0092\5\20\t\2\u0092\u0096\b\b\1\2\u0093\u0094\5\36\20\2\u0094\u0095"+
		"\b\b\1\2\u0095\u0097\3\2\2\2\u0096\u0093\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\b"+
		"\1\2\u009b\17\3\2\2\2\u009c\u009d\7\26\2\2\u009d\u009f\b\t\1\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00ad\3\2\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a9\b\t\1\2\u00a4\u00a5\7\37"+
		"\2\2\u00a5\u00a9\b\t\1\2\u00a6\u00a7\7\36\2\2\u00a7\u00a9\b\t\1\2\u00a8"+
		"\u00a2\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u009e\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\t"+
		"\1\2\u00af\21\3\2\2\2\u00b0\u00b1\5\24\13\2\u00b1\u00b2\b\n\1\2\u00b2"+
		"\u00c0\3\2\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00c0\b\n\1\2\u00b5\u00b6\7"+
		"\30\2\2\u00b6\u00c0\b\n\1\2\u00b7\u00b8\7\6\2\2\u00b8\u00c0\b\n\1\2\u00b9"+
		"\u00ba\7\7\2\2\u00ba\u00c0\b\n\1\2\u00bb\u00bc\7\f\2\2\u00bc\u00c0\b\n"+
		"\1\2\u00bd\u00be\7\22\2\2\u00be\u00c0\b\n\1\2\u00bf\u00b0\3\2\2\2\u00bf"+
		"\u00b3\3\2\2\2\u00bf\u00b5\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b9\3\2"+
		"\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\23\3\2\2\2\u00c1\u00e0"+
		"\5\26\f\2\u00c2\u00e0\5\30\r\2\u00c3\u00e0\7\36\2\2\u00c4\u00e0\7\25\2"+
		"\2\u00c5\u00c6\7\r\2\2\u00c6\u00e0\b\13\1\2\u00c7\u00e0\7\n\2\2\u00c8"+
		"\u00c9\7\13\2\2\u00c9\u00e0\b\13\1\2\u00ca\u00e0\7 \2\2\u00cb\u00cc\7"+
		"\6\2\2\u00cc\u00e0\b\13\1\2\u00cd\u00ce\7\5\2\2\u00ce\u00e0\b\13\1\2\u00cf"+
		"\u00d0\7\31\2\2\u00d0\u00e0\b\13\1\2\u00d1\u00d2\7\"\2\2\u00d2\u00e0\b"+
		"\13\1\2\u00d3\u00d4\7\37\2\2\u00d4\u00e0\b\13\1\2\u00d5\u00d6\7\35\2\2"+
		"\u00d6\u00e0\b\13\1\2\u00d7\u00d8\7\34\2\2\u00d8\u00e0\b\13\1\2\u00d9"+
		"\u00da\7\33\2\2\u00da\u00e0\b\13\1\2\u00db\u00dc\7\30\2\2\u00dc\u00e0"+
		"\b\13\1\2\u00dd\u00de\7\22\2\2\u00de\u00e0\b\13\1\2\u00df\u00c1\3\2\2"+
		"\2\u00df\u00c2\3\2\2\2\u00df\u00c3\3\2\2\2\u00df\u00c4\3\2\2\2\u00df\u00c5"+
		"\3\2\2\2\u00df\u00c7\3\2\2\2\u00df\u00c8\3\2\2\2\u00df\u00ca\3\2\2\2\u00df"+
		"\u00cb\3\2\2\2\u00df\u00cd\3\2\2\2\u00df\u00cf\3\2\2\2\u00df\u00d1\3\2"+
		"\2\2\u00df\u00d3\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d7\3\2\2\2\u00df"+
		"\u00d9\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\25\3\2\2"+
		"\2\u00e1\u00e2\6\f\2\2\u00e2\u00e3\7!\2\2\u00e3\27\3\2\2\2\u00e4\u00e5"+
		"\6\r\3\2\u00e5\u00e6\7\t\2\2\u00e6\31\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8"+
		"\u0100\b\16\1\2\u00e9\u0100\5\26\f\2\u00ea\u0100\7 \2\2\u00eb\u00ec\7"+
		"\r\2\2\u00ec\u0100\b\16\1\2\u00ed\u00ee\7\6\2\2\u00ee\u0100\b\16\1\2\u00ef"+
		"\u00f0\7\"\2\2\u00f0\u0100\b\16\1\2\u00f1\u00f2\7\37\2\2\u00f2\u0100\b"+
		"\16\1\2\u00f3\u00f4\7\35\2\2\u00f4\u0100\b\16\1\2\u00f5\u00f6\7\34\2\2"+
		"\u00f6\u0100\b\16\1\2\u00f7\u00f8\7\33\2\2\u00f8\u0100\b\16\1\2\u00f9"+
		"\u00fa\7\30\2\2\u00fa\u0100\b\16\1\2\u00fb\u0100\7\7\2\2\u00fc\u0100\7"+
		"\16\2\2\u00fd\u0100\7\f\2\2\u00fe\u0100\7\5\2\2\u00ff\u00e7\3\2\2\2\u00ff"+
		"\u00e9\3\2\2\2\u00ff\u00ea\3\2\2\2\u00ff\u00eb\3\2\2\2\u00ff\u00ed\3\2"+
		"\2\2\u00ff\u00ef\3\2\2\2\u00ff\u00f1\3\2\2\2\u00ff\u00f3\3\2\2\2\u00ff"+
		"\u00f5\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff\u00fb\3\2"+
		"\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\33\3\2\2\2\u0101\u0102\7\24\2\2\u0102\u010a\b\17\1\2\u0103\u0104\5\32"+
		"\16\2\u0104\u0105\b\17\1\2\u0105\u010a\3\2\2\2\u0106\u0107\7\n\2\2\u0107"+
		"\u0108\b\17\1\2\u0108\u010a\n\2\2\2\u0109\u0101\3\2\2\2\u0109\u0103\3"+
		"\2\2\2\u0109\u0106\3\2\2\2\u010a\35\3\2\2\2\u010b\u010c\7\35\2\2\u010c"+
		"\u010d\b\20\1\2\u010d\u0111\7\32\2\2\u010e\u010f\7\31\2\2\u010f\u0111"+
		"\b\20\1\2\u0110\u010b\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0121\3\2\2\2"+
		"\u0112\u0113\5\"\22\2\u0113\u011a\b\20\1\2\u0114\u0115\6\20\4\2\u0115"+
		"\u0116\5\32\16\2\u0116\u0117\b\20\1\2\u0117\u0119\3\2\2\2\u0118\u0114"+
		"\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\b\20\1\2\u011e\u0120\3"+
		"\2\2\2\u011f\u0112\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\b\20"+
		"\1\2\u0125\37\3\2\2\2\u0126\u0127\7\35\2\2\u0127\u012e\b\21\1\2\u0128"+
		"\u0129\5&\24\2\u0129\u012a\b\21\1\2\u012a\u012f\3\2\2\2\u012b\u012c\5"+
		".\30\2\u012c\u012d\b\21\1\2\u012d\u012f\3\2\2\2\u012e\u0128\3\2\2\2\u012e"+
		"\u012b\3\2\2\2\u012f!\3\2\2\2\u0130\u0131\5\6\4\2\u0131\u0132\b\22\1\2"+
		"\u0132\u0134\3\2\2\2\u0133\u0130\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0136\5\20\t\2\u0136\u0137\b\22\1\2\u0137\u0139\3\2\2\2"+
		"\u0138\u0133\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\5 \21\2\u013b\u013c\b\22\1\2\u013c\u0141\3\2\2\2\u013d\u013e\5$\23\2"+
		"\u013e\u013f\b\22\1\2\u013f\u0141\3\2\2\2\u0140\u0138\3\2\2\2\u0140\u013d"+
		"\3\2\2\2\u0141\u0147\3\2\2\2\u0142\u0143\6\22\5\2\u0143\u0144\5\34\17"+
		"\2\u0144\u0145\b\22\1\2\u0145\u0147\3\2\2\2\u0146\u0140\3\2\2\2\u0146"+
		"\u0142\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b\22\1\2\u014b#\3\2\2\2\u014c\u014d"+
		"\7\17\2\2\u014d\u014e\b\23\1\2\u014e%\3\2\2\2\u014f\u0150\5,\27\2\u0150"+
		"\u015b\b\24\1\2\u0151\u0152\5*\26\2\u0152\u0153\b\24\1\2\u0153\u015c\3"+
		"\2\2\2\u0154\u0155\5(\25\2\u0155\u0156\b\24\1\2\u0156\u015c\3\2\2\2\u0157"+
		"\u0158\7\25\2\2\u0158\u015a\b\24\1\2\u0159\u0157\3\2\2\2\u0159\u015a\3"+
		"\2\2\2\u015a\u015c\3\2\2\2\u015b\u0151\3\2\2\2\u015b\u0154\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\'\3\2\2\2\u015d\u0162\7 \2\2\u015e\u015f\7\22\2\2"+
		"\u015f\u0163\b\25\1\2\u0160\u0161\7\35\2\2\u0161\u0163\b\25\1\2\u0162"+
		"\u015e\3\2\2\2\u0162\u0160\3\2\2\2\u0163)\3\2\2\2\u0164\u0165\7\7\2\2"+
		"\u0165\u0166\b\26\1\2\u0166+\3\2\2\2\u0167\u0168\7\6\2\2\u0168\u016c\b"+
		"\27\1\2\u0169\u016a\7\5\2\2\u016a\u016c\b\27\1\2\u016b\u0167\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016e\7\b\2\2\u016e\u0170\b\27"+
		"\1\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\b\27\1\2\u0172-\3\2\2\2\u0173\u0174\5H%\2\u0174\u0175\b\30\1\2"+
		"\u0175\u0183\3\2\2\2\u0176\u0177\5\62\32\2\u0177\u0178\b\30\1\2\u0178"+
		"\u0183\3\2\2\2\u0179\u017a\5\60\31\2\u017a\u017b\b\30\1\2\u017b\u0183"+
		"\3\2\2\2\u017c\u017d\5> \2\u017d\u017e\b\30\1\2\u017e\u0183\3\2\2\2\u017f"+
		"\u0180\5*\26\2\u0180\u0181\b\30\1\2\u0181\u0183\3\2\2\2\u0182\u0173\3"+
		"\2\2\2\u0182\u0176\3\2\2\2\u0182\u0179\3\2\2\2\u0182\u017c\3\2\2\2\u0182"+
		"\u017f\3\2\2\2\u0183/\3\2\2\2\u0184\u0185\5F$\2\u0185\u0186\b\31\1\2\u0186"+
		"\u0195\3\2\2\2\u0187\u0188\5B\"\2\u0188\u018e\b\31\1\2\u0189\u018a\5D"+
		"#\2\u018a\u018b\b\31\1\2\u018b\u018d\3\2\2\2\u018c\u0189\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0192\3\2"+
		"\2\2\u0190\u018e\3\2\2\2\u0191\u0193\7\16\2\2\u0192\u0191\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0184\3\2\2\2\u0194\u0187\3\2"+
		"\2\2\u0195\61\3\2\2\2\u0196\u0197\7\25\2\2\u0197\u0198\b\32\1\2\u0198"+
		"\63\3\2\2\2\u0199\u019a\7\6\2\2\u019a\u019b\b\33\1\2\u019b\u019c\7\"\2"+
		"\2\u019c\u019d\t\3\2\2\u019d\65\3\2\2\2\u019e\u019f\7\6\2\2\u019f\u01a2"+
		"\b\34\1\2\u01a0\u01a1\7\b\2\2\u01a1\u01a3\b\34\1\2\u01a2\u01a0\3\2\2\2"+
		"\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a7\b\34\1\2\u01a5\u01a6"+
		"\7\25\2\2\u01a6\u01a8\b\34\1\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2"+
		"\u01a8\67\3\2\2\2\u01a9\u01aa\7\6\2\2\u01aa\u01ac\b\35\1\2\u01ab\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ae\7\7\2\2\u01ae"+
		"\u01b0\b\35\1\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3"+
		"\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\b\35\1\2\u01b4"+
		"9\3\2\2\2\u01b5\u01b6\7\13\2\2\u01b6\u01b7\b\36\1\2\u01b7\u01b8\7\n\2"+
		"\2\u01b8\u01bc\b\36\1\2\u01b9\u01ba\7\f\2\2\u01ba\u01bc\b\36\1\2\u01bb"+
		"\u01b5\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7 "+
		"\2\2\u01be\u01c5\b\36\1\2\u01bf\u01c0\7\26\2\2\u01c0\u01c6\b\36\1\2\u01c1"+
		"\u01c2\7\"\2\2\u01c2\u01c6\b\36\1\2\u01c3\u01c4\7\37\2\2\u01c4\u01c6\b"+
		"\36\1\2\u01c5\u01bf\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8;\3\2\2\2"+
		"\u01c9\u01ca\7\31\2\2\u01ca\u01cc\b\37\1\2\u01cb\u01cd\7\23\2\2\u01cc"+
		"\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d1\3\2\2\2\u01ce\u01cf\5:"+
		"\36\2\u01cf\u01d0\b\37\1\2\u01d0\u01d2\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01d7\b\37\1\2\u01d6\u01d8\7#\2\2\u01d7\u01d6\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8=\3\2\2\2\u01d9\u01da\7\r\2\2\u01da\u01dd\b \1\2\u01db"+
		"\u01dc\7\22\2\2\u01dc\u01de\b \1\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01e2\3\2\2\2\u01df\u01e1\7\16\2\2\u01e0\u01df\3\2\2\2\u01e1"+
		"\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3?\3\2\2\2"+
		"\u01e4\u01e2\3\2\2\2\u01e5\u01e6\5F$\2\u01e6\u01e7\b!\1\2\u01e7\u01f3"+
		"\3\2\2\2\u01e8\u01e9\5B\"\2\u01e9\u01ef\b!\1\2\u01ea\u01eb\5D#\2\u01eb"+
		"\u01ec\b!\1\2\u01ec\u01ee\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ee\u01f1\3\2"+
		"\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01e5\3\2\2\2\u01f2\u01e8\3\2\2\2\u01f3A\3\2\2\2"+
		"\u01f4\u01f5\7\17\2\2\u01f5\u01f6\b\"\1\2\u01f6C\3\2\2\2\u01f7\u01f8\7"+
		"\35\2\2\u01f8\u01fa\b#\1\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01fc\7\20\2\2\u01fc\u01fe\b#\1\2\u01fd\u01fb\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0205\3\2\2\2\u01ff\u0200\7\35\2\2\u0200"+
		"\u0201\b#\1\2\u0201\u0202\7\6\2\2\u0202\u0203\b#\1\2\u0203\u0204\7 \2"+
		"\2\u0204\u0206\b#\1\2\u0205\u01ff\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u0208\7\21\2\2\u0208\u0209\b#\1\2\u0209E\3\2\2\2\u020a"+
		"\u020b\7\16\2\2\u020b\u020d\b$\1\2\u020c\u020a\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020fG\3\2\2\2\u0210\u0211"+
		"\7\4\2\2\u0211\u0212\b%\1\2\u0212I\3\2\2\2\67OW`o{\u0083\u008b\u008f\u0098"+
		"\u00a0\u00a8\u00aa\u00ac\u00bf\u00df\u00ff\u0109\u0110\u011a\u0121\u012e"+
		"\u0133\u0138\u0140\u0146\u0148\u0159\u015b\u0162\u016b\u016f\u0182\u018e"+
		"\u0192\u0194\u01a2\u01a7\u01ab\u01b1\u01bb\u01c5\u01c7\u01cc\u01d3\u01d7"+
		"\u01dd\u01e2\u01ef\u01f2\u01f9\u01fd\u0205\u020e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}