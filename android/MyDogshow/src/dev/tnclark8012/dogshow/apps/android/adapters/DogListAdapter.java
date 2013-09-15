package dev.tnclark8012.dogshow.apps.android.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.provider.BaseColumns;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import dev.tnclark8012.dogshow.apps.android.BuildConfig;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.sql.DogshowContract.Dogs;
import dev.tnclark8012.dogshow.apps.android.util.UIUtils;
import dev.tnclark8012.dogshow.apps.android.util.Utils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class DogListAdapter extends BaseEntityCursorAdapter {
		private Activity mActivity;
		public DogListAdapter(Activity activity) {
			super(activity, null, false);
			mActivity = activity;
		}
		public interface DogsQuery {
			final int _TOKEN = 0x1;

			final String[] PROJECTION = { BaseColumns._ID, Dogs.DOG_CALL_NAME, Dogs.DOG_BREED, Dogs.DOG_IMAGE_PATH, Dogs.DOG_IS_SHOWING };

			int _ID = 0;
			int DOG_CALL_NAME = 1;
			int DOG_BREED = 2;
			int DOG_IMAGE_PATH = 3;
			int DOG_IS_SHOWING = 4;
		}
		
		@SuppressWarnings("deprecation")
		@SuppressLint("NewApi")
		@Override
		public void bindView(View view, Context context, Cursor cursor) {
            //TODO LOW: Denote entered dogs
			String name = cursor.getString(DogsQuery.DOG_CALL_NAME);
            boolean isShowing = cursor.getInt(DogsQuery.DOG_IS_SHOWING) == 1;
            String enteredStr = (isShowing && BuildConfig.DEBUG) ? "[entered] " : "";
			((TextView) view.findViewById(R.id.list_item_dog_name)).setText(enteredStr + name);
            ((TextView) view.findViewById(R.id.list_item_dog_name)).setText(name);
			String breedStr = cursor.getString(DogsQuery.DOG_BREED);
			((TextView) view.findViewById(R.id.list_item_dog_breed)).setText(Breeds.parse(breedStr).getPrimaryName());
			String imagePath = cursor.getString(DogsQuery.DOG_IMAGE_PATH);
			RelativeLayout imageLayout = ((RelativeLayout) view.findViewById(R.id.list_item_dog_thumb));
			if (imagePath != null) {
				Resources res = mActivity.getResources();
				int height = res.getDimensionPixelSize(R.dimen.element_height_normal);
				int width = res.getDimensionPixelSize(R.dimen.element_width_normal);
				//TODO LOW: move to AsyncTask
				BitmapDrawable image = new BitmapDrawable(res, UIUtils.loadBitmap(imagePath, width, height));
				if (Utils.isJellybean()) {
					imageLayout.setBackground(image);
				} else {
					imageLayout.setBackgroundDrawable(image);
				}
				
			} else {
				imageLayout.setBackgroundResource(R.drawable.dog);
			}
		}

		@Override
		public View newView(Context context, Cursor cursor, ViewGroup parent) {
			return mActivity.getLayoutInflater().inflate(R.layout.list_item_dog, parent, false);
		}
	}