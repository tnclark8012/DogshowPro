package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query;

public class ShowTeamSpinnerAdapter extends CursorAdapter implements
		SpinnerAdapter {
	Cursor mCursor;

	public ShowTeamSpinnerAdapter(Context context, Cursor c, boolean autoRequery) {
		super(context, c, autoRequery);
		mCursor = c;
	}

	private static class SpinnerHolder {
		TextView teamIcon;
		TextView name;
		TextView email;
	}

	@Override
	public View newView(Context context, Cursor cursor, ViewGroup parent) {
		LayoutInflater inflater = ((Activity) context).getLayoutInflater();
		View view = inflater.inflate(R.layout.spinner_item_team, parent, false);
		SpinnerHolder holder = new SpinnerHolder();
		holder.teamIcon = (TextView) view.findViewById(R.id.spinner_team_icon);
		holder.name = (TextView) view.findViewById(R.id.spinner_team_name);
		holder.email = (TextView) view.findViewById(R.id.spinner_team_owner);
		view.setTag(holder);
		return view;
	}

	@Override
	public void bindView(View view, final Context context, Cursor cursor) {
		SpinnerHolder holder;
		holder = (SpinnerHolder) view.getTag();
		// boolean active =
		// cursor.getString(Query.ShowTeamsQuery.IDENTIFIER).equals(Prefs.currentTeamIdentifier(context));
		String name = cursor.getString(Query.ShowTeamsQuery.TEAM_NAME);
		final String identifier = cursor
				.getString(Query.ShowTeamsQuery.IDENTIFIER);
		holder.name.setText(name);
		holder.teamIcon.setText(name.toUpperCase().substring(0, 1));
		view.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(v.getContext(), "OnBindClicked",
						Toast.LENGTH_SHORT).show();
				Prefs.setCurrentTeamIdentifier(context, identifier);
			}
		});
	}
}
