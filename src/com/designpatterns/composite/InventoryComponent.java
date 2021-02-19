package com.designpatterns.composite;

public abstract class InventoryComponent {
    public void add(InventoryComponent inventoryComponent){
        throw new UnsupportedOperationException("Cannot add item to inventory");
    }
    public void remove(InventoryComponent inventoryComponent){
        throw new UnsupportedOperationException("Cannot remove item from inventory");
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
