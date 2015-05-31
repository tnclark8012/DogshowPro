package dev.tnclark8012.apps.android.dogshow.model;

public class Show {
	public String city;
	public Club[] clubs;
	public long endDateMillis;
	public boolean hasSchedule;
	public String judgingProgramUrl;
	public String location;
	public String programPath;
	public String showId;
	public String showName;
	public long startDateMillis;
	public String state;

	@Override
	public String toString() {
		return "showName: " + showName + ", city: " + city + ", state: " + state;
	}

	public boolean hasEnded()
	{
		return System.currentTimeMillis() > this.endDateMillis;
	}
}
