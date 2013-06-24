package dev.tnclark8012.dogshow.apps.android.ui;

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
import android.widget.RelativeLayout;
import android.widget.TextView;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Handlers;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityViewFragment;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.JuniorClass;

public class HandlerViewFragment extends BaseEditableEntityViewFragment {
	private static final String TAG = HandlerViewFragment.class.getSimpleName();
	private interface HandlerQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { Handlers._ID,
				Handlers.HANDLER_NAME,
				Handlers.HANDLER_JUNIOR_CLASS
				};
		int HANDLER_ID = 0;
		int HANDLER_NAME = 1;
		int HANDLER_JUNIOR_CLASS = 2;
		int HANDLER_IMAGE_PATH = 3;
	}
	private String mName;
	private String mClassName;
	private String mImagePath;

	private ViewGroup mRootView;
	private RelativeLayout mViewImage;
	private TextView mViewName;
	private TextView mViewClass;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mRootView = (ViewGroup) inflater.inflate(R.layout.fragment_handler_view,
				null);
		mViewName = (TextView) mRootView.findViewById(R.id.handler_view_name);
		mViewClass = (TextView) mRootView
				.findViewById(R.id.handler_view_section_juniors_text);
		mViewImage = (RelativeLayout) mRootView
				.findViewById(R.id.handler_view_image);
		return mRootView;
	}

	protected void onQueryComplete(Cursor cursor) {
		cursor.moveToFirst();
		mClassName = cursor.getString(HandlerQuery.HANDLER_JUNIOR_CLASS);
		mName = cursor.getString(HandlerQuery.HANDLER_NAME);
		mImagePath = null;//cursor.getString(HandlerQuery.HANDLER_IMAGE_PATH);
		mClassName = (mClassName==null) ? "None" : JuniorClass.parse(mClassName).getPrimaryName();
		mViewClass.setText(mClassName);
		mViewName.setText(mName);
		if (mImagePath != null) {
			Resources res = getResources();
			int height = res.getDimensionPixelSize(R.dimen.header_icon_height);
			int width = res.getDimensionPixelSize(R.dimen.header_icon_width);

			BitmapDrawable image = new BitmapDrawable(res, UIUtils.loadBitmap(
					mImagePath, width, height));
			mViewImage.setBackgroundDrawable(image);
		} else {
			Log.w(TAG, "Image path was null");
			mViewImage.setBackgroundResource(R.drawable.dog);

		}
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
	protected Uri getContentUri() {
		return Handlers.CONTENT_URI;
	}
}
