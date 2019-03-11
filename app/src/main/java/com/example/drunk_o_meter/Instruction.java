package com.example.drunk_o_meter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Instruction extends AppCompatActivity {

//this is the instruction page, after reading the few lines of instructions, user can press the button below
    //to get to the next page, start the button game
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

    }

    public void onClickInstruction(View view){
        startActivity(new Intent(Instruction.this, ButtonGame.class));
    }

}