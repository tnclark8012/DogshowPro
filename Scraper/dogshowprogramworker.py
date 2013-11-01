from appserver_accessor import AppServerAccessor
import urllib
import sys, os, getopt, json
import config
import grammar
from parserunner import ParseRunner
from showscraper import ShowScraper
from ringcleaner import RingCleaner
import model.show
from showutils import urlopen_with_retry

class DogshowProgramWorker(object):

    def run(self, showLimit):
        #Pull closed shows listed on Onofrio * Yields URL list
        # For each URL:
        #   parse its page for details and a judging program * Yields Show object with PDF path link
        #   For each Show object:
        #       download PDF * Yields path
        #       Parse pdf w/ PDF-box * Yields parsed path
        #       TODO **Run cleaner to prepare for grammar * Yields cleaned path
        #       Run grammer * Yields JSON Object
        #       Parse pdf w/ pdf2txt * Yields parsed text (or path)
        #       Pull dict<Date, RingNumbersList> from text
        #       Dict keys must be ordered by date
        #       For each date in map 
        #           assign the same number of listed rings that date
        #           process make sure each ring was assigned. 
        #   Post show to server!
        self.scraper = ShowScraper()
        self._cleaner = RingCleaner();
        urlList = self.getClosedShowUrls();
        if showLimit:
            print('limit of ' + str(showLimit) + ' shows')
            urlList = urlList[:showLimit];
        showDetailList = list();
        for url in urlList:
            showDetail = self.getShowDetails(url);
            print(showDetail)
            showDetailList.append(showDetail);
            print("url: " + url)
        oldShowCount = len(showDetailList)
        showDetailList = set(showDetailList);
        duplicateShowCount =  oldShowCount - len(showDetailList);
        print("found " + str(duplicateShowCount) + " duplicate show entries")
        showJsonList = [self.collectShowJson(showDetail) for showDetail in showDetailList]
        showJsonList = [x for x in showJsonList if x is not None]
        #self.postShows(showJsonList);

    """
    Get a list of closed show page URLs
    returns: list of Urls
    """
    def getClosedShowUrls(self):
        print('********************')
        print('Get Closed Show Urls')
        print('********************')
        links = self.scraper.pullClosedShows();
        print('pulled ' + str(len(links)) + 'links');
        return links;

    """
    Get (scrape) a show detail object from a closed show page URL 
    returns: ShowDetail object
    """
    def getShowDetails(self, url):
        return self.scraper.pullShow(url);

    """
    Get the Show JSON from a ShowDetail object. Its PDF is downloaded, parsed, and has the grammar run
    """
    def collectShowJson(self, showDetail):
        pdfPath = self.downloadProgram(showDetail);
        if pdfPath:
            showJson = self.getShowJson(pdfPath);
            print(str("collected show JSON: ") + str(showJson is not None))
            if 'Rings' not in showJson:
                print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
                print("!!           ERROR                !!")
                print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
                print("Couldn't get JSON from " + pdfPath )
                print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
                return None;
            
            ringDates = self.getRingDates(pdfPath);
            print(str("collected ring dates: ") + str(ringDates is not None))
            if showJson and ringDates:
                return self.assignDates(showJson, ringDates);

    """
    Assigns dates to each ring in a show JSON object.
    returns: showJson with dates assigned.
    """
    def assignDates(self, showJson, ringDates):
        print("*******************")
        print("* Assigning dates *");
        print("*******************")
        ringsList = showJson['Rings'];
        numRings = len(ringsList)
        dates = list(ringDates.keys());
        print(str(dates))
        currentDateIndex = 0;
        currentDate = dates[currentDateIndex];
        currentDateNumRings = len(ringDates[currentDate])
        assignedRingsCurrentDate = 0;
        print("date list:           " + str(dates));
        print("numRings in JSON:    " + str(numRings))
        print("currentDate:         " + str(currentDate))
        print("currentDateNumRings: " + str(currentDateNumRings))

        # TODO 
        # [1,2,3,4,4,5] represents 6 judge changes
        # Condense ringDates[i] into a set so [1,2,3,4,4,4,5] -> [1,2,3,4,5]
        [dates[d]=set(dates[d]) for d in dates]
        # Then track the rings so that after each ring number has appeared, jump to the next day 
        
        print('not implemented!')
       
        sys.exit(0)
        for ringIndex in range(0, numRings):
            #If we have already assigned enough rings this date and we're not at a group ring, use the next date
            #TODO is it 'GROUP' or 'Group'?
            if not (assignedRingsCurrentDate < currentDateNumRings or 'GROUP' in ringsList[ringIndex]):
                print(str(currentDate) + 'has ' + str(currentDateNumRings) + ' rings.');
                currentDateIndex=currentDateIndex+1;
                currentDate = dates[currentDateIndex];
                currentDateNumRings = len(ringDates[currentDate]);
                assignedRingsCurrentDate = 0;
            #assign the current ring the current date
            ringsList[ringIndex]['Date'] = currentDate;
            assignedRingsCurrentDate=assignedRingsCurrentDate+1;
        showJson = dict()
        showJson['Rings'] = ringsList;
        print("JSON")
        print("----")
        print(str(showJson))
        # start with first date.
        # assign first n rings that date.
        # assign date to group rings immediately following.
        # go to next date 
        return showJson;
    def getShowJson(self, pdfPath):
        return self._cleaner.parseShowJson(pdfPath);

    def getRingDates(self, pdfPath):
        return self._cleaner.collectRingDates(pdfPath);
    
    def postShows(self, showList):
        for show in showList:
            self.postShow(show);

    def postShow(self, show):
        url = config.AppServer.SHOW_POST_URL
        
        values = show.toJson();#{'id':show.code, 'clubs':str(show.clubs), 'locations':str(locations) 'date':int(show.dates[0])}
        locationList = list();
        [locationList.append(l.toJson()) for l in show.locations];
        print(json.loads(json.dumps(locationList)))
        print(show.getDateList())
        print(str(values));
        values = {'code':show.code, 'locations':json.loads(json.dumps(locationList)), 'clubs':show.getClubList(), 'show':values, 'dates':show.getDateList()}
        #values = {'city': 'Columbiana', 'date': 1365138000.0, 'name': 'Northeast Oklahoma Kennel Club', 'state': 'AL'}
        response = urlopen_with_retry(url, values)

        #response = urlopen_with_retry(url, data.encode('utf8'))
        the_page = response.read()
        print(the_page);

    def downloadPrograms(self, shows):
        for show in shows:
            print("Show code: " + show.code)
            show.downloadProgram()
        return shows

    """
    Downloads the judging program for a show, if it exists.
    returns: downloaded PDF path
    """
    def downloadProgram(self, show):
        print("setting pdf path...")
        pdfPath = config.Pdf.DOWNLOAD_DIR+show.code+".pdf";
        print("pdf path is " + pdfPath)
        if not config.Env.OFFLINE and config.Env.DO_DOWNLOAD:
            if  os.path.isfile(pdfPath):
                print("Skipping... file already downloaded");
                return pdfPath;
            pdfName = show.code;         
            print("*** Downloading ***" + config.Onofrio.pdfUrl(show.pdfLink));
            (filename, headers) = urllib.request.urlretrieve(config.Onofrio.pdfUrl(show.pdfLink),pdfPath)
            f = open(filename)
            f.close();
            pdfPath = filename
            print("pdf path: " + pdfPath)
            if config.Env.VERBOSE:
                print(filename)
            return pdfPath;
        else:
            print("Did not download program!")
            print("Does it exist? " + str(os.path.isfile(pdfPath)))
            if os.path.isfile(pdfPath):
                print("program exists at: " + pdfPath)
                return pdfPath;
            return False; 

    def scrapeAndDownload(self):
        print("scrape and download");
        scraper = ShowScraper(False, False);
        print("pulling shows...");
        allshows = scraper.getAllShows()
        print("posting shows...");

        shows = scraper.getUniqueShows()
        print("downloading " + str(len(shows)) + " programs...")
        downloadPrograms(shows)
        
        prevLink = None;
        uniqueShowList = list();
        for show in shows:
            if show.programName is not prevLink:
                uniqueShowList.append(show);
                prevLink = show.programName;
            else:
                uniqueShows[-1:].dateList.append(show.date);
        for show in uniqueShowList:
            print( str(show.programName) + " lasts " + str(len(show.dateList)) + " days" );
        return (allshows, shows);

    def doParseAndClean(self, show):
        runner = ParseRunner()
        runner.parseProgram(show);

    def doPostShows(self, showList):
        pass;
        #accessor = AppServerAccessor()
        #accessor.postShow()