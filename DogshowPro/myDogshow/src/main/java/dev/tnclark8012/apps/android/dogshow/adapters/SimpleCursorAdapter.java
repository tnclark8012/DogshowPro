package dev.tnclark8012.apps.android.dogshow.adapters;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Simple text view cursor adapter
 */
public class SimpleCursorAdapter extends CursorAdapter {
	private int mTextColumnIndex;
	private int mTextViewResourceId;
	private int mLayoutId;
	private Activity mActivity;

	public SimpleCursorAdapter(Activity activity, Cursor c, boolean autoRequery, int layoutId, int textViewResourceId, int textColumnIndex) {
		super(activity, c, autoRequery);
		mActivity = activity;
		mLayoutId = layoutId;
		mTextViewResourceId = textViewResourceId;
		mTextColumnIndex = textColumnIndex;
	}

	private static class ViewHolder {
		TextView textView;
	}

	@Override
	public void bindView(View view, Context context, Cursor cursor) {
		((ViewHolder) view.getTag()).textView.setText(cursor.getString(mTextColumnIndex));
	}

	@Override
	public View newView(Context context, Cursor cursor, ViewGroup parent) {
		View view = mActivity.getLayoutInflater().inflate(mLayoutId, parent, false);
		ViewHolder holder = new ViewHolder();
		holder.textView = ((TextView) view.findViewById(mTextViewResourceId));
		view.setTag(holder);
		return view;
	}

}
