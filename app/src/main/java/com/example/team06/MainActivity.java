package com.example.team06;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        Log.i(TAG, "About to create intent with "+ textView.getText().toString() +
                textView2.getText().toString());

        String odds = textView.getText().toString();
        String evens = textView2.getText().toString();

        intent.putExtra(ODDS, odds);
        intent.putExtra(EVENS, evens);

        startActivity(intent);
    }

        public void odds(View view) {
            ExampleThread thread = new ExampleThread(100);
            thread.start();
        }

        public void evens(View view) {
            ExampleRunnable runnable = new ExampleRunnable(100);
            new Thread(runnable).start();

        }

        class ExampleThread extends Thread {
            int count;

            ExampleThread(int count) {
                this.count = count;
            }

            @Override
            public void run() {
                for (int i = 1; i <= count; i++) {
                    if (i % 2 != 0)
                    Log.d(TAG, "startThread: " + i);
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    TextView textView = findViewById(R.id.textView);
                    textView.setText(i);
                }
            }
        }
        class ExampleRunnable implements Runnable {
            int count;



            ExampleRunnable(int count) {
                this.count = count;
            }
            @Override
            public void run() {
                for (int i = 0; i <= count; i++) {
                    if (i % 2 == 0)
                        Log.d(TAG, "startThread: " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    TextView textView2 = findViewById(R.id.textView2);
                    textView2.setText(i);
                }
            }
        }
}