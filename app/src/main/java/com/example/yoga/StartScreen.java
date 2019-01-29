package com.example.yoga;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

public class StartScreen extends AppCompatActivity {

    Handler handler;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
        handler = new Handler();
        progressBar= findViewById(R.id.progress);

        Thread welcomeThread = new Thread() {
            @Override
            public void run() {
                try {
                    super.run();
                    sleep(1500);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                    Intent i = new Intent(StartScreen.this,
                            MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        welcomeThread.start();

    }

    @Override
    protected void onStart() {
        super.onStart();


    }
}
