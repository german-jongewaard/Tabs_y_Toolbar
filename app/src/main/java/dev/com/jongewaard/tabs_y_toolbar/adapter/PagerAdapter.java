package dev.com.jongewaard.tabs_y_toolbar.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by german on 27-12-17.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{

    private int numberOfTabs;




    public PagerAdapter(FragmentManager fm, int tabs) {
        super(fm);
        this.numberOfTabs = tabs;
    }

    @Override
    public Fragment getItem(int position) {



        return null;
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
