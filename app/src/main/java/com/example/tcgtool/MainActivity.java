package com.example.tcgtool;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //add fragment item
        adapter.AddFragment(new FragmentCall(),"New Card List");
        adapter.AddFragment(new FragmentContact(),"Search");
        adapter.AddFragment(new FragmentFav(),"favorites");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_portrait_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_library_books_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_get_app_black_24dp);

        //remove shadow from action bars
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);




    }
}
