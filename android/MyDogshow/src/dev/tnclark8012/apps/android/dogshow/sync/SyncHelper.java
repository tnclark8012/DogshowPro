package dev.tnclark8012.apps.android.dogshow.sync;

import java.io.IOException;
import java.util.ArrayList;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SharedPreferences;
import android.content.SyncResult;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.model.Show;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.BreedRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums;

public class SyncHelper {
	private final static String TAG = SyncHelper.class.getSimpleName();
	private ApiAccessor mAccessor;
	private Context mContext;
	public static final int FLAG_SYNC_LOCAL = 0x1;
	public static final int FLAG_SYNC_REMOTE = 0x2;

	public SyncHelper(Context context) {
		mContext = context;
		mAccessor = new AzureApiAccessor();
	}

	public static long getLastSync(Context context) {
		return Prefs.get(context).getLong(Prefs.KEY_LAST_SYNC, 0);
	}

	public static void setLastSync(Context context, long timestamp) {
		Prefs.get(context).edit().putLong(Prefs.KEY_LAST_SYNC, timestamp).commit();
	}

	public Show[] getShows() {
		Log.v(TAG, "getShows using base url, " + mAccessor.getShowsUrl());
		Show[] response = mAccessor.getShows();
		return response;
	}

	// TODO move this to a service
	public void executeSync(String showId) {
		final ContentResolver resolver = mContext.getContentResolver();
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		Cursor breedsCursor = resolver.query(DogshowContract.Dogs.buildEnteredGroupedBreedUri(), new String[] { DogshowContract.Dogs.DOG_BREED, DogshowContract.Dogs.DOG_IS_SHOWING_SWEEPSTAKES, DogshowContract.Dogs.DOG_IS_VETERAN }, null, null, null);
		batch = new ArrayList<ContentProviderOperation>();
		String breedName = null;
		boolean isVeteran;
		boolean isSweepstakes;
		Log.i(TAG, "Syncing breed rings for " + breedsCursor.getCount() + " breeds");
		int numBreeds = 0;
		if (breedsCursor.getCount() == 0) {
			batch.add(ContentProviderOperation.newDelete(DogshowContract.addCallerIsSyncAdapterParameter(BreedRings.CONTENT_URI)).build());
		}
		BreedRingsHandler handler = new BreedRingsHandler(mContext, true);
		// TODO make this available in a single HTTP request?
		while (breedsCursor.moveToNext()) {
			breedName = breedsCursor.getString(0);
			isSweepstakes = Utils.getMaybeNull(breedsCursor, 1, false);
			isVeteran = Utils.getMaybeNull(breedsCursor, 2, false);
			Log.v(TAG, "Requesting breed ring: " + breedName);
			// When entered in sweeps, request the non-sweeps rings as well. TODO make this optional
			if (isSweepstakes) {
				batch.addAll(handler.parse(mAccessor.getBreedRings(showId, DogshowEnums.Breeds.parse(breedName).getPrimaryName(), isVeteran, isSweepstakes)));
			}
			batch.addAll(handler.parse(mAccessor.getBreedRings(showId, DogshowEnums.Breeds.parse(breedName).getPrimaryName(), isVeteran, false)));
			numBreeds++;
		}
		Log.v(TAG, "Pulled breed rings for " + numBreeds + " breeds");
		breedsCursor.close();
		// FIXME clear rings if no breeds and or juniors entered

		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, batch);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OperationApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		requestJuniorsRingsTask.execute(showId);

	}

	private AsyncTask<String, Void, Void> requestJuniorsRingsTask = new AsyncTask<String, Void, Void>() {

		@Override
		protected Void doInBackground(String... params) {

			final ContentResolver resolver = mContext.getContentResolver();
			ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
			boolean auth = AccountUtils.isAuthenticated(mContext);
			String selection = Handlers.HANDLER_IS_SHOWING + "=? AND " + Handlers.HANDLER_IS_SHOWING_JUNIORS + "=?";
			String[] selectionArgs = new String[] { "1", "1" };
			Cursor juniorsCursor = resolver.query(Handlers.buildEnteredJuniorsClassesUri(), new String[] { Handlers.HANDLER_JUNIOR_CLASS }, selection, selectionArgs, null);
			batch = new ArrayList<ContentProviderOperation>();
			String className = null;
			Log.i(TAG, "Syncing junior rings for " + juniorsCursor.getCount() + " classes");
			if (juniorsCursor.getCount() == 0) {
				batch.add(ContentProviderOperation.newDelete(DogshowContract.addCallerIsSyncAdapterParameter(JuniorsRings.CONTENT_URI)).build());
			}
			int numClasses = 0;
			JuniorsRingsHandler handler = new JuniorsRingsHandler(mContext, true);
			while (juniorsCursor.moveToNext()) {
				className = juniorsCursor.getString(0);
				if (className != null) {
					Log.v(TAG, "Requesting juniors ring: " + className);
					batch.addAll(handler.parse(mAccessor.getJuniorsRings(params[0], DogshowEnums.JuniorClass.parse(className).getPrimaryName())));
					numClasses++;
				}
			}
			Log.v(TAG, "Pulled juniors rings for " + numClasses + " classes");
			juniorsCursor.close();

			try {
				resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, batch);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (OperationApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	};
	private int LOCAL_VERSION_CURRENT;

	public static void requestManualSync(Account mChosenAccount) {
		Bundle b = new Bundle();
		b.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true);
		ContentResolver.requestSync(mChosenAccount, DogshowContract.CONTENT_AUTHORITY, b);
	}

	public void performSync(SyncResult syncResult, int flags) throws IOException {

		final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(mContext);
		final int localVersion = prefs.getInt("local_data_version", 0);
		final long lastSync = getLastSync(mContext);
		// Bulk of sync work, performed by executing several fetches from
		// local and online sources.
		final ContentResolver resolver = mContext.getContentResolver();
		DogSyncHandler dogHelper = new DogSyncHandler(mContext, mAccessor);
		dogHelper.sync(resolver, lastSync);
		Log.i(TAG, "Completed dog sync");
		ShowTeamSyncHandler teamHelper = new ShowTeamSyncHandler(mContext, mAccessor);
		teamHelper.sync(resolver, lastSync);
		Log.i(TAG, "Completed team sync");
		setLastSync(mContext, System.currentTimeMillis());

		if (syncResult != null) {
			++syncResult.stats.numUpdates; // TODO: better way of indicating progress?
			++syncResult.stats.numEntries;
		}
		Log.i(TAG, "Sync complete");
	}

	private boolean isOnline() {
		ConnectivityManager cm = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
		return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnectedOrConnecting();
	}
}