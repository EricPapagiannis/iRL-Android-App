package com.rlsolutions.irl;

public class Drug {
    private String dName;
    private float freqHrs;
    private String instruction;

    public Drug(String dName, float freqHrs, String instruction){
        this.dName = dName;
        this.freqHrs = freqHrs;
        this.instruction = instruction;
    }

    public String getName(){
        return dName;
    }

    public void setName(String name){
        this.dName = name;
    }

    public float getFreq(){
        return freqHrs;
    }

    public void setFreq(float freq){
        this.freqHrs = freq;
    }

    public String getInstruct(){
        return instruction;
    }

    public void setInstruct(String instruct){
        this.instruction = instruct;
    }
}
