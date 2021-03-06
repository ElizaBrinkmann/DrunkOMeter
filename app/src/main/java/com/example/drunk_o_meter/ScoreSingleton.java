package com.example.drunk_o_meter;

import java.util.ArrayList;

class ScoreSingleton {
    private static final ScoreSingleton ourInstance = new ScoreSingleton();
    //private ArrayList<Score> listOfScore;

    static ScoreSingleton getInstance() {
        return ourInstance;
    }

    private int score;
    private ScoreSingleton(){
        this.score = 0;

    }

    public int getScore() {
        return score;
    }

    public void restartScore(){ this.score =0; }//reset the score to 0

    public void addScore(int i){//increases the score with certain given number
        score = score + i;
    }
    @Override
    public String toString() {

        return ""+this.score;
    }

}
