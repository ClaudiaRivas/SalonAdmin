package com.example.rivas.salon_rmr.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rivas.salon_rmr.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UnasFragment extends Fragment {


    public UnasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_unas, container, false);

        return view;
    }

}
