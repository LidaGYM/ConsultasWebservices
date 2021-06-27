package com.empresa.consultadni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.blankj.utilcode.util.LogUtils;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        (new Handler()).postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this, Principal.class));
                finish();
            }
        }, 2000);
    }

    @Override
    protected void onResume(){
        //Log.d("APP","OnResumen" );
        //LogUtils.d("OnResumen"); //Libreria
        super.onResume();
    }
}