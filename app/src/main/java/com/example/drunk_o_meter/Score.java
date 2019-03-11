package com.example.drunk_o_meter;

public class Score {
    private int score;

    public Score() {
        this.score = 0;
    }

    public void addToScore(int i) {
        // in add specify how many points this gives
        this.score += i;
    }

    public void addDrink(int score){
        // add which and how has been drunk
        // alcohol content and list in a separate class

    }

   public int getScore() {
        return this.score;
    }

    @Override
    public String toString() {

        return ""+this.score;
    }


}
