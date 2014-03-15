package dev.tnclark8012.apps.android.dogshow.adapters;

import dev.tnclark8012.apps.android.dogshow.sql.query.Query.ShowTeamsQuery;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

public class NavigationDrawerCursorAdapter extends SimpleCursorAdapter {

	private String mDefaultSelectedText;
	private int selectedItem = -1;
	private int mTextViewResourceId;

	public NavigationDrawerCursorAdapter(Activity activity, Cursor c, boolean autoRequery, int layoutId, int textViewResourceId, int textColumnIndex) {
		super(activity, c, autoRequery, layoutId, textViewResourceId, textColumnIndex);
		mTextViewResourceId = textViewResourceId;
	}

	public NavigationDrawerCursorAdapter(Activity activity, Cursor c, boolean autoRequery, int layoutId, int textViewResourceId, int textColumnIndex, String defaultSelectedText) {
		super(activity, c, autoRequery, layoutId, textViewResourceId, textColumnIndex);
		mDefaultSelectedText = defaultSelectedText;
		mTextViewResourceId = textViewResourceId;
	}

	public void selectItem(int position) {
		selectedItem = position;
	}

	@Override
	public void bindView(View view, Context context, Cursor cursor) {
		super.bindView(view, context, cursor);
		if (selectedItem == -1 && mDefaultSelectedText != null && mDefaultSelectedText.equals(cursor.getString(ShowTeamsQuery.TEAM_NAME))) {
			((TextView) view.findViewById(mTextViewResourceId)).setTypeface(null, Typeface.BOLD);
		} else {
			((TextView) view.findViewById(mTextViewResourceId)).setTypeface(null, cursor.getPosition() == selectedItem ? Typeface.BOLD : Typeface.NORMAL);
		}
	}

}
