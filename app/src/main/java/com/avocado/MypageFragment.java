package com.avocado;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.Adapter.MypageStateAdapter;
import com.Adapter.ProductAdapter;
import com.Adapter.RecordAdapter;
import com.Decoration.SearchRecordItemDecoration;
import com.Model.MypageStateModel;
import com.Model.ProductModel;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MypageFragment extends Fragment {
    private ImageView userProfileImageView;
    private RecyclerView mypageStateView;
    private ArrayList<MypageStateModel> mypageStateList;
    private MypageStateAdapter mypageStateAdapter;
    private GridView mypageSaleGrid;
    private ArrayList<ProductModel> mypageSaleProductList;
    private ProductAdapter mypageSaleAdapter;
    private Button mypageSaleButton;
    private GridView mypageSaleEndGrid;
    private ArrayList<ProductModel> mypageSaleEndList;
    private ProductAdapter mypageSaleEndAdapter;
    private Button mypageSaleEndButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mypage_fragment, container, false);
        userProfileImageView = view.findViewById(R.id.userProfileImage);
        Glide.with(view).load("https://hololive.hololivepro.com/wp-content/uploads/2022/04/3_ぺこら.png").apply(new RequestOptions()).circleCrop().into(userProfileImageView);

        mypageStateView = view.findViewById(R.id.mypageStateList);
        mypageStateList = new ArrayList<MypageStateModel>();
        mypageStateList.add(new MypageStateModel("本人確認","OK"));
        mypageStateList.add(new MypageStateModel("評価","4.8"));
        mypageStateList.add(new MypageStateModel("販売","10"));
        mypageStateList.add(new MypageStateModel("購入","5"));
        mypageStateList.add(new MypageStateModel("オープン","+50"));
        mypageStateAdapter = new MypageStateAdapter(getActivity().getApplicationContext(),mypageStateList);
        mypageStateView.setAdapter(mypageStateAdapter);

        mypageSaleGrid = view.findViewById(R.id.mypageSaleGrid);
        mypageSaleButton = view.findViewById(R.id.mypageSaleButton);

        mypageSaleProductList = new ArrayList<ProductModel>();
        mypageSaleProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000000","도쿄부시나가와구"));
        mypageSaleProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000001","도쿄부시나가와"));
        mypageSaleProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        mypageSaleProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        mypageSaleProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        mypageSaleProductList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));

        mypageSaleAdapter = new ProductAdapter(getActivity().getApplicationContext(),mypageSaleProductList);
        mypageSaleGrid.setAdapter(mypageSaleAdapter);

        mypageSaleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        mypageSaleEndGrid = view.findViewById(R.id.mypageSaleEndGrid);
        mypageSaleEndButton = view.findViewById(R.id.mypageSaleEndButton);

        mypageSaleEndList = new ArrayList<ProductModel>();
        mypageSaleEndList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000000","도쿄부시나가와구"));
        mypageSaleEndList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000001","도쿄부시나가와"));
        mypageSaleEndList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        mypageSaleEndList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        mypageSaleEndList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));
        mypageSaleEndList.add(new ProductModel("https://fastly.picsum.photos/id/42/1280/774.jpg?hmac=wH8dpUlYlOTcgcrV31I3iyIYpNFQoMcfo0HIwPZlCGA","Panasonic","\\3000002","도쿄부시나가와"));

        mypageSaleEndAdapter = new ProductAdapter(getActivity().getApplicationContext(),mypageSaleEndList);
        mypageSaleEndGrid.setAdapter(mypageSaleEndAdapter);

        mypageSaleEndGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });


        return view;
    }
}