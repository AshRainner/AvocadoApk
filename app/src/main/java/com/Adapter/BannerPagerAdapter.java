package com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Model.BannerModel;
import com.avocado.R;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BannerPagerAdapter extends RecyclerView.Adapter<BannerPagerAdapter.BannerViewHolder> {
    private ArrayList<BannerModel> bannerList = new ArrayList<>();
    private Context context;

    public BannerPagerAdapter(Context context,ArrayList<BannerModel> bannerList) {
        this.context = context;
        this.bannerList = bannerList;
    }

    @NonNull
    @Override
    public BannerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_banner_image,parent,false);
        return new BannerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BannerViewHolder holder, int position) {
        holder.bindImage(bannerList.get(position).getBannerImageUrl());
    }

    @Override
    public int getItemCount() {
        return bannerList.size();
    }

    public class BannerViewHolder extends RecyclerView.ViewHolder{
        private ImageView bannerImage;
        public BannerViewHolder(@NonNull View itemView){
            super(itemView);
            bannerImage = itemView.findViewById(R.id.bannerImage);
        }
        public void bindImage(String imageURL){
            Glide.with(context).load(imageURL).into(bannerImage);
        }
    }


}
