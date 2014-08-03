package dev.tnclark8012.apps.android.dogshow.sync;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.model.RingBlockOverview;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.RingBlocks;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public class RingBlockOverviewHandler extends JsonHandler<RingBlockOverview> {
	boolean clearExisting = false;
	boolean hasCleared = false;

	public RingBlockOverviewHandler(Context context, boolean clearExisting) {
		super(context);
		this.clearExisting = clearExisting;
	}

	private static final String TAG = RingBlockOverviewHandler.class.getSimpleName();

	public ArrayList<ContentProviderOperation> parse(RingBlockOverview[] ringBlockOverviews) {
		final ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();

		int numRings = 0;
		// // Clear out existing rings

		if (ringBlockOverviews != null) {
			numRings = ringBlockOverviews.length;
			Log.d(TAG, "response contained " + numRings + " ring overviews");

			if (clearExisting && !hasCleared) {
				batch.add(ContentProviderOperation
						.newDelete(
								DogshowContract
										.addCallerIsSyncAdapterParameter(RingBlocks.CONTENT_URI))//TODO BlockRings vs. RingBlocks vs. RingBlockOverviews
						.build());
				hasCleared = true;
			}
			if (numRings > 0) {
				Log.i(TAG, "Updating ring overviews");

				for (RingBlockOverview ring : ringBlockOverviews) {
					// Insert rings info
					batch.add(ContentProviderOperation
							.newInsert(
									DogshowContract
											.addCallerIsSyncAdapterParameter(RingBlocks.CONTENT_URI))
							.withValue(SyncColumns.UPDATED,
									Utils.currentTimeUtc())
							.withValue(RingBlocks.BLOCK_START,
									ring.blockStart)
							.withValue(RingBlocks.JUDGE_NAME, ring.judge)
							.withValue(RingBlocks.RING_NUMBER, ring.ringNumber)
							.withValue(RingBlocks.TITLE, ring.title)
							.withValue(RingBlocks.COUNT_AHEAD,
									ring.countAhead).build());
				}
			}
		}
		return batch;
	}
}