package com.hugo.alberto.receitas_paraenses;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Alberto on 19/07/2015.
 */
public class NovaReceita extends Activity {
    public WebView webview;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.nova_receita_layout);

            webview = (WebView) findViewById(R.id.webview);
            webview.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
            webview.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
            webview.getSettings().setJavaScriptEnabled(true);
            webview.setWebViewClient(new WebViewClient() {
                @Override
                public void onLoadResource(WebView view, String url) {

                    webview.loadUrl("javascript:(function() { " +
                            "document.getElementsByClassName('ss-top-of-page')[0].style.display = 'none'; " +
                            "document.getElementsByClassName('ss-password-warning ss-secondary-text')[0].style.display = 'none'; " +
                            "document.getElementsByClassName('ss-footer')[0].style.display = 'none'; " +
                            "})()");
                    webview.loadUrl("javascript:(function() { " +
                            "document.getElementsByClassName('ss-response-footer')[0].style.display = 'none'; " +
                            "})()");
                }
            });
            webview.loadUrl("http://goo.gl/forms/uWYncY5HiX");
        }

}