import config
import os
import urllib.request
import urllib.parse
import re
import string
import sys
import time
from datetime import datetime
from location import Location
from bs4 import BeautifulSoup
from model.show import Show
from model.companionshow import CompanionShow
from showutils import urlopen_with_retry
from util import ScrapeHelper, RegexPattern, RegexHelper, printv;
class ShowScraper(object):

    
    def __init__(self, offline=None, verbose=None ):
        self.OFFLINE = config.Env.OFFLINE;
        self.VERBOSE = config.Env.VERBOSE;
        self.DO_DOWNLOAD = config.Env.DO_DOWNLOAD;
        if offline:
            self.OFFLINE = offline;
        if verbose:
            self.VERBOSE = verbose;
        
        #self._allshows = self._pullShowsFromOnofrio()
        #self._uniqueshows = self._getUniqueShows();
    
    """
    Pulls a Show model object from a given show page
    """
    def pullShow(self, showPageUrl):
        #open page
        if self.OFFLINE:
            showPageUrl = config.Onofrio.LOCAL_PAGE 
        response = urlopen_with_retry(showPageUrl, None)
        page = response.read()
        pool = BeautifulSoup(page)
        if self._hasProgram:
            club = self._pullKennelClub(pool);
            if self.VERBOSE:
                print(club);
            date = self._parseStartDate(pool);
            location = self._parseLocation(pool);
            #self._hasProgram = self._checkIfProgram(pool);
            code = self._pullShowCode(pool);
            if self.VERBOSE:
                print('code:' + str(code));
            pdfLink = self._pullPdfLink(pool);
            if self.VERBOSE:
                print('pdf link: ' + str(pdfLink));
            show = Show(code, club, location, date);
            show.pdfLink = pdfLink;
            if config.Env.VERBOSE:
                print("************************************")
                print("*   finding companions to " + str(club) + "  *")
                print("************************************")
            companionShows = self._parseCompanionShows(pool);
            for c in companionShows:
                printv('found a companion')
                show.addLocation(c.location);
                show.addDate(c.date);
                show.addClub(c.club);
            return show;
        #self._parseCompanionShows(pool);

    def _parseLocation(self, pool):
        headings = pool.findAll('h2', attrs={'align':'CENTER'});
        raw = headings[0].findAll(text=True)[0];
        printv("Raw location: " + raw);
        match = re.search("(?P<city>.*) (?P<state>[A-Z][A-Z])", raw);
        pretty = match.group('city') + ", " + match.group('state')
        self._city = match.group('city')
        self._state = match.group('state')
        printv("Pretty location: " + pretty)
        return pretty;


    def _parseStartDate(self, pool): 
        headings = pool.findAll('h2', attrs={'align':'CENTER'});
        raw = headings[1].findAll(text=True)[0]
        printv("Raw date: " + raw);
        pretty = re.search("- (?P<date>("+config.MONTH_REGEX+") .*)", raw).group('date');
        printv("Pretty date: " + pretty)
        return datetime.strptime(raw, "%A - %B %d, %Y")


    def _hasProgram(self, pool):
        notAvailable = pool.findAll(text="Judging Program Not Available");
        if notAvailable:
            return False;
        else:
            return True;
 #       if notAvailable is None or len(notAvailable) is 0:
 #           results = pool.findAll('a', href=True, text='Judging Program (PDF Format)');
 #           if results:
 #               self._pdfLink = results[0]['href'];
 #               self.programName = re.search("(?P<name>[A-Z]+[0-9]\JP.pdf)", self._pdfLink).group('name')
 #               return True;
 #           else:
 #               print("died: " + str(results) + " " + self._pagelink)
 #               return False;
 #       else:
 #           False;

    def _parseCompanionShows(self, pool):
        descLine = pool.findAll('dl');
        if(descLine and len(descLine)>0):
            descLine = descLine[0];
        else:
            printv("show has no companions")
            return list();
        printv("descLine: " + str(descLine))
        clubNames=descLine.findAll('a',text=True);
        clubNames = [club.findAll(text=True)[0] for club in clubNames ]
        printv( "club names: " + str(clubNames))
        locationTimes=descLine.findAll('dd')
        printv( "locationTimes: " + str(locationTimes))
        locationDatePairs = lazsist();
        for locationTime in locationTimes:
            raw = locationTime.findAll(text=True)[0];
            printv("Raw date/location: " + str(raw));
            locationDatePair = RegexHelper().getLocationDate(raw); 
            locationDatePairs.append(locationDatePair);
            print("locationDatePairs: " + str(locationDatePairs))
        companionShows = list()
        for i in range(0,len(clubNames)):
            printv("i: " + str(i))
            printv("club: " + str(clubNames[i]));
            printv("pair one: " + str(locationDatePairs[i][1]));
            printv("pair zero: " + str(locationDatePairs[i][0]));
            companionShows.append(CompanionShow(clubNames[i], locationDatePairs[i][1], locationDatePairs[i][0]))
        return companionShows;

    """
    Gets a list of show page links from the closed show sites
    """
    def getClosedShowLinks(self):
        showLinks = list();
        return showLinks;

    """
    Gets the name of the kennel club from the show page
    """
    def _pullKennelClub(self, pool):
        results = pool.findAll('h1', attrs={'align':'CENTER'});
        if results:
            return results[0].findAll(text=True)[0];
        #sys.exit(2)
        #link = anchor['href']
        #return ScrapeHelper.pullAnchorText(link, RegexHelper.getPattern(RegexPattern.KENNEL_CLUB));

    def _pullShowCode(self, pool):
        #print("_pullShowCode not implemented")
        #sys.exit(1);
        notAvailable = pool.findAll(text="Judging Program Not Available");
        if notAvailable is None or len(notAvailable) is 0:
            results = pool.findAll('a', href=True, text='Judging Program (PDF Format)');
            if results:
                printv('_pullShowCode found the program anchor');
                self.pdfLink = results[0]['href'];
                code = re.search("(?P<name>(?P<code>[A-Z]+[0-9])\JP.pdf)", self.pdfLink).group('code')
                return code;
            else:
                print("died: " + str(results) + " " + self._pagelink)
                return None;
        else:
            print('show code not available')
            None;

    def _pullPdfLink(self, pool):
        #print("_pullShowCode not implemented")
        #sys.exit(1);
        notAvailable = pool.findAll(text="Judging Program Not Available");
        if notAvailable is None or len(notAvailable) is 0:
            results = pool.findAll('a', href=True, text='Judging Program (PDF Format)');
            if results:
                return results[0]['href'];

    def pullClosedShows(self):
        url = config.Onofrio.CLOSED_SHOWS
        if config.Env.OFFLINE:
            url = config.Onofrio.LOCAL_CLOSED;
        response = urlopen_with_retry(url, None);

        the_page = response.read()
        pool = BeautifulSoup(the_page)

        anchors = pool.findAll('a', href=True, target=True)
        showPages = list();
        for anchor in anchors:
            link = anchor['href']
            showPages.append(link);
        showPages = [config.Onofrio.BASE_URL + link for link in showPages]
        return showPages;
            
    def _getUniqueShows(self):
        uniqueShows = list();
        prevProgram = None;
        for show in self._allshows:
            if show.programName is not None and show.programName != prevProgram: 
                uniqueShows.append(show);
                prevProgram = show.programName
            else:
                if show._hasProgram:
                    if show.programName is None and self.VERBOSE :
                        print("program but no name in " + show._pagelink)
                    elif self.VERBOSE:
                        print("duplicate: " + show.programName)

        return uniqueShows;

    def getAllShows(self):
        return self._allshows;
    def getUniqueShows(self):
        return self._uniqueshows;


