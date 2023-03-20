package com.avocado;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.Adapter.BannerPagerAdapter;
import com.Adapter.RecommendAdapter;
import com.Model.BannerModel;
import com.Model.ProductModel;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator3;

public class HomeFragment extends Fragment {
    private ViewPager2 bannerPager;
    private BannerPagerAdapter bannerAdapter;
    private ArrayList<BannerModel> bannerViews;
    private CircleIndicator3 bannerIndicator;
    private RecyclerView categoryView;
    private TextView recommendText;
    private GridView recommendGrid;
    private ArrayList<ProductModel> productList;
    private RecommendAdapter recommendAdapter;
    private Button recommendButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        bannerPager = view.findViewById(R.id.bannerPager);
        bannerViews = new ArrayList<BannerModel>();
        bannerViews.add(new BannerModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA"));
        bannerViews.add(new BannerModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA"));
        bannerViews.add(new BannerModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA"));
        bannerViews.add(new BannerModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA"));
        bannerAdapter = new BannerPagerAdapter(getActivity().getApplicationContext(),bannerViews);
        bannerIndicator = view.findViewById(R.id.bannerIndicator);
        //categoryView = view.findViewById(R.id.categoryList);


        recommendText = view.findViewById(R.id.recommendText);
        recommendGrid = view.findViewById(R.id.recommendView);
        recommendButton = view.findViewById(R.id.recommendButton);

        productList = new ArrayList<ProductModel>();
        productList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000000","도쿄부시나가와구"));
        productList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000001","도쿄부시나가와"));
        productList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        productList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        productList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        productList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));

        recommendAdapter = new RecommendAdapter(getActivity().getApplicationContext(),productList);
        recommendGrid.setAdapter(recommendAdapter);

        recommendGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        bannerPager.setAdapter(bannerAdapter);
        bannerIndicator.setViewPager(bannerPager);

        return view;
    }
}