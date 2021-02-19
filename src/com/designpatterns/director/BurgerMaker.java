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
        builder.setBurgerType(BurgerType.Vegetarian);
        builder.setSize(Size.Medium);
        builder.setBun(Bun.Ciabatta);
        builder.setCheese(Cheese.Brie);
        builder.setPatty(Patty.Soybean);
        builder.setSalad(Salad.Tomato);
        builder.setSauce(Sauce.Hot);
    }

    public void buildMushroomBurger(Builder builder) {
        builder.setBurgerType(BurgerType.Mushroom);
        builder.setSize(Size.Small);
        builder.setBun(Bun.Kaiser);
        builder.setCheese(Cheese.Gouda);
        builder.setPatty(Patty.Portabello);
        builder.setSalad(Salad.Iceberg);
        builder.setSauce(Sauce.Tomato);
    }

    public void buildMeatBurger(Builder builder) {
        builder.setBurgerType(BurgerType.Meat);
        builder.setSize(Size.Large);
        builder.setBun(Bun.Onion);
        builder.setCheese(Cheese.Stilton);
        builder.setPatty(Patty.Lamb);
        builder.setSalad(Salad.Romaine);
        builder.setSauce(Sauce.Mustard);
    }
}
