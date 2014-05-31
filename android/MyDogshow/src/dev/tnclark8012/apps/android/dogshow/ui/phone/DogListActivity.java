package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.FragmentManager;
import android.app.FragmentManager.OnBackStackChangedListener;
import android.net.Uri;
import android.os.Bundle;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.ui.DogEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.DogListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.DogViewFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListActivity;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment.Callbacks;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigationDrawerFragment;

public class DogListActivity extends BaseEntityListActivity implements
		Callbacks, DogViewFragment.Callbacks, DogEditFragment.Callbacks,
		OnBackStackChangedListener {

	private Uri currentDog;
	private DogEditFragment mEditFragment;
	private DogViewFragment mViewFragment;
	private DogListFragment mListFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getFragmentManager().addOnBackStackChangedListener(this);
	}

	@Override
	protected BaseEntityListFragment getListFragment() {
		mListFragment = new DogListFragment();
		return mListFragment;
	}

	@Override
	protected BaseEditableEntityEditFragment getEditFragment() {
		return new DogEditFragment();
	}

	@Override
	protected Uri getEntityUri(String entityId) {
		return Dogs.buildDogUri(entityId);
	}

	@Override
	public void onNavigationDrawerItemSelected(int position) {
		if (position != NavigationDrawerFragment.NAVIGATION_DOGS) {
			super.onNavigationDrawerItemSelected(position);
		}
	}

	public boolean onEntityClick(Uri uri, String entityId) {
		currentDog = Dogs.buildDogUri(entityId);
		mViewFragment = DogViewFragment.newInstance(currentDog);
		getFragmentManager().beginTransaction().addToBackStack("view_dog")
				.add(R.id.root_container, mViewFragment, "view_dog").commit();
		return true;
	}

	public boolean onAddEntityClick(Uri uri) {
		currentDog = null;
		mEditFragment = DogEditFragment.newInstance(currentDog);

		getFragmentManager().beginTransaction().addToBackStack("edit_dog")
				.add(R.id.root_container, mEditFragment, "edit_dog").commit();
		return true;
	}

	public void onDeleteEntity(Uri uri, String entityId) {

	}

	@Override
	public void onEditClick() {
		mEditFragment = DogEditFragment.newInstance(currentDog);
		getFragmentManager().beginTransaction().addToBackStack("edit_dog")
				.add(R.id.root_container, mEditFragment, "edit_dog").commit();
	}

	@Override
	public final void onCancel() {
		getFragmentManager().popBackStack("edit_dog",
				FragmentManager.POP_BACK_STACK_INCLUSIVE);
	}

	public void onSave() {
		PersistHelper helper = new PersistHelper(this);
		if (currentDog == null) {
			helper.createEntity(Dogs.CONTENT_URI,
					mEditFragment.getEntityValueMap());
		} else {
			helper.updateEntity(Dogs.CONTENT_URI, Dogs.getDogId(currentDog),
					mEditFragment.getEntityValueMap());
		}
		getFragmentManager().popBackStack("edit_dog",
				FragmentManager.POP_BACK_STACK_INCLUSIVE);
	}

	@Override
	public void onBackStackChanged() {
		setTopMenuVisible("edit_dog", "view_dog", "single_pane");
	}

	@Override
	protected String getTitleForTag(String tag) {
		if (tag.equals("edit_dog"))
			return "Edit";
		if (tag.equals("view_dog"))
			return mViewFragment.getTitle();
		if (tag.equals("single_pane"))
			return mListFragment.getTitle();
		return null;
	}

}
