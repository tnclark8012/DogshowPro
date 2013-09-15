class CompanionShow(object):
	def __init__(self, club, date, location):
		self.club = club;
		self.date = date;
		self.location = location;

	def __str__(self):
		return self.club + " " + str(self.date) + " " + str(self.location)

	def __repr__(self):
		return self.__str__();