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
			Show[] shows = mGson.fromJson(jsonStr, Show[].class);
			for (Show show : shows) {
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