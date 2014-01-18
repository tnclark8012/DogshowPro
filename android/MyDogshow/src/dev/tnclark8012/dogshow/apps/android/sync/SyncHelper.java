package dev.tnclark8012.dogshow.apps.android.sync;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.Log;
import dev.tnclark8012.dogshow.apps.android.model.Show;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Handlers;
import dev.tnclark8012.dogshow.apps.android.util.AccountUtils;
import dev.tnclark8012.dogshow.apps.android.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums;

public class SyncHelper {
	private final static String TAG = SyncHelper.class.getSimpleName();
	private ApiAccessor mAccessor;
	private Context mContext;

	public SyncHelper(Context context) {
		mContext = context;
		mAccessor = new AzureApiAccessor();
	}


	public Show[] getShows() {
			Log.v(TAG, "getShows using base url, " + mAccessor.getShowsUrl());
			Show[] response = mAccessor.getShows();
			return response;
	}

	//TODO move this to a service
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
		
		BreedRingsHandler handler = new BreedRingsHandler(mContext, true);
		while (breedsCursor.moveToNext()) {
			breedName = breedsCursor.getString(0);
			isSweepstakes = Utils.getMaybeNull(breedsCursor, 1, false);
			isVeteran = Utils.getMaybeNull(breedsCursor, 2, false);
			Log.v(TAG, "Requesting breed ring: " + breedName);
			batch.addAll(handler.parse(mAccessor.getBreedRings(showId,DogshowEnums.Breeds.parse(breedName).getPrimaryName(), isVeteran, isSweepstakes)));
			numBreeds++;
		}
		Log.v(TAG, "Pulled breed rings for " + numBreeds + " breeds");
		breedsCursor.close();

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
			Cursor juniorsCursor = resolver.query(Handlers.buildEnteredJuniorsClassesUri(), new String[]{Handlers.HANDLER_JUNIOR_CLASS}, Handlers.HANDLER_IS_SHOWING + "=? AND " + Handlers.HANDLER_IS_SHOWING_JUNIORS + "=?", new String[]{"1", "1"}, null);
			batch = new ArrayList<ContentProviderOperation>();
			String className = null;
			Log.i(TAG, "Syncing junior rings for " + juniorsCursor.getCount() + " classes");
			int numClasses = 0;
			JuniorsRingsHandler handler = new JuniorsRingsHandler(mContext, true);
			while (juniorsCursor.moveToNext()) {
				className = juniorsCursor.getString(0);
				Log.v(TAG, "Requesting juniors ring: " + className);
				batch.addAll(handler.parse(mAccessor.getJuniorsRings(params[0], DogshowEnums.JuniorClass.parse(className).getPrimaryName())));
				numClasses++;
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
}