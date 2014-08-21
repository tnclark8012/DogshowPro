package dev.tnclark8012.apps.android.dogshow.ui.base;

import android.app.Fragment;
import android.app.FragmentManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import java.util.Map;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigatableActivity;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public abstract class BaseEntityListActivity extends NavigatableActivity
		implements BaseEntityListFragment.Callbacks,
		BaseEditableEntityEditFragment.Callbacks {
	BaseEntityListFragment mListFragment;
	private static final String TAG = makeLogTag(BaseEntityListActivity.class);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	protected abstract BaseEntityListFragment getListFragment();

	protected abstract BaseEditableEntityEditFragment getEditFragment();

	protected abstract Uri getEntityUri(String entityId);

	// protected abstract String getTitleForTag(String tag);

	protected String setTopMenuVisible(String[] tags) {
		FragmentManager manager = getFragmentManager();
		Fragment f;
		String tag;
		boolean visible = true;
		int top = 0;
		for (int i = 0; i < tags.length; i++) {
			tag = tags[i];
			if ((f = manager.findFragmentByTag(tag)) != null) {
				f.setMenuVisibility(visible);
				if (visible) {
					top = i;
				}
				visible = false;
			}
		}
		setDrawerIndicatorEnabled(top == tags.length - 1);
		return tags[top];
	}

	@Override
	protected final Fragment onCreatePane() {
		if (mListFragment == null)
			mListFragment = getListFragment();
		return mListFragment;
	}

	@Override
	protected void onResume() {
		super.onResume();
		if (mListFragment == null) {
			mListFragment = getListFragment();
		}
	}

	private void swapFragments(boolean toAdd) {
		Fragment swapIn;
		Bundle args = intentToFragmentArguments(getIntent());
		if (toAdd) {
			swapIn = getEditFragment();
			args.putBoolean(
					BaseEditableEntityEditFragment.INTENT_EXTRA_NEW_ENTITY,
					true);
		} else {
			swapIn = mListFragment;
		}
		swapIn.setArguments(args);
		getFragmentManager().beginTransaction()
				.replace(R.id.root_container, swapIn, "single_pane").commit();
	}

	@Override
	public boolean onEntityClick(Uri uri, String entityId) {
		// startActivity(new Intent(Intent.ACTION_VIEW,
		// getEntityUri(entityId)));
		return false;
	}

	@Override
	public boolean onAddEntityClick(Uri uri) {
		// swapFragments(true);
		return true;
	}

	@Override
	public void onSave(Map<String, Object> entityMap) {
		// swapFragments(false);

	}

	@Override
	public void onCancel() {
		// swapFragments(false);
	}

	@Override
	public void onDeleteEntity(Uri uri, String entityId) {
		Log.d(TAG, "Delete request for entity Id: " + entityId);
		PersistHelper helper = new PersistHelper(this);
		helper.deleteEntity(getEntityUri(entityId));
	}
}
