package dev.tnclark8012.apps.android.dogshow.adapters;

import android.content.Context;
import android.database.Cursor;
import android.widget.CursorAdapter;

public abstract class BaseEntityCursorAdapter extends CursorAdapter {
	public BaseEntityCursorAdapter(Context context, Cursor c, boolean autoRequery) {
		super(context, c, autoRequery);
	}
}
