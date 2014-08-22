package dev.tnclark8012.apps.android.dogshow.sync.request;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dev.tnclark8012.apps.android.dogshow.Config.IApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.GroupRingsHandler;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class GroupRingsRequest {
	private Context mContext;
	private IApiAccessor mAccessor;
	public static final String TAG = makeLogTag(GroupRingsRequest.class);

	public GroupRingsRequest(Context context) {
		mContext = context;
		mAccessor = ApiAccessor.getInstance(mContext);
	}

	public List<ContentProviderOperation> getRings(String showId) {
		final ContentResolver resolver = mContext.getContentResolver();
		ArrayList<ContentProviderOperation> batch = new ArrayList<ContentProviderOperation>();
		boolean auth = AccountUtils.isAuthenticated(mContext);
		GroupRingsHandler handler = new GroupRingsHandler(mContext, true);
		batch = new ArrayList<ContentProviderOperation>();
		batch.addAll(handler.parse(mAccessor.getGroupRings(showId)));
		LOGV(TAG, "Pulled group rings.");
		return batch;
	}
}
