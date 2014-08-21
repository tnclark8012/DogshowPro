package dev.tnclark8012.apps.android.dogshow.adapters;

import android.content.Context;
import android.database.Cursor;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import dev.tnclark8012.apps.android.dogshow.sql.query.Query;

public class ShowTeamDialogListAdapter extends ArrayAdapter<String> {
	ArrayList<String> mTeamIdentifiers;

	public ShowTeamDialogListAdapter(Context context, Cursor cursor) {
		super(context, android.R.layout.simple_list_item_single_choice,
				android.R.id.text1);
		mTeamIdentifiers = new ArrayList<String>();
		setTeams(cursor);
	}

	public String getIdentifierForPosition(int position) {
		return mTeamIdentifiers.get(position);
	}

	public void changeCursor(Cursor c) {
		setTeams(c);
	}

	private void setTeams(Cursor cursor) {
		mTeamIdentifiers.clear();
		clear();
		if (cursor != null) {
			cursor.moveToPosition(-1);
			// mTeamNames = new ArrayList<String>(cursor.getCount() + 1);
			while (cursor.moveToNext()) {
				add(cursor.getString(Query.ShowTeamsQuery.TEAM_NAME));
				mTeamIdentifiers.add(cursor
						.getString(Query.ShowTeamsQuery.IDENTIFIER));
				// mTeamNames.add(cursor.getString(Query.ShowTeamsQuery.TEAM_NAME));
			}
			// mTeamNames.add("Add team");
		}
		add("Add team");
		mTeamIdentifiers.add(null);
	}
}
