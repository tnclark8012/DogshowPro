package dev.tnclark8012.dogshow.persistence.datastore;


public class KeyNameHelper {
	public static String generateKeyName(Object... identifiers) {
		if (identifiers.length == 0) {
			return null;
		}
		String keyName = ":";
		for (Object id : identifiers) {
			keyName += id + ":";
		}
		return keyName;
	}
}
