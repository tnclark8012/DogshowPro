package dev.tnclark8012.dogshow.apps.android.sync;

import java.util.ArrayList;

import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.SyncColumns;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.util.Log;

public class RingHandler {
	private static final String TAG = RingHandler.class.getSimpleName();

	public RingHandler(Context context) {

	}

	public ArrayList<ContentProviderOperation> parse(String showId,
			long dateMillis, String judge, int ringNumber,
			long blockStartMillis, int count, String breedName,
			int dogCount, int bitchCount, int specialDog, int specialBitch,
			int countAhead) {
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		ContentProviderOperation.Builder builder = null;
			Log.v(TAG, "new ring");
			builder = ContentProviderOperation.newInsert(DogshowContract
					.addCallerIsSyncAdapterParameter(BreedRings.CONTENT_URI));
		// TODO handle NULL alloweds

		builder.withValue(SyncColumns.UPDATED, System.currentTimeMillis())

		.withValue(BreedRings.RING_SHOW_ID, showId)
		.withValue(BreedRings.RING_BITCH_COUNT, bitchCount)
		.withValue(BreedRings.RING_BLOCK_START, blockStartMillis)
		.withValue(BreedRings.RING_BREED, breedName)
		.withValue(BreedRings.RING_BREED_COUNT, count)
		.withValue(BreedRings.RING_COUNT_AHEAD, countAhead)
		.withValue(BreedRings.RING_DOG_COUNT, dogCount)
		.withValue(BreedRings.RING_JUDGE, judge)
		.withValue(BreedRings.RING_NUMBER, ringNumber)
		.withValue(BreedRings.RING_SPECIAL_BITCH_COUNT, specialBitch)
		.withValue(BreedRings.RING_SPECIAL_DOG_COUNT, specialDog)
		.withValue(BreedRings.RING_DATE, dateMillis)
		.withValue(Dogs.UPDATED, System.currentTimeMillis());
		batch.add(builder.build());
		return batch;
	}
}
