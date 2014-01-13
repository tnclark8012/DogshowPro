package dev.tnclark8012.dogshow.apps.android.sync;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import android.util.Log;
import dev.tnclark8012.dogshow.apps.android.Config;
public class AzureApiAccessor implements Config.IApiAccessor
{

	// private static final String BASE_URL =
	// "https://google-developers.appspot.com/_ah/api/resources/v0.1";
	//"http://10.0.2.2:8888/rest"
	private static final String BASE_URL = (Config.DEBUG_LOCAL)?"http://192.168.0.4:49414/api":"http://dogshow-manager.appspot.com/rest";
	public static final String GET_SHOW_URL = BASE_URL + "/Show";
	public static final String GET_BREED_RINGS_URL = BASE_URL + "/BreedRing";
	public static final String GET_JUNIORS_RINGS_URL = BASE_URL + "/JuniorsRing";
	
	

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
	private String encode(String str)
	{
		try {
			return URLEncoder.encode(str, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			Log.e(Config.TAG, "Invalid encoding: " + str);
			return str;
		}
	}
	@Override
	public String getShowsUrl() {
		return GET_SHOW_URL;
	}
	
}
