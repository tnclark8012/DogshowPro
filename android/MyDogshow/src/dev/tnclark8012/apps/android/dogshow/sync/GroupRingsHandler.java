package dev.tnclark8012.apps.android.dogshow.sync;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.model.GroupRing;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.GroupRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.dogshow.shared.DogshowEnums;

public class GroupRingsHandler extends JsonHandler<GroupRing> {
	boolean clearExisting = false;
	boolean hasCleared = false;

	public GroupRingsHandler(Context context, boolean clearExisting) {
		super(context);
		this.clearExisting = clearExisting;
	}

	private static final String TAG = GroupRingsHandler.class.getSimpleName();

	public ArrayList<ContentProviderOperation> parse(GroupRing[] groupRings) {
		final ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();

		int numRings = 0;
		// // Clear out existing rings

		if (groupRings != null) {
			numRings = groupRings.length;
			Log.d(TAG, "response contained " + numRings + " group rings");

			if (clearExisting && !hasCleared) {
				batch.add(ContentProviderOperation
						.newDelete(
								DogshowContract
										.addCallerIsSyncAdapterParameter(GroupRings.CONTENT_URI))
						.build());
				hasCleared = true;
			}
			if (numRings > 0) {
				Log.i(TAG, "Updating group rings");

				for (GroupRing ring : groupRings) {
					// Insert rings info
					batch.add(ContentProviderOperation
							.newInsert(
									DogshowContract
											.addCallerIsSyncAdapterParameter(GroupRings.CONTENT_URI))
							.withValue(SyncColumns.UPDATED,
									System.currentTimeMillis())
							.withValue(GroupRings.RING_BLOCK_START,
									ring.blockStartMillis)
							.withValue(GroupRings.RING_GROUP, ring.groupName)
							.withValue(GroupRings.RING_DATE, ring.dateMillis)
							.withValue(GroupRings.RING_JUDGE, ring.judge)
							.withValue(GroupRings.RING_NUMBER, ring.ringNumber)
							.withValue(GroupRings.RING_SHOW_ID, ring.showId)
							.withValue(GroupRings.RING_TITLE, ring.title)
							.withValue(GroupRings.RING_COUNT_AHEAD,
									ring.countAhead).build());
				}
			}
		}
		return batch;
	}
}