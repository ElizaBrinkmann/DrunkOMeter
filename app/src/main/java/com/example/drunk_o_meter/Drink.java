package com.example.drunk_o_meter;

public class Drink extends Score {
    //will submit/supply the score class with the amount of drinks


    public void addDrinkInList(int typeDrink, int amountOfGlasses ){
        // We made a list but it's on chavilahs design page
        // for instance 1 beer, 2 wine (1 glass is 25 cl), 3 whiskey etc
        if (typeDrink == 2){
            addDrink((amountOfGlasses * 2));
        }

        else if (typeDrink == 1){
            addDrink(amountOfGlasses);
        }
        else if (typeDrink > 2){
            addDrink((amountOfGlasses*3));
        }

    }


}
