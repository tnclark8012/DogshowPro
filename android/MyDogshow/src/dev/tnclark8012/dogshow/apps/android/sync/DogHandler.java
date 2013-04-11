package dev.tnclark8012.dogshow.apps.android.sync;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.util.Log;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.dogshow.apps.android.util.Utils;

public class DogHandler {
	private static final String TAG = DogHandler.class.getSimpleName();

	public static enum ParseMode {
		NEW, UPDATE
	};

	public DogHandler(Context context) {

	}
	/** TODO move update (eliminating parsemode) to {@link SyncHelper#updateDog(java.util.Map, String, String[])}*/
	public ArrayList<ContentProviderOperation> parse(ParseMode mode, String dogId, String breedName, String callName, String imagePath, String majors, String points, String ownerId, int sex) {
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		ContentProviderOperation.Builder builder = null;
		switch (mode) {
		case NEW:
			Log.v(TAG, "new dog");
			Log.w(TAG, "Setting dog to entered!");// FIXME Let the user pick
			builder = ContentProviderOperation.newInsert(DogshowContract.addCallerIsSyncAdapterParameter(Dogs.CONTENT_URI));

			break;
		case UPDATE:
			builder = ContentProviderOperation.newUpdate(DogshowContract.addCallerIsSyncAdapterParameter(Dogs.CONTENT_URI));
			// builder.withValue(Dogs._ID, Integer.parseInt(dogId));
			builder.withSelection(Dogs._ID + "=?", new String[] { String.valueOf(dogId) });

			break;
		}
		builder.withValue(Dogs.DOG_IS_SHOWING, 1);
		// TODO handle NULL alloweds

		builder.withValue(SyncColumns.UPDATED, System.currentTimeMillis())

		.withValue(Dogs.DOG_BREED, breedName);
		if (!callName.isEmpty()) {
			builder.withValue(Dogs.DOG_CALL_NAME, callName);
		}

		if (imagePath != null && !imagePath.isEmpty()) {
			builder.withValue(Dogs.DOG_IMAGE_PATH, imagePath);
		}

		builder.withValue(Dogs.DOG_MAJORS, Utils.parseSafely(majors, 0));
		builder.withValue(Dogs.DOG_POINTS, Utils.parseSafely(points, 0));
		
		if (!ownerId.isEmpty()) {
			try {
				builder.withValue(Dogs.DOG_OWNER_ID, Integer.parseInt(ownerId));
			} catch (NumberFormatException e) {
				Log.w(TAG, "Couldn't parse owner_id from:" + ownerId);
			}
		}
		if (sex == Dogs.FEMALE || sex == Dogs.MALE) {
			builder.withValue(Dogs.DOG_SEX, sex);
		} else {
			Log.w(TAG, "Couldn't persist invalid dog gender: " + sex);
		}

		builder.withValue(Dogs.UPDATED, System.currentTimeMillis());
		batch.add(builder.build());
		return batch;
	}
}
