package com.example.truongpq.dynamicviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by TruongPQ on 4/23/16.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    private List<MyFragment> fragments;
    public PagerAdapter(FragmentManager fm, List<MyFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab" + (position + 1);
    }
}
