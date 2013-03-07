grammar breed;

start	:	(COUNTDOWN|NUMBER)+ EOF;
countdown
	:	COUNTDOWN;
number	:	NUMBER;
COUNTDOWN
	: (NUMBER WS NUMBER WS NUMBER);
NUMBER	:	ONE|TWO|THREE;
fragment ONE
	:	'one';
fragment TWO
	:	'two';
fragment THREE
	:	'three';

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

