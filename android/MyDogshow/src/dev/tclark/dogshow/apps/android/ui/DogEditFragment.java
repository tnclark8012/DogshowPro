package dev.tclark.dogshow.apps.android.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

import dev.tclark.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.shared.Breeds;

public class DogEditFragment extends SherlockFragment implements
		OnClickListener {
	private Menu mMenu;
	private static ArrayAdapter<String> mBreedAdapter;
	private TextView mBreedTextView;

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
		mBreedTextView = (TextView) view
				.findViewById(R.id.dog_edit_section_breed_text);
		mBreedTextView.setOnClickListener(this);
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

	@Override
	public void onClick(View v) {
		Intent selectIntent = new Intent(getActivity(),
				BreedSelectActivity.class);
		startActivityForResult(selectIntent,
				BreedSelectActivity.REQUEST_CODE_BREED_SELECT);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (data != null
				&& data.hasExtra(BreedSelectActivity.EXTRA_BREED_GROUP)) {
			Breeds breed = (Breeds) data
					.getSerializableExtra(BreedSelectActivity.EXTRA_BREED_GROUP);
			mBreedTextView.setText(breed.getPrimaryName());
		}
	}
}
