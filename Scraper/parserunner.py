import config
import os
import subprocess
from util import RegexHelper, printv
import codecs

class ParseRunner(object):
    def __init__(self):
        pass

    def parseAllDownloaded(self):
        for filename in os.listdir(config.Pdf.DOWNLOAD_DIR):
            pdf = config.Pdf.DOWNLOAD_DIR + filename
            output = filename[:-3] + "txt"
            outputLocation = config.Parse.OUTPUT_DIR + output
            printv("filename: " + filename + " parsed to " + outputLocation );
            subprocess.call(['java', '-jar', 'pdfbox-app-1.7.1.jar', 'ExtractText', pdf, outputLocation])

    """
    Parse a PDF using Apache PdfBox.
    returns: the parsed file location
    """
    def parseProgramPdfBox(self, fullPdfPath):
        printv("pdfbox on path: " +str(fullPdfPath))
        if fullPdfPath is not None:
            output = os.path.basename(fullPdfPath)[:-3] + "pdfbox.txt"
            outputLocation = config.Parse.OUTPUT_DIR + output
            #show.parsedPath = outputLocation;
            if os.path.isfile(outputLocation) and not config.Env.FORCEALL():
                printv("Already exists: " + outputLocation)
            else:
                subprocess.call(['java', '-jar', 'pdfbox-app-1.7.1.jar', 'ExtractText', fullPdfPath, outputLocation])
            return outputLocation;

    """
    Parse a PDF using Pdf2Txt.py - Line parsing order is (mostly) left-to-right, top-to-bottom
    Returns: the parsed text
    """
    def parseProgramPdf2Txt(self, fullPdfPath):
        if fullPdfPath is not None:
            output = os.path.basename(fullPdfPath)[:-3] + "pdf2txt.txt"
            outputLocation = config.Parse.OUTPUT_DIR + output
            if not os.path.isfile(outputLocation) or config.Env.FORCEALL():
                printv("**************************")
                printv("*     Parsing PDF2Txt    *")
                printv("**************************")
                #TODO save these? Move these process calls and paths somewhere easier to manage
                proc = subprocess.call(['python27', './libs/pdfminer-20110515/tools/pdf2txt.py', fullPdfPath],  stdout=open(outputLocation, "w"))
            else:
                printv("Already exists: " + outputLocation + "; reading from file.");
            #with codecs.open (outputLocation, "r", 'UTF-8') as outputFile:
            #    text = outputFile.read();
            #    return text;
            return outputLocation;
        else:
            printv("!!!!!!!!!!!!!!!!!!!!!!!!")
            printv("!  No path for PDF2TXT !")
            printv("!!!!!!!!!!!!!!!!!!!!!!!!")