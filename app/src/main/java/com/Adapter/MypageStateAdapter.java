package com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Model.MypageStateModel;
import com.avocado.R;

import java.util.ArrayList;

public class MypageStateAdapter extends RecyclerView.Adapter<MypageStateAdapter.ViewHolder> {
    private ArrayList<MypageStateModel> items = new ArrayList<>();
    Context context;

    public MypageStateAdapter(Context context, ArrayList<MypageStateModel> items) {
        this.items = items;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView stateText;
        private TextView stateResult;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            stateText = itemView.findViewById(R.id.mypageStateText);
            stateResult = itemView.findViewById(R.id.stateResult);
        }
    }
    @NonNull
    @Override
    public MypageStateAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mypage_state_item,parent,false);
        MypageStateAdapter.ViewHolder viewHolder = new MypageStateAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MypageStateAdapter.ViewHolder holder, int position) {
        String stateText=items.get(position).getMypageStateText();
        String stateResult=items.get(position).getMypageResultText();
        holder.stateText.setText(stateText);
        holder.stateResult.setText(stateResult);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
