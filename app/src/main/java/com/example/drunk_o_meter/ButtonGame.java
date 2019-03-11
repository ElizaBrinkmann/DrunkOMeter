package com.example.drunk_o_meter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.Random;
import java.util.Timer;
import java.util.ArrayList;
import java.util.Arrays;
import android.widget.Button;
import android.widget.TextView;


public class ButtonGame extends AppCompatActivity {
    private int seconds=0;
    private boolean startRun;
    Random rnd = new Random();

    private String [] integers;


    Button but1 = (Button) findViewById(R.id.game_but1);
    Button but2 = (Button) findViewById(R.id.game_but2);
    Button but3 = (Button) findViewById(R.id.game_but3);
    Button but4 = (Button) findViewById(R.id.game_but4);
    Button but5 = (Button) findViewById(R.id.game_but5);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_game);
        integers = new String[3];
        integers[0] = "2";
        integers[1] = "3";
        integers[2] = "4";
        integers[3] = "5";



        if(savedInstanceState != null){
            seconds = savedInstanceState.getInt("seconds");
            startRun=savedInstanceState.getBoolean("startRun");
        }

        Timer();


    }


    public void setSaveInstanceState(Bundle saveInstanceState){
        saveInstanceState.putInt("seconds", seconds);
        saveInstanceState.putBoolean("startRun", startRun);
    }





    private void Timer() {
        final TextView timeView = (TextView) findViewById(R.id.Timer);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;

                String time = String.format("%d:%02d:%02d", hours, minutes, secs);

                timeView.setText(time);

                if (startRun) {
                    seconds++;
                }

                handler.postDelayed(this, 100);
            }
        });

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ButtonGame.super.onStart();

                int x = (int)(Math.random() * ((3) + 1));
                String helloText = integers[x];
                TextView.setText(integers[4]);


            }

        });


        but5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){



                ButtonGame.super.onPause();
            }


        });



    }

}



