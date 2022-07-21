package com.company;
import  Pizza.CheecyPizzaNy;
import  Pizza.GarlicPizzaNy;
import Pizza.Pizza;

public class NewYorkPizzaStore extends PizzaStore {
    // the creator metod is overidden here
    @Override
    Pizza createPizza(String type) {
        if(type == "g"){
           return new GarlicPizzaNy();
        } else
            return new CheecyPizzaNy();

    }

    // other methods also can b overddien
}
