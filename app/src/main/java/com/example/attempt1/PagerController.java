package com.example.attempt1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerController extends FragmentPagerAdapter {

    int tabCounts;


    public PagerController(FragmentManager fm, int tabCounts) {

        super(fm);
        this.tabCounts = tabCounts;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new noteFragment();
            case 1:
                return new reminderFragment();
            case 2:
                return new missedFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCounts;
    }
}
