package com.example.drunk_o_meter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AddDrinks extends AppCompatActivity {

    //calling upon the singleton
    private Drink drink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_drinks);

        //get selected drink from the listview and setting it into a textview
        int i = getIntent().getIntExtra("Chosen drink", 0);
        drink = ListOfDrinks.getInstance().getDrinks(i); // int to string
        TextView drinkName = findViewById(R.id.textViewDrink);
        drinkName.setText(drink.getDrinkName());
        //TextView tv = findViewById(R.id.textViewScore);
        //tv.setText(String.valueOf(ScoreSingleton.getInstance().getScore()));

    }

    //add a glass with the add button and update the textview
    public void onPress (View view){
        drink.addAmountOfGlasses();
        TextView tv = findViewById(R.id.TextViewNumberOfDrinks);
        tv.setText(String.valueOf(drink.getAmountOfGlasses()));
    }

    //one less glass and set it to the textview
    public void onClick (View view){
        drink.lessAmountOfGlasses();
        TextView tv = findViewById(R.id.TextViewNumberOfDrinks);
        tv.setText(String.valueOf(drink.getAmountOfGlasses()));
    }

    // send score the score to the singleton and then reset the amount so people understand it has  been 'sent', update textview
    public void onHit(View view){
        drink.addDrinkInList(drink.getAmountOfGlasses());
        drink.resetAmountOfGlasses();
        TextView tv = findViewById(R.id.TextViewNumberOfDrinks);
        tv.setText(String.valueOf(drink.getAmountOfGlasses()));
    }

    //go back to the listView
    public void onPunch(View view){
        Intent nextActivity = new Intent(AddDrinks.this, DrinkList.class);
        startActivity(nextActivity);
    }
}
