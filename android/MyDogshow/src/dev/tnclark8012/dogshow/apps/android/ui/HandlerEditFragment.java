package dev.tnclark8012.dogshow.apps.android.ui;

import java.util.Map;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.CursorLoader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Handlers;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityEditFragment;

public class HandlerEditFragment extends BaseEditableEntityEditFragment {
	private static final String TAG = HandlerEditFragment.class.getSimpleName();
	View mRootView;
	
	private interface HandlerQuery {
		String [] PROJECTION = {Handlers._ID,Handlers.HANDLER_NAME, Handlers.HANDLER_JUNIOR_CLASS};
		int _TOKEN = 0x1;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mRootView = inflater.inflate(R.layout.fragment_handler_edit,null);
		return mRootView;
	}
 	@Override
	protected int getEntityIdFromUri(Uri uri) {
		return Handlers.getHandlerId(uri);
	}

	@Override
	protected int getQueryToken() {
		return HandlerQuery._TOKEN;
	}

	@Override
	protected CursorLoader getCursorLoader(Activity activity, Uri uri) {
		return new CursorLoader(activity, uri, HandlerQuery.PROJECTION, null, null, null);
	}

	@Override
	protected void onQueryComplete(Cursor cursor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Uri getContentUri() {
		return Handlers.CONTENT_URI;
	}
	@Override
	protected Map<String, Object> getEntityValueMap() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
