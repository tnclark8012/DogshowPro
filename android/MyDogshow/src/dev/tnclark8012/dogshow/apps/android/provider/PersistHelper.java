package dev.tnclark8012.dogshow.apps.android.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;

import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.BreedRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.SyncColumns;
import dev.tnclark8012.dogshow.apps.android.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums;

public class PersistHelper {
    private final static String TAG = PersistHelper.class.getSimpleName();
    private Context mContext;

    public PersistHelper(Context context) {
        mContext = context;
    }

    public void updateBreedRing(Map<String, Object> updateValues, String selection, String[] selectionArgs) {
        updateTable(BreedRings.CONTENT_URI, updateValues, selection, selectionArgs);
    }

    public void updateBreedRing(long id, Map<String, Object> updateValues) {
        updateTable(BreedRings.CONTENT_URI, updateValues, BreedRings._ID + "=?", new String[]{String.valueOf(id)});
    }

    public void updateJuniorsRing(long id, Map<String, Object> updateValues) {
        updateTable(JuniorsRings.CONTENT_URI, updateValues, JuniorsRings._ID + "=?", new String[]{String.valueOf(id)});
    }

    public void updateDog(long id, Map<String, Object> updateValues) {
        updateTable(Dogs.CONTENT_URI, updateValues, Dogs._ID + "=?", new String[]{String.valueOf(id)});
    }

    public void updateDog(Map<String, Object> updateValues, String selection, String[] selectionArgs) {
        updateTable(Dogs.CONTENT_URI, updateValues, selection, selectionArgs);
    }

    private void updateTable(Uri contentUri, Map<String, Object> updateValues, String selection, String[] selectionArgs) {

        ContentProviderOperation.Builder builder = ContentProviderOperation.newUpdate(DogshowContract.addCallerIsSyncAdapterParameter(contentUri));
        buildAndApplyBatch(builder, updateValues, selection, selectionArgs);
    }

    private void buildAndApplyBatch(ContentProviderOperation.Builder builder, Map<String, Object> values, String selection, String[] selectionArgs) {
        // TODO LOW: move these calls to a Service
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

    private void insertIntoTable(Uri contentUri, Map<String, Object> insertValues, String selection, String[] selectionArgs) {
        ContentProviderOperation.Builder builder = ContentProviderOperation.newInsert(DogshowContract.addCallerIsSyncAdapterParameter(contentUri));
        buildAndApplyBatch(builder, insertValues, null, null);
    }

    public void updateDog(String dogId, String breedName, String callName, String imagePath, String majors, String ownerId, String points, int sex) {
        // TODO HIGH: move this to the fragment and use other updateDog method
        //TODO LOW: move these calls to a Service
        Map<String, Object> values = new HashMap<String, Object>();
        values.put(Dogs.DOG_IS_SHOWING, 1);//FIXME implement a selection
        values.put(Dogs.DOG_BREED, DogshowEnums.Breeds.parse(breedName).toString());
        values.put(Dogs.DOG_IMAGE_PATH, imagePath);
        values.put(Dogs.DOG_CALL_NAME, callName);
        values.put(Dogs.DOG_MAJORS, Utils.parseSafely(majors, 0));
        values.put(Dogs.DOG_POINTS, Utils.parseSafely(points, 0));
        values.put(Dogs.DOG_OWNER_ID, Integer.parseInt(ownerId));
        values.put(Dogs.DOG_SEX, sex);
        values.put(Dogs.UPDATED, System.currentTimeMillis());
        updateTable(Dogs.CONTENT_URI, values, Dogs._ID + "=?", new String[]{String.valueOf(dogId)});
    }

    public void createDog(String dogId, String breedName, String callName, String imagePath, String majors, String ownerId, String points, int sex) {
        Map<String, Object> values = new HashMap<String, Object>();
        values.put(Dogs.DOG_IS_SHOWING, 1);//FIXME implement a selection
        values.put(Dogs.DOG_BREED, DogshowEnums.Breeds.parse(breedName).toString());
        values.put(Dogs.DOG_IMAGE_PATH, imagePath);
        values.put(Dogs.DOG_CALL_NAME, callName);
        values.put(Dogs.DOG_MAJORS, Utils.parseSafely(majors, 0));
        values.put(Dogs.DOG_POINTS, Utils.parseSafely(points, 0));
        values.put(Dogs.DOG_OWNER_ID, Integer.parseInt(ownerId));
        values.put(Dogs.DOG_SEX, sex);
        values.put(Dogs.UPDATED, System.currentTimeMillis());
        insertIntoTable(Dogs.CONTENT_URI, values, null, null);
    }
}
