package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.FragmentManager;
import android.app.FragmentManager.OnBackStackChangedListener;
import android.net.Uri;
import android.os.Bundle;

import java.util.Map;

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
	private static final String FRAGMENT_TAG_EDIT = "edit_dog";
	private static final String FRAGMENT_TAG_VIEW = "view_dog";
	private static final String FRAGMENT_TAG_LIST = "single_pane";
	private static final String[] mStackTags = new String[] {
			FRAGMENT_TAG_EDIT, FRAGMENT_TAG_VIEW, FRAGMENT_TAG_LIST };

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
		adding = false;
		getFragmentManager().beginTransaction()
				.addToBackStack(FRAGMENT_TAG_VIEW)
				.replace(R.id.root_container, mViewFragment, FRAGMENT_TAG_VIEW)
				.commit();
		return true;
	}

	boolean adding;

	public boolean onAddEntityClick(Uri uri) {
		currentDog = null;
		adding = true;
		mEditFragment = DogEditFragment.newInstance(currentDog);

		getFragmentManager().beginTransaction()
				.addToBackStack(FRAGMENT_TAG_EDIT)
				.replace(R.id.root_container, mEditFragment, FRAGMENT_TAG_EDIT)
				.commit();
		return true;
	}

	public void onDeleteEntity(Uri uri, String entityId) {

	}

	@Override
	public void onEditClick() {
		mEditFragment = DogEditFragment.newInstance(currentDog);
		getFragmentManager().beginTransaction()
				.addToBackStack(FRAGMENT_TAG_EDIT)
				.replace(R.id.root_container, mEditFragment, FRAGMENT_TAG_EDIT)
				.commit();
	}

	@Override
	public final void onCancel() {
		getFragmentManager().popBackStack(FRAGMENT_TAG_EDIT,
				FragmentManager.POP_BACK_STACK_INCLUSIVE);
		adding = false;
	}

	public void onSave(Map<String, Object> entityMap) {
		PersistHelper helper = new PersistHelper(this);
		if (currentDog == null) {
			helper.createEntity(Dogs.CONTENT_URI, entityMap);
		} else {
			helper.updateEntity(Dogs.CONTENT_URI, Dogs.getDogId(currentDog),
					entityMap);
		}
		getFragmentManager().popBackStack(FRAGMENT_TAG_EDIT,
				FragmentManager.POP_BACK_STACK_INCLUSIVE);
		adding = false;
	}

	@Override
	public void onBackStackChanged() {
		String topTag = setTopMenuVisible(mStackTags);
		String newTitle = "";
		if (topTag.equals(FRAGMENT_TAG_LIST)) {
			newTitle = ((DogListFragment) getFragmentManager()
					.findFragmentByTag(topTag)).getTitle();
		} else if (topTag.equals(FRAGMENT_TAG_VIEW)) {
			newTitle = ((DogViewFragment) getFragmentManager()
					.findFragmentByTag(topTag)).getTitle();
		} else if (topTag.equals(FRAGMENT_TAG_EDIT)) {
			newTitle = ((DogEditFragment) getFragmentManager()
					.findFragmentByTag(topTag)).getTitle();
		}
		getActionBar().setTitle(newTitle);
	}
}
