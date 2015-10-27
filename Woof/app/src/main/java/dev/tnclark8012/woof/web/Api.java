package dev.tnclark8012.woof.web;

import android.content.Context;

import dev.tnclark8012.woof.model.Dog;
import dev.tnclark8012.woof.model.Show;
import dev.tnclark8012.woof.util.Settings;

/**
 * Created by taylorc on 10/26/2015.
 */
public class Api implements IApi {

    private Api(){}

    public static IApi get(Context context) {
        if(Settings.UseMockApi(context))
        {
            return new MockApi();
        }

        return new Api();
    }
    @Override
    public Dog[] GetAllDogs() {
        return new Dog[0];
    }

    @Override
    public Show[] GetAllShows() {
        return new Show[0];
    }
}
