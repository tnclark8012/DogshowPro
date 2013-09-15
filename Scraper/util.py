import re;
from datetime import datetime
from location import Location

class RegexPattern(object):
	KENNEL_CLUB = "kennel_club";
	SHOW_CODE   = "show_code";
	LOCATION_DATE = "location_date";

class RegexPatternDef(object):
	KENNEL_CLUB = "([a-zA-Z-]+(?: [a-zA-Z-,]+)*)";
	SHOW_CODE = "=(?P<link>[a-zA-Z]+[0-9])";
	WEEK_DAY = "(?:Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday)";
	MONTH = "(?:January|February|March|April|May|June|July|August|September|October|November|December)";

	DATE = "(" + WEEK_DAY + ", " + MONTH + " \d+, \d{4})";
		
	STATE = "(?:AL|AK|AS|AZ|AR|CA|CO|CT|DE|DC|FM|FL|GA|GU|HI|ID|IL|IN|IA|KS|KY|LA|ME|MH|MD|MA|MI|MN|MS|MO|MT|NE|NV|NH|NJ|NM|NY|NC|ND|MP|OH|OK|OR|PW|PA|PR|RI|SC|SD|TN|TX|UT|VT|VI|VA|WA|WV|WI|WY)";
	CITY_STATE = "(?:([a-zA-Z ]+) (" + STATE + "))";
	SHOW_LOCATION_DATE= CITY_STATE + ", " + DATE;


class RegexHelper(object):
	regexMap = { 
		RegexPattern.KENNEL_CLUB : RegexPatternDef.KENNEL_CLUB
	 };

	def getPattern(self, regexPattern):
	 	return regexMap.get(regexPattern);

	def getLocationDate(self, text):
	 	match = re.search(RegexPatternDef.SHOW_LOCATION_DATE, text);
	 	if match:
	 		location = Location(match.group(1), match.group(2))
	 		date = datetime.strptime(match.group(3), "%A, %B %d, %Y")
	 		return location, date;

class ScrapeHelper(object):
	def pullAnchorText(self, anchor, pattern, group):
		text = self._getAnchorText(anchor);
		if pattern is None:
			return text;
		else:
			match = re.search(pattern, text);
			if match:
				return str(match.group(group));

	def pullAnchorLink(self, anchor, pattern):
		print("pullAnchorLink is not implemented")
		sys.exit(1);
		text = self._getAnchorText(anchor);
		if pattern is None:
			return text;
		else:
			match = re.search(pattern, text);
			if match:
				return str(match.group());


	def _getAnchorText(self, anchor):
		found = anchor.findAll(text=True);
		if found:
			return found[0];

