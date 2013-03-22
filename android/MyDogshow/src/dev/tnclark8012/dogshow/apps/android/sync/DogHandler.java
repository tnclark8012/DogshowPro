package dev.tnclark8012.dogshow.apps.android.sync;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.util.Log;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.SyncColumns;

public class DogHandler {
	private static final String TAG = DogHandler.class.getSimpleName();

	public DogHandler(Context context) {

	}

	public ArrayList<ContentProviderOperation> parse(String dogId,
			String breedName, String callName, String imagePath, String majors, String points,
			String ownerId, String sex) {
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		
		//TODO handle NULL alloweds
		final ContentProviderOperation.Builder builder = ContentProviderOperation
				.newUpdate(
						DogshowContract
								.addCallerIsSyncAdapterParameter(Dogs.CONTENT_URI))
				.withValue(SyncColumns.UPDATED, System.currentTimeMillis())
				.withValue(Dogs.DOG_ID, Integer.parseInt(dogId))
				.withValue(Dogs.DOG_BREED, breedName);
		if (!callName.isEmpty()) {
			builder.withValue(Dogs.DOG_CALL_NAME, callName);
		}
		
		if(!imagePath.isEmpty())
		{
			builder.withValue(Dogs.DOG_IMAGE_PATH, imagePath);
		}
		if (!majors.isEmpty()) {
			try {
				builder.withValue(Dogs.DOG_MAJORS, Integer.parseInt(majors));

			} catch (NumberFormatException e) {
				Log.w(TAG, "Couldn't parse major from:" + majors);
			}
		}
		if (!ownerId.isEmpty()) {
			try {
				builder.withValue(Dogs.DOG_OWNER_ID, Integer.parseInt(ownerId));
			} catch (NumberFormatException e) {
				Log.w(TAG, "Couldn't parse owner_id from:" + ownerId);
			}
		}
		if (!points.isEmpty()) {
			try {
				builder.withValue(Dogs.DOG_POINTS, Integer.parseInt(points));
			} catch (NumberFormatException e) {
				Log.w(TAG, "Couldn't parse points from:" + points);
			}
		}

		if (!sex.isEmpty()) {
			try {
				builder.withValue(Dogs.DOG_SEX, Integer.parseInt(sex));
			} catch (NumberFormatException e) {
				Log.w(TAG, "Couldn't parse sex from:" + sex);
			}
		}

		builder.withValue(Dogs.UPDATED, System.currentTimeMillis());
		batch.add(builder.build());
		return batch;
	}
}
