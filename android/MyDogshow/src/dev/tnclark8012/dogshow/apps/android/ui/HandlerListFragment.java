package dev.tnclark8012.dogshow.apps.android.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v4.content.CursorLoader;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Handlers;
import dev.tnclark8012.dogshow.apps.android.ui.base.BaseEntityListFragment;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.apps.android.util.Utils;

public class HandlerListFragment extends BaseEntityListFragment{

	private static final String TAG = HandlerListFragment.class.getSimpleName();
	private interface HandlersQuery {
		int _TOKEN = 0x1;

		String[] PROJECTION = { Handlers._ID, Handlers.HANDLER_NAME, Handlers.HANDLER_JUNIOR_CLASS, Handlers.HANDLER_IMAGE_PATH };

		int _ID = 0;
		int HANDLER_NAME = 1;
		int HANDLER_JUNIOR_LEVEL = 2;
		int HANDLER_IMAGE_PATH = 3;
	}

	private class HandlerListAdapter extends CursorAdapter {
		public HandlerListAdapter(Activity activity) {
			super(activity, null, false);
		}
		
		@Override
		public void bindView(View view, Context context, Cursor cursor) {
			((TextView) view.findViewById(R.id.list_item_handler_name)).setText(cursor.getString(HandlersQuery.HANDLER_NAME));
			String imagePath = cursor.getString(HandlersQuery.HANDLER_IMAGE_PATH);
			ImageView imageView = ((ImageView) view.findViewById(R.id.list_item_handler_icon));

			if (imagePath != null) {
				Resources res = getResources();
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
			return getActivity().getLayoutInflater().inflate(R.layout.list_item_handler, parent, false);
		}
	}

	@Override
	protected Uri getContentUri() {
		return Handlers.CONTENT_URI;
	}

	@Override
	protected CursorAdapter getCursorAdapter(Activity activity) {
		return new HandlerListAdapter(activity);
	}

	@Override
	protected CursorLoader getCursorLoader(Activity activity, Uri uri) {
		return new CursorLoader(activity, uri, HandlersQuery.PROJECTION, null, null, null);
	}

	@Override
	protected int getIdColumnIndex() {
		return HandlersQuery._ID;
	}
	
}
