package com.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Model.CategoryModel;
import com.avocado.R;

import java.util.ArrayList;

public class RecordAdapter extends RecyclerView.Adapter<RecordAdapter.ViewHolder> {
    private ArrayList<String> items = new ArrayList<>();
    Context context;

    public RecordAdapter(Context context, ArrayList<String> items) {
        this.items = items;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView recordText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recordText = itemView.findViewById(R.id.recordText);
        }

        public TextView getRecordText() {
            return recordText;
        }
    }
    @NonNull
    @Override
    public RecordAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.search_record_item,parent,false);
        RecordAdapter.ViewHolder viewHolder = new RecordAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecordAdapter.ViewHolder holder, int position) {
        String recordText=items.get(position);
        holder.recordText.setText(recordText);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
