package com.example.drunk_o_meter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Collections;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class ButtonGame extends AppCompatActivity {

    private long startTime;
    private String[] numbers = {"1", "2", "3", "4", "5"};
    private int currentNumber = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_game);
        startTime = System.currentTimeMillis();


        Button but1 = findViewById(R.id.game_but1);
        Button but2 = findViewById(R.id.game_but2);
        Button but3 = findViewById(R.id.game_but3);
        Button but4 = findViewById(R.id.game_but4);
        Button but5 = findViewById(R.id.game_but5);



        Collections.shuffle(Arrays.asList(numbers));
        but1.setText(numbers[0]);
        but2.setText(numbers[1]);
        but3.setText(numbers[2]);
        but4.setText(numbers[3]);
        but5.setText(numbers[4]);

        Timer gameTimer = new Timer();
        gameTimer.scheduleAtFixedRate(new TimerTask() {
            int seconds = 0;

            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        TextView tv = findViewById(R.id.tvTimer);
                        tv.setText(String.valueOf(seconds));
                        seconds++;
                    }
                });
            }
        }, 0, 1000);


    }


    public void onClick(View view) {
        Button clicked = (Button)view;
        //This is very clunky and can probably be done a better way
        if(currentNumber == Integer.valueOf(clicked.getText().toString())){
            /*If the number displayed in the button is the same as the number you're currently expecting
            add 1 to currentNumber and do something to the text of the button clicked
             */
            currentNumber++;
            clicked.setText("---");
            clicked.setClickable(false);
        }
        else {
            Toast.makeText(view.getContext(), "Wrong number!", Toast.LENGTH_SHORT).show();
        }

        //Maybe something like this to end the game
        if(currentNumber == 6){
            //The number will be 6 after successfully clicking the 5th button.
            long endTime = System.currentTimeMillis() - startTime;
            // score is the amount of seconds it takes about 3 seconds to make it sober
            int score =(((int) (endTime/1000)) - 3);
            ScoreSingleton.getInstance().addScore(score);

            Intent nextActivity = new Intent(ButtonGame.this, Advise.class);
            startActivity(nextActivity);
        }

    }

}