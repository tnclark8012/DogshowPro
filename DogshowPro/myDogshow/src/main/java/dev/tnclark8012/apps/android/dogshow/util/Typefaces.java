package dev.tnclark8012.apps.android.dogshow.util;

import android.graphics.Typeface;

import java.util.Hashtable;

public class Typefaces {
	private static final String TAG = "Typefaces";

	private static final Hashtable<String, Typeface> cache = new Hashtable<String, Typeface>();
	public static Typeface SANS_SERIF_LIGHT = Typeface.create("sans-serif-light", Typeface.NORMAL);
}