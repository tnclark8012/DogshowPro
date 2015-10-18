package dev.tnclark8012.woof.model;

public class Show {
    public String city;
    public String state;
    public String location;
    public boolean hasSchedule;

    public Show(){

    }

    public static Show fromLocation(String city, String state)
    {
        return fromLocation(city, state, true);
    }

    public static Show fromLocation(String city, String state, boolean hasSchedule)
    {
        Show show = new Show();
        show.city = city;
        show.state = state;
        show.location = city + ", " + state;
        show.hasSchedule = hasSchedule;
        return show;
    }
}
