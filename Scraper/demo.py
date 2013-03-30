import os
import urllib.request
import urllib.parse
import re
import string
import sys
import time
import datetime
from bs4 import BeautifulSoup
from retry_decorator import retry

VERBOSE = False;
OFFLINE = False;
DO_DOWNLOAD = False;
baseUrl = "http://www.onofrio.com"
closedShowsPage = baseUrl + "/execpgm/index?index=JP";
baseJP = baseUrl + "/jp";
month_regex = "January|February|March|April|May|June|July|August|September|October|November|December";

@retry(urllib.error, tries=4, delay=3, backoff=2)
def urlopen_with_retry(url, values):
    data = None
    if values is not None:
        data = urllib.parse.urlencode(values)
        data = data.encode('utf-8') # data should be bytes
    req = urllib.request.Request(url, data)
    return urllib.request.urlopen(req)

def postShow(show):
    url = "http://localhost:8888/rest/shows/test"
    
    values = {'name':show._club,  'date':int(show.date), 'city':show.city, 'state':show.state}
    #values = {'city': 'Columbiana', 'date': 1365138000.0, 'name': 'Northeast Oklahoma Kennel Club', 'state': 'AL'}
    print(str(values));
    response = urlopen_with_retry(url, values)

    #response = urlopen_with_retry(url, data.encode('utf8'))
    the_page = response.read()
    print("response page: " + str(the_page))


class Show(object):
    
    def __init__(self, club, pageLink, programcode):
        self._club = club;
        self._pagelink = pageLink;
        self._programcode = programcode;
        self._location = None;
        self._date = None;
        self._hasProgram = False;
        self._pdfLink = None;
        self.programName = None;
        self_city = None;
        self._state = None;
        self._parseShowPage();
        
    def __str__(self):
        return(self._club
            + "\n\t"  + self._date
            + "\n\t"  + self._location 
            + "\n\t" + "page link:" + self._pagelink 
            + "\n\t program code: " + self._programcode);

    @property
    def date(self):
        print(self._date)
        match = re.search("(?P<month>"+month_regex+") (?P<day>\d+)[0-9-]*, (?P<year>\d{4})", self._date);
        date = match.group("month") + ' ' +match.group("day") + ' ' + match.group('year')
        return time.mktime(datetime.datetime.strptime(date, "%B %d %Y").timetuple())
    @property
    def city(self):
        return self._city;
    @property
    def state(self):
        return self._state;

    def _parseLocation(self, pool):
        headings = pool.findAll('h2', attrs={'align':'CENTER'});
        raw = headings[0].findAll(text=True)[0];
        if VERBOSE:
            print("Raw location: " + raw);
        match = re.search("(?P<city>.*) (?P<state>[A-Z][A-Z])", raw);
        pretty = match.group('city') + ", " + match.group('state')
        self._city = match.group('city')
        self._state = match.group('state')
        if VERBOSE:
            print("Pretty location: " + pretty)
        return pretty;
    def _parseStartDate(self, pool): 
        headings = pool.findAll('h2', attrs={'align':'CENTER'});
        raw = headings[1].findAll(text=True)[0]
        if VERBOSE:
            print("Raw date: " + raw);
        pretty = re.search("- (?P<date>("+month_regex+") .*)", raw).group('date');
        if VERBOSE:
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
       
    def _parseShowPage(self):
        if VERBOSE:
            print("Searching " + self._pagelink)
        if OFFLINE:
            self._pagelink = 'file:///C|/Users/Taylor/workspace/Python/scrapping/local/showpage.htm'
        response = urlopen_with_retry(self._pagelink, None)
        the_page = response.read()
        pool = BeautifulSoup(the_page)
        self._date = self._parseStartDate(pool);
        self._location = self._parseLocation(pool);
        self._hasProgram = self._checkIfProgram(pool);

    def downloadProgram(self):
        if not OFFLINE and DO_DOWNLOAD and self._hasProgram:
            if not self._pdfLink:
                print("download died: " + self._pagelink)
                return False;
            #self._programcode = "PPTO1";
            pdfName = self.programName; 
            url = baseUrl + self._pdfLink;
            path = os.getcwd() + "/programs/"+pdfName;
            
            print("*** Downloading ***" + url);
            (filename, headers) = urllib.request.urlretrieve(url, path)
            f = open(filename)
            f.close();
            if VERBOSE:
                print(filename)
            return True;
        else:
            return False;    

def getAnchorText(anchor):
    found = anchor.findAll(text=True);
    if found:
        return found[0];

def pullKennelClub(anchor):
    text = getAnchorText(anchor);
    if text is None:
        return text;
    clubPattern = "([a-zA-Z-]+(?: [a-zA-Z-,]+)*)";
    match = re.search(clubPattern, text);
    if match:
        return str(match.group());

def pullShowCode(link):
    codePattern = "=(?P<link>[a-zA-Z]+[0-9])";
    match = re.search(codePattern, link);
    if match:
        return str(match.group('link'));


user_agent = 'Mozilla/5 (Solaris 10) Gecko'
headers = { 'User-Agent' : user_agent }

def pullShowsFromOnofrio():
    values = {'s' : sys.argv[0] }
    data = urllib.parse.urlencode(values)
    global closedShowsPage
    if OFFLINE:
        closedShowsPage = 'file:///C|/Users/Taylor/workspace/Python/scrapping/local/closedshows.htm'
    response = urlopen_with_retry(closedShowsPage, None);

    the_page = response.read()
    pool = BeautifulSoup(the_page)

    anchors = pool.findAll('a', href=True)
    shows = list();
    for anchor in anchors:
        link = anchor['href']
        club = pullKennelClub(anchor);
        code = pullShowCode(link)
        if club and code:
            show = Show(club, baseUrl+link, code)
            shows.append(show)
            #print(show);
    yes = 0
    no = 0;
    programs = list();
    uniqueShows = list();
    for show in shows:
        if show.programName is not None and show.programName not in programs: 
            if show.downloadProgram():
                yes = yes + 1;
            else:
                no = no + 1;
            programs.append(show.programName);
        else:
            no = no + 1;
            if show._hasProgram:
                if show.programName is None:
                    print("program but no name in " + show._pagelink)
                else:
                    print("duplicate: " + show.programName)

    total = yes + no
    print(str(yes) + " of " + str(total) + " shows have programs")
    return shows;
def main():
    print("Pulling...")
    shows = pullShowsFromOnofrio()
    prevClub = None
    for show in shows:
        if show._club != prevClub:
            postShow(show);
            print("new club " + show._club + " is not " + str(prevClub));
            prevClub = show._club
        else:
            print("duplicate club: "  + prevClub)
main()