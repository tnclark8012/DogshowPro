package dev.tnclark8012.apps.android.dogshow.model;

public class Show {
	public String showName;
	public long startDateMillis;
	public String city;
	public String state;
	public String showId;
	public Club[] clubs;

	@Override
	public String toString() {
		return "showName: " + showName + ", city: " + city + ", state: " + state;
	}
}
