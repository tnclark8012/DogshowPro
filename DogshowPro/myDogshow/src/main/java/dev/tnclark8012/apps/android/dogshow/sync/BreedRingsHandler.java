package dev.tnclark8012.apps.android.dogshow.sync;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

import dev.tnclark8012.apps.android.dogshow.model.BreedRing;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.BreedRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.dogshow.shared.DogshowEnums;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class BreedRingsHandler extends JsonHandler<BreedRing> {
    private static final String TAG =  makeLogTag(BreedRingsHandler.class);
	boolean clearExisting = false;
	boolean hasCleared = false;

	public BreedRingsHandler(Context context, boolean clearExisting) {
		super(context);
		this.clearExisting = clearExisting;
	}



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
				LOGI(TAG, "Updating breed rings");

				for (BreedRing ring : breedRings) {
					// Insert rings info
					Builder builder = ContentProviderOperation.newInsert(BreedRings.CONTENT_URI);
					builder.withValue(SyncColumns.UPDATED, System.currentTimeMillis());//TODO set update time once above
					builder.withValue(BreedRings.RING_BITCH_COUNT, ring.bitchCount);
					builder.withValue(BreedRings.RING_BLOCK_START, ring.blockStartMillis);
					builder.withValue(BreedRings.RING_BREED, DogshowEnums.Breeds.parse(ring.breedName).getPrimaryName());
					builder.withValue(BreedRings.RING_BREED_COUNT, ring.count);
					builder.withValue(BreedRings.RING_COUNT_AHEAD, ring.countAhead);
					builder.withValue(BreedRings.RING_DATE, ring.dateMillis);
					builder.withValue(BreedRings.RING_DOG_COUNT, ring.dogCount);
					builder.withValue(BreedRings.RING_JUDGE, ring.judge);
					builder.withValue(BreedRings.RING_NUMBER, ring.ringNumber);
                    builder.withValue(BreedRings.RING_IDENTIFIER, ring.identifier);
					builder.withValue(BreedRings.RING_SHOW_ID, ring.showId);
					builder.withValue(BreedRings.RING_SPECIAL_BITCH_COUNT, ring.specialBitchCount);
					builder.withValue(BreedRings.RING_SPECIAL_DOG_COUNT, ring.specialDogCount);
					builder.withValue(BreedRings.RING_BREED_IS_SWEEPSTAKES,  ring.isSweepstakes);
					builder.withValue(BreedRings.RING_BREED_IS_VETERAN, ring.isVeteran);
					builder.withValue(BreedRings.RING_BREED_ATTRIBUTE, ring.attribute);
					builder.withValue(BreedRings.RING_TITLE, ring.title);
					batch.add(builder.build());
				}
			}
		}
		return batch;
	}
}