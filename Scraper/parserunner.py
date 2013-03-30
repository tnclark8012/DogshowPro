import config
import os
import subprocess

class ParseRunner(object):
    def __init__(self):
        pass

    def run(self):
        for filename in os.listdir(config.Pdf.DOWNLOAD_DIR):
            pdf = config.Pdf.DOWNLOAD_DIR + filename
            output = filename[:-3] + "txt"
            outputLocation = config.Parse.OUTPUT_DIR + output
            print("filename: " + filename + " parsed to " + outputLocation );
            subprocess.call(['java', '-jar', 'pdfbox-app-1.7.1.jar', 'ExtractText', pdf, outputLocation])
#java -jar pdfbox-app-x.y.z.jar ExtractText [OPTIONS] <PDF file> [Text file]

