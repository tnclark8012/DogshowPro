grammar dogshowcombo;

start	:	ring+ EOF;
ring	:	RING_TITLE judge_block+;

judge_block
	:	JUDGE timeblock+;
timeblock
	:	TIME (BREED_RING|JUNIOR_RING)+ EOF;
//junior_ring	:	JUNIOR_RING+ EOF;
	
//test_breed_ring:	BREED_RING;
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
fragment FRAG_BREED_NAME
	:	(FRAG_BREED_NAME_SINGLE|FRAG_BREED_NAME_PLURAL);
fragment FRAG_BREED_NAME_PLURAL
	:	((FRAG_BREED_NAME_SINGLE|FRAG_BREED_NAME_ALT) 's');
fragment FRAG_BREED_NAME_SUFFIX
	:	(' Sweepstakes Entries'|' Sweepstakes Entry'|' Veterans Sweepstakes Entries'|' Veterans'|' Dogs');//veteran dogs
fragment FRAG_BREED_NAME_ALT:	'Veteran';//used to handle BREED_RING with no breed count after
fragment FRAG_BREED_NAME_SINGLE
	:'Affenpinscher'|
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
	'Lakeland Terrier'|
	'Leonberger'|
	'Lhasa Apso'|
	'Löwchen'|
	'Maltese'|
	'Manchester Terrier'|
	'Mastiff'|
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
	'Yorkshire Terrier';
	
fragment FRAG_JUNIOR_CLASS
	:	'Master Class'|
		'Open Senior'|
		'Open Intermediate'|
		'Open Junior'|
		'Novice Senior'|
		'Novice Junior'|
		'Novice Itermediate';

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
fragment FRAG_RING		:	'RING'|'Ring';
fragment FRAG_SPEC_CHAR		:	','|'_'|'-'|';'|':'|'\'';

fragment FRAG_SPEC_WORD_CHAR
	:	'&';

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
	

		
		
JUDGE	:	FRAG_TITLE (WS WORD|PARENTHETICAL)+ WS PARENTHETICAL_INT;

WS :(' ' |'\t' |'\n' |'\r' )+ {$channel=HIDDEN;} ;

JUNIOR_RING:	INT WS FRAG_JUNIOR_CLASS;	
fragment BR 
	:	INT WS FRAG_BREED_NAME;
BREED_RING :	BR (BREED_COUNT)?;
	
	
RING_TITLE  :   'RING' WS INT;

	
fragment BREED_COUNT  :  ' ' INT '-' INT '-' INT '-' INT;
TIME    :   INT ':' INT WS? FRAG_TIME_LABEL;

DATE    :   FRAG_WEEK_DAY ',' WS FRAG_MONTH WS INT ',' WS INT;
	
ELLIPSIS:	'.' '.'+;
INT :'0'..'9' + ;
WORD  : ('a'..'z'|'A'..'Z'|FRAG_SPEC_CHAR|FRAG_SPEC_WORD_CHAR)+ END_PUNCTUATION?;


PARENTHETICAL
	:	FRAG_PAREN_LEFT ((WORD|INT) WS?)+ FRAG_PAREN_RIGHT;

PARENTHETICAL_INT
	:	'(' WS? '0'..'9'+ WS? ')';	
