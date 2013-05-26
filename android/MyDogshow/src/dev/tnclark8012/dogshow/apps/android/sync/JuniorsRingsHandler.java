package dev.tnclark8012.dogshow.apps.android.sync;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import dev.tnclark8012.dogshow.apps.android.model.JuniorsRing;
import dev.tnclark8012.dogshow.apps.android.model.JuniorsRingsResponse;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.SyncColumns;

public class JuniorsRingsHandler extends JsonHandler {
	boolean clearExisting = false;
	boolean hasCleared = false;

	protected JuniorsRingsHandler(Context context, boolean clearExisting) {
		super(context);
		this.clearExisting = clearExisting;
	}

	private static final String TAG = JuniorsRingsHandler.class.getSimpleName();
	
	

	public ArrayList<ContentProviderOperation> parse(String jsonStr) {
		final ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();

		JuniorsRingsResponse response = new Gson().fromJson(jsonStr, JuniorsRingsResponse.class);
		int numRings = 0;
		// // Clear out existing rings

		if (response != null) {
			if (response.juniorsRings != null) {
				numRings = response.juniorsRings.length;
			}
			if (clearExisting && !hasCleared) {
				batch.add(ContentProviderOperation.newDelete(DogshowContract.addCallerIsSyncAdapterParameter(JuniorsRings.CONTENT_URI)).build());
				hasCleared = true;
			}
			if (numRings > 0) {
				Log.i(TAG, "Updating breed rings");

				for (JuniorsRing ring : response.juniorsRings) {
					// Insert rings info
					batch.add(ContentProviderOperation.newInsert(DogshowContract.addCallerIsSyncAdapterParameter(JuniorsRings.CONTENT_URI))
							.withValue(SyncColumns.UPDATED, System.currentTimeMillis())
							.withValue(JuniorsRings.RING_BLOCK_START, ring.blockStartMillis)
							.withValue(JuniorsRings.RING_JUNIOR_CLASS_NAME, ring.className)
							.withValue(JuniorsRings.RING_JUNIOR_COUNT, ring.count)
							.withValue(JuniorsRings.RING_COUNT_AHEAD, ring.countAhead)
							.withValue(JuniorsRings.RING_DATE, ring.dateMillis)
							.withValue(JuniorsRings.RING_JUDGE, ring.judge)
							.withValue(JuniorsRings.RING_NUMBER, ring.ringNumber)
							.withValue(JuniorsRings.RING_SHOW_ID, ring.showId).build());
				}
			}
		}
		return batch;
	}
}