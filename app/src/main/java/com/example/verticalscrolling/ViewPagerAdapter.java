package com.example.verticalscrolling;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        ChildFragment child = new ChildFragment();
        Bundle bundle = new Bundle();
        bundle.putString("parent",String.valueOf(position));
        child.setArguments(bundle);
        return child;
    }

    @Override
    public int getCount() {
        return 20;
    }
}
