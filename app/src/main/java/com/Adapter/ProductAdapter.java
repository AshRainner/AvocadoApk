package com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.Model.ProductModel;
import com.avocado.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {
    private ArrayList<ProductModel> items = new ArrayList<>();
    Context context;

    public ProductAdapter(Context context, ArrayList<ProductModel> items) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        context = parent.getContext();
        ProductModel productView = items.get(position);
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.home_recommend_item, parent, false);
        }
        ImageView productImage = view.findViewById(R.id.recommendImage);
        TextView productName = view.findViewById(R.id.productName);
        TextView productPrice = view.findViewById(R.id.productPrice);
        TextView saleArea = view.findViewById(R.id.saleArea);
        Glide.with(view).load(productView.getProductImageUrl()).into(productImage);
        productName.setText(productView.getProductName());
        productPrice.setText(productView.getProductPrice());
        saleArea.setText(productView.getSaleArea());

        return view;
    }
}
