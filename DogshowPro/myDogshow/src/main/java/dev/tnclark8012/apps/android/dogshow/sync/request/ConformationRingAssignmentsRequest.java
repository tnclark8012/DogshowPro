package dev.tnclark8012.apps.android.dogshow.sync.request;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;
import dev.tnclark8012.apps.android.dogshow.model.Dog;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.BreedRings;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.RingAssignmentHandler;
import dev.tnclark8012.apps.android.dogshow.sync.response.ConformationRingAssignmentResponse;

public class ConformationRingAssignmentsRequest {
	private Context mContext;
	private IApiAccessor mAccessor;
	public static final String TAG = ConformationRingAssignmentsRequest.class
			.getSimpleName();

	public ConformationRingAssignmentsRequest(Context context) {
		mContext = context;
		mAccessor = ApiAccessor.getInstance(mContext);
	}

	public List<ContentProviderOperation> getRings(String showId) {
		final ContentResolver resolver = mContext.getContentResolver();
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		Cursor enteredDogCursor = resolver
				.query(Dogs.CONTENT_URI,
						new String[] {
                                Dogs.DOG_ID,
								Dogs.DOG_BREED,
								Dogs.DOG_IS_SHOWING_SWEEPSTAKES,
								Dogs.DOG_IS_VETERAN }, Dogs.DOG_IS_SHOWING + "=1",
						null, null);
		Log.i(TAG, "Syncing breed rings for " + enteredDogCursor.getCount()
				+ " dogs");
		int numDogs = 0;
        //If there are not entered dogs, clear any existing data.
		if (enteredDogCursor.getCount() == 0) {
			batch.add(ContentProviderOperation
					.newDelete(
							DogshowContract
									.addCallerIsSyncAdapterParameter(BreedRings.CONTENT_URI))
					.build());
		}
		RingAssignmentHandler handler = new RingAssignmentHandler(mContext, true);
        Dog[] dogs = new Dog[enteredDogCursor.getCount()];
		while (enteredDogCursor.moveToNext()) {
			Dog d = new Dog();
            d.identifier = enteredDogCursor.getString(0);
            d.breedString = enteredDogCursor.getString(1);
            d.showing = enteredDogCursor.getInt(2);
            d.veteran = enteredDogCursor.getInt(3);
            dogs[numDogs] = d;
			numDogs++;
		}
        ConformationRingAssignmentResponse[] assignmentsAndRings = mAccessor.getBreedRingAssignments(showId, dogs);
        batch.addAll(handler.parse(assignmentsAndRings));
		Log.v(TAG, "Pulled breed rings for " + numDogs + " dogs");
		enteredDogCursor.close();
		return batch;
	}
}
