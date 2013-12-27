grammar test;
options{
backtrack=true;
}
@header {
//TODO Puppy groups
package dev.tclark.dogshow.grammar;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.regex.Pattern;          
import java.util.regex.Matcher;
}
@lexer::header {
package dev.tclark.dogshow.grammar;
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
  
  
}

test_special:   special_ring+;
test_breed
    :   breed_ring;
start   returns [JsonObject json]
		@init {json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray();}
		:(mComment=big_comment{comments+=$mComment.str;})+ {json.addProperty("Comment", comments);}((ring)=>mRing=ring{ringArray.add($mRing.json);})+ {json.add("Rings", ringArray); if(!mRelational){json = new JsonObject(); json.add("Rings", mShowRings);}} EOF;
		//:((mComment=big_comment{comments+=$mComment.str;})+ {json.addProperty("Comment", comments);}((ring)=>mRing=ring{ringArray.add($mRing.json);})*)+ {json.add("Rings", ringArray);} EOF;

ring	returns [JsonObject json]
		@init {json = new JsonObject();if(debug){System.out.println("ring...");}}
		:   RING_TITLE{json.addProperty("Title", $RING_TITLE.text); json.addProperty("Number", parseRingNumber($RING_TITLE.text));if(!mRelational){mCurrentRingNumber=parseRingNumber($RING_TITLE.text);}} mRing=inner_ring{json.add("Ring", mRing);};
inner_ring returns [JsonObject json]
	@init{json = new JsonObject();JsonArray judgeBlocks = new JsonArray();}
	:  ((group_block)=>mGroupBlock=group_block{json.add("GroupRing", mGroupBlock);} comment*)
	    |((mJugeBlock=judge_block{judgeBlocks.add(mJugeBlock);})+ {json.add("JudgeBlocks", judgeBlocks);});
judge_block returns [JsonObject json]
	@init{json = new JsonObject(); JsonArray array = new JsonArray();}
    :   mName=judge_name{json.addProperty("Judge", mName); if(!mRelational){mCurrentJudge = mName;}} (mBlock=timeblock{array.add(mBlock);})+ {json.add("TimeBlocks", array);};
judge_name returns [String str]
	@init {str = "";}
	:	(JUDGE_NAME{str+=$JUDGE_NAME.text;})+|(COMMENT{str+=$COMMENT.text+" ";}|PARENTHETICAL{str+=$PARENTHETICAL.text+" ";}|PARENTHETICAL_INT{str+=$PARENTHETICAL_INT.text+" ";})+; 
big_comment returns [String str]
		@init {str = "";}
		:   (mComment=comment{str = mComment;}|TIME{str=$TIME.text;}|PHONE_NUMBER{str=$PHONE_NUMBER.text;}|BREED_NAME{str=$BREED_NAME.text;}|SPECIAL_SUFFIX{str=$SPECIAL_SUFFIX.text;}|GROUP_RING{str=$GROUP_RING.text;}|NON_CONFORMATION_SECOND_LINE{str=$NON_CONFORMATION_SECOND_LINE.text;});

comment returns [String str]
		@init{str="";}
		: (NON_CONFORMATION_CLASS_NAME{str=$NON_CONFORMATION_CLASS_NAME.text;}|BREED_NAME{str=$BREED_NAME.text;}|TIME{str=$TIME.text;}|COMMENT{str=$COMMENT.text;}|PARENTHETICAL{str=$PARENTHETICAL.text;}|INT{str=$INT.text;}|ELLIPSIS{str=$ELLIPSIS.text;}|DATE{str=$DATE.text;}|PHONE_NUMBER{str=$PHONE_NUMBER.text;}|NON_CONFORMATION_SECOND_LINE{str=$NON_CONFORMATION_SECOND_LINE.text;});
timeblock_comment returns [String str]//No time
		@init{str="";}
		: (NON_CONFORMATION_CLASS_NAME{str=$NON_CONFORMATION_CLASS_NAME.text;}|BREED_NAME{str=$BREED_NAME.text;}|COMMENT{str=$COMMENT.text;}|PARENTHETICAL{str=$PARENTHETICAL.text;}|INT{str=$INT.text;}|ELLIPSIS{str=$ELLIPSIS.text;}|DATE{str=$DATE.text;}|PHONE_NUMBER{str=$PHONE_NUMBER.text;}|SPECIAL_SUFFIX);

		
ring_comment returns [String str]
    :   STANDALONE_COMMENT{str=$STANDALONE_COMMENT.text;}|timeblock_comment;







timeblock returns [JsonObject json]
	@init {json = new JsonObject(); String comment = ""; String time = "";}:
	(
		(
		INT
			{
				currentBlockTime=$INT.text;
				json.addProperty("Time", currentBlockTime);
			} 
		FOLLOWING_TIME
		)
		|TIME
			{
				currentBlockTime=$TIME.text;
				json.addProperty("Time", currentBlockTime);
			}
	) 
	(
		rings=inner_timeblock
			{
				if(json.has("Rings")){
					JsonArray already=json.getAsJsonArray("Rings");
					already.addAll(rings);
					json.add("Rings",already);
				}
				else{
					json.add("Rings", rings);
				}
			} 
		(mComment=timeblock_comment{comment+=$mComment.str;})*
			{
				if(!comment.equals("")){
					json.add("timeblock_comment",new JsonPrimitive(comment));
				}
			}
	)*
	{
		if(!mRelational&&json.has("Rings")){
			mShowRings.addAll(json.getAsJsonArray("Rings"));
		}
	};

inner_timeblock returns [JsonArray array]
	@init {array = new JsonArray();int countAhead = 0;}:
	(
		judge_name|
		mRing=int_next
			{
				mRing.add("CountAhead",new JsonPrimitive(countAhead));
				countAhead+=mRing.get("Count").getAsInt();
				array.add(mRing);
			}|
		rename_this_comment
	)+;

rename_this_comment: no_int|ring_comment;

int_next returns [JsonObject json]
	@init(json = new JsonObject(); JsonObject ring;}:
	INT
		{
			json.addProperty("Count", parseIntSafely($INT.text,0));
		}
	(
		ring=breed_next|
		ring=no_breed
	)
	{
		mergeJson(ring, json);
	};
	
no_int: (RALLY_CLASS{/*it's a walkthrough*/})|(NON_CONF_SECOND_LINE_COMMENT+);

breed_next returns [JsonObject json]
	@init(json = new JsonObject(); String suffix="";}:  
	BREED_NAME{json.addProperty("BreedName", $BREED_NAME.text);} 
	(
		other=special_suffix|
		other=breed_ring
	)
		{
			mergeJson(other, json);
		};



breed_ring returns [JsonObject json]
	@init(json = new JsonObject(); String suffix="";}: 
	BREED_NAME_SUFFIX
		{
			json.addProperty("BreedSuffix",$BREED_NAME_SUFFIX.text);
		}? 
	BREED_COUNT
		{
			json.addProperty("BreedCount", $BREED_COUNT.text);
		}?;




special_suffix returns [JsonObject json]
	@init(json = new JsonObject(); String suffix="";}:
	(
		SPECIAL_SUFFIX
			{
				suffix+=$SPECIAL_SUFFIX.text;
			}
	)+
	{
		json.addProperty("SpecialSuffix", suffix);
	};
	
no_breed returns [JsonObject json]
	@init(json = new JsonObject(); String suffix="";}:
	(json=junior|json=empty_breed_ring|json=special_suffix|json=non_conformation|json=rally);
	
junior returns [JsonObject json]
	@init{json = new JsonObject();}:
	JUNIOR_CLASS
		{
			json.addProperty("ClassName", $JUNIOR_CLASS.text);
		};


empty_breed_ring returns [JsonObject json]
	@init{json = new JsonObject();}: 
	BREED_COUNT
		{
			json.addProperty("BreedCount", $BREED_COUNT.text);
		};


non_conformation returns [JsonObject json]
	@init{json = new JsonObject();String classes="";}: 
	(
		NON_CONFORMATION_CLASS_NAME {json.addProperty("ClassName",$NON_CONFORMATION_CLASS_NAME.text);}
		(
			NON_CONFORMATION_SECOND_LINE{classes=$NON_CONFORMATION_SECOND_LINE.text;}|
			INT{classes=$NON_CONFORMATION_SECOND_LINE.text;}
		)
	)
	{
		json.addProperty("Entries", classes);
	};


rally returns [JsonObject json]
	@init{json = new JsonObject();String classes="";}:
	(
		RALLY_CLASS{json.addProperty("ClassName", $RALLY_CLASS.text);} (INT{classes+=$INT.text;}? RALLY_ENTRY{classes+=" " + RALLY_ENTRY.text;})*
	)
	{
		json.addProperty("Entries", classes);
	};














	/*
timeblock returns [JsonObject json] 
	@init {json = new JsonObject(); String comment = ""; String time = "";}	
	: (TIME{currentBlockTime=$TIME.text;json.addProperty("Time", currentBlockTime);}) (rings=inner_timeblock{if(json.has("Rings")){JsonArray already=json.getAsJsonArray("Rings");already.addAll(rings);json.add("Rings",already);}else{json.add("Rings", rings);}} (mComment=timeblock_comment{comment+=$mComment.str;})*{if(!comment.equals("")){json.add("timeblock_comment",new JsonPrimitive(comment));}})*{if(!mRelational&&json.has("Rings")){mShowRings.addAll(json.getAsJsonArray("Rings"));}};
inner_timeblock returns [JsonArray array]
	@init {array = new JsonArray();int countAhead = 0;}
	:	 (judge_name|mSpecialRing=special_ring{mSpecialRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mSpecialRing.get("Count").getAsInt();array.add(mSpecialRing);}|mJuniorRing=junior_ring{mJuniorRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mJuniorRing.get("Count").getAsInt();array.add(mJuniorRing);}|((empty_breed_ring)=>mEmptyBreedRing=empty_breed_ring{mEmptyBreedRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mEmptyBreedRing.get("Count").getAsInt();array.add(mEmptyBreedRing);})|((breed_ring)=>mBreedRing=breed_ring{mBreedRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mBreedRing.get("Count").getAsInt();array.add(mBreedRing);})|(mConformation=non_conformation_ring{array.add(mConformation);})|(mRallyRing=rally_ring_block{array.add(mRallyRing);})|(ring_comment))+;

junior_ring returns [JsonObject json]
	@init{json = new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}}
	:    INT{json.addProperty("Count",parseIntSafely($INT.text, 0));} JUNIOR_CLASS{json.addProperty("ClassName", $JUNIOR_CLASS.text);};
special_ring returns [JsonObject json]
	@init {json = new JsonObject(); String suffix = ""; json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}String breedName = "";}
	:   INT{json.addProperty("Count", parseIntSafely($INT.text, 0));} (BREED_NAME{breedName+=$BREED_NAME.text;})? (SPECIAL_SUFFIX
		{suffix+= " " + $SPECIAL_SUFFIX.text;})+ {
		//breedName+= $SPECIAL_SUFFIX.text;
		if(isVeteran(suffix)){
			json.addProperty("IsVeteran",true);
		}
		json.addProperty("IsSweepstakes",true);
		mLastBreedName = breedName;
		json.addProperty("BreedName", breedName);
		};

group_ring returns [String str]
	:	 GROUP_RING{str=$GROUP_RING.text;} (COMMENT{str+=" " + $COMMENT.text;}|PARENTHETICAL{str+= " " + $PARENTHETICAL.text;})+;
group_block returns [JsonObject json]
	@init {json = new JsonObject(); JsonArray rings = new JsonArray();}
	:	TIME{currentBlockTime=$TIME.text;json.addProperty("TIME", currentBlockTime);} STANDALONE_COMMENT? (mRing=group_ring {if(!mRelational){json = new JsonObject();String[] arr = parseGroupRing(mRing);json.addProperty("Group", arr[0]);json.addProperty("Judge",arr[1]);json.addProperty("Time",currentBlockTime);mShowRings.add(json);}else{rings.add(new JsonPrimitive(mRing));}})+ {if(mRelational){json.add("Rings", rings);}} GROUP_ENDING_ANNOUNCEMENT;
empty_breed_ring returns [JsonObject json]
	@init{json = new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}String breedName = "";int total = 0;}
    :   INT{total = parseIntSafely($INT.text, 0);json.addProperty("Count", total);} (BREED_COUNT{int counted = addBreedCountToJson(json, $BREED_COUNT.text);assert (counted==total);});



breed_ring returns [JsonObject json]
	@init{json = new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}String breedName = "";int total = 0;}
    :   INT{total = parseIntSafely($INT.text, 0);json.addProperty("Count", total);} BREED_NAME{
    		breedName+=$BREED_NAME.text;
    		if(isVeteran(breedName)){
    			breedName=mLastBreedName;
    			json.addProperty("IsVeteran",true);
    		}
    		else{
    			mLastBreedName=breedName;
    		}} (BREED_NAME_SUFFIX{breedName += " " + $BREED_NAME_SUFFIX.text;})? {json.addProperty("BreedName", breedName);} (BREED_COUNT{int counted = addBreedCountToJson(json, $BREED_COUNT.text);assert (counted==total);})?;



non_conformation_ring returns [JsonObject json]
	@init{json = new JsonObject();json.addProperty("Empty","obedience: not captured"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}}
	: (INT NON_CONFORMATION_CLASS_NAME (NON_CONFORMATION_SECOND_LINE|INT) (NON_CONF_SECOND_LINE_COMMENT)*);
rally_ring_block returns [JsonObject json]
@init{json = new JsonObject();json.addProperty("Empty","rally: not captured"); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}}
 	:	(rally_comment)|( rally_ring_name rally_entry_line*);
rally_ring_name
	:	INT? RALLY_CLASS;
	
rally_entry_line
	:	(INT? RALLY_ENTRY);
rally_comment
	:NON_CONF_SECOND_LINE_COMMENT+;
*/


//******************************
//PROPOSED
//******************************
//timeblock: TIME inner_timeblock timeblock_comment*
//inner_timeblock: (judge_name|int_next|no_int|ring_comment)+;
//
//int_next: INT  breed_next|no_breed
//no_int: (RALLY_CLASS{/*it's a walkthrough*/})|(NON_CONF_SECOND_LINE_COMMENT+);
//
//breed_next: BREED_NAME special|breed_ring;
//breed_ring: BREED_NAME_SUFFIX? BREED_COUNT?;
//special: SPECIAL_SUFFIX+;
//no_breed: junior|empty_breed_ring|empty_special|non_conformation|rally;
//junior: JUNIOR_CLASS;
//empty_breed_ring: BREED_COUNT;
//empty_special:SPECIAL_SUFFIX+;
//non_conformation: (NON_CONFORMATION_CLASS_NAME (NON_CONFORMATION_SECOND_LINE|INT));
//rally: (RALLY_CLASS (INT? RALLY_ENTRY)*);
//
//******************************
//Tracking
//******************************
//special_ring: (BREED_NAME)? (SPECIAL_SUFFIX)+
//breed_ring: BREED_NAME (BREED_NAME_SUFFIX)? (BREED_COUNT)?;
//
//
//
//
//group_ring: GROUP_RING (COMMENT|PARENTHETICAL)+;
//group_block:TIME STANDALONE_COMMENT? (group_ring)+ GROUP_ENDING_ANNOUNCEMENT;
//
//
//
//
//******************************
//ORIGINAL
//******************************
//timeblock: TIME inner_timeblock timeblock_comment*
//inner_timeblock: (judge_name|special_ring|junior_ring|empty_breed_ring|breed_ring|non_conformation_ring|rally_ring_block|ring_comment)+;
//
//junior_ring: INT JUNIOR_CLASS;
//special_ring:   INT (BREED_NAME{breedName+=$BREED_NAME.text;})? (SPECIAL_SUFFIX)+
//
//group_ring: GROUP_RING (COMMENT|PARENTHETICAL)+;
//group_block:TIME STANDALONE_COMMENT? (group_ring)+ GROUP_ENDING_ANNOUNCEMENT;
//empty_breed_ring: INT(BREED_COUNT);
//
//breed_ring: INT BREED_NAME (BREED_NAME_SUFFIX)? (BREED_COUNT)?;
//
//
//non_conformation_ring: (INT NON_CONFORMATION_CLASS_NAME (NON_CONFORMATION_SECOND_LINE|INT) (NON_CONF_SECOND_LINE_COMMENT)*);
//rally_ring_block:	(rally_comment)|(rally_ring_name rally_entry_line*);
//rally_ring_name: INT? RALLY_CLASS;
//	
//rally_entry_line: (INT? RALLY_ENTRY);
//rally_comment: NON_CONF_SECOND_LINE_COMMENT+;
//













/******************************
*
*
*LEXER
*
*
*****************************/
/*
 Show Specific Vocabulary Fragments
*/
JUNIOR_CLASS
    :   'Master Class'|
        'Open Senior'|
        'Open Intermediate'|
        'Open Junior'|
        'Novice Senior'|
        'Novice Junior'|
        'Novice Intermediate';
        
fragment FRAG_BREED_NAME_SINGLE
    : /*{allowBreed}?=> */('Affenpinscher'|
    'Afghan Hound'|
    'Airedale Terrier'|
    'Akita'|
    'Alaskan Malamute'|
    'American English Coonhound'|
    'American Eskimo Dog'|
    'American Foxhound'|
    'American Staffordshire Terrier'|
//    Captured by "Spaniels (American Water)" 'American Water Spaniel'|
    'Anatolian Shepherd Dog'|
	'Appenzeller Sennenhunde'|
    'Australian Cattle Dog'|
    'Australian Shepherd'|
    'Australian Terrier'|
    'Basenji'|
    'Basset Hound'|
    'Beagle'|
    'Bearded Collie'|
    'Beauceron'|
    'Bedlington Terrier'|
    'Belgian Malinois'|
    'Belgian Sheepdog'|
    'Belgian Tervuren'|
    'Berger Picard'|
    'Bernese Mountain Dog'|
    'Bichon Frise'|
    'Bichons Frise'|//odd plural
    'Black and Tan Coonhound'|
    'Black & Tan Coonhound'|
    'Black Russian Terrier'|
    'Bloodhound'|
    'Bluetick Coonhound'|
    'Border Collie'|
    'Border Terrier'|
    'Borzoi'|
    'Boston Terrier'|
    'Bouvier des Flandres'|
    'Bouviers des Flandres'|
    'Boxer'|
    'Boykin Spaniel'|
    'Brace'|
    'Briard'|
    'Brittany'|
    'Brussels Griffon'|
    'Bull Terrier'|
    'Bulldog'|
    'Bullmastiff'|
    'Cairn Terrier'|
    'Canaan Dog'|
    'Cane Corso'|
    'Cardigan Welsh Corgi'|
    'Cavalier King Charles Spaniel'|
    'Cesky Terrier'|
    'Chesapeake Bay Retriever'|
    'Chihuahua'|
    'Chinese Crested'|
    'Chinese Shar-Pei'|
    'Cirneco dell’Etna'|
    'Chow Chow'|
    'Clumber Spaniel'|
    'Cocker Spaniel'|
    'Collie'|
    'Curly-Coated Retriever'|
    'Dachshund'|
    'Dalmatian'|
    'Dandie Dinmont Terrier'|
    'Doberman Pinscher'|
    'Dogo Argentine'|
    'Dogue de Bordeaux'|
    'Dogues de Bordeaux'|//odd plural
    'English Cocker Spaniel'|
    'English Foxhound'|
    'English Setter'|
    'English Springer Spaniel'|
    'English Toy Spaniel'|
    'Entlebucher Mountain Dog'|
    'Field Spaniel'|
    'Finnish Lapphund'|
    'Finnish Spitz'|
    'Flat-Coated Retriever'|
    'Fox Terrier'|
    'French Bulldog'|
    'German Pinscher'|
    'German Shepherd Dog'|
    'German Shorthaired Pointer'|
    'German Wirehaired Pointer'|
    'Giant Schnauzer'|
    'Glen of Imaal Terrier'|
    'Golden Retriever'|
    'Gordon Setter'|
    'Great Dane'|
    'Great Pyrenees'|
    'Greater Swiss Mountain Dog'|
    'Greyhound'|
    'Harrier'|
    'Havanese'|
    'Ibizan Hound'|
    'Icelandic Sheepdog'|
    'Irish Red and White Setter'|
    'Irish Setter'|
    'Irish Terrier'|
    'Irish Water Spaniel'|
    'Irish Wolfhound'|
    'Italian Greyhound'|
    'Japanese Chin'|
    'Keeshond'|
    'Keeshonden'|//odd singular
    'Kerry Blue Terrier'|
    'Komondor'|
    'Kuvasz'|
    'Kuvaszok'|
    'Labrador Retriever'|
    'Lagotto Romagnolo'|
    'Lakeland Terrier'|
    'Leonberger'|
    'Lhasa Apso'|
    'Löwchen'|
    'Lowchen'|
    'Maltese'|
    'Manchester Terrier'|
    'Mastiff'|
    'Miniature American Shepherd'|
    'Miniature Bull Terrier'|
    'Miniature Pinscher'|
    'Miniature Schnauzer'|
    'Neapolitan Mastiff'|
    'Newfoundland'|
    'Norfolk Terrier'|
    'Norwegian Buhund'|
    'Norwegian Elkhound'|
    'Norwegian Lundehund'|
    'Norwich Terrier'|
    'Nova Scotia Duck Tolling Retriever'|
    'Old English Sheepdog'|
    'Otterhound'|
    'Papillon'|
    'Parson Russell Terrier'|
    'Pekingese'|
    'Pembroke Welsh Corgi'|
    'Petit Basset Griffon Vendéen'|
    'Petits Bassets Griffons Vendeen'|
    'Pharaoh Hound'|
    'Plott'|
    'Pointer'|
    'Polish Lowland Sheepdog'|
    'Pomeranian'|
    'Poodle'|
    'Portuguese Podengo Pequenos'|
    'Portuguese Water Dog'|
    'Pug'|
    'Puli'|
    'Pulik'|
    'Pyrenean Shepherd'|
    'Rat Terrier'|
    'Redbone Coonhound'|
    'Retrievers'|//labrador
    'Rhodesian Ridgeback'|
    'Rottweiler'|
    'Russell Terrier'|
    'Saint Bernard'|
    'Saluki'|
    'Samoyed'|
    'Schipperke'|
    'Scottish Deerhound'|
    'Scottish Terrier'|
    'Sealyham Terrier'|
    'Setters'|
    'Shetland Sheepdog'|
    'Shiba Inu'|
    'Shih Tzu'|
    'Siberian Husky'|
    'Siberian Huskies'|//odd plural
    'Silky Terrier'|
    'Skye Terrier'|
    'Soft Coated Wheaten Terrier'|
    'Spaniels'|
    'Spinone Italiano'|
    'Spinoni Italiani'|
    'Staffordshire Bull Terrier'|
    'Standard Schnauzer'|
    'Sussex Spaniel'|
    'Swedish Vallhund'|
    'Tibetan Mastiff'|
    'Tibetan Spaniel'|
    'Tibetan Terrier'|
    'Toy Fox Terrier'|
    'Treeing Walker Coonhound'|
    'Vizsla'|
    'Weimaraner'|
    'Welsh Springer Spaniel'|
    'Welsh Terrier'|
    'West Highland White Terrier'|
    'Whippet'|
    'Wire Fox Terrier'|
    'Wirehaired Pointing Griffon'|
	'Wirehaired Vizsla'|
    'Xoloitzcuintli'|
    'Yorkshire Terrier');


BREED_NAME
    : (FRAG_BREED_NAME_SINGLE|FRAG_BREED_NAME_ALT) 's'? WS? ('(' FRAG_BREED_NAME_CATEGORY ')' WS? FRAG_BREED_NAME_CATEGORY_SUFFIX? )? BREED_NAME_SUFFIX?;

SPECIAL_SUFFIX
   :   FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP;//Could be more matching, so keep BREED_NAME_SPECIAL_SUFFIX a fragment
    
fragment BREED_NAME_SUFFIX
    :   ('('BREED_MISC')')|BREED_MISC;
fragment FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP
	:	(FRAG_BREED_ATTRIBUTE
	 WS)? FRAG_BREED_NAME_SPECIAL_SUFFIX;
fragment BREED_MISC
:'Misc. Dog'|'Misc. Dogs'|'Misc. Bitch'|'Misc. Bitches';
fragment FRAG_SEX
	:	'Dog'|'Bitche'|'Bitch';
fragment FRAG_BREED_ATTRIBUTE
	:	'Brood'|'Veteran''s'?;
fragment FRAG_BREED_NAME_SPECIAL_SUFFIX
    :   'Sweepstakes' WS ('e'|'E') ('ntry'|'ntries');
fragment FRAG_BREED_NAME_ALT:   FRAG_BREED_ATTRIBUTE WS FRAG_SEX;//used to handle BREED_RING with no breed count after
fragment FRAG_BREED_NAME_CATEGORY_SUFFIX
    :   'Ascob'|'Parti-Color'|'Black';//Spaniels (Cocker) Ascob
fragment FRAG_BREED_NAME_CATEGORY //Breed's that are listed under categories rather than full name. Ex: Spaniels (Cocker)
    :   
        '13 Inch'|//beagles
        '15 Inch'|//beagles
        'American Water'|
        'Boykin'|//spaniels
        'B & P C'|
        'Chesapeake Bay'|
        'Clumber'|
        'Cocker'|//spaniels (cocker) ascob
        'Colored'|
        'Curly-Coated'|
        'English'|//setters
        'English Cocker'|//spaniels
        'English Springer'|//spaniels
        'Field'|//spaniels
        'Flat-Coated'|
        'German Shorthaired'|//pointer
        'German Wirehaired'|
        'Golden'|//retriever
        'Gordon'|//setters
        'Irish'|//Setters
	'Irish Red And White'|//Setters
        'Irish Water'|//spaniels
        'K C & R'|
        'Labrador'|//Retriever
        'Long Coat'|//chihuahuas
        'Longhaired'|//dachshunds
        'Miniature'|//poodles
        'Nova Scotia Duck Tolling'|
        'Rough'|//Collie
        'Smooth'|//Collie,dachshund,fox terriers
        'Smooth Coat'|//chihuahuas
        'Standard'|//poodle, manchester terrier
        'Sussex'|
        'Toy'|//poodles
        'Welsh Springer'|//spaniel
        'White'|//bull terrier
        'Wire'|
        'Wirehaired'//Dachshund
        
        
        
        
        ;
fragment GROUP_NAME:	'TOY'|'HERDING'|'TERRIER'|'NON-SPORTING'|'SPORTING'|'HOUND'|'WORKING';
fragment FRAG_BEST_IN_SHOW
	:	'BEST IN SHOW';
		
fragment FRAG_GROUP_NAME
	:(GROUP_NAME (' GROUP')=> ' GROUP');
		
fragment FRAG_SPECIAL_GROUP_NAME
	:	
		'VETERAN SWEEPSTAKES GROUP'|
		'SWEEPSTAKES GROUP'|
		'REGULAR VARIETY GROUP'|
		'Toy Variety Group';
		
GROUP_RING
	:	FRAG_GROUP_NAME|FRAG_SPECIAL_GROUP_NAME|FRAG_BEST_IN_SHOW;//(FRAG_GROUP_NAME ' - ' JUDGE_NAME)|FRAG_SPECIAL_GROUP_NAME;
//Dog breed names in singular form
/*
Rally Excellent B Walkthrough
12:50 pm
7 Rally Excellent B
12 inch: R7
16 inch: R9-R12;R15-R17
To follow Rally Excellent B
7 Rally Advanced B
3 Rally Advanced A
12 inch: R7
16 inch: R9-R18
To follow Rally Advanced
5 Rally Novice B
3 Rally Novice A
R19-R26
*/
NON_CONFORMATION_CLASS_NAME : 
	(NON_CONFORMATION_CLASS_LEVEL (' 'NON_CONFORMATION_CLASS_LEVEL)* (' 'NON_CONFORMATION_CLASS_SECTION)? (' 'NON_CONFORMATION_CLASS_SUFFIX)?);
/*
	'Beginner Novice A Class'|
	'Beginner Novice B Class'|
	'Utility A Class' | 
	'Utility B Class' | 
	'Pre Open Class'|
	'Pre Utility Class'|
	'Open A Class' | 
	'Open B Class' |
	'Novice A Class' |
	'Novice B Class' |
	'Wild Card Novice'|
	'Wild Card Utility'|
	'Graduate Novice Class'|
	'Versatility Class'|
	'Veterans Class';
	*/
fragment NON_CONFORMATION_CLASS_SECTION
	:	('A'|'B');
fragment NON_CONFORMATION_CLASS_SUFFIX
	:	'Class'|'Walkthrough';
fragment NON_CONFORMATION_CLASS_LEVEL
	:
	'Advanced'|
	'Beginner'|
	'Excellent'|
	'Utility' | 
	'Pre'|
	'Open' | 
	'Novice' |
	'Wild Card'|
	('Pair''s'?)|
	'Graduate'|
	'Walkthrough'|
	'Versatility'
	|'Veterans'
	;
	
NON_CONF_SECOND_LINE_COMMENT
	:	
	 FRAG_TO_FOLLOW WS (NON_CONFORMATION_CLASS_NAME|RALLY_CLASS);
fragment FRAG_TO_FOLLOW
	:	'To follow';
RALLY_CLASS
	: FRAG_RALLY_CLASS_NAME ;	
fragment FRAG_RALLY_CLASS_NAME
	:	'Rally ' NON_CONFORMATION_CLASS_NAME;
fragment FRAG_RALLY_CLASS_SECTION
	:	'Walkthrough';
	RALLY_ENTRY
	:	'inch: '? FRAG_RALLY_ENTRANT_GROUP (';'FRAG_RALLY_ENTRANT_GROUP)*;
	/*
	08 inch: R6
12 inch: R7-R8
16 inch: R9-R11;R15-R17
08 inch	: R7,R8
	*/
//NON_CONFORMATION_SECOND_LINE:(INT+(('-'INT+)?(';'INT+('-'INT)?))+);
NON_CONFORMATION_SECOND_LINE:('0'..'9'+'-''0'..'9'+)|('0'..'9'+(('-''0'..'9'+)?(';''0'..'9'+('-''0'..'9'+)?))+);

fragment FRAG_RALLY_SINGLE_ENTRANT
	:	'R''0'..'9'+;
fragment FRAG_RALLY_ENTRANT_GROUP:
	FRAG_RALLY_SINGLE_ENTRANT ((','|'-') FRAG_RALLY_SINGLE_ENTRANT)*; 
	// 14;12     1-23;23;23-232

fragment FRAG_MONTH   :   'January'|'JANUARY'|
             'February'|'FEBRUARY'|
             'March'|'MARCH'|
             'April'|'APRIL'|
             'May'|'MAY'|
             'June'|'JUNE'|
             'July'|'JULY'|
             'August'|'AUGUST'|
             'September'|'SEPTEMBER'|
             'October'|'OCTOBER'|
             'November'|'NOVEMBER'|
             'December'|'DECEMBER';
             
fragment END_PUNCTUATION    :       '!'|'?'|'.';
fragment FRAG_RING      :   'RING'|'Ring';
fragment FRAG_SPEC_CHAR     :   ','|'_'|'-'|';'|':'|'\''|'’';

fragment FRAG_SPEC_WORD_CHAR
    :   '&';

fragment FRAG_TIME_LABEL
    :   'am'|'pm';
    
fragment FRAG_TITLE
    :   'MR'|'Mr'|
        'MRS'|'Mrs'|
        'MS'|'Ms'|
        'MISS'|'Miss'
        |'DR'|'Dr'|
        'COL'|'Col';
    

fragment FRAG_WEEK_DAY:   'Sunday'|'SUNDAY'|
        'Monday'|'MONDAY'|
        'Tuesday'|'TUESDAY'|
        'Wednesday'|'WEDNESDAY'|
        'Thursday'|'THURSDAY'|
        'Friday'|'FRIDAY'|
        'Saturday'|'SATURDAY';





/********************************
*
*   Tokens
*
**********************************/   
STANDALONE_COMMENT
    :   'LUNCH'|'VARIETY GROUP JUDGING';  

BREED_COUNT  :  INT '-' INT '-' INT '-' INT;
JUDGE_NAME: {allowJudge}?=>(FRAG_TITLE WS FRAG_PROPER_NAME (' ' (PARENTHETICAL_NAME|FRAG_PROPER_NAME))+ (WS? PARENTHETICAL_INT?));
//JUDGE_NAME: FRAG_PROPER_NAME (' ' (PARENTHETICAL_NAME|FRAG_PROPER_NAME))* (' ' PARENTHETICAL_INT)?;

WS :(' ' |'\t' |'\n' |'\r' )+ {$channel=HIDDEN;} ;  
    
RING_TITLE  :   (('GROUP RING')=>'GROUP RING'{allowGroup=true;}|('RING' WS INT)){allowJudge=true;};

PHONE_NUMBER
    :   '(' '0'..'9''0'..'9''0'..'9' ')'
    	( (WS? '0'..'9' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '0'..'9' '0'..'9')=> WS? '0'..'9' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '0'..'9' '0'..'9'  
    	| ()=>{$type=PARENTHETICAL_INT;});
TIME    :   INT ':' INT WS FRAG_TIME_LABEL{allowBreed=true;};

DATE    :   FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT {allowBreed=true;};
    
ELLIPSIS:   '.'+;

INT :'0'..'9' + ;

PARENTHETICAL
    :   '(' (WORD|INT|FRAG_PROPER_NAME) (WS (WORD|INT|FRAG_PROPER_NAME))* ')';
fragment FRAG_PROPER_NAME: ('A'..'Z' ('a'..'z'|'A'..'Z'|FRAG_SPEC_CHAR|FRAG_SPEC_WORD_CHAR)*)END_PUNCTUATION?;

PARENTHETICAL_INT
    :   '(' WS? INT WS? ')';
fragment WORD  : ('a'..'z'|FRAG_SPEC_CHAR|FRAG_SPEC_WORD_CHAR)+ END_PUNCTUATION?;
COMMENT :   ((FRAG_PROPER_NAME|WORD|PARENTHETICAL|INT|ELLIPSIS){/*allowBreed=false;*/ allowGroup=false;allowJudge=false;})+;//Sometimes they mention sweepstakes in comment
fragment END_WORD
	:	WORD END_PUNCTUATION;
GROUP_ENDING_ANNOUNCEMENT:'Unless otherwise announced';
fragment PARENTHETICAL_NAME: '(' (FRAG_TITLE WS)? FRAG_PROPER_NAME ')';
FallThrough
@after{
  //System.err.println("Ooops! " + getText() + " fell through");
}
  :  . // match any char not matched by Number, Id or Space
  {$channel=HIDDEN;};