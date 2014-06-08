package dev.tnclark8012.apps.android.dogshow.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.util.Log;

public class Utils {
	private static final String TAG = Utils.class.getSimpleName();

	public static String getGuid() {
		return UUID.randomUUID().toString();
	}

	/**
	 * Is API 16 or greater?
	 */
	public static boolean isJellybean() {
		return android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN;
	}

	public static boolean isOnline(Context context) {
		ConnectivityManager cm = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		return cm.getActiveNetworkInfo() != null
				&& cm.getActiveNetworkInfo().isConnectedOrConnecting();
	}

	/**
	 * Convenience method: converts a boolean to an int
	 * 
	 * @param bool
	 *            boolean value
	 * @return 1 or 0 for True or False, respectively.
	 */
	public static int booleanToInt(boolean bool) {
		return (bool) ? 1 : 0;
	}

	public static int parseSafely(String str, int defaultValue) {
		if (str.isEmpty() || !Character.isDigit(str.charAt(0))) {
			// catch easiest cases that cause NumberFormatException to avoid
			// costly handling
			return defaultValue;
		} else {
			try {
				return Integer.parseInt(str);
			} catch (NumberFormatException nfe) {
				return defaultValue;
			}
		}
	}

	public static float parseSafely(String str, float defaultValue) {
		if (str.isEmpty() || !Character.isDigit(str.charAt(0))) {
			// catch easiest cases that cause NumberFormatException to avoid
			// costly handling
			return defaultValue;
		} else {
			try {
				return Float.parseFloat(str);
			} catch (NumberFormatException nfe) {
				return defaultValue;
			}
		}
	}

	public static boolean isSameDay(long one, long two) {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"),
				Locale.US);
		cal.setTimeInMillis(one);
		int oneYear = cal.get(Calendar.YEAR);
		int oneMonth = cal.get(Calendar.MONTH);
		int oneMonthDay = cal.get(Calendar.DAY_OF_MONTH);
		cal.setTimeInMillis(two);
		return (oneYear == cal.get(Calendar.YEAR))
				&& (oneMonth == cal.get(Calendar.MONTH))
				&& (oneMonthDay == cal.get(Calendar.DAY_OF_MONTH));
	}

	public static boolean isNullOrEmpty(String str) {
		return str == null || str.isEmpty();
	}

	public static long getMaybeNull(Cursor cursor, int columnIndex,
			long defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : cursor
				.getLong(columnIndex);
	}

	public static int getMaybeNull(Cursor cursor, int columnIndex,
			int defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : cursor
				.getInt(columnIndex);
	}

	public static String getMaybeNull(Cursor cursor, int columnIndex,
			String defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : cursor
				.getString(columnIndex);
	}

	public static float getMaybeNull(Cursor cursor, int columnIndex,
			float defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : cursor
				.getFloat(columnIndex);
	}

	public static boolean getMaybeNull(Cursor cursor, int columnIndex,
			boolean defaultValue) {
		return (cursor.isNull(columnIndex)) ? defaultValue : (cursor
				.getInt(columnIndex) != 0);
	}

	public static long minutesToMillis(float minutes) {
		return (long) (minutes * 60 * 1000);
	}

	// TODO create DogshowUtils for "dogshow specific" things like these?
	public static long estimateBlockStart(int dogCountAhead,
			long timeBlockStart, long estimatedMillisPerDog) {
		return timeBlockStart + dogCountAhead * estimatedMillisPerDog;// Simple,
																		// but
																		// used
																		// several
																		// places
	}

	public static long estimateBlockStart(int dogCountAhead,
			long timeBlockStart, float estimatedMinutesPerDog) {
		return estimateBlockStart(dogCountAhead, timeBlockStart,
				((long) (estimatedMinutesPerDog * 1000 * 60)));// Simple, but
																// used several
																// places
	}

	public static long currentTimeUtc() {
		long now = System.currentTimeMillis();
		return now + TimeZone.getDefault().getOffset(now);
	}

	public static long twelveAmToday() {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"),
				Locale.US);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return cal.getTimeInMillis();
	}

	private static final long EPOCH_IN_MILLISECONDS = 62135596800000l;

	public static long millisSinceEpoch(long millisSinceAD) {
		return millisSinceAD - EPOCH_IN_MILLISECONDS;
	}

	public static Uri storeImage(Context context, Bitmap image) {
		File pictureFile = new File(context.getFilesDir(),
				System.currentTimeMillis() + ".jpg");
		try {
			pictureFile.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			FileOutputStream fos = new FileOutputStream(pictureFile);
			image.compress(Bitmap.CompressFormat.PNG, 90, fos);
			fos.close();
			return Uri.fromFile(pictureFile);
		} catch (FileNotFoundException e) {
			Log.d(TAG, "File not found: " + e.getMessage());
		} catch (IOException e) {
			Log.d(TAG, "Error accessing file: " + e.getMessage());
		}
		return null;
	}

}