from appserver_accessor import AppServerAccessor
import urllib
import sys, getopt, json, os
import config
import grammar
from parserunner import ParseRunner
from showscraper import ShowScraper
from ringcleaner import RingCleaner
from dogshowprogramworker import DogshowProgramWorker
import model.show
from showutils import urlopen_with_retry
from util import printv, dumpJson


def postShow(show, parsedJson):
    url = config.AppServer.SHOW_POST_URL
    
    values = parsedJson#show.toJson();#{'id':show.code, 'clubs':str(show.clubs), 'locations':str(locations) 'date':int(show.dates[0])}
    locationList = list();
    [locationList.append(l.toJson()) for l in show.locations];
    printv(json.loads(json.dumps(locationList)))
    printv(show.getDateList())
    values = {'ShowId': show.code, 'Clubs':show.getClubList(), 'ShowName' : show.name, 'City' : locationList[0]['city'], 'State': locationList[0]['state'], 'StartDateMillis' : min(show.getDateList()), 'RingJson' : str(parsedJson)}
    values = json.loads(json.dumps(values))
    response = urlopen_with_retry(url, values)

    #response = urlopen_with_retry(url, data.encode('utf8'))
    the_page = response.text
    printv(the_page);

def postShows(shows):
    for show in shows:
        postShow(show)

def downloadPrograms(shows):
    for show in shows:
        printv("Show code: " + show.code)
        show.downloadProgram()
    return shows

def scrapeAndDownload():
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

def doParseAndClean(show):
    runner = ParseRunner()
    runner.parseProgram(show);
def doRunGrammar(show):

    printv("Running grammar")
    path = "./cleaned/KTDC1JP.txt"
    json = grammar.getShowJson(path);
    return json;

def doPostShows(showList):
    pass;
    #accessor = AppServerAccessor()
    #accessor.postShow()
def main(argv):
    from ringcleaner import RingCleaner
    try:
      opts, args = getopt.getopt(argv,"vfp:r:odt:",['limit=','download=','offline=', 'forceall=', 'output='])
    except getopt.GetoptError:
      print('option error. No options?');
      sys.exit(2)
    showLimit = None;
    outputfile = None;
    for opt, arg in opts:
      if opt == '--limit':
        printv('limit option of ' + arg)
        showLimit = int(arg);
      if opt == '--nodownload':
        config.Env.DO_DOWNLOAD = False;
      if opt == '--download':
        config.Env.DO_DOWNLOAD = arg=='true';
        printv('download: ' + str(config.Env.DO_DOWNLOAD))
      if opt == '--offline':
        config.Env.OFFLINE = arg=='true';
        printv('offline: ' + str(config.Env.OFFLINE))
      if opt =='--forceall':
        config.Env.FORCE_ALL = arg=='true';
        printv("forcing")
      if opt =='--output':
        outputfile = arg;
      if opt == '-v':
        config.Env.LOG_VERBOSE = True;
      if opt == '-d':
        config.Env.LOG_DEBUG = True;

        #http://www.onofrio.com/execpgm/wbshwpg?SHOW=LAND164052
    for opt, arg in opts:
      printv("opt: " + opt)
      if opt == '-r':
         if arg == 'showpage':
            printv('show page')
            show = ShowScraper(False).pullShow(requestedPage);
            if show:
                print(str(show))
                worker = DogshowProgramWorker();
                pdfPath = worker.downloadProgram(show);
                print("downloaded PDF: " + str(pdfPath))
                if pdfPath:
                    parsedJson = worker.generateJson(pdfPath);
                    print("posting show...");
                    postShow(show, parsedJson);


            sys.exit()
         else:
            printv("running on local pdfs");
            worker = DogshowProgramWorker();
            folder = config.Pdf.DOWNLOAD_DIR;
            for filename in os.listdir(folder):
                if os.path.splitext(filename)[1] == '.pdf' and arg in filename:
                    out = worker.generateJson(folder+filename);
                    dumpJson(config.AppServer.DUMP_DIR+filename, out);
         sys.exit()



      elif opt == '-t':
        if outputfile is None:
            print('No output file specified!')
            sys.exit();
        else:
            worker = DogshowProgramWorker();
            output = worker.generateJson(arg);
            dumpJson(outputfile, output)
      

      elif opt == '-p':
         requestedPage=arg
      
      elif opt == '-o':
        printv('offline')
      
      elif opt == '-f':
        (allshows, uniqueShows) = scrapeAndDownload();
        kansas = None
        for show in allshows:
            doParseAndClean(show);
            printv("programName: " + show.programName)
            if show.showCode == "KTDC1":
                printv("found KTDC1")
                json = doRunGrammar(show);
                AppServerAccessor().postShow(show, json)
            #doRunGrammar(show);
        #doParse()
        #shows = doRunGrammar()
if __name__ == "__main__":
   main(sys.argv[1:])

