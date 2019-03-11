package com.example.drunk_o_meter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Advise extends AppCompatActivity {
    AdvisePage advicePage = new AdvisePage();

    @Override
    //placing the advice in adviceView
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advise);

        TextView tv = findViewById(R.id.adviseView);//places the advice in adviceView
        tv.setText(advicePage.giveAdvise());//gives the advice according to the score
    }
//when pressed starts the test again
    public void onClick (View view) {
        Intent nextActivity = new Intent(Advise.this, MainActivity.class);//moves from Advise page to MainActivity
        startActivity(nextActivity);//starting new activity
    }

}

