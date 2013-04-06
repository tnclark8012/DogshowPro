package dev.tclark.dogshow.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Utils {
	private static final SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
	public static long millisFromTimeString( Calendar base, String timeStr) throws ParseException
	{
		Calendar time = getCalendar();
		time.setTime(timeFormat.parse(timeStr));
		base.set(Calendar.HOUR, time.get(Calendar.HOUR));
		base.set(Calendar.MINUTE, time.get(Calendar.MINUTE));
		base.set(Calendar.AM_PM, time.get(Calendar.AM_PM));
		return base.getTimeInMillis();
	}
	
	public static Calendar getCalendar()
	{
		return new GregorianCalendar(TimeZone.getTimeZone("GMT"), Locale.US);
	}
}
