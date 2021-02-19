package com.designpatterns.burgers;

import com.designpatterns.ingredients.Bun;
import com.designpatterns.ingredients.BurgerType;
import com.designpatterns.ingredients.Cheese;
import com.designpatterns.ingredients.Patty;
import com.designpatterns.ingredients.Salad;
import com.designpatterns.ingredients.Sauce;
import com.designpatterns.ingredients.Size;

public class Receipt {
    private final BurgerType burgerType;
    private final Size size;
    private final Bun bun;
    private final Patty patty;
    private final Salad salad;
    private final Sauce sauce;
    private final Cheese cheese;

    public Receipt(BurgerType burgerType, Size size, Bun bun, Patty patty, Salad salad, Sauce sauce, Cheese cheese) {
        this.burgerType = burgerType;
        this.size = size;
        this.bun = bun;
        this.patty = patty;
        this.salad = salad;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    public String printReceipt() {
        return "Order: " + burgerType + " burger in " + size + " size\n" +
                "Bun: " + bun + "\n" +
                "Patty: " + patty + "\n" +
                "Cheese: " + cheese + "\n" +
                "Salad: " + salad + "\n" +
                "Sauce: " + sauce;
    }
}
