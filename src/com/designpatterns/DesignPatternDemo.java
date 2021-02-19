package com.designpatterns;

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
}
