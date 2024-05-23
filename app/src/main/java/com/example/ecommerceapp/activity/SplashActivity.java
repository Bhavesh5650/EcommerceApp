package com.example.ecommerceapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ecommerceapp.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Window window = SplashActivity.this.getWindow();
        window.setStatusBarColor(getColor(R.color.splash_color));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent  = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        },3000);
    }
}