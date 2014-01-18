from retry_decorator import retry
import urllib.request
import time
import requests
import json

@retry(urllib.error, tries=4, delay=3, backoff=2)
def urlopen_with_retry(url, values):
    
    data = None
    if values is not None:
        print("POST REQUEST to " + url)
        data = json.dumps(values)#urllib.parse.urlencode(values).encode('utf-8')
    else:
        time.sleep(2);
        print("GET REQUEST to " + url)
    headers = {'Content-Type' : 'application/json', 'Accept': 'text/plain'}
    r = requests.post(url, data=data, headers=headers)
    print(str(r))
    #req = urllib3.Request(url, data, )
    #f = urllib3.urlopen(req)
    #response = f.read()
    #f.close()
    return r;
    #req = urllib.request.Request(url, json.dumps(values))
    #req.add_header('content-type', 'application/json')
    #req.add_header('Accept', 'application/json')
    #print(data)
    
    #return urllib.request.urlopen(url, data)