package com.designpatterns;

import com.designpatterns.composite.InventoryComponent;
import com.designpatterns.composite.Item;
import com.designpatterns.composite.ItemCatalog;
import com.designpatterns.state.BurgerHouse;
import com.designpatterns.state.State;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DesignPatternDemo {
    private static final List<String> generalCommands = Arrays.asList("burger", "drink", "close");
    private static final List<String> burgerCommands = Arrays.asList("veg", "meat", "mushroom");
    private static final List<String> drinkCommands = Arrays.asList("tea", "coffee", "white coffee", "white tea");
    private static BurgerHouse burgerHouse;

    public static void main(String[] args) {
        burgerHouse = new BurgerHouse();
        burgerHouse.openBurgerHouse();

        while (burgerHouse.getState() != State.CLOSE) {
            burgerHouse.checkState(getRandomCommand());
        }

        checkInventory();
    }

    private static String getRandomCommand() {
        List<String> commands = getCommandList();
        Random random = new Random();
        return commands.get(random.nextInt(commands.size()));
    }

    private static List<String> getCommandList() {
        if (burgerHouse.getState() == State.MAKE_BURGER) {
            return burgerCommands;
        } else if (burgerHouse.getState() == State.MAKE_DRINK) {
            return drinkCommands;
        }
        return generalCommands;
    }

    private static void checkInventory() {
        InventoryComponent burgerCatalog = new ItemCatalog("Burgers");
        InventoryComponent bun = new Item("Box of burger buns", 20);
        InventoryComponent patty = new Item("Package of patties", 32);
        InventoryComponent cheese = new Item("Package of cheese", 15);
        InventoryComponent salad = new Item("Pack of salad", 10);
        InventoryComponent sauce = new Item("Bottle of sauce", 21);
        burgerCatalog.add(bun);
        burgerCatalog.add(patty);
        burgerCatalog.add(cheese);
        burgerCatalog.add(salad);
        burgerCatalog.add(sauce);

        InventoryComponent drinkCatalog = new ItemCatalog("Drinks");
        InventoryComponent coffee = new Item("Box of grounded coffee", 8);
        InventoryComponent tea = new Item("Package of tea", 4);
        InventoryComponent milk = new Item("Bottle of milk", 16);
        InventoryComponent sugar = new Item("Package of sugar", 11);
        drinkCatalog.add(coffee);
        drinkCatalog.add(tea);
        drinkCatalog.add(milk);
        drinkCatalog.add(sugar);

        InventoryComponent mainCatalog = new ItemCatalog("Burger House Item Catalog");
        mainCatalog.add(burgerCatalog);
        mainCatalog.add(drinkCatalog);
        mainCatalog.print();
    }
}
