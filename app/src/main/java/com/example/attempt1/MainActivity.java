package com.example.attempt1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.*;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Toast;

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
    AppCompatButton mAdd; //
    int click = 0;

    PagerController mPagerController; //


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdd = findViewById(R.id.add);
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

        if (mTabLayout.getSelectedTabPosition() == 2)
            mAdd.setEnabled(false);


        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdd.setEnabled(true);
                if (mTabLayout.getSelectedTabPosition() == 0) {

                    Toast.makeText(MainActivity.this, "Note would be added", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,AddNote.class));

                }

                if (mTabLayout.getSelectedTabPosition() == 1) {
                    Toast.makeText(MainActivity.this, "Reminder would be added", Toast.LENGTH_SHORT).show();
                }

                if (mTabLayout.getSelectedTabPosition() == 2) {
                    Toast.makeText(MainActivity.this, "NONE", Toast.LENGTH_SHORT).show();

                }

            }
        });


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







