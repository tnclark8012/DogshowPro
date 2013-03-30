package dev.tclark.dogshow.persistence.datastore.managers;

import java.util.List;

import dev.tclark.dogshow.models.show.Show;
import dev.tclark.dogshow.persistence.datastore.accessors.ShowAccessor;

public class ShowManager {
	public static List<Show> getAllShows()
	{
		for(dev.tclark.dogshow.persistence.datastore.Show dataShow : ShowAccessor.getAllShows())
		{
			Show s = new Show();
		}
		return null;
	}
}
