package com.example.drunk_o_meter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_list);

        // show the different drinks in the listview
        ListView lv = findViewById(R.id.Drinks);
        lv.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ListOfDrinks.getInstance().getListOfDrinks())); //array of data);

        // when a drink is clicked go to adding drinks page and with extra which drink has been selected
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("onClick", "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(view.getContext(), AddDrinks.class);
                nextActivity.putExtra("Chosen drink", i);
                startActivity(nextActivity);
            }
        });
    }

    // When next is pressed move to the next activity the buttongame
    public void onSlap(View view){
        Intent nextActivity = new Intent(DrinkList.this, Instruction.class);
        startActivity(nextActivity);
    }
}
