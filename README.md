Dog Show Pro

This is a repository for a mobile application for dog show handlers. The app allows handlers to manage their assignments, ring times, and conflicts. Simply add your dogs to the app, enter the show, then sit back as Dog Show Pro provides you with your schedule for the day, and accurate ring-time estimates to help manage your day!

Overall the system consists of 3 parts:

1. Judging Program Parser
2. Application Server
3. Mobile Application


Judging Program Parser
----------------------
The parser is built with a combined lexer/parser in ANTLR4. A need for grammar parsing arises because the judging programs are currently only availble in PDF format. Therefore text must be extracted and then transformed into a managable form. Unfortunately, the programs are often very different from show to show, so a robust grammar is required. This code was recently moved into the Visual Studio Online repository that contains the App Server as well. Currently only judging programs for Onofrio.com shows are available. Once GA'd, I'll look into other superintendents.


Application Server
------------------
Webserver built on Azure. Serves primarily API Access point for the mobile application. Azure WebJobs pull judging programs from Onofrio periodically, parse them, and post new shows to the server.This integration was what prompted the move of the parser from Java (and GitHub) to C#.



Mobile Application
------------------
This is where all the dirty work in 1 and 2 payoff. The mobile application allows show patrons to manage their own entered dogs, estimate ring times, and schedule upcoming shows.


Currently Dog Show Pro is in beta with Stellar Kennels being the pilot kennel.
