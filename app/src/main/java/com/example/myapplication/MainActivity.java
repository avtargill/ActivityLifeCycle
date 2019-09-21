package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Main-hbhjhjvsdhjhjhj", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Main-hbhjhjvsdhjhjhj", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Main-hbhjhjvsdhjhjhj", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Main-hbhjhjvsdhjhjhj", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Main-hbhjhjvsdhjhjhj", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Main-hbhjhjvsdhjhjhj", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Main-hbhjhjvsdhjhjhj", "onRestart");
    }
}
