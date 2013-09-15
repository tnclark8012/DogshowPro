/* Adapted from Google IO 2012 App
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.tnclark8012.dogshow.apps.android.ui.base;

import java.util.Arrays;
import java.util.List;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.app.Fragment;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import dev.tnclark8012.dogshow.apps.android.R;
import dev.tnclark8012.dogshow.apps.android.ui.phone.HomeActivity;
import dev.tnclark8012.dogshow.apps.android.util.AccountUtils;

/**
 * The first activity most users see. This wizard-like activity first presents
 * an account selection fragment ({@link ChooseAccountFragment}), and then an
 * authentication progress fragment ({@link AuthProgressFragment}).
 */
public class AccountActivity extends Activity implements
		AccountUtils.AuthenticateCallback {

	private static final String TAG = AccountActivity.class.getSimpleName();

	public static final String EXTRA_FINISH_INTENT = "dev.tnclark8012.dogshow.android.extra.FINISH_INTENT";

	private static final int REQUEST_AUTHENTICATE = 100;

	private final Handler mHandler = new Handler();

	private Account mChosenAccount;
	private Intent mFinishIntent;
	private boolean mCancelAuth = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_account);

		if (getIntent().hasExtra(EXTRA_FINISH_INTENT)) {
			mFinishIntent = getIntent().getParcelableExtra(EXTRA_FINISH_INTENT);
		}

		if (savedInstanceState == null) {
			getFragmentManager()
					.beginTransaction()
					.add(R.id.fragment_container, new ChooseAccountFragment(),
							"choose_account").commit();
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == REQUEST_AUTHENTICATE) {
			if (resultCode == RESULT_OK) {
				tryAuthenticate();
			} else {
				// go back to previous step
				mHandler.post(new Runnable() {
					@Override
					public void run() {
						getFragmentManager().popBackStack();
					}
				});
			}
		} else {
			super.onActivityResult(requestCode, resultCode, data);
		}
	}

	private void tryAuthenticate() {
		AccountUtils.tryAuthenticate(AccountActivity.this,
				AccountActivity.this, REQUEST_AUTHENTICATE, mChosenAccount);
	}

	@Override
	public boolean shouldCancelAuthentication() {
		return mCancelAuth;
	}

	@Override
	public void onAuthTokenAvailable(String authToken) {
//		// ContentResolver.setIsSyncable(mChosenAccount,
//		// ScheduleContract.CONTENT_AUTHORITY, 1);
//		// *********************************
//		// Load stored registration info
//		// *********************************
//		SharedPreferences prefs = Prefs.get(this);
//		SharedPreferences.Editor editor = prefs.edit();
//		String installationId;
//		String openID;
//		if ((installationId = prefs.getString(Prefs.KEY_DEVICE_ID, null)) == null) {
//			// Do not generate a new installation ID for a newly chosen account
//			Log.d(TAG, "Generating installation ID");
//			installationId = UUID.randomUUID().toString();
//			editor.putString(Prefs.KEY_DEVICE_ID, installationId);
//			editor.commit();
//		}
//		openID = prefs.getString(Prefs.KEY_OPEN_ID, null);
//		editor.putString(Prefs.KEY_AUTH_TOKEN, authToken);
		if (mFinishIntent != null) {
//			 mFinishIntent.addCategory(Intent.CATEGORY_LAUNCHER);
//			 mFinishIntent.setAction(Intent.ACTION_MAIN);
//			 mFinishIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK);
			 Log.d(TAG, "Starting finish intent");
			startActivity(new Intent(this, HomeActivity.class));
		}
		//Toast.makeText(this, authToken, Toast.LENGTH_LONG).show();
		finish();
	}

	/**
	 * A fragment that presents the user with a list of accounts to choose from.
	 * Once an account is selected, we move on to the login progress fragment (
	 * {@link AuthProgressFragment}).
	 */
	public static class ChooseAccountFragment extends ListFragment {
		public ChooseAccountFragment() {
		}

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setHasOptionsMenu(true);
		}

		@Override
		public void onResume() {
			super.onResume();
			reloadAccountList();
		}

		@Override
		public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
			inflater.inflate(R.menu.add_account, menu);
			super.onCreateOptionsMenu(menu, inflater);
		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			if (item.getItemId() == R.id.menu_add_account) {
				Intent addAccountIntent = new Intent(
						Settings.ACTION_ADD_ACCOUNT);
				startActivity(addAccountIntent);
				return true;
			}
			return super.onOptionsItemSelected(item);
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			ViewGroup rootView = (ViewGroup) inflater.inflate(
					R.layout.fragment_login_choose_account, container, false);
			TextView descriptionView = (TextView) rootView
					.findViewById(R.id.choose_account_intro);
			descriptionView.setText(Html
					.fromHtml(getString(R.string.description_choose_account)));
			return rootView;
		}

		private AccountListAdapter mAccountListAdapter;

		private void reloadAccountList() {
			if (mAccountListAdapter != null) {
				mAccountListAdapter = null;
			}

			AccountManager am = AccountManager.get(getActivity());
			Account[] accounts = am.getAccountsByType("com.google");
			mAccountListAdapter = new AccountListAdapter(getActivity(),
					Arrays.asList(accounts));
			setListAdapter(mAccountListAdapter);
		}

		private class AccountListAdapter extends ArrayAdapter<Account> {
			Context mContext;
			private static final int LAYOUT_RESOURCE = android.R.layout.simple_list_item_1;

			public AccountListAdapter(Context context, List<Account> accounts) {
				super(context, LAYOUT_RESOURCE, accounts);
				mContext = context;
			}

			private class ViewHolder {
				TextView text1;
			}

			public View getView(int position, View convertView, ViewGroup parent) {
				ViewHolder holder;

				if (convertView == null) {
					convertView = ((LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(
							LAYOUT_RESOURCE, null);

					holder = new ViewHolder();
					holder.text1 = (TextView) convertView
							.findViewById(android.R.id.text1);

					convertView.setTag(holder);
				} else {
					holder = (ViewHolder) convertView.getTag();
				}

				final Account account = getItem(position);

				if (account != null) {
					holder.text1.setText(account.name);
				} else {
					holder.text1.setText("");
				}

				return convertView;
			}
		}

		@Override
		public void onListItemClick(ListView l, View v, int position, long id) {
			AccountActivity activity = (AccountActivity) getActivity();
			ConnectivityManager cm = (ConnectivityManager) activity
					.getSystemService(CONNECTIVITY_SERVICE);
			NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
			if (activeNetwork == null || !activeNetwork.isConnected()) {
				Toast.makeText(activity, "No connection!", Toast.LENGTH_SHORT)
						.show();
				return;
			}

			activity.mCancelAuth = false;
			activity.mChosenAccount = mAccountListAdapter.getItem(position);
			activity.getFragmentManager()
					.beginTransaction()
					.replace(R.id.fragment_container,
							new AuthProgressFragment(), "loading")
					.addToBackStack("choose_account").commit();

			activity.tryAuthenticate();
		}
	}

	/**
	 * This fragment shows a login progress spinner. Upon reaching a timeout of
	 * 7 seconds (in case of a poor network connection), the user can try again.
	 */
	public static class AuthProgressFragment extends Fragment {
		private static final int TRY_AGAIN_DELAY_MILLIS = 7 * 1000; // 7 seconds

		private final Handler mHandler = new Handler();

		public AuthProgressFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			ViewGroup rootView = (ViewGroup) inflater.inflate(
					R.layout.fragment_login_loading, container, false);

			final View takingAWhilePanel = rootView
					.findViewById(R.id.taking_a_while_panel);
			final View tryAgainButton = rootView
					.findViewById(R.id.retry_button);
			tryAgainButton.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					getFragmentManager().popBackStack();
				}
			});

			mHandler.postDelayed(new Runnable() {
				@Override
				public void run() {
					if (!isAdded()) {
						return;
					}

					takingAWhilePanel.setVisibility(View.VISIBLE);
				}
			}, TRY_AGAIN_DELAY_MILLIS);

			return rootView;
		}

		@Override
		public void onDetach() {
			super.onDetach();
			((AccountActivity) getActivity()).mCancelAuth = true;
		}
	}
}
