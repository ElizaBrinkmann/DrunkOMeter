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

        ListView lv = findViewById(R.id.Drinks);
        lv.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ListOfDrinks.getInstance().getListOfDrinks())); //array of data);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("onClick", "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(DrinkList.this, AddDrinks.class);
                nextActivity.putExtra("activity_president_information", i);
                startActivity(nextActivity);



            }
        });
    }
}
