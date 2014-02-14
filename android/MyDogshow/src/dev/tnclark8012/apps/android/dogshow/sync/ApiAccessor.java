package dev.tnclark8012.apps.android.dogshow.sync;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import android.content.Context;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.Config;

public abstract class ApiAccessor implements Config.IApiAccessor{
	public static final String TAG = ApiAccessor.class.getSimpleName();
	protected static final String DUMMY_BREEDS = "[{\"BitchCount\":7,\"BlockStartMillis\":63524332800000,\"BreedName\":\"Papillon\",\"Count\":16,\"CountAhead\":0,\"DateMillis\":0,\"DateString\":\"Friday, January 3, 2014\",\"DogCount\":3,\"IsSweepstakes\":false,\"IsVeteran\":false,\"Judge\":\"MRS VICKI L ABBOTT\",\"RingNumber\":10,\"ShowId\":\"MNJS1\",\"SpecialBitchCount\":2,\"SpecialDogCount\":4},{\"BitchCount\":9,\"BlockStartMillis\":63524425500000,\"BreedName\":\"Papillon\",\"Count\":21,\"CountAhead\":0,\"DateMillis\":0,\"DateString\":\"Saturday, January 4, 2014\",\"DogCount\":5,\"IsSweepstakes\":false,\"IsVeteran\":false,\"Judge\":\"MR LARRY C ABBOTT\",\"RingNumber\":10,\"ShowId\":\"MNJS1\",\"SpecialBitchCount\":3,\"SpecialDogCount\":4},{\"BitchCount\":9,\"BlockStartMillis\":63524512800000,\"BreedName\":\"Papillon\",\"Count\":21,\"CountAhead\":0,\"DateMillis\":0,\"DateString\":\"Sunday, January 5, 2014\",\"DogCount\":5,\"IsSweepstakes\":false,\"IsVeteran\":false,\"Judge\":\"MRS SARI BREWSTER TIETJEN\",\"RingNumber\":10,\"ShowId\":\"MNJS1\",\"SpecialBitchCount\":3,\"SpecialDogCount\":4}]";
	protected static final String DUMMY_SHOWS = "[{\"ShowId\":\"MNJS1\",\"City\":null,\"Clubs\":[],\"ShowName\":\"posted\",\"StartDateMillis\":0,\"State\":null}]";
	protected String readInputStream(InputStream inputStream) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		String responseLine;
		StringBuilder responseBuilder = new StringBuilder();
		while ((responseLine = bufferedReader.readLine()) != null) {
			responseBuilder.append(responseLine);
		}
		return responseBuilder.toString();
	}
	
	protected String encode(String str)
	{
		try {
			return URLEncoder.encode(str, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			Log.e(Config.TAG, "Invalid encoding: " + str);
			return str;
		}
	}
	
	protected String executeGet(String urlString) throws IOException {
		return executeGet(new URL(urlString));
	}

	protected String executeGet(URL url) throws IOException {
		Log.d(TAG, "Requesting URL: " + url);
		String response = null;

		if (!Config.DEBUG_OFFLINE) {
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			urlConnection.connect();
			throwErrors(urlConnection);
			response = readInputStream(urlConnection.getInputStream());
		} else {
			Log.i(TAG, "Debugging offline, response is set.");
			throw new UnsupportedOperationException("Debug offline is not yet implemented");
		}
		Log.v(TAG, "HTTP response: " + response);
		return response;
	}

	
	protected void throwErrors(HttpURLConnection urlConnection) throws IOException {
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
}
