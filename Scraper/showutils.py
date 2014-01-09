from retry_decorator import retry
import urllib.request
import time
import urllib.parse

@retry(urllib.error, tries=4, delay=3, backoff=2)
def urlopen_with_retry(url, values):
    
    data = None
    if values is not None:
        print("POST REQUEST to " + url)
        data = urllib.parse.urlencode(values)
        data = data.encode('utf-8') # data should be bytes

    else:
        time.sleep(2);
        print("GET REQUEST to " + url)
    req = urllib.request.Request(url, data)
    req.add_header('Content-Type', 'application/json')
    req.add_header('Accept', 'text/plain')
    #this works: data = urllib.parse.urlencode({"ShowId":"buddy lindsey"}).encode('utf-8')
    return urllib.request.urlopen(req)