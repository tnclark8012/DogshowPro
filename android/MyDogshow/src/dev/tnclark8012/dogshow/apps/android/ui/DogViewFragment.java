package dev.tnclark8012.dogshow.apps.android.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEditableEntityViewFragment;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class DogViewFragment extends BaseEditableEntityViewFragment {
	private static final String TAG = DogViewFragment.class.getSimpleName();
	private interface DogQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { DogshowContract.Dogs._ID,
				DogshowContract.Dogs.DOG_BREED,
				DogshowContract.Dogs.DOG_CALL_NAME,
				DogshowContract.Dogs.DOG_IMAGE_PATH,
				DogshowContract.Dogs.DOG_MAJORS,
				DogshowContract.Dogs.DOG_POINTS,
				DogshowContract.Dogs.DOG_SEX,
				DogshowContract.Dogs.DOG_IS_SHOWING};
		int DOG_ID = 0;
		int DOG_BREED = 1;
		int DOG_CALL_NAME = 2;
		int DOG_IMAGE_PATH = 3;
		int DOG_MAJORS = 4;
		int DOG_POINTS = 5;
		int DOG_SEX = 6;
		int DOG_IS_SHOWING = 7;
	}
	private String mCallName;
	private String mBreedName;
	private String mImagePath;
	private String mSex;
	private String mOwnerId;
	private int mPoints;
	private int mMajors;

	private ViewGroup mRootView;
	private View mViewImage;
	private TextView mViewName;
	private TextView mViewBreed;
	private TextView mViewPoints;
	private TextView mViewMajors;
	private TextView mViewOwner;
	private TextView mViewSex;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mRootView = (ViewGroup) inflater.inflate(R.layout.fragment_dog_view,
				null);
		mViewName = (TextView) mRootView.findViewById(R.id.dog_view_name);
		mViewBreed = (TextView) mRootView
				.findViewById(R.id.dog_view_section_breed_text);
		mViewMajors = (TextView) mRootView
				.findViewById(R.id.dog_view_section_majors_text);
		mViewPoints = (TextView) mRootView
				.findViewById(R.id.dog_view_section_points_text);
//		mViewOwner = (TextView) mRootView
//				.findViewById(R.id.dog_view_section_owner_text);
		mViewImage = mRootView
				.findViewById(R.id.dog_view_image);
		mViewSex = (TextView) mRootView.findViewById(R.id.dog_view_section_sex_text);
		return mRootView;
	}

	protected void onQueryComplete(Cursor cursor) {
		cursor.moveToFirst();
		mBreedName = cursor.getString(DogQuery.DOG_BREED);
		mCallName = cursor.getString(DogQuery.DOG_CALL_NAME);
		mImagePath = cursor.getString(DogQuery.DOG_IMAGE_PATH);
		mMajors = cursor.getInt(DogQuery.DOG_MAJORS);
		mPoints = cursor.getInt(DogQuery.DOG_POINTS);
		mSex = (cursor.getInt(DogQuery.DOG_SEX)==Dogs.MALE)? "Male" : "Female";//TODO string resource
		mViewBreed.setText(Breeds.parse(mBreedName).getPrimaryName());
		mViewSex.setText(mSex);
		mViewName.setText(mCallName);
		Log.v(TAG, "DOG_IS_SHOWING: " + cursor.getInt(DogQuery.DOG_IS_SHOWING));
		if (mImagePath != null) {
			Resources res = getResources();
			int height = res.getDimensionPixelSize(R.dimen.header_icon_height);
			int width = res.getDimensionPixelSize(R.dimen.header_icon_width);

			BitmapDrawable image = new BitmapDrawable(res, UIUtils.loadBitmap(
					mImagePath, width, height));
			mViewImage.setBackgroundDrawable(image);// setBackgroundDrawable(Drawable.createFromPath(imagePath));

			// mViewImage.setBackgroundDrawable(Drawable.createFromPath(mImagePath));
		} else {
			Log.w(TAG, "Image path was null");
			mViewImage.setBackgroundResource(R.drawable.dog);

		}
		// String majorsTemplate = ;
		Resources res = getResources();
		mViewMajors.setText(res.getQuantityString(R.plurals.template_majors,
				mMajors, mMajors ));
		Log.d(TAG, "Points: " + mPoints);
		if(mPoints >= 15)
		{
			mViewPoints.setText(res.getString(R.string.template_points_finished,
					mPoints));
		}
		else
		{
			mViewPoints.setText(res.getQuantityString(R.plurals.template_points_needed,
					mPoints, mPoints, 15- mPoints));
		}

	}

	@Override
	protected int getQueryToken() {
		return DogQuery._TOKEN;
	}

	@Override
	protected CursorLoader getCursorLoader(Activity activity, Uri uri) {
		return new CursorLoader(activity, uri, DogQuery.PROJECTION, null, null, null);
	}

	@Override
	protected Uri getContentUri() {
		return Dogs.CONTENT_URI;
	}
}
