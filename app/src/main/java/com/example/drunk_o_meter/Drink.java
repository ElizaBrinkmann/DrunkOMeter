package com.example.drunk_o_meter;

public class Drink {
    //will submit/supply the score class with the amount of drinks
    String drinkName;
    int drinkType;
    int amountOfGlasses;
    int scoreDrinks;



    public Drink(String drinkName, int drinkType ){
        this.drinkName = drinkName;
        this.drinkType = drinkType;
        this.amountOfGlasses = 0;
        this.scoreDrinks = 0;
    }

    public String getDrinkName(){
        return this.drinkName;
    }
    public void setDrinkName(String drinkName){ this.drinkName = drinkName; } //can probably be deleted

    public int getDrinkType(){ return this.drinkType;}

    public void addAmountOfGlasses(){ this.amountOfGlasses ++;}

    public void lessAmountOfGlasses(){
        if (this.amountOfGlasses > 0) {
            this.amountOfGlasses --;
        }
        else {
            this.amountOfGlasses = 0;
        }

    }

    public void resetAmountOfGlasses(){
        this.amountOfGlasses = 0;
    }

    public int getAmountOfGlasses(){
        return this.amountOfGlasses;
    }

    public void addDrinkInList(int typeDrink, int amountOfGlasses ){

        // for instance 1 beer, 2 wine (1 glass is 25 cl), 3 whiskey etc
        if (typeDrink == 2){
            ScoreSingleton.getInstance().addScore(amountOfGlasses);
        }

        else if (typeDrink == 1){
            ScoreSingleton.getInstance().addScore(amountOfGlasses);
        }
        else if (typeDrink > 2){
            ScoreSingleton.getInstance().addScore((amountOfGlasses));
        }


    }

    @Override
    public String toString() {

        return getDrinkName();
    }


}

