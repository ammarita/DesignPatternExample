package com.designpatterns.facade;

public class BurgerHouseFacade {
    CoffeeMachine coffeeMachine;
    BurgerGrill burgerGrill;
    AlarmSystem alarmSystem;
    Lights signboardLights;
    Lights indoorLights;
    CashRegister cashRegister;
    TVSet tv;

    public BurgerHouseFacade() {
        super();
        coffeeMachine = new CoffeeMachine();
        burgerGrill = new BurgerGrill();
        alarmSystem = new AlarmSystem();
        signboardLights = new SighBoardLights();
        indoorLights = new IndoorLights();
        cashRegister = new CashRegister();
        tv = new TVSet();
    }

    public void prepareBurgerHouseForDay() {
        alarmSystem.turnOff();
        signboardLights.turnOn();
        indoorLights.turnOn();
        coffeeMachine.turnOn();
        burgerGrill.turnOn();
        burgerGrill.setHeatLevel(7);
        tv.turnOn();
        tv.setChannel("BBC", 12);
        cashRegister.turnOn();
    }

    public void closeBurgerHouseForNight() {
        coffeeMachine.turnOff();
        burgerGrill.turnOff();
        signboardLights.turnOff();
        indoorLights.turnOff();
        cashRegister.takeDailyIncomeOut(214.63);
        cashRegister.turnOff();
        tv.turnOff();
        alarmSystem.turnOn();
    }
}
