package dev.com.jongewaard.tabs_y_toolbar.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.com.jongewaard.tabs_y_toolbar.R;

public class ThirdFragment extends Fragment {


    public ThirdFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_third, container, false);

       return view;
    }

}
