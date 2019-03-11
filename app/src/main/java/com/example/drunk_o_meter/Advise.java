package com.example.drunk_o_meter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Advise extends AppCompatActivity {
    AdvisePage advicePage = new AdvisePage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advise);

        TextView tv = findViewById(R.id.adviseView);
        tv.setText(advicePage.giveAdvise());
    }

    public void onClick (View view) {
        Intent nextActivity = new Intent(Advise.this, MainActivity.class);
        startActivity(nextActivity);
    }

}

