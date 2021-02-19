package com.designpatterns.facade;

public class BurgerGrill extends Equipment {
    protected int heatLevel;

    public BurgerGrill() {
        super("Burger Grill");
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
        System.out.println("Setting heat level of " + equipmentUnit + " to " + heatLevel + " level");
    }
}
