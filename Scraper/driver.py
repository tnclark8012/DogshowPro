import config
from parserunner import ParseRunner
from scraper import ShowScraper
from show import Show
from showutils import urlopen_with_retry
def postShow(show):
    url = config.AppServer.SHOW_POST_URL
    
    values = {'name':show._club,  'date':int(show.date), 'city':show.city, 'state':show.state}
    #values = {'city': 'Columbiana', 'date': 1365138000.0, 'name': 'Northeast Oklahoma Kennel Club', 'state': 'AL'}
    response = urlopen_with_retry(url, values)

    #response = urlopen_with_retry(url, data.encode('utf8'))
    the_page = response.read()

def postShows(shows):
    for show in shows:
        postShow(show)

def downloadPrograms(shows):
    for show in shows:
        show.downloadProgram(config.Pdf.DOWNLOAD_DIR+show.programName)
def scrapeAndDownload():
    scraper = ShowScraper(False, False);
    shows = scraper.getAllShows()
    print("posting shows...");
    #postShows(shows)
    shows = scraper.getUniqueShows()
    print("downloading " + str(len(shows)) + " programs...")
    downloadPrograms(shows)

def main():
    runner = ParseRunner()
    runner.run();
    #scrapeAndDownload();
main();
        