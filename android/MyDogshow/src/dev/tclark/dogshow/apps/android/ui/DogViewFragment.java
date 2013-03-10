package dev.tclark.dogshow.apps.android.ui;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;

import dev.tclark.dogshow.apps.android.R;

public class DogViewFragment extends SherlockFragment {
	private Menu mMenu;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);

	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		SherlockFragmentActivity activity = getSherlockActivity();
		activity.getSupportActionBar().setTitle("Doggy Details");
		View view = inflater.inflate(R.layout.fragment_dog_view, container,
				false);
		
		QuickContactBadge badgeSmall = (QuickContactBadge) view
				.findViewById(R.id.dog_view_owner_contact_badge);
		badgeSmall.assignContactFromEmail("tnclark8012@gmail.com", true);
		badgeSmall.setMode(ContactsContract.QuickContact.MODE_SMALL);
		return view;
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		mMenu = menu;
		inflater.inflate(R.menu.dog_view, menu);
	}
}
