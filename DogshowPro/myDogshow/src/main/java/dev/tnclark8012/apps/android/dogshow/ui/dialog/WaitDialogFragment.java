package dev.tnclark8012.apps.android.dogshow.ui.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class WaitDialogFragment extends DialogFragment
{
    /**
	 * Constructor
	 * @param title
	 * 			- resource Integer, specifying the string to use as the dialogs title
	 * @return
	 * 			a new instance of WaitDialogFragment
	 */
	public static WaitDialogFragment newInstance( int title )
	{
		WaitDialogFragment frag = new WaitDialogFragment();
		Bundle args = new Bundle();
		args.putInt( "title", title );
		frag.setArguments( args );
		return frag;
	}
	/**
	 * @return
	 * 		the Created Dialog 
	 */
	@Override
	public Dialog onCreateDialog( Bundle savedInstanceState )
	{
		int title = getArguments().getInt( "title" );
		ProgressDialog dialog = new ProgressDialog( getActivity() );
		dialog.setTitle( getString( title ) );
		return dialog;
	}

}
