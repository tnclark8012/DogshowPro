package dev.tnclark8012.apps.android.dogshow.sync;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import android.util.Log;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import dev.tnclark8012.apps.android.dogshow.Config;
import dev.tnclark8012.apps.android.dogshow.model.BreedRing;
import dev.tnclark8012.apps.android.dogshow.model.Dog;
import dev.tnclark8012.apps.android.dogshow.model.JuniorsRing;
import dev.tnclark8012.apps.android.dogshow.model.Show;
import dev.tnclark8012.apps.android.dogshow.model.ShowTeam;
import dev.tnclark8012.apps.android.dogshow.sync.request.DogSyncRequest;
import dev.tnclark8012.apps.android.dogshow.sync.request.RegistrationRequest;
import dev.tnclark8012.apps.android.dogshow.sync.request.ShowTeamCreateRequest;
import dev.tnclark8012.apps.android.dogshow.sync.request.ShowTeamSyncRequest;
import dev.tnclark8012.apps.android.dogshow.sync.response.DogSyncResponse;
import dev.tnclark8012.apps.android.dogshow.sync.response.ShowTeamResponse;
import dev.tnclark8012.apps.android.dogshow.sync.response.ShowTeamSyncResponse;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

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
	public URL POST_REGISTRATION_URL;
	public URL SYNC_DOG_URL;
	public URL CREATE_SHOW_TEAM_URL;
	public URL JOIN_SHOW_TEAM_URL;
	public URL SYNC_SHOW_TEAM_URL;
	private Gson mGson;

	public AzureApiAccessor() {
		mGson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
		try {
			BASE_URL = new URL((Config.DEBUG_LOCAL) ? "http://192.168.0.5:49414/api" : "http://dogshow.azurewebsites.net/api");
			GET_SHOW_URL = new URL(BASE_URL + "/Show");
			GET_BREED_RINGS_URL = new URL(BASE_URL + "/BreedRing");
			GET_JUNIORS_RINGS_URL = new URL(BASE_URL + "/JuniorsRing");
			POST_REGISTRATION_URL = new URL(BASE_URL + "/User/Register");
			SYNC_DOG_URL = new URL(BASE_URL + "/Dog/Sync");
			CREATE_SHOW_TEAM_URL = new URL(BASE_URL + "/ShowTeam/Create");
			JOIN_SHOW_TEAM_URL = new URL(BASE_URL + "/ShowTeam/Join");
			SYNC_SHOW_TEAM_URL = new URL(BASE_URL + "/ShowTeam/Sync");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public final URL buildGetBreedRingsUrl(String showId) {
		try {
			return new URL(GET_BREED_RINGS_URL, "?showId=" + encode(showId));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public final URL buildGetBreedRingsUrl(String showId, String breed, Boolean veteran, Boolean sweepstakes) {
		try {
			String query = "?showId=" + encode(showId) + "&breedName=" + encode(breed);
			if (veteran != null) {
				query += "&veteran=" + veteran.booleanValue();
			}
			if (sweepstakes != null) {
				query += "&sweepstakes=" + sweepstakes.booleanValue();
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
			return new URL(GET_JUNIORS_RINGS_URL, "?showId=" + encode(showId) + "&className=" + encode(juniorClass));
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
			BreedRing[] rings = mGson.fromJson(jsonStr, BreedRing[].class);
			for (BreedRing ring : rings) {
				Log.d(TAG, "From " + new Date(ring.blockStartMillis));
				ring.blockStartMillis = Utils.millisSinceEpoch(ring.blockStartMillis);
				Log.d(TAG, "To " + new Date(ring.blockStartMillis));
			}
			return rings;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public JuniorsRing[] getJuniorsRings(String showId, String className) {
		try {
			String jsonStr = executeGet(buildGetJuniorRingsUrl(showId, className));

			JuniorsRing[] rings = mGson.fromJson(jsonStr, JuniorsRing[].class);
			for (JuniorsRing ring : rings) {
				ring.blockStartMillis = Utils.millisSinceEpoch(ring.blockStartMillis);
			}
			return rings;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Show[] getShows() {
		try {
			String jsonStr = executeGet(getShowsUrl());
			jsonStr = "[{\"ShowId\":\"test1\",\"City\":\"Seattle\",\"Clubs\":[{\"Id\":1,\"Name\":\"Seattle Dog Club\"},{\"Id\":2,\"Name\":\"Redmond Dog Club\"}],\"ShowName\":\"Seattle Dog Show Extraviganza!!!\",\"StartDateMillis\":63525704018699,\"State\":\"WA\"},{\"ShowId\":\"MNJS1\",\"City\":\"St Paul\",\"Clubs\":[{\"Id\":3,\"Name\":\"Minnesota January Specialties\"},{\"Id\":4,\"Name\":\"Land O'Lakes Kennel Club, Inc.\"},{\"Id\":5,\"Name\":\"Northstar Working Group Association\"},{\"Id\":6,\"Name\":\"Land O'Lakes Kennel Club, Inc. (O/R)\"},{\"Id\":7,\"Name\":\"North Star Herding Group Club, Inc.\"},{\"Id\":8,\"Name\":\"North Star Toy Dog Club\"},{\"Id\":9,\"Name\":\"Midwest Region Top Junior Handler Comp\"}],\"ShowName\":\"Land O'Lakes Kennel Club, Inc. (1)\",\"StartDateMillis\":1388736000000,\"State\":\"MN\"},{\"ShowId\":\"CEIA1\",\"City\":\"Des Moines\",\"Clubs\":[{\"Id\":10,\"Name\":\"Central Iowa Kennel Club, Inc.\"}],\"ShowName\":\"Central Iowa Kennel Club, Inc. (1)\",\"StartDateMillis\":1390032000000,\"State\":\"IA\"},{\"ShowId\":\"Test\",\"City\":\"Redmond\",\"Clubs\":[{\"Id\":11,\"Name\":\"North Star Toy Dog Club\"},{\"Id\":12,\"Name\":\"Minnesota January Specialties\"},{\"Id\":13,\"Name\":\"Land O'Lakes Kennel Club, Inc. (O/R)\"},{\"Id\":14,\"Name\":\"North Star Herding Group Club, Inc.\"},{\"Id\":15,\"Name\":\"Midwest Region Top Junior Handler Comp\"},{\"Id\":16,\"Name\":\"Northstar Working Group Association\"},{\"Id\":17,\"Name\":\"Land O'Lakes Kennel Club, Inc.\"}],\"ShowName\":\"Redmond/Bellevue Dog Show\",\"StartDateMillis\":1388736000000,\"State\":\"WA\"},{\"ShowId\":\"CYLO1\",\"City\":\"Des Moines\",\"Clubs\":[{\"Id\":21,\"Name\":\"Combined Specialty Clubs of Mid-Iowa\"},{\"Id\":22,\"Name\":\"Cyclone Country KC of Ames, Inc.\"},{\"Id\":23,\"Name\":\"Cyclone Country KC of Ames, Inc. (Obed)\"}],\"ShowName\":\"Combined Specialty Clubs of Mid-Iowa\",\"StartDateMillis\":1392364800000,\"State\":\"IA\"},{\"ShowId\":\"LEAV1\",\"City\":\"Kansas City\",\"Clubs\":[{\"Id\":24,\"Name\":\"Heart of America Kennel Club, Inc.\"},{\"Id\":25,\"Name\":\"Heartland French Bulldog Club\"},{\"Id\":26,\"Name\":\"Leavenworth Kennel Club, Inc.\"},{\"Id\":27,\"Name\":\"Heart of America Samoyed Club\"},{\"Id\":28,\"Name\":\"Heart of America Keeshond Club\"},{\"Id\":29,\"Name\":\"Heart of America Poodle Club, Inc.\"},{\"Id\":30,\"Name\":\"Yorkshire Terrier Club of Greater KC\"},{\"Id\":31,\"Name\":\"Weimaraner Club of Greater Kansas City\"}],\"ShowName\":\"Heart of America Kennel Club, Inc. (1)\",\"StartDateMillis\":1394694000000,\"State\":\"MO\"}]\r\n";
			Show[] shows = mGson.fromJson(jsonStr, Show[].class);
			Log.d(TAG, jsonStr);
			for (Show show : shows) {
				Log.d(TAG, show.toString());
				show.startDateMillis = Utils.millisSinceEpoch(show.startDateMillis);
			}
			return shows;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public URL getRegistrationUrl() {
		return POST_REGISTRATION_URL;
	}

	@Override
	public DogSyncResponse[] syncDogs(String userId, long lastSync, Dog[] dogs, String[] currentDogIds) {
		DogSyncRequest request = new DogSyncRequest();
		request.lastSync = lastSync;
		request.dogs = dogs;
		request.userIdentifier = userId;
		request.allDogIds = currentDogIds;
		JsonObject json = mGson.toJsonTree(request, DogSyncRequest.class).getAsJsonObject();
		return mGson.fromJson(makePostRequest(SYNC_DOG_URL, json), DogSyncResponse[].class);
	}

	@Override
	public ShowTeamResponse createShowTeam(String userId, String teamName, String password) {
		ShowTeamCreateRequest request = new ShowTeamCreateRequest();
		ShowTeam team = new ShowTeam();
		team.passwordAttempt = password;
		team.teamName = teamName;
		request.team = team;
		request.userIdentifier = userId;
		JsonObject json = mGson.toJsonTree(request, ShowTeamCreateRequest.class).getAsJsonObject();
		return mGson.fromJson(makePostRequest(CREATE_SHOW_TEAM_URL, json), ShowTeamResponse.class);
	}

	@Override
	public String register(String account, String token, String provider, String installId) {
		RegistrationRequest request = new RegistrationRequest();
		request.installationId = installId;
		request.name = account;
		request.provider = provider;
		request.token = token;
		JsonObject json = mGson.toJsonTree(request, RegistrationRequest.class).getAsJsonObject();
		return makePostRequest(POST_REGISTRATION_URL, json);
	}

	@Override
	public ShowTeamSyncResponse[] syncShowTeams(String userId, long lastSync, String[] currentTeamIds) {
		ShowTeamSyncRequest request = new ShowTeamSyncRequest();
		request.lastSync = lastSync;
		request.userIdentifier = userId;
		request.allTeamIds = currentTeamIds;
		JsonObject json = mGson.toJsonTree(request, ShowTeamSyncRequest.class).getAsJsonObject();
		return mGson.fromJson(makePostRequest(SYNC_SHOW_TEAM_URL, json), ShowTeamSyncResponse[].class);
	}

}
