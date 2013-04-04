package dev.tnclark8012.dogshow.apps.android.sync;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import dev.tnclark8012.dogshow.apps.android.model.BreedRing;
import dev.tnclark8012.dogshow.apps.android.model.BreedRingsResponse;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.SyncColumns;

public class BreedRingsHandler extends JsonHandler{
	protected BreedRingsHandler(Context context) {
		super(context);
	}

	private static final String TAG = BreedRingsHandler.class.getSimpleName();


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
	
	public ArrayList<ContentProviderOperation> parse(String jsonStr)
	{
		final ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		batch.add(ContentProviderOperation
                .newDelete(DogshowContract.addCallerIsSyncAdapterParameter(
                        BreedRings.CONTENT_URI)).build());
			BreedRingsResponse response = new Gson().fromJson(jsonStr, BreedRingsResponse.class);
			int numRings = 0;
	        if (response.breedRings != null) {
	            numRings = response.breedRings.length;
	        }

	        if (numRings > 0) {
	            Log.i(TAG, "Updating breed rings");

	            // Clear out existing speakers
	            batch.add(ContentProviderOperation
	                    .newDelete(DogshowContract.addCallerIsSyncAdapterParameter(
	                            BreedRings.CONTENT_URI))
	                    .build());

	            for (BreedRing ring : response.breedRings) {
	                // Insert rings info
	                batch.add(ContentProviderOperation
	                        .newInsert(DogshowContract
	                                .addCallerIsSyncAdapterParameter(BreedRings.CONTENT_URI))
	                        .withValue(SyncColumns.UPDATED, System.currentTimeMillis())
	                        .withValue(BreedRings.RING_BITCH_COUNT, ring.bitchCount)
	                        .withValue(BreedRings.RING_BLOCK_START, ring.blockStartMillis)
	                        .withValue(BreedRings.RING_BREED, ring.breed)
	                        .withValue(BreedRings.RING_BREED_COUNT, ring.count)
	                        .withValue(BreedRings.RING_COUNT_AHEAD, ring.countAhead)
	                        .withValue(BreedRings.RING_DATE, ring.dateMillis)
	                        .withValue(BreedRings.RING_DOG_COUNT, ring.dogCount)
	                        .withValue(BreedRings.RING_JUDGE, ring.judge)
	                        .withValue(BreedRings.RING_NUMBER, ring.ringNumber)
	                        .withValue(BreedRings.RING_SHOW_ID, ring.showId)
	                        .withValue(BreedRings.RING_SPECIAL_BITCH_COUNT, ring.specialBitchCount)
	                        .withValue(BreedRings.RING_SPECIAL_DOG_COUNT, ring.specialDogCount)
	                        .build());
	            }
	        }
	        return batch;
	}
}
