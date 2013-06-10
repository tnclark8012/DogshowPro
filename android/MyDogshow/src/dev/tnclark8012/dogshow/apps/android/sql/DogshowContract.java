package dev.tnclark8012.dogshow.apps.android.sql;

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
    private static final String PATH_ENTERED = "entered";
    private static final String PATH_HANDLERS = "handlers";
    private static final String PATH_RINGS_BREED = "breed";
    private static final String PATH_BREED_RINGS_WITH_DOGS = "with_dogs";
    private static final String PATH_BREED_RINGS_UPCOMING = "upcoming";
    private static final String PATH_RINGS_GROUP = "group";
    private static final String PATH_RINGS_JUNIORS = "juniors";
    private static final String PATH_HANDLERS_JUNIORS= "juniors";
    private static final String PATH_HANDLERS_BY_JUNIORS_CLASS = "by_class";
    private static final String PATH_RINGS = "rings";
    
    
    
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
    	public static final String RING_COUNT_AHEAD = "ring_count_ahead";
    	public static final String RING_DATE = "ring_date";
    	public static final String RING_BLOCK_START = "ring_block_start";
    	public static final String RING_NUMBER = "ring_number";
    	public static final String RING_JUDGE_TIME = "ring_judge_time";
    	public static final String RING_JUDGE = "ring_judge";
    	public static final String RING_SHOW_ID = "ring_show_id";
    }

    interface DogsColumns {
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
        String DOG_IS_SHOWING = "dog_showing";
        String DOG_UPDATED = SyncColumns.UPDATED;
    }
    
    interface HandlersColumns {
    	String HANDLER_NAME = "handler_name";
    	String HANDLER_JUNIOR_CLASS = "handler_junior_level";
    	String HANDLER_IS_SHOWING = "handler_is_showing";
    	String HANDLER_IS_SHOWING_JUNIORS = "handler_is_showing_juniors";
    }
    
    interface BreedRingsColumns {
    	String RING_BITCH_COUNT = "breed_ring_bitch_count";
       	String RING_BREED = "breed_ring_breed";
    	String RING_BREED_COUNT = "breed_ring_count";
       	String RING_DOG_COUNT = "breed_ring_dog_count";
    	String RING_SPECIAL_DOG_COUNT = "breed_ring_special_dog_count";
    	String RING_SPECIAL_BITCH_COUNT = "breed_ring_special_bitch_count";
    }
    
    interface EnteredRingsColumns {
    	public static final String ENTERED_RINGS_IMAGE_PATH = "image_path";
    	public static final String ENTERED_RINGS_TITLE = "title";
    	public static final String ENTERED_RINGS_SUBTITLE = "subtitle";
    	public static final String ENTERED_RINGS_TYPE = "ring_type";
    }
    
    interface JuniorsRingsColumns {
    	String RING_JUNIOR_COUNT = "junior_ring_count";
    	String RING_JUNIOR_CLASS_NAME = "junior_ring_class_name";
    }
    
    /**
     * Show Dogs
     */
    public static class Dogs implements DogsColumns,
            SyncColumns, BaseColumns {
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_DOGS).build();
        
        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/vnd.dogshow.dog";
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/vnd.dogshow.dog";
        public static final int MALE = 1;
        public static final int FEMALE = 0;
        public static final String ENTERED_DOGS_BREED = "entered_dogs_breed";
        public static final String ENTERED_DOGS_NAMES = "entered_dogs_names";
        /** Default "ORDER BY" clause. */
        public static final String DEFAULT_SORT = DogsColumns.DOG_CALL_NAME + " COLLATE NOCASE ASC";

		public static Uri buildEnteredGroupedBreedUri()
		{
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
        public static String getDogId(Uri uri) {
            return uri.getPathSegments().get(1);
        }
    }

    /**
     * Each session is a block of time that has a {@link Tracks}, a
     * {@link Rooms}, and zero or more {@link Speakers}.
     */
    public static class Handlers implements HandlersColumns,
            SyncColumns, BaseColumns {
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_HANDLERS).build();
       
        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/vnd.dogshow.handler";
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/vnd.dogshow.handler";
        public static final String ENTERED_JUNIOR_HANDLER_NAMES = "class_entered_handlers";

        /** Default "ORDER BY" clause. */
        public static final String DEFAULT_SORT = HandlersColumns.HANDLER_NAME + " COLLATE NOCASE ASC";
        
        /** Build {@link Uri} for requested Handler ID. */
        public static Uri buildHandlerUri(String handlerId) {
            return CONTENT_URI.buildUpon().appendPath(handlerId).build();
        }

        /** Read _ID from {@link Handlers} {@link Uri}. */
        public static String getHandlerId(Uri uri) {
            return uri.getPathSegments().get(1);
        }
        
        public static Uri buildEnteredJuniorsClassesUri()
        {
        	return CONTENT_URI.buildUpon().appendPath(PATH_HANDLERS_JUNIORS).appendPath(PATH_HANDLERS_BY_JUNIORS_CLASS).build();
        }
    }
    public static class EnteredRings implements BaseColumns, EnteredRingsColumns, RingColumns{//Constructed table
    	public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_RINGS).appendPath(PATH_ENTERED).build();
    	public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/vnd.dogshow.ring";
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/vnd.dogshow.ring";
    	public static final String DEFAULT_SORT =  RING_BLOCK_START + " ASC";
    	public static final String UPCOMING_SELECTION = RING_BLOCK_START + " > ? ";//TODO AND " + BreedRings.RING_BLOCK_START + " < ?";
    	public static String[] buildUpcomingSelectionArgs(long currTime ) {
            return new String[] { String.valueOf(currTime) };
        }
    	public static final int TYPE_BREED_RING = 0;
    	public static final int TYPE_JUNIORS_RING = 1;
    	
    	//TODO upcomming selection
    }
    
    /**
     * Each Ring is a show ring that consists of multiple timeblocks and breed rings
     */
    public static class BreedRings implements RingColumns, BreedRingsColumns,
            SyncColumns, BaseColumns {
    	
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RINGS).appendPath(PATH_RINGS_BREED).build();
       
        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/vnd.dogshow.ring.breed";
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/vnd.dogshow.ring.breed";
        
        /** Breed rings for which the user has dogs entered in the show*/
        //TODO move this or rename
        public static final String ENTERED_BREED_RINGS = Dogs.DOG_IS_SHOWING + " IS NOT NULL AND " + Dogs.DOG_IS_SHOWING + "=1";
        /** Default "ORDER BY" clause. */
        public static final String DEFAULT_SORT = BreedRings.RING_BLOCK_START + " ASC";

		public static final String UPCOMING_SELECTION = BreedRings.RING_BLOCK_START + " > ? ";//TODO AND " + BreedRings.RING_BLOCK_START + " < ?";

		public static final String CONCAT_CALL_NAME = "group_concat(dogs.dog_call_name, \", \" ) as group_concat_call_name";
        
        /** Build {@link Uri} for requested Ring ID. */
        public static Uri buildRingUri(String RingId) {
            return CONTENT_URI.buildUpon().appendPath(RingId).build();
        }
        
        public static Uri buildEnteredRingsUri()
        {
        	return CONTENT_URI.buildUpon().appendPath(PATH_BREED_RINGS_WITH_DOGS).appendPath(PATH_ENTERED).build();
        }

     // Builds selectionArgs for {@link PATH_BREED_RINGS_UPCOMING}
		public static String[] buildUpcomingSelectionArgs(long currTime ) {
            return new String[] { String.valueOf(currTime) };
        }
        

        /** Read _ID from {@link BreedRings} {@link Uri}. */
        public static String getRingId(Uri uri) {
            return uri.getPathSegments().get(1);
        }

    }
    
    /**
     * Each Ring is a show ring that consists of multiple timeblocks and breed rings
     */
    public static class JuniorsRings implements RingColumns, JuniorsRingsColumns,
            SyncColumns, BaseColumns {
    	
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_RINGS).appendPath(PATH_RINGS_JUNIORS).build();
       
        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/vnd.dogshow.ring.juniors";
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/vnd.dogshow.ring.juniors";
        
        
        public static final String DEFAULT_SORT = RING_BLOCK_START + " ASC";

		public static final String UPCOMING_SELECTION = RING_BLOCK_START + " > ? ";//TODO AND " + BreedRings.RING_BLOCK_START + " < ?";

        
        /** Build {@link Uri} for requested Ring ID. */
        public static Uri buildRingUri(String RingId) {
            return CONTENT_URI.buildUpon().appendPath(RingId).build();
        }

		public static String[] buildUpcomingSelectionArgs(long currTime ) {
            return new String[] { String.valueOf(currTime) };
        }
        
        /** Read _ID from {@link JuniorsRings} {@link Uri}. */
        public static String getRingId(Uri uri) {
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
}
