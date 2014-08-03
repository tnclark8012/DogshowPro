package dev.tnclark8012.apps.android.dogshow.adapters;

import com.nostra13.universalimageloader.core.DisplayImageOptions;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.HandlersQuery;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
import dev.tnclark8012.apps.android.dogshow.util.Utils;

public class HandlerListAdapter extends CursorAdapter {
	private Activity mActivity;
	private DisplayImageOptions options = new DisplayImageOptions.Builder().resetViewBeforeLoading(true).build();

	public HandlerListAdapter(Activity activity) {
		super(activity, null, false);
		mActivity = activity;
	}

	@Override
	public void bindView(View view, Context context, Cursor cursor) {
		((TextView) view.findViewById(R.id.list_item_handler_name)).setText(cursor.getString(HandlersQuery.HANDLER_NAME));
		String imagePath = cursor.getString(HandlersQuery.HANDLER_IMAGE_PATH);
		ImageView imageView = ((ImageView) view.findViewById(R.id.list_item_handler_icon));
		if (imagePath != null) {
			UIUtils.displayImage(context, options, imageView, imagePath);
		} else {
			imageView.setImageResource(R.drawable.ic_default_handler);
		}
	}

	@Override
	public View newView(Context context, Cursor cursor, ViewGroup parent) {
		return mActivity.getLayoutInflater().inflate(R.layout.list_item_handler, parent, false);
	}
}
