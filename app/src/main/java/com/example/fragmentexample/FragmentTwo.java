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
public class FragmentTwo extends Fragment {


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("Fragment Two", "OnCreateView");
        return inflater.inflate(R.layout.fragment_sample_two, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Fragment Two", "OnCreate");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("Fragment Two", "OnAttach");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Fragment Two", "OnActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Fragment Two", "OnStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Fragment Two", "OnResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Fragment Two", "OnPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Fragment Two", "OnStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Fragment Two", "OnDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Fragment Two", "OnDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Fragment Two", "OnDetach");
    }

}
