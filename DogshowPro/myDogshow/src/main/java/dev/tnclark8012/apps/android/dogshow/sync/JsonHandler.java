package dev.tnclark8012.apps.android.dogshow.sync;

import android.content.ContentProviderOperation;
import android.content.Context;

import java.io.IOException;
import java.util.ArrayList;

public abstract class JsonHandler<ModelObject> {
    protected static Context mContext;

    protected JsonHandler(Context context) {
        mContext = context;
    }

    public abstract ArrayList<ContentProviderOperation> parse(ModelObject[] objs);

}
