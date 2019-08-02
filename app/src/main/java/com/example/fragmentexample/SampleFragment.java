package com.example.fragmentexample;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SampleFragment extends Fragment {


    public SampleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("Sample Fragment", "OnCreateView");
        return inflater.inflate(R.layout.fragment_sample, container, false);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Sample Fragment", "OnCreate");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("Sample Fragment", "OnAttach");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Sample Fragment", "OnActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Sample Fragment", "OnStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Sample Fragment", "OnResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Sample Fragment", "OnPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Sample Fragment", "OnStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Sample Fragment", "OnDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Sample Fragment", "OnDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Sample Fragment", "OnDetach");
    }
}
