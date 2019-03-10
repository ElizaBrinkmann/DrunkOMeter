package com.example.drunk_o_meter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ButtonGame extends AppCompatActivity {
    private int seconds=0;
    private boolean startRun;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null){
            seconds = savedInstanceState.getInt("seconds");
            startRun=savedInstanceState.getBoolean("startRun");
        }

        Timer();


    }
    public void onSaveInstanceState(Bundle saveInstanceState){
        saveInstanceState.putInt("seconds", seconds);
        saveInstanceState.putBoolean("startRun", startRun);
    }

    public void onClickStart(View view){

        startRun=true;
    }



    private void Timer(){
        final TextView timeView = (TextView)findViewById(R.id.Timer);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;

                String time = String.format("%d:%02d:%02d", hours, minutes, secs);

                timeView.setText(time);

                if(startRun){
                    seconds++;
                }

                handler.postDelayed(this, 100);
            }
        });

    }
}


