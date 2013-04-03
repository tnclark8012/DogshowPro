package dev.tnclark8012.dogshow.apps.android.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockListFragment;

import dev.tnclark8012.dogshow.apps.android.adapters.BreedAdapter;
import dev.tnclark8012.dogshow.shared.DogshowEnums.BreedGroup;
import dev.tnclark8012.dogshow.shared.DogshowEnums.Breeds;

public class BreedSelectFragment extends SherlockListFragment{
	public interface BreedSelectListener
	{
		public void onBreedSelected(Breeds breed);
	}
	private BreedGroup mGroup;
	private BreedAdapter mAdapter;
	private BreedSelectListener mListener;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		mGroup = (BreedGroup) getArguments().getSerializable(BreedSelectActivity.EXTRA_BREED_GROUP);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		mAdapter = new BreedAdapter(getActivity(),mGroup);
		getListView().setAdapter(mAdapter);
		setListAdapter(mAdapter);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		if( mListener != null )
		{	
			mListener.onBreedSelected(mGroup.getBreeds()[position]);
		}
	}
	
	public void setOnBreedSelectListener(BreedSelectListener selectListener)
	{
		mListener = selectListener;
	}
}
