grammar test;
options{
backtrack=true;
}
@header {
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
	:	(JUDGE_NAME{str=$JUDGE_NAME.text;})|((COMMENT{str += $COMMENT.text;})+ PARENTHETICAL{str += $PARENTHETICAL.text;}){}; 
big_comment returns [String str]
		@init {str = "";}
		:   (mComment=comment{str = mComment;}|TIME{str=$TIME.text;}|PHONE_NUMBER{str=$PHONE_NUMBER.text;}|BREED_NAME{str=$BREED_NAME.text;}|SPECIAL_SUFFIX{str=$SPECIAL_SUFFIX.text;}|GROUP_RING{str=$GROUP_RING.text;});

comment returns [String str]
		@init{str="";}
		: (TIME{str=$TIME.text;}|COMMENT{str=$COMMENT.text;}|PARENTHETICAL{str=$PARENTHETICAL.text;}|INT{str=$INT.text;}|ELLIPSIS{str=$ELLIPSIS.text;}|DATE{str=$DATE.text;}|PHONE_NUMBER{str=$PHONE_NUMBER.text;});

timeblock_comment returns [String str]//No time
		@init{str="";}
		: (COMMENT{str=$COMMENT.text;}|PARENTHETICAL{str=$PARENTHETICAL.text;}|INT{str=$INT.text;}|ELLIPSIS{str=$ELLIPSIS.text;}|DATE{str=$DATE.text;}|PHONE_NUMBER{str=$PHONE_NUMBER.text;});

		
ring_comment returns [String str]
    :   STANDALONE_COMMENT{str=$STANDALONE_COMMENT.text;};

timeblock returns [JsonObject json] 
	@init {json = new JsonObject(); String comment = ""; String time = "";}	
	: (TIME{currentBlockTime=$TIME.text;json.addProperty("Time", currentBlockTime);}) (rings=inner_timeblock{if(json.has("Rings")){JsonArray already=json.getAsJsonArray("Rings");already.addAll(rings);json.add("Rings",already);}else{json.add("Rings", rings);}} (mComment=timeblock_comment{comment+=$mComment.str;})*{if(!comment.equals("")){json.add("timeblock_comment",new JsonPrimitive(comment));}})*{if(!mRelational&&json.has("Rings")){mShowRings.addAll(json.getAsJsonArray("Rings"));}};
inner_timeblock returns [JsonArray array]
	@init {array = new JsonArray();int countAhead = 0;}
	:	(mSpecialRing=special_ring{mSpecialRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mSpecialRing.get("Count").getAsInt();array.add(mSpecialRing);}|mJuniorRing=junior_ring{mJuniorRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mJuniorRing.get("Count").getAsInt();array.add(mJuniorRing);}|((breed_ring)=>mBreedRing=breed_ring{mBreedRing.add("CountAhead",new JsonPrimitive(countAhead));countAhead+=mBreedRing.get("Count").getAsInt();array.add(mBreedRing);})|ring_comment)+;
special_ring returns [JsonObject json]
	@init {json = new JsonObject(); json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}String breedName = "";}
	:   INT{json.addProperty("Count", parseIntSafely($INT.text, 0));} (BREED_NAME{breedName+=$BREED_NAME.text;})? (SPECIAL_SUFFIX{breedName+= " " +$SPECIAL_SUFFIX.text;})+ {json.addProperty("BreedName", breedName);};
junior_ring returns [JsonObject json]
	@init{json = new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}}
	:    INT{json.addProperty("Count",parseIntSafely($INT.text, 0));} JUNIOR_CLASS{json.addProperty("ClassName", $JUNIOR_CLASS.text);};

group_ring returns [String str]
	:	 GROUP_RING{str=$GROUP_RING.text;};
group_block returns [JsonObject json]
	@init {json = new JsonObject(); JsonArray rings = new JsonArray();}
	:	TIME{currentBlockTime=$TIME.text;json.addProperty("TIME", currentBlockTime);} STANDALONE_COMMENT? (mRing=group_ring {if(!mRelational){json = new JsonObject();String[] arr = parseGroupRing(mRing);json.addProperty("Group", arr[0]);json.addProperty("Judge",arr[1]);json.addProperty("Time",currentBlockTime);mShowRings.add(json);}else{rings.add(new JsonPrimitive(mRing));}})+ {if(mRelational){json.add("Rings", rings);}};
breed_ring returns [JsonObject json]
	@init{json = new JsonObject();json.addProperty("BlockStart",currentBlockTime);if(!mRelational){json.addProperty("Judge",mCurrentJudge);json.addProperty("Number",mCurrentRingNumber);}String breedName = "";int total = 0;}
    :   INT{total = parseIntSafely($INT.text, 0);json.addProperty("Count", total);} BREED_NAME{breedName+=$BREED_NAME.text;} (BREED_NAME_SUFFIX{breedName += " " + $BREED_NAME_SUFFIX.text;})? {json.addProperty("BreedName", breedName);} (BREED_COUNT{int counted = addBreedCountToJson(json, $BREED_COUNT.text);assert (counted==total);})?;




//junior_ring   :   JUNIOR_RING+ EOF;
    
//test_breed_ring:  BREED_RING;
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
    : {allowBreed}?=> ('Affenpinscher'|
    'Afghan Hound'|
    'Airedale Terrier'|
    'Akita'|
    'Alaskan Malamute'|
    'American English Coonhound'|
    'American Eskimo Dog'|
    'American Foxhound'|
    'American Staffordshire Terrier'|
    'American Water Spaniel'|
    'Anatolian Shepherd Dog'|
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
    : {allowBreed}?=>(FRAG_BREED_NAME_SINGLE|FRAG_BREED_NAME_ALT) 's'? WS? ('(' FRAG_BREED_NAME_CATEGORY ')' WS? FRAG_BREED_NAME_CATEGORY_SUFFIX? )? BREED_NAME_SUFFIX?;

SPECIAL_SUFFIX
    :   (FRAG_BREED_NAME_SPECIAL_SUFFIX);//Could be more matching, so keep BREED_NAME_SPECIAL_SUFFIX a fragment
    
BREED_NAME_SUFFIX
    :   '(Misc. Dog)'|'(Misc. Dogs)'|'(Misc. Bitch)'|'(Misc. Bitches)';

fragment FRAG_BREED_NAME_SPECIAL_SUFFIX
    :   ('Sweepstakes'|'Entry'|'Entries'|'Veterans');
fragment FRAG_BREED_NAME_ALT:   'Veteran Dog'|'Veteran Bitch'|'Veteran Bitche';//used to handle BREED_RING with no breed count after
fragment FRAG_BREED_NAME_CATEGORY_SUFFIX
    :   'Ascob'|'Parti-Color'|'Black';//Spaniels (Cocker) Ascob
fragment FRAG_BREED_NAME_CATEGORY //Breed's that are listed under categories rather than full name. Ex: Spaniels (Cocker)
    :   
        '13 Inch'|//beagles
        '15 Inch'|//beagles
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
fragment FRAG_GROUP_NAME
	:{allowGroup}?=>(	'HERDING GROUP'|
		'TERRIER GROUP'|
		'NON-SPORTING GROUP'|
		'SPORTING GROUP'|
		'TOY GROUP'|
		'HOUND GROUP'|
		'WORKING GROUP'|
		('BEST IN SHOW'{allowGroup=false;}));
		
fragment FRAG_SPECIAL_GROUP_NAME
	:	
		'VETERAN SWEEPSTAKES GROUP'|
		'SWEEPSTAKES GROUP'|
		'REGULAR VARIETY GROUP'|
		'Toy Variety Group';
		
GROUP_RING
	:	(FRAG_GROUP_NAME ' - ' JUDGE_NAME)|FRAG_SPECIAL_GROUP_NAME;
//Dog breed names in singular form

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
JUDGE_NAME: {allowJudge}?=>(FRAG_TITLE WS FRAG_PROPER_NAME (' ' (PARENTHETICAL_NAME|FRAG_PROPER_NAME))* (WS? PARENTHETICAL_INT?));
//JUDGE_NAME: FRAG_PROPER_NAME (' ' (PARENTHETICAL_NAME|FRAG_PROPER_NAME))* (' ' PARENTHETICAL_INT)?;

WS :(' ' |'\t' |'\n' |'\r' )+ {$channel=HIDDEN;} ;  
    
RING_TITLE  :   ('GROUP RING'{allowGroup=true;}|('RING' WS INT)){allowJudge=true;};

PHONE_NUMBER
    :   '(' '0'..'9''0'..'9''0'..'9' ')' WS? '0'..'9' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '0'..'9' '0'..'9';

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
COMMENT :   ((FRAG_PROPER_NAME|WORD|PARENTHETICAL|INT|ELLIPSIS){allowBreed=false; allowGroup=false;allowJudge=false;})+;//Sometimes they mention sweepstakes in comment
fragment END_WORD
	:	WORD END_PUNCTUATION;
fragment PARENTHETICAL_NAME: '(' FRAG_PROPER_NAME ')';

FallThrough
@after{
  System.err.println("Ooops! " + getText() + " fell through");
}
  :  . // match any char not matched by Number, Id or Space
  {$channel=HIDDEN;};