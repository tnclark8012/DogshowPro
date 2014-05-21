import os

#yucky, make a regex class?
MONTH_REGEX = "January|February|March|April|May|June|July|August|September|October|November|December";


class Env(object):
    FORCE_ALL = False;
    OFFLINE = False;
    DEBUG = False;
    DO_DOWNLOAD = True;
    VERBOSE = False;
    LOG_VERBOSE = False;
    LOG_DEBUG = False;
    SANDBOX_DIR = os.getcwd();
    def FORCEALL():
        return Env.FORCE_ALL;

class AppServer(object):
    SERVER_URL = "http://localhost:49414/api/" if Env.DEBUG else 'http://dogshow.azurewebsites.net/api/'
    SHOW_POST_URL = SERVER_URL + "Show"
    DUMP_DIR = Env.SANDBOX_DIR + '/final/'

class Onofrio(object):
    BASE_URL = "http://www.onofrio.com"
    CLOSED_SHOWS = BASE_URL + "/execpgm/index?index=JP";
    LOCAL_PAGE   = 'file:///C|'+ os.getcwd()[3:] + '/local/showpage.htm';
    LOCAL_CLOSED = 'file:///C|'+ os.getcwd()[3:] + '/local/closedshows.htm';
    def showPage(link):
        return Onofrio.BASE_URL+link;
    def pdfUrl(pdfLink):
        return Onofrio.BASE_URL + pdfLink;

class Pdf(object):
    DOWNLOAD_DIR = os.getcwd() + "/programs/"

class Parse(object):
    OUTPUT_DIR = os.getcwd() + "/parsed/"

class Grammar(object):
    def FORCE():
        return False or Env.FORCE_ALL;
    GRAMMAR_JAR = os.getcwd() + "/bin/grammar.jar"
    CLEANED_PROGRAM_DIR = os.getcwd() + "/cleaned/"
    JSON_OUTPUT_DIR = os.getcwd() + "/json/"

class Scraper(object):
    JSON_OUTPUT_DIR = os.getcwd() + "/show_details/"
    def FORCE():
        return False or Env.FORCE_ALL;