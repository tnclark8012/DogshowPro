package dev.tnclark8012.apps.android.dogshow.util;

import java.util.List;

public class Lists {
	/**
	 * Convert to primitive array. If null, use defaultValue
	 * @param ints
	 * @param defaultValue
	 * @return
	 */
	public static int[] toArray(List<Integer> ints, int defaultValue)
	{
		int length = ints.size();
		int[] primitive = new int[length];
		Integer current;
		for(int i = 0; i < length; i++)
		{
			current = ints.get(i);
			primitive[i] = (current!=null) ?  current : defaultValue;
		}
		return primitive;
	}
}
