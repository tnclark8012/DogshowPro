package dev.tnclark8012.dogshow.apps.android.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.sync.SyncHelper;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class DogEditFragment extends SherlockFragment implements
		LoaderManager.LoaderCallbacks<Cursor>, OnClickListener,
		OnCheckedChangeListener {
	private static final String TAG = DogEditFragment.class.getSimpleName();
	private String mDogId = "-1";
	private Uri mDogUri;
	private String mCallName;
	private String mBreedName;
	private int mSexId;
	private String mOwnerId = "0";
	private String mPoints;
	private String mMajors;
	private String mTitleStrin;

	private ViewGroup mRootView;
	private RelativeLayout mViewImage;
	private EditText mViewName;
	private TextView mViewBreed;
	private TextView mViewPoints;
	private TextView mViewMajors;
	private TextView mViewOwner;
	private RadioGroup mViewSex;

	private String mImagePath;

	private EditText mEditNameView;

	private Menu mMenu;

	private Callbacks mCallbacks;
	private int mDogQueryToken;

	private final int TAG_BREED = 0;
	private final int TAG_IMAGE = 1;
	public final int REQUEST_CODE_IMAGE = 2;
	private boolean createNew = false;
	public static final String INTENT_EXTRA_NEW_DOG = "dev.tnclark8012.dogshow.apps.android.extra.NEW_DOG";

	public interface Callbacks {
		public void onSave();

		public void onCancel();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);

		final Intent intent = BaseActivity
				.fragmentArgumentsToIntent(getArguments());
		if (intent.getBooleanExtra(INTENT_EXTRA_NEW_DOG, false)) {
			createNew = true;
		} else {
			mDogUri = intent.getData();

			if (mDogUri == null) {
				return;
			}

			mDogId = DogshowContract.Dogs.getDogId(mDogUri);

			LoaderManager manager = getLoaderManager();
			manager.restartLoader(DogQuery._TOKEN, null, this);
		}
	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mRootView = (ViewGroup) inflater.inflate(R.layout.fragment_dog_edit,
				null);
		mViewImage = (RelativeLayout) mRootView
				.findViewById(R.id.dog_edit_image);
		mViewName = (EditText) mRootView.findViewById(R.id.dog_edit_name);
		mViewBreed = (TextView) mRootView
				.findViewById(R.id.dog_edit_section_breed_text);
		mViewMajors = (TextView) mRootView
				.findViewById(R.id.dog_edit_section_majors_text);
		mViewPoints = (TextView) mRootView
				.findViewById(R.id.dog_edit_section_points_text);
		mViewOwner = (TextView) mRootView
				.findViewById(R.id.dog_edit_section_owner_text);
		mViewSex = (RadioGroup) mRootView.findViewById(R.id.dog_edit_sex_radio);

		getSherlockActivity().getSupportActionBar().setTitle("Edit Dog");
		mViewBreed.setTag(TAG_BREED);
		mViewBreed.setOnClickListener(this);
		mViewImage.setTag(TAG_IMAGE);
		mViewImage.setOnClickListener(this);
		mViewSex.setOnCheckedChangeListener(this);
		return mRootView;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		if (!(activity instanceof Callbacks)) {
			throw new ClassCastException(
					"Activity must implement fragment's callbacks.");
		}

		mCallbacks = (Callbacks) activity;
		activity.getContentResolver().registerContentObserver(
				DogshowContract.Dogs.CONTENT_URI, true, mObserver);

	}

	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		super.onDetach();
		getActivity().getContentResolver().unregisterContentObserver(mObserver);
	}

	private void onDogQueryComplete(Cursor cursor) {
		cursor.moveToFirst();
		Log.v(TAG, "onDogQueryComplete() called from thread "
				+ Thread.currentThread().getName());
		mBreedName = cursor.getString(DogQuery.DOG_BREED);
		mCallName = cursor.getString(DogQuery.DOG_CALL_NAME);
		mMajors = String.valueOf(cursor.getInt(DogQuery.DOG_MAJORS));
		mPoints = String.valueOf(cursor.getInt(DogQuery.DOG_POINTS));
		mViewBreed.setText(mBreedName);
		mViewName.setText(mCallName);
		mSexId = getRadioIdFromSex(cursor.getInt(DogQuery.DOG_SEX));
		mViewSex.check(mSexId);
		String imagePath = cursor.getString(DogQuery.DOG_IMAGE_PATH);
		if (imagePath != null) {
			mImagePath = imagePath;
			Resources res = getResources();
			int height = res.getDimensionPixelSize(R.dimen.header_icon_height);
			int width = res.getDimensionPixelSize(R.dimen.header_icon_width);
			// TODO fix deprecation with sdk check
			// TODO move to AsyncTask
			BitmapDrawable image = new BitmapDrawable(res, UIUtils.loadBitmap(
					imagePath, width, height));
			mViewImage.setBackgroundDrawable(image);// setBackgroundDrawable(Drawable.createFromPath(imagePath));
			// mViewImage.setBackgroundDrawable(Drawable.createFromPath(imagePath));
		} else {
			mViewImage.setBackgroundResource(R.drawable.dog);
		}

		// mViewMajors.setText(String.valueOf(mMajors));
		// mViewPoints.setText(String.valueOf(mPoints));

	}

	private final ContentObserver mObserver = new ContentObserver(new Handler()) {
		@Override
		public void onChange(boolean selfChange) {
			if (getActivity() == null) {
				return;
			}

			Loader<Cursor> loader = getLoaderManager()
					.getLoader(mDogQueryToken);
			if (loader != null) {
				loader.forceLoad();
			}
		}
	};

	@Override
	public Loader<Cursor> onCreateLoader(int id, Bundle data) {
		CursorLoader loader = null;
		if (id == DogQuery._TOKEN) {
			loader = new CursorLoader(getActivity(), mDogUri,
					DogQuery.PROJECTION, null, null, null);

		}
		return loader;
	}

	@Override
	public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
		if (getActivity() == null) {
			return;
		}

		if (loader.getId() == DogQuery._TOKEN) {
			onDogQueryComplete(cursor);
		}
	}

	@Override
	public void onLoaderReset(Loader<Cursor> arg0) {
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		mMenu = menu;
		inflater.inflate(R.menu.dog_edit, menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
		case R.id.menu_dog_edit_cancel:
			mCallbacks.onCancel();
			return true;
		case R.id.menu_dog_edit_save:
			save();
			mCallbacks.onSave();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void save() {

		mBreedName = mViewBreed.getText().toString();
		mCallName = mViewName.getText().toString();
		mMajors = mViewMajors.getText().toString();
		mPoints = mViewPoints.getText().toString();
		// TODO make this method take charsequences
		if (createNew) {
			new SyncHelper(getActivity()).createDog(mDogId, mBreedName,
					mCallName, mImagePath, mMajors, mOwnerId, mPoints,
					getSexFromRadioId(mSexId));
		} else {
			new SyncHelper(getActivity()).updateDog(mDogId, mBreedName,
					mCallName, mImagePath, mMajors, mOwnerId, mPoints,
					getSexFromRadioId(mSexId));
		}
	}

	private int getSexFromRadioId(int id) {
		return (id == R.id.dog_edit_sex_radio_male) ? Dogs.MALE : Dogs.FEMALE;
	}

	private int getRadioIdFromSex(int sex) {
		return (sex == Dogs.MALE) ? R.id.dog_edit_sex_radio_male
				: R.id.dog_edit_sex_radio_female;
	}

	@Override
	public void onClick(View v) {
		int tag = (Integer) v.getTag();
		switch (tag) {
		case TAG_BREED: {
			Intent selectIntent = new Intent(getActivity(),
					BreedSelectActivity.class);
			startActivityForResult(selectIntent,
					BreedSelectActivity.REQUEST_CODE_BREED_SELECT);
		}
			break;
		case TAG_IMAGE: {
			Intent intent = new Intent(
					Intent.ACTION_PICK,
					android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);

			intent.setType("image/*");
			// intent.putExtra("crop", "true");
			// intent.putExtra("scale", true);
			// intent.putExtra("outputX", PHOTO_WIDTH);
			// intent.putExtra("outputY", PHOTO_HEIGHT);
			// intent.putExtra("aspectX", 1);
			// intent.putExtra("aspectY", 1);
			intent.putExtra("return-data", true);
			startActivityForResult(intent, REQUEST_CODE_IMAGE);
		}
			break;
		}
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case BreedSelectActivity.REQUEST_CODE_BREED_SELECT:
			if (data != null
					&& data.hasExtra(BreedSelectActivity.EXTRA_BREED_GROUP)) {
				Breeds breed = (Breeds) data
						.getSerializableExtra(BreedSelectActivity.EXTRA_BREED_GROUP);
				mViewBreed.setText(breed.getPrimaryName());
			}
			break;
		case REQUEST_CODE_IMAGE:
			if (resultCode != Activity.RESULT_OK) {
				return;
			}
			final Bundle extras = data.getExtras();
			Uri selectedImage = data.getData();
			String[] filePathColumn = { MediaStore.Images.Media.DATA };

			Cursor cursor = getActivity().getContentResolver().query(
					selectedImage, filePathColumn, null, null, null);
			cursor.moveToFirst();

			int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
			mImagePath = cursor.getString(columnIndex);
			cursor.close();

			mViewImage.setBackgroundDrawable(Drawable
					.createFromPath(mImagePath));
			break;
		}

	}

	private interface DogQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { DogshowContract.Dogs._ID,
				DogshowContract.Dogs.DOG_BREED,
				DogshowContract.Dogs.DOG_CALL_NAME,
				DogshowContract.Dogs.DOG_MAJORS,
				DogshowContract.Dogs.DOG_POINTS,
				DogshowContract.Dogs.DOG_IMAGE_PATH,
				DogshowContract.Dogs.DOG_SEX };
		int DOG_ID = 0;
		int DOG_BREED = 1;
		int DOG_CALL_NAME = 2;
		int DOG_MAJORS = 3;
		int DOG_POINTS = 4;
		int DOG_IMAGE_PATH = 5;
		int DOG_SEX = 6;
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		mSexId = checkedId;
	}
}
