package com.example.team06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Odds odds;
        odds = new Odds();
        Evens evens;
        evens = new Evens();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            new Thread(odds);
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            new Thread(evens);
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}