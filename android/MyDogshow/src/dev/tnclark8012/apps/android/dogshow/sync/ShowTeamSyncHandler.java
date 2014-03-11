package dev.tnclark8012.apps.android.dogshow.sync;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.RemoteException;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;
import dev.tnclark8012.apps.android.dogshow.model.Dog;
import dev.tnclark8012.apps.android.dogshow.model.ShowTeam;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sync.response.ShowTeamSyncResponse;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

public class ShowTeamSyncHandler {
	private static final String TAG = ShowTeamSyncHandler.class.getSimpleName();
	Context mContext;
	IApiAccessor mAccessor;

	public ShowTeamSyncHandler(Context ctx, IApiAccessor accessor) {
		mContext = ctx;
		mAccessor = accessor;
	}

	public void sync(ContentResolver resolver, long lastSync) {
		// TODO test if two queries are faster, or if selection should be applied manually.
		String currentTeamId[];
		Cursor currentTeamsIdCursor = resolver.query(ShowTeams.CONTENT_URI, new String[] { ShowTeams.SHOW_TEAM_ID }, null, null, ShowTeams.DEFAULT_SORT);
		currentTeamId = new String[currentTeamsIdCursor.getCount()];
		int i = 0;
		while (currentTeamsIdCursor.moveToNext()) {
			currentTeamId[i++] = currentTeamsIdCursor.getString(0);
		}
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();

		ShowTeamSyncResponse[] actionable = mAccessor.syncShowTeams(AccountUtils.getUserId(mContext), SyncHelper.getLastSync(mContext), currentTeamId);
		if (actionable != null) {
			Builder builder = null;
			Log.d(TAG, "Taking sync action on " + actionable.length + " teams.");
			for (ShowTeamSyncResponse response : actionable) {
				switch (response.action) {
				case ShowTeamSyncResponse.ACTION_ADD:
					builder = ContentProviderOperation.newInsert(DogshowContract.addCallerIsSyncAdapterParameter(ShowTeams.CONTENT_URI));
					builder.withValues(getTeamContentValues(response.team));
					batch.add(builder.build());
					break;
				case ShowTeamSyncResponse.ACTION_UPDATE:
					builder = ContentProviderOperation.newUpdate(DogshowContract.addCallerIsSyncAdapterParameter(ShowTeams.CONTENT_URI));
					builder.withSelection(ShowTeams.SHOW_TEAM_ID + "=?", new String[] { response.team.identifier });
					builder.withValues(getTeamContentValues(response.team));
					batch.add(builder.build());
					break;
				case ShowTeamSyncResponse.ACTION_DELETE:
					builder = ContentProviderOperation.newDelete(DogshowContract.addCallerIsSyncAdapterParameter(ShowTeams.CONTENT_URI));
					builder.withSelection(ShowTeams.SHOW_TEAM_ID + "=?", new String[] { response.team.identifier });
					batch.add(builder.build());
					break;
				}
			}
			try {
				resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, batch);
			} catch (RemoteException e) {
				Log.w(TAG, "Error sycing teams");
				e.printStackTrace();
			} catch (OperationApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public ContentValues getTeamContentValues(ShowTeam team) {
		ContentValues values = new ContentValues(12);
		values.put(ShowTeams.SHOW_TEAM_ID, team.identifier);
		values.put(ShowTeams.SHOW_TEAM_NAME, team.teamName);
		values.put(Dogs.UPDATED, System.currentTimeMillis());//TODO set a "sync time" per sync
		return values;
	}
}