import json
from parserunner import ParseRunner;
from util import RegexPatternDef;
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
	pdfBoxSedCommands = ['s/.* GOES TO LUNCH/d\''];
	pdf2TxtSedCommands = ['/\'.* MOVES TO RING [0-9]+$/d'];
	def __init__(self):
		self._runner = ParseRunner();
	def cleanPdfBox(self, pdfPath):
		cleanedPath = config.Grammar.CLEANED_PROGRAM_DIR + os.path.basename(pdfPath)
		if not os.path.isfile(cleanedPath):
			shutil.copyfile(pdfPath, cleanedPath)
			#TODO build into one big command
			for sedCommand in RingCleaner.pdfBoxSedCommands:
				sub = subprocess.call(['sed', '-i','-e', sedCommand, cleanedPath])
		return cleanedPath
		#print(string['Rings']);
	
	def cleanPdf2Txt(self, pdfPath):
		cleanedPath = config.Grammar.CLEANED_PROGRAM_DIR + os.path.basename(pdfPath)
		if not os.path.isfile(cleanedPath):
			shutil.copyfile(pdfPath, cleanedPath)
			#TODO build into one big command
			print("running sed on " + cleanedPath)
			for sedCommand in RingCleaner.pdf2TxtSedCommands:
				sub = subprocess.call(['sed', '-i','-e', sedCommand, cleanedPath])
		return cleanedPath

	"""
	Returns a dictionary<String, List<Int>> of ring numbers mapped to date strings 
	Ex: ('Thursday, January 10, 2013':[1,1,2,3,3,2,4,5])
	Ring numbers are NOT guaranteed to be in chronological order, but they are guaranteed to be listed in the proper day. Group rings are not present
	"""
	def collectRingDates(self, filePath):
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
			print('!!! failed to parse ' + str(parsedFilePath) + '!!!');



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

		print(str(len(lineArr)) + " lines after split");
		print(text);
		dateRingList = [line for line in lineArr if re.match(RegexPatternDef.DATE, line) or re.match("RING \d+", line)]
		print(len(dateRingList));
		[print(str(x)) for x in dateRingList]
		ringCount = 0;
		datemap = OrderedDict();
		rings = list();
		currentDate = None;
		for line in dateRingList:
			dateMatch = re.match(RegexPatternDef.DATE, line)
			if dateMatch:
				nextDate = dateMatch.group(1);
				print(nextDate);
				if nextDate != currentDate :
					if rings:
						if currentDate in datemap:
							datemap[currentDate].extend(rings);
						else:
							datemap[currentDate] = rings;
					rings = list();
					currentDate = nextDate

			else:
				ringMatch = re.match("RING (\d+)", line)
				if ringMatch:
					ring = int(ringMatch.group(1))
					print("Found RING " + str(ring));
					rings.append(ring);
					ringCount = ringCount+1;
				else:
					print("Nothing found in line: " + line);
		print("found " + str(ringCount) + " rings");
		print(str(datemap))
		return datemap

