package dev.tnclark8012.dogshow.apps.android.sync;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.Log;

import com.google.gson.Gson;

import dev.tnclark8012.dogshow.apps.android.Config;
import dev.tnclark8012.dogshow.apps.android.model.Show;
import dev.tnclark8012.dogshow.apps.android.model.ShowsResponse;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Handlers;
import dev.tnclark8012.dogshow.apps.android.util.AccountUtils;
import dev.tnclark8012.dogshow.shared.DogshowEnums;

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

	public Show[] getShows() {
			Log.v(TAG, "getShows using base url, " + Config.GET_SHOW_URL);
			String responseStr = makeSimpleGetRequest(mContext, Config.GET_SHOW_URL);
			Log.w(TAG, "Response: " + responseStr);
			if (responseStr == null) {
                throw new RuntimeException("Couldn't load shows! Null response!");
//				return null;
			}
			ShowsResponse response = new Gson().fromJson(responseStr, ShowsResponse.class);
            if(response.shows == null)
            {
                throw new RuntimeException("Couldn't parse shows! Response: " + responseStr );
            }
			return response.shows;
	}

	//TODO move this to a service
	public void executeSync(String showId) {
		final ContentResolver resolver = mContext.getContentResolver();
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		try {
			boolean auth = AccountUtils.isAuthenticated(mContext);
			Cursor breedsCursor = resolver.query(DogshowContract.Dogs.buildEnteredGroupedBreedUri(), new String[] { DogshowContract.Dogs.DOG_BREED }, null, null, null);
			batch = new ArrayList<ContentProviderOperation>();
			String breedName = null;
			Log.i(TAG, "Syncing breed rings for " + breedsCursor.getCount() + " breeds");
			int numBreeds = 0;
			BreedRingsHandler handler = new BreedRingsHandler(mContext, true);
			while (breedsCursor.moveToNext()) {
				breedName = breedsCursor.getString(0);
				Log.v(TAG, "Requesting breed ring: " + breedName);
				batch.addAll(executeGet(Config.buildGetBreedRingsUrl(showId, DogshowEnums.Breeds.parse(breedName).toString()), handler, auth));
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
		requestJuniorsRingsTask.execute(showId);

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
	
	private AsyncTask<String, Void, Void> requestJuniorsRingsTask = new AsyncTask<String, Void, Void>() {

		@Override
		protected Void doInBackground(String... params) {
			
			final ContentResolver resolver = mContext.getContentResolver();
			ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
			try {
				boolean auth = AccountUtils.isAuthenticated(mContext);
                Cursor juniorsCursor = resolver.query(Handlers.buildEnteredJuniorsClassesUri(), new String[]{Handlers.HANDLER_JUNIOR_CLASS}, Handlers.HANDLER_IS_SHOWING + "=?", new String[]{"1"}, null);
				batch = new ArrayList<ContentProviderOperation>();
				String className = null;
				Log.i(TAG, "Syncing junior rings for " + juniorsCursor.getCount() + " classes");
				int numClasses = 0;
				JuniorsRingsHandler handler = new JuniorsRingsHandler(mContext, true);
				while (juniorsCursor.moveToNext()) {
					className = juniorsCursor.getString(0);
					Log.v(TAG, "Requesting juniors ring: " + className);
					batch.addAll(executeGet(Config.buildGetJuniorRingsUrl(params[0], DogshowEnums.JuniorClass.parse(className).toString()), handler, auth));
					numClasses++;
				}
				Log.v(TAG, "Pulled juniors rings for " + numClasses + " classes");
				juniorsCursor.close();
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
			return null;
		}
	};
}