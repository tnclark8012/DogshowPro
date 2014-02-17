package dev.tnclark8012.apps.android.dogshow.ui;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.phone.JuniorClassSelectActivity;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import dev.tnclark8012.apps.android.dogshow.util.image.ImageChooserActivity;
import dev.tnclark8012.apps.android.dogshow.util.image.SimpleImageLoadingListener;
import dev.tnclark8012.dogshow.shared.DogshowEnums.JuniorClass;
import eu.janmuller.android.simplecropimage.CropImage;

public class HandlerEditFragment extends BaseEditableEntityEditFragment implements OnClickListener {
	private static final String TAG = HandlerEditFragment.class.getSimpleName();
	private ViewGroup mRootView;
	private ImageView mViewImage;
	private EditText mViewName;
	private TextView mViewClassName;

	private String mName;
	private String mJuniorClass;
	private String mImagePath;

	private final int TAG_CLASS = 0;
	private final int TAG_IMAGE = 1;
	public final int REQUEST_CODE_IMAGE = 2;

	private ImageLoadingListener mImageLoadingListener = new SimpleImageLoadingListener() {
		@SuppressLint("NewApi")
		@Override
		public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
			if (Utils.isJellybean()) {
				mViewImage.setBackground(new BitmapDrawable(getResources(), loadedImage));
			} else {
				mViewImage.setBackgroundDrawable(new BitmapDrawable(getResources(), loadedImage));
			}
			mImagePath = imageUri;
			Log.v(TAG, "done");
		}
	};

	private interface HandlerQuery {
		String[] PROJECTION = { Handlers._ID, Handlers.HANDLER_NAME, Handlers.HANDLER_JUNIOR_CLASS, Handlers.HANDLER_IMAGE_PATH };
		int _TOKEN = 0x1;
		int HANDLER_ID = 0;
		int HANDLER_NAME = 1;
		int HANDLER_JUNIOR_CLASS = 2;
		int HANDLER_IMAGE_PATH = 3;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mRootView = (ViewGroup) inflater.inflate(R.layout.fragment_handler_edit, null);
		mViewImage = (ImageView) mRootView.findViewById(R.id.handler_edit_image);
		mViewName = (EditText) mRootView.findViewById(R.id.handler_edit_name);
		mViewClassName = (TextView) mRootView.findViewById(R.id.handler_edit_section_juniors_text);
		mViewClassName.setTag(TAG_CLASS);
		mViewClassName.setOnClickListener(this);
		if (creatingNewEntity())
			mViewImage.setBackgroundResource(R.drawable.ic_default_handler);
		mViewImage.setTag(TAG_IMAGE);
		mViewImage.setOnClickListener(this);
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
		mJuniorClass = (Utils.isNullOrEmpty(mJuniorClass)) ? "None" : JuniorClass.parse(mJuniorClass).getPrimaryName();

		mViewName.setText(mName);
		mViewClassName.setText(mJuniorClass);

		String imagePath = cursor.getString(HandlerQuery.HANDLER_IMAGE_PATH);
		if (imagePath != null) {
			UIUtils.loadImage(getActivity(), mImageLoadingListener, imagePath);
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
		Log.d(TAG, "creating map");
		mJuniorClass = mViewClassName.getText().toString();
		// TODO HIGH this "None" thing is ridculous
		mJuniorClass = (Utils.isNullOrEmpty(mJuniorClass) || mJuniorClass.equalsIgnoreCase("None")) ? null : JuniorClass.parse(mJuniorClass).toString();
		mName = mViewName.getText().toString();

		Map<String, Object> values = new HashMap<String, Object>();
		values.put(Handlers.HANDLER_JUNIOR_CLASS, mJuniorClass);// FIXME implement a selection
		values.put(Handlers.HANDLER_IMAGE_PATH, mImagePath);
		values.put(Handlers.HANDLER_IS_SHOWING, 0);
		values.put(Handlers.HANDLER_IS_SHOWING_JUNIORS, 0);
		values.put(Handlers.HANDLER_NAME, mName);
		values.put(Handlers.UPDATED, System.currentTimeMillis());
		return values;
	}

	@Override
	public void onClick(View v) {
		int tag = (Integer) v.getTag();
		switch (tag) {
		case TAG_CLASS: {
			Intent selectIntent = new Intent(getActivity(), JuniorClassSelectActivity.class);
			startActivityForResult(selectIntent, JuniorClassSelectActivity.REQUEST_CODE_CLASS_SELECT);// TODO search. all request codes should be in the start class, not the class being started. DUH
		}
			break;
		case TAG_IMAGE: {
			Intent intent = new Intent(getActivity(), ImageChooserActivity.class);
			intent.setAction(ImageChooserActivity.ACTION_CHOOSE);
			Resources res = getResources();
			int height = res.getDimensionPixelSize(R.dimen.header_icon_height);
			int width = res.getDimensionPixelSize(R.dimen.header_icon_width);

			intent.putExtra(CropImage.SCALE, "true");
			intent.putExtra(CropImage.OUTPUT_X, width);
			intent.putExtra(CropImage.OUTPUT_Y, height);
			startActivityForResult(intent, REQUEST_CODE_IMAGE);
		}
			break;
		}
	}

	@SuppressWarnings("deprecation")
	@SuppressLint("NewApi")
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case JuniorClassSelectActivity.REQUEST_CODE_CLASS_SELECT:
			if (data != null && data.hasExtra(JuniorClassSelectActivity.EXTRA_JUNIOR_CLASS)) {
				JuniorClass juniorClass = (JuniorClass) data.getSerializableExtra(JuniorClassSelectActivity.EXTRA_JUNIOR_CLASS);
				mViewClassName.setText((juniorClass == null) ? "None" : juniorClass.getPrimaryName());
			}
			break;
		case REQUEST_CODE_IMAGE:
			if (resultCode != Activity.RESULT_OK) {
				return;
			}
			Uri selectedImage = data.getData();
			UIUtils.loadImage(getActivity(), mImageLoadingListener, selectedImage);
			break;
		}
	}

}
