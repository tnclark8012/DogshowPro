import re;
import sys;

class scrapeHelper(object):
	def pullAnchorText(self, anchor, pattern):
        text = self._getAnchorText(anchor);
        if pattern is None:
            return text;
        else:
	        match = re.search(pattern, text);
	        if match:
	            return str(match.group());

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