package com.example.drunk_o_meter;

public class Drink extends Score {
    //will submit/supply the score class with the amount of drinks
    String drinkName;
    int drinkType;
    int amountOfGlasses;

    public Drink(String drinkName, int drinkType ){
        this.drinkName = "empty";
        this.drinkType = 0;
        this.amountOfGlasses = 0;
    }

    public String getDrinkName(){
        return this.drinkName;
    }
    public void setDrinkName(String drinkName){ this.drinkName = drinkName; }

    public void addAmountOfGlasses(){
        this.amountOfGlasses ++;
    }
    public void lessAmountOfGlasses(){ this.amountOfGlasses --;}

    public String getAmountOfGlasses(){
        return ""+ this.amountOfGlasses;
    }

    public void addDrinkInList(int typeDrink, int amountOfGlasses ){

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

    @Override
    public String toString() {

        return getDrinkName();
    }


}

