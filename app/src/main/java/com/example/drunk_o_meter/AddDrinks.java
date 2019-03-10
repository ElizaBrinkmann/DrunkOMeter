package com.example.drunk_o_meter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AddDrinks extends AppCompatActivity {

    private Drink drink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_drinks);

        int i = getIntent().getIntExtra("Chosen drink", 0);
        drink = ListOfDrinks.getInstance().getDrinks(i); // int to string
        TextView drinkName = findViewById(R.id.textViewDrink);
        drinkName.setText(drink.getDrinkName());
    }

    public void onPress (View view){
        drink.addAmountOfGlasses();
        TextView tv = findViewById(R.id.TextViewNumberOfDrinks);
        tv.setText(String.valueOf(drink.getAmountOfGlasses()));
    }

    public void onClick (View view){
        drink.lessAmountOfGlasses();
        TextView tv = findViewById(R.id.TextViewNumberOfDrinks);
        tv.setText(String.valueOf(drink.getAmountOfGlasses()));
    }


}
