from bs4 import BeautifulSoup
import config
import datetime
import os
import re
from showutils import urlopen_with_retry
import time
import urllib.request
import urllib.parse

class Show(object):
    VERBOSE = False;
    OFFLINE = False;
    DO_DOWNLOAD = True;
    
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
        self._parsedPath = None;
        self._pdfPath = None;
        self._cleanedPath = None;
        self._parseShowPage();
        
    def __str__(self):
        return(self._club
            + "\n\t"  + self._date
            + "\n\t"  + self._location 
            + "\n\t" + "page link:" + self._pagelink 
            + "\n\t program code: " + self._programcode
            + "\n\t pdf link: " + self.programName
            + "\n\t PDF Path: " + str(self._pdfPath) + ' or ' + str(self.pdfFilePath)  );

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




    def downloadProgram(self):
        print("setting pdf path...")
        self._pdfPath = config.Pdf.DOWNLOAD_DIR+self.programName
        print("pdf path is " + self._pdfPath)
        if not config.Env.OFFLINE and config.Env.DO_DOWNLOAD and self._hasProgram:
            if not self._pdfLink:
                print("download died: " + self._pagelink)
                return False;
            #self._programcode = "PPTO1";
            pdfName = self.programName; 
            url = config.Onofrio.pdfUrl(self._pdfLink)            
            print("*** Downloading ***" + url);
            (filename, headers) = urllib.request.urlretrieve(url, path)
            f = open(filename)
            f.close();
            self._pdfPath = filename
            print("pdf path: " + self._pdfPath)
            if config.Env.VERBOSE:
                print(filename)
            return True;
        else:
            print("Did not download program!")
            return False; 