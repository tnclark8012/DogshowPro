package dev.tnclark8012.woof.web;

import dev.tnclark8012.woof.model.Dog;
import dev.tnclark8012.woof.model.Show;

public interface IApi {
    Dog[] GetAllDogs();
    Show[] GetAllShows();
}
