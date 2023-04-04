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
import com.Adapter.CategoryAdapter;
import com.Adapter.ProductAdapter;
import com.Model.BannerModel;
import com.Model.CategoryModel;
import com.Model.ProductModel;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator3;

public class HomeFragment extends Fragment {
    private ViewPager2 bannerPager;
    private BannerPagerAdapter bannerAdapter;
    private ArrayList<BannerModel> bannerViews;
    private CircleIndicator3 bannerIndicator;
    private RecyclerView categoryRecycler;
    private ArrayList<CategoryModel> categoryList;
    private CategoryAdapter categoryAdapter;
    private TextView recommendText;
    private GridView recommendGrid;
    private ArrayList<ProductModel> recommendProductList;
    private ProductAdapter recommendAdapter;
    private Button recommendButton;
    private TextView friendText;
    private GridView friendGrid;
    private ArrayList<ProductModel> friendProductList;
    private ProductAdapter friendAdapter;
    private Button friendButton;

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

        categoryRecycler = view.findViewById(R.id.categoryList);
        categoryList = new ArrayList<CategoryModel>();
        categoryList.add(new CategoryModel("Apple",R.drawable.apple));
        categoryList.add(new CategoryModel("カメラ",R.drawable.apple));
        categoryList.add(new CategoryModel("服",R.drawable.apple));
        categoryList.add(new CategoryModel("靴",R.drawable.apple));
        categoryList.add(new CategoryModel("スピーカ",R.drawable.apple));
        categoryList.add(new CategoryModel("パソコン",R.drawable.apple));
        categoryAdapter = new CategoryAdapter(getActivity().getApplicationContext(),categoryList);
        categoryRecycler.setAdapter(categoryAdapter);

        recommendText = view.findViewById(R.id.recommendText);
        recommendGrid = view.findViewById(R.id.recommendView);
        recommendButton = view.findViewById(R.id.recommendButton);

        recommendProductList = new ArrayList<ProductModel>();
        recommendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000000","도쿄부시나가와구"));
        recommendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000001","도쿄부시나가와"));
        recommendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        recommendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        recommendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        recommendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));

        recommendAdapter = new ProductAdapter(getActivity().getApplicationContext(),recommendProductList);
        recommendGrid.setAdapter(recommendAdapter);

        recommendGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        friendText = view.findViewById(R.id.friendText);
        friendGrid = view.findViewById(R.id.friendView);
        friendButton = view.findViewById(R.id.friendButton);

        friendProductList = new ArrayList<ProductModel>();
        friendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000000","도쿄부시나가와구"));
        friendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000001","도쿄부시나가와"));
        friendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        friendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        friendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        friendProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));

        friendAdapter = new ProductAdapter(getActivity().getApplicationContext(),friendProductList);
        friendGrid.setAdapter(friendAdapter);

        friendGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        bannerPager.setAdapter(bannerAdapter);
        bannerIndicator.setViewPager(bannerPager);

        return view;
    }
}