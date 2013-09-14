import os

#yucky, make a regex class?
MONTH_REGEX = "January|February|March|April|May|June|July|August|September|October|November|December";


class Env(object):
    OFFLINE = True;
    DEBUG = True
    DO_DOWNLOAD = False;
    VERBOSE = True;

class AppServer(object):
    SERVER_URL = "http://localhost:8888/rest/" if Env.DEBUG else 'http://dogshow-manager.appspot.com/rest/'
    SHOW_POST_URL = SERVER_URL + "shows/create"

class Onofrio(object):
    BASE_URL = "http://www.onofrio.com"
    CLOSED_SHOWS = BASE_URL + "/execpgm/index?index=JP";
    LOCAL_PAGE = 'file:///C|'+ os.getcwd()[3:] + '/local/showpage.htm';
    def showPage(link):
        return Onofrio.BASE_URL+link;
    def pdfUrl(pdfLink):
        return Onofrio.BASE_URL + pdfLink;

class Pdf(object):
    DOWNLOAD_DIR = os.getcwd() + "/programs/"

class Parse(object):
    OUTPUT_DIR = os.getcwd() + "/parsed/"

class Grammar(object):
    GRAMMAR_JAR = os.getcwd() + "/bin/grammar.jar"
    CLEANED_PROGRAM_DIR = os.getcwd() + "/cleaned/"