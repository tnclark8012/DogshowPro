package dev.tnclark8012.apps.android.dogshow.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewFragment;

public class GoogleDocsPdfViewerFragment extends WebViewFragment {
	public static final String EXTRA_URL = "url";
    private String pdfUrl;
    private WebView webView;

	public static GoogleDocsPdfViewerFragment newInstance(String pdfUrl)
	{
		Bundle args = new Bundle();
		args.putString("url", pdfUrl);
		GoogleDocsPdfViewerFragment f = new GoogleDocsPdfViewerFragment();
		f.setArguments(args);
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		this.webView = (WebView) super.onCreateView(inflater, container, savedInstanceState);
        this.webView.getSettings().setJavaScriptEnabled(true);
		// ---you need this to prevent the webview from
		// launching another browser when a url
		// redirection occurs---
        this.webView.setWebViewClient((new Callback()));

        this.setPdfUrl(getArguments().getString("url"));
		return this.webView;
	}

    public String getPdfUrl()
    {
        return this.pdfUrl;
    }

    public void setPdfUrl(String pdfUrl)
    {
        if(this.pdfUrl != pdfUrl) {
            this.pdfUrl = pdfUrl;
            this.loadPdf();
        }
    }

	private static String buildDocsUrl(String pdfUrl)
	{
		return "http://docs.google.com/gview?embedded=true&url=" + pdfUrl;
	}

    private void loadPdf()
    {
        this.webView.loadUrl(buildDocsUrl(this.pdfUrl));
    }

	private class Callback extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			return false;
		}
	}
}
