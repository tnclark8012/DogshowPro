package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.LoaderManager.LoaderCallbacks;
import android.content.Intent;
import android.database.Cursor;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.ui.navigation.NavigatableActivity;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

/**
 * The landing screen for the app, once the user has logged in.
 */
public class HomeActivity extends NavigatableActivity implements
		LoaderCallbacks<Cursor> {
	private static final String TAG = HomeActivity.class.getSimpleName();

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
