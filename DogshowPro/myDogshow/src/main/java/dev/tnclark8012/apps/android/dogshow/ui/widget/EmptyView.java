package dev.tnclark8012.apps.android.dogshow.ui.widget;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import dev.tnclark8012.apps.android.dogshow.R;

/**
 * Created by taylorc on 5/29/2015.
 */
public final class EmptyView {
    private EmptyView(){}
    public static View getEmptySyncView(Activity activity, CharSequence message)
    {
        View view = activity.getLayoutInflater().inflate(R.layout.empty_waiting_for_sync, null);
        TextView textView = (TextView)view.findViewById(android.R.id.text1);
        textView.setText(message);
        return view;
    }
}
