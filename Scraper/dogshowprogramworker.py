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
from util import printv, printd;

class DogshowProgramWorker(object):
    def __init__(self):
        self.scraper = ShowScraper()
        self._cleaner = RingCleaner();
    def run(self, showLimit, scrapeLimit):
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
        
        urlList = self.getClosedShowUrls();
        if scrapeLimit is not None:
            printv("scrape link limit: " + str(scrapeLimit));
        if showLimit:
            printv('limit of ' + str(showLimit) + ' shows')
            urlList = urlList[:scrapeLimit];
        showDetailList = list();
        for url in urlList:
            showDetail = self.getShowDetails(url);
            if showDetail.code is None:
                printv("No program currently available for " + str(url));
            else:
                showDetailList.append(showDetail);
                printv("url: " + url)
        oldShowCount = len(showDetailList)
        showDetailList = set(showDetailList);
        duplicateShowCount =  oldShowCount - len(showDetailList);
        printv("found " + str(duplicateShowCount) + " duplicate show entries")
        if len(showDetailList) > showLimit:
            showDetailList = list(showDetailList)[:showLimit];
        showJsonList = [self.collectShowJson(showDetail) for showDetail in showDetailList]
        showJsonList = [x for x in showJsonList if x is not None]
        #self.postShows(showJsonList);

    """
    Dumps JSON to file 
    """
    def dumpJson(self, data, filename):
        filepath = config.AppServer.DUMP_DIR + filename;
        

    """
    Get a list of closed show page URLs
    returns: list of Urls
    """
    def getClosedShowUrls(self):
        printv('********************')
        printv('Get Closed Show Urls')
        printv('********************')
        links = self.scraper.pullClosedShows();
        printv('pulled ' + str(len(links)) + ' links');
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
        return generateJson(pdfPath);
        
    def generateJson(self, pdfPath):
        if pdfPath:
            showJson = self.getShowJson(pdfPath);
            printv(str("collected show JSON: ") + str(showJson is not None))
            if 'Rings' not in showJson:
                printv("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
                printv("!!           ERROR                !!")
                printv("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
                printv("Couldn't get JSON from " + pdfPath )
                printv("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
                return None;
            
            ringDates = self.getRingDates(pdfPath);
            printv(str("collected ring dates: ") + str(ringDates is not None))
            if showJson and ringDates:
                return self.assignDates(showJson, ringDates);
    """
    Assigns dates to each ring in a show JSON object.
    returns: showJson with dates assigned.
    """
    def assignDates(self, showJson, ringDates):
        printd("*******************")
        printd("* Assigning dates *");
        printd("*******************")
        ringsList = showJson['Rings'];
        numRings = len(ringsList)
        dates = list(ringDates.keys());
        printd(str(dates))
        currentDateIndex = 0;
        currentDate = dates[currentDateIndex];
        currentDateNumRings = len(ringDates[currentDate])
        assignedRingsCurrentDate = 0;
        printd("date list:           " + str(dates));
        printv("numRings in JSON:    " + str(numRings))
        printv("currentDate:         " + str(currentDate))
        printv("currentDateNumRings: " + str(currentDateNumRings))

        # TODO 
        # [1,2,3,4,4,5] represents 6 judge changes
        # Start with the first judge. Verify this ring appears in the list.
        # Each time the judge changes remove the ring for which he is judging.

        # Then track the rings so that after each ring number has appeared, jump to the next day 

        printv('not implemented!')
        currentJudge = (None, None);
        previousJudge = (None, None); 
        judgeRingCount = 0;
        currentDateRingNumbers = ringDates[currentDate];
        printv('*******************')
        printv(str(currentDate))
        printv('*******************')
        groupsAppeared = False;
        for i in range(0, numRings):
            if "Number" not in ringsList[i]:
                groupsAppeared = True;
            else:
                previousJudge = currentJudge;
                printv('current ring: ' + str(ringsList[i]))
                currentJudge = (ringsList[i]["Judge"], ringsList[i]["Number"]);
                if currentJudge != previousJudge or groupsAppeared:
                    if groupsAppeared:
                        groupsAppeared = False;
                    printv('RING ' + str(previousJudge[1]) + ' : ' + str(previousJudge[0]) + ' judges ' + str(judgeRingCount) + ' rings.');
                    judgeRingCount = 0;
                    printv("current: " + str(currentJudge) + " previous: " + str(previousJudge))
                    #remove ring number from list
                    if previousJudge[1] is not None:
                        #printv("Removing ring number: " + str(previousJudge[1]) + '. From ' + str(currentDateRingNumbers))
                        currentDateRingNumbers.remove(previousJudge[1])
                        printv('remaining: ' + str(ringDates[currentDate]))
                    if not currentDateRingNumbers:#list is empty
                        currentDateIndex += 1
                        currentDate = dates[currentDateIndex]
                        printv('*******************')
                        printv(str(currentDate))
                        printv('*******************')
                        currentDateRingNumbers = ringDates[currentDate]
                judgeRingCount += 1;
            ringsList[i]["Date"] = currentDate;


        #printv(str(ringsList))
        self.dumpJson(showJson,'ANOK1JP');
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
        printv(json.loads(json.dumps(locationList)))
        printv(show.getDateList())
        printv(str(values));
        values = {'code':show.code, 'locations':json.loads(json.dumps(locationList)), 'clubs':show.getClubList(), 'show':values, 'dates':show.getDateList()}
        #values = {'city': 'Columbiana', 'date': 1365138000.0, 'name': 'Northeast Oklahoma Kennel Club', 'state': 'AL'}
        response = urlopen_with_retry(url, values)

        #response = urlopen_with_retry(url, data.encode('utf8'))
        the_page = response.read()
        printv(the_page);

    def downloadPrograms(self, shows):
        for show in shows:
            printv("Show code: " + show.code)
            show.downloadProgram()
        return shows

    """
    Downloads the judging program for a show, if it exists.
    returns: downloaded PDF path
    """
    def downloadProgram(self, show):
        printv("setting pdf path...")
        pdfPath = config.Pdf.DOWNLOAD_DIR+show.code+".pdf";
        printv("pdf path is " + pdfPath)
        if not config.Env.OFFLINE and config.Env.DO_DOWNLOAD:
            if  os.path.isfile(pdfPath):
                printv("Skipping... file already downloaded");
                return pdfPath;
            pdfName = show.code;         
            printv("*** Downloading ***" + config.Onofrio.pdfUrl(show.pdfLink));
            (filename, headers) = urllib.request.urlretrieve(config.Onofrio.pdfUrl(show.pdfLink),pdfPath)
            f = open(filename)
            f.close();
            pdfPath = filename
            printv("pdf path: " + pdfPath)
            printv(filename)
            return pdfPath;
        else:
            printv("Did not download program!")
            printv("Does it exist? " + str(os.path.isfile(pdfPath)))
            if os.path.isfile(pdfPath):
                printv("program exists at: " + pdfPath)
                return pdfPath;
            return False; 

    def scrapeAndDownload(self):
        printv("scrape and download");
        scraper = ShowScraper(False, False);
        printv("pulling shows...");
        allshows = scraper.getAllShows()
        printv("posting shows...");

        shows = scraper.getUniqueShows()
        printv("downloading " + str(len(shows)) + " programs...")
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
            printv( str(show.programName) + " lasts " + str(len(show.dateList)) + " days" );
        return (allshows, shows);

    def doParseAndClean(self, show):
        runner = ParseRunner()
        runner.parseProgram(show);

    def doPostShows(self, showList):
        pass;
        #accessor = AppServerAccessor()
        #accessor.postShow()