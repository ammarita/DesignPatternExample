package com.designpatterns.composite;

public class Item extends InventoryComponent {
    private String name;
    private int count;

    public Item (String name, int count){
        this.name = name;
        this.count = count;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public void print() {
        System.out.println("Item: " + name + ", unit count: " + count);
    }
}
