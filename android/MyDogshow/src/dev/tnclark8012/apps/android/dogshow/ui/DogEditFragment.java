package dev.tnclark8012.apps.android.dogshow.ui;

import java.util.HashMap;
import java.util.Map;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.phone.BreedSelectActivity;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class DogEditFragment extends BaseEditableEntityEditFragment implements LoaderManager.LoaderCallbacks<Cursor>, OnClickListener, OnCheckedChangeListener {
	private static final String TAG = DogEditFragment.class.getSimpleName();

	private String mCallName;
	private String mBreedName;
	private int mSexId;
	private String mOwnerId = "0";
	private String mPoints;
	private String mMajors;

	private ViewGroup mRootView;
	private View mViewImage;
	private EditText mViewName;
	private TextView mViewBreed;
	private TextView mViewPoints;
	private TextView mViewMajors;
	private TextView mViewOwner;
	private RadioGroup mViewSex;
	private CheckBox mViewVeteran;

	private String mImagePath;

	private final int TAG_BREED = 0;
	private final int TAG_IMAGE = 1;
	public final int REQUEST_CODE_IMAGE = 2;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		mRootView = (ViewGroup) inflater.inflate(R.layout.fragment_dog_edit, null);
		mViewImage = mRootView.findViewById(R.id.dog_edit_image);
		mViewName = (EditText) mRootView.findViewById(R.id.dog_edit_name);
		mViewBreed = (TextView) mRootView.findViewById(R.id.dog_edit_section_breed_text);
		mViewMajors = (TextView) mRootView.findViewById(R.id.dog_edit_section_majors_text);
		mViewPoints = (TextView) mRootView.findViewById(R.id.dog_edit_section_points_text);
		// mViewOwner = (TextView) mRootView.findViewById(R.id.dog_edit_section_owner_text);
		mViewSex = (RadioGroup) mRootView.findViewById(R.id.dog_edit_sex_radio);
		mViewVeteran = (CheckBox) mRootView.findViewById(R.id.dog_edit_section_veteran);

		getActivity().getActionBar().setTitle("Edit Dog");
		mViewBreed.setTag(TAG_BREED);
		mViewBreed.setOnClickListener(this);
		mViewImage.setTag(TAG_IMAGE);
		mViewImage.setOnClickListener(this);
		mViewSex.setOnCheckedChangeListener(this);
		return mRootView;
	}

	private int getSexFromRadioId(int id) {
		return (id == R.id.dog_edit_sex_radio_male) ? Dogs.MALE : Dogs.FEMALE;
	}

	private int getRadioIdFromSex(int sex) {
		return (sex == Dogs.MALE) ? R.id.dog_edit_sex_radio_male : R.id.dog_edit_sex_radio_female;
	}

	@Override
	public void onClick(View v) {
		int tag = (Integer) v.getTag();
		switch (tag) {
		case TAG_BREED: {
			Intent selectIntent = new Intent(getActivity(), BreedSelectActivity.class);
			startActivityForResult(selectIntent, BreedSelectActivity.REQUEST_CODE_BREED_SELECT);
		}
			break;
		case TAG_IMAGE: {
			Intent intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);

			intent.setType("image/*");
			// intent.putExtra("crop", "true");
			// intent.putExtra("scale", true);
			// intent.putExtra("outputX", PHOTO_WIDTH);
			// intent.putExtra("outputY", PHOTO_HEIGHT);
			// intent.putExtra("aspectX", 1);
			// intent.putExtra("aspectY", 1); TODO RELEASE: find these metrics
			intent.putExtra("return-data", true);
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
		case BreedSelectActivity.REQUEST_CODE_BREED_SELECT:
			if (data != null && data.hasExtra(BreedSelectActivity.EXTRA_BREED_GROUP)) {
				Breeds breed = (Breeds) data.getSerializableExtra(BreedSelectActivity.EXTRA_BREED_GROUP);
				mBreedName = breed.getPrimaryName();
				mViewBreed.setText(mBreedName);
			}
			break;
		case REQUEST_CODE_IMAGE:
			if (resultCode != Activity.RESULT_OK) {
				return;
			}
			Uri selectedImage = data.getData();
			String[] filePathColumn = { MediaStore.Images.Media.DATA };

			Cursor cursor = getActivity().getContentResolver().query(selectedImage, filePathColumn, null, null, null);
			if (cursor != null) {
				if (cursor.moveToFirst()) {
					int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
					mImagePath = cursor.getString(columnIndex);
					cursor.close();
					Resources res = getResources();
					int height = res.getDimensionPixelSize(R.dimen.header_icon_height);
					int width = res.getDimensionPixelSize(R.dimen.header_icon_width);
					BitmapDrawable image = new BitmapDrawable(res, UIUtils.loadBitmap(mImagePath, width, height));
					if (Utils.isJellybean()) {
						mViewImage.setBackground(image);
					} else {
						mViewImage.setBackgroundDrawable(image);
					}
				}
			}
			break;
		}
	}

	private interface DogQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { DogshowContract.Dogs._ID, DogshowContract.Dogs.DOG_BREED, DogshowContract.Dogs.DOG_CALL_NAME, DogshowContract.Dogs.DOG_MAJORS, DogshowContract.Dogs.DOG_POINTS, DogshowContract.Dogs.DOG_IMAGE_PATH, DogshowContract.Dogs.DOG_SEX, DogshowContract.Dogs.DOG_IS_VETERAN };
		int DOG_ID = 0;
		int DOG_BREED = 1;
		int DOG_CALL_NAME = 2;
		int DOG_MAJORS = 3;
		int DOG_POINTS = 4;
		int DOG_IMAGE_PATH = 5;
		int DOG_SEX = 6;
		int DOG_IS_VETERAN = 7;
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		mSexId = checkedId;
	}

	@Override
	protected int getEntityIdFromUri(Uri uri) {
		return Dogs.getDogId(uri);
	}

	@Override
	protected int getQueryToken() {
		return DogQuery._TOKEN;
	}

	@Override
	protected CursorLoader getCursorLoader(Activity activity, Uri uri) {
		return new CursorLoader(activity, uri, DogQuery.PROJECTION, null, null, null);
	}

	@SuppressLint("NewApi")
	@SuppressWarnings("deprecation")
	@Override
	protected void onQueryComplete(Cursor cursor) {
		cursor.moveToFirst();
		Log.v(TAG, "onDogQueryComplete() called from thread " + Thread.currentThread().getName());
		mBreedName = cursor.getString(DogQuery.DOG_BREED);
		mCallName = cursor.getString(DogQuery.DOG_CALL_NAME);
		mMajors = String.valueOf(cursor.getInt(DogQuery.DOG_MAJORS));
		mPoints = String.valueOf(cursor.getInt(DogQuery.DOG_POINTS));
		mViewBreed.setText(Breeds.parse(mBreedName).getPrimaryName());
		mViewName.setText(mCallName);
		mSexId = getRadioIdFromSex(cursor.getInt(DogQuery.DOG_SEX));
		mViewSex.check(mSexId);
		mViewVeteran.setChecked(Utils.getMaybeNull(cursor, DogQuery.DOG_IS_VETERAN, false));
		String imagePath = cursor.getString(DogQuery.DOG_IMAGE_PATH);
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
			mViewImage.setBackgroundResource(R.drawable.dog);
		}
	}

	@Override
	protected Uri getContentUri() {
		return Dogs.CONTENT_URI;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_entity_edit_save:
			if (mBreedName == null) {
				Toast.makeText(getActivity(), "Select a breed before saving", Toast.LENGTH_SHORT).show();
				return true;
			}
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected Map<String, Object> getEntityValueMap() {
		mBreedName = mViewBreed.getText().toString();
		mCallName = mViewName.getText().toString();
		mMajors = mViewMajors.getText().toString();
		mPoints = mViewPoints.getText().toString();
		Map<String, Object> values = new HashMap<String, Object>();
		values.put(Dogs.DOG_IS_SHOWING, 1);// FIXME implement a selection
		values.put(Dogs.DOG_BREED, DogshowEnums.Breeds.parse(mBreedName).toString());
		values.put(Dogs.DOG_IMAGE_PATH, mImagePath);
		values.put(Dogs.DOG_CALL_NAME, mCallName);
		values.put(Dogs.DOG_MAJORS, Utils.parseSafely(mMajors, 0));
		values.put(Dogs.DOG_POINTS, Utils.parseSafely(mPoints, 0));
		values.put(Dogs.DOG_OWNER_ID, Integer.parseInt(mOwnerId));
		values.put(Dogs.DOG_SEX, getSexFromRadioId(mSexId));
		values.put(Dogs.DOG_IS_VETERAN, Utils.booleanToInt(mViewVeteran.isChecked()));// TODO the UI shouldn't need to know it's stored as a bool/int/etc.
		values.put(Dogs.UPDATED, System.currentTimeMillis());
		return values;
	}
}
