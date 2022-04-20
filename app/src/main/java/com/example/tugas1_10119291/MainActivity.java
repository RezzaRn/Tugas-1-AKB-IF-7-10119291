package com.example.tugas1_10119291;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //20 april 2022, 10119291, Rezza Ramdhani Nashrullah, IF7

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void profile(View view) {
        Intent MainActivity=new Intent(MainActivity.this, activity_profile.class);
        startActivity(MainActivity);
    }

    public void logout(View view) {
        Intent Logout = new Intent(MainActivity.this, activity_login.class);
        startActivity(Logout);
    }
}