package dev.tnclark8012.apps.android.dogshow.sync;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

import dev.tnclark8012.apps.android.dogshow.model.JuniorsRing;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.dogshow.shared.DogshowEnums;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class JuniorsRingsHandler extends JsonHandler<JuniorsRing> {
	boolean clearExisting = false;
	boolean hasCleared = false;

	public JuniorsRingsHandler(Context context, boolean clearExisting) {
		super(context);
		this.clearExisting = clearExisting;
	}

	private static final String TAG = makeLogTag(JuniorsRingsHandler.class);

	public ArrayList<ContentProviderOperation> parse(JuniorsRing[] juniorsRings) {
		final ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();

		int numRings = 0;
		// // Clear out existing rings

		if (juniorsRings != null) {
			numRings = juniorsRings.length;
			LOGD(TAG, "response contained " + numRings + " juniors rings");

			if (clearExisting && !hasCleared) {
				batch.add(ContentProviderOperation
						.newDelete(
								DogshowContract
										.addCallerIsSyncAdapterParameter(JuniorsRings.CONTENT_URI))
						.build());
				hasCleared = true;
			}
			if (numRings > 0) {
				LOGI(TAG, "Updating juniors rings");

				for (JuniorsRing ring : juniorsRings) {
					// Insert rings info
					batch.add(ContentProviderOperation
							.newInsert(
									DogshowContract
											.addCallerIsSyncAdapterParameter(JuniorsRings.CONTENT_URI))
							.withValue(SyncColumns.UPDATED,
									System.currentTimeMillis())
							.withValue(JuniorsRings.RING_BLOCK_START,
									ring.blockStartMillis)
                            .withValue(JuniorsRings.RING_IDENTIFIER, ring.identifier)
							.withValue(
									JuniorsRings.RING_JUNIOR_CLASS_NAME,
									DogshowEnums.JuniorClass.parse(
											ring.className).toString())
							.withValue(JuniorsRings.RING_JUNIOR_COUNT,
									ring.count)
							.withValue(JuniorsRings.RING_COUNT_AHEAD,
									ring.countAhead)
							.withValue(JuniorsRings.RING_DATE, ring.dateMillis)
							.withValue(JuniorsRings.RING_JUDGE, ring.judge)
							.withValue(JuniorsRings.RING_NUMBER,
									ring.ringNumber)
							.withValue(JuniorsRings.RING_SHOW_ID, ring.showId)
							.withValue(JuniorsRings.RING_TITLE, ring.title)
							.withValue(JuniorsRings.RING_JUNIOR_BREED, ring.breedName)
							.build());
				}
			}
		}
		return batch;
	}
}