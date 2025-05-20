# 3.2.1: Patterns2 - 🍕 Pizza Order System - Builder Pattern (Java + Gradle)

This project demonstrates the use of the **Builder design pattern** to create a flexible and modular pizza ordering system in Java using Gradle.

## 📦 Project Structure

- `Pizza`: The final product class, containing size, dough, and toppings.
- `PizzaBuilder`: Interface that defines the steps to build a pizza.
- `HawaiianPizzaBuilder`, `VegetablePizzaBuilder`, `ZombiePizzaBuilder`: Concrete builders that implement the steps to build specific types of pizzas.
- `PizzaMaster`: Acts as the director. It receives a `PizzaBuilder` and instructs how to build a pizza.
- `Main`: Demonstrates how to use the builders and the director to create different pizzas.

## 🛠️ Technologies

- Java 17
- Gradle

## 🧱 Design Pattern: Builder

The **Builder pattern** is used here to handle the construction of complex objects (pizzas) step by step, especially when not all attributes are required or when the combinations vary.

### Why Builder?
- Avoids constructors with too many parameters.
- Provides readable and maintainable object construction.
- Supports different configurations easily.

## 🚀 How to Run

Clone the repository: https://github.com/ToniR90/3.2-Patterns2-Nivell1.git
 
