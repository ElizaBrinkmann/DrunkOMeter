package com.example.drunk_o_meter;

public class questions {
    private int counter;

    public questions(){
        public this.counter = 0;

    }

    public void counting(){
        this.counter ++;
    }

    @Override
    public String toString(){
        if (this.counter == 0){
            return ("Do you think dancing on a table is a fun idea?")
        }

    }


}
