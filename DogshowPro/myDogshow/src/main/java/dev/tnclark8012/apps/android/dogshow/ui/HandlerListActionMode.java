package dev.tnclark8012.apps.android.dogshow.ui;
//package dev.tnclark8012.apps.android.dogshow.ui;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//import android.util.Log;
//
//import com.actionbar.view.ActionMode;
//import com.actionbar.view.Menu;
//import com.actionbar.view.MenuItem;
//
//import dev.tnclark8012.apps.android.dogshow.R;
//import dev.tnclark8012.apps.android.dogshow.adapters.HandlerAdapter;
//import dev.tnclark8012.apps.android.dogshow.model.Handler;
//
///**
// * This class is a callback handler for a message list Action Mode. This class handles updating {@link MessageList} and {@link #mAdapter}
// * @author Taylor Clark
// *
// */
//public class HandlerListActionMode implements ActionMode.Callback
//{
//	/**
//	 * Logger tag
//	 */
//	public static final String			TAG			= "MessageListActionMode";
//	
//	/**
//	 * Adapter for the list
//	 */
//	private HandlerAdapter	mAdapter;
//	
//	/**
//	 * Callback for action items
//	 */
//	private Callback					mCallback;
//	
//	/**
//	 * The current action mode
//	 */
//	private ActionMode					mActionMode;
//
//	/**
//	 * Callback for handling additional actions to be taken upon action item clicks. Ex. posting the changes to the application server
//	 * @author Taylor Clark
//	 */
//	public interface Callback
//	{
//		/**
//		 * Action to perform when a handlers have been deleted
//		 * @param isDeleted true if handlers have been deleted, false if they have been restored
//		 * @param handlers effected handlers
//		 */
//		void onHandlerDeleted( boolean isDeleted, Handler... handlers );
//		
//		/**
//		 * Action to perform when the action mode is being destoryed
//		 */
//		void onActionModeDestroy();
//	}
//
//	/**
//	 * Creates a new MessageListActionMode 
//	 * @param callback callback handler
//	 * @param adapter list adapter
//	 */
//	public HandlerListActionMode( Callback callback, HandlerAdapter adapter )
//	{
//		mAdapter = adapter;
//		mCallback = callback;
//	}
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public boolean onCreateActionMode( ActionMode mode, Menu menu )
//	{
//		int icon = -1;
//		int title = -1;
//		icon = R.drawable.ic_action_select;
//		title = ( 0 == 0 ) ? R.string.menu_select_all : R.string.menu_select_none;
//		menu.add( 0, 0, 0, title ).setIcon( icon ).setShowAsAction( MenuItem.SHOW_AS_ACTION_IF_ROOM );
//
//		icon = ( false ) ? R.drawable.ic_action_restore : R.drawable.ic_action_delete;
//		title = ( false ) ? R.string.menu_restore : R.string.menu_delete;
//		menu.add( 0, 1, 1, title ).setIcon( icon ).setShowAsAction( MenuItem.SHOW_AS_ACTION_IF_ROOM );
//
//		return true;
//	}
//	
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public boolean onPrepareActionMode( ActionMode mode, Menu menu )
//	{
//		Log.d( TAG, "onPrepareActionMode" );
////		int activatedCount = mAdapter.getActivatedItemCount();
////		if( mActionMode != null && activatedCount == 0 )
////		{
////			mActionMode = null;
////			mode.finish();
////		}
//		mActionMode = mode;
////		mode.setTitle( mAdapter.getContext().getString( R.string.menu_multiple_select_title, activatedCount ) );
//		return true;
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public boolean onActionItemClicked( ActionMode mode, MenuItem item )
//	{
//		int icon = -1;
////		Handler[] activatedItems = mAdapter.getActivatedItems();
//		switch(item.getItemId())
//		{
//			case 0:// (de)select
//				mAdapter.toggleAllItemsActivated();
//				mode.setTitle( mAdapter.getContext().getString( R.string.menu_multiple_select_title, mAdapter.getActivatedCount() ) );
//			break;
//			case 1:// delete/restore
//				
//				mCallback.onHandlerDeleted( true, mAdapter.getActivated().toArray(new Handler[mAdapter.getActivatedCount()]));
//				mode.finish();
//			break;
//		}
//		return true;
//	}
//
//	/**
//	 * {@inheritDoc}
//	 */
//	@Override
//	public void onDestroyActionMode( ActionMode mode )
//	{
//		mActionMode = null;
//		mAdapter.setAllItemsActivated(false);
//		mCallback.onActionModeDestroy();
//	}
//
//
//	/**
//	 * Closes the action mode
//	 */
//	public void finish()
//	{
//		if( mActionMode != null )
//		{
//			mActionMode.finish();
//		}
//		mActionMode = null;
//	}
//}