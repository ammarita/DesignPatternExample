package com.designpatterns.composite;

import java.util.ArrayList;

public class ItemCatalog extends InventoryComponent {
    private ArrayList<InventoryComponent> items = new ArrayList<>();
    private String name;

    public ItemCatalog(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void print(){
        for(InventoryComponent component : items)
        {
            component.print();
        }
    }
    @Override
    public void add(InventoryComponent inventoryComponent){
        items.add(inventoryComponent);
    }
    @Override
    public void remove(InventoryComponent inventoryComponent){
        items.remove(inventoryComponent);
    }
}
