class Location(object):
	def __init__(self, city, state):
		self.city  = city;
		self.state = state;
	def __str__(self):
		return "Location("+self.city + ", " + self.state+")";
	def __repr__(self):
		return self.__str__();

	def __eq__(self, other):
		return self.city==other.city and self.state==other.state

	def __hash__(self):
		return hash((self.city, self.state))