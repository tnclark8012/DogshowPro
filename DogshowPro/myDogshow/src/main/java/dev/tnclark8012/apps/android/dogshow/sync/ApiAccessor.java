package dev.tnclark8012.apps.android.dogshow.sync;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.zip.GZIPInputStream;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import android.content.Context;
import android.util.Log;

import com.google.gson.JsonObject;

import dev.tnclark8012.apps.android.dogshow.Config;
import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;

public abstract class ApiAccessor implements Config.IApiAccessor {
	public static final String TAG = ApiAccessor.class.getSimpleName();
	protected static final String DUMMY_BREEDS = "[{\"BitchCount\":7,\"BlockStartMillis\":63524332800000,\"BreedName\":\"Papillon\",\"Count\":16,\"CountAhead\":0,\"DateMillis\":0,\"DateString\":\"Friday, January 3, 2014\",\"DogCount\":3,\"IsSweepstakes\":false,\"IsVeteran\":false,\"Judge\":\"MRS VICKI L ABBOTT\",\"RingNumber\":10,\"ShowId\":\"MNJS1\",\"SpecialBitchCount\":2,\"SpecialDogCount\":4},{\"BitchCount\":9,\"BlockStartMillis\":63524425500000,\"BreedName\":\"Papillon\",\"Count\":21,\"CountAhead\":0,\"DateMillis\":0,\"DateString\":\"Saturday, January 4, 2014\",\"DogCount\":5,\"IsSweepstakes\":false,\"IsVeteran\":false,\"Judge\":\"MR LARRY C ABBOTT\",\"RingNumber\":10,\"ShowId\":\"MNJS1\",\"SpecialBitchCount\":3,\"SpecialDogCount\":4},{\"BitchCount\":9,\"BlockStartMillis\":63524512800000,\"BreedName\":\"Papillon\",\"Count\":21,\"CountAhead\":0,\"DateMillis\":0,\"DateString\":\"Sunday, January 5, 2014\",\"DogCount\":5,\"IsSweepstakes\":false,\"IsVeteran\":false,\"Judge\":\"MRS SARI BREWSTER TIETJEN\",\"RingNumber\":10,\"ShowId\":\"MNJS1\",\"SpecialBitchCount\":3,\"SpecialDogCount\":4}]";
	protected static final String DUMMY_SHOWS = "[{\"ShowId\":\"MNJS1\",\"City\":null,\"Clubs\":[],\"ShowName\":\"posted\",\"StartDateMillis\":0,\"State\":null}]";
	private static IApiAccessor mAccessor;

	public ApiAccessor() {
	}

	public static IApiAccessor getInstance(Context context) {
		// if (mAccessor != null) {
		// return mAccessor;
		// } else {
		mAccessor = new AzureApiAccessor(context);
		return mAccessor;
		// }
	}

	protected String readInputStream(InputStream inputStream)
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

	public static String urlEncode(String str) {
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

    protected String makeGetRequest(URL url, Object entity)
    {
        String response = null;
        HttpURLConnection urlConnection = null;
        HttpPost post = new HttpPost(url.toString());
        try {
            post.setEntity(new StringEntity(entity.toString()));
        } catch (UnsupportedEncodingException uee) {
        }
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        Log.v(TAG, "request to " + url.toString());
        Log.v(TAG, "request content: " + entity.toString());
        try {
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Content-Type",
                    "application/json");
            urlConnection.setChunkedStreamingMode(0);
            DataOutputStream wr = new DataOutputStream(
                    urlConnection.getOutputStream());
            post.getEntity().writeTo(wr);
            wr.flush();
            wr.close();
            // check for response message
            String statusLine = urlConnection.getResponseMessage();
            // check for response status
            int statusCode = urlConnection.getResponseCode();
            urlConnection.connect();
            throwErrors(urlConnection);
            response = readInputStream(urlConnection.getInputStream());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return response;
    }
	protected String executeGet(URL url) throws IOException {
		Log.d(TAG, "Requesting URL: " + url);
		String response = null;

		if (!Config.DEBUG_OFFLINE) {
			HttpURLConnection urlConnection = (HttpURLConnection) url
					.openConnection();
			urlConnection.connect();
			throwErrors(urlConnection);
			response = readInputStream(urlConnection.getInputStream());
		} else {
			Log.i(TAG, "Debugging offline, response is set.");
			throw new UnsupportedOperationException(
					"Debug offline is not yet implemented");
		}
		Log.v(TAG, "HTTP response: " + response);
		return response;
	}

	protected void throwErrors(HttpURLConnection urlConnection)
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

	protected String makePostRequest(URL url, JsonObject json) {

        try {
            HttpPost httpPost = new HttpPost(url.toURI());
            httpPost.setEntity(new StringEntity(json.toString()));
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            new DefaultHttpClient().execute(httpPost);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        if(true) return "";

        HttpURLConnection urlConnection = null;
		HttpPost post = new HttpPost(url.toString());
		try {
			post.setEntity(new StringEntity(json.toString()));
		} catch (UnsupportedEncodingException uee) {
		}
		try {
			urlConnection = (HttpURLConnection) url.openConnection();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (urlConnection != null) {
			try {
				Log.v(TAG, "request to " + url.toString());
				Log.v(TAG, "request content: " + json.toString());
				String message = URLEncoder.encode(json.toString(), "UTF-8");
				urlConnection.setDoOutput(true);
				urlConnection.setDoInput(true);
				urlConnection.setRequestMethod("POST");
				urlConnection.setRequestProperty("Content-Type",
						"application/json");
				urlConnection.setChunkedStreamingMode(0);
				DataOutputStream wr = new DataOutputStream(
						urlConnection.getOutputStream());
				post.getEntity().writeTo(wr);
				wr.flush();
				wr.close();
				// check for response message
				String statusLine = urlConnection.getResponseMessage();
				// check for response status
				int statusCode = urlConnection.getResponseCode();
				StringBuilder builder = new StringBuilder();
				// get content of response
				InputStream content;
				if (statusCode == 200) {
					content = urlConnection.getInputStream();
				} else {
					content = urlConnection.getErrorStream();
				}
				BasicHttpEntity response = new BasicHttpEntity();
				response.setContent(content);
				// check for gzip compression
				Header contentEncoding = response.getContentEncoding();
				if (contentEncoding != null
						&& contentEncoding.getValue().equalsIgnoreCase("gzip")) {
					content = new GZIPInputStream(content);
				}

				BufferedReader reader = new BufferedReader(
						new InputStreamReader(content));
				String line;
				while ((line = reader.readLine()) != null) {
					builder.append(line);
				}
				String responseStr = UIUtils.stripQuotes(builder.toString());
				Log.v(TAG, responseStr);
				return responseStr;
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				urlConnection.disconnect();
			}
		}
		return null;
	}

}
