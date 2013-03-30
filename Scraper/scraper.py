import config
import os
import urllib.request
import urllib.parse
import re
import string
import sys
import time
from bs4 import BeautifulSoup
from show import Show
from showutils import urlopen_with_retry

class ShowScraper(object):

    
    def __init__(self, offline, verbose ):
        self.VERBOSE = verbose;
        self.OFFLINE = offline;
        self.DO_DOWNLOAD = config.DO_DOWNLOAD;
        self._allshows = self._pullShowsFromOnofrio()
        self._uniqueshows = self._getUniqueShows();
    
   
    def _getAnchorText(self, anchor):
        found = anchor.findAll(text=True);
        if found:
            return found[0];

    def _pullKennelClub(self, anchor):
        text = self._getAnchorText(anchor);
        if text is None:
            return text;
        clubPattern = "([a-zA-Z-]+(?: [a-zA-Z-,]+)*)";
        match = re.search(clubPattern, text);
        if match:
            return str(match.group());

    def _pullShowCode(self, link):
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


