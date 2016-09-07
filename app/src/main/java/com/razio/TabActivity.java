package com.razio;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;

import adapter.ViewPagerAdapter;
import tabpage.TabOne;
import tabpage.TabThree;
import tabpage.TabTwo;

/**
 * Created by sanam on 8/15/16.
 */
public class TabActivity extends FragmentActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    android.support.v7.app.ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);


        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabTextColors(ContextCompat.getColor(this, android.R.color.black), ContextCompat.getColor(this, android.R.color.white));
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabOne(), "First");
        adapter.addFragment(new TabTwo(), "Second");
        adapter.addFragment(new TabThree(), "Third");
        viewPager.setAdapter(adapter);


    }


}
