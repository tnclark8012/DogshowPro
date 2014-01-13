package dev.tnclark8012.dogshow.apps.android.sync;
import dev.tnclark8012.dogshow.apps.android.Config;
import dev.tnclark8012.dogshow.apps.android.model.BreedRing;
import dev.tnclark8012.dogshow.apps.android.model.JuniorsRing;
public class AppEngineApiAccessor implements Config.IApiAccessor
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
//	@Override
//	public BreedRing[] getBreedRings(String showId, String breed) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public JuniorsRing[] getJuniorsRings(String showId, String className) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
