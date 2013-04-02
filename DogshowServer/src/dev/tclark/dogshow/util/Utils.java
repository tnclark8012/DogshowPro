package dev.tclark.dogshow.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Utils {
	private static final SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
	public static long millisFromTimeString( Calendar base, String timeStr) throws ParseException
	{
		Calendar time = new GregorianCalendar(Locale.US);
		time.setTime(timeFormat.parse(timeStr));
		base.set(Calendar.HOUR, time.get(Calendar.HOUR));
		base.set(Calendar.MINUTE, time.get(Calendar.MINUTE));
		base.set(Calendar.AM_PM, time.get(Calendar.AM_PM));
		return base.getTimeInMillis();
	}
}
