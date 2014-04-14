/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar OnofrioLexer;

@lexer::members{
boolean allowBreed = false;
boolean allowGroup = false;
boolean allowJudge = false;
}
//C:\Users\Taylor\Documents\GitHub\dogshow\Sandbox\src\dev\tnclark8012\dogshow\grammar
/******************************
*
*
*LEXER
*
*
*****************************/
PUPPY_CLASS: '(' INT HYPHEN INT WS 'Month Beginner Puppy' ')';
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
    :
   ('Affenpinscher'|
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
    ('Grand Basset''t'?'s'?' Griffon''s'?' Vend'('é'|'e')'en')|
//    ('Grand Bassets Griffons Vendeen')|
   
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
    'Portuguese Podengo'|
    'Portuguese Podengo Pequenos'|
    'Portuguese Water Dog'|
    'Pug'|
    'Puli'|
    'Pulik'|
    'Pyrenean Shepherd'|
    'Rat Terrier'|
    'Redbone Coonhound'|
    'Retriever'|//labrador
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

BREED_CLASSIFIER
	:	(FRAG_BREED_NAME_ALT 's'?);

BREED_NAME
    : (FRAG_BREED_NAME_SINGLE) 's'? WS? ('(' FRAG_BREED_NAME_CATEGORY ')' WS? FRAG_BREED_NAME_CATEGORY_SUFFIX? )? BREED_NAME_SUFFIX?;

SPECIAL_SUFFIX
   :   FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP{allowJudge=true;};//Could be more matching, so keep BREED_NAME_SPECIAL_SUFFIX a fragment
    
BREED_NAME_SUFFIX
    :   ('('BREED_MISC')')|BREED_MISC;
fragment FRAG_BREED_NAME_SPECIAL_SUFFIX_GROUP
	:	(FRAG_BREED_ATTRIBUTE
	 WS)* FRAG_BREED_NAME_SPECIAL_SUFFIX;
fragment BREED_MISC
:'Misc. Dog'|'Misc. Dogs'|'Misc. Bitch'|'Misc. Bitches';
fragment FRAG_SEX
	:	'Dog'|'Bitche'|'Bitch';
fragment FRAG_BREED_ATTRIBUTE
	:	'Working'|'Stud'|'Brood'|'Brace'|'Champion'|'Cut-Down'|'Hunting Retriever'|'Special Attraction'|'Veteran''s'?;
fragment FRAG_BREED_NAME_SPECIAL_SUFFIX
    :   'Sweepstakes' WS ('e'|'E') ('ntry'|'ntries');
fragment FRAG_BREED_NAME_ALT:   (FRAG_BREED_ATTRIBUTE WS)+ FRAG_SEX?;//used to handle BREED_RING with no breed count after
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

RING	:	'RING'{allowJudge=true;};
GROUP	:	'GROUP';
GROUP_NAME:	'TOY'|'HERDING'|'TERRIER'|'NON-SPORTING'|'SPORTING'|'HOUND'|'WORKING';
fragment FRAG_BEST_IN_SHOW
	:	'BEST IN SHOW';
		

	
fragment FRAG_SPECIAL_GROUP_NAME
	:	
		'VETERAN SWEEPSTAKES GROUP'
/*		'SWEEPSTAKES GROUP'|
		'REGULAR VARIETY GROUP'|
		'Toy Variety Group'*/;
		
GROUP_RING	:	FRAG_SPECIAL_GROUP_NAME|FRAG_BEST_IN_SHOW;//(FRAG_GROUP_NAME ' - ' JUDGE_NAME)|FRAG_SPECIAL_GROUP_NAME;
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
RALLY_ENTRY_TITLE
	:	'inch: ';
RALLY_ENTRY
	:	( FRAG_RALLY_ENTRANT_GROUP)  (';'FRAG_RALLY_ENTRANT_GROUP)*;
	/*
	08 inch: R6
12 inch: R7-R8
16 inch: R9-R11;R15-R17
08 inch	: R7,R8
	*/
//NON_CONFORMATION_SECOND_LINE:(INT+(('-'INT+)?(';'INT+('-'INT)?))+);
NON_CONFORMATION_SECOND_LINE:('0'..'9'+'-''0'..'9'+)|('0'..'9'+(('-''0'..'9'+)?((';'|',')'0'..'9'+('-''0'..'9'+)?))+);

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
JUDGE_NAME: {allowJudge}?(FRAG_TITLE WS FRAG_PROPER_NAME (' ' (PARENTHETICAL_NAME|FRAG_PROPER_NAME))+ (WS? PARENTHETICAL_INT?));

WS :(' ' |'\t' |'\n' |'\r' )+ -> channel(HIDDEN) ;  
    


PHONE_NUMBER
    :   (('(' '0'..'9''0'..'9''0'..'9' ')')|'1-800-')
    	(WS? '0'..'9' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '0'..'9' '0'..'9') WS? '0'..'9' '0'..'9' '0'..'9' '-' '0'..'9' '0'..'9' '0'..'9' '0'..'9'  
    ;
TIME    :   INT ':' INT WS FRAG_TIME_LABEL{allowBreed=true;};
FOLLOWING_TIME
	:	'minutes following Best in Show';

DATE    :   FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT {allowBreed=true;allowJudge=true;};
    
ELLIPSIS:   '.'+;

INT :'0'..'9' + ;

PARENTHETICAL_INT
    :   '(' WS? INT WS? ')';
PARENTHETICAL
    :   '(' (WORD|INT|FRAG_PROPER_NAME) (WS (WORD|INT|FRAG_PROPER_NAME))* ')';
fragment FRAG_PROPER_NAME: ('A'..'Z' ('a'..'z'|'A'..'Z'|FRAG_SPEC_CHAR|FRAG_SPEC_WORD_CHAR)*)END_PUNCTUATION?;


fragment WORD  : ('a'..'z'|FRAG_SPEC_CHAR|FRAG_SPEC_WORD_CHAR)+ END_PUNCTUATION?;
HYPHEN	:	'-';
CLUB_INDICATOR
	:	(('A'..'Z'|'a'..'z')*(','))?'INC.'|'CLUB'|'ASSOCIATION';
COMMENT :   (FRAG_PROPER_NAME|WORD|PARENTHETICAL|INT|ELLIPSIS)+{/*allowBreed=false;*/ allowGroup=false;allowJudge=false;};//Sometimes they mention sweepstakes in comment

fragment END_WORD
	:	WORD END_PUNCTUATION;
GROUP_ENDING_ANNOUNCEMENT:'Unless otherwise announced by ' TIME;
fragment PARENTHETICAL_NAME: '(' (FRAG_TITLE WS)? FRAG_PROPER_NAME (WS FRAG_PROPER_NAME)* ')';
FallThrough  :  . // match any char not matched by Number, Id or Space
  -> channel(HIDDEN);