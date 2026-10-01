package com.solididdles.wheelspinner;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebView; import android.webkit.WebSettings; import android.graphics.Color;
public class MainActivity extends Activity { public void onCreate(Bundle b){super.onCreate(b); WebView w=new WebView(this); w.setBackgroundColor(Color.WHITE); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); s.setAllowContentAccess(false); w.loadUrl("file:///android_asset/index.html"); setContentView(w);} }
