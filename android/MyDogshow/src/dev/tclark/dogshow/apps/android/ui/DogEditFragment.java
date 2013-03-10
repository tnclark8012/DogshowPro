package dev.tclark.dogshow.apps.android.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

import dev.tclark.dogshow.apps.android.R;

public class DogEditFragment extends SherlockFragment {
	private Menu mMenu;
	private static final String[] BREEDS = { "Papillon", "Shetland Sheepdog",
			"Akita", "Saluki", "Retriever (Golden)" };
	private static ArrayAdapter<String> mBreedAdapter;

	public interface Callback {
		public void onSave();

		public void onCancel();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		getSherlockActivity().getSupportActionBar().setTitle("Edit Dog");
		View view = inflater.inflate(R.layout.fragment_dog_edit, container,
				false);
		mBreedAdapter = new ArrayAdapter<String>(getSherlockActivity(),
				android.R.layout.simple_spinner_item, BREEDS);
		Spinner breedsView = (Spinner) view
				.findViewById(R.id.dog_edit_section_breed_text);
		mBreedAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		breedsView.setAdapter(mBreedAdapter);
		return view;
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		mMenu = menu;
		inflater.inflate(R.menu.dog_edit, menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_dog_edit_save:
			return true;
		case R.id.menu_dog_edit_cancel:
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void save() {

	}
}
