package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.FragmentManager;
import android.app.FragmentManager.OnBackStackChangedListener;
import android.net.Uri;
import android.os.Bundle;

import java.util.Map;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.Handlers;
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
	private static final String FRAGMENT_TAG_EDIT = "handler_edit";
	private static final String FRAGMENT_TAG_VIEW = "handler_view";
	private static final String FRAGMENT_TAG_LIST = "single_pane";
	private static final String[] mStackTags = new String[] {
			FRAGMENT_TAG_EDIT, FRAGMENT_TAG_VIEW, FRAGMENT_TAG_LIST };
	private String mTitle;

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
		getFragmentManager().beginTransaction()
				.addToBackStack(FRAGMENT_TAG_VIEW)
				.replace(R.id.root_container, mViewFragment, FRAGMENT_TAG_VIEW)
				.commit();
		return true;
	}

	public boolean onAddEntityClick(Uri uri) {
		currentHandler = null;
		mEditFragment = HandlerEditFragment.newInstance(currentHandler);

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
		mEditFragment = HandlerEditFragment.newInstance(currentHandler);
		getFragmentManager().beginTransaction()
				.addToBackStack(FRAGMENT_TAG_EDIT)
				.replace(R.id.root_container, mEditFragment, FRAGMENT_TAG_EDIT)
				.commit();
	}

	@Override
	public final void onCancel() {
		getFragmentManager().popBackStack(FRAGMENT_TAG_EDIT,
				FragmentManager.POP_BACK_STACK_INCLUSIVE);
	}

	public void onSave(Map<String, Object> entityMap) {
		PersistHelper helper = new PersistHelper(this);
		if (currentHandler == null) {
			helper.createEntity(Handlers.CONTENT_URI, entityMap);
		} else {
			helper.updateEntity(Handlers.CONTENT_URI,
					Handlers.getHandlerId(currentHandler), entityMap);
		}
		getFragmentManager().popBackStack(FRAGMENT_TAG_EDIT,
				FragmentManager.POP_BACK_STACK_INCLUSIVE);
	}

	@Override
	public void onBackStackChanged() {
		String topTag = setTopMenuVisible(mStackTags);
		String newTitle = "";
		if (topTag.equals(FRAGMENT_TAG_LIST)) {
			newTitle = ((HandlerListFragment) getFragmentManager()
					.findFragmentByTag(topTag)).getTitle();
		} else if (topTag.equals(FRAGMENT_TAG_VIEW)) {
			newTitle = ((HandlerViewFragment) getFragmentManager()
					.findFragmentByTag(topTag)).getTitle();
		} else if (topTag.equals(FRAGMENT_TAG_EDIT)) {
			newTitle = ((HandlerEditFragment) getFragmentManager()
					.findFragmentByTag(topTag)).getTitle();
		}
		getActionBar().setTitle(newTitle);
	}

	protected String getTitleForTag(String tag) {
		if (tag.equals(FRAGMENT_TAG_EDIT))
			return "Edit";
		if (tag.equals(FRAGMENT_TAG_VIEW))
			return mViewFragment.getTitle();
		if (tag.equals(FRAGMENT_TAG_LIST))
			return mListFragment.getTitle();
		return null;
	}

}
