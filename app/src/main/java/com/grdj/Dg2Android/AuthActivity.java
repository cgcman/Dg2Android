package com.grdj.Dg2Android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth_main);
    }
}
