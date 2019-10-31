package com.example.aplikasikudeska;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aplikasikudeska.helper.SharedPref;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (SharedPref.getInstance(Splash.this).isLogin()){
                    Intent intent = new Intent(Splash.this, LoginActivity.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(Splash.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        }, 2000);


    }
}
