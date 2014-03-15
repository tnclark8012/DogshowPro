package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.CursorLoader;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.adapters.SimpleCursorAdapter;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.ShowTeamsQuery;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment.Callbacks;
import dev.tnclark8012.apps.android.dogshow.ui.dialog.ShowTeamDialog;

public class ShowTeamListFragment extends BaseEntityListFragment implements Callbacks {

	@Override
	protected Uri getContentUri() {
		return ShowTeams.CONTENT_URI;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
		getActivity().setTitle("My Show Teams");
	}

	@Override
	protected CursorAdapter getCursorAdapter(Activity activity) {
		return new SimpleCursorAdapter(activity, null, false, R.layout.list_item_simple, R.id.text1, ShowTeamsQuery.TEAM_NAME);
	}

	@Override
	protected CursorLoader getCursorLoader(Activity activity, Uri uri) {
		return new CursorLoader(activity, ShowTeams.CONTENT_URI, ShowTeamsQuery.PROJECTION, ShowTeams.NOT_ME_SELECTION, null, ShowTeams.DEFAULT_SORT);
	}

	@Override
	protected int getIdColumnIndex() {
		return ShowTeamsQuery._ID;
	}

	@Override
	public boolean onEntityClick(String entityId) {
		return false;
	}

	@Override
	public boolean onAddEntityClick() {
		return false;
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.list_show_team, menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		ShowTeamDialog diag;
		Bundle args = new Bundle();
		switch (item.getItemId()) {
		case R.id.menu_list_team_join:
			args = new Bundle();
			args.putInt(ShowTeamDialog.KEY_MODE, ShowTeamDialog.MODE_JOIN);
			diag = ShowTeamDialog.newInstance();
			diag.setArguments(args);
			diag.show(getFragmentManager(), "join_dialog");
			return true;
		case R.id.menu_list_entity_add:
			args.putInt(ShowTeamDialog.KEY_MODE, ShowTeamDialog.MODE_CREATE);
			diag = ShowTeamDialog.newInstance();
			diag.setArguments(args);
			diag.show(getFragmentManager(), "create_dialog");
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected int getTitleColumnIndex() {
		return ShowTeamsQuery.TEAM_NAME;
	}

	@Override
	public boolean onItemLongClick(AdapterView<?> adapter, View view, int position, long id) {
		// ignore long click and prevent default delete behavior
		return true;
	}

	@Override
	public void onDeleteEntity(String entityId) {
		// ignore delete
	}

}
