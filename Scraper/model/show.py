from bs4 import BeautifulSoup
import config
import datetime
import os
import re
import json
from showutils import urlopen_with_retry
from util import printv
import time

class Show(object):
    def __init__(self, code, club, locations, dates):
        self.code = code;
        self.clubs = set();
        self.addClub(club);
        self.locations = set();
        printv('initializing dates with ' + str(dates))
        self.dates = set();
        self.dates.add(dates)
        self.pdfLink = None;
        self._hasProgram = False;
        self.programName = None;
        self._city = None;
        self._state = None;
        self._parsedPath = None;
        self._pdfPath = None;
        self._cleanedPath = None;
        self._name = club;
        #self._parseShowPage();
    def toJson(self):
        #json.dumps(self.clubs);
        dateTimes=[int(time.mktime(d.timetuple())*1000) for d in self.dates]
        clubList = list()
        dateList = list()
        [clubList.append(c) for c in self.clubs]
        [dateList.append(d) for d in self.dates]
        return {'id':self.code, 'clubs':json.loads(json.dumps(clubList)), 'locations':str(self.locations), 'dates':json.loads(json.dumps(dateTimes))}
    def __str__(self):
        return "code:" + self.code + "\n\t, dates:"  + str(self.dates) + "\n\t, locations:"  + str(self.locations) + ', clubs:' + str(self.clubs);

    def addLocation(self, location):
        self.locations.add(location);
        
    def getDateList(self):
        dateList = list()
        time.mktime(datetime.datetime.now().timetuple()) * 1000
        [dateList.append(int(time.mktime(d.timetuple()) * 1000)) for d in self.dates]
        return dateList;
    def getClubList(self):
        clubList = list()
        [clubList.append({'Name':c, 'Id':0}) for c in self.clubs]
        return clubList;
    
    def addDate(self, date):
        printv('adding date ' + str(date));
        self.dates.add(date);
        printv('now dates has ' + str(len(self.dates)))

    def addClub(self, club):
        club = re.sub(" ?\(\d+\)", "", club);
        self.clubs.add(club);

    @property
    def parsedFilePath(self):
        return self._parsedPath

    @property
    def showCode(self):
        return self._programcode;

    @property
    def name(self):
        return self._name;

    @parsedFilePath.setter
    def parsedFilePath(self, value):
        self._parsedPath = value

    @property
    def pdfFilePath(self):
        return self._pdfPath

    @property
    def cleanedFilePath(self):
        return self._cleanedPath

    @cleanedFilePath.setter
    def cleanedFilePath(self, value):
        self._cleanedPath = value

    #Converts date string to millis
    @property
    def date(self):
        match = re.search("(?P<month>"+config.MONTH_REGEX+") (?P<day>\d+)[0-9-]*, (?P<year>\d{4})", self._date);
        date = match.group("month") + ' ' +match.group("day") + ' ' + match.group('year')
        return time.mktime(datetime.datetime.strptime(date, "%B %d %Y").timetuple())*1000
    @property
    def city(self):
        return self._city;
    @property
    def state(self):
        return self._state;

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
        return pretty;
    

    def _checkIfProgram(self, pool):
        notAvailable = pool.findAll(text="Judging Program Not Available");
        if notAvailable is None or len(notAvailable) is 0:
            results = pool.findAll('a', href=True, text='Judging Program (PDF Format)');
            if results:
                self.pdfLink = results[0]['href'];
                print("link is " + self.pdfLink);
                self.programName = re.search("(?P<name>[A-Z]+[0-9]\JP.pdf)", self.pdfLink).group('name')
                return True;
            else:
                print("died: " + str(results) + " " + self._pagelink)
                return False;
        else:
            False;
    
    def __eq__(self, other):
        return self.code == other.code;

    def __hash__(self):
        #This is not portable, or persistable, but it's fine for our case
        return hash(self.code);

