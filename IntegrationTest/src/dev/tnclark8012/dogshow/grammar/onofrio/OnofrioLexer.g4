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
        ('Affenpinscher'|'AFFENPINSCHER'|
'Afghan Hound'|'AFGHAN HOUND'|
'Airedale Terrier'|'AIREDALE TERRIER'|
'Akita'|'AKITA'|
'Alaskan Malamute'|'ALASKAN MALAMUTE'|
'American English Coonhound'|'AMERICAN ENGLISH COONHOUND'|
'American Eskimo Dog'|'AMERICAN ESKIMO DOG'|
'American Foxhound'|'AMERICAN FOXHOUND'|
'American Staffordshire Terrier'|'AMERICAN STAFFORDSHIRE TERRIER'|
'Anatolian Shepherd Dog'|'ANATOLIAN SHEPHERD DOG'|
'Appenzeller Sennenhunde'|'APPENZELLER SENNENHUNDE'|
'Australian Cattle Dog'|'AUSTRALIAN CATTLE DOG'|
'Australian Shepherd'|'AUSTRALIAN SHEPHERD'|
'Australian Terrier'|'AUSTRALIAN TERRIER'|
'Basenji'|'BASENJI'|
'Basset Hound'|'BASSET HOUND'|
'Beagle'|'BEAGLE'|
'Bearded Collie'|'BEARDED COLLIE'|
'Beauceron'|'BEAUCERON'|
'Bedlington Terrier'|'BEDLINGTON TERRIER'|
'Belgian Malinois'|'BELGIAN MALINOIS'|
'Belgian Sheepdog'|'BELGIAN SHEEPDOG'|
'Belgian Tervuren'|'BELGIAN TERVUREN'|
'Berger Picard'|'BERGER PICARD'|
'Bernese Mountain Dog'|'BERNESE MOUNTAIN DOG'|
'Bichon Frise'|'BICHON FRISE'|
'Bichons Frise'|'BICHONS FRISE'|
'Black and Tan Coonhound'|'BLACK AND TAN COONHOUND'|
'Black & Tan Coonhound'|'BLACK & TAN COONHOUND'|
'Black Russian Terrier'|'BLACK RUSSIAN TERRIER'|
'Bloodhound'|'BLOODHOUND'|
'Bluetick Coonhound'|'BLUETICK COONHOUND'|
'Border Collie'|'BORDER COLLIE'|
'Border Terrier'|'BORDER TERRIER'|
'Borzoi'|'BORZOI'|
'Boston Terrier'|'BOSTON TERRIER'|
'Bouvier des Flandres'|'BOUVIER DES FLANDRES'|
'Bouviers des Flandres'|'BOUVIERS DES FLANDRES'|
'Boxer'|'BOXER'|
'Boykin Spaniel'|'BOYKIN SPANIEL'|
'Briard'|'BRIARD'|
'Brittany'|'BRITTANY'|
'Brussels Griffon'|'BRUSSELS GRIFFON'|
'Bull Terrier'|'BULL TERRIER'|
'Bulldog'|'BULLDOG'|
'Bullmastiff'|'BULLMASTIFF'|
'Cairn Terrier'|'CAIRN TERRIER'|
'Canaan Dog'|'CANAAN DOG'|
'Cane Corso'|'CANE CORSO'|
'Cardigan Welsh Corgi'|'CARDIGAN WELSH CORGI'|
'Cavalier King Charles Spaniel'|'CAVALIER KING CHARLES SPANIEL'|
'Cesky Terrier'|'CESKY TERRIER'|
'Chesapeake Bay Retriever'|'CHESAPEAKE BAY RETRIEVER'|
'Chihuahua'|'CHIHUAHUA'|
'Chinese Crested'|'CHINESE CRESTED'|
'Chinese Shar-Pei'|'CHINESE SHAR-PEI'|
'Cirneco dell’Etna'|'CIRNECO DELL’ETNA'|
'Chow Chow'|'CHOW CHOW'|
'Clumber Spaniel'|'CLUMBER SPANIEL'|
'Cocker Spaniel'|'COCKER SPANIEL'|
'Collie'|'COLLIE'|
'Curly-Coated Retriever'|'CURLY-COATED RETRIEVER'|
'Dachshund'|'DACHSHUND'|
'Dalmatian'|'DALMATIAN'|
'Dandie Dinmont Terrier'|'DANDIE DINMONT TERRIER'|
'Doberman Pinscher'|'DOBERMAN PINSCHER'|
'Dogo Argentine'|'DOGO ARGENTINE'|
'Dogue de Bordeaux'|'DOGUE DE BORDEAUX'|
'Dogues de Bordeaux'|'DOGUES DE BORDEAUX'|
'English Cocker Spaniel'|'ENGLISH COCKER SPANIEL'|
'English Foxhound'|'ENGLISH FOXHOUND'|
'English Setter'|'ENGLISH SETTER'|
'English Springer Spaniel'|'ENGLISH SPRINGER SPANIEL'|
'English Toy Spaniel'|'ENGLISH TOY SPANIEL'|
'Entlebucher Mountain Dog'|'ENTLEBUCHER MOUNTAIN DOG'|
'Field Spaniel'|'FIELD SPANIEL'|
'Finnish Lapphund'|'FINNISH LAPPHUND'|
'Finnish Spitz'|'FINNISH SPITZ'|
'Flat-Coated Retriever'|'FLAT-COATED RETRIEVER'|
'Fox Terrier'|'FOX TERRIER'|
'French Bulldog'|'FRENCH BULLDOG'|
'German Pinscher'|'GERMAN PINSCHER'|
'German Shepherd Dog'|'GERMAN SHEPHERD DOG'|
'German Shorthaired Pointer'|'GERMAN SHORTHAIRED POINTER'|
'German Wirehaired Pointer'|'GERMAN WIREHAIRED POINTER'|
'Giant Schnauzer'|'GIANT SCHNAUZER'|
'Glen of Imaal Terrier'|'GLEN OF IMAAL TERRIER'|
'Golden Retriever'|'GOLDEN RETRIEVER'|
'Gordon Setter'|'GORDON SETTER'|
('Grand Basset''t'?'s'?' Griffon''s'?' Vend'('é'|'e')'en')|
('GRAND BASSET''T'?'T'?' GRIFFON''S'?' VEND'('É'|'E')'EN')|
'Great Dane'|'GREAT DANE'|
'Great Pyrenees'|'GREAT PYRENEES'|
'Greater Swiss Mountain Dog'|'GREATER SWISS MOUNTAIN DOG'|
'Greyhound'|'GREYHOUND'|
'Harrier'|'HARRIER'|
'Havanese'|'HAVANESE'|
'Ibizan Hound'|'IBIZAN HOUND'|
'Icelandic Sheepdog'|'ICELANDIC SHEEPDOG'|
'Irish Red and White Setter'|'IRISH RED AND WHITE SETTER'|
'Irish Setter'|'IRISH SETTER'|
'Irish Terrier'|'IRISH TERRIER'|
'Irish Water Spaniel'|'IRISH WATER SPANIEL'|
'Irish Wolfhound'|'IRISH WOLFHOUND'|
'Italian Greyhound'|'ITALIAN GREYHOUND'|
'Japanese Chin'|'JAPANESE CHIN'|
'Keeshond'|'KEESHOND'|
'Keeshonden'|'KEESHONDEN'|
'Kerry Blue Terrier'|'KERRY BLUE TERRIER'|
'Komondor'|'KOMONDOR'|
'Kuvasz'|'KUVASZ'|
'Kuvaszok'|'KUVASZOK'|
'Labrador Retriever'|'LABRADOR RETRIEVER'|
'Lagotto Romagnolo'|'LAGOTTO ROMAGNOLO'|
'Lakeland Terrier'|'LAKELAND TERRIER'|
'Leonberger'|'LEONBERGER'|
'Lhasa Apso'|'LHASA APSO'|
'Löwchen'|'LöWCHEN'|
'Lowchen'|'LOWCHEN'|
'Maltese'|'MALTESE'|
'Manchester Terrier'|'MANCHESTER TERRIER'|
'Mastiff'|'MASTIFF'|
'Miniature American Shepherd'|'MINIATURE AMERICAN SHEPHERD'|
'Miniature Bull Terrier'|'MINIATURE BULL TERRIER'|
'Miniature Pinscher'|'MINIATURE PINSCHER'|
'Miniature Schnauzer'|'MINIATURE SCHNAUZER'|
'Neapolitan Mastiff'|'NEAPOLITAN MASTIFF'|
'Newfoundland'|'NEWFOUNDLAND'|
'Norfolk Terrier'|'NORFOLK TERRIER'|
'Norwegian Buhund'|'NORWEGIAN BUHUND'|
'Norwegian Elkhound'|'NORWEGIAN ELKHOUND'|
'Norwegian Lundehund'|'NORWEGIAN LUNDEHUND'|
'Norwich Terrier'|'NORWICH TERRIER'|
'Nova Scotia Duck Tolling Retriever'|'NOVA SCOTIA DUCK TOLLING RETRIEVER'|
'Old English Sheepdog'|'OLD ENGLISH SHEEPDOG'|
'Otterhound'|'OTTERHOUND'|
'Papillon'|'PAPILLON'|
'Parson Russell Terrier'|'PARSON RUSSELL TERRIER'|
'Pekingese'|'PEKINGESE'|
'Pembroke Welsh Corgi'|'PEMBROKE WELSH CORGI'|
'Petit Basset Griffon Vendéen'|'PETIT BASSET GRIFFON VENDÉEN'|
'Petits Bassets Griffons Vendeen'|'PETITS BASSETS GRIFFONS VENDEEN'|
'Pharaoh Hound'|'PHARAOH HOUND'|
'Plott'|'PLOTT'|
'Pointer'|'POINTER'|
'Polish Lowland Sheepdog'|'POLISH LOWLAND SHEEPDOG'|
'Pomeranian'|'POMERANIAN'|
'Poodle'|'POODLE'|
'Portuguese Podengo'|'PORTUGUESE PODENGO'|
'Portuguese Podengo Pequenos'|'PORTUGUESE PODENGO PEQUENOS'|
'Portuguese Water Dog'|'PORTUGUESE WATER DOG'|
'Pug'|'PUG'|
'Puli'|'PULI'|
'Pulik'|'PULIK'|
'Pyrenean Shepherd'|'PYRENEAN SHEPHERD'|
'Rat Terrier'|'RAT TERRIER'|
'Redbone Coonhound'|'REDBONE COONHOUND'|
'Retriever'|'RETRIEVER'|
'Rhodesian Ridgeback'|'RHODESIAN RIDGEBACK'|
'Rottweiler'|'ROTTWEILER'|
'Russell Terrier'|'RUSSELL TERRIER'|
'Saint Bernard'|'SAINT BERNARD'|
'Saluki'|'SALUKI'|
'Samoyed'|'SAMOYED'|
'Schipperke'|'SCHIPPERKE'|
'Scottish Deerhound'|'SCOTTISH DEERHOUND'|
'Scottish Terrier'|'SCOTTISH TERRIER'|
'Sealyham Terrier'|'SEALYHAM TERRIER'|
'Setters'|'SETTERS'|
'Shetland Sheepdog'|'SHETLAND SHEEPDOG'|
'Shiba Inu'|'SHIBA INU'|
'Shih Tzu'|'SHIH TZU'|
'Siberian Husky'|'SIBERIAN HUSKY'|
'Siberian Huskies'|'SIBERIAN HUSKIES'|
'Silky Terrier'|'SILKY TERRIER'|
'Skye Terrier'|'SKYE TERRIER'|
'Soft Coated Wheaten Terrier'|'SOFT COATED WHEATEN TERRIER'|
'Spaniels'|'SPANIELS'|
'Spinone Italiano'|'SPINONE ITALIANO'|
'Spinoni Italiani'|'SPINONI ITALIANI'|
'Staffordshire Bull Terrier'|'STAFFORDSHIRE BULL TERRIER'|
'Standard Schnauzer'|'STANDARD SCHNAUZER'|
'Sussex Spaniel'|'SUSSEX SPANIEL'|
'Swedish Vallhund'|'SWEDISH VALLHUND'|
'Tibetan Mastiff'|'TIBETAN MASTIFF'|
'Tibetan Spaniel'|'TIBETAN SPANIEL'|
'Tibetan Terrier'|'TIBETAN TERRIER'|
'Toy Fox Terrier'|'TOY FOX TERRIER'|
'Treeing Walker Coonhound'|'TREEING WALKER COONHOUND'|
'Vizsla'|'VIZSLA'|
'Weimaraner'|'WEIMARANER'|
'Welsh Springer Spaniel'|'WELSH SPRINGER SPANIEL'|
'Welsh Terrier'|'WELSH TERRIER'|
'West Highland White Terrier'|'WEST HIGHLAND WHITE TERRIER'|
'Whippet'|'WHIPPET'|
'Wire Fox Terrier'|'WIRE FOX TERRIER'|
'Wirehaired Pointing Griffon'|'WIREHAIRED POINTING GRIFFON'|
'Wirehaired Vizsla'|'WIREHAIRED VIZSLA'|
'Xoloitzcuintli'|'XOLOITZCUINTLI'|
'Yorkshire Terrier'|'YORKSHIRE TERRIER');

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
GROUP_BLOCK_TYPE: GROUP_TYPE ' GROUP JUDGING';
fragment GROUP_TYPE
    : 'OWNER-HANDLED'|'VARIETY';
STANDALONE_COMMENT
    :   'LUNCH';  

BREED_COUNT  :  INT '-' INT '-' INT '-' INT;
JUDGE_NAME: {allowJudge}?(FRAG_TITLE WS FRAG_PROPER_NAME (' ' (PARENTHETICAL_NAME|FRAG_PROPER_NAME))+ (WS? PARENTHETICAL_INT?));

WS :(' ' |'\t' |'\n' |'\r' )+ -> channel(HIDDEN) ;  
    


PHONE_NUMBER
    :   (('1-800-')|('(' DIGIT DIGIT DIGIT')'))
        WS?
        (DIGIT DIGIT DIGIT '-' DIGIT DIGIT DIGIT DIGIT)
    ;
TIME    :   INT ':' INT WS FRAG_TIME_LABEL{allowBreed=true;};
FOLLOWING_TIME
	:	'minutes following Best in Show';

DATE    :   FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT {allowBreed=true;allowJudge=true;};
    
ELLIPSIS:   '.'+;

fragment DIGIT : '0'..'9';

INT :DIGIT+ ;

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