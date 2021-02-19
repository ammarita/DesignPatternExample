package com.designpatterns.decorators;

public class Tea implements Drink {
    @Override
    public void makeDrink() {
        System.out.println("Making tea");
    }
}
