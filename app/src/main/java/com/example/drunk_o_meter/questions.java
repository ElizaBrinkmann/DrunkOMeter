package com.example.drunk_o_meter;

public class questions {
    private int counter = 0;

    public questions(){
        this.counter = 0;
    }

    /**
     * go through the questions
     */
    public void counting(){ this.counter ++;}

    /**
     * checks at what question it is
     * @return int counter, at what question it is
     */
    public int getCount(){
        return this.counter;
    }

    /**
     * Send the question in a string
     * @return question
     */
    public String toString(){
        if (this.counter == 0){
            return ("Are you drunk?");
        }
        else if (this.counter == 1){
            return ("Do you think dancing on a table is a fun idea?");
        }
        else if (this.counter == 2){
            return ("Do you feel like calling your ex or mom?");
        }
        else if (this.counter == 3){
            return ("Is everyone around you suddenly hot?");
        }
        else if (this.counter == 4){
            return ("Do you feel like singing karaoke?");
        }
        else
            return ("Next you will add your drinks." +
                " Click Yes to continue");

    }


}
