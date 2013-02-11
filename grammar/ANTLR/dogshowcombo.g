<<<<<<< HEAD
grammar test;
options{
backtrack=true;
}
@header {
package dev.tclark.dogshow.grammar;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
}
@lexer::header {
package dev.tclark.dogshow.grammar;
}
@parser::members {
  private boolean ahead(String text) {
    System.out.println("Does " + input.toString() + " contain " + text + "?");
    return input.toString().contains(text);
  }
}
test_special:   special_ring+;
test_breed
    :   breed_ring;
start   returns [JsonObject json]
		@init {json = new JsonObject(); String comments = ""; JsonArray ringArray = new JsonArray(); System.out.println("starting...");}
		:((mComment=big_comment{comments+=$mComment.str;})+ {json.addProperty("Comment", comments);}((ring)=>mRing=ring{ringArray.add($mRing.json);})*)+ {json.add("Rings", ringArray);} EOF;

ring	returns [JsonObject json]
		@init {json = new JsonObject();System.out.println("ring...");}
		:   RING_TITLE{json.addProperty("Title", $RING_TITLE.text);} mRing=inner_ring{json.add("Ring", mRing);};
inner_ring returns [JsonObject json]
	@init{json = new JsonObject();JsonArray judgeBlocks = new JsonArray();}
	:  (group_block)=>mGroupBlock=group_block{json.add("GroupRing", mGroupBlock);}
	    |((mJudgeBlock=judge_block{judgeBlocks.add(mJudgeBlock);})+ {json.add("JudgeBlocks", judgeBlocks);});
judge_block returns [JsonObject json]
	@init{json = new JsonObject(); JsonArray array = new JsonArray();}
    :   JUDGE_NAME{json.addProperty("Judge", $JUDGE_NAME.text);} (mBlock=timeblock{array.add(mBlock);})+ {json.add("TimeBlocks", array);};
=======
grammar dogshowcombo;
@parser::members {
  private boolean ahead(String text) {
  	System.out.println("Does " + input.toString() + " contain " + text + "?");
	return input.toString().contains(text);
  }
}
test_special:	special_ring+;
test_breed
	:	breed_ring+ EOF;
start	:	ring+ EOF;
ring	:	RING_TITLE judge_block+;

judge_block
	:	JUDGE timeblock+;
timeblock
	:	TIME (breed_ring|special_ring|junior_ring)+;
	
special_ring:   INT BREED_NAME SPECIAL_SUFFIX+;
junior_ring:	INT JUNIOR_CLASS;
breed_ring
	:	INT BREED_NAME BREED_COUNT?;

//junior_ring	:	JUNIOR_RING+ EOF;
>>>>>>> Sweeps, Singles, Veterans Parse!
	
big_comment returns [String str]
		@init {str = null;}
		:   (mComment=comment{str = mComment;}|TIME{str=$TIME.text;}|BREED_NAME{str=$BREED_NAME.text;}|SPECIAL_SUFFIX{str=$SPECIAL_SUFFIX.text;}|GROUP_RING{str=$GROUP_RING.text;});
comment returns [String str]
		@init {str = null;}
		:   (COMMENT{str=$COMMENT.text;}|INT{str=$INT.text;}|JUDGE_NAME{str=$JUDGE_NAME.text;}|DATE{str=$DATE.text;}|PHONE_NUMBER{str=$PHONE_NUMBER.text;}|ELLIPSIS{str=$ELLIPSIS.text;});
		
timeblock_comment returns [String str]
		@init {str = null;}
	:	(COMMENT{str=$COMMENT.text;}|INT{str=$INT.text;}|PHONE_NUMBER{str=$PHONE_NUMBER.text;}|ELLIPSIS{str=$ELLIPSIS.text;}|TIME{str=$TIME.text;}|BREED_NAME{str=$BREED_NAME.text;});//no date
ring_comment returns [String str]
    :   STANDALONE_COMMENT{str=$STANDALONE_COMMENT.text;};

timeblock returns [JsonObject json] 
	@init {json = new JsonObject(); String comment = ""; int blockCounter = 0;}	
	:   TIME{json.addProperty("Time", $TIME.text);} mInnerBlock1=inner_timeblock{json.add("Block"+(blockCounter++), mInnerBlock1);} ((options {greedy=false;}:mComment=timeblock_comment{comment+=$mComment.str;})* {json.addProperty("Comment", comment);} DATE{json.addProperty("Date", $DATE.text);} INT mInnerBlock2=inner_timeblock{json.add("Block"+(blockCounter++), mInnerBlock2);})?;
inner_timeblock returns [JsonArray array]
	@init {array = new JsonArray();}
	:	(mSpecialRing=special_ring{array.add(mSpecialRing);}|mJuniorRing=junior_ring{array.add(mJuniorRing);}|(breed_ring)=>mBreedRing=breed_ring{array.add(mBreedRing);})* (mSpecialRing=special_ring{array.add(mSpecialRing);}|mJuniorRing=junior_ring{array.add(mJuniorRing);}|mBreedRing=breed_ring{array.add(mBreedRing);}|mComment=ring_comment{array.add(new JsonPrimitive(mComment));});
special_ring returns [JsonObject json]
	@init {json = new JsonObject(); String breedName = "";}
	:   INT{json.addProperty("Count", $INT.text);} BREED_NAME{breedName+=$BREED_NAME.text;} (SPECIAL_SUFFIX{breedName+= " " +$SPECIAL_SUFFIX.text;})+ {json.addProperty("BreedName", breedName);};
junior_ring returns [JsonObject json]
	@init{json = new JsonObject();}
	:    INT{json.addProperty("Count", $INT.text);} JUNIOR_CLASS{json.addProperty("ClassName", $JUNIOR_CLASS.text);};

group_ring returns [String str]
	:	 GROUP_RING{str=$GROUP_RING.text;};
group_block returns [JsonObject json]
	@init {json = new JsonObject(); JsonArray rings = new JsonArray();}
	:	TIME{json.addProperty("TIME", $TIME.text);} STANDALONE_COMMENT? (mRing=group_ring {rings.add(new JsonPrimitive(mRing));})+ {json.add("Rings", rings);};
breed_ring returns [JsonObject json]
	@init{json = new JsonObject();String breedName = "";}
    :   INT{json.addProperty("Count", $INT.text);} BREED_NAME{breedName+=$BREED_NAME.text;} (BREED_NAME_SUFFIX{breedName += " " + $BREED_NAME_SUFFIX.text;})? {json.addProperty("BreedName", breedName);} (BREED_COUNT{json.addProperty("BreedCount", $BREED_COUNT.text);})?;




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
<<<<<<< HEAD
JUNIOR_CLASS
    :   'Master Class'|
        'Open Senior'|
        'Open Intermediate'|
        'Open Junior'|
        'Novice Senior'|
        'Novice Junior'|
        'Novice Intermediate';
        
BREED_NAME
    :   (FRAG_BREED_NAME_SINGLE|FRAG_BREED_NAME_ALT) 's'? WS? ('(' FRAG_BREED_NAME_CATEGORY ')' WS? FRAG_BREED_NAME_CATEGORY_SUFFIX? )? BREED_NAME_SUFFIX?;

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
        'White'|//bull terrier
        'Wire'|
        'Wirehaired'//Dachshund
        
        
        
        
        
        ;
fragment FRAG_GROUP_NAME
	:	'HERDING GROUP'|
		'TERRIER GROUP'|
		'NON-SPORTING GROUP'|
		'SPORTING GROUP'|
		'TOY GROUP'|
		'HOUND GROUP'|
		'WORKING GROUP'|
		'BEST IN SHOW';
		
fragment FRAG_SPECIAL_GROUP_NAME
	:	
		'VETERAN SWEEPSTAKES GROUP'|
		'SWEEPSTAKES GROUP'|
		'Toy Variety Group';
		
GROUP_RING
	:	(FRAG_GROUP_NAME ' - ' JUDGE_NAME)|FRAG_SPECIAL_GROUP_NAME;
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
=======

	
BREED_NAME
	:	(FRAG_BREED_NAME_SINGLE|FRAG_BREED_NAME_PLURAL|FRAG_BREED_NAME_ALT);

SPECIAL_SUFFIX
	:	(FRAG_BREED_NAME_SUFFIX WS);

fragment FRAG_BREED_NAME_PLURAL
	:	((FRAG_BREED_NAME_SINGLE|FRAG_BREED_NAME_ALT) 's');
fragment FRAG_BREED_NAME_SUFFIX
	:	('Sweepstakes'|'Entry'|'Entries'|'Veterans'|'(Misc. Dog)'|'(Misc. Dogs)'|'(Misc. Bitch)'|'(Misc. Bitches)');//veteran dogs
fragment FRAG_BREED_NAME_ALT:	'Veteran Dog';//used to handle BREED_RING with no breed count after
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
	'Black and Tan Coonhound'|
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
	'Kerry Blue Terrier'|
	'Komondor'|
	'Kuvasz'|
	'Labrador Retriever'|
	'Lagotto Romagnolo'|
	'Lakeland Terrier'|
	'Leonberger'|
	'Lhasa Apso'|
	'Löwchen'|
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
	'Portuguese Water Dog'|
	'Pug'|
	'Puli'|
	'Pyrenean Shepherd'|
	'Redbone Coonhound'|
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
	'Shetland Sheepdog'|
	'Shiba Inu'|
	'Shih Tzu'|
	'Siberian Husky'|
	'Silky Terrier'|
	'Skye Terrier'|
	'Smooth Fox Terrier'|
	'Soft Coated Wheaten Terrier'|
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
	
JUNIOR_CLASS
	:	'Master Class'|
		'Open Senior'|
		'Open Intermediate'|
		'Open Junior'|
		'Novice Senior'|
		'Novice Junior'|
		'Novice Itermediate';
>>>>>>> Sweeps, Singles, Veterans Parse!

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
             
fragment FRAG_PAREN_LEFT    :   ('('.);
fragment FRAG_PAREN_RIGHT   :   ')';
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


fragment ATOM
    :   (WORD|INT);



<<<<<<< HEAD


=======
WS :(' ' |'\t' |'\n' |'\r' )+ {$channel=HIDDEN;} ;	
	
RING_TITLE  :   'RING' WS INT;

	
BREED_COUNT  :  INT '-' INT '-' INT '-' INT;
TIME    :   INT ':' INT WS FRAG_TIME_LABEL;
>>>>>>> Sweeps, Singles, Veterans Parse!








/********************************
*
*   Tokens
*
**********************************/     
BREED_COUNT  :  INT '-' INT '-' INT '-' INT;
JUDGE_NAME: FRAG_TITLE ' ' PROPER_NAME (PARENTHETICAL_NAME ' ' PROPER_NAME)* PARENTHETICAL_INT?;

WS :(' ' |'\t' |'\n' |'\r' )+ {$channel=HIDDEN;} ;  
    
RING_TITLE  :   'GROUP RING'|('RING' WS INT);

PHONE_NUMBER
    :   '(' '0'..'9''0'..'9''0'..'9' ')' WS? '0'..'9' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '0'..'9' '0'..'9';

TIME    :   INT ':' INT WS FRAG_TIME_LABEL;

DATE    :   FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT;
    
ELLIPSIS:   '.' '.'+;

INT :'0'..'9' + ;
STANDALONE_COMMENT
    :   'LUNCH'|'VARIETY GROUP JUDGING';
COMMENT :   (WORD|PARENTHETICAL|INT)+;//Sometimes they mention sweepstakes in comment
fragment WORD  : ('a'..'z'|'A'..'Z'|FRAG_SPEC_CHAR|FRAG_SPEC_WORD_CHAR)+;
//SENTENCE: (ATOM|PARENTHETICAL) (WS (WORD|INT|PARENTHETICAL))* END_PUNCTUATION;
fragment PARENTHETICAL_NAME: '(' PROPER_NAME ')';
fragment PARENTHETICAL
    :   FRAG_PAREN_LEFT ((WORD|INT) WS?)+ FRAG_PAREN_RIGHT FRAG_SPEC_CHAR?;
fragment FRAG_PROPER_NAME: ('A'..'Z' ('a'..'z'|'A'..'Z')*);
fragment PROPER_NAME: FRAG_PROPER_NAME ' '? (FRAG_PROPER_NAME ' '?)*;
PARENTHETICAL_INT
    :   '(' WS? '0'..'9'+ WS? ')';
