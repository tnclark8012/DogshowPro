package dev.tnclark8012.apps.android.dogshow.sync;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SyncResult;
import android.database.Cursor;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;
import dev.tnclark8012.apps.android.dogshow.model.Show;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.EnteredRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.RingBlocks;
import dev.tnclark8012.apps.android.dogshow.sync.request.ConformationRingAssignmentsRequest;
import dev.tnclark8012.apps.android.dogshow.sync.request.GroupRingsRequest;
import dev.tnclark8012.apps.android.dogshow.sync.request.JuniorsRingsRequest;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class SyncHelper {
	private final static String TAG = makeLogTag(SyncHelper.class);
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
		LOGV(TAG, "getShows using base url, " + mAccessor.getShowsUrl());
		return mAccessor.getShows();
	}

	// TODO move this to a service
	public void enterShow(final Show show) {
        //Cleanup previous program if it was downloaded.
        Show previousShow = Prefs.getCurrentShow(mContext);
        if(previousShow != null && previousShow.programPath != null)
        {
            new File(previousShow.programPath).delete();
        }
        File program = Utils.downloadFile(show.judgingProgramUrl);

        if(program != null) {
            show.programPath = program.getAbsolutePath();
        }

        Prefs.setCurrentShow(mContext, show);
        ArrayList<ContentProviderOperation> ringBatch = new ArrayList<ContentProviderOperation>();

		GroupRingsRequest groupRingsRequest = new GroupRingsRequest(mContext);
		JuniorsRingsRequest juniorsRingsRequest = new JuniorsRingsRequest(
				mContext);
        ConformationRingAssignmentsRequest assignmentsRequest = new ConformationRingAssignmentsRequest(mContext);
		ringBatch.addAll(juniorsRingsRequest.getRings(show.showId));
		ringBatch.addAll(groupRingsRequest.getRings(show.showId));
        ringBatch.addAll(assignmentsRequest.getRings(show.showId));

		try {
			mContext.getContentResolver().applyBatch(
					DogshowContract.CONTENT_AUTHORITY, ringBatch);
			getRingOverviews(show.showId);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (OperationApplicationException e) {
			e.printStackTrace();
		}
		// TODO callbacks for completion?
	}

	// TODO high this should be private
	public void getRingOverviews(String showId) {
		final ContentResolver resolver = mContext.getContentResolver();
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		Cursor enteredBlocksCursor = resolver.query(
				EnteredRings.ENTERED_RING_BLOCKS,
				new String[] { EnteredRings.RING_BLOCK_START,
						EnteredRings.RING_NUMBER }, null, null, null);
		LOGI(TAG,
				"Syncing ring block overviews for "
						+ enteredBlocksCursor.getCount() + " breeds");
		int numBlocks = 0;
		batch.add(ContentProviderOperation
				.newDelete(
						DogshowContract
								.addCallerIsSyncAdapterParameter(RingBlocks.CONTENT_URI))
				.build());
		RingBlockOverviewHandler handler = new RingBlockOverviewHandler(
				mContext, false);
		int ringNumber;
		long blockStart;
		while (enteredBlocksCursor.moveToNext()) {
			blockStart = enteredBlocksCursor.getLong(0);
			ringNumber = enteredBlocksCursor.getInt(1);
			LOGV(TAG, "Requesting ring " + ringNumber + " overview for "
					+ blockStart);
			batch.addAll(handler.parse(mAccessor.getRingBlockOverviews(showId,
					ringNumber, blockStart)));
			numBlocks++;
		}
		LOGV(TAG, "Pulled overviews for " + numBlocks + " rings");
		enteredBlocksCursor.close();

		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, batch);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (OperationApplicationException e) {
			e.printStackTrace();
		}
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

	public void performSync(SyncResult syncResult, int flags) {

		final long lastSync = getLastSync(mContext);

		// Bulk of sync work, performed by executing several fetches from
		// app server.
		final ContentResolver resolver = mContext.getContentResolver();
		ShowTeamSyncHandler teamHelper = new ShowTeamSyncHandler(mContext,
				mAccessor);
		teamHelper.sync(resolver, lastSync, flags);
		LOGI(TAG, "Completed team sync");
		HandlerSyncHandler handlerHelper = new HandlerSyncHandler(mContext,
				mAccessor);
		handlerHelper.sync(resolver, lastSync, flags);
		LOGI(TAG, "Completed handler sync");
		DogSyncHandler dogHelper = new DogSyncHandler(mContext, mAccessor);
		dogHelper.sync(resolver, lastSync, flags);
		LOGI(TAG, "Completed dog sync");
		setLastSync(mContext, System.currentTimeMillis());

		if (syncResult != null) {
			++syncResult.stats.numUpdates; // TODO: better way of indicating
											// progress?
			++syncResult.stats.numEntries;
		}
		LOGI(TAG, "Sync complete");
	}
}