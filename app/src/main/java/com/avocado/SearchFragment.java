package com.avocado;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.Adapter.CategoryAdapter;
import com.Adapter.RecordAdapter;
import com.Decoration.SearchRecordItemDecoration;

import java.util.ArrayList;

public class SearchFragment extends Fragment {
    private RecyclerView recordView;
    private ArrayList<String> recordList;
    private RecordAdapter recordAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_fragment, container, false);
        recordView = view.findViewById(R.id.recordView);
        recordList = new ArrayList<String>();
        recordList.add("iPhone 14 pro");
        recordList.add("Macbook");
        recordList.add("PS5");
        recordAdapter = new RecordAdapter(getActivity().getApplicationContext(),recordList);
        recordView.setAdapter(recordAdapter);
        recordView.addItemDecoration(new SearchRecordItemDecoration(0));
        return view;
    }
}