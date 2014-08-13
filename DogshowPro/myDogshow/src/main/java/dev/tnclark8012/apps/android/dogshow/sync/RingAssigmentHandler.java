package dev.tnclark8012.apps.android.dogshow.sync;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

import dev.tnclark8012.apps.android.dogshow.model.ConformationRingAssignment;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.BreedRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.SyncColumns;

public class RingAssigmentHandler extends JsonHandler<ConformationRingAssignment> {
	boolean clearExisting = false;
	boolean hasCleared = false;

	public RingAssigmentHandler(Context context, boolean clearExisting) {
		super(context);
		this.clearExisting = clearExisting;
	}

	private static final String TAG = RingAssigmentHandler.class.getSimpleName();

	public ArrayList<ContentProviderOperation> parse(ConformationRingAssignment[] assignments) {
		final ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();

		int numRings = 0;
		// // Clear out existing rings

		if (assignments != null) {
				numRings = assignments.length;
			if (clearExisting && !hasCleared) {
				batch.add(ContentProviderOperation.newDelete(DogshowContract.addCallerIsSyncAdapterParameter(BreedRings.CONTENT_URI)).build());
				hasCleared = true;
			}
			if (numRings > 0) {
				Log.i(TAG, "Updating ring assignments");

				for (ConformationRingAssignment assignment : assignments) {
                    Builder builder = ContentProviderOperation.newInsert(DogshowContract.RingAssigments.CONTENT_URI);
					builder.withValue(SyncColumns.UPDATED, System.currentTimeMillis());//TODO set update time once above
                    builder.withValue(DogshowContract.RingAssigments.DOG_IDENTIFIER, assignment.dogIdentifier );
                    builder.withValue(DogshowContract.RingAssigments.RING_IDENTIFIER, assignment.ringIdentifier);
					batch.add(builder.build());
				}
			}
		}
		return batch;
	}
}