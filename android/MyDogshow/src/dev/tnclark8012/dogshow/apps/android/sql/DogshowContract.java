package dev.tnclark8012.dogshow.apps.android.sql;

import java.util.List;

import android.net.Uri;
import android.provider.BaseColumns;
import android.provider.ContactsContract;
import android.text.TextUtils;

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

    public static final String CONTENT_AUTHORITY = "dev.tnclark8012.dogshow.apps.android";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    
    private static final String PATH_DOGS = "dogs";
    
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

    interface DogsColumns {
        /** Unique string identifying this dog. */
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
        /** Integer identifying sex: male = 0, female = 1*/
        String DOG_SEX = "dog_sex";
        String DOG_UPDATED = SyncColumns.UPDATED;
    }
    
    /**
     * Each session is a block of time that has a {@link Tracks}, a
     * {@link Rooms}, and zero or more {@link Speakers}.
     */
    public static class Dogs implements DogsColumns,
            SyncColumns, BaseColumns {
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_DOGS).build();
        

        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/vnd.dogshow.dog";
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/vnd.dogshow.dog";

        /** Default "ORDER BY" clause. */
        public static final String DEFAULT_SORT = DogsColumns.DOG_CALL_NAME + " COLLATE NOCASE ASC";

        // Builds selectionArgs for {@link AT_TIME_SELECTION}
        public static String[] buildAtTimeSelectionArgs(long time) {
            final String timeString = String.valueOf(time);
            return new String[] { timeString, timeString };
        }

//        // Used to fetch upcoming sessions
//        public static final String UPCOMING_SELECTION =
//                BLOCK_START + " = (select min(" + BLOCK_START + ") from " +
//                ScheduleDatabase.Tables.BLOCKS_JOIN_SESSIONS + " where " + LIVESTREAM_SELECTION +
//                " and " + BLOCK_START + " >" + " ?)";

        // Builds selectionArgs for {@link UPCOMING_SELECTION}
        public static String[] buildUpcomingSelectionArgs(long minTime) {
            return new String[] { String.valueOf(minTime) };
        }

        /** Build {@link Uri} for requested {@link #SESSION_ID}. */
        public static Uri buildDogUri(String dogId) {
            return CONTENT_URI.buildUpon().appendPath(dogId).build();
        }

        /** Read {@link #SESSION_ID} from {@link Sessions} {@link Uri}. */
        public static String getDogId(Uri uri) {
            return uri.getPathSegments().get(1);
        }
    }

    public static Uri addCallerIsSyncAdapterParameter(Uri uri) {
        return uri.buildUpon().appendQueryParameter(
                ContactsContract.CALLER_IS_SYNCADAPTER, "true").build();
    }

    public static boolean hasCallerIsSyncAdapterParameter(Uri uri) {
        return TextUtils.equals("true",
                uri.getQueryParameter(ContactsContract.CALLER_IS_SYNCADAPTER));
    }
    public static class Rings
    {
    	
    }
}
