package com.example.drunk_o_meter;

public class AdvisePage {

    int score;

    public AdvisePage(){
        this.score = ScoreSingleton.getInstance().getScore();
    }
    public String giveAdvise() {
        if (this.score <= 3) {
            return ("You are not drunk!");
        } else if (this.score > 3 && this.score <6) {
            return ("Drink some water and eat something and you can drink more!");
        } else if (this.score >= 6) {
            //about 6 beers in 5 hours
            return ("You are drunk, go home!");
        }
        return ("You are drunk, go home!");
    }


}
