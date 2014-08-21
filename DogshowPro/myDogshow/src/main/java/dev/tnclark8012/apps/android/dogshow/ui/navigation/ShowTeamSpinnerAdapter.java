package dev.tnclark8012.apps.android.dogshow.ui.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query;
import dev.tnclark8012.apps.android.dogshow.sync.SyncHelper;
import dev.tnclark8012.apps.android.dogshow.ui.dialog.ShowTeamChooserDialog;
import dev.tnclark8012.apps.android.dogshow.ui.phone.ShowTeamAddActivity;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

public class ShowTeamSpinnerAdapter extends CursorAdapter implements
		SpinnerAdapter, ShowTeamChooserDialog.Callback {
	Cursor mCursor;
	Activity mActivity;

	public ShowTeamSpinnerAdapter(Activity activity, Cursor c,
			boolean autoRequery) {
		super(activity, c, autoRequery);
		mCursor = c;
		mActivity = activity;
	}

	private static class SpinnerHolder {
		TextView teamIcon;
		TextView name;
		TextView email;
	}

	@Override
	public void changeCursor(Cursor cursor) {
		mCursor = cursor;
		super.changeCursor(cursor);
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
		// Since this spinner will always only show the selected item (the first
		// in the cursor), move it to the beginning
		cursor.moveToFirst();
		holder = (SpinnerHolder) view.getTag();
		String name = cursor.getString(Query.ShowTeamsQuery.TEAM_NAME);
		final String identifier = cursor
				.getString(Query.ShowTeamsQuery.IDENTIFIER);
		holder.name.setText(name);
		holder.teamIcon.setText(name.toUpperCase().substring(0, 1));
		// TODO set team owner email
		view.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ShowTeamChooserDialog dialog = ShowTeamChooserDialog
						.newInstance();
				dialog.setCallback(ShowTeamSpinnerAdapter.this);
				dialog.changeCursor(mCursor);
				dialog.show(mActivity.getFragmentManager(), "tag");// TODO real
																	// // tag
			}
		});
	}

	@Override
	public void onFinishDialog(int status, String teamIdentifier) {
		if (status == ShowTeamChooserDialog.STATUS_ADD) {
			mActivity.startActivity(new Intent(mActivity,
					ShowTeamAddActivity.class));
		} else if (status == ShowTeamChooserDialog.STATUS_SELECT) {
			new PersistHelper(mActivity).setActiveTeam(teamIdentifier);
			SyncHelper.requestManualSync(mActivity,
					AccountUtils.getChosenAccount(mActivity), SyncHelper.FLAG_SYNC_REMOTE);
		}
	}

}
