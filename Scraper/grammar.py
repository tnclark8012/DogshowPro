import config
import os
import subprocess
import json

def getShowJson(showTxtPath):
    outputLocation = config.Grammar.JSON_OUTPUT_DIR + os.path.basename(showTxtPath)[:-3] + "json"

    jsonStr = None;
    if not os.path.isfile(outputLocation) or config.Grammar.FORCE:
        print("****************************")
        print("*      Running grammar     *")
        print("****************************")
        proc = subprocess.call(['java', '-jar', config.Grammar.GRAMMAR_JAR, showTxtPath], stdout=open(outputLocation, "w"))
    else:
    	print("Show json already obtained from grammar. Reading JSON from file " + outputLocation)
    with open (outputLocation, "r") as jsonFile:
    	return json.load(jsonFile)
    	jsonStr = jsonFile.read();
    	print("read(): " + str(jsonStr))
    	jsonFile.close();
    	return json.load(jsonFile);