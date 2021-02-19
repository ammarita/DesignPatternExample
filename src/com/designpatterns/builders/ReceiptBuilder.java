package com.designpatterns.builders;

import com.designpatterns.burgers.Receipt;
import com.designpatterns.ingredients.Bun;
import com.designpatterns.ingredients.BurgerType;
import com.designpatterns.ingredients.Cheese;
import com.designpatterns.ingredients.Patty;
import com.designpatterns.ingredients.Salad;
import com.designpatterns.ingredients.Sauce;
import com.designpatterns.ingredients.Size;

public class ReceiptBuilder implements Builder {
    private BurgerType burgerType;
    private Size size;
    private Bun bun;
    private Patty patty;
    private Salad salad;
    private Sauce sauce;
    private Cheese cheese;

    @Override
    public void setBurgerType(BurgerType burgerType) {
        this.burgerType = burgerType;
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setBun(Bun bun) {
        this.bun = bun;
    }

    @Override
    public void setPatty(Patty patty) {
        this.patty = patty;
    }

    @Override
    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    @Override
    public void setSalad(Salad salad) {
        this.salad = salad;
    }

    @Override
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Receipt buildReceipt() {
        return new Receipt(burgerType, size, bun, patty, salad, sauce, cheese);
    }
}
