package com.example.tugas1_10119291;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class activity_splash extends AppCompatActivity {

    //20 april 2022, 10119291, Rezza Ramdhani Nashrullah, IF7

    private int waktu_loading = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke login activity
                Intent activity_login=new Intent(activity_splash.this, activity_login.class);
                startActivity(activity_login);
                finish();
            }
        },waktu_loading);
    }
}