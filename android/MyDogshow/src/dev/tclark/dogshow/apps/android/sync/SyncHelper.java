package dev.tclark.dogshow.apps.android.sync;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import dev.tclark.dogshow.apps.android.Config;
import dev.tclark.dogshow.apps.android.util.AccountUtils;

public class SyncHelper {
	private final static String TAG = SyncHelper.class.getSimpleName();

	public void makeRequest(Context mContext) {
		String mAuthToken = AccountUtils.getAuthToken(mContext);
		JsonObject starredSession = new JsonObject();

		byte[] postJsonBytes = new Gson().toJson(starredSession).getBytes();
		try {
			URL url = new URL(Config.GET_SHOW_URL);
			HttpURLConnection urlConnection = (HttpURLConnection) url
					.openConnection();
			urlConnection
					.setRequestProperty("Content-Type", "application/json");
			urlConnection.setRequestProperty("Authorization", "Bearer "
					+ mAuthToken);
			urlConnection.setDoOutput(true);
			urlConnection.setFixedLengthStreamingMode(postJsonBytes.length);

			Log.d(TAG, "Posting to URL: " + url);
			OutputStream out = new BufferedOutputStream(
					urlConnection.getOutputStream());
			out.write(postJsonBytes);
			out.flush();

			urlConnection.connect();
			throwErrors(urlConnection);
			String json = readInputStream(urlConnection.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// EditMyScheduleResponse response = new Gson().fromJson(json,
		// EditMyScheduleResponse.class);
		// if (!response.success) {
		// String responseMessageLower = (response.message != null)
		// ? response.message.toLowerCase()
		// : "";
		//
		// if (responseMessageLower.contains("no profile")) {
		// throw new HandlerException.NoDevsiteProfileException();
		// }
		// }
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
