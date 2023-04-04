package com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Model.CategoryModel;
import com.Model.ProductModel;
import com.avocado.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private ArrayList<CategoryModel> items = new ArrayList<>();
    Context context;

    public CategoryAdapter(Context context, ArrayList<CategoryModel> items) {
        this.items = items;
        this.context = context;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView categoryImg;
        private TextView categoryName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryImg = itemView.findViewById(R.id.categoryImage);
            categoryName = itemView.findViewById(R.id.categoryName);
        }

        public ImageView getCategoryImg() {
            return categoryImg;
        }

        public TextView getCategoryName() {
            return categoryName;
        }
    }
    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.home_category_item,parent,false);
        CategoryAdapter.ViewHolder viewHolder = new CategoryAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        String categoryName=items.get(position).getCategoryString();
        int categoryImgId=items.get(position).getCategoryImg();
        holder.categoryImg.setImageResource(categoryImgId);
        holder.categoryName.setText(categoryName);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
