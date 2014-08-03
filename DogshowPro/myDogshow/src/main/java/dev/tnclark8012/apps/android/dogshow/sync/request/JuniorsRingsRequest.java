package dev.tnclark8012.apps.android.dogshow.sync.request;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.RemoteException;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.JuniorsRings;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.JuniorsRingsHandler;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import dev.tnclark8012.dogshow.shared.DogshowEnums;

//TODO HIGH all juniors rings request into a single request following standard model
public class JuniorsRingsRequest {
	private Context mContext;
	private IApiAccessor mAccessor;
	public static final String TAG = JuniorsRingsRequest.class.getSimpleName();

	public JuniorsRingsRequest(Context context) {
		mContext = context;
		mAccessor = ApiAccessor.getInstance(mContext);
	}

	public List<ContentProviderOperation> getRings(String showId) {

		final ContentResolver resolver = mContext.getContentResolver();
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		boolean auth = AccountUtils.isAuthenticated(mContext);
		String selection = Handlers.HANDLER_IS_SHOWING + "=? AND "
				+ Handlers.HANDLER_IS_SHOWING_JUNIORS + "=?";
		String[] selectionArgs = new String[] { "1", "1" };
		Cursor juniorsCursor = resolver.query(
				Handlers.buildEnteredJuniorsClassesUri(),
				new String[] { Handlers.HANDLER_JUNIOR_CLASS }, selection,
				selectionArgs, null);
		batch = new ArrayList<ContentProviderOperation>();
		String className = null;
		Log.i(TAG, "Syncing junior rings for " + juniorsCursor.getCount()
				+ " classes");
		if (juniorsCursor.getCount() == 0) {
			batch.add(ContentProviderOperation
					.newDelete(
							DogshowContract
									.addCallerIsSyncAdapterParameter(JuniorsRings.CONTENT_URI))
					.build());
		}
		int numClasses = 0;
		JuniorsRingsHandler handler = new JuniorsRingsHandler(mContext, true);
		while (juniorsCursor.moveToNext()) {
			className = juniorsCursor.getString(0);
			if (className != null) {
				Log.v(TAG, "Requesting juniors ring: " + className);
				batch.addAll(handler.parse(mAccessor.getJuniorsRings(showId,
						DogshowEnums.JuniorClass.parse(className)
								.getPrimaryName())));
				numClasses++;
			}
		}
		Log.v(TAG, "Pulled juniors rings for " + numClasses + " classes");
		juniorsCursor.close();
		return batch;
	}
}
