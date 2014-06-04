package dev.tnclark8012.apps.android.dogshow.sync.request;

import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.Log;
import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.GroupRingsHandler;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

//TODO HIGH all juniors rings request into a single request following standard model
public class GroupRingsRequest extends AsyncTask<String, Void, Void> {
	private Context mContext;
	private IApiAccessor mAccessor;
	public static final String TAG = GroupRingsRequest.class.getSimpleName();

	public GroupRingsRequest(Context context) {
		mContext = context;
		mAccessor = ApiAccessor.getInstance(mContext);
	}

	@Override
	protected Void doInBackground(String... params) {

		final ContentResolver resolver = mContext.getContentResolver();
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		boolean auth = AccountUtils.isAuthenticated(mContext);
		GroupRingsHandler handler = new GroupRingsHandler(mContext, true);
		batch = new ArrayList<ContentProviderOperation>();
		batch.addAll(handler.parse(mAccessor.getGroupRings(params[0])));
		Log.v(TAG, "Pulled group rings.");
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
}
