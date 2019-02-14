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
        return ("Wrong");
    }


}
