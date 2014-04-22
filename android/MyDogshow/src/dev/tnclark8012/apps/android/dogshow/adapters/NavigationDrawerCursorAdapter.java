package dev.tnclark8012.apps.android.dogshow.adapters;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.ShowTeamsQuery;

public class NavigationDrawerCursorAdapter extends SimpleCursorAdapter {

	private String mDefaultSelectedText;
	private int selectedItem = -1;
	private int mTextViewResourceId;
	private int selectedColor;
	private int defaultColor;
	private int mDefaultSelectedTextColumn;

	public NavigationDrawerCursorAdapter(Activity activity, Cursor c, boolean autoRequery, int layoutId, int textViewResourceId, int textColumnIndex) {
		super(activity, c, autoRequery, layoutId, textViewResourceId, textColumnIndex);
		mTextViewResourceId = textViewResourceId;
		selectedColor = activity.getResources().getColor(R.color.accent_1);
		defaultColor = activity.getResources().getColor(R.color.black);
	}

	public NavigationDrawerCursorAdapter(Activity activity, Cursor c, boolean autoRequery, int layoutId, int textViewResourceId, int textColumnIndex, String defaultSelectedText, int defaultSelectTextColumn) {
		super(activity, c, autoRequery, layoutId, textViewResourceId, textColumnIndex);
		mDefaultSelectedText = defaultSelectedText;
		mDefaultSelectedTextColumn = defaultSelectTextColumn;
		mTextViewResourceId = textViewResourceId;
		selectedColor = activity.getResources().getColor(R.color.accent_1);
		defaultColor = activity.getResources().getColor(R.color.black);
	}

	public void selectItem(int position) {
		selectedItem = position;
	}

	@Override
	public void bindView(View view, Context context, Cursor cursor) {
		super.bindView(view, context, cursor);
		TextView textView = (TextView) view.findViewById(mTextViewResourceId);
		if (selectedItem == -1 && mDefaultSelectedText != null && mDefaultSelectedText.equals(cursor.getString(mDefaultSelectedTextColumn))) {
			textView.setTypeface(null, Typeface.BOLD);
			textView.setTextColor(selectedColor);
		} else if (cursor.getPosition() == selectedItem) {
			textView.setTypeface(null, Typeface.BOLD);
			textView.setTextColor(selectedColor);
		} else {
			textView.setTypeface(null, Typeface.NORMAL);
			textView.setTextColor(defaultColor);
		}
	}

}
