package com.example.drunk_o_meter;

public class questions {
    private int counter = 0;

    public questions(){
        this.counter = 0;

    }

    public void counting(){

        this.counter ++;
    }

    public String toString(){
        if (this.counter == 1){
            return ("Do you think dancing on a table is a fun idea?");
        }
        else if (this.counter == 2){
            return ("Do you feel like calling your ex or mom?");
        }
        else if (this.counter == 3){
            return ("Is everyone around you suddenly hot?");
        }
        else if (this.counter == 4){
            return ("Do you feel like singing karaoke");
        }

        return ("Something went super wrong");
    }


}
