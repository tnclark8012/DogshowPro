import json
from parserunner import ParseRunner;
from util import RegexPatternDef, printv;
import re
import shutil
import grammar
import config
import os
from collections import OrderedDict
import codecs
import sys
import subprocess
#TODO move re to regexhelper methods if possible


class RingCleaner(object):
	#, '/[0-9]+ [0-9]+-[0-9]+-[0-9]+-[0-9]+$/Id'
	pdfBoxSedCommands = ['/.* GOES TO LUNCH/Id', '/.* MOVES TO RING [0-9]+/Id', '/.* is also in RING/Id', '/.* minutes following/Id'];
	pdf2TxtSedCommands = ['/.* MOVES TO RING [0-9]+/Id'];
	def __init__(self):
		self._runner = ParseRunner();
	def cleanPdfBox(self, pdfPath):
		cleanedPath = config.Grammar.CLEANED_PROGRAM_DIR + os.path.basename(pdfPath)
		if not os.path.isfile(cleanedPath):
			shutil.copyfile(pdfPath, cleanedPath)
			#TODO build into one big command
			for sedCommand in RingCleaner.pdfBoxSedCommands:
				printv('running sed: ' + sedCommand);
				sub = subprocess.call(['sed', '-i','-r','-e', sedCommand, cleanedPath])
		return cleanedPath
		#printv(string['Rings']);
	
	def cleanPdf2Txt(self, pdfPath):
		printv("Cleaning Pdf2Txt Output: " + str(pdfPath))
		cleanedPath = config.Grammar.CLEANED_PROGRAM_DIR + os.path.basename(pdfPath)
		if not os.path.isfile(cleanedPath):
			shutil.copyfile(pdfPath, cleanedPath)
			#TODO build into one big command
			printv("running sed on " + cleanedPath)
			for sedCommand in RingCleaner.pdf2TxtSedCommands:
				sub = subprocess.call(['sed', '-i','-r', '-e', sedCommand, cleanedPath])
		return cleanedPath

	"""
	Returns a dictionary<String, List<Int>> of ring numbers mapped to date strings 
	Ex: ('Thursday, January 10, 2013':[1,1,2,3,3,2,4,5])
	Ring numbers are NOT guaranteed to be in chronological order, but they are guaranteed to be listed in the proper day. Group rings are not present
	"""
	def collectRingDates(self, filePath):
		printv("collecting dates (running pdf2txt) on " + filePath)
		parsedFilePath = self._runner.parseProgramPdf2Txt(filePath)
		cleanedPath = self.cleanPdf2Txt(parsedFilePath)
		text = None;
		with codecs.open (cleanedPath, "r", 'UTF-8') as outputFile:
			text = outputFile.read();
		dateRingMap = self._getDateRingMap(text);
		return dateRingMap

	def parseShowJson(self, filePath):
		parsedFilePath = self._runner.parseProgramPdfBox(filePath);
		cleanedPath = self.cleanPdfBox(parsedFilePath);
		if cleanedPath:
			return grammar.getShowJson(cleanedPath);
		else:
			printv('!!! failed to parse ' + str(parsedFilePath) + '!!!');



	"""
	Generates a dictionary<String, List<Int>> of ring numbers mapped to date strings using regex
	Ex: ('Thursday, January 10, 2013':[1,1,2,3,3,2,4,5])
	Ring numbers are NOT guaranteed to be in chronological order, but they are guaranteed to be listed in the proper day. Group rings are not present
	text: parsed PDF text
	"""
	def _getDateRingMap(self, text):
		#Default encoding can't handle bullets etc. in file
		text = text.encode('utf-8')
		text = str(text);
		text = text.replace('\\r\\n','\n').replace('\\r','\n').replace('\\n','\n');
		lineArr = str(text).split('\n');

		printv(str(len(lineArr)) + " lines after split");
		printv(text);
		dateRingList = [line for line in lineArr if re.match(RegexPatternDef.DATE, line) or re.match("RING \d+", line)]
		printv(len(dateRingList));
		[printv(str(x)) for x in dateRingList]
		ringCount = 0;
		datemap = OrderedDict();
		rings = list();
		currentDate = None;
		for line in dateRingList:
			dateMatch = re.match(RegexPatternDef.DATE, line)
			if dateMatch:
				nextDate = dateMatch.group(1);
				printv(nextDate);
				if nextDate != currentDate :
					printv("new day")
					if rings:
						printv("adding rings to day " + currentDate)
						if currentDate in datemap:
							datemap[currentDate].extend(rings);
						else:
							datemap[currentDate] = rings;
					rings = list();
					currentDate = nextDate
					printv("current date now " + currentDate)

			else:
				ringMatch = re.match("RING (\d+)", line)
				if ringMatch:
					ring = int(ringMatch.group(1))
					printv("Found RING " + str(ring));
					rings.append(ring);
					ringCount = ringCount+1;
				else:
					printv("Nothing found in line: " + line);
		if len(rings) > 0:
			if currentDate in datemap:
							datemap[currentDate].extend(rings);
			else:
				datemap[currentDate] = rings;
		printv("found " + str(ringCount) + " rings");
		printv(str(datemap))
		return datemap

