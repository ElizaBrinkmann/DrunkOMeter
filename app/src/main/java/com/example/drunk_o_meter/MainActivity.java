package com.example.drunk_o_meter;

import android.R.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    questions questions = new questions();
    Score Score = new Score();
//    Button but_yes = (Button) findViewById(R.id.button_yes);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPress(View view){
        if ((questions.getCount()) == 5){
            Intent nextActivity = new Intent(MainActivity.this, DrinkList.class);
            startActivity(nextActivity);

        }
       if (view.getId() == R.id.button_yes)
        {
            Score.addToScore(1);
        }
        questions.counting();
        TextView tv = findViewById(R.id.textView);
        tv.setText(questions.toString());

    }


}