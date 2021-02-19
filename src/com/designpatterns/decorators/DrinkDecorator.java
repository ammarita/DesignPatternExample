package com.designpatterns.decorators;

public abstract class DrinkDecorator implements Drink {
    protected Drink drink;

    protected DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    public void makeDrink() {
        drink.makeDrink();
    }
}
