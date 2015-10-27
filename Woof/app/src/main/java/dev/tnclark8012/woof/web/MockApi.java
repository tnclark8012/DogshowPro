package dev.tnclark8012.woof.web;

import dev.tnclark8012.woof.model.Dog;
import dev.tnclark8012.woof.model.Show;

/**
 * Created by taylorc on 10/14/2015.
 */
public class MockApi implements IApi {
    public Show[] GetAllShows(){
        return new Show[] {
                Show.fromLocation("Redmond", "WA"),
                Show.fromLocation("Omaha", "NE", false),
                Show.fromLocation("Phoenix", "AZ")
        };
    }

    public Dog[] GetAllDogs() {
        return new Dog[] {
                Dog.fromName("Fido"),
                Dog.fromName("Barksdale")
        };
    }
}
