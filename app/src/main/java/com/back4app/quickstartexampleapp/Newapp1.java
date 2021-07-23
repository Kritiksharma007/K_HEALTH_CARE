package com.back4app.quickstartexampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Newapp1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newapp1);

        WebView mywebview = (WebView) findViewById(R.id.webView);
        mywebview.loadUrl("https://www.worldometers.info/coronavirus/");
    }
}