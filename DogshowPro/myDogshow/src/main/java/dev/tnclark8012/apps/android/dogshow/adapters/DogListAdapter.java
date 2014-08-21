package dev.tnclark8012.apps.android.dogshow.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.sql.query.Query.DogsQuery;
import dev.tnclark8012.apps.android.dogshow.util.UIUtils;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
public class DogListAdapter extends CursorAdapter {
	private Activity mActivity;
	private DisplayImageOptions options = new DisplayImageOptions.Builder().resetViewBeforeLoading(true).build();

	public DogListAdapter(Activity activity) {
		super(activity, null, false);
		mActivity = activity;
	}

	private static class ViewHolder {
		ImageView image;
		TextView nameView;
		TextView breedView;
	}

	@SuppressWarnings("deprecation")
	@SuppressLint("NewApi")
	@Override
	public void bindView(View view, Context context, Cursor cursor) {
		// TODO LOW: Denote entered dogs
		String name = cursor.getString(DogsQuery.DOG_CALL_NAME);
		ViewHolder holder = (ViewHolder) view.getTag();

		holder.nameView.setText(name);
		String breedStr = cursor.getString(DogsQuery.DOG_BREED);
		holder.breedView.setText(Breeds.parse(breedStr).getPrimaryName());
		String imagePath = cursor.getString(DogsQuery.DOG_IMAGE_PATH);
		if (imagePath != null) {
			UIUtils.displayImage(context, options, holder.image, imagePath);
		} else {
			holder.image.setImageResource(R.drawable.dog);
		}
	}

	@Override
	public View newView(Context context, Cursor cursor, ViewGroup parent) {
		View view = mActivity.getLayoutInflater().inflate(R.layout.list_item_dog, parent, false);
		ViewHolder holder = new ViewHolder();
		holder.nameView = ((TextView) view.findViewById(R.id.list_item_dog_name));
		holder.image = ((ImageView) view.findViewById(R.id.list_item_dog_thumb));
		holder.breedView = ((TextView) view.findViewById(R.id.list_item_dog_breed));
		view.setTag(holder);
		return view;
	}
}