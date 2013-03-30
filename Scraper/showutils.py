from retry_decorator import retry
import urllib.request
import urllib.parse

@retry(urllib.error, tries=4, delay=3, backoff=2)
def urlopen_with_retry(url, values):
    data = None
    if values is not None:
        data = urllib.parse.urlencode(values)
        data = data.encode('utf-8') # data should be bytes
    req = urllib.request.Request(url, data)
    return urllib.request.urlopen(req)