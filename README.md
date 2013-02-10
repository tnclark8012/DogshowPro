dogshow
=======

Dogshow

This is a repository for a mobile application for dog show handlers and fans alike. The system will consists of 3 parts:

1. Judging Program Parser
2. Application Server
3. Mobile Application


Judging Program Parser
----------------------
The parser is built with a combined lexer/parser in ANTLR and Apache PDFBox. A need for grammar parsing arises because the judging programs are currently only availble in PDF format. Therefore text must be extracted and then transformed into a managable form.
Ideally, I would like to be able to convert from text immediately to JSON.


Application Server
------------------
Serves primarily API Access point for the mobile application. In addition to serving requests it is also in charge of pulling new judging programs and storing them as needed.



Mobile Application
------------------
This is where all the dirty work in 1 and 2 payoff. The mobile application allows show patrons to manage their own entered dogs, estimate ring times, and schedule upcoming shows.



Big project, but should be smooth sailing once the grammar is complete
