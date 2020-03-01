package com.example.attempt1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.attempt1.fragment.MissedFragment;
import com.example.attempt1.fragment.NoteFragment;
import com.example.attempt1.fragment.ReminderFragment;

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
                return new NoteFragment();
            case 1:
                return new ReminderFragment();
            case 2:
                return new MissedFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCounts;
    }
}
