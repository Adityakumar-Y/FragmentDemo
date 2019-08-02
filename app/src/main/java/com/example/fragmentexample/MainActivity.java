package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnAdd;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, new SampleFragment()).commit();

        btnAdd = (Button) findViewById(R.id.addFragment);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment();
            }
        });

        //addFragment();

        Log.i("MainActivity", "OnCreate");
    }

    private void addFragment(){
        Fragment fragment;
        fragmentManager = getSupportFragmentManager();
        fragment = fragmentManager.findFragmentById(R.id.fragmentContainer);
        if(fragment instanceof SampleFragment)
        {
            fragment = new FragmentTwo();
        }
        else if(fragment instanceof  FragmentTwo){
            fragment = new FragmentThree();
        }
        else if(fragment instanceof  FragmentThree){
            fragment = null;
        }
        else{
            fragment = new SampleFragment();
        }

        if(fragment != null) {
            //fragment = new SampleFragment();
            fragmentTransaction = fragmentManager.beginTransaction();
            //SampleFragment sampleFragment = new SampleFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, fragment).addToBackStack(null);

            fragmentTransaction.commit();
        }
    }

    @Override
    public void onBackPressed() {
        /*Fragment fragment = fragmentManager.findFragmentById(R.id.fragmentContainer);
        if(!(fragment instanceof SampleFragment))
        {
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(fragment);
            fragmentTransaction.commit();
        }
        else {
            super.onBackPressed();
        }*/

        super.onBackPressed();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity", "onRestart");
    }
}
