package dev.tnclark8012.apps.android.dogshow.sync.request;

import org.apache.http.client.methods.HttpPost;

/**
 * Created by Taylor on 8/9/2014.
 */
public class HttpGetWithEntity extends HttpPost {
    public static final String METHOD = "GET";
    @Override
    public String getMethod() {
        return METHOD;
    }
}
