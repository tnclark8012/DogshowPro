package dev.tnclark8012.apps.android.dogshow.sync;

import java.io.IOException;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;
import dev.tnclark8012.apps.android.dogshow.model.Show;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sync.request.ConformationRingsRequest;
import dev.tnclark8012.apps.android.dogshow.sync.request.JuniorsRingsRequest;

public class SyncHelper {
	private final static String TAG = SyncHelper.class.getSimpleName();
	private IApiAccessor mAccessor;
	private Context mContext;
	/**
	 * If set, local entities will be pushed to the server for reconcilation
	 */
	public static final int FLAG_SYNC_LOCAL = 0x1;
	/**
	 * If set, server entities will be requested
	 */
	public static final int FLAG_SYNC_REMOTE = 0x2;

	// /**
	// * If set, sync will ignore modification times.
	// */
	// public static final int FLAG_SYNC_FORCE = 0x3;

	public SyncHelper(Context context) {
		mContext = context;
		mAccessor = ApiAccessor.getInstance(context);
	}

	public static long getLastSync(Context context) {
		return Prefs.get(context).getLong(Prefs.KEY_LAST_SYNC, 0);
	}

	public static void setLastSync(Context context, long timestamp) {
		Prefs.get(context).edit().putLong(Prefs.KEY_LAST_SYNC, timestamp)
				.commit();
	}

	public Show[] getShows() {
		Log.v(TAG, "getShows using base url, " + mAccessor.getShowsUrl());
		Show[] response = mAccessor.getShows();
		return response;
	}

	// TODO move this to a service
	public void enterShow(Show show) {
		
		ConformationRingsRequest confRingsRequest = new ConformationRingsRequest(mContext);
		JuniorsRingsRequest juniorsRingsRequest = new JuniorsRingsRequest(mContext);
		confRingsRequest.execute(show.showId);
		juniorsRingsRequest.execute(show.showId);
		//TODO callbacks for completion?
	}

	public static void requestManualSync(Context context,
			Account mChosenAccount, int flags) {
		if (Prefs.isSyncEnabled(context)) {
			Bundle b = new Bundle();
			b.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true);
			b.putInt(SyncAdapter.SYNC_EXTRAS_FLAGS, flags);
			ContentResolver.requestSync(mChosenAccount,
					DogshowContract.CONTENT_AUTHORITY, b);
		}
	}

	public static void requestManualSync(Context context, Account mChosenAccount) {
		if (Prefs.isSyncEnabled(context)) {
			requestManualSync(context, mChosenAccount,
					SyncHelper.FLAG_SYNC_LOCAL | SyncHelper.FLAG_SYNC_REMOTE);
		}
	}

	public void performSync(SyncResult syncResult, int flags)
			throws IOException {

		final long lastSync = getLastSync(mContext);

		// Bulk of sync work, performed by executing several fetches from
		// local and online sources.
		final ContentResolver resolver = mContext.getContentResolver();
		ShowTeamSyncHandler teamHelper = new ShowTeamSyncHandler(mContext,
				mAccessor);
		teamHelper.sync(resolver, lastSync, flags);
		Log.i(TAG, "Completed team sync");
		DogSyncHandler dogHelper = new DogSyncHandler(mContext, mAccessor);
		dogHelper.sync(resolver, lastSync, flags);
		Log.i(TAG, "Completed dog sync");
		setLastSync(mContext, System.currentTimeMillis());

		if (syncResult != null) {
			++syncResult.stats.numUpdates; // TODO: better way of indicating
											// progress?
			++syncResult.stats.numEntries;
		}
		Log.i(TAG, "Sync complete");
	}
}