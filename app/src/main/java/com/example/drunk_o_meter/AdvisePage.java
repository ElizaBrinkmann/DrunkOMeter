package com.example.drunk_o_meter;

public class AdvisePage {

    int score;

    public AdvisePage(){
        this.score = ScoreSingleton.getInstance().getScore();//gets the score from the singleton
    }
    public String giveAdvise() {
        if (this.score <= 6) {
            return ("You are not drunk!");
        } else if (this.score > 6 && this.score <9) {
            return ("Drink some water and eat something and you can drink more!");
        } else if (this.score >= 9) {
            //about 6 beers in 5 hours
            return ("You are drunk, go home!");
        }
        return ("You are drunk, go home!");
    }


}
