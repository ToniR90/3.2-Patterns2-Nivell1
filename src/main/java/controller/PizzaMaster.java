package controller;

import builder.HawaiianPizzaBuilder;
import builder.VegetablePizzaBuilder;
import builder.ZombiePizzaBuilder;
import model.Pizza;

public class PizzaMaster {
    public Pizza makeHawaiianPizza() {
        return new HawaiianPizzaBuilder().build();
    }

    public Pizza makeVegetablePizza() {
        return new VegetablePizzaBuilder().build();
    }

    public Pizza makeZombiePizza() {
        return new ZombiePizzaBuilder().build();
    }
}