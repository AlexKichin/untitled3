package com.company;

public class Bicycle extends Transport {
    Bicycle(String aType){
        super(aType);
    }
    @Override
    void beep(){
        System.out.println("Kruti pedali");
    }
}
