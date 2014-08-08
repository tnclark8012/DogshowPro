package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.Fragment;

import dev.tnclark8012.apps.android.dogshow.ui.DebugFragment;
import dev.tnclark8012.apps.android.dogshow.ui.SimpleSinglePaneActivity;
import dev.tnclark8012.apps.android.dogshow.ui.base.BaseActivity;

/**
 * Created by taylorc on 8/7/2014.
 */
public class DebugActivity extends SimpleSinglePaneActivity {
    @Override
    protected Fragment onCreatePane() {
        return new DebugFragment();
    }
}
