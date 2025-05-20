package builder;

import model.Pizza;

import java.util.List;

public class HawaiianPizzaBuilder implements PizzaBuilder{
    private String size = "Medium";
    private String dough = "Slim";
    private List<String> toppings = List.of("Pineapple" , "Cheese" , "Ham" , "Tomato sauce");

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
