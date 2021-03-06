/*
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

package dev.tnclark8012.apps.android.dogshow.util;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;

import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.UserRecoverableNotifiedException;
import com.google.android.gms.common.Scopes;

import java.io.IOException;
import java.util.UUID;

import dev.tnclark8012.apps.android.dogshow.NotificationHandler;
import dev.tnclark8012.apps.android.dogshow.preferences.Prefs;
import dev.tnclark8012.apps.android.dogshow.provider.PersistHelper;
import dev.tnclark8012.apps.android.dogshow.sql.DogshowContract;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;
import dev.tnclark8012.apps.android.dogshow.ui.base.AccountActivity;
import static dev.tnclark8012.apps.android.dogshow.util.LogUtils.*;
/**
 * An assortment of authentication and Login helper utilities.
 */
public class AccountUtils {

	private static final String TAG =  makeLogTag(AccountUtils.class);

	private static final String PREF_CHOSEN_ACCOUNT = "chosen_account";
	private static final String PREF_AUTH_TOKEN = "auth_token";
	private static final String PREF_PLUS_PROFILE_ID = "plus_profile_id";
	private static final String PREF_PLUS_PROFILE_NAME = "plus_profile_name";

	public static final String AUTH_SCOPES[] = { Scopes.PLUS_LOGIN, "profile" };

	static final String AUTH_TOKEN_TYPE;

	static {
		StringBuilder sb = new StringBuilder();
		sb.append("oauth2:");
		for (String scope : AUTH_SCOPES) {
			sb.append(scope);
			sb.append(" ");
		}
		AUTH_TOKEN_TYPE = sb.toString();
	}

	public static void setUserId(Context context, String userId) {
		Prefs.get(context).edit().putString(Prefs.KEY_USER_ID, userId).commit();
	}

	public static String getUserIdentifier(Context context) {
		return Prefs.get(context).getString(Prefs.KEY_USER_ID, null);
	}

	public static boolean isAuthenticated(final Context context) {
		String chosenAccountName = getChosenAccountName(context);

		return !TextUtils.isEmpty(chosenAccountName);
	}

	public static String getChosenAccountName(final Context context) {
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(context);
		return sp.getString(PREF_CHOSEN_ACCOUNT, null);// TODO move to prefs
	}

	public static Account getChosenAccount(final Context context) {
		String account = getChosenAccountName(context);
		if (account != null) {
			return new Account(account, GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE);
		} else {
			return null;
		}
	}

	static void setChosenAccountName(final Context context,
			final String accountName) {
		LOGD(TAG, "Chose account " + accountName);
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(context);
		sp.edit().putString(PREF_CHOSEN_ACCOUNT, accountName).commit();
	}

	public static String getAuthToken(final Context context) {
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(context);
		return sp.getString(PREF_AUTH_TOKEN, null);
	}

	private static void setAuthToken(final Context context,
			final String authToken) {
		LOGI(TAG, "Auth token of length "
				+ (TextUtils.isEmpty(authToken) ? 0 : authToken.length()));
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(context);
		sp.edit().putString(PREF_AUTH_TOKEN, authToken).commit();
		LOGD(TAG, "Auth Token: " + authToken);
	}

	static void invalidateAuthToken(final Context context) {
		GoogleAuthUtil.invalidateToken(context, getAuthToken(context));
		setAuthToken(context, null);
	}

	// TODO move these all to prefs?
	public static void setInstallId(Context context, String installId) {
		Prefs.get(context).edit().putString(Prefs.KEY_INSTALL_ID, installId)
				.commit();
	}

	public static void markSetupDone(Context context) {
		Prefs.get(context).edit().putBoolean(Prefs.KEY_SETUP_COMPLETE, true)
				.commit();
	}

	public static void setPlusProfileId(final Context context,
			final String profileId) {
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(context);
		sp.edit().putString(PREF_PLUS_PROFILE_ID, profileId).commit();
	}

	public static void setProfileName(final Context context,
			final String profileName) {
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(context);
		sp.edit().putString(PREF_PLUS_PROFILE_NAME, profileName).commit();
	}

	public static String getPlusProfileId(final Context context) {
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(context);
		return sp.getString(PREF_PLUS_PROFILE_ID, null);
	}

	public static String getPlusProfileName(final Context context) {
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(context);
		return sp.getString(PREF_PLUS_PROFILE_NAME, null);
	}

	public static void refreshAuthToken(Context mContext) {
		invalidateAuthToken(mContext);
		tryAuthenticateWithErrorNotification(mContext,
				DogshowContract.CONTENT_AUTHORITY,
				getChosenAccountName(mContext));
	}

	public static interface AuthenticateCallback {
		public boolean shouldCancelAuthentication();

		/**
		 * Called once the token from user identity provider is available
		 */
		public void onAuthTokenAvailable();

		public void onRecoverableException(final int code);

		public void onUnRecoverableException(final String errorMessage);
	}

	static String tryAuthenticateWithErrorNotification(Context context,
			String syncAuthority, String accountName) {
		String token = null;
		try {
			LOGI(TAG, "Requesting new auth token (with notification)");
			token = GoogleAuthUtil.getTokenWithNotification(context,
					accountName, AUTH_TOKEN_TYPE, null);
			// context, accountName, AUTH_TOKEN_TYPE, null, syncAuthority,
			// null);
		} catch (UserRecoverableNotifiedException userNotifiedException) {
			// Notification has already been pushed.
			// Continue without token or stop background task.

		} catch (GoogleAuthException authEx) {
			// This is likely unrecoverable.
			LOGE(TAG,
					"Unrecoverable authentication exception: "
							+ authEx.getMessage(), authEx);
		} catch (IOException ioEx) {
			LOGI(TAG, "transient error encountered: " + ioEx.getMessage());
			// doExponentialBackoff();
		} catch (Exception e) {
			LOGI(TAG, "Authentication exception: " + e.getMessage());
		}
		return token;
	}

	public static void tryAuthenticate(final Activity activity,
			final AuthenticateCallback callback, final String accountName,
			final int requestCode) {

		(new GetTokenTask(activity, callback, accountName, requestCode))
				.execute();
	}

	private static class GetTokenTask extends AsyncTask<Void, String, String> {
		private String mAccountName;
		private Activity mActivity;
		private AuthenticateCallback mCallback;
		private int mRequestCode;

		public GetTokenTask(Activity activity, AuthenticateCallback callback,
				String name, int requestCode) {
			mAccountName = name;
			mActivity = activity;
			mCallback = callback;
			mRequestCode = requestCode;
		}

		@Override
		protected String doInBackground(Void... params) {

			if (mCallback.shouldCancelAuthentication())
				return null;
			//
			// final String token = GoogleAuthUtil.getToken(mActivity,
			// mAccountName, AUTH_TOKEN_TYPE);
			String installId = UUID.randomUUID().toString();
			// setInstallId(mActivity, installId);
			String token = tryAuthenticateWithErrorNotification(mActivity,
					null, mAccountName);

			// publishProgress(mAccountName, installId, token);
			register(mActivity, mAccountName, token, installId);
			// Persists auth token.
			setAuthToken(mActivity, token);
			setChosenAccountName(mActivity, mAccountName);
			return token;
		}

		@Override
		protected void onPostExecute(String token) {
			super.onPostExecute(token);
			mCallback.onAuthTokenAvailable();
		}
	}

	/**
	 * Register the user identity with the app server
	 * 
	 * @param accountName
	 * @param token
	 * @param installId
	 */
	public static void register(final Context context,
			final String accountName, final String token, String installId) {
		String id = ApiAccessor.getInstance(context).register(accountName,
				token, "PLUS", installId, NotificationHandler.getHandle());// TODO
																			// Facebook
																			// and/or
																			// nothing
		setUserId(context, id);
		new PersistHelper(context).createMe();

	}

	public static void signOut(final Context context) {
		// Sign out of GCM message router
		// ServerUtilities.onSignOut(context); TODO Sever sign out?

		// Destroy auth tokens
		invalidateAuthToken(context);

		// Remove remaining application state
		SharedPreferences sp = Prefs.get(context);
		sp.edit().clear().commit();
		context.getContentResolver().delete(DogshowContract.BASE_CONTENT_URI,
				null, null);
	}

	public static void startAuthenticationFlow(final Context context,
			final Intent finishIntent) {
		Intent inFlowIntent = new Intent(context, AccountActivity.class);
		inFlowIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		inFlowIntent
				.putExtra(AccountActivity.EXTRA_FINISH_INTENT, finishIntent);
		context.startActivity(inFlowIntent);
	}
}
