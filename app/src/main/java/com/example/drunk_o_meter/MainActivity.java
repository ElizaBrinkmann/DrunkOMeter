package com.example.drunk_o_meter;

import android.R.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    questions questions = new questions();
    Score Score = new Score();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPress(View view){
       if (findViewById(R.id.button)){
            Score.addToScore(1);
        }
        questions.counting();
        TextView tv = findViewById(R.id.textView);
        tv.setText(questions.toString());
    }
}