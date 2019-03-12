package com.example.drunk_o_meter;

public class AdvisePage {

    int score;

    public AdvisePage(){
        this.score = ScoreSingleton.getInstance().getScore();//gets the score from the singleton
    }
    public String giveAdvise() {//gives the advise according to the final score
        if (this.score <= 4) {
            return ("You are not drunk!");
        } else if (this.score > 4 && this.score <=7) {
            return ("Drink some water and eat something and you can drink more!");
        } else if (this.score > 7) {
            //about 6 beers in 5 hours
            return ("You are drunk, go home!");
        }
        return ("You are drunk, go home!");
    }


}
