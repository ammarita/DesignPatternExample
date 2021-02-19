package com.designpatterns.composite;

public abstract class InventoryComponent {
    public void add(InventoryComponent inventoryComponent){
        throw new UnsupportedOperationException("Cannot add item to inventory");
    }

    public String getName(){
        throw new UnsupportedOperationException("Cannot return name");
    }

    public int getCount(){
        throw new UnsupportedOperationException("Cannot return count");
    }

    public void print(){
        throw new UnsupportedOperationException("Cannot print");
    }
}
