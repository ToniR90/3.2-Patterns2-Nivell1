package builder;

import model.Pizza;

import java.util.List;

public class VegetablePizzaBuilder implements PizzaBuilder{
    private String size = "Large";
    private String dough = "Normal";
    private List<String> toppings = List.of("Tomato sauce" , "Cheese" , "Onion rings" , "Mushrooms" , "Olives");

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setToppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(size , dough , toppings);
    }
}
