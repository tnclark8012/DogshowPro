package dev.tnclark8012.woof.model;

public class Show {
    public String city;
    public String state;
    public String location;

    public Show(){

    }

    public static Show fromLocation(String city, String state)
    {
        Show show = new Show();
        show.city = city;
        show.state = state;
        show.location = city + ", " + state;

        return show;
    }
}
