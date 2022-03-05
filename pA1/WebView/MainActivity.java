package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=findViewById(R.id.webV);
        webView.loadUrl("https://en.wikipedia.org/wiki/Nitte_Meenakshi_Institute_of_Technology");
    }
}