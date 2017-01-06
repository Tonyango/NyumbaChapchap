package tonyango.nyumbachapchap.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tonyango.nyumbachapchap.R;

/**
 * Created by homeboyz on 15/12/2016.
 */

public class InstagramFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_instagram, container, false);
        return rootView;

    }

}
