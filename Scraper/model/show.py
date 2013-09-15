from bs4 import BeautifulSoup
import config
import datetime
import os
import re
from showutils import urlopen_with_retry
import time

class Show(object):
    VERBOSE = False;
    
    def __init__(self, code, club, locations, dates):
        self.code = code;
        self.clubs = set();
        self.clubs.add(club);
        self.locations = set();
        self.dates = set();
        self.pdfLink = None;
        self._hasProgram = False;
        self.programName = None;
        self_city = None;
        self._state = None;
        self._parsedPath = None;
        self._pdfPath = None;
        self._cleanedPath = None;
        #self._parseShowPage();
    def toJson(self):
        dateTimes=[int(time.mktime(d.timetuple())*1000) for d in self.dates]
        return {'id':self.code, 'clubs':str(self.clubs), 'locations':str(self.locations), 'dates':str(dateTimes)}
    def __str__(self):
        return str(self.clubs) + "\n\t, dates:"  + str(self.dates) + "\n\t, locations:"  + str(self.locations);

    def addLocation(self, location):
        self.locations.add(location);
        
    
    def addDate(self, date):
        self.dates.add(date);

    def addClub(self, club):
        self.clubs.add(club);

    @property
    def parsedFilePath(self):
        return self._parsedPath

    @property
    def showCode(self):
        return self._programcode;

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
                self.pdfLink = results[0]['href'];
                print("link is " + self.pdfLink);
                self.programName = re.search("(?P<name>[A-Z]+[0-9]\JP.pdf)", self.pdfLink).group('name')
                return True;
            else:
                print("died: " + str(results) + " " + self._pagelink)
                return False;
        else:
            False;
       



