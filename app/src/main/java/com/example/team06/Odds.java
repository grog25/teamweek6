package com.example.team06;

public class Odds implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 100 && i % 2 != 0; i++) {

            System.out.println(i);
        }
    }
}
