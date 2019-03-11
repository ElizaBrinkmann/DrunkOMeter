package com.example.drunk_o_meter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Instruction extends AppCompatActivity {

    Button but_start = (Button) findViewById(R.id.button_start);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);



        but_start.setOnClickListener(new View.OnClickListener){

            @Override
            public void Open(View v) {
                // By clicking this, you will open the button game page

                startActivity(new Intent(Instruction.this, ButtonGame.class));
            }

        });


    }

}