package com.company;

public abstract class Transport {
    private String type;
    abstract void beep();
    Transport (String aType){
        type=aType;
    }
    String getType(){
        return type;
    }
}
