package dev.tnclark8012.dogshow.apps.android.adapters;

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
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.query.Query.HandlersQuery;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.apps.android.util.Utils;

public class HandlerListAdapter extends CursorAdapter {
	private Activity mActivity;
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
			Resources res = mActivity.getResources();
			int height = res.getDimensionPixelSize(R.dimen.element_height_normal);
			int width = res.getDimensionPixelSize(R.dimen.element_width_normal);
			// TODO LOW: move to AsyncTask
			BitmapDrawable image = new BitmapDrawable(res, UIUtils.loadBitmap(imagePath, width, height));
			if (Utils.isJellybean()) {
				imageView.setImageDrawable(image);
			} else {
				imageView.setImageDrawable(image);
			}

		} else {
			imageView.setImageResource(R.drawable.ic_default_handler);
		}
	}

	@Override
	public View newView(Context context, Cursor cursor, ViewGroup parent) {
		return mActivity.getLayoutInflater().inflate(R.layout.list_item_handler, parent, false);
	}
}
