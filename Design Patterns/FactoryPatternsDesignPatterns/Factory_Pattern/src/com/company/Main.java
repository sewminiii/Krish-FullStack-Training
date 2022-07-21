package com.company;
import com.company.CalifoniaPizzaStore;
import  com.company.NewYorkPizzaStore;

public class Main {

    public static void main(String[] args) {
        // creating the two creator classes
        CalifoniaPizzaStore caliStore = new CalifoniaPizzaStore();
        NewYorkPizzaStore nyStore = new NewYorkPizzaStore();

        // calling the order methods with the specified type
        caliStore.orderPizza("c");
        caliStore.orderPizza("g");

    }
}

