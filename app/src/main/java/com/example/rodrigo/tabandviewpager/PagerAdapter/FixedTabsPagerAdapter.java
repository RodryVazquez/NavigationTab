package com.example.rodrigo.tabandviewpager.PagerAdapter;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.rodrigo.tabandviewpager.Fragments.FirstFragment;
import com.example.rodrigo.tabandviewpager.Fragments.SecondFragment;
import com.example.rodrigo.tabandviewpager.Fragments.ThirdFragment;
import com.example.rodrigo.tabandviewpager.R;

public class FixedTabsPagerAdapter extends FragmentPagerAdapter {

    Context context;

    //Override
    public FixedTabsPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return context.getString(R.string.title_first_fragment);
            case 1:
                return context.getString(R.string.title_second_fragment);
            case 2:
                return context.getString(R.string.title_third_fragment);
            default:
                return null;
        }
    }
}
