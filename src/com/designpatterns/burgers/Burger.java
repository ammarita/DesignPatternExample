package com.designpatterns.burgers;

import com.designpatterns.ingredients.Bun;
import com.designpatterns.ingredients.BurgerType;
import com.designpatterns.ingredients.Cheese;
import com.designpatterns.ingredients.Patty;
import com.designpatterns.ingredients.Salad;
import com.designpatterns.ingredients.Sauce;
import com.designpatterns.ingredients.Size;

public class Burger {
    private final BurgerType burgerType;
    private final Size size;
    private final Bun bun;
    private final Patty patty;
    private final Salad salad;
    private final Sauce sauce;
    private final Cheese cheese;

    public Burger(BurgerType burgerType, Size size, Bun bun, Patty patty, Salad salad, Sauce sauce, Cheese cheese) {
        this.burgerType = burgerType;
        this.size = size;
        this.bun = bun;
        this.patty = patty;
        this.salad = salad;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    public BurgerType getBurgerType() {
        return burgerType;
    }

    public Size getSize() {
        return size;
    }

    public Bun getBun() {
        return bun;
    }

    public Patty getPatty() {
        return patty;
    }

    public Salad getSalad() {
        return salad;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Cheese getCheese() {
        return cheese;
    }
}
