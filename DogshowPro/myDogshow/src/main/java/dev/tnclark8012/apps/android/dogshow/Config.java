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

package dev.tnclark8012.apps.android.dogshow;

import java.net.URL;

import dev.tnclark8012.apps.android.dogshow.model.BreedRing;
import dev.tnclark8012.apps.android.dogshow.model.Dog;
import dev.tnclark8012.apps.android.dogshow.model.GroupRing;
import dev.tnclark8012.apps.android.dogshow.model.Handler;
import dev.tnclark8012.apps.android.dogshow.model.JuniorsRing;
import dev.tnclark8012.apps.android.dogshow.model.RingBlockOverview;
import dev.tnclark8012.apps.android.dogshow.model.Show;
import dev.tnclark8012.apps.android.dogshow.sync.response.ConformationRingAssignmentResponse;
import dev.tnclark8012.apps.android.dogshow.sync.response.DogSyncResponse;
import dev.tnclark8012.apps.android.dogshow.sync.response.HandlerSyncResponse;
import dev.tnclark8012.apps.android.dogshow.sync.response.ShowTeamResponse;
import dev.tnclark8012.apps.android.dogshow.sync.response.ShowTeamSyncResponse;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class Config {

    public static final boolean DEBUG_OFFLINE = false;// TODO implement
    public static final boolean SYNC_ENABLED = true;// TODO implement

    public static final String TAG =  makeLogTag(Config.class);
	public interface IApiAccessor {
		URL buildGetBreedRingsUrl(String showId);

		URL buildGetBreedRingsUrl(String showId, String breed, Boolean veteran,
				Boolean sweepstakes);
        URL buildGetRingAssignmentsUrl( String showId );

		URL buildGetJuniorRingsUrl(String showId, String juniorClass);
		URL buildGetRingBlockOverviewsUrl(String showId, int ringNumber, long blockStart);

		URL getBaseUrl();

		URL getShowsUrl();

		BreedRing[] getBreedRings(String showId, String breed, Boolean veteran,
				Boolean sweepstakes);
        ConformationRingAssignmentResponse[] getBreedRingAssignments(String showId, Dog[] dogs);

		JuniorsRing[] getJuniorsRings(String showId, String className);

		Show[] getShows();

		URL getRegistrationUrl();

		String register(String account, String token, String provider,
				String installId, String gcmId);

		/**
		 * Send dogs (new and updated) to the server.
		 * 
		 * @return dogs which were updated server-side since last sync
		 */
		DogSyncResponse[] syncDogs(String userId, String teamIdentifier,
				long lastSync, Dog[] dogs, String[] currentDogIds);

		HandlerSyncResponse[] syncHandlers(String userId,
				String teamIdentifier, long lastSync, Handler[] handler,
				String[] currentHandlerIds);

		ShowTeamSyncResponse[] syncShowTeams(String userId, long lastSync,
				String[] currentTeamIds);

		ShowTeamResponse createShowTeam(String userId, String teamName,
				String password);

		ShowTeamResponse joinShowTeam(String userId, String teamName,
				String password);

		GroupRing[] getGroupRings(String showId);
		RingBlockOverview[] getRingBlockOverviews(String showId, int ringNumber, long blockStart);
	}
}
