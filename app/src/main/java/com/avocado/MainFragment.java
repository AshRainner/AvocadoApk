package com.avocado;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainFragment extends Fragment {
    private WebView webView;
    private String url;
    public MainFragment(String url){
        this.url=url;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        webView = view.findViewById(R.id.main_webView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setSupportMultipleWindows(true);

        webView.setWebViewClient(new WebViewClient());
        webView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(keyEvent.getAction()!=KeyEvent.ACTION_DOWN)
                    return true;
                if(i == KeyEvent.KEYCODE_BACK){
                    if (webView.canGoBack()) webView.goBack();
                    else getActivity().finish();
                }
                return false;
            }
        });
        Log.d("위치",url);
        webView.loadUrl(url);

        // Inflate the layout for this fragment
        return view;
    }
    public void onBackPressed() {
        if (webView.canGoBack()) webView.goBack();
        else getActivity().finish();
    }
}