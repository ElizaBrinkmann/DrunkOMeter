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

   public int getScore() {
        return this.score;
    }
}