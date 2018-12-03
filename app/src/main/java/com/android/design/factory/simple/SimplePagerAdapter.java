package com.android.design.factory.simple;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SimplePagerAdapter extends FragmentStatePagerAdapter {
    public SimplePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return FragmentFactory.creatFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
