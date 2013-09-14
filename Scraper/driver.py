from appserver_accessor import AppServerAccessor
import sys, getopt
import config
import grammar
from parserunner import ParseRunner
from showscraper import ShowScraper
import model.show
from showutils import urlopen_with_retry


def postShow(show):
    url = config.AppServer.SHOW_POST_URL
    
    values = {'name':show._club,  'date':int(show.date), 'city':show.city, 'state':show.state, 'id':show.programName}
    #values = {'city': 'Columbiana', 'date': 1365138000.0, 'name': 'Northeast Oklahoma Kennel Club', 'state': 'AL'}
    response = urlopen_with_retry(url, values)

    #response = urlopen_with_retry(url, data.encode('utf8'))
    the_page = response.read()

def postShows(shows):
    for show in shows:
        postShow(show)

def downloadPrograms(shows):
    for show in shows:
        print("programName: " + show.programName)
        show.downloadProgram()
    return shows


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
    
    try:
      opts, args = getopt.getopt(argv,"frod:")
    except getopt.GetoptError:
      print('option error. No options?');
      sys.exit(2)
    for opt, arg in opts:
      if opt == '-r':
         print('run')
         sys.exit()
      elif opt == '-o':
        print('offline')
      elif opt == '-d':
         if arg == 'showpage':
            print('show page')
            ShowScraper(True, True).pullShow("blah");
            sys.exit()
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