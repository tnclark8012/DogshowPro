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

package dev.tnclark8012.apps.android.dogshow.ui.base;

import java.util.Arrays;
import java.util.List;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.ListFragment;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.plus.PlusClient;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;

import dev.tnclark8012.apps.android.dogshow.R;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sync.AzureApiAccessor;
import dev.tnclark8012.apps.android.dogshow.sync.SyncHelper;
import dev.tnclark8012.apps.android.dogshow.util.AccountUtils;

public class AccountActivity extends Activity implements
		AccountUtils.AuthenticateCallback,
		GooglePlayServicesClient.ConnectionCallbacks,
		GooglePlayServicesClient.OnConnectionFailedListener,
		PlusClient.OnPeopleLoadedListener {

	private static final String TAG = AccountActivity.class.getSimpleName();

	public static final String EXTRA_FINISH_INTENT = "dev.tnclark8012.apps.android.dogshow.extra.FINISH_INTENT";

	private static final String KEY_CHOSEN_ACCOUNT = "chosen_account";

	private static final int REQUEST_AUTHENTICATE = 100;
	private static final int REQUEST_RECOVER_FROM_AUTH_ERROR = 101;
	private static final int REQUEST_RECOVER_FROM_PLAY_SERVICES_ERROR = 102;
	private static final int REQUEST_PLAY_SERVICES_ERROR_DIALOG = 103;

	private static final String POST_AUTH_CATEGORY = "dev.tnclark8012.apps.android.dogshow.category.POST_AUTH";

	private Account mChosenAccount;
	private Intent mFinishIntent;
	private boolean mCancelAuth = false;
	private boolean mAuthInProgress = false;
	private boolean mAuthProgressFragmentResumed = false;
	private boolean mCanRemoveAuthProgressFragment = false;
	private PlusClient mPlusClient;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_singlepane_empty);

		final Intent intent = getIntent();
		if (intent.hasExtra(EXTRA_FINISH_INTENT)) {
			mFinishIntent = intent.getParcelableExtra(EXTRA_FINISH_INTENT);
		}

		if (savedInstanceState == null) {
			if (!AccountUtils.isAuthenticated(this)) {
				getFragmentManager()
						.beginTransaction()
						.add(R.id.root_container, new SignInMainFragment(),
								"signin_main").commit();
			} else {
				mChosenAccount = new Account(
						AccountUtils.getChosenAccountName(this), "com.google");
				finishSetup();
			}
		} else {
			String accountName = savedInstanceState
					.getString(KEY_CHOSEN_ACCOUNT);
			if (accountName != null) {
				mChosenAccount = new Account(accountName, "com.google");
				mPlusClient = (new PlusClient.Builder(this, this, this))
						.setAccountName(accountName)
						.setScopes(AccountUtils.AUTH_SCOPES).build();
			}
		}
	}

	@Override
	public void onRecoverableException(final int code) {
		runOnUiThread(new Runnable() {
			@Override
			public void run() {
				final Dialog d = GooglePlayServicesUtil.getErrorDialog(code,
						AccountActivity.this,
						REQUEST_RECOVER_FROM_PLAY_SERVICES_ERROR);
				d.show();
			}
		});
	}

	@Override
	public void onUnRecoverableException(final String errorMessage) {
		makeToast(this, "Unrecoverable: " + errorMessage);
		Log.w(TAG, "Encountered unrecoverable exception: " + errorMessage);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		if (mChosenAccount != null)
			outState.putString(KEY_CHOSEN_ACCOUNT, mChosenAccount.name);
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == REQUEST_AUTHENTICATE
				|| requestCode == REQUEST_RECOVER_FROM_AUTH_ERROR
				|| requestCode == REQUEST_PLAY_SERVICES_ERROR_DIALOG) {
			if (resultCode == RESULT_OK) {
				if (mPlusClient != null)
					mPlusClient.connect();
			} else {
				if (mAuthProgressFragmentResumed) {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							getFragmentManager().popBackStack();
						}
					});
				} else {
					mCanRemoveAuthProgressFragment = true;
				}
			}
		} else {
			super.onActivityResult(requestCode, resultCode, data);
		}
	}

	@Override
	public void onStop() {
		super.onStop();
		if (mAuthInProgress)
			mCancelAuth = true;
		if (mPlusClient != null)
			mPlusClient.disconnect();
	}

	/**
	 * Called once connection to user's Google+ account is available. Sets the
	 * Plus profile id and name
	 */
	@Override
	public void onPeopleLoaded(ConnectionResult status,
			PersonBuffer personBuffer, String nextPageToken) {
		if (status.isSuccess()) {
			if (personBuffer != null && personBuffer.getCount() > 0) {
				// Set the profile id
				Person person = personBuffer.get(0);
				AccountUtils.setPlusProfileId(this, person.getId());
				AccountUtils.setProfileName(this, person.getDisplayName());

				// TODO image
				String name = person.getDisplayName();
				if (person.hasImage()) {
					String imageUrl = personBuffer.get(0).getImage().getUrl();
					// imageUrl.concat("?sz=" +
					// this.getResources().getInteger(R.dimen.header_icon_height));
				}
			}
		} else {
			Log.e(TAG, "Got " + status.getErrorCode()
					+ ". Could not load plus profile.");
		}
	}

	/**
	 * Sign-in fragment. Consists of {@link ChooseAccountFragment} and
	 * {@link AuthProgressFragment}
	 * 
	 * @author Taylor
	 * 
	 */
	public static class SignInMainFragment extends Fragment {
		public SignInMainFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			ViewGroup rootView = (ViewGroup) inflater.inflate(
					R.layout.fragment_login_main, container, false);
			TextView descriptionTextView = (TextView) rootView
					.findViewById(R.id.sign_in_description);
			descriptionTextView.setText(Html
					.fromHtml(getString(R.string.description_sign_in_main)));
			SignInButton signinButtonView = (SignInButton) rootView
					.findViewById(R.id.sign_in_button);
			signinButtonView.setSize(SignInButton.SIZE_WIDE);
			signinButtonView.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					getActivity()
							.getFragmentManager()
							.beginTransaction()
							.replace(R.id.root_container,
									new ChooseAccountFragment(),
									"choose_account")
							.addToBackStack("signin_main").commit();
				}
			});
			return rootView;
		}
	}

	/**
	 * Fragment for selecting a user account to connect with
	 * 
	 * @author Taylor
	 * 
	 */
	public static class ChooseAccountFragment extends ListFragment {
		public ChooseAccountFragment() {
		}

		@Override
		public void onResume() {
			super.onResume();
			reloadAccountList();
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
			Account[] accounts = am
					.getAccountsByType(GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE);
			mAccountListAdapter = new AccountListAdapter(getActivity(),
					Arrays.asList(accounts));
			setListAdapter(mAccountListAdapter);
		}

		private class AccountListAdapter extends ArrayAdapter<Account> {
			private static final int LAYOUT_RESOURCE = R.layout.list_item_login_option;

			public AccountListAdapter(Context context, List<Account> accounts) {
				super(context, LAYOUT_RESOURCE, accounts);
			}

			private class ViewHolder {
				TextView text1;
			}

			@Override
			public int getCount() {
				return super.getCount() + 1;
			}

			public View getView(int position, View convertView, ViewGroup parent) {
				ViewHolder holder;

				if (convertView == null) {
					convertView = getActivity().getLayoutInflater().inflate(
							LAYOUT_RESOURCE, null);

					holder = new ViewHolder();
					holder.text1 = (TextView) convertView
							.findViewById(android.R.id.text1);

					convertView.setTag(holder);
				} else {
					holder = (ViewHolder) convertView.getTag();
				}

				if (position == getCount() - 1) {
					holder.text1.setText(R.string.description_add_account);
				} else {
					final Account account = getItem(position);

					if (account != null) {
						holder.text1.setText(account.name);
					} else {
						holder.text1.setText("");
					}
				}

				return convertView;
			}
		}

		@Override
		public void onListItemClick(ListView l, View v, int position, long id) {
			if (position == mAccountListAdapter.getCount() - 1) {
				Intent addAccountIntent = new Intent(
						Settings.ACTION_ADD_ACCOUNT);
				addAccountIntent.putExtra(Settings.EXTRA_AUTHORITIES,
						new String[] { DogshowContract.CONTENT_AUTHORITY });
				startActivity(addAccountIntent);
				return;
			}

			AccountActivity activity = (AccountActivity) getActivity();
			ConnectivityManager cm = (ConnectivityManager) activity
					.getSystemService(CONNECTIVITY_SERVICE);
			NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
			if (activeNetwork == null || !activeNetwork.isConnected()) {
				Toast.makeText(activity,
						"Can't connect. Check your internet connection.",
						Toast.LENGTH_SHORT).show();
				return;
			}

			activity.mCancelAuth = false;
			activity.mChosenAccount = mAccountListAdapter.getItem(position);
			activity.getFragmentManager()
					.beginTransaction()
					.replace(R.id.root_container, new AuthProgressFragment(),
							"loading").addToBackStack("choose_account")
					.commit();

			PlusClient.Builder builder = new PlusClient.Builder(activity,
					activity, activity);
			activity.mPlusClient = builder.setScopes(AccountUtils.AUTH_SCOPES)
					.setAccountName(activity.mChosenAccount.name).build();
			activity.mPlusClient.connect();
		}
	}

	/**
	 * Fragment for showing progress of account setup and authorization
	 * 
	 * @author Taylor
	 * 
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
					if (AccountUtils.isAuthenticated(getActivity())) {
						((AccountActivity) getActivity())
								.onAuthTokenAvailable();
						return;
					}
					takingAWhilePanel.setVisibility(View.VISIBLE);
				}
			}, TRY_AGAIN_DELAY_MILLIS);
			return rootView;
		}

		@Override
		public void onPause() {
			super.onPause();
			((AccountActivity) getActivity()).mAuthProgressFragmentResumed = false;
		}

		@Override
		public void onResume() {
			super.onResume();
			((AccountActivity) getActivity()).mAuthProgressFragmentResumed = true;
			if (((AccountActivity) getActivity()).mCanRemoveAuthProgressFragment) {
				((AccountActivity) getActivity()).mCanRemoveAuthProgressFragment = false;
				getFragmentManager().popBackStack();
			}
		}

		@Override
		public void onDetach() {
			super.onDetach();
			((AccountActivity) getActivity()).mCancelAuth = true;
		}
	}

	/**
	 * Authenticate through the Google Play OAuth client.
	 */
	private void tryAuthenticate() {
		// Authenticate through the Google Play OAuth client.
		mAuthInProgress = true;
		if (mChosenAccount != null) {

			AccountUtils.tryAuthenticate(this, this, mChosenAccount.name,
					REQUEST_RECOVER_FROM_AUTH_ERROR);
		}
	}

	@Override
	public boolean shouldCancelAuthentication() {
		return mCancelAuth;
	}

	/**
	 * Initiate syncing and start the next activity
	 */
	private void finishSetup() {
		ContentResolver.setIsSyncable(mChosenAccount,
				DogshowContract.CONTENT_AUTHORITY, 1);
		ContentResolver.setSyncAutomatically(mChosenAccount,
				DogshowContract.CONTENT_AUTHORITY, true);
		SyncHelper.requestManualSync(this, mChosenAccount);
		if (mFinishIntent != null) {
			// Ensure the finish intent is unique within the task. Otherwise, if
			// the task was
			// started with this intent, and it finishes like it should, then
			// startActivity on
			// the intent again won't work.
			mFinishIntent.addCategory(POST_AUTH_CATEGORY);
			startActivity(mFinishIntent);
		}

		finish();
	}

	@Override
	public void onAuthTokenAvailable() {
		// Cancel progress fragment.
		// Create set up fragment.
		mAuthInProgress = false;
		if (mAuthProgressFragmentResumed) {
			getFragmentManager().popBackStack();
			finishSetup();
		}
	}

	// Google Plus client callbacks.
	@Override
	public void onConnected(Bundle connectionHint) {
		// It is possible that the authenticated account doesn't have a profile.
		mPlusClient.loadPeople(this, "me");
		tryAuthenticate();
	}

	@Override
	public void onDisconnected() {
		makeToast(this, "Disconnected");
	}

	@Override
	public void onConnectionFailed(ConnectionResult connectionResult) {
		if (connectionResult.hasResolution()) {
			try {
				connectionResult.startResolutionForResult(this,
						REQUEST_RECOVER_FROM_AUTH_ERROR);
			} catch (IntentSender.SendIntentException e) {
				Log.e(TAG, "Internal error encountered: " + e.getMessage());
				makeToast(this, "Internal error occured: " + e.getMessage());
			}
			return;
		}

		final int errorCode = connectionResult.getErrorCode();
		if (GooglePlayServicesUtil.isUserRecoverableError(errorCode)) {
			GooglePlayServicesUtil.getErrorDialog(errorCode, this,
					REQUEST_PLAY_SERVICES_ERROR_DIALOG).show();
		}
	}

	public void makeToast(Context context, String message) {
		Toast.makeText(context, message, Toast.LENGTH_LONG).show();
	}
}
