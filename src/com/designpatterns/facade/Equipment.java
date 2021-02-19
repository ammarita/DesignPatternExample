package com.designpatterns.facade;

public abstract class Equipment {
    protected String equipmentUnit;
    private boolean equipmentStatus;

    protected Equipment(String equipmentUnit) {
        super();
        this.equipmentUnit = equipmentUnit;
    }

    public void turnOn() {
        if (equipmentStatus) {
            System.out.println(equipmentUnit + " is turned on");
        } else {
            equipmentStatus = true;
            System.out.println("Turning on " + equipmentUnit);
        }
    }

    public void turnOff() {
        if (!equipmentStatus) {
            System.out.println(equipmentUnit + " is turned off");
        } else {
            equipmentStatus = false;
            System.out.println("Turning off " + equipmentUnit);
        }
    }
}
