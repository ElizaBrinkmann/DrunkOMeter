package com.example.drunk_o_meter;

import java.util.ArrayList;

class ScoreSingleton {
    private static final ScoreSingleton ourInstance = new ScoreSingleton();

    /**
     * use the singleton
     * @return a value from the singleton list
     */
    static ScoreSingleton getInstance() {
        return ourInstance;
    }


    private int score;

    private ScoreSingleton(){
        this.score = 0;
    }

    /**
     * Return the score stored in the singleton
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * Set the score back to 0
     */
    public void restartScore(){ this.score =0; }

    /**
     * Add a score to the score singleton
     * @param i amount that needs to be added to the score
     */
    public void addScore(int i){
        score = score + i;
    }


    @Override
    public String toString() {

        return ""+this.score;
    }

}
