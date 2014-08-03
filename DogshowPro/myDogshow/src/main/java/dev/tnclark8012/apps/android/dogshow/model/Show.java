package dev.tnclark8012.apps.android.dogshow.model;

public class Show {
	public String showName;
	public long startDateMillis;
	public long endDateMillis;
	public String city;
	public String state;
	public String showId;
	public Club[] clubs;
	public String judgingProgramUrl;
    public String programPath;

	@Override
	public String toString() {
		return "showName: " + showName + ", city: " + city + ", state: " + state;
	}
}
