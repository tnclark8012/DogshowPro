package dev.tnclark8012.apps.android.dogshow.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
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

import java.util.HashMap;
import java.util.Map;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseActivity;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.phone.JuniorClassSelectActivity;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import dev.tnclark8012.apps.android.dogshow.util.image.ImageChooserActivity;
import dev.tnclark8012.apps.android.dogshow.util.image.SimpleImageLoadingListener;
import dev.tnclark8012.dogshow.shared.DogshowEnums.JuniorClass;
import eu.janmuller.android.simplecropimage.CropImage;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class HandlerEditFragment extends BaseEditableEntityEditFragment
		implements OnClickListener {
	private static final String TAG = makeLogTag(HandlerEditFragment.class);
	private static final int REQUEST_CODE_CLASS_SELECT = 1;
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
		public void onLoadingComplete(String imageUri, View view,
				Bitmap loadedImage) {
            mViewImage.setImageURI(Uri.parse(imageUri));
			mImagePath = imageUri;
			LOGV(TAG, "done");
		}
	};

	private interface HandlerQuery {
		String[] PROJECTION = { Handlers._ID, Handlers.HANDLER_NAME,
				Handlers.HANDLER_JUNIOR_CLASS, Handlers.HANDLER_IMAGE_PATH };
		int _TOKEN = 0x1;
		int HANDLER_ID = 0;
		int HANDLER_NAME = 1;
		int HANDLER_JUNIOR_CLASS = 2;
		int HANDLER_IMAGE_PATH = 3;
	}

	public static HandlerEditFragment newInstance(Uri handlerUri) {
		HandlerEditFragment f = new HandlerEditFragment();
		Bundle b = new Bundle();
		b.putParcelable(BaseActivity.EXTRA_URI, handlerUri);
		f.setArguments(b);
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mRootView = (ViewGroup) inflater.inflate(
				R.layout.fragment_handler_edit, container, false);
		mViewImage = (ImageView) mRootView
				.findViewById(R.id.handler_edit_image);
		mViewName = (EditText) mRootView.findViewById(R.id.handler_edit_name);
		mViewClassName = (TextView) mRootView
				.findViewById(R.id.handler_edit_section_juniors_text);
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
		return new CursorLoader(activity, uri, HandlerQuery.PROJECTION, null,
				null, null);
	}

	@Override
	protected void onQueryComplete(Cursor cursor) {
		cursor.moveToFirst();
		LOGV(TAG, "onDogQueryComplete() called from thread "
				+ Thread.currentThread().getName());

		mName = cursor.getString(HandlerQuery.HANDLER_NAME);
		mJuniorClass = cursor.getString(HandlerQuery.HANDLER_JUNIOR_CLASS);
		mJuniorClass = (Utils.isNullOrEmpty(mJuniorClass)) ? "None"
				: JuniorClass.parse(mJuniorClass).getPrimaryName();

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
	public Map<String, Object> getEntityValueMap() {
		JuniorClass clazz = JuniorClass.parse(mViewClassName.getText()
				.toString());
		mName = mViewName.getText().toString();
		Map<String, Object> values = new HashMap<String, Object>();
		if (creatingNewEntity()) {
			values.put(Handlers.HANDLER_ID, Utils.getGuid());
		}
		// implement a
		// selection
		values.put(Handlers.HANDLER_IMAGE_PATH, mImagePath);
		values.put(Handlers.HANDLER_JUNIOR_CLASS,
				(clazz != null) ? clazz.toString() : clazz);
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
			Intent selectIntent = new Intent(getActivity(),
					JuniorClassSelectActivity.class);
			startActivityForResult(selectIntent, REQUEST_CODE_CLASS_SELECT);
		}
			break;
		case TAG_IMAGE: {
			Intent intent = new Intent(getActivity(),
					ImageChooserActivity.class);
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


	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case JuniorClassSelectActivity.REQUEST_CODE_CLASS_SELECT:
			if (data != null
					&& data.hasExtra(JuniorClassSelectActivity.EXTRA_JUNIOR_CLASS)) {
				JuniorClass juniorClass = (JuniorClass) data
						.getSerializableExtra(JuniorClassSelectActivity.EXTRA_JUNIOR_CLASS);
				mViewClassName.setText((juniorClass == null) ? "None"
						: juniorClass.getPrimaryName());
			}
			break;
		case REQUEST_CODE_IMAGE:
			if (resultCode != Activity.RESULT_OK) {
				return;
			}
			Uri selectedImage = data.getData();
			UIUtils.loadImage(getActivity(), mImageLoadingListener,
					selectedImage);
			break;
		}
	}

	@Override
	public String getTitle() {
		return "Edit Handler";
	}

}
