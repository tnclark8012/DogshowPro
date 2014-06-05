package dev.tnclark8012.apps.android.dogshow.sql;

import android.net.Uri;
import android.provider.BaseColumns;
import android.provider.ContactsContract;
import android.text.TextUtils;
import dev.tnclark8012.apps.android.dogshow.BuildConfig;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

/* Adapted from ScheduleContract.java, Google IO sched 2012
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

public class DogshowContract {

	public static final String CONTENT_AUTHORITY = "dev.tnclark8012.apps.android.dogshow";

	public static final Uri BASE_CONTENT_URI = Uri.parse("content://"
			+ CONTENT_AUTHORITY);

	private static final String PATH_DOGS = "dogs";
	private static final String PATH_ENTERED = "entered";
	private static final String PATH_HANDLERS = "handlers";
	private static final String PATH_RINGS_BREED = "breed";
	private static final String PATH_BREED_RINGS_WITH_DOGS = "with_dogs";
	private static final String PATH_BREED_RINGS_UPCOMING = "upcoming";
	private static final String PATH_RINGS_GROUP = "group";
	private static final String PATH_RINGS_JUNIORS = "juniors";
	private static final String PATH_HANDLERS_JUNIORS = "juniors";
	private static final String PATH_HANDLERS_BY_JUNIORS_CLASS = "by_class";
	private static final String PATH_RINGS = "rings";
	private static final String PATH_SHOW_TEAMS = "teams";

	/**
	 * Special value for {@link SyncColumns#UPDATED} indicating that an entry
	 * has never been updated, or doesn't exist yet.
	 */
	public static final long UPDATED_NEVER = -2;

	/**
	 * Special value for {@link SyncColumns#UPDATED} indicating that the last
	 * update time is unknown, usually when inserted from a local file source.
	 */
	public static final long UPDATED_UNKNOWN = -1;

	public interface SyncColumns {
		/** Last time this entry was updated or synchronized. */
		String UPDATED = "updated";
	}

	interface RingColumns {
		String RING_COUNT_AHEAD = "ring_count_ahead";
		String RING_DATE = "ring_date";
		String RING_BLOCK_START = "ring_block_start";
		String RING_NUMBER = "ring_number";
		/** Custom per dog millis judging timw */
		String RING_JUDGE_TIME = "ring_judge_time";
		String RING_JUDGE = "ring_judge";
		String RING_SHOW_ID = "ring_show_id";
		String RING_TITLE = "ring_title";
	}

	interface DogsColumns {
		/** unique string identifying this dog */
		String DOG_ID = "dog_id";
		/** String of the breed name */
		String DOG_BREED = "dog_breed";
		/** Dog's call name */
		String DOG_CALL_NAME = "dog_call_name";
		/** file path to dog image */
		String DOG_IMAGE_PATH = "dog_image_path";
		/** Total accumulated majors for this dog */
		String DOG_MAJORS = "dog_majors";
		/** Id of the dog owner */
		String DOG_OWNER_ID = "dog_owner_id";
		/** Total accumulated points of this dog */
		String DOG_POINTS = "dog_points";
		/** Integer identifying sex: male = 0, female = 1 */
		String DOG_SEX = "dog_sex";
		String DOG_IS_SHOWING = "dog_is_showing";
		String DOG_IS_VETERAN = "dog_is_veteran";
		String DOG_IS_CHAMPION = "dog_is_champion";
		String DOG_IS_SHOWING_SWEEPSTAKES = "dog_is_showing_sweepstakes";
		String DOG_CLASS = "dog_class";// Dog, bitch, special dog, special bitch
		String DOG_UPDATED = SyncColumns.UPDATED;
	}

	interface HandlersColumns {
		/** unique string identifying this dog */
		String HANDLER_ID = "handler_id";
		String HANDLER_NAME = "handler_name";
		String HANDLER_JUNIOR_CLASS = "handler_junior_level";
		String HANDLER_IS_SHOWING = "handler_is_showing";
		String HANDLER_IS_SHOWING_JUNIORS = "handler_is_showing_juniors";
		String HANDLER_IMAGE_PATH = "handler_image_path";
		String HANDLER_IS_ME = "handler_is_me";
	}

	interface ShowTeamsColumns {
		String SHOW_TEAM_NAME = "team_name";
		/** 0 = needs sync of credentials, 1 = OK */
		String SHOW_TEAM_STATE = "state";
		String SHOW_TEAM_ID = "team_id";
		/** ID of the entered show */
		String ENTERED_SHOW = "entered_show";
		/** 1 for show team is "Just Me" */
		String SHOW_TEAM_JUST_ME = "team_just_me";
		String SHOW_TEAM_ACTIVE = "team_is_active";
	}

	interface GroupRingsColumns {
		String RING_GROUP = "group_ring_goup";
	}

	interface BreedRingsColumns {
		String RING_BITCH_COUNT = "breed_ring_bitch_count";
		String RING_BREED = "breed_ring_breed";
		String RING_BREED_COUNT = "breed_ring_count";
		String RING_DOG_COUNT = "breed_ring_dog_count";
		String RING_SPECIAL_DOG_COUNT = "breed_ring_special_dog_count";
		String RING_SPECIAL_BITCH_COUNT = "breed_ring_special_bitch_count";
		String RING_BREED_IS_VETERAN = "breed_ring_is_veteran";
		String RING_BREED_IS_SWEEPSTAKES = "breed_ring_is_sweepstakes";
		String RING_BREED_ATTRIBUTE = "breed_ring_attribute";
	}

	interface EnteredRingsColumns {
		public static final String ENTERED_RINGS_IMAGE_PATH = "image_path";
		public static final String ENTERED_RINGS_TITLE = "title";
		public static final String ENTERED_RINGS_SUBTITLE = "subtitle";
		public static final String ENTERED_RINGS_TYPE = "ring_type";
		public static final String ENTERED_RINGS_FIRST_CLASS = "first_entered_class";
		public static final String ENTERED_RINGS_RING_COUNT = "ring_count";
		public static final String ENTERED_RINGS_DOG_COUNT = BreedRingsColumns.RING_DOG_COUNT;
		public static final String ENTERED_RINGS_BITCH_COUNT = BreedRingsColumns.RING_BITCH_COUNT;
		public static final String ENTERED_RINGS_SPECIAL_DOG_COUNT = BreedRingsColumns.RING_SPECIAL_DOG_COUNT;
		public static final String ENTERED_RINGS_SPECIAL_BITCH_COUNT = BreedRingsColumns.RING_SPECIAL_BITCH_COUNT;
	}

	interface JuniorsRingsColumns {
		String RING_JUNIOR_COUNT = "junior_ring_count";
		String RING_JUNIOR_CLASS_NAME = "junior_ring_class_name";
		String RING_JUNIOR_BREED = "junior_ring_breed";
	}

	/**
	 * Show Dogs
	 */
	public static class Dogs implements DogsColumns, SyncColumns, BaseColumns {
		public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon()
				.appendPath(PATH_DOGS).build();

		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.dogshow.dog";
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.dogshow.dog";
		public static final int MALE = 0;
		public static final int FEMALE = 1;
		public static final int CLASS_DOG = 0;
		public static final int CLASS_BITCH = 1;
		public static final int CLASS_SPECIAL_DOG = 2;
		public static final int CLASS_SPECIAL_BITCH = 3;

		public static final int getDogClass(int sex, boolean isChampion) {
			return (isChampion) ? sex + 2 : sex;
		}

		public static final String ENTERED_DOGS_BREED = "entered_dogs_breed";
		public static final String ENTERED_DOGS_NAMES = "entered_dogs_names";
		public static final String ENTERED_DOGS_FIRST_CLASS = "entered_dogs_first_class";
		/** Default "ORDER BY" clause. */
		public static final String DEFAULT_SORT = DogsColumns.DOG_CALL_NAME
				+ " COLLATE NOCASE ASC";
		public static final String SORT_NEWEST_FIRST = DogsColumns.DOG_UPDATED
				+ " DESC";

		public static Uri buildEnteredGroupedBreedUri() {
			return CONTENT_URI.buildUpon().appendPath(PATH_ENTERED).build();
		}

		// Builds selectionArgs for {@link AT_TIME_SELECTION}
		public static String[] buildAtTimeSelectionArgs(long time) {
			final String timeString = String.valueOf(time);
			return new String[] { timeString, timeString };
		}

		// Builds selectionArgs for {@link UPCOMING_SELECTION}
		public static String[] buildUpcomingSelectionArgs(long minTime) {
			return new String[] { String.valueOf(minTime) };
		}

		/** Build {@link Uri} for requested {@link #SESSION_ID}. */
		public static Uri buildDogUri(String dogId) {
			return CONTENT_URI.buildUpon().appendPath(dogId).build();
		}

		/** Read {@link #SESSION_ID} from {@link Sessions} {@link Uri}. */
		public static int getDogId(Uri uri) {
			return Utils.parseSafely(uri.getPathSegments().get(1), -1);
		}
	}

	/**
	 * Dog Handlers
	 */
	public static class Handlers implements HandlersColumns, SyncColumns,
			BaseColumns {
		public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon()
				.appendPath(PATH_HANDLERS).build();

		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.dogshow.handler";
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.dogshow.handler";
		public static final String ENTERED_JUNIOR_HANDLER_NAMES = "class_entered_handlers";

		/** Default "ORDER BY" clause. */
		public static final String DEFAULT_SORT = Handlers.HANDLER_IS_ME
				+ " DESC, " + Handlers.HANDLER_NAME + " COLLATE NOCASE ASC";
		public static final String SORT_NEWEST_FIRST = SyncColumns.UPDATED
				+ " DESC";

		/** Build {@link Uri} for requested Handler ID. */
		public static Uri buildHandlerUri(String handlerId) {
			return CONTENT_URI.buildUpon().appendPath(handlerId).build();
		}

		/** Read _ID from {@link Handlers} {@link Uri}. */
		public static int getHandlerId(Uri uri) {
			return Utils.parseSafely(uri.getPathSegments().get(1), -1);
		}

		public static Uri buildEnteredJuniorsClassesUri() {
			return CONTENT_URI.buildUpon().appendPath(PATH_HANDLERS_JUNIORS)
					.appendPath(PATH_HANDLERS_BY_JUNIORS_CLASS).build();
		}
	}

	/**
	 * Show teams
	 */
	public static class ShowTeams implements ShowTeamsColumns, SyncColumns,
			BaseColumns {
		public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon()
				.appendPath(PATH_SHOW_TEAMS).build();

		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.dogshow.team";
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.dogshow.team";

		/** Default "ORDER BY" clause. */
		public static final String DEFAULT_SORT = ShowTeams.SHOW_TEAM_JUST_ME
				+ " DESC, " + ShowTeamsColumns.SHOW_TEAM_NAME
				+ " COLLATE NOCASE ASC";

		public static final String ACTIVE_FIRST_SORT = ShowTeams.SHOW_TEAM_ACTIVE
				+ " DESC, " + DEFAULT_SORT;
		public static final String NOT_ME_SELECTION = ShowTeams.SHOW_TEAM_ID
				+ " IS NOT \"ME\"";

		/** Build {@link Uri} for requested Team ID. */
		public static Uri buildShowTeamUri(String teamId) {
			return CONTENT_URI.buildUpon().appendPath(teamId).build();
		}

		/** Read _ID from {@link Team} {@link Uri}. */
		public static int getTeamId(Uri uri) {
			return Utils.parseSafely(uri.getPathSegments().get(1), -1);
		}
	}

	public static class Rings {
		public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon()
				.appendPath(PATH_RINGS).build();
	}

	public static class EnteredRings implements BaseColumns,
			EnteredRingsColumns, RingColumns {// Constructed table
		public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon()
				.appendPath(PATH_RINGS).appendPath(PATH_ENTERED).build();
		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.dogshow.ring";
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.dogshow.ring";
		public static final String DEFAULT_SORT = RING_BLOCK_START + " ASC";
		public static final String UPCOMING_SELECTION = RING_BLOCK_START
				+ " > ? AND " + EnteredRings.ENTERED_RINGS_TYPE + " < ? ";// TODO
																			// AND
																			// " + EnteredRings.RING_BLOCK_START + "
																			// <
																			// ?";
		public static final String NO_GROUP_RINGS_SELECTION = EnteredRings.ENTERED_RINGS_TYPE
				+ " < " + EnteredRings.TYPE_CAP;

		public static String[] buildUpcomingSelectionArgs(long currTime,
				boolean showGroups) {
			return new String[] {
					String.valueOf(currTime),
					String.valueOf((showGroups) ? EnteredRings.TYPE_CAP
							: EnteredRings.TYPE_GROUP_RING) };
		}

		public static final int TYPE_BREED_RING = 0;
		public static final int TYPE_JUNIORS_RING = 1;
		public static final int TYPE_GROUP_RING = 2;
		private static final int TYPE_CAP = 3;// Update if adding another group

		// TODO upcomming selection
	}

	/**
	 * Each Ring is a show ring that consists of multiple timeblocks and breed
	 * rings
	 */
	public static class BreedRings implements RingColumns, BreedRingsColumns,
			SyncColumns, BaseColumns {

		public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon()
				.appendPath(PATH_RINGS).appendPath(PATH_RINGS_BREED).build();

		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.dogshow.ring.breed";
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.dogshow.ring.breed";

		/** Breed rings for which the user has dogs entered in the show */
		// TODO move this or rename
		public static final String ENTERED_BREED_RINGS = Dogs.DOG_IS_SHOWING
				+ "=1";
		/** Default "ORDER BY" clause. */
		public static final String DEFAULT_SORT = BreedRings.RING_BLOCK_START
				+ " ASC";

		public static final String UPCOMING_SELECTION = BreedRings.RING_BLOCK_START
				+ " > ? ";// TODO AND " + BreedRings.RING_BLOCK_START + " < ?";

		public static final String CONCAT_CALL_NAME = "group_concat(dogs.dog_call_name, \", \" ) as group_concat_call_name";

		/** Build {@link Uri} for requested Ring ID. */
		public static Uri buildRingUri(String RingId) {
			return CONTENT_URI.buildUpon().appendPath(RingId).build();
		}

		public static Uri buildEnteredRingsUri() {
			return CONTENT_URI.buildUpon()
					.appendPath(PATH_BREED_RINGS_WITH_DOGS)
					.appendPath(PATH_ENTERED).build();
		}

		// Builds selectionArgs for {@link PATH_BREED_RINGS_UPCOMING}
		public static String[] buildUpcomingSelectionArgs(long currTime) {
			return new String[] { String.valueOf((BuildConfig.DEBUG) ? 0
					: currTime) };
		}

		/** Read _ID from {@link BreedRings} {@link Uri}. */
		public static String getRingId(Uri uri) {
			return uri.getPathSegments().get(1);
		}

	}

	/**
	 * Each Ring is a show ring that consists of multiple timeblocks and group
	 * rings
	 */
	public static class GroupRings implements RingColumns, GroupRingsColumns,
			SyncColumns, BaseColumns {

		public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon()
				.appendPath(PATH_RINGS).appendPath(PATH_RINGS_GROUP).build();

		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.dogshow.ring.group";
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.dogshow.ring.group";
		/** Default "ORDER BY" clause. */
		public static final String DEFAULT_SORT = GroupRings.RING_BLOCK_START
				+ " ASC";

		public static final String UPCOMING_SELECTION = GroupRings.RING_BLOCK_START
				+ " > ? ";// TODO AND " + GroupRings.RING_BLOCK_START + " < ?";

		/** Build {@link Uri} for requested Ring ID. */
		public static Uri buildRingUri(String RingId) {
			return CONTENT_URI.buildUpon().appendPath(RingId).build();
		}

		// Builds selectionArgs for {@link PATH_GROUP_RINGS_UPCOMING}
		public static String[] buildUpcomingSelectionArgs(long currTime) {
			return new String[] { String.valueOf((BuildConfig.DEBUG) ? 0
					: currTime) };
		}

		/** Read _ID from {@link GroupRings} {@link Uri}. */
		public static String getRingId(Uri uri) {
			return uri.getPathSegments().get(1);
		}

	}

	/**
	 * Each Ring is a show ring that consists of multiple timeblocks and breed
	 * rings
	 */
	public static class JuniorsRings implements RingColumns,
			JuniorsRingsColumns, SyncColumns, BaseColumns {

		public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon()
				.appendPath(PATH_RINGS).appendPath(PATH_RINGS_JUNIORS).build();

		public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.dogshow.ring.juniors";
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.dogshow.ring.juniors";

		public static final String DEFAULT_SORT = RING_BLOCK_START + " ASC";

		public static final String UPCOMING_SELECTION = RING_BLOCK_START
				+ " > ? ";// TODO AND " + BreedRings.RING_BLOCK_START + " < ?";

		/** Build {@link Uri} for requested Ring ID. */
		public static Uri buildRingUri(String RingId) {
			return CONTENT_URI.buildUpon().appendPath(RingId).build();
		}

		public static String[] buildUpcomingSelectionArgs(long currTime) {
			return new String[] { String.valueOf(currTime) };
		}

		/** Read _ID from {@link JuniorsRings} {@link Uri}. */
		public static String getRingId(Uri uri) {
			return uri.getPathSegments().get(1);
		}

	}

	public static Uri addCallerIsSyncAdapterParameter(Uri uri) {
		return uri
				.buildUpon()
				.appendQueryParameter(ContactsContract.CALLER_IS_SYNCADAPTER,
						"true").build();
	}

	public static boolean hasCallerIsSyncAdapterParameter(Uri uri) {
		return TextUtils.equals("true",
				uri.getQueryParameter(ContactsContract.CALLER_IS_SYNCADAPTER));
	}
}
