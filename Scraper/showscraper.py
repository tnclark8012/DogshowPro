import config
import os
import urllib.request
import urllib.parse
import re
import string
import sys
import time
from bs4 import BeautifulSoup
from model.show import Show
from showutils import urlopen_with_retry
from util import ScrapeHelper, RegexPattern, RegexHelper
class ShowScraper(object):

    
    def __init__(self, offline, verbose ):
        self.VERBOSE = verbose;
        self.OFFLINE = offline;
        self.DO_DOWNLOAD = config.Env.DO_DOWNLOAD;
        #self._allshows = self._pullShowsFromOnofrio()
        #self._uniqueshows = self._getUniqueShows();
    
    """
    Pulls a Show model object from a given show page
    """
    def pullShow(self, showPageUrl):
        #open page
        if self.VERBOSE:
            print("Searching " + showPageUrl)
        if config.Env.OFFLINE:
            showPageUrl = config.Onofrio.LOCAL_PAGE 
        response = urlopen_with_retry(showPageUrl, None)
        page = response.read()
        pool = BeautifulSoup(page)
        club = None;
        date = self._parseStartDate(pool);
        location = self._parseLocation(pool);
        self._hasProgram = self._checkIfProgram(pool);
        showaaa = Show(club, location, date);
        print("Show: " + str(showaaa));
        self._parseCompanionShows(pool);
        pass;

    def _parseLocation(self, pool):
        headings = pool.findAll('h2', attrs={'align':'CENTER'});
        raw = headings[0].findAll(text=True)[0];
        if config.Env.VERBOSE:
            print("Raw location: " + raw);
        match = re.search("(?P<city>.*) (?P<state>[A-Z][A-Z])", raw);
        pretty = match.group('city') + ", " + match.group('state')
        self._city = match.group('city')
        self._state = match.group('state')
        if config.Env.VERBOSE:
            print("Pretty location: " + pretty)
        return pretty;


    def _parseStartDate(self, pool): 
        headings = pool.findAll('h2', attrs={'align':'CENTER'});
        raw = headings[1].findAll(text=True)[0]
        if config.Env.VERBOSE:
            print("Raw date: " + raw);
        pretty = re.search("- (?P<date>("+config.MONTH_REGEX+") .*)", raw).group('date');
        if config.Env.VERBOSE:
            print("Pretty date: " + pretty)
        return pretty;


    def _checkIfProgram(self, pool):
        notAvailable = pool.findAll(text="Judging Program Not Available");
        if notAvailable is None or len(notAvailable) is 0:
            results = pool.findAll('a', href=True, text='Judging Program (PDF Format)');
            if results:
                self._pdfLink = results[0]['href'];
                self.programName = re.search("(?P<name>[A-Z]+[0-9]\JP.pdf)", self._pdfLink).group('name')
                return True;
            else:
                print("died: " + str(results) + " " + self._pagelink)
                return False;
        else:
            False;

    def _parseCompanionShows(self, pool):
        descLine = pool.findAll('dl')[0];
        clubNames=descLine.findAll('dt',text=True);
        locationTimes=descLine.findAll('dd',text=True)
        for locationTime in locationTimes:
            raw = locationTime.findAll(text=True)[0];
            if config.Env.VERBOSE:
                print("Raw date: " + str(raw));
            pretty = "";#re.search("- (?P<date>("+config.MONTH_REGEX+") .*)", raw).group('date');
            RegexHelper().getDateLocation(raw);
            if config.Env.VERBOSE:
                print("Pretty date: " + pretty)
        return pretty;

    """
    Gets a list of show page links from the closed show sites
    """
    def getClosedShowLinks(self):
        showLinks = list();
        return showLinks;

    """
    Gets the name of the kennel club from the show page
    """
    def _pullKennelClub(self, anchor):
        link = anchor['href']
        return ScrapeHelper.pullAnchorText(link, RegexHelper.getPattern(RegexPattern.KENNEL_CLUB));

    def _pullShowCode(self, link):
        print("_pullShowCode not implemented")
        sys.exit(1);
        codePattern = "=(?P<link>[a-zA-Z]+[0-9])";
        match = re.search(codePattern, link);
        if match:
            return str(match.group('link'));

    def _pullShowsFromOnofrio(self):
        values = {'s' : sys.argv[0] }
        data = urllib.parse.urlencode(values)
        url = config.Onofrio.CLOSED_SHOWS
        if self.OFFLINE:
            url = config.Onofrio.LOCAL_CLOSED;
        response = urlopen_with_retry(url, None);

        the_page = response.read()
        pool = BeautifulSoup(the_page)

        anchors = pool.findAll('a', href=True)
        shows = list();
        for anchor in anchors:
            link = anchor['href']
            club = self._pullKennelClub(anchor);
            code = self._pullShowCode(link)
            if club and code:
                show = Show(club, config.Onofrio.showPage(link), code)
                shows.append(show)
                #print(show);
        return shows;
            
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


