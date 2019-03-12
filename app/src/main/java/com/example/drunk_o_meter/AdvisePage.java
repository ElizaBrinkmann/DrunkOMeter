package com.example.drunk_o_meter;

public class AdvisePage {

    int score;

    /**
     * gets the score from the singleton
     */
    public AdvisePage(){
        this.score = ScoreSingleton.getInstance().getScore();
    }

    /**
     * gives the advise according to the final score
     * @return advice String
     */
    public String giveAdvise() {
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
