package dev.tnclark8012.dogshow.apps.android.ui;

import java.util.Map;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.CursorLoader;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Handlers;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.apps.android.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.JuniorClass;

public class HandlerEditFragment extends BaseEditableEntityEditFragment {
	private static final String TAG = HandlerEditFragment.class.getSimpleName();
	private ViewGroup mRootView;
	private View mViewImage;
	private EditText mViewName;
	private TextView mViewClassName;
	
	private String mName;
	private String mJuniorClass;
	private String mImagePath;
	
	private interface HandlerQuery {
		String [] PROJECTION = {Handlers._ID,Handlers.HANDLER_NAME, Handlers.HANDLER_JUNIOR_CLASS};
		int _TOKEN = 0x1;
		int HANDLER_ID = 0;
		int HANDLER_NAME = 1;
		int HANDLER_JUNIOR_CLASS = 2;
		int HANDLER_IMAGE_PATH = 3;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mRootView = (ViewGroup) inflater.inflate(R.layout.fragment_handler_edit,null);
		mViewImage = mRootView.findViewById(R.id.handler_edit_image);
		mViewName = (EditText) mRootView.findViewById(R.id.handler_edit_name);
		mViewClassName = (TextView) mRootView.findViewById(R.id.handler_edit_section_juniors_text);
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
		cursor.moveToFirst();
		Log.v(TAG, "onDogQueryComplete() called from thread " + Thread.currentThread().getName());
		
		mName = cursor.getString(HandlerQuery.HANDLER_NAME);
		mJuniorClass = cursor.getString(HandlerQuery.HANDLER_JUNIOR_CLASS);
		mJuniorClass = (mJuniorClass==null) ? "None" : JuniorClass.parse(mJuniorClass).getPrimaryName();
	
		mViewName.setText(mName);
		mViewClassName.setText(mJuniorClass);
		
		
		String imagePath = null; //cursor.getString(HandlerQuery.HANDLER_IMAGE_PATH);
		if (imagePath != null) {
			mImagePath = imagePath;
			Resources res = getResources();
			int height = res.getDimensionPixelSize(R.dimen.header_icon_height);
			int width = res.getDimensionPixelSize(R.dimen.header_icon_width);
			// TODO move to AsyncTask
			BitmapDrawable image = new BitmapDrawable(res, UIUtils.loadBitmap(imagePath, width, height));
			if (Utils.isJellybean()) {
				mViewImage.setBackground(image);
			} else {
				mViewImage.setBackgroundDrawable(image);
			}
		} else {
			mViewImage.setBackgroundResource(R.drawable.ic_default_handler);
		}
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
