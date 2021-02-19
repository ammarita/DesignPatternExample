package com.designpatterns.decorators;

public class DrinkWithMilkDecorator extends DrinkDecorator {
    public DrinkWithMilkDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void makeDrink() {
        drink.makeDrink();
        addMilk();
    }

    private void addMilk() {
        System.out.println("Adding milk!");
    }
}
