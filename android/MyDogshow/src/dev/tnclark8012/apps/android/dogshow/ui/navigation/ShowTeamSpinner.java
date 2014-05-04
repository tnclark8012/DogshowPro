package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import java.util.List;

import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CursorAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;

public class ShowTeamSpinner extends NonNavigationDrawerItem {
	private Spinner mSpinner;
	private CursorAdapter mAdapter;

	public ShowTeamSpinner(OnClickListener spinnerClickListener) {
		super(R.layout.drawer_item_spinner, IGNORE_RESOURCE, null,
				spinnerClickListener);
	}

	public ShowTeamSpinner() {
		this(null);
	}

	@Override
	protected DrawerItemViewHolder getViewHolder() {
		return new DrawerItemSpinnerViewHolder();
	}

	public void changeCursor(Cursor cursor) {
		if (mAdapter != null) {
			mAdapter.changeCursor(cursor);
		}
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
		holder.spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> adapter, View view,
					int position, long id) {
				Toast.makeText(view.getContext(), "OnItemSelected",
						Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});
		mAdapter = new ShowTeamSpinnerAdapter(convertView.getContext(), null,
				false);
		holder.spinner.setAdapter(mAdapter);
		mSpinner = holder.spinner;
		return convertView;
	}

	private static class DrawerItemSpinnerViewHolder extends
			DrawerItemViewHolder {
		Spinner spinner;
	}
}
