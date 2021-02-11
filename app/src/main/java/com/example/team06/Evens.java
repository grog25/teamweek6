package com.example.team06;

public class Evens implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 100 && i % 2 == 0; i++) {

            System.out.println(i);
        }
    }
}
