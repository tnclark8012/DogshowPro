import config
import os
import subprocess

class ParseRunner(object):
    def __init__(self):
        pass

    def parseAllDownloaded(self):
        for filename in os.listdir(config.Pdf.DOWNLOAD_DIR):
            pdf = config.Pdf.DOWNLOAD_DIR + filename
            output = filename[:-3] + "txt"
            outputLocation = config.Parse.OUTPUT_DIR + output
            print("filename: " + filename + " parsed to " + outputLocation );
            subprocess.call(['java', '-jar', 'pdfbox-app-1.7.1.jar', 'ExtractText', pdf, outputLocation])

    def parseProgram(self, show):
        if show.pdfFilePath is not None:
            fullPdfPath = show.pdfFilePath
            output = show.programName[:-3] + "txt"
            outputLocation = config.Parse.OUTPUT_DIR + output
            show.parsedPath = outputLocation;
            subprocess.call(['java', '-jar', 'pdfbox-app-1.7.1.jar', 'ExtractText', fullPdfPath, outputLocation])
        else:
            print("No PDF file to parse for show: " + str(show))