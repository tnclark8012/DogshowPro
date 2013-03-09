package dev.tclark.dogshow.apps.android.ui;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

import dev.tclark.dogshow.apps.android.R;

public class DogViewFragment extends SherlockFragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		getSherlockActivity().getSupportActionBar().setTitle("Doggy Details");
		View view = inflater.inflate( R.layout.fragment_dog_view, container, false );
		Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Roboto-Regular.ttf");
	    TextView txt = (TextView)view.findViewById(R.id.dog_view_section_points_text);
		txt.setTypeface(font);
		return view;
	}
}
