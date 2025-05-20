package builder;

import model.Pizza;

import java.util.List;

public class ZombiePizzaBuilder implements PizzaBuilder{
    private String size = "Extra Large";
    private String dough = "Thick";
    private List<String> toppings = List.of("Blood Sauce" , "Rotten Cheese" , "Melted Brains" , "Sliced Eyes");

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
