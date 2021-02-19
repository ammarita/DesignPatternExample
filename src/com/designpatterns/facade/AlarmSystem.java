package com.designpatterns.facade;

public class AlarmSystem extends Equipment {

    public AlarmSystem() {
        super("Alarm System");
    }

    @Override
    public void turnOn() {
        System.out.println("Entering keycode to set " + equipmentUnit + " on");
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Entering keycode to set " + equipmentUnit + " off");
        super.turnOff();
    }
}
