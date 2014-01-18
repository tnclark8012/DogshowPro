package dev.tnclark8012.dogshow.apps.android.sync;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import dev.tnclark8012.dogshow.apps.android.model.BreedRing;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.dogshow.shared.DogshowEnums;

public class BreedRingsHandler extends JsonHandler<BreedRing> {
	boolean clearExisting = false;
	boolean hasCleared = false;

	protected BreedRingsHandler(Context context, boolean clearExisting) {
		super(context);
		this.clearExisting = clearExisting;
	}

	private static final String TAG = BreedRingsHandler.class.getSimpleName();
	
	

	public ArrayList<ContentProviderOperation> parse(BreedRing[] breedRings) {
		final ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();

		int numRings = 0;
		// // Clear out existing rings

		if (breedRings != null) {
				numRings = breedRings.length;
			if (clearExisting && !hasCleared) {
				batch.add(ContentProviderOperation.newDelete(DogshowContract.addCallerIsSyncAdapterParameter(BreedRings.CONTENT_URI)).build());
				hasCleared = true;
			}
			if (numRings > 0) {
				Log.i(TAG, "Updating breed rings");

				for (BreedRing ring : breedRings) {
					// Insert rings info
					batch.add(ContentProviderOperation.newInsert(DogshowContract.addCallerIsSyncAdapterParameter(BreedRings.CONTENT_URI)).withValue(SyncColumns.UPDATED, System.currentTimeMillis()).withValue(BreedRings.RING_BITCH_COUNT, ring.bitchCount).withValue(BreedRings.RING_BLOCK_START, ring.blockStartMillis).withValue(BreedRings.RING_BREED, DogshowEnums.Breeds.parse(ring.breedName).toString()).withValue(BreedRings.RING_BREED_COUNT, ring.count).withValue(BreedRings.RING_COUNT_AHEAD, ring.countAhead).withValue(BreedRings.RING_DATE, ring.dateMillis).withValue(BreedRings.RING_DOG_COUNT, ring.dogCount).withValue(BreedRings.RING_JUDGE, ring.judge).withValue(BreedRings.RING_NUMBER, ring.ringNumber).withValue(BreedRings.RING_SHOW_ID, ring.showId).withValue(BreedRings.RING_SPECIAL_BITCH_COUNT, ring.specialBitchCount).withValue(BreedRings.RING_SPECIAL_DOG_COUNT, ring.specialDogCount).build());
				}
			}
		}
		return batch;
	}
}