package dev.tnclark8012.dogshow.apps.android.util;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import dev.tnclark8012.dogshow.apps.android.R;


/**
 * This class handles common functionality across Activities
 * 
 * @author Taylor Clark
 * 
 */
public class ActivityHelper
{
	/**
	 * Logger Tag
	 */
	private static final String	TAG	= "ActivityHelper";
	/**
	 * Activity being helped
	 */
	protected Activity			mActivity;
	/**
	 * Menu
	 */
	protected Menu				mMenu;

	/**
	 * Factory method for creating {@link ActivityHelper} objects for a given activity. 
	 */
	public static ActivityHelper createInstance( Activity activity )
	{
		return new ActivityHelper( activity );
	}

	/**
	 * Creates an ActivityHelper to handle common functionality
	 * 
	 * @param activity
	 *            Activity being helped
	 */
	protected ActivityHelper( Activity activity )
	{
		mActivity = activity;
	}

	public boolean onOptionsItemSelected( MenuItem item )
	{
//		switch (item.getItemId())
//		{
//			case R.id.menu_search:
//				goSearch();
//				return true;
//			case android.R.id.home:
//				goHome();
//				return true;
//			case R.id.menu_preferences:
//				goPreferences();
//				return true;
//			case R.id.menu_details:
//				goDetails();
//				return true;
//			case R.id.menu_trash:
//				goTrash();
//				return true;
//		}
		return false;
	}

//	/**
//	 * Invoke "details" action
//	 */
//	public void goDetails()
//	{
//		if ( mActivity instanceof ContactActivity )
//		{
//			return;
//		}
//		final Intent intent = new Intent( mActivity, ContactActivity.class );
//		mActivity.startActivity( intent );
//		if ( !UIUtils.isHoneycomb() )
//		{
//			mActivity.overridePendingTransition( R.anim.home_enter, R.anim.home_exit );
//		}
//	}
//	
	/**
	 * Invoke "trashcan" action, opening the {@link TrashCanActivity}.
	 */
//	public void goTrash()
//	{
//		Log.d(TAG, "goTrash()");
//		if ( mActivity instanceof TrashCanActivity )
//		{
//			Log.i(TAG, "already in trash. Returning");
//			return;
//		}
//		else
//		{
//			Log.i(TAG, "Current Activity (" + this.mActivity.getClass().getName() + ") is opening trash");
//		}
//		Intent intent;
//		
//		if ( UIUtils.isHoneycombTablet( mActivity ) )
//		{
//			intent = new Intent( mActivity, MessageMultiPaneActivity.class );
//		}
//		else
//		{
//			intent = new Intent( mActivity, TrashCanActivity.class );
//		}
//		if( UIUtils.isHoneycomb() )
//		{	
//			mActivity.overridePendingTransition( R.anim.home_enter, R.anim.home_exit );
//		}
//		intent.putExtra( MessageListFragment.EXTRA_MESSAGE_FILTER, MessageList.FILTER_DELETED_MESSAGES );
//		mActivity.startActivity( intent );
//	}
//
//	/**
//	 * Invoke "home" action, returning to {@link DashboardActivity}.
//	 */
//	public void goHome()
//	{
//		if ( mActivity instanceof HomeActivity )
//		{
//			return;
//		}
//		final Intent intent = new Intent( mActivity, HomeActivity.class );
//		intent.setFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
//		mActivity.startActivity( intent );
//		if ( !UIUtils.isHoneycomb() )
//		{
//			mActivity.overridePendingTransition( R.anim.home_enter, R.anim.home_exit );
//		}
//	}
//
//	/**
//	 * Invoke "search" action, triggering a default search.
//	 */
//	public void goSearch()
//	{
//		mActivity.startSearch( null, false, Bundle.EMPTY, false );
//	}
//
//	/**
//	 * Invoke a "Preferences" action, opens {@link PreferencesActivity}.
//	 */
//	public void goPreferences()
//	{
//		if ( mActivity instanceof PreferenceActivity )
//		{
//			return;
//		}
//		final Intent intent = new Intent( mActivity, PreferencesActivity.class );
//		mActivity.startActivity( intent );
//	}

	/**
	 * Shows the refreshing progress icon if it is shown
	 */
	public void showProgress()
	{
//		if ( mMenu != null )
//		{
//			MenuItem refresh = mMenu.findItem( R.id.menu_refresh );
//			MenuItem progress = mMenu.findItem( R.id.menu_progress );
//			if( refresh != null )
//			{
//					refresh.setVisible( false );
//			}
//			if( progress != null )
//			{
//				progress.setVisible( true );
//			}
//		}
//		else
//		{
//			Log.e(TAG, "Could not show progress on a non-intialized menu");
//		}
	}

	/**
	 * Hides the refreshing progress icon if it is shown
	 */
	public void hideProgress()
	{
//		if ( mMenu != null )
//		{
//			MenuItem refresh = mMenu.findItem( R.id.menu_refresh );
//			MenuItem progress = mMenu.findItem( R.id.menu_progress );
//			if ( refresh != null )
//			{
//				refresh.setVisible( true );
//			}
//			if ( progress != null )
//			{
//				progress.setVisible( false );
//			}
//		}
	}

	/**
	 * Sets the indeterminate loading state of the item with ID {@link R.id.menu_refresh}.
	 * (where the item ID was menu_refresh).
	 */
	public void setRefreshActionItemState( boolean refreshing )
	{
		if ( refreshing )
		{
			showProgress();
		}
		else
		{
			hideProgress();
		}
	}

	public boolean onCreateOptionsMenu( Menu menu )
	{
//		mMenu = menu;
//		MenuInflater menuInflater = new MenuInflater( mActivity );
//		menuInflater.inflate( R.menu.default_menu_items, menu );
//		return true;
		return false;
	}
}
