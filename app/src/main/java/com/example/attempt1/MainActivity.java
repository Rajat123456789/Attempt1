package com.example.attempt1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.*;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar mToolbar; //
    TabLayout mTabLayout;//
    TabItem mnoteTab; //
    TabItem mreminderTab; //
    TabItem mmissedTab; //
    ViewPager mPager; //

    PagerController mPagerController; //



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("RemNotes");



        mTabLayout = findViewById(R.id.tabLayout);
        mnoteTab = findViewById(R.id.noteTab);
        mreminderTab = findViewById(R.id.reminderTab);
        mmissedTab = findViewById(R.id.missedTab);
        mPager = findViewById(R.id.viewPager);

        mPagerController = new PagerController(getSupportFragmentManager(), mTabLayout.getTabCount());
        mPager.setAdapter(mPagerController);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());



    }


           @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    }

