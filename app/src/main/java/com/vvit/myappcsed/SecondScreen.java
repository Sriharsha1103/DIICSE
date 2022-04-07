package com.vvit.myappcsed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {
    TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        setTitle(R.string.second_screen_name);
        resultView = findViewById(R.id.id_second_result);

        String result = getIntent().getStringExtra("resultValue");
        Log.d("Intent value","Result "+result);
        resultView.setText(result);


    }
}