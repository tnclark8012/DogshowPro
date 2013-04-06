package dev.tnclark8012.dogshow.apps.android.sync;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.RemoteException;
import android.util.Log;
import dev.tnclark8012.dogshow.apps.android.Config;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sync.DogHandler.ParseMode;
import dev.tnclark8012.dogshow.apps.android.util.AccountUtils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class SyncHelper {
	private final static String TAG = SyncHelper.class.getSimpleName();
	private Context mContext;
	private String mAuthToken;

	public SyncHelper(Context context) {
		mContext = context;
	}

	private String makeSimpleGetRequest(Context mContext, String urlString) {
		String mAuthToken = AccountUtils.getAuthToken(mContext);
		try {
			URL url = new URL(urlString);
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			urlConnection.setRequestProperty("Content-Type", "application/json");
			urlConnection.setRequestProperty("Authorization", "Bearer " + mAuthToken);
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

	private void throwErrors(HttpURLConnection urlConnection) throws IOException {
		final int status = urlConnection.getResponseCode();
		if (status < 200 || status >= 300) {
			String errorMessage = null;
			try {
				String errorContent = readInputStream(urlConnection.getErrorStream());
				Log.v(TAG, "Error content: " + errorContent);
			} catch (IOException ignored) {
			}
		}
	}

	public JSONArray getShows() {
		try {//TODO use show handler
			Log.v(TAG, "getShows using base url, " + Config.GET_SHOW_URL);
			String responseStr = makeSimpleGetRequest(mContext, Config.GET_SHOW_URL);
			if(responseStr == null)
			{
				return null;
			}
			JSONObject response = new JSONObject();// TODO create ResponseHandler
			JSONArray array = null;
			array = response.optJSONArray("show");
			if (array != null) {
				return array;
			} else {
				return new JSONArray().put(response.getJSONObject("show"));
			}
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void executeSync(String showId) {
		final ContentResolver resolver = mContext.getContentResolver();
        ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		try {
			boolean auth = AccountUtils.isAuthenticated(mContext);
			 Cursor breedsCursor = resolver.query(DogshowContract.Dogs.buildEnteredGroupedBreedUri(),
	                    new String[]{DogshowContract.Dogs.DOG_BREED},
	                    null, null, null );
	            batch = new ArrayList<ContentProviderOperation>();
	            String breedName = null;
	            Log.i(TAG, "Syncing breed rings for " + breedsCursor.getCount() + " breeds"); 
	            int numBreeds = 0;
	            BreedRingsHandler handler = new BreedRingsHandler(mContext, true);
	            while (breedsCursor.moveToNext()) {
	            	breedName = breedsCursor.getString(0);
	            	Log.v(TAG, "Requesting breed ring: " + breedName);
	            	batch.addAll(executeGet(Config.buildGetBreedRingsUrl(showId, breedName),handler
	                        , auth));
	            	numBreeds++;
	            }
	            Log.v(TAG, "Pulled breed rings for " + numBreeds + " breeds");
	            breedsCursor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, batch);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OperationApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public void updateDog(String dogId, String breedName, String callName, String imagePath, String majors, String ownerId, String points, int sex) {
		// TODO move these calls to a Service
		ContentResolver resolver = mContext.getContentResolver();
		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, new DogHandler(mContext).parse(ParseMode.UPDATE, dogId, Breeds.parse(breedName).toString(), callName, imagePath, majors, points, ownerId, sex));
		} catch (RemoteException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		} catch (OperationApplicationException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		}
	}

	public void createDog(String dogId, String breedName, String callName, String imagePath, String majors, String ownerId, String points, int sex) {
		// TODO move these calls to a Service
		ContentResolver resolver = mContext.getContentResolver();
		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, new DogHandler(mContext).parse(ParseMode.NEW, dogId, Breeds.parse(breedName).toString(), callName, imagePath, majors, points, ownerId, sex));
		} catch (RemoteException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		} catch (OperationApplicationException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		}
	}

	private ArrayList<ContentProviderOperation> executeGet(String urlString, JsonHandler handler, boolean authenticated) throws IOException {
		Log.d(TAG, "Requesting URL: " + urlString);
		String response = null;
		if (!Config.DEBUG_OFFLINE) {
			URL url = new URL(urlString);
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			mAuthToken = AccountUtils.getAuthToken(mContext);
			if (authenticated && mAuthToken != null) {
				urlConnection.setRequestProperty("Authorization", "Bearer " + mAuthToken);
			}
			urlConnection.connect();
			throwErrors(urlConnection);
			response = readInputStream(urlConnection.getInputStream());
		} else {
			Log.i(TAG, "Debugging offline, response is set.");
			if (handler instanceof BreedRingsHandler) {
				response = "";
			}
			throw new UnsupportedOperationException("Debug offline is not yet implemented");
		}
		Log.v(TAG, "HTTP response: " + response);
		return handler.parse(response);
	}

	private static String readInputStream(InputStream inputStream) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		String responseLine;
		StringBuilder responseBuilder = new StringBuilder();
		while ((responseLine = bufferedReader.readLine()) != null) {
			responseBuilder.append(responseLine);
		}
		return responseBuilder.toString();
	}
}
