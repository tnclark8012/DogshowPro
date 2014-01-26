/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar dogshowGrammar;
start:(club|dog_group|ring_title|group_ring_title|comment)+;
dog_group:GROUP_RING;
club:CLUB;
comment:CAT|GROUP|GROUP_RING|RING|INT|WORD;
ring_title:RING INT;
group_ring_title: GROUP RING;
GROUP_RING: CAT WS GROUP;
CLUB:CAT WS CLUBNAME;
CLUBNAME:'CLUB';
CAT: 'TOY';
GROUP: 'GROUP';
RING: 'RING';
INT:'0'..'9'+;
WORD:'A'..'Z'+;
WS :(' ' |'\t' |'\n' |'\r' )+ ->channel(HIDDEN);  