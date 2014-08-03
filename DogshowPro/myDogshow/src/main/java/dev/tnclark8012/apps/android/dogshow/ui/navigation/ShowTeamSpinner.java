package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.app.Activity;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.Spinner;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;

public class ShowTeamSpinner extends NonNavigationDrawerItem {
	private CursorAdapter mAdapter;
	private Activity mActivity;
	private Spinner mSpinner;

	public ShowTeamSpinner(Activity activity) {
		super(R.layout.drawer_item_spinner, IGNORE_RESOURCE, null);
		mActivity = activity;
	}

	public ShowTeamSpinner() {
		this(null);
	}

	@Override
	protected DrawerItemViewHolder getViewHolder() {
		return new DrawerItemSpinnerViewHolder();
	}

	public void changeCursor(Cursor cursor) {
		if (mAdapter == null) {
			mAdapter = new ShowTeamSpinnerAdapter(mActivity, null, false);
		}
		mAdapter.changeCursor(cursor);
	}

	@Override
	public View getCustomView(int position, int totalItems, View convertView,
			ViewGroup parent) {
		convertView.setClickable(true);
		convertView.setFocusable(true);
		DrawerItemSpinnerViewHolder holder = (DrawerItemSpinnerViewHolder) convertView
				.getTag();

		if (holder.spinner == null) {
			holder.spinner = (Spinner) convertView
					.findViewById(R.id.drawerSpinner);
		}
		holder.spinner.setClickable(false);
		if (mAdapter == null) {
			mAdapter = new ShowTeamSpinnerAdapter(mActivity, null, false);
		}
		holder.spinner.setAdapter(mAdapter);
		mSpinner = holder.spinner;
		mSpinner.setVisibility((Prefs.isSyncEnabled(mActivity) ? View.VISIBLE
				: View.GONE));
		return convertView;
	}

	private static class DrawerItemSpinnerViewHolder extends
			DrawerItemViewHolder {
		Spinner spinner;
	}
}
