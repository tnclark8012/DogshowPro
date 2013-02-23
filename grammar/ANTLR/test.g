grammar test;
@header {
package dev.tclark.dogshow.grammar;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
}
@members {
JsonObject ring;
}
@lexer::header {package dev.tclark.dogshow.grammar;}
test_special:	special_ring+;
test_breed
	:	breed_ring+ EOF;
start	
returns [JsonObject json]
@init {json = new JsonObject(); JsonArray array = new JsonArray(); System.out.println("starting...");}
	:	comment (myRing=ring{array.add($myRing.json);})+ {json.add("Rings", array);}EOF;
ring
returns [JsonObject json]
@init {json = new JsonObject(); JsonArray array = new JsonArray(); System.out.println("Starting ring...");}
	:	RING_TITLE{json.addProperty("RingTitle", $RING_TITLE.text);} (judgeBlock=judge_block{array.add($judgeBlock.json);})+ {System.out.println("Found new ring: " + $RING_TITLE.text); json.add("JudgeBlocks", array);};

timeblock 
returns [JsonObject json]
@init {json = new JsonObject(); JsonArray array = new JsonArray();}
	:	TIME{json.addProperty("time", $TIME.text);} ( comment? (breedRing=breed_ring{array.add($breedRing.json);}|specialRing=special_ring{array.add($specialRing.json);}|juniorRing=junior_ring{array.add($juniorRing.json);})+) {json.add("BreedRings", array);System.out.println("Timeblock JSON: " + json );};
judge_block
returns [JsonObject json]
@init {json = new JsonObject(); JsonArray array = new JsonArray();}
	:	JUDGE_NAME{json.addProperty("JudgeName",$JUDGE_NAME.text);} (block=timeblock{array.add($block.json);})+ {json.add("Blocks", array);};

comment	:	(TIME|COMMENT|INT|JUDGE_NAME|DATE|PHONE_NUMBER|ELLIPSIS)+ {System.out.println("Done with comment");};

special_ring returns [JsonObject json]
@init {json = new JsonObject(); String suff = ""; System.out.println("Found a special ring");}
	:   INT{json.addProperty("Count", $INT.text); } BREED_NAME{json.addProperty("Breed", $BREED_NAME.text); } {suff=null;}(SPECIAL_SUFFIX{suff+=$SPECIAL_SUFFIX.text;})+ {json.addProperty("SpecialType",suff);};
junior_ring returns [JsonObject json]
@init {json = new JsonObject();}
	:	INT {json.addProperty("Count", $INT.text); } JUNIOR_CLASS{json.addProperty("ClassName", $JUNIOR_CLASS.text); };
breed_ring returns [JsonObject json]
@init {json = new JsonObject();String str = null;}
	:	INT{json.addProperty("Count", $INT.text); } {str = "";}BREED_NAME{str += $BREED_NAME.text;} (BREED_NAME_SUFFIX {str+= $BREED_NAME_SUFFIX.text;})? (BREED_COUNT{json.addProperty("BreedCount", $BREED_COUNT.text);})? {System.out.println("BreedRing JSON: " + json);};
breed_name
	:	BREED_NAME BREED_NAME_SUFFIX;
JUNIOR_CLASS
	:	'Master Class'|
		'Open Senior'|
		'Open Intermediate'|
		'Open Junior'|
		'Novice Senior'|
		'Novice Junior'|
		'Novice Itermediate';
test_pug:	BREED_NAME BREED_COUNT EOF;
BREED_NAME
	:	(FRAG_BREED_NAME_SINGLE);
//(FRAG_BREED_NAME_SINGLE|FRAG_BREED_NAME_ALT) 's'? WS? ('(' FRAG_BREED_NAME_CATEGORY ')' WS? FRAG_BREED_NAME_CATEGORY_SUFFIX? )? BREED_NAME_SUFFIX?;

SPECIAL_SUFFIX
	:	(FRAG_BREED_NAME_SPECIAL_SUFFIX );//Could be more matching, so keep BREED_NAME_SPECIAL_SUFFIX a fragment
	
BREED_NAME_SUFFIX
	:	'(Misc. Dog)'|'(Misc. Dogs)'|'(Misc. Bitch)'|'(Misc. Bitches)';

fragment FRAG_BREED_NAME_SPECIAL_SUFFIX
	:	('Sweepstakes'|'Entry'|'Entries'|'Veterans');
fragment FRAG_BREED_NAME_ALT:	'Veteran Dog';//used to handle BREED_RING with no breed count after
fragment FRAG_BREED_NAME_CATEGORY_SUFFIX
	:	'Ascob'|'Parti-Color';//Spaniels (Cocker) Ascob
fragment FRAG_BREED_NAME_CATEGORY //Breed's that are listed under categories rather than full name. Ex: Spaniels (Cocker)
	:	
		'13 Inch'|//beagles
		'15 Inch'|//beagles
		'Boykin'|//spaniels
		'Cocker'|//spaniels (cocker) ascob
		'English'|//setters
		'English Cocker'|//spaniels
		'English Springer'|//spaniels
		'Field'|//spaniels
		'German Shorthaired'|//pointer
		'Golden'|//retriever
		'Gordon'|//setters
		'Irish'|//Setters
		'Labrador'|//Retriever
		'Long Coat'|//chihuahuas
		'Longhaired'|//dachshunds
		'Miniature'|//poodles
		'Rough'|//Collie
		'Smooth'|//Collie,dachshund,fox terriers
		'Smooth Coat'|//chihuahuas
		'Standard'|//poodle, manchester terrier
		'Toy'|//poodles
		'White'|//bull terrier
		'Wirehaired'//Dachshund
		
		
		
		
		
		;

//Dog breed names in singular form
fragment FRAG_BREED_NAME_SINGLE
	:('Affenpinscher'|
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
	'Chow Chow'|
	'Clumber Spaniel'|
	'Cocker Spaniel'|
	'Collie'|
	'Curly-Coated Retriever'|
	'Dachshund'|
	'Dalmatian'|
	'Dandie Dinmont Terrier'|
	'Doberman Pinscher'|
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
	'Xoloitzcuintli'|
	'Yorkshire Terrier');

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
		     
fragment FRAG_PAREN_LEFT	:	('('.);
fragment FRAG_PAREN_RIGHT	:	')';
fragment END_PUNCTUATION	:   	'!'|'?'|'.';
fragment FRAG_SPEC_CHAR		:	','|'_'|'-'|';'|':'|'\''|'.'|'!'|'’';

fragment FRAG_SPEC_WORD_CHAR
	:	'&'|'-';

fragment FRAG_TIME_LABEL
    :   'am'|'pm';
    
fragment FRAG_TITLE
	:	'MR'|'Mr'|
		'MRS'|'Mrs'|
		'MS'|'Ms'|
		'MISS'|'Miss'
		|'DR';
	

fragment FRAG_WEEK_DAY:   'Sunday'|'SUNDAY'|
	    'Monday'|'MONDAY'|
	    'Tuesday'|'TUESDAY'|
	    'Wednesday'|'WEDNESDAY'|
	    'Thursday'|'THURSDAY'|
	    'Friday'|'FRIDAY'|
	    'Saturday'|'SATURDAY';


fragment ATOM
	:	(WORD|INT);













/********************************
*
*	Tokens
*
**********************************/		
BREED_COUNT  :  INT '-' INT '-' INT '-' INT;
JUDGE_NAME: FRAG_TITLE ' ' PROPER_NAME (PARENTHETICAL_NAME ' ' PROPER_NAME)* PARENTHETICAL_INT?;
//JUDGE_ADDRESS: JUDGE_NAME ELLIPSIS;

WS :(' ' |'\t' |'\n' |'\r' )+ {$channel=HIDDEN;} ;		
RING_TITLE  :   ('GROUP RING')|('RING' WS INT);

	

TIME    :   INT ':' INT WS FRAG_TIME_LABEL;

DATE    :   FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT;
	
ELLIPSIS:	'.' '.'+;
PHONE_NUMBER
	:	'(' '0'..'9''0'..'9''0'..'9' ')' WS? '0'..'9' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '0'..'9' '0'..'9';
INT :'0'..'9'+;
STANDALONE_COMMENT
	:	'LUNCH';
COMMENT	:	(PROPER_NAME|WORD|PARENTHETICAL|INT)+;
//SENTENCE:	(ATOM|PARENTHETICAL) (WS (WORD|INT|PARENTHETICAL))* END_PUNCTUATION;
fragment WORD  : ('a'..'z'|'A'..'Z'|FRAG_SPEC_CHAR|FRAG_SPEC_WORD_CHAR)+;
fragment PARENTHETICAL_NAME: '(' PROPER_NAME ')';
fragment PARENTHETICAL
	:	FRAG_PAREN_LEFT ((WORD|INT) WS?)+ FRAG_PAREN_RIGHT FRAG_SPEC_CHAR?;
fragment FRAG_PROPER_NAME: ('A'..'Z' ('a'..'z'|'A'..'Z')*);
fragment PROPER_NAME: FRAG_PROPER_NAME ' '? (FRAG_PROPER_NAME ' '?)*;
PARENTHETICAL_INT
	:	'(' INT ')';