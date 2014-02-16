package dev.tnclark8012.apps.android.dogshow.util;

//TODO Guava, Joiner
public class Arrays {
	public static String concat(String delimiter, int[] integers) {
		if (integers == null)
			return "";
		String str = String.valueOf(integers[0]);
		for (int i = 1; i < integers.length; i++) {
			str += delimiter + String.valueOf(integers[i]);
		}
		return str;
	}

	public static String concat(String delimiter, Object[] objects) {
		if (objects == null)
			return "";
		String str = String.valueOf(objects[0]);
		for (int i = 1; i < objects.length; i++) {
			str += delimiter + String.valueOf(objects[i]);
		}
		return str;
	}
}
