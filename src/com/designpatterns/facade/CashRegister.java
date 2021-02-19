package com.designpatterns.facade;

public class CashRegister extends Equipment {
    protected double income;

    public CashRegister() {
        super("Cash Register");
    }

    public void takeDailyIncomeOut(double income) {
        this.income = income;
        System.out.println("Taking out " + income + " EUR from " + equipmentUnit);
    }
}
