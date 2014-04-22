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
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query;
import dev.tnclark8012.apps.android.dogshow.sync.response.DogSyncResponse;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

public class DogSyncHandler {
	private static final String TAG = DogSyncHandler.class.getSimpleName();
	Context mContext;
	IApiAccessor mAccessor;

	public DogSyncHandler(Context ctx, IApiAccessor accessor) {
		mContext = ctx;
		mAccessor = accessor;
	}

	public void sync(ContentResolver resolver, long lastSync, int flags) {
		// TODO test if two queries are faster, or if selection should be applied manually.
		
		String[] currentDogIds = null;
		Dog[] locallyUpdatedDogs = null;
		boolean overwritting = (flags & SyncHelper.FLAG_SYNC_LOCAL) == 0;
		//If we're doing local sync, we need to send our current dogs and those we've updated
		//TODO can we just send them all along with their updated stamp?
		if (!overwritting) {
			Cursor currentDogsIdCursor = resolver.query(Dogs.CONTENT_URI, new String[] { Dogs.DOG_ID }, null, null, Dogs.DEFAULT_SORT);
			currentDogIds = new String[currentDogsIdCursor.getCount()];
			int i = 0;
			while (currentDogsIdCursor.moveToNext()) {
				currentDogIds[i++] = currentDogsIdCursor.getString(0);
			}
			String selection = Dogs.DOG_UPDATED + " > ? ";
			String[] selectionArgs = new String[] { String.valueOf(lastSync) };
			Cursor locallyUpdated = resolver.query(Dogs.CONTENT_URI, Query.DogSyncQuery.PROJECTION, selection, selectionArgs, Dogs.DEFAULT_SORT);
			locallyUpdatedDogs = new Dog[locallyUpdated.getCount()];
			Dog dog;
			i = 0;
			while (locallyUpdated.moveToNext()) {
				dog = new Dog();
				dog.breedString = locallyUpdated.getString(Query.DogSyncQuery.DOG_BREED);
				dog.callName = locallyUpdated.getString(Query.DogSyncQuery.DOG_CALL_NAME);
				dog.champion = locallyUpdated.getInt(Query.DogSyncQuery.DOG_IS_CHAMPION);
				dog.identifier = locallyUpdated.getString(Query.DogSyncQuery.DOG_ID);
				dog.majors = locallyUpdated.getInt(Query.DogSyncQuery.DOG_MAJORS);
				dog.modifiedTimeUtc = locallyUpdated.getLong(Query.DogSyncQuery.DOG_UPDATED);
				dog.points = locallyUpdated.getInt(Query.DogSyncQuery.DOG_POINTS);
				dog.sex = locallyUpdated.getInt(Query.DogSyncQuery.DOG_SEX);
				dog.showing = locallyUpdated.getInt(Query.DogSyncQuery.DOG_IS_SHOWING);
				dog.showingSweepstakes = locallyUpdated.getInt(Query.DogSyncQuery.DOG_IS_SHOWING_SWEEPSTAKES);
				dog.veteran = locallyUpdated.getInt(Query.DogSyncQuery.DOG_IS_VETERAN);
				locallyUpdatedDogs[i++] = dog;
				// Create json entities and post to server with current sync and last sync time.
				// Response from server should contain dogs which have changed since the last sync.
			}
		}
		
		// Push my dogs and get back those that need updating locally
		DogSyncResponse[] actionable = mAccessor.syncDogs(AccountUtils.getUserId(mContext), Prefs.currentTeamIdentifier(mContext), SyncHelper.getLastSync(mContext), locallyUpdatedDogs, currentDogIds);
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		
		if(overwritting)
		{
			batch.add(ContentProviderOperation.newDelete(DogshowContract.addCallerIsSyncAdapterParameter(Dogs.CONTENT_URI)).build());
		}
		if (actionable != null) {
			Builder builder = null;
			Log.d(TAG, "Taking sync action on " + actionable.length + " dogs.");
			for (DogSyncResponse response : actionable) {
				switch (response.action) {
				case DogSyncResponse.ACTION_ADD:
					builder = ContentProviderOperation.newInsert(DogshowContract.addCallerIsSyncAdapterParameter(Dogs.CONTENT_URI));
					builder.withValues(getDogContentValues(response.dog));
					batch.add(builder.build());
					break;
				case DogSyncResponse.ACTION_UPDATE:
					builder = ContentProviderOperation.newUpdate(DogshowContract.addCallerIsSyncAdapterParameter(Dogs.CONTENT_URI));
					builder.withSelection(Dogs.DOG_ID + "=?", new String[] { response.dog.identifier });
					builder.withValues(getDogContentValues(response.dog));
					batch.add(builder.build());
					break;
				case DogSyncResponse.ACTION_DELETE:
					builder = ContentProviderOperation.newDelete(DogshowContract.addCallerIsSyncAdapterParameter(Dogs.CONTENT_URI));
					builder.withSelection(Dogs.DOG_ID + "=?", new String[] { response.dog.identifier });
					batch.add(builder.build());
					break;
				}
			}
			try {
				resolver.applyBatch(DogshowContract.CONTENT_AUTHORITY, batch);
			} catch (RemoteException e) {
				Log.w(TAG, "Error sycing dogs");
				e.printStackTrace();
			} catch (OperationApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public ContentValues getDogContentValues(Dog dog) {
		ContentValues values = new ContentValues(12);
		values.put(Dogs.DOG_ID, dog.identifier);// FIXME UI shouldn't have to know
		// FIXME these should leverage @ContentValues
		values.put(Dogs.DOG_IS_SHOWING, dog.showing);// FIXME implement a selection
		values.put(Dogs.DOG_BREED, dog.breedString);
		values.put(Dogs.DOG_CALL_NAME, dog.callName);
		values.put(Dogs.DOG_MAJORS, dog.majors);
		values.put(Dogs.DOG_POINTS, dog.points);
		values.put(Dogs.DOG_OWNER_ID, -1);// FIXME ALPHA dog owner Id should just be the creator id like the server
		values.put(Dogs.DOG_SEX, dog.sex);
		values.put(Dogs.DOG_IS_VETERAN, dog.veteran);// TODO the UI shouldn't need to know it's stored as a bool/int/etc.
		values.put(Dogs.DOG_IS_CHAMPION, dog.champion);// TODO the UI shouldn't need to know it's stored as a bool/int/etc.
		values.put(Dogs.DOG_CLASS, Dogs.getDogClass(dog.sex, dog.champion == 1));
		values.put(Dogs.UPDATED, dog.modifiedTimeUtc);
		return values;
	}
}
