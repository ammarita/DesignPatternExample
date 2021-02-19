package com.designpatterns.decorators;

public class DrinkWithMilkDecorator extends DrinkDecorator {
    public DrinkWithMilkDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void makeDrink() {
        drink.makeDrink();
        addMilk(drink);
    }

    private void addMilk(Drink drink) {
        System.out.println("Adding milk!");
    }
}
