package dev.tnclark8012.dogshow.apps.android.sync;
import java.io.IOException;

import com.google.gson.Gson;

import dev.tnclark8012.dogshow.apps.android.Config;
import dev.tnclark8012.dogshow.apps.android.model.BreedRing;
import dev.tnclark8012.dogshow.apps.android.model.JuniorsRing;
import dev.tnclark8012.dogshow.apps.android.model.Show;
public class AppEngineApiAccessor extends ApiAccessor
{

	// private static final String BASE_URL =
	// "https://google-developers.appspot.com/_ah/api/resources/v0.1";
	//"http://10.0.2.2:8888/rest"
	private static final String BASE_URL = (Config.DEBUG_LOCAL)?"http://192.168.0.4:8888/rest":"http://dogshow-manager.appspot.com/rest";
	public static final String GET_SHOW_URL = BASE_URL + "/shows";
	public static final String GET_RINGS_URL = BASE_URL + "/rings";
	

	public final String buildGetBreedRingsUrl(String showId) {
		return GET_RINGS_URL + "/show/" + showId;
	}
	public final String buildGetBreedRingsUrl(String showId, String breed) {
		return GET_RINGS_URL + "/show/" + showId + "/breed/" + breed;
	}
	
	public final String buildGetJuniorRingsUrl(String showId, String juniorClass) {
		return GET_RINGS_URL + "/show/" + showId + "/juniors/" + juniorClass;
	}
	@Override
	public String getBaseUrl() {
		return BASE_URL;
	}
	@Override
	public String getShowsUrl() {
		return GET_SHOW_URL;
	}
	@Override
	public BreedRing[] getBreedRings(String showId, String breed) {
		try {
			String jsonStr = executeGet(buildGetBreedRingsUrl(showId, breed));
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
			return new Gson().fromJson(jsonStr, JuniorsRing[].class);
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
