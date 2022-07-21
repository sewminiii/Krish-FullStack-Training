package com.company;
import  Pizza.CheezyPizzaCali;
import  Pizza.GarlicPizzaCali;
import Pizza.Pizza;


public class CalifoniaPizzaStore extends PizzaStore {
    @Override
     Pizza createPizza(String type) {
        if(type == "g"){
            return new GarlicPizzaCali();
        } else {
            return new CheezyPizzaCali();
        }

    }
}
