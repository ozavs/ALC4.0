package com.example.alc4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;


public class AboutALC extends AppCompatActivity {

    private WebView mWebView;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        ActionBar actionBar = this.getSupportActionBar ();

        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled( true );
        }

        mWebView = findViewById( R.id.webView );
        progressBar = findViewById( R.id.progressBar );

        mWebView.getSettings().setJavaScriptEnabled (true);
        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        mWebView.setWebViewClient( new WebViewClient() {

            @Override
            public void onPageFinished ( WebView view, String url ) {
                progressBar.setVisibility ( View.INVISIBLE );
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }

        } );
        mWebView.loadUrl("https://andela.com/alc");


    }

}
