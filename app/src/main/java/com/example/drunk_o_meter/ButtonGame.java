package com.example.drunk_o_meter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Collections;
import java.util.Arrays;
import android.widget.Button;
import android.widget.TextView;


public class ButtonGame extends AppCompatActivity {
    //private int seconds=0;
   // private boolean startRun;
    // Random rnd = new Random();

    private String [] randomNumber;
    int currentNumber =1;


    Button but1 = (Button) findViewById(R.id.game_but5);
    Button but2 = (Button) findViewById(R.id.game_but2);
    Button but3 = (Button) findViewById(R.id.game_but5);
    Button but4 = (Button) findViewById(R.id.game_but5);
    Button but5 = (Button) findViewById(R.id.game_but5);

    TextView textView = findViewById(R.id.game_but5);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_game);
        long startTime = System.currentTimeMillis();

        
        randomNumber = new String[5];
        randomNumber[0] = "1";
        randomNumber[1] = "2";
        randomNumber[2] = "3";
        randomNumber[3] = "4";
        randomNumber[4] = "5";
        Collections.shuffle(Arrays.asList(randomNumber));
    }
    
    public void onClick(View  view){
        if (randomNumber.valueOf(textView.getText()) == currentNumber);
        currentNumber ++;
        long endTime = System.currentTimeMillis();

    }
    


}



