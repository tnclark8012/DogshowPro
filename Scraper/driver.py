from appserver_accessor import AppServerAccessor
import urllib
import sys, getopt
import config
import grammar
from parserunner import ParseRunner
from showscraper import ShowScraper
import model.show
from showutils import urlopen_with_retry


def postShow(show):
    url = config.AppServer.SHOW_POST_URL
    
    values = show.toJson();#{'id':show.code, 'clubs':str(show.clubs), 'locations':str(locations) 'date':int(show.dates[0])}
    #values = {'city': 'Columbiana', 'date': 1365138000.0, 'name': 'Northeast Oklahoma Kennel Club', 'state': 'AL'}
    response = urlopen_with_retry(url, values)

    #response = urlopen_with_retry(url, data.encode('utf8'))
    the_page = response.read()

def postShows(shows):
    for show in shows:
        postShow(show)

def downloadPrograms(shows):
    for show in shows:
        print("Show code: " + show.code)
        show.downloadProgram()
    return shows

def downloadProgram(show):
    print("setting pdf path...")
    pdfPath = config.Pdf.DOWNLOAD_DIR+show.code+".pdf";
    print("pdf path is " + pdfPath)
    if not config.Env.OFFLINE and config.Env.DO_DOWNLOAD and show.pdfLink:
        pdfName = show.code;         
        print("*** Downloading ***" + show.pdfLink);
        (filename, headers) = urllib.request.urlretrieve(show.pdfLink,pdfPath)
        f = open(filename)
        f.close();
        pdfPath = filename
        print("pdf path: " + pdfPath)
        if config.Env.VERBOSE:
            print(filename)
        return True;
    else:
        print("Did not download program!")
        return False; 

def scrapeAndDownload():
    print("scrape and download");
    scraper = ShowScraper(False, False);
    print("pulling shows...");
    allshows = scraper.getAllShows()
    print("posting shows...");

    shows = scraper.getUniqueShows()
    print("downloading " + str(len(shows)) + " programs...")
    downloadPrograms(shows)
    return (allshows, shows);

def doParseAndClean(show):
    runner = ParseRunner()
    runner.parseProgram(show);
def doRunGrammar(show):

    print("Running grammar")
    path = "./cleaned/KTDC1JP.txt"
    json = grammar.getShowJson(path);
    return json;

def doPostShows(showList):
    pass;
    #accessor = AppServerAccessor()
    #accessor.postShow()
def main(argv):
    requestedPage=None;
    try:
      opts, args = getopt.getopt(argv,"fp:r:od:")
    except getopt.GetoptError:
      print('option error. No options?');
      sys.exit(2)
    for opt, arg in opts:
      print("opt: " + opt)
      if opt == '-r':
         if arg == 'showpage':
            print('show page')
            show = ShowScraper(False, True).pullShow(requestedPage);
            if show:
                print(show.pdfLink)
            sys.exit()
         if arg == 'closed':
            print("closed");
            links = ShowScraper(False, True).pullClosedShows();
         sys.exit()
      elif opt == '-p':
         requestedPage=arg
      elif opt == '-o':
        print('offline')
      elif opt == '-d':
         if arg == 'showpage':
            print('show page')
            show = ShowScraper(True, True).pullShow("blah");
            if show:
                print(show.pdfLink)
                downloadProgram(show);
            sys.exit()
         if arg == 'closed':
            print("closed");
            links = ShowScraper(False, True).pullClosedShows();
            [print(str(link)) for link in links]
      elif opt == '-f':
        (allshows, uniqueShows) = scrapeAndDownload();
        kansas = None
        for show in allshows:
            doParseAndClean(show);
            print("programName: " + show.programName)
            if show.showCode == "KTDC1":
                print("found KTDC1")
                json = doRunGrammar(show);
                AppServerAccessor().postShow(show, json)
            #doRunGrammar(show);
        #doParse()
        #shows = doRunGrammar()
if __name__ == "__main__":
   main(sys.argv[1:])