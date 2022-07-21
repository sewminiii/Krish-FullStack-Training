package com.company;
import Pizza.Pizza;

public abstract class PizzaStore {
    Pizza piz;
    public Pizza orderPizza(String type){
        piz = createPizza(type);

        // concrete methods can be overidden in the extending creator classes
        piz.bake();
        piz.cutPizza();
        piz.pack();
        piz.deliver();

        return  piz;
    }

    abstract Pizza createPizza(String type); // the abstract method is declred in the creator class

}
