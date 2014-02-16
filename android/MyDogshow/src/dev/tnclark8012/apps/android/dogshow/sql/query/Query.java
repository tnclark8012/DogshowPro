package dev.tnclark8012.apps.android.dogshow.sql.query;

import dev.tnclark8012.apps.android.dogshow.adapters.RingListCursorWrapper.RingListCursorWrapperOptions;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.EnteredRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;

public class Query {
	
	public interface RingsQuery {
		int _TOKEN = 0x1;
		String[] PROJECTION = { EnteredRings._ID, EnteredRings.RING_BLOCK_START, EnteredRings.RING_COUNT_AHEAD, EnteredRings.ENTERED_RINGS_IMAGE_PATH, EnteredRings.RING_NUMBER, EnteredRings.ENTERED_RINGS_SUBTITLE, EnteredRings.ENTERED_RINGS_TITLE, EnteredRings.RING_JUDGE_TIME, EnteredRings.ENTERED_RINGS_TYPE, EnteredRings.ENTERED_RINGS_FIRST_CLASS, EnteredRings.ENTERED_RINGS_DOG_COUNT, EnteredRings.ENTERED_RINGS_BITCH_COUNT, EnteredRings.ENTERED_RINGS_SPECIAL_DOG_COUNT, EnteredRings.ENTERED_RINGS_SPECIAL_BITCH_COUNT };
		int _ID = 0;
		int BLOCK_START = 1;
		int COUNT_AHEAD = 2;
		int IMAGE_PATH = 3;
		int RING_NUMBER = 4;
		int SUBTITLE = 5;
		int TITLE = 6;
		int JUDGE_TIME = 7;
		int RING_TYPE = 8;
		int FIRST_CLASS = 9;
		int DOG_COUNT = 10;
		int BITCH_COUNT = 11;
		int SPECIAL_DOG_COUNT = 12;
		int SPECIAL_BITCH_COUNT = 13;
	}
	
	public interface UpcomingRingQuery {
		int _TOKEN = 0x2;
		String[] PROJECTION = { EnteredRings._ID, EnteredRings.ENTERED_RINGS_TITLE, EnteredRings.RING_BLOCK_START, EnteredRings.RING_NUMBER, EnteredRings.ENTERED_RINGS_IMAGE_PATH, EnteredRings.RING_COUNT_AHEAD, EnteredRings.RING_JUDGE_TIME, EnteredRings.ENTERED_RINGS_TYPE, EnteredRings.ENTERED_RINGS_FIRST_CLASS, EnteredRings.ENTERED_RINGS_DOG_COUNT, EnteredRings.ENTERED_RINGS_BITCH_COUNT, EnteredRings.ENTERED_RINGS_SPECIAL_DOG_COUNT, EnteredRings.ENTERED_RINGS_SPECIAL_BITCH_COUNT };
		int _ID = 0;
		int RING_TITLE = 1;
		int RING_BLOCK_START = 2;
		int RING_NUMBER = 3;
		int DOG_IMAGE_PATH = 4;
		int BREED_COUNT_AHEAD = 5;
		int RING_JUDGE_TIME = 6;
		int RING_TYPE = 7;
		int FIRST_CLASS = 8;
		int DOG_COUNT = 9;
		int BITCH_COUNT = 10;
		int SPECIAL_DOG_COUNT = 11;
		int SPECIAL_BITCH_COUNT = 12;
	}
	public interface DogsQuery {
		final int _TOKEN = 0x3;

		final String[] PROJECTION = { Dogs._ID, Dogs.DOG_CALL_NAME, Dogs.DOG_BREED, Dogs.DOG_IMAGE_PATH, Dogs.DOG_IS_SHOWING, Dogs.DOG_CLASS};

		int _ID = 0;
		int DOG_CALL_NAME = 1;
		int DOG_BREED = 2;
		int DOG_IMAGE_PATH = 3;
		int DOG_IS_SHOWING = 4;
		int DOG_CLASS = 5;
	}
	
	public interface HandlersQuery {
		int _TOKEN = 0x4;

		String[] PROJECTION = { Handlers._ID, Handlers.HANDLER_NAME, Handlers.HANDLER_JUNIOR_CLASS, Handlers.HANDLER_IMAGE_PATH };
		int _ID = 0;
		int HANDLER_NAME = 1;
		int HANDLER_JUNIOR_LEVEL = 2;
		int HANDLER_IMAGE_PATH = 3;
	}

}