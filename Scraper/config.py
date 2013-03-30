import os

#yucky, make a regex class?
MONTH_REGEX = "January|February|March|April|May|June|July|August|September|October|November|December";


class Env(object):
    OFFLINE = False;
    DEBUG = True
    DO_DOWNLOAD = True;
    VERBOSE = False;

class AppServer(object):
    SERVER_URL = "http://localhost:8888/rest/" if Env.DEBUG else 'http://dogshow-manager.appspot.com/rest/'
    SHOW_POST_URL = SERVER_URL + "shows"

class Onofrio(object):
    BASE_URL = "http://www.onofrio.com"
    CLOSED_SHOWS = BASE_URL + "/execpgm/index?index=JP";
    LOCAL_PAGE = 'file:///C|/Users/Taylor/workspace/Python/scrapping/local/showpage.htm';
    def showPage(link):
        return Onofrio.BASE_URL+link;
    def pdfUrl(pdfLink):
        return Onofrio.BASE_URL + pdfLink;

class Pdf(object):
    DOWNLOAD_DIR = os.getcwd() + "/programs/"

class Parse(object):
    OUTPUT_DIR = os.getcwd() + "/parsed/"