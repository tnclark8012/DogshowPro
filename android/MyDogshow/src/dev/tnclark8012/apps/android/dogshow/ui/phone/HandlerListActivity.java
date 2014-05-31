package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.FragmentManager;
import android.app.FragmentManager.OnBackStackChangedListener;
import android.net.Uri;
import android.os.Bundle;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Dogs;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
import dev.tnclark8012.apps.android.dogshow.ui.DogEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.DogViewFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.HandlerViewFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEditableEntityEditFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListActivity;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigationDrawerFragment;

public class HandlerListActivity extends BaseEntityListActivity implements
		HandlerListFragment.Callbacks, HandlerViewFragment.Callbacks,
		HandlerEditFragment.Callbacks, OnBackStackChangedListener {

	private Uri currentHandler;
	private HandlerEditFragment mEditFragment;
	private HandlerViewFragment mViewFragment;
	private HandlerListFragment mListFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getFragmentManager().addOnBackStackChangedListener(this);
	}

	@Override
	protected BaseEntityListFragment getListFragment() {
		mListFragment = new HandlerListFragment();
		return mListFragment;
	}

	@Override
	protected BaseEditableEntityEditFragment getEditFragment() {
		return new HandlerEditFragment();
	}

	@Override
	protected Uri getEntityUri(String entityId) {
		return Handlers.buildHandlerUri(entityId);
	}

	@Override
	public void onNavigationDrawerItemSelected(int position) {
		if (position != NavigationDrawerFragment.NAVIGATION_HANDLERS) {
			super.onNavigationDrawerItemSelected(position);
		}
	}

	public boolean onEntityClick(Uri uri, String entityId) {
		currentHandler = getEntityUri(entityId);
		mViewFragment = HandlerViewFragment.newInstance(currentHandler);
		getFragmentManager().beginTransaction().addToBackStack("view_handler")
				.add(R.id.root_container, mViewFragment, "view_handler")
				.commit();
		return true;
	}

	public boolean onAddEntityClick(Uri uri) {
		currentHandler = null;
		mEditFragment = HandlerEditFragment.newInstance(currentHandler);

		getFragmentManager().beginTransaction().addToBackStack("edit_handler")
				.add(R.id.root_container, mEditFragment, "edit_handler")
				.commit();
		return true;
	}

	public void onDeleteEntity(Uri uri, String entityId) {

	}

	@Override
	public void onEditClick() {
		mEditFragment = HandlerEditFragment.newInstance(currentHandler);
		getFragmentManager().beginTransaction().addToBackStack("edit_handler")
				.add(R.id.root_container, mEditFragment, "edit_handler")
				.commit();
	}

	@Override
	public final void onCancel() {
		getFragmentManager().popBackStack("edit_handler",
				FragmentManager.POP_BACK_STACK_INCLUSIVE);
	}

	public void onSave() {
		PersistHelper helper = new PersistHelper(this);
		if (currentHandler == null) {
			helper.createEntity(Handlers.CONTENT_URI,
					mEditFragment.getEntityValueMap());
		} else {
			helper.updateEntity(Handlers.CONTENT_URI,
					Handlers.getHandlerId(currentHandler),
					mEditFragment.getEntityValueMap());
		}
		getFragmentManager().popBackStack("edit_handler",
				FragmentManager.POP_BACK_STACK_INCLUSIVE);
	}

	@Override
	public void onBackStackChanged() {
		setTopMenuVisible("edit_handler", "view_handler", "single_pane");
	};
	@Override
	protected String getTitleForTag(String tag) {
		if (tag.equals("edit_handler"))
			return "Edit";
		if (tag.equals("view_handler"))
			return mViewFragment.getTitle();
		if (tag.equals("single_pane"))
			return mListFragment.getTitle();
		return null;
	}

}
