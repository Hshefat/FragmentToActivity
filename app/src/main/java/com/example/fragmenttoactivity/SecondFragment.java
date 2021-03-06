package com.example.fragmenttoactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SecondFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fv = inflater.inflate(R.layout.fragment_second, null);

        Toolbar mActionBar = fv.findViewById(R.id.profileSecond_toolbar);
        mActionBar.setNavigationIcon(getActivity().getResources().getDrawable(R.drawable.ic_baseline_arrow_back_24));
        mActionBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What to do on back clicked
                getActivity().onBackPressed();
            }
        });

        return fv;

    }
}
