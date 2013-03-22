/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.tnclark8012.dogshow.apps.android.util;

import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * An assortment of UI helpers.
 */
public class UIUtils {
	/**
	 * Time zone to use when formatting all session times. To always use the
	 * phone local time, use {@link TimeZone#getDefault()}.
	 */
	public static final TimeZone CONFERENCE_TIME_ZONE = TimeZone
			.getTimeZone("America/Los_Angeles");

	public static final String CONFERENCE_HASHTAG = "#io12";

	private static final int SECOND_MILLIS = 1000;
	private static final int MINUTE_MILLIS = 60 * SECOND_MILLIS;
	private static final int HOUR_MILLIS = 60 * MINUTE_MILLIS;
	private static final int DAY_MILLIS = 24 * HOUR_MILLIS;

	/** Flags used with {@link DateUtils#formatDateRange}. */
	private static final int TIME_FLAGS = DateUtils.FORMAT_SHOW_TIME
			| DateUtils.FORMAT_SHOW_WEEKDAY | DateUtils.FORMAT_ABBREV_WEEKDAY;

	/** {@link StringBuilder} used for formatting time block. */
	private static StringBuilder sBuilder = new StringBuilder(50);
	/** {@link Formatter} used for formatting time block. */
	private static Formatter sFormatter = new Formatter(sBuilder,
			Locale.getDefault());

	private static StyleSpan sBoldSpan = new StyleSpan(Typeface.BOLD);

	private static CharSequence sEmptyRoomText;
	private static CharSequence sCodeLabRoomText;

	private static CharSequence sNowPlayingText;
	private static CharSequence sLivestreamNowText;
	private static CharSequence sLivestreamAvailableText;

	/**
	 * Populate the given {@link TextView} with the requested text, formatting
	 * through {@link Html#fromHtml(String)} when applicable. Also sets
	 * {@link TextView#setMovementMethod} so inline links are handled.
	 */
	public static void setTextMaybeHtml(TextView view, String text) {
		if (TextUtils.isEmpty(text)) {
			view.setText("");
			return;
		}
		if (text.contains("<") && text.contains(">")) {
			view.setText(Html.fromHtml(text));
			view.setMovementMethod(LinkMovementMethod.getInstance());
		} else {
			view.setText(text);
		}
	}

	/**
	 * Given a snippet string with matching segments surrounded by curly braces,
	 * turn those areas into bold spans, removing the curly braces.
	 */
	public static Spannable buildStyledSnippet(String snippet) {
		final SpannableStringBuilder builder = new SpannableStringBuilder(
				snippet);

		// Walk through string, inserting bold snippet spans
		int startIndex = -1, endIndex = -1, delta = 0;
		while ((startIndex = snippet.indexOf('{', endIndex)) != -1) {
			endIndex = snippet.indexOf('}', startIndex);

			// Remove braces from both sides
			builder.delete(startIndex - delta, startIndex - delta + 1);
			builder.delete(endIndex - delta - 1, endIndex - delta);

			// Insert bold style
			builder.setSpan(sBoldSpan, startIndex - delta,
					endIndex - delta - 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

			delta += 2;
		}

		return builder;
	}

	public static void preferPackageForIntent(Context context, Intent intent,
			String packageName) {
		PackageManager pm = context.getPackageManager();
		for (ResolveInfo resolveInfo : pm.queryIntentActivities(intent, 0)) {
			if (resolveInfo.activityInfo.packageName.equals(packageName)) {
				intent.setPackage(packageName);
				break;
			}
		}
	}

	private static final int BRIGHTNESS_THRESHOLD = 130;

	/**
	 * Calculate whether a color is light or dark, based on a commonly known
	 * brightness formula.
	 * 
	 * @see {@literal http://en.wikipedia.org/wiki/HSV_color_space%23Lightness}
	 */
	public static boolean isColorDark(int color) {
		return ((30 * Color.red(color) + 59 * Color.green(color) + 11 * Color
				.blue(color)) / 100) <= BRIGHTNESS_THRESHOLD;
	}

	public static void logBundle(String tag, Bundle bundle) {
		for (String k : bundle.keySet()) {
			Log.v(tag, k + ": " + bundle.get(k));
		}
	}

	// public static void safeOpenLink(Context context, Intent linkIntent) {
	// try {
	// context.startActivity(linkIntent);
	// } catch (ActivityNotFoundException e) {
	// Toast.makeText(context, "Couldn't open link", Toast.LENGTH_SHORT)
	// .show();
	// }
	//
	// public static Class getMapActivityClass(Context context) {
	// if (UIUtils.isHoneycombTablet(context)) {
	// return MapMultiPaneActivity.class;
	// }
	//
	// return MapActivity.class;
	// }

	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public static void setActivatedCompat(View view, boolean activated) {
		if (hasHoneycomb()) {
			view.setActivated(activated);
		}
	}

	public static boolean hasFroyo() {
		// Can use static final constants like FROYO, declared in later versions
		// of the OS since they are inlined at compile time. This is guaranteed
		// behavior.
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO;
	}

	public static boolean hasGingerbread() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD;
	}

	public static boolean hasHoneycomb() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
	}

	public static boolean hasHoneycombMR1() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1;
	}

	public static boolean hasICS() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
	}

	public static boolean hasJellyBean() {
		return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN;
	}

	public static boolean isTablet(Context context) {
		return (context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE;
	}

	public static boolean isHoneycombTablet(Context context) {
		return hasHoneycomb() && isTablet(context);
	}

	public static Bitmap loadBitmap(String filePath, int requiredWidth,
			int requiredHeight) {

		BitmapFactory.Options options = BitmapLoader.getOptions(filePath,
				requiredWidth, requiredHeight);

		return BitmapFactory.decodeFile(filePath, options);
	}

	private static class BitmapLoader {
		public static int getScale(int originalWidth, int originalHeight,
				final int requiredWidth, final int requiredHeight) {
			// a scale of 1 means the original dimensions
			// of the image are maintained
			int scale = 1;

			// calculate scale only if the height or width of
			// the image exceeds the required value.
			if ((originalWidth > requiredWidth)
					|| (originalHeight > requiredHeight)) {
				// calculate scale with respect to
				// the smaller dimension
				if (originalWidth < originalHeight)
					scale = Math.round((float) originalWidth / requiredWidth);
				else
					scale = Math.round((float) originalHeight / requiredHeight);

			}

			return scale;
		}

		public static BitmapFactory.Options getOptions(String filePath,
				int requiredWidth, int requiredHeight) {

			BitmapFactory.Options options = new BitmapFactory.Options();
			// setting inJustDecodeBounds to true
			// ensures that we are able to measure
			// the dimensions of the image,without
			// actually allocating it memory
			options.inJustDecodeBounds = true;

			// decode the file for measurement
			BitmapFactory.decodeFile(filePath, options);

			// obtain the inSampleSize for loading a
			// scaled down version of the image.
			// options.outWidth and options.outHeight
			// are the measured dimensions of the
			// original image
			options.inSampleSize = getScale(options.outWidth,
					options.outHeight, requiredWidth, requiredHeight);

			// set inJustDecodeBounds to false again
			// so that we can now actually allocate the
			// bitmap some memory
			options.inJustDecodeBounds = false;

			return options;

		}
	}
}
