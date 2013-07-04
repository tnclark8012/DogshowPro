package dev.tclark.dogshow.persistence.datastore;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;



public abstract class AbstractJsonModel {
	protected static long getMaybe(JSONObject json, String key, long defaultValue)
	{
		try {
			return (json.has(key)) ? json.getLong(key) : defaultValue;
		} catch (JSONException e) {
			return defaultValue;
		}
	}
	protected static String getMaybe(JSONObject json, String key, String defaultValue)
	{
		try {
			return (json.has(key)) ? json.getString(key) : defaultValue;
		} catch (JSONException e) {
			return defaultValue;
		}
	}
	protected static boolean getMaybe(JSONObject json, String key, boolean defaultValue)
	{
		try {
			return (json.has(key)) ? json.getBoolean(key) : defaultValue;
		} catch (JSONException e) {
			return defaultValue;
		}
	}
	protected static double getMaybe(JSONObject json, String key, double defaultValue)
	{
		try {
			return (json.has(key)) ? json.getDouble(key) : defaultValue;
		} catch (JSONException e) {
			return defaultValue;
		}
	}
	protected static int getMaybe(JSONObject json, String key, int defaultValue)
	{
		try {
			return (json.has(key)) ? json.getInt(key) : defaultValue;
		} catch (JSONException e) {
			return defaultValue;
		}
	}
	protected static Object getMaybe(JSONObject json, String key, Object defaultValue)
	{
		try {
			return (json.has(key)) ? json.get(key) : defaultValue;
		} catch (JSONException e) {
			return defaultValue;
		}
	}
}
