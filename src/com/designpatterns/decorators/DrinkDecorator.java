package com.designpatterns.decorators;

public abstract class DrinkDecorator implements Drink {
    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    public void makeDrink() {
        drink.makeDrink();
    }
}
