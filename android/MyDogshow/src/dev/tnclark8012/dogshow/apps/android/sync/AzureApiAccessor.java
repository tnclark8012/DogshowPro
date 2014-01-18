package dev.tnclark8012.dogshow.apps.android.sync;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dev.tnclark8012.dogshow.apps.android.Config;
import dev.tnclark8012.dogshow.apps.android.model.BreedRing;
import dev.tnclark8012.dogshow.apps.android.model.JuniorsRing;
import dev.tnclark8012.dogshow.apps.android.model.Show;

public class AzureApiAccessor extends ApiAccessor {

	// private static final String BASE_URL =
	// "https://google-developers.appspot.com/_ah/api/resources/v0.1";
	// "http://10.0.2.2:8888/rest"
	// 10.0.2.2
	// 192.168.0.4
	private URL BASE_URL;
	public URL GET_SHOW_URL;
	public URL GET_BREED_RINGS_URL;
	public URL GET_JUNIORS_RINGS_URL;
	private Gson mGson;

	public AzureApiAccessor() {
		mGson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
		try {
			BASE_URL = new URL((Config.DEBUG_LOCAL) ? "http://192.168.0.4:49414/api" : "http://dogshow-manager.appspot.com/rest");
			GET_SHOW_URL = new URL(BASE_URL + "/Show");
			GET_BREED_RINGS_URL = new URL(BASE_URL + "/BreedRing");
			GET_JUNIORS_RINGS_URL = new URL(BASE_URL + "/JuniorsRing");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public final URL buildGetBreedRingsUrl(String showId) {
		try {
			return new URL(GET_BREED_RINGS_URL,"?showId=" + encode(showId));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public final URL buildGetBreedRingsUrl(String showId, String breed, Boolean veteran, Boolean sweepstakes) {
		try {
			String query = "?showId=" + encode(showId) + "&breedName=" + encode(breed);
			if(veteran != null)
			{
				query+= "&veteran="+veteran.booleanValue();
			}
			if(sweepstakes != null)
			{
				query +="&sweepstakes="+sweepstakes.booleanValue();
			}
			return new URL(GET_BREED_RINGS_URL, query);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public final URL buildGetJuniorRingsUrl(String showId, String juniorClass) {
		try {
			return new URL(GET_JUNIORS_RINGS_URL,"?showId=" + encode(showId)+ "&className=" + encode(juniorClass));
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
			String jsonStr = executeGet(buildGetBreedRingsUrl(showId, breed, veteran, sweepstakes));
			return mGson.fromJson(jsonStr, BreedRing[].class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public JuniorsRing[] getJuniorsRings(String showId, String className) {
		try {
			String jsonStr = executeGet(buildGetJuniorRingsUrl(showId, className));
			return mGson.fromJson(jsonStr, JuniorsRing[].class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Show[] getShows() {
		try {
			String jsonStr = executeGet(getShowsUrl());
			return mGson.fromJson(jsonStr, Show[].class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
