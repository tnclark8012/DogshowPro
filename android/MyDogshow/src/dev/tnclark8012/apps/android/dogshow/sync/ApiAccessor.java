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
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

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

	public static IApiAccessor getInstance() {
		if (mAccessor != null) {
			return mAccessor;
		} else {
			mAccessor = new AzureApiAccessor();
			return mAccessor;
		}
	}

	protected String readInputStream(InputStream inputStream) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		String responseLine;
		StringBuilder responseBuilder = new StringBuilder();
		while ((responseLine = bufferedReader.readLine()) != null) {
			responseBuilder.append(responseLine);
		}
		return responseBuilder.toString();
	}

	protected String encode(String str) {
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

	@Override
	public String register(String account, String token, String provider, String installId) {
		// URL createTeamUrl = null;
		// try {
		// createTeamUrl = new URL("http://192.168.0.5:49414/api/" + "ShowTeam/Create");
		// } catch (MalformedURLException e4) {
		// // TODO Auto-generated catch block
		// e4.printStackTrace();
		// }
		// JsonObject team = new JsonObject();
		// team.addProperty("TeamName", "My Team Name");
		// team.addProperty("Password", "password");
		//
		// JsonObject req = new JsonObject();
		// req.addProperty("UserIdentifier", "test");
		// req.add("Team", team);
		// String resp = finalPost(createTeamUrl, req);
		// Log.d(TAG, resp);

		// Log.d(TAG, "Message to send: "+req[0]);
		// String url = "http://192.168.0.5:49414/api/" + "User/Register";
		// HttpPost p = new HttpPost(url);
		// JsonObject json = new JsonObject();
		// json.addProperty("InstallationId", installId);
		// json.addProperty("Provider", provider);
		// json.addProperty("Name", account);
		// json.addProperty("Token", token);
		// HttpURLConnection urlConnection = null;
		// // instantiates httpclient to make request
		// DefaultHttpClient httpclient = new DefaultHttpClient();
		// // url with the post data
		// HttpPost httpost = new HttpPost(url);
		// try {
		// httpost.setEntity(new StringEntity(json.toString()));
		// } catch (UnsupportedEncodingException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		// // sets a request header so the page receving the request
		// // will know what to do with it
		// // httpost.setHeader("Accept", "application/json");
		// httpost.setHeader("Content-type", "application/json");
		// try {
		// String response = httpclient.execute(httpost, new BasicResponseHandler());
		// Log.d(TAG, response.toString());
		// return UIUtils.stripQuotes(response);// TODO ALPHA Response should be JSON to prevent storing an error message as user id :)
		// } catch (ClientProtocolException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		return null;
	}

	protected String makePostRequest(URL url, JsonObject json) {

		if (true)
			return finalPost(url, json);
		// instantiates httpclient to make request
		// TODO ALPHA convert to URLConnection
		DefaultHttpClient httpclient = new DefaultHttpClient();
		// url with the post data
		HttpPost httpost = new HttpPost(url.toString());
		try {
			httpost.setEntity(new StringEntity(json.toString()));
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// sets a request header so the page receving the request
		// will know what to do with it
		// httpost.setHeader("Accept", "application/json");
		httpost.setHeader("Content-type", "application/json");
		try {
			String response = httpclient.execute(httpost, new BasicResponseHandler());

			Log.d(TAG, response.toString());
			return response;// TODO ALPHA Response should be JSON to prevent storing an error message as user id :)
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private String finalPost(URL url, JsonObject json) {
		HttpURLConnection urlConnection = null;
		HttpPost post = new HttpPost(url.toString());
		try {
			post.setEntity(new StringEntity(json.toString()));
		} catch (UnsupportedEncodingException uee) {
		}
		try {
			urlConnection = (HttpURLConnection) url.openConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (urlConnection != null) {
			try {
				String message = URLEncoder.encode(json.toString(), "UTF-8");
				urlConnection.setDoOutput(true);
				urlConnection.setDoInput(true);
				urlConnection.setRequestMethod("POST");
				urlConnection.setRequestProperty("Content-Type", "application/json");
				urlConnection.setChunkedStreamingMode(0);
				DataOutputStream wr = new DataOutputStream(urlConnection.getOutputStream());
				post.getEntity().writeTo(wr);
				wr.flush();
				wr.close();
				// check for response message
				String statusLine = urlConnection.getResponseMessage();
				// check for response status
				int statusCode = urlConnection.getResponseCode();
				if (statusCode == 200) {
					StringBuilder builder = new StringBuilder();
					// get content of response
					InputStream content = urlConnection.getInputStream();
					BasicHttpEntity response = new BasicHttpEntity();
		response.setContent(content);
					// check for gzip compression
					Header contentEncoding = response.getContentEncoding();
					if (contentEncoding != null && contentEncoding.getValue().equalsIgnoreCase("gzip")) {
						content = new GZIPInputStream(content);
					}

					BufferedReader reader = new BufferedReader(new InputStreamReader(content));
					String line;
					while ((line = reader.readLine()) != null) {
						builder.append(line);
					}
					String responseStr = UIUtils.stripQuotes(builder.toString());
					Log.v(TAG, responseStr);
					return responseStr;
				}

				// urlConnection.setChunkedStreamingMode(0);
				// urlConnection.setFixedLengthStreamingMode(message.getBytes().length);

				// make some HTTP header nicety
				// urlConnection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
				// OutputStream out = new BufferedOutputStream(urlConnection.getOutputStream());
				// OutputStream os = new BufferedOutputStream(urlConnection.getOutputStream());
				// os.write(message.getBytes());
				// // clean up
				// os.flush();
				//
				// InputStream in = new BufferedInputStream(urlConnection.getInputStream());
				// return readInputStream(in);
				return null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				urlConnection.disconnect();
			}
		}
		return null;
	}

}