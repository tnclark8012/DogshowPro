package dev.tnclark8012.apps.android.dogshow.sync;

import java.io.IOException;
import java.util.ArrayList;

import android.content.ContentProviderOperation;
import android.content.Context;

public abstract class JsonHandler<ModelObject> {
    protected static Context mContext;

    protected JsonHandler(Context context) {
        mContext = context;
    }

    public abstract ArrayList<ContentProviderOperation> parse(ModelObject[] objs) throws IOException;

}
