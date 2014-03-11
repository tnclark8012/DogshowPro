package dev.tnclark8012.apps.android.dogshow.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.BaseColumns;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.BreedRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

public class PersistHelper {
	private final static String TAG = PersistHelper.class.getSimpleName();
	private Context mContext;

	public PersistHelper(Context context) {
		mContext = context;
	}

	public boolean createMe() {
		//TODO call generic create
		final ContentResolver resolver = mContext.getContentResolver();
		String selection = Handlers.HANDLER_IS_ME + "=?";
		String[] selectionArgs = new String[] { "1" };
		Cursor meCursor = resolver.query(Handlers.CONTENT_URI, new String[] { Handlers.HANDLER_IS_ME }, selection, selectionArgs, null);
		if (meCursor.getCount() == 0) {
			Log.v(TAG, "Creating Me");
			Map<String, Object> values = new HashMap<String, Object>();
			values.put(Handlers.HANDLER_ID, AccountUtils.getUserId(mContext));
			values.put(Handlers.HANDLER_IS_ME, 1);
			values.put(Handlers.HANDLER_NAME, AccountUtils.getPlusProfileName(mContext));
			createEntity(Handlers.CONTENT_URI, values);
			meCursor.close();
			return true;
		} else {
			meCursor.close();
			return true;
		}
	}

	// TODO use only this?
	public void updateEntity(Uri contentUri, long id, Map<String, Object> updateValues) {
		//TODO is it safe to use this ID instead of the GUID id?
		updateTable(contentUri, updateValues, BaseColumns._ID + "=?", new String[] { String.valueOf(id) });
	}

	// TODO use only this?
	public void createEntity(Uri contentUri, Map<String, Object> createValues) {
		insertIntoTable(contentUri, createValues, null, null);
	}

	public void updateBreedRing(long id, Map<String, Object> updateValues) {
		updateEntity(BreedRings.CONTENT_URI, id, updateValues);
	}

	public void updateJuniorsRing(long id, Map<String, Object> updateValues) {
		updateEntity(JuniorsRings.CONTENT_URI, id, updateValues);
	}

	public void updateDog(long id, Map<String, Object> updateValues) {
		updateEntity(Dogs.CONTENT_URI, id, updateValues);
	}

	private void updateTable(Uri contentUri, Map<String, Object> updateValues, String selection, String[] selectionArgs) {

		ContentProviderOperation.Builder builder = ContentProviderOperation.newUpdate(DogshowContract.addCallerIsSyncAdapterParameter(contentUri));
		buildAndApplyBatch(builder, updateValues, selection, selectionArgs);
	}

	private void buildAndApplyBatch(ContentProviderOperation.Builder builder, Map<String, Object> values, String selection, String[] selectionArgs) {
		// TODO LOW: move these calls to a Service
		if (values != null) {
			ContentResolver resolver = mContext.getContentResolver();
			Set<String> keys = values.keySet();
			ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
			for (String key : keys) {
				builder.withValue(key, values.get(key));
			}
			builder.withValue(SyncColumns.UPDATED, System.currentTimeMillis());
			if (selection != null) {
				builder.withSelection(selection, selectionArgs);
			}
			batch.add(builder.build());
			try {
				resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, batch);
			} catch (RemoteException e) {
				throw new RuntimeException("Problem applying batch operation", e);
			} catch (OperationApplicationException e) {
				throw new RuntimeException("Problem applying batch operation", e);
			}
		}
	}

	private void insertIntoTable(Uri contentUri, Map<String, Object> insertValues, String selection, String[] selectionArgs) {
		ContentProviderOperation.Builder builder = ContentProviderOperation.newInsert(DogshowContract.addCallerIsSyncAdapterParameter(contentUri));
		buildAndApplyBatch(builder, insertValues, null, null);
	}
}