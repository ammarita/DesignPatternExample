package com.designpatterns.builders;

import com.designpatterns.ingredients.Bun;
import com.designpatterns.ingredients.BurgerType;
import com.designpatterns.ingredients.Cheese;
import com.designpatterns.ingredients.Patty;
import com.designpatterns.ingredients.Salad;
import com.designpatterns.ingredients.Sauce;
import com.designpatterns.ingredients.Size;

public interface Builder {
    void setBurgerType(BurgerType burgerType);
    void setSize(Size size);
    void setBun(Bun bun);
    void setPatty(Patty patty);
    void setCheese(Cheese cheese);
    void setSalad(Salad salad);
    void setSauce(Sauce sauce);
}
