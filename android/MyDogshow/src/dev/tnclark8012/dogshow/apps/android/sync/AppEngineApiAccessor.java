package dev.tnclark8012.dogshow.apps.android.sync;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

import dev.tnclark8012.dogshow.apps.android.Config;
import dev.tnclark8012.dogshow.apps.android.model.BreedRing;
import dev.tnclark8012.dogshow.apps.android.model.JuniorsRing;
import dev.tnclark8012.dogshow.apps.android.model.Show;
import dev.tnclark8012.dogshow.apps.android.util.Utils;
public class AppEngineApiAccessor extends ApiAccessor
{
	private URL BASE_URL;
	private URL GET_SHOW_URL;
	private URL GET_RINGS_URL;
	// private static final String BASE_URL =
	// "https://google-developers.appspot.com/_ah/api/resources/v0.1";
	//"http://10.0.2.2:8888/rest"
	public AppEngineApiAccessor() {
		super();
		try {
			BASE_URL = new URL((Config.DEBUG_LOCAL)?"http://192.168.0.4:8888/rest":"http://dogshow-manager.appspot.com/rest");
			GET_SHOW_URL = new URL(BASE_URL + "/shows");
			GET_RINGS_URL = new URL(BASE_URL + "/rings");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public final URL buildGetBreedRingsUrl(String showId) {
		try {
			return new URL(GET_RINGS_URL, "show/" + showId);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public final URL buildGetBreedRingsUrl(String showId, String breed, Boolean veteran, Boolean sweepstakes) {
		try {
			return new URL(GET_RINGS_URL, "show/" + showId + "/breed/" + breed);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public final URL buildGetJuniorRingsUrl(String showId, String juniorClass) {
		try {
			return new URL(GET_RINGS_URL, "show/" + showId + "/juniors/" + juniorClass);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public URL getBaseUrl() {
		return BASE_URL;
	}
	@Override
	public URL getShowsUrl() {
		return GET_SHOW_URL;
	}
	@Override
	public BreedRing[] getBreedRings(String showId, String breed, Boolean veteran, Boolean sweepstakes) {
		try {
			String jsonStr = executeGet(buildGetBreedRingsUrl(showId, breed, null, null));
			return new Gson().fromJson(jsonStr, BreedRing[].class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public JuniorsRing[] getJuniorsRings(String showId, String className) {
		try {
			String jsonStr = executeGet(buildGetJuniorRingsUrl(showId, className));
			return  new Gson().fromJson(jsonStr, JuniorsRing[].class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Show[] getShows() {
		try {
			String jsonStr = executeGet(getShowsUrl());
			return new Gson().fromJson(jsonStr, Show[].class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
