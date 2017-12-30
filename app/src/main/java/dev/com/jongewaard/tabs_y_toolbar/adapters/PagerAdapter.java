package dev.com.jongewaard.tabs_y_toolbar.adapters;

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

        switch (position){

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
        return numberOfTabs;
    }
}
