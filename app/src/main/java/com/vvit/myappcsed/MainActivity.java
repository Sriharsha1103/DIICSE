package com.vvit.myappcsed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Debug","executing on Create method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Debug","executing on start method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Debug","executing on Stop method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Debug","executing on Pause method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Debug","executing on Resume method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Debug","executing on Restart method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Debug","executing on Destroy method");
    }
}