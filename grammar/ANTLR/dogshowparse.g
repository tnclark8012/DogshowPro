parser grammar dogshowparse;
options { tokenVocab=dogshowlex; }
@members{
String show = "";
@Override
	public void reportError(RecognitionException e){
		System.err.println( "Syntax: " + e.token.getLine() + ", " + e.token.getText() );
	}
	}

test_special:	special_ring+;
test_breed
	:	breed_ring+;
start	:	comment ring EOF;
ring	:	RING_TITLE judge_block+;

judge_block
	:	JUDGE_NAME timeblock+;

comment	:	(TIME|COMMENT|INT|JUDGE_NAME|DATE|PHONE_NUMBER|ELLIPSIS)+;

timeblock
	:	TIME ((breed_ring|special_ring|junior_ring)=>(comment? breed_ring|special_ring|junior_ring))+;
special_ring:   INT BREED_NAME SPECIAL_SUFFIX+;
junior_ring:	INT JUNIOR_CLASS;
breed_ring
	:	INT BREED_NAME BREED_NAME_SUFFIX? BREED_COUNT?;
breed_name
	:	BREED_NAME BREED_NAME_SUFFIX;




//junior_ring	:	JUNIOR_RING+ EOF;
	
//test_breed_ring:	BREED_RING;