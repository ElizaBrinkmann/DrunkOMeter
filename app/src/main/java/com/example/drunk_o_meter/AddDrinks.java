package com.example.drunk_o_meter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AddDrinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_drinks);

        int i = getIntent().getIntExtra("activity_president_information", 0);


        ((TextView)findViewById(R.id.textViewDrink)).setText(ListOfDrinks.getInstance().getDrinks(i).getDrinkName());

    }

    public void onPress(View view){
        Drink.addAmountOfGlasses();
        TextView tv = findViewById(R.id.TextViewNumberOfDrinks);
        tv.setText(Drink.getAmountOfGlasses());
    }
}
