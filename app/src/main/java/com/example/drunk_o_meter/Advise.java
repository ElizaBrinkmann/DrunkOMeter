package com.example.drunk_o_meter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class Advise extends AppCompatActivity {
    AdvisePage advicePage = new AdvisePage();


    // SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy HH:mm", Locale.getDefault());

    @Override
    //placing the advice in adviceView
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advise);

        TextView tv = findViewById(R.id.textView4);//places the advice in adviceView
        tv.setText(advicePage.giveAdvise());//gives the advice according to the score

        TextView sv = findViewById(R.id.textViewScore);
        sv.setText(String.valueOf(ScoreSingleton.getInstance().getScore()));

        TinyDB tinydb = new TinyDB(this);
        ArrayList<String> scores = tinydb.getListString("key");

        scores.add("Score: " + ScoreSingleton.getInstance().toString());

        tinydb.putListString("key", scores);

        Spinner spinner = findViewById(R.id.simple_spinner_dropdown_item);
        //new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, tinydb.getListString("key"));
        spinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, tinydb.getListString("key")));

    }

//when pressed starts the test again
    public void onClick (View view) {

        Intent nextActivity = new Intent(Advise.this, MainActivity.class);//moves from Advise page to MainActivity
        ScoreSingleton.getInstance().restartScore();
        startActivity(nextActivity);//starting new activity
    }

}

