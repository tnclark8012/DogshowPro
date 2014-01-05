import config
import os
import subprocess
import json
from util import printv

def getShowJson(showTxtPath):
    outputLocation = config.Grammar.JSON_OUTPUT_DIR + os.path.basename(showTxtPath)[:-3] + "json"

    jsonStr = None;
    if not os.path.isfile(outputLocation) or config.Grammar.FORCE():
        printv("****************************")
        printv("*      Running grammar     *")
        printv("****************************")
        proc = subprocess.call(['java', '-jar', config.Grammar.GRAMMAR_JAR, showTxtPath], stdout=open(outputLocation, "w"))
    else:
        printv("Show json already obtained from grammar. Reading JSON from file " + outputLocation)
    with open (outputLocation, "r") as jsonFile:
    	return json.load(jsonFile)