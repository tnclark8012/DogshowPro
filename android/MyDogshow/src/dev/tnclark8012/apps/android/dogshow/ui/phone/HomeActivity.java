package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.Fragment;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.ui.IncompleteFragment;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigatableActivity;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigationDrawerFragment;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigationDrawerFragment.NavigationDrawerCallbacks;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;
import dev.tnclark8012.apps.android.dogshow.util.DebugUtils;

/**
 * The landing screen for the app, once the user has logged in.
 */
public class HomeActivity extends NavigatableActivity implements
		NavigationDrawerCallbacks {
	private static final String TAG = HomeActivity.class.getSimpleName();

	@Override
	protected Fragment onCreatePane() {
		// TODO Auto-generated method stub
		return IncompleteFragment.newInstance("Home pane");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_find_show:
			startActivity(new Intent(this, ShowSetupActivity.class));
			return true;
		case R.id.menu_sign_out:
			AccountUtils.signOut(this);
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
