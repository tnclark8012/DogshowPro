package dev.tnclark8012.apps.android.dogshow.sync.request;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.BreedRings;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.BreedRingsHandler;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums;

//TODO HIGH all juniors rings request into a single request following standard model
public class ConformationRingsRequest extends AsyncTask<String, Void, Void> {
	private Context mContext;
	private IApiAccessor mAccessor;
	public static final String TAG = ConformationRingsRequest.class.getSimpleName();

	public ConformationRingsRequest(Context context) {
		mContext = context;
		mAccessor = ApiAccessor.getInstance(mContext);
	}

	@Override
	protected Void doInBackground(String... params) {
		String showId = params[0];
		final ContentResolver resolver = mContext.getContentResolver();
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		Cursor breedsCursor = resolver
				.query(DogshowContract.Dogs.buildEnteredGroupedBreedUri(),
						new String[] {
								DogshowContract.Dogs.DOG_BREED,
								DogshowContract.Dogs.DOG_IS_SHOWING_SWEEPSTAKES,
								DogshowContract.Dogs.DOG_IS_VETERAN }, null,
						null, null);
		batch = new ArrayList<ContentProviderOperation>();
		String breedName = null;
		boolean isVeteran;
		boolean isSweepstakes;
		Log.i(TAG, "Syncing breed rings for " + breedsCursor.getCount()
				+ " breeds");
		int numBreeds = 0;
		if (breedsCursor.getCount() == 0) {
			batch.add(ContentProviderOperation
					.newDelete(
							DogshowContract
									.addCallerIsSyncAdapterParameter(BreedRings.CONTENT_URI))
					.build());
		}
		BreedRingsHandler handler = new BreedRingsHandler(mContext, true);
		while (breedsCursor.moveToNext()) {
			breedName = breedsCursor.getString(0);
			isSweepstakes = Utils.getMaybeNull(breedsCursor, 1, false);
			isVeteran = Utils.getMaybeNull(breedsCursor, 2, false);
			Log.v(TAG, "Requesting breed ring: " + breedName);
			// When entered in sweeps, request the non-sweeps rings as well.
			// TODO make this optional
			if (isSweepstakes) {
				batch.addAll(handler.parse(mAccessor.getBreedRings(showId,
						DogshowEnums.Breeds.parse(breedName).getPrimaryName(),
						isVeteran, isSweepstakes)));
			}
			batch.addAll(handler.parse(mAccessor.getBreedRings(showId,
					DogshowEnums.Breeds.parse(breedName).getPrimaryName(),
					isVeteran, false)));
			numBreeds++;
		}
		Log.v(TAG, "Pulled breed rings for " + numBreeds + " breeds");
		breedsCursor.close();


		try {
			resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, batch);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (OperationApplicationException e) {
			e.printStackTrace();
		}
		return null;
	}
}
