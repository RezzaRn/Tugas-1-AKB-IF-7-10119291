package com.example.tugas1_10119291;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_daftar extends AppCompatActivity {

    //20 april 2022, 10119291, Rezza Ramdhani Nashrullah, IF7

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

    }

    public void login(View view) {
        Intent activity_login=new Intent(activity_daftar.this, activity_login.class);
        startActivity(activity_login);
    }
}