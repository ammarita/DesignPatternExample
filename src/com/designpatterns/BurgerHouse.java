package com.designpatterns;

import com.designpatterns.builders.BurgerBuilder;
import com.designpatterns.builders.ReceiptBuilder;
import com.designpatterns.burgers.Burger;
import com.designpatterns.burgers.Receipt;
import com.designpatterns.decorators.Coffee;
import com.designpatterns.decorators.Drink;
import com.designpatterns.decorators.DrinkWithMilkDecorator;
import com.designpatterns.decorators.Tea;
import com.designpatterns.director.BurgerMaker;
import com.designpatterns.state.State;

public class BurgerHouse {
    private State state = State.READY;
    private String command;

    public BurgerHouse() {}

    public State getState() {
        return this.state;
    }

    public void openBurgerHouse() {
        System.out.println("Opening Burger House");
        waitOrder();
    }

    private void waitOrder() {
        System.out.println("We are ready to take your order");
        this.state = State.READY;
    }

    public void checkState(String command) {
        this.command = command;
        if (getState() == State.READY) {
            switch (command) {
                case "burger":
                    makeBurger();
                    break;
                case "drink":
                    makeDrink();
                    break;
                case "close":
                    closeBurgerHouse();
                    break;
            }
        } else if (getState() == State.MAKE_BURGER) {
            switch (command) {
                case"veg":
                case "meat":
                case "mushroom":
                    buildBurger(command);
                    break;
            }

        } else if (getState() == State.MAKE_DRINK) {
            switch (command) {
                case "tea":
                case "coffee":
                case "white coffee":
                case "white tea":
                    brewDrink(command);
                    break;
            }
        }
    }

    private void brewDrink(String drinkType) {
        Drink coffee = new Coffee();
        Drink tea = new Tea();
        Drink teaWithMilk = new DrinkWithMilkDecorator(new Tea());
        Drink coffeeWithMilk = new DrinkWithMilkDecorator(new Coffee());

        switch (drinkType) {
            case "tea":
                tea.makeDrink();
                break;
            case "coffee":
                coffee.makeDrink();
                break;
            case "white tea":
                teaWithMilk.makeDrink();
                break;
            case "white coffee":
                coffeeWithMilk.makeDrink();
                break;
        }

        this.state = State.READY;
    }

    private void closeBurgerHouse() {
        System.out.println("Closing Burger House");
        this.state = State.CLOSE;
    }

    private void makeDrink() {
        System.out.println("Choose Drink");
        this.state = State.MAKE_DRINK;
    }

    private void makeBurger() {
        System.out.println("Choose Burger");
        this.state = State.MAKE_BURGER;
    }

    private void buildBurger(String burgerType) {
        BurgerMaker burgerMaker = new BurgerMaker();
        BurgerBuilder burgerBuilder = new BurgerBuilder();
        ReceiptBuilder receiptBuilder = new ReceiptBuilder();

        switch (burgerType) {
            case "veg":
                burgerMaker.buildVegetarianBurger(burgerBuilder);
                burgerMaker.buildVegetarianBurger(receiptBuilder);
                break;
            case "meat":
                burgerMaker.buildMeatBurger(burgerBuilder);
                burgerMaker.buildMeatBurger(receiptBuilder);
                break;
            case "mushroom":
                burgerMaker.buildMushroomBurger(burgerBuilder);
                burgerMaker.buildMushroomBurger(receiptBuilder);
                break;
        }

        Burger burger = burgerBuilder.buildBurger();
        Receipt receipt = receiptBuilder.buildReceipt();

        System.out.println("One burger made: " + burger.getBurgerType() + "\n" +
                "Order ready: " + receipt.printReceipt());

        this.state = State.READY;
    }
}
