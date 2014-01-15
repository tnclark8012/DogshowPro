package dev.tnclark8012.dogshow.apps.android.sync;
import java.io.IOException;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dev.tnclark8012.dogshow.apps.android.Config;
import dev.tnclark8012.dogshow.apps.android.model.BreedRing;
import dev.tnclark8012.dogshow.apps.android.model.JuniorsRing;
import dev.tnclark8012.dogshow.apps.android.model.Show;
public class AzureApiAccessor extends ApiAccessor
{

	// private static final String BASE_URL =
	// "https://google-developers.appspot.com/_ah/api/resources/v0.1";
	//"http://10.0.2.2:8888/rest"
	//10.0.2.2
	//192.168.0.4
	private static final String BASE_URL = (Config.DEBUG_LOCAL)?"http://10.0.2.2:49414/api":"http://dogshow-manager.appspot.com/rest";
	public static final String GET_SHOW_URL = BASE_URL + "/Show";
	public static final String GET_BREED_RINGS_URL = BASE_URL + "/BreedRing";
	public static final String GET_JUNIORS_RINGS_URL = BASE_URL + "/JuniorsRing";
	private Gson mGson;
	
	public AzureApiAccessor()
	{
		mGson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
	}
	

	public final String buildGetBreedRingsUrl(String showId) {
		return encode(GET_BREED_RINGS_URL + "?showId=" + showId);
	}
	public final String buildGetBreedRingsUrl(String showId, String breed) {
		return encode(GET_BREED_RINGS_URL + "?showId=" + showId + "&breedName=" + breed);
	}
	
	public final String buildGetJuniorRingsUrl(String showId, String juniorClass) {
		return encode(GET_JUNIORS_RINGS_URL + "?showId=" + showId + "&className=" + juniorClass);
	}
	@Override
	public String getBaseUrl() {
		return BASE_URL;
	}
	@Override
	public String getShowsUrl() {
		return GET_SHOW_URL;
	}	@Override
	public BreedRing[] getBreedRings(String showId, String breed) {
//		try {
			String jsonStr = DUMMY_BREEDS;//executeGet(buildGetBreedRingsUrl(showId, breed));
			return mGson.fromJson(jsonStr, BreedRing[].class);
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//		return null;
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
//		try {
			String jsonStr = DUMMY_SHOWS;//executeGet(getShowsUrl());
			return mGson.fromJson(jsonStr, Show[].class);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return null;
	}
}
