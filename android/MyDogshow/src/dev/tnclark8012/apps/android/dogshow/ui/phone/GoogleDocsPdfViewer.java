package dev.tnclark8012.apps.android.dogshow.ui.phone;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import dev.tnclark8012.apps.android.dogshow.sync.ApiAccessor;

public class GoogleDocsPdfViewer extends Activity {
	public static final String EXTRA_URL = "url";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);
		WebView webView = new WebView(this);
		
		webView.getSettings().setJavaScriptEnabled(true);
//		webView.getSettings().setPluginState(PluginState.ON);

		// ---you need this to prevent the webview from
		// launching another browser when a url
		// redirection occurs---
		webView.setWebViewClient(new Callback());

		String pdfURL = ApiAccessor.urlEncode(getIntent().getExtras().getString(EXTRA_URL));
		webView.loadUrl("http://docs.google.com/gview?embedded=true&url="
				+ pdfURL);

		setContentView(webView);
	}

	private class Callback extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			return (false);
		}
	}

}
