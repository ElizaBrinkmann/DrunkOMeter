package com.example.drunk_o_meter;

public class Score {
    private int score;

    public Score() {
        this.score = 0;
    }

    public void addToScore(int i) {
        this.score += i;
    }

   public int getScore() {
        return this.score;
    }
}
