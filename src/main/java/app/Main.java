package app;

import controller.PizzaMaster;
import model.Pizza;

public class Main {
    public static void main(String[] args) {

        PizzaMaster master = new PizzaMaster();

        Pizza hawaiianPizza = master.makeHawaiianPizza();
        Pizza vegetablePizza = master.makeVegetablePizza();
        Pizza zombiePizza = master.makeZombiePizza();

        System.out.println("Hawaiian Pizza:");
        System.out.println(hawaiianPizza + "\n");

        System.out.println("Vegetable Pizza:");
        System.out.println(vegetablePizza + "\n");

        System.out.println("Zombie Pizza:");
        System.out.println(zombiePizza);
    }
}