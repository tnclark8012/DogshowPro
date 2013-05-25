package dev.tnclark8012.dogshow.apps.android.provider;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.dogshow.apps.android.sync.DogHandler;
import dev.tnclark8012.dogshow.apps.android.sync.DogHandler.ParseMode;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class PersistHelper {
	private final static String TAG = PersistHelper.class.getSimpleName();
	private Context mContext;

	public PersistHelper(Context context) {
		mContext = context;
	}
	
	public void updateBreedRing(Map<String, Object> updateValues, String selection, String[] selectionArgs) {
		updateTable(BreedRings.CONTENT_URI, updateValues, selection, selectionArgs);
	}

	public void updateBreedRing(long id, Map<String, Object> updateValues) {
		updateTable(BreedRings.CONTENT_URI, updateValues, BreedRings._ID + "=?", new String[]{String.valueOf(id)});
	}

	public void updateDog(Map<String, Object> updateValues, String selection, String[] selectionArgs) {
		updateTable(Dogs.CONTENT_URI, updateValues, selection, selectionArgs);
	}

	private void updateTable(Uri contentUri, Map<String, Object> updateValues, String selection, String[] selectionArgs) {
		// TODO LOW: move these calls to a Service
		ContentResolver resolver = mContext.getContentResolver();
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		ContentProviderOperation.Builder builder = null;
		builder = ContentProviderOperation.newUpdate(DogshowContract.addCallerIsSyncAdapterParameter(contentUri));
		Set<String> keys = updateValues.keySet();
		for (String key : keys) {
			builder.withValue(key, updateValues.get(key));
		}
		builder.withValue(SyncColumns.UPDATED, System.currentTimeMillis());
		builder.withSelection(selection, selectionArgs);
		batch.add(builder.build());

		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, batch);
		} catch (RemoteException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		} catch (OperationApplicationException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		}
	}

	/**
	 * TODO Move from DogHandler to {@link #updateDog(Map, String, String[])}
	 * 
	 * @see {@link DogHandler#parse(ParseMode, String, String, String, String, String, String, String, int)}
	 */
	public void updateDog(String dogId, String breedName, String callName, String imagePath, String majors, String ownerId, String points, int sex) {
		// TODO LOW: move these calls to a Service
		ContentResolver resolver = mContext.getContentResolver();
		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, new DogHandler(mContext).parse(ParseMode.UPDATE, dogId, Breeds.parse(breedName).toString(), callName, imagePath, majors, points, ownerId, sex));
		} catch (RemoteException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		} catch (OperationApplicationException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		}
	}

	public void createDog(String dogId, String breedName, String callName, String imagePath, String majors, String ownerId, String points, int sex) {
		// TODO LOW: move these calls to a Service
		ContentResolver resolver = mContext.getContentResolver();
		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, new DogHandler(mContext).parse(ParseMode.NEW, dogId, Breeds.parse(breedName).toString(), callName, imagePath, majors, points, ownerId, sex));
		} catch (RemoteException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		} catch (OperationApplicationException e) {
			throw new RuntimeException("Problem applying batch operation", e);
		}
	}
}
