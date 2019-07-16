package com.example.alc4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_welcome_screen);
        Thread myThread = new Thread(){
        @Override
            public void run() {
            try {
                sleep (2000);
                Intent intent = new Intent (getApplicationContext ( ), MainActivity.class);
                startActivity (intent);
                finish ();
            }catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        };
        myThread.start ();
    }
}
