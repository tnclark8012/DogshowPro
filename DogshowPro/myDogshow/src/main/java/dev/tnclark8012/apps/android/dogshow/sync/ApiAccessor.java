package dev.tnclark8012.apps.android.dogshow.sync;

import android.content.Context;
import android.util.Log;

import com.google.gson.JsonObject;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import dev.tnclark8012.apps.android.dogshow.Config;
import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;

public abstract class ApiAccessor implements Config.IApiAccessor {
    public static final String TAG = ApiAccessor.class.getSimpleName();

    public ApiAccessor() {
    }

    public static IApiAccessor getInstance(Context context) {
        return new AzureApiAccessor(context);
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

    protected String executeGet(URL url) throws IOException {
        Log.d(TAG, "Requesting URL: " + url);
        String response = null;
        HttpURLConnection urlConnection = (HttpURLConnection) url
                .openConnection();
        urlConnection.connect();
        throwErrors(urlConnection);
        response = readInputStream(urlConnection.getInputStream());

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
            String response = EntityUtils.toString(new DefaultHttpClient().execute(httpPost).getEntity());
            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
