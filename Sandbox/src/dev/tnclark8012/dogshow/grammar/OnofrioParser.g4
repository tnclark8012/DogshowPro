/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
parser grammar OnofrioParser;

options{
    tokenVocab=OnofrioLexer; 
}
@header {
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
}
@lexer::members{
boolean allowBreed = false;
boolean allowGroup = false;
boolean allowJudge = false;
}
@parser::members {
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
  
  
}
start   returns [JsonObject json]
		@init {$json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray();}
		:(mComment=big_comment{comments+=$mComment.str;})+ {$json.addProperty("Comment", comments);}(mRing=ring{ringArray.add($mRing.json);})+ {$json.add("Rings", ringArray); if(!mRelational){$json = new JsonObject(); $json.add("Rings", mShowRings);}} EOF;
		//:((mComment=big_comment{comments+=$mComment.str;})+ {$json.addProperty("Comment", comments);}((ring)=>mRing=ring{ringArray.add($mRing.json);})*)+ {$json.add("Rings", ringArray);} EOF;

ring	returns [JsonObject json]
locals[ boolean hasHeader=false; String title = null; ]
@init {$json = new JsonObject(); if(debug){System.out.println("ring...");}mLastBreedName = null;}
		:   (special_ring_header{$ctx.hasHeader=true;isSpecialtyRing=true;}|puppy_ring_header)? (mTitle=ring_title{if(!$ctx.hasHeader){isSpecialtyRing=false;}$ctx.title=$mTitle.str;$json.addProperty("Title", $ctx.title); $json.addProperty("Number", parseRingNumber($ctx.title));if(!mRelational){mCurrentRingNumber=parseRingNumber($ctx.title);}}) mRing=inner_ring{$json.add("Ring", $mRing.json);};
ring_title returns [String str]: (RING{$ctx.str=$RING.text;} INT{$ctx.str+=" " + $INT.text;}) | (GROUP RING{$ctx.str="GROUP RING";});

puppy_ring_header 
    returns [String str]
    : PUPPY_CLASS{$str=$PUPPY_CLASS.text;};

special_ring_header
    /*
 	GERMAN SHORTHAIRED POINTER CLUB OF
 	MINNESOTA - 2013150606 (1ST SHOW)
 	*/	
    returns [String str]
    : 	CLUB_INDICATOR
        {
         $ctx.str=$CLUB_INDICATOR.text;
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
        }
        HYPHEN INT COMMENT*;

inner_ring 
    returns [JsonObject json]
    locals[ JsonArray judgeBlocks = new JsonArray(); ]
    @init{$json = new JsonObject();}
	:  (mGroupBlock=group_block{$json.add("GroupRing", $ctx.mGroupBlock.json);} (comment)*)
	    |((mJugeBlock=judge_block{$ctx.judgeBlocks.add($ctx.mJugeBlock.json);})+ {$ctx.json.add("JudgeBlocks", $ctx.judgeBlocks);});

judge_block 
    returns [JsonObject json]
    locals[JsonArray array = new JsonArray();]
    @init{$json = new JsonObject(); nextJudgeIsNewRing = true;}
    :   mName=judge_name{if(!mRelational){mCurrentJudge = $mName.json;judgeSet.add(mCurrentJudge.get("Judge").getAsString());}mergeJson($json, $ctx.mName.json);} (mBlock=timeblock{$array.add($ctx.mBlock.json);})+ {$json.add("TimeBlocks", $ctx.array);};

judge_name 
    returns [JsonObject json]
    locals [String str = "";]
    @init {$json = new JsonObject();}
    :	((JUDGE_NAME{$str+=$JUDGE_NAME.text;})+|
	(COMMENT{$str+=$COMMENT.text+" ";}|PARENTHETICAL{$str+=$PARENTHETICAL.text+" ";}|PARENTHETICAL_INT{$str+=$PARENTHETICAL_INT.text;})+){if(nextJudgeIsNewRing == true||$str.matches(".*\\(\\d+\\).*")){ nextJudgeIsNewRing = false;$json.addProperty("NewJudgeRing",true); }$str = $str.replaceAll("[\r\n]"," ");$json.addProperty("Judge",stripJudgeCount($str).trim());}; 

big_comment 
    returns [String str]
    @init {$str = "";}
    :   (mComment=comment{$str = $mComment.str;}|TIME{$str=$TIME.text;}|PHONE_NUMBER{$str=$PHONE_NUMBER.text;}|BREED_NAME{$str=$BREED_NAME.text;}|SPECIAL_SUFFIX{$str=$SPECIAL_SUFFIX.text;}|GROUP_RING{$str=$GROUP_RING.text;}|NON_CONFORMATION_SECOND_LINE{$str=$NON_CONFORMATION_SECOND_LINE.text;});

comment 
    returns [String str]
    @init{$str="";}
    :   (non_header_comment|non_ring_title_comment|PARENTHETICAL_INT|BREED_COUNT|NON_CONFORMATION_CLASS_NAME{$str=$NON_CONFORMATION_CLASS_NAME.text;}|GROUP|GROUP_NAME{$str=$GROUP_NAME.text;}|HYPHEN|BREED_NAME{$str=$BREED_NAME.text;}|BREED_CLASSIFIER{$str=$BREED_CLASSIFIER.text;}|TIME{$str=$TIME.text;}|COMMENT{$str=$COMMENT.text;}|PARENTHETICAL{$str=$PARENTHETICAL.text;}|INT{$str=$INT.text;}|ELLIPSIS{$str=$ELLIPSIS.text;}|DATE{$str=$DATE.text;}|PHONE_NUMBER{$str=$PHONE_NUMBER.text;}|NON_CONFORMATION_SECOND_LINE{$str=$NON_CONFORMATION_SECOND_LINE.text;});

non_header_comment
    //Don't match CLUB_INDICATOR if it's actually part of a ring header
    :	{!(_input.LT(2).getText().equals("-") && parseIntSafely(_input.LT(3).getText(),-1)!=-1 && _input.LT(4).getText().equals("RING"))}? CLUB_INDICATOR;

non_ring_title_comment
	:	{!(parseIntSafely(_input.LT(2).getText(),-1)!=-1)}?RING;

timeblock_comment 
    returns [String str]//No time
    @init{$str="";}
    : (GROUP_NAME{$str=$GROUP_NAME.text;}|non_header_comment|HYPHEN|NON_CONFORMATION_CLASS_NAME{$str=$NON_CONFORMATION_CLASS_NAME.text;}|BREED_NAME{$str=$BREED_NAME.text;}|COMMENT{$str=$COMMENT.text;}|PARENTHETICAL{$str=$PARENTHETICAL.text;}|INT{$str=$INT.text;}|ELLIPSIS{$str=$ELLIPSIS.text;}|DATE{$str=$DATE.text;}|PHONE_NUMBER{$str=$PHONE_NUMBER.text;}|SPECIAL_SUFFIX|NON_CONF_SECOND_LINE_COMMENT|GROUP_RING);

		
ring_comment 
    returns [String str]
    :   STANDALONE_COMMENT{$str=$STANDALONE_COMMENT.text;}|(tComment=timeblock_comment{$str=$tComment.str;})|(GROUP{$str=$GROUP.text;} ~RING);

timeblock 
    returns [JsonObject json] 
    locals[String timeblockComment = ""; String time = "";]
    @init {$json = new JsonObject(); }	
	: (
	    (
		INT
			{
				currentBlockTime=$INT.text;
				$json.addProperty("BlockStart", currentBlockTime);
			} 
		FOLLOWING_TIME
	     )|
	     TIME
	     	{
	     		currentBlockTime=$TIME.text;
	     		$json.addProperty("BlockStart", currentBlockTime);
	     	}
	   )
	   (
	   	rings=inner_timeblock
	   		{
	   		if($json.has("Rings")){
	   			JsonArray already=$json.getAsJsonArray("Rings");
	   			already.addAll($rings.array);
	   			$json.add("Rings",already);
	   		}
	   		else{
	   			$json.add("Rings", $rings.array);
	   		}
	   		} 
	   	(
	   		{!areJudgeNames(_input.LT(1).getText(), _input.LT(2).getText())}?mComment=timeblock_comment
	   			{
	   			$ctx.timeblockComment+=$mComment.str;
	   			}
	   	)*
	   		{
	   		if(!$ctx.timeblockComment.equals("")){
	   			$json.add("timeblock_comment",new JsonPrimitive($ctx.timeblockComment));
	   			mLastComment=$ctx.timeblockComment;
	   		}
	   		}
	   )*
	   	{
	   	if(!mRelational&&$json.has("Rings")){
	   		mShowRings.addAll($json.getAsJsonArray("Rings"));
	   	}	
	   	};

non_group_ring 
    returns [JsonObject json]
    @init{$json = new JsonObject();}
    : INT{mCurrentCount = parseIntSafely($INT.text,0); $json.addProperty("Count", mCurrentCount);}
	(
            (mRingWithBreed=ring_with_breed{mergeJson($json,$mRingWithBreed.json);})|
            (mRingWithoutBreed=ring_without_breed{mergeJson($json,$mRingWithoutBreed.json);})
	);


inner_timeblock 
    returns [JsonArray array]
    locals [JsonObject toAdd = null;int countAhead = 0;String innerComment="";]
    @init {$array = new JsonArray();}
    : (
        (
            (
                (
                    mTitle=ring_title
                    {if(!mRelational){mCurrentRingNumber=parseRingNumber($mTitle.str);}}
                )?
                (
                    mName=judge_name
                    {mCurrentJudge = $mName.json; judgeSet.add($mName.json.get("Judge").getAsString());}
                )
            )? //there may not be a new time block when judges change. See ANOK1 Saturday, Ring 3
            nonGroupRing=non_group_ring
                {
		$nonGroupRing.json.addProperty("BlockStart",currentBlockTime);
		$nonGroupRing.json.addProperty("Number",mCurrentRingNumber);
		addCurrentJudge($nonGroupRing.json);
		$nonGroupRing.json.add("CountAhead",new JsonPrimitive($ctx.countAhead));
		$ctx.countAhead+=mCurrentCount;//nonGroupRing.get("Count").getAsInt();
		if(!$nonGroupRing.json.has("Skip"))$array.add($nonGroupRing.json);
		}
            |(mRallyWalkthrough=rally_walkthrough
                {
		$mRallyWalkthrough.json.addProperty("BlockStart",currentBlockTime);
		mCurrentCount = 0;
		$mRallyWalkthrough.json.addProperty("Count", mCurrentCount);
		$mRallyWalkthrough.json.addProperty("Number",mCurrentRingNumber);
		$mRallyWalkthrough.json.add("CountAhead",new JsonPrimitive($ctx.countAhead));
		addCurrentJudge($mRallyWalkthrough.json);
		if(!$mRallyWalkthrough.json.has("Skip"))$array.add($mRallyWalkthrough.json);
                }
            )
        )
        |{!areJudgeNames(_input.LT(1).getText(), _input.LT(2).getText())}?rComment=ring_comment{$ctx.innerComment+=" "+$rComment.text;}
		  )+{
		  mLastComment=$ctx.innerComment;};



rally_walkthrough 
    returns [JsonObject json]
    @init{$json = new JsonObject();$json.addProperty("RingType","Rally");mCurrentCount = 0;$json.addProperty("Count",mCurrentCount);}:
        RALLY_CLASS{String title = $RALLY_CLASS.text; $json.addProperty("RallyName", title.replace(" Walkthrough", "")); $json.addProperty("IsWalkthrough",true); };//COUL - RALLY_CLASS: Rally Excellent Walkthrough 

ring_with_breed 
    returns [JsonObject json]
    @init{$json = new JsonObject();$json.addProperty("RingType","Unassigned");}:
        breedName=breed_name{$json.addProperty("RingType", "Conformation");mergeJson($json,$breedName.json);} 
	(
            suffix=special_suffix{mergeJson($json,$suffix.json);}|
            (obedience=obedience_with_breed{$json.addProperty("Skip",true);})|
            ((BREED_COUNT{int counted = addBreedCountToJson($json, $BREED_COUNT.text);})?)
        );

obedience_with_breed 
    returns [JsonObject json]
    @init{$json = new JsonObject(); $json.addProperty("Type", "Obedience"); $json.addProperty("Class",mCurrentClass);}:
	HYPHEN ((mEntry=NON_CONFORMATION_SECOND_LINE{$json.addProperty("obedienceEntries",$mEntry.text); })|(mNumber=INT{$json.addProperty("obedienceEntries",parseIntSafely($mNumber.text, 0)); }));

special_suffix
    returns [JsonObject json]
    @init{$json = new JsonObject();}:
	SPECIAL_SUFFIX{$json.addProperty("SpecialSuffix",$SPECIAL_SUFFIX.text);if(isSweepstakes($SPECIAL_SUFFIX.text))$json.addProperty("IsSweepstakes",true);};

breed_name 
    returns [JsonObject json]
    locals [String breedName="";]
    @init{$json = new JsonObject();}:
        (BREED_NAME{
            $ctx.breedName+=$BREED_NAME.text;
            if(isSweepstakes($BREED_NAME.text)){
                $ctx.breedName=mLastBreedName;
		$json.addProperty("IsSweepstakes",true);
            }
            else
            {
                mLastBreedName=$ctx.breedName;
            }		
            if(isVeteran($ctx.breedName)){
                $ctx.breedName=mLastBreedName;
    		$json.addProperty("IsVeteran",true);
            }
            else{
                mLastBreedName=$ctx.breedName;
            }}
        |BREED_CLASSIFIER
            {
                $ctx.breedName=mLastBreedName;
                $json.addProperty("BreedAttribute",$BREED_CLASSIFIER.text.trim());
		addToJsonFromAttribute($json,$BREED_CLASSIFIER.text);
            }
        ) 
        (BREED_NAME_SUFFIX
            {$json.addProperty("BreedSuffix", $BREED_NAME_SUFFIX.text);}
        )?
        {$json.addProperty("BreedName", $ctx.breedName);};


ring_without_breed 
    returns [JsonObject json]
    //locals[JsonObject ring;]
    @init{$json = new JsonObject(); $json.addProperty("RingType","Unassigned");}:
	(mJuniorRing=junior_ring
            {
            mergeJson($json,$mJuniorRing.json);
            }
        )
        |(mEmptyRing=empty_breed_ring
            {
            mergeJson($json,$mEmptyRing.json);
            $json.addProperty("BreedName",mLastBreedName);
            }
        )
        |(mRallyRing=rally_ring
            {
            mergeJson($json,$mRallyRing.json);
            $json.addProperty("RingType","Rally");
            if(!$mRallyRing.json.has("RallyName"))
            {
                $json.addProperty("Skip",true);
            }
            }
        )
        |(mNonConformationRing=non_conformation_ring
            {
            mergeJson($json,$mNonConformationRing.json);
            }
        )
        |(mSpecial=special_suffix
            {
            mergeJson($json, $mSpecial.json);
            $json.addProperty("BreedName",mLastBreedName);
            }
        );
	
/*non_conformation_ring
//with
obedience_ring:
breed_ring:
special_ring:
//without
empty_ring:
junior_ring:
*/

rally_ring  
    returns [JsonObject json]
    locals [String entries = "";]
    @init{$json = new JsonObject();}:
        (rallyComment=rally_comment{$json.addProperty("RallyComment", $rallyComment.str);})|
	( name=rally_ring_name{$json.addProperty("RallyName",$name.str);} 
	((line=rally_entry_line{$ctx.entries+=$line.str+"|";})*))
	NON_CONF_SECOND_LINE_COMMENT?;
		
empty_breed_ring 
    returns [JsonObject json]
    @init{$json = new JsonObject();}:
        (BREED_COUNT{int counted = addBreedCountToJson($json, $BREED_COUNT.text);});

non_conformation_breed_ring  
    returns [JsonObject json]:
        BREED_NAME{$json.addProperty("NonConformationBreed",$BREED_NAME.text);} COMMENT (INT|NON_CONFORMATION_SECOND_LINE);

breed_ring 
    returns [JsonObject json]
    locals [String breedName = "";]
    @init{$json = new JsonObject();}:
        BREED_NAME{
    		$ctx.breedName+=$BREED_NAME.text;
    		if(isVeteran($ctx.breedName)){
    			$ctx.breedName=mLastBreedName;
    			$json.addProperty("IsVeteran",true);
    		}
    		else{
    			mLastBreedName=$ctx.breedName;
    		}} (BREED_NAME_SUFFIX{$ctx.breedName += " " + $BREED_NAME_SUFFIX.text;})? {$json.addProperty("BreedName", $ctx.breedName);} (BREED_COUNT{int counted = addBreedCountToJson($json, $BREED_COUNT.text);})?;

			
special_ring 
    returns [JsonObject json]
    locals [String breedName= ""; String suffix="";]
    @init{$json = new JsonObject();}:
		(BREED_NAME{$ctx.breedName+=$BREED_NAME.text;})? 
                (SPECIAL_SUFFIX
                    {$ctx.suffix+= " " + $SPECIAL_SUFFIX.text;}
                )+
                {
                //breedName+= $SPECIAL_SUFFIX.text;
                if(isVeteran($ctx.suffix)){
                        $json.addProperty("IsVeteran",true);
                }
                $json.addProperty("IsSweepstakes",true);
                mLastBreedName = $ctx.breedName;
                $json.addProperty("BreedName", $ctx.breedName);
                };

group_ring 
    returns [String str]
	:	 ((GROUP_NAME{$str=$GROUP_NAME.text;} GROUP{$str+=" " + $GROUP.text;})|GROUP_RING{$str=$GROUP_RING.text;}) HYPHEN{$str+=" -";} (JUDGE_NAME{$str+=" " + $JUDGE_NAME.text;}|COMMENT{$str+=" " + $COMMENT.text;}|PARENTHETICAL{$str+= " " + $PARENTHETICAL.text;})+;

group_block 
    returns [JsonObject json]
    locals [JsonArray rings = new JsonArray();]
    @init {$json = new JsonObject(); }
	: TIME{currentBlockTime=$TIME.text;$json.addProperty("BlockStart", currentBlockTime);} 
        STANDALONE_COMMENT? 
        (
            mRing=group_ring 
                {
                if(!mRelational){
                    $json = new JsonObject();
                    $json.addProperty("RingType","Group");
                    String[] arr = parseGroupRing($mRing.str);
                    $json.addProperty("Group", arr[0]);
                    $json.addProperty("Judge",arr[1]);
                    $json.addProperty("BlockStart",currentBlockTime);
                    mShowRings.add($json);
                }
                else {
                    $rings.add(new JsonPrimitive($mRing.str));
                }
                }
        )+ 
        {
            if(mRelational){
                $json.add("Rings", $rings);
            }
        } GROUP_ENDING_ANNOUNCEMENT;

	



non_conformation_ring returns [JsonObject json]
	@init {$json = new JsonObject(); $json.addProperty("RingType", "Non-conformation"); JsonArray rings = new JsonArray();}
	:	NON_CONFORMATION_CLASS_NAME
			{
				mCurrentClass=$NON_CONFORMATION_CLASS_NAME.text;
				$json.addProperty("Class",mCurrentClass);
			} 
		(
			NON_CONFORMATION_SECOND_LINE
				{
					$json.addProperty("Entrants",$NON_CONFORMATION_SECOND_LINE.text);
				}
			/*|
			entrant=INT
				{
					$json.addProperty("Entrants",$entrant.text);
				}
				*/
		)?
		(NON_CONF_SECOND_LINE_COMMENT)*;


rally_ring_block 
    returns [JsonObject json]
    locals [String entries = "";  ]
    @init{ 
        $json = new JsonObject();
        $json.addProperty("RingType","Rally"); 
        $json.addProperty("BlockStart",currentBlockTime);
        if(!mRelational){
            addCurrentJudge($json);
            $json.addProperty("Number",mCurrentRingNumber);
        }
        }
        : (rallyComment=rally_comment{$json.addProperty("comment", $rallyComment.str);})
            |( 
                name=rally_ring_name{$json.addProperty("RallyName",$name.str);} 
                (
                    (line=rally_entry_line{$ctx.entries+=$line.str+"|";})*
                )
            );

rally_ring_name 
    returns [String str]
        : RALLY_CLASS{$str=$RALLY_CLASS.text;};
	

rally_entry_line 
    returns [String str]
    @init{$str="";}:
        (
            (intOne=INT{$str+=$intOne.text;})? 
            (RALLY_ENTRY_TITLE{$str+=$RALLY_ENTRY_TITLE.text;})? 
            (
                count=INT{$str+=" "+$count.text;}
                breed=BREED_NAME{$str+=" " + $breed.text;}
                HYPHEN{$str+=$HYPHEN.text; }
            )? 
            RALLY_ENTRY{$str+=" "+$RALLY_ENTRY.text;}
        );

rally_comment 
    returns [String str]
    @init{$str="";}:
        (NON_CONF_SECOND_LINE_COMMENT{$str+=" "+$NON_CONF_SECOND_LINE_COMMENT.text;})+;



/*
*Done
*/
junior_ring 
    returns [JsonObject json]
    @init{$json = new JsonObject();}:
        JUNIOR_CLASS
            {
            $json.addProperty("RingType","Junior");
            $json.addProperty("ClassName", $JUNIOR_CLASS.text);
            if(isSpecialtyRing){
                if(mSpecialtyBreed!=null){
                    $json.addProperty("BreedName",latestBreed);
                }
                else if(mSpecialtyGroup!=null){
                    $json.addProperty("GroupName", mSpecialtyGroup);
                }
            }
            };
	
	