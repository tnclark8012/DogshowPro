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

package dev.tnclark8012.dogshow.apps.android;

import dev.tnclark8012.dogshow.apps.android.model.BreedRing;
import dev.tnclark8012.dogshow.apps.android.model.JuniorsRing;

public class Config {
	public interface IApiAccessor
	{
		String buildGetBreedRingsUrl(String showId);
		String buildGetBreedRingsUrl(String showId, String breed);
		String buildGetJuniorRingsUrl(String showId, String juniorClass);
		String getBaseUrl();
		String getShowsUrl();
		BreedRing[] getBreedRings(String showId, String breed);
		JuniorsRing[] getJuniorsRings(String showId, String className);
	}
	// OAuth 2.0 related config
	public static final String APP_NAME = "Your-App-Name";
	public static final String API_KEY = "API_KEY"; // from the APIs console
	public static final String CLIENT_ID = "0000000000000.apps.googleusercontent.com"; // from
																				// the
																						// APIs
																				// console
	public static final boolean DEBUG_LOCAL = true;
	public static final boolean DEBUG_OFFLINE = false;//TODO implement
	// Conference API-specific config
	// NOTE: the backend used for the Google I/O 2012 Android app is not
	// currently open source, so
	// you should modify these fields to reflect your own backend.
	private static final String CONFERENCE_API_KEY = "API_KEY";
	private static final String ROOT_EVENT_ID = "googleio2012";


	// Static file host for the sandbox data
	public static final String GET_SANDBOX_URL = "https://developers.google.com/events/io/sandbox-data";

	// YouTube API config
	public static final String YOUTUBE_API_KEY = "API_KEY";
	// YouTube share URL
	public static final String YOUTUBE_SHARE_URL_PREFIX = "http://youtu.be/";

	// Livestream captions config
	public static final String PRIMARY_LIVESTREAM_CAPTIONS_URL = "TODO";
	public static final String SECONDARY_LIVESTREAM_CAPTIONS_URL = "TODO";
	public static final String PRIMARY_LIVESTREAM_TRACK = "android";
	public static final String SECONDARY_LIVESTREAM_TRACK = "chrome";

	// GCM config
	public static final String GCM_SERVER_URL = "https://yourapp-gcm.appspot.com";
	public static final String GCM_SENDER_ID = "0000000000000"; // project ID
																// from the APIs
																// console
	public static final String TAG = Config.class.getName();
}
