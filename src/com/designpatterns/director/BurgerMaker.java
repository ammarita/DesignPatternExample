package com.designpatterns.director;

import com.designpatterns.builders.Builder;
import com.designpatterns.ingredients.Bun;
import com.designpatterns.ingredients.BurgerType;
import com.designpatterns.ingredients.Cheese;
import com.designpatterns.ingredients.Patty;
import com.designpatterns.ingredients.Salad;
import com.designpatterns.ingredients.Sauce;
import com.designpatterns.ingredients.Size;

public class BurgerMaker {
    public void buildVegetarianBurger(Builder builder) {
        builder.setBurgerType(BurgerType.VEGETARIAN);
        builder.setSize(Size.MEDIUM);
        builder.setBun(Bun.CIABBATA);
        builder.setCheese(Cheese.BRIE);
        builder.setPatty(Patty.SOYBEAN);
        builder.setSalad(Salad.TOMATO);
        builder.setSauce(Sauce.HOT);
    }

    public void buildMushroomBurger(Builder builder) {
        builder.setBurgerType(BurgerType.MUSHROOM);
        builder.setSize(Size.SMALL);
        builder.setBun(Bun.KAISER);
        builder.setCheese(Cheese.GOUDA);
        builder.setPatty(Patty.PORTABELLO);
        builder.setSalad(Salad.ICEBERG);
        builder.setSauce(Sauce.TOMATO);
    }

    public void buildMeatBurger(Builder builder) {
        builder.setBurgerType(BurgerType.MEAT);
        builder.setSize(Size.LARGE);
        builder.setBun(Bun.PRETZEL);
        builder.setCheese(Cheese.STILTON);
        builder.setPatty(Patty.LAMB);
        builder.setSalad(Salad.ROMAINE);
        builder.setSauce(Sauce.MUSTARD);
    }
}
