package com.avocado;

import android.os.Bundle;

import com.Adapter.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager2.widget.ViewPager2;

import com.avocado.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    /*
    이 어플리케이션의 제작권은 이건이 가지고 있습니다.
    무단 전제 및 도용 시 저작권 법에 의해 처벌 받을 수 있습니다.
    제작자 : 인하공업 전문 대학 3학년 이건
     */
    private ViewPager2 viewPager;
    private HomeFragment homeFragment;
    private SearchFragment searchFragment;
    private MainFragment upLoadFragment;
    private MainFragment chatFragment;
    private MainFragment myPageFragment;
    private ViewPagerAdapter pagerAdapter;
    private BottomNavigationView bottomBar;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        //bottomBar = findViewById(R.id.bottom_bar);
        tabLayout = findViewById(R.id.tab);

        pagerAdapter = new ViewPagerAdapter(this);
        createFragement();
        viewPager.setUserInputEnabled(false);
        viewPager.setAdapter(pagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch(position){
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                }
            }
        }).attach();
        /*bottomBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.tab_home:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.tab_search:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.tab_upload:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.tab_chat:
                        viewPager.setCurrentItem(3);
                        break;
                    case R.id.tab_mypage:
                        viewPager.setCurrentItem(4);
                        break;
                }
                return true;
            }
        });*/
        //Log.d("asdf",String.valueOf(pagerAdapter.getItemCount()));
    }
    private void createFragement(){
        homeFragment = new HomeFragment();
        searchFragment = new SearchFragment("http://192.168.35.9:3000/search");
        upLoadFragment = new MainFragment("http://192.168.35.9:3000/upload");
        chatFragment = new MainFragment("http://192.168.35.9:3000/chat");
        myPageFragment = new MainFragment("http://192.168.35.9:3000/mypage");
        pagerAdapter.addFragment(homeFragment);
        pagerAdapter.addFragment(searchFragment);
        pagerAdapter.addFragment(upLoadFragment);
        pagerAdapter.addFragment(chatFragment);
        pagerAdapter.addFragment(myPageFragment);
    }
}