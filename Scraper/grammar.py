import config
import os
import subprocess
def getShowJson(showTxtPath):
    proc = subprocess.Popen(['java', '-jar', config.Grammar.GRAMMAR_JAR, showTxtPath], stdout=subprocess.PIPE)
    json = proc.stdout.read()
    return json

