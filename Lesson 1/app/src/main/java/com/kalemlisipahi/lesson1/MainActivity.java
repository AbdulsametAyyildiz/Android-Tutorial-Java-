package com.kalemlisipahi.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Burası on create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Burası on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Burası on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Burası on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Burası on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Burası on destroy");
    }
}