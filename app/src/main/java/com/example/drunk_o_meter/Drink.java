package com.example.drunk_o_meter;

public class Drink {
    //will submit/supply the score singleton with the amount of drinks
    String drinkName;

    int amountOfGlasses;
    int scoreDrinks;



    public Drink(String drinkName){
        this.drinkName = drinkName;
        this.amountOfGlasses = 0;
        this.scoreDrinks = 0;
    }

    /**
     * Gets the name of the drink
     * @return
     */
    public String getDrinkName(){
        return this.drinkName;
    }

    /**
     * increases the amount of drinks had
     */
    public void addAmountOfGlasses(){ this.amountOfGlasses ++;}

    /**
     * Decreases the amount of drinks had but cannot decrease by negative number.
     */
    public void lessAmountOfGlasses(){
        if (this.amountOfGlasses > 0) {
            this.amountOfGlasses --;
        }
        else {
            this.amountOfGlasses = 0;
        }

    }

    /**
     * reset the amount of glasses had back to 0
     */
    public void resetAmountOfGlasses(){
        this.amountOfGlasses = 0;
    }

    /**
     * Shows how many glasses have been drunk
     * @return amount of glasses drunk
     */
    public int getAmountOfGlasses(){
        return this.amountOfGlasses;
    }

    /**
     * send the amount of glasses as a score to score singleton
     * @param amountOfGlasses
     */
    public void addDrinkInList(int amountOfGlasses){
            ScoreSingleton.getInstance().addScore(amountOfGlasses);
    }


    @Override
    public String toString() {

        return getDrinkName();
    }


}

