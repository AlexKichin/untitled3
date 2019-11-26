package com.company;

public class Car extends Transport {
    Car(String aType){
        super(aType);
    }
    @Override
    void beep(){
        System.out.println("Vroom Vroom");
    }
}
