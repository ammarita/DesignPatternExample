package com.designpatterns.decorators;

public class Coffee implements Drink {
    @Override
    public void makeDrink() {
        System.out.println("Making coffee");
    }
}
