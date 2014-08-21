package dev.tnclark8012.apps.android.dogshow.sync;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.apps.android.dogshow.sync.response.ConformationRingAssignmentResponse;
import dev.tnclark8012.dogshow.shared.DogshowEnums;

public class RingAssignmentHandler extends JsonHandler<ConformationRingAssignmentResponse> {
	boolean clearExisting = false;
	boolean hasCleared = false;

	public RingAssignmentHandler(Context context, boolean clearExisting) {
		super(context);
		this.clearExisting = clearExisting;
	}

	private static final String TAG = RingAssignmentHandler.class.getSimpleName();

	public ArrayList<ContentProviderOperation> parse(ConformationRingAssignmentResponse[] assignments) {
		final ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();

		int numRingAssignments = 0;
		// // Clear out existing rings

		if (assignments != null) {
				numRingAssignments = assignments.length;
			if (clearExisting && !hasCleared) {
				batch.add(ContentProviderOperation.newDelete(DogshowContract.addCallerIsSyncAdapterParameter(DogshowContract.RingAssigments.CONTENT_URI)).build());
                batch.add(ContentProviderOperation.newDelete(DogshowContract.addCallerIsSyncAdapterParameter(DogshowContract.BreedRings.CONTENT_URI)).build());
				hasCleared = true;
			}
			if (numRingAssignments > 0) {
				Log.i(TAG, "Updating ring assignments");
                Builder builder;
                for (ConformationRingAssignmentResponse assignment : assignments) {
                    //Insert ring-dog assignments
                    for(String dogIdentifier : assignment.dogIdentifiers) {
                        builder = ContentProviderOperation.newInsert(DogshowContract.RingAssigments.CONTENT_URI);
                        builder.withValue(SyncColumns.UPDATED, System.currentTimeMillis());//TODO set update time once above
                        builder.withValue(DogshowContract.RingAssigments.DOG_IDENTIFIER, dogIdentifier);
                        builder.withValue(DogshowContract.RingAssigments.RING_IDENTIFIER, assignment.ring.identifier);
                        batch.add(builder.build());
                    }
                    //Insert breed ring
                    builder = ContentProviderOperation.newInsert(DogshowContract.BreedRings.CONTENT_URI);
                    builder.withValue(SyncColumns.UPDATED, System.currentTimeMillis());//TODO set update time once above
                    builder.withValue(DogshowContract.BreedRings.RING_BITCH_COUNT, assignment.ring.bitchCount);
                    builder.withValue(DogshowContract.BreedRings.RING_BLOCK_START, assignment.ring.blockStartMillis);
                    builder.withValue(DogshowContract.BreedRings.RING_BREED, DogshowEnums.Breeds.parse(assignment.ring.breedName).getPrimaryName());
                    builder.withValue(DogshowContract.BreedRings.RING_BREED_COUNT, assignment.ring.count);
                    builder.withValue(DogshowContract.BreedRings.RING_COUNT_AHEAD, assignment.ring.countAhead);
                    builder.withValue(DogshowContract.BreedRings.RING_DATE, assignment.ring.dateMillis);
                    builder.withValue(DogshowContract.BreedRings.RING_DOG_COUNT, assignment.ring.dogCount);
                    builder.withValue(DogshowContract.BreedRings.RING_JUDGE, assignment.ring.judge);
                    builder.withValue(DogshowContract.BreedRings.RING_NUMBER, assignment.ring.ringNumber);
                    builder.withValue(DogshowContract.BreedRings.RING_IDENTIFIER, assignment.ring.identifier);
                    builder.withValue(DogshowContract.BreedRings.RING_SHOW_ID, assignment.ring.showId);
                    builder.withValue(DogshowContract.BreedRings.RING_SPECIAL_BITCH_COUNT, assignment.ring.specialBitchCount);
                    builder.withValue(DogshowContract.BreedRings.RING_SPECIAL_DOG_COUNT, assignment.ring.specialDogCount);
                    builder.withValue(DogshowContract.BreedRings.RING_BREED_IS_SWEEPSTAKES,  assignment.ring.isSweepstakes);
                    builder.withValue(DogshowContract.BreedRings.RING_BREED_IS_VETERAN, assignment.ring.isVeteran);
                    builder.withValue(DogshowContract.BreedRings.RING_BREED_ATTRIBUTE, assignment.ring.attribute);
                    builder.withValue(DogshowContract.BreedRings.RING_TITLE, assignment.ring.title);
                    batch.add(builder.build());
				}
			}
		}
		return batch;
	}
}