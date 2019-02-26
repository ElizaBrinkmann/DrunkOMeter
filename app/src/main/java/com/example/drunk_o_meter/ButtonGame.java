package com.example.drunk_o_meter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import

import org.w3c.dom.Text;

public class ButtonGame extends AppCompatActivity {


    private static TextView countdownTimerText;
    private static EditText seconds;
    private static Button startTimer, resetTimer;
    private static CountDownTimer countDownTimer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_game);

        TextView textView = (TextView) findViewById(R.id.Timer);

        countdownTimerText = (TextView) findViewById(R.id.countdownText);

        @Override
        public void run() {
            runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    TextView tv = (TextView) findViewById(R.id.main_timer_text);
                    tv.setText(String.valueOf(minutes)+":"+String.valueOf(seconds));
                    seconds -= 1;

                    if(seconds == 0)
                    {
                        tv.setText(String.valueOf(minutes)+":"+String.valueOf(seconds));

                        seconds=60;
                        minutes=minutes-1;

                    }



                }

            });
        }

    }, 0, 1000);
}






