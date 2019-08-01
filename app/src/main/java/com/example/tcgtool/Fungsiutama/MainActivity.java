package com.example.tcgtool.Fungsiutama;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tcgtool.R;

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
        adapter.AddFragment(new FragmentCard(),"List Card");
        adapter.AddFragment(new FragmentFav(),"Search");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        //remove shadow from action bars
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);




    }
}
