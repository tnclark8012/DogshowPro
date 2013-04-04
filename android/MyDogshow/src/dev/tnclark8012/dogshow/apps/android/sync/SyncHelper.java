package dev.tnclark8012.dogshow.apps.android.sync;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.util.Log;
import dev.tnclark8012.dogshow.apps.android.Config;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sync.DogHandler.ParseMode;
import dev.tnclark8012.dogshow.apps.android.util.AccountUtils;

public class SyncHelper {
	private final static String TAG = SyncHelper.class.getSimpleName();
	private Context mContext;

	public SyncHelper(Context context) {
		mContext = context;
	}

	private String makeSimpleGetRequest(Context mContext, String urlString) {
		String mAuthToken = AccountUtils.getAuthToken(mContext);
		try {
			URL url = new URL(urlString);
			HttpURLConnection urlConnection = (HttpURLConnection) url
					.openConnection();
			urlConnection
					.setRequestProperty("Content-Type", "application/json");
			urlConnection.setRequestProperty("Authorization", "Bearer "
					+ mAuthToken);
			urlConnection.setDoOutput(true);

			Log.d(TAG, "Posting to URL: " + url);

			urlConnection.connect();
			throwErrors(urlConnection);
			String response = readInputStream(urlConnection.getInputStream());
			return response;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	private void throwErrors(HttpURLConnection urlConnection)
			throws IOException {
		final int status = urlConnection.getResponseCode();
		if (status < 200 || status >= 300) {
			String errorMessage = null;
			try {
				String errorContent = readInputStream(urlConnection
						.getErrorStream());
				Log.v(TAG, "Error content: " + errorContent);
			} catch (IOException ignored) {
			}
		}
	}

	public JSONArray getShows() {
		try {
			Log.v(TAG, "getShows using base url, " + Config.GET_SHOW_URL);
			return new JSONObject(makeSimpleGetRequest(mContext,
					Config.GET_SHOW_URL)).getJSONArray("show");
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
	}

	public JSONArray getBreedRingsForShow(String showId) {
		try {
			return new JSONObject(makeSimpleGetRequest(mContext,
					Config.buildGetBreedRingsUrl(showId)))
					.getJSONArray("Rings");
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void getBreedRingsForShow(String showId, String breed) {
		try {
			JSONArray json = new JSONObject(makeSimpleGetRequest(mContext,
					Config.buildGetBreedRingsUrl(showId, breed)))
					.getJSONArray("Rings");
		} catch (JSONException e) {
			e.printStackTrace();
		
		}
	}

	public void updateDog(String dogId, String breedName, String callName,
			String imagePath, String majors, String ownerId, String points,
			int sex) {
		// TODO move these calls to a Service
		ContentResolver resolver = mContext.getContentResolver();
		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY,
					new DogHandler(mContext).parse(ParseMode.UPDATE, dogId,
							breedName, callName, imagePath, majors, points,
							ownerId, sex));
		} catch (RemoteException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		} catch (OperationApplicationException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		}
	}

	public void createDog(String dogId, String breedName, String callName,
			String imagePath, String majors, String ownerId, String points,
			int sex) {
		// TODO move these calls to a Service
		ContentResolver resolver = mContext.getContentResolver();
		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY,
					new DogHandler(mContext).parse(ParseMode.NEW, dogId,
							breedName, callName, imagePath, majors, points,
							ownerId, sex));
		} catch (RemoteException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		} catch (OperationApplicationException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		}
	}

	public void createRing(String showId, long dateMillis, String judge,
			int ringNumber, long blockStartMillis, int count, String breedName,
			int dogCount, int bitchCount, int specialDog, int specialBitch,
			int countAhead) {
		// TODO move these calls to a Service
		ContentResolver resolver = mContext.getContentResolver();
		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY,
					new RingHandler(mContext).parse(showId, dateMillis, judge,
							ringNumber, blockStartMillis, count, breedName,
							dogCount, bitchCount, specialDog, specialBitch,
							countAhead));
		} catch (RemoteException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		} catch (OperationApplicationException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		}
	}

	private static String readInputStream(InputStream inputStream)
			throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(inputStream));
		String responseLine;
		StringBuilder responseBuilder = new StringBuilder();
		while ((responseLine = bufferedReader.readLine()) != null) {
			responseBuilder.append(responseLine);
		}
		return responseBuilder.toString();
	}
}
