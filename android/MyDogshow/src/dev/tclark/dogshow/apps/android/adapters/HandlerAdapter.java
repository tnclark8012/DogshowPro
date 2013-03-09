package dev.tclark.dogshow.apps.android.adapters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import dev.tclark.dogshow.apps.android.R;
import dev.tclark.dogshow.apps.android.model.Handler;

public class HandlerAdapter extends ArrayAdapter<Handler>{
	private List<Handler> mHandlers;
	private Context mContext;
	private LayoutInflater mInflator;
	private SparseBooleanArray mIsActivated;
	private final int bgActivated;
	private final int bgNotActivated;
	private boolean allItemsActivated;
	public HandlerAdapter(Context context, List<Handler> handlers)
	{
		super(context, R.layout.handler_list_item, handlers);
		mContext = context;
		mHandlers = handlers;
		Resources resources = mContext.getResources();
		bgActivated = resources.getColor(R.color.list_item_activated);
		bgNotActivated = resources.getColor(android.R.color.white);
		
		mIsActivated = new SparseBooleanArray(handlers.size());
		mInflator = LayoutInflater.from(mContext);
	}
	static class ViewHolder
	{
		public ImageView	image;
		public TextView		tvName;
	}
	
	public List<Handler> getActivated()
	{
		if( allItemsActivated )
		{
			return mHandlers;
		}
		List<Handler> activated = new ArrayList<Handler>();
		int size = mHandlers.size();
		for( int i = 0; i < size; i++)
		{
			if(mIsActivated.get(i))
			{
				activated.add(mHandlers.get(i));
			}
		}
		return activated;
	}
	
	public int getActivatedCount()
	{
		return mIsActivated.size();
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Handler handler = mHandlers.get(position);

		// ViewHolder will buffer the assess to the individual fields of the row
		// layout

		ViewHolder holder;

		// **************************************************
		// If convert view is null, inflate the proper view,
		// Else, use the attached ViewHolder
		// **************************************************
		if( convertView == null )
		{
			holder = new ViewHolder();
			convertView = mInflator.inflate( R.layout.handler_list_item, parent, false );
			//holder.image = ( ImageView ) convertView.findViewById( R.id.handler_icon );
			holder.tvName = ( TextView ) convertView.findViewById( R.id.handler_name );
			convertView.setTag( holder );
		}
		else
		{
			holder = ( ViewHolder ) convertView.getTag();
		}
		if( allItemsActivated || mIsActivated.get(position))
		{
			convertView.setBackgroundResource( R.drawable.bg_list_item_active );
		}
		else
		{
			convertView.setBackgroundResource( R.drawable.bg_list_item_default );
		}

		//holder.image.setImageResource( R.drawable.ic_default_handler );
		holder.tvName.setText(handler.getName());

		return convertView;
	}
	
	public void toggleActivated(int position)
	{
		mIsActivated.put(position, !mIsActivated.get(position));
		notifyDataSetChanged();
	}

	public void toggleAllItemsActivated() {
		setAllItemsActivated(!allItemsActivated);
	}

	public void setAllItemsActivated(boolean value) {
		if( allItemsActivated || !value)
		{
			mIsActivated.clear();
		}
		
		allItemsActivated=value;
		notifyDataSetChanged();
		
	}
	

}
