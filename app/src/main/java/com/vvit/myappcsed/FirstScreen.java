package com.vvit.myappcsed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstScreen extends AppCompatActivity {
    EditText firstValue,secondValue;
    TextView resultView;
    Button addMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        setTitle(R.string.first_screen_name);

        firstValue = findViewById(R.id.id_first_screen_input1);
        secondValue = findViewById(R.id.id_first_screen_input2);
        resultView = findViewById(R.id.id_first_screen_result);
        addMe = findViewById(R.id.id_first_screen_click_me);




    }

    public void handleAddClick(View view) {
        int v1 = Integer.parseInt(firstValue.getText().toString());
        int v2= Integer.parseInt(secondValue.getText().toString());
        int result = v1 + v2 ;
        resultView.setText(String.valueOf(result));
        Toast.makeText(FirstScreen.this, "Hi, Hello world", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,SecondScreen.class);
        intent.putExtra("resultValue",String.valueOf(result));

        startActivity(intent);

    }
}