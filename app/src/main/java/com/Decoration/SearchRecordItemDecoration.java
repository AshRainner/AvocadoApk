package com.Decoration;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class SearchRecordItemDecoration extends RecyclerView.ItemDecoration {
    private final int divHeight;

    public SearchRecordItemDecoration(int divHeight) {
        this.divHeight = divHeight;
    }
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state){
        super.getItemOffsets(outRect,view,parent,state);
        outRect.top = divHeight;
    }
}
