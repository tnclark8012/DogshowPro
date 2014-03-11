package dev.tnclark8012.apps.android.dogshow.ui;

import android.app.Activity;
import android.content.CursorLoader;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.CursorAdapter;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.adapters.SimpleCursorAdapter;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract.ShowTeams;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.ShowTeamsQuery;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseEntityListFragment.Callbacks;

public class ShowTeamListFragment extends BaseEntityListFragment implements Callbacks {

	@Override
	protected Uri getContentUri() {
		return ShowTeams.CONTENT_URI;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}

	@Override
	protected CursorAdapter getCursorAdapter(Activity activity) {
		return new SimpleCursorAdapter(activity, null, false, R.layout.list_item_simple, R.id.text1, ShowTeamsQuery.TEAM_NAME);
	}

	@Override
	protected CursorLoader getCursorLoader(Activity activity, Uri uri) {
		return new CursorLoader(activity, ShowTeams.CONTENT_URI, ShowTeamsQuery.PROJECTION, null, null, null);
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
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.list_show_team, menu);
	}

}
