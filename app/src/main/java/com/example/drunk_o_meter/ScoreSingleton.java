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
        this.score=0;

    }

    public int getScore() {
        return score;
    }

    public void addScore(int i){
        score = score + i;
    }
    @Override
    public String toString() {

        return ""+this.score;
    }
}
