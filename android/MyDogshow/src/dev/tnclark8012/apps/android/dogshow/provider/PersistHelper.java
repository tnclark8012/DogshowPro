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
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.BreedRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

public class PersistHelper {
	private final static String TAG = PersistHelper.class.getSimpleName();
	private Context mContext;

	public PersistHelper(Context context) {
		mContext = context;
	}

	public boolean createMe() {
		final ContentResolver resolver = mContext.getContentResolver();
		String selection = Handlers.HANDLER_IS_ME + "=?";
		String[] selectionArgs = new String[] { "1" };
		Cursor meCursor = resolver.query(Handlers.CONTENT_URI,
				new String[] { Handlers.HANDLER_IS_ME }, selection,
				selectionArgs, null);
		if (meCursor.getCount() == 0) {
			Log.v(TAG, "Creating Me");
			Map<String, Object> values = new HashMap<String, Object>();
			values.put(Handlers.HANDLER_ID,
					AccountUtils.getUserIdentifier(mContext));
			values.put(Handlers.HANDLER_IS_ME, 1);
			values.put(Handlers.HANDLER_NAME,
					AccountUtils.getPlusProfileName(mContext));
			createEntity(Handlers.CONTENT_URI, values);
			meCursor.close();
			return true;
		} else {
			meCursor.close();
			return true;
		}
	}

	public void setActiveTeam(String teamIdentifier) {
		ArrayList<ContentProviderOperation> ops = new ArrayList<ContentProviderOperation>(
				2);
		// reset other show teams
		ContentProviderOperation.Builder builder = ContentProviderOperation
				.newUpdate(ShowTeams.CONTENT_URI);
		builder.withValue(ShowTeams.SHOW_TEAM_ACTIVE, 0).withSelection(
				ShowTeams.SHOW_TEAM_ID + "<> ?",
				new String[] { teamIdentifier });
		ops.add(builder.build());
		// set new show team as active
		builder = ContentProviderOperation.newUpdate(ShowTeams.CONTENT_URI);
		builder.withValue(ShowTeams.SHOW_TEAM_ACTIVE, 1)
				.withSelection(ShowTeams.SHOW_TEAM_ID + "= ?",
						new String[] { teamIdentifier });
		ops.add(builder.build());
		applyBatch(ops);
		Prefs.setCurrentTeamIdentifier(mContext, teamIdentifier);
	}

	public void updateEntity(Uri contentUri, long id,
			Map<String, Object> updateValues) {
		updateTable(contentUri, updateValues, BaseColumns._ID + "=?",
				new String[] { String.valueOf(id) });
	}

	public void updateEntity(Uri contentUri, Map<String, Object> updateValues,
			String selection, String[] selectionArgs) {
		updateTable(contentUri, updateValues, selection, selectionArgs);
	}

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

	private void updateTable(Uri contentUri, Map<String, Object> updateValues,
			String selection, String[] selectionArgs) {

		ContentProviderOperation.Builder builder = ContentProviderOperation
				.newUpdate(DogshowContract
						.addCallerIsSyncAdapterParameter(contentUri));
		buildAndApplyBatch(builder, updateValues, selection, selectionArgs);
	}

	private void buildAndApplyBatch(ContentProviderOperation.Builder builder,
			Map<String, Object> values, String selection, String[] selectionArgs) {
		// TODO LOW: move these calls to a Service
		if (values != null) {
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
			applyBatch(batch);
		}
	}

	private void insertIntoTable(Uri contentUri,
			Map<String, Object> insertValues, String selection,
			String[] selectionArgs) {
		ContentProviderOperation.Builder builder = ContentProviderOperation
				.newInsert(DogshowContract
						.addCallerIsSyncAdapterParameter(contentUri));
		buildAndApplyBatch(builder, insertValues, null, null);
	}

	public void deleteEntity(Uri entityUri) {
		ContentProviderOperation.Builder builder = ContentProviderOperation
				.newDelete(entityUri);
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		batch.add(builder.build());
		applyBatch(batch);
	}

	private void applyBatch(ArrayList<ContentProviderOperation> batch) {
		try {
			mContext.getContentResolver().applyBatch(
					DogshowContract.CONTENT_AUTHORITY, batch);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (OperationApplicationException e) {
			e.printStackTrace();
		}
	}

}
