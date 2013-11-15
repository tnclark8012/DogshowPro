import config
from showutils import urlopen_with_retry
from util import printv
class AppServerAccessor(object):
    def __init__(self):
        pass;
    def postShow(self, show, showJson ):
        print ("Posting show JSON to server...");
        url = config.AppServer.SHOW_POST_URL
        printv(url);
        values = {'name':show._club,  'date':int(show.date)*1000, 'city':show.city, 'state':show.state, 'show':showJson}
        #values = {'city': 'Columbiana', 'date': 1365138000.0, 'name': 'Northeast Oklahoma Kennel Club', 'state': 'AL'}
        response = urlopen_with_retry(url, values)

        #response = urlopen_with_retry(url, data.encode('utf8'))
        the_page = response.read()
        pass;