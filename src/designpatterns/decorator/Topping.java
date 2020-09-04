package designpatterns.decorator;

abstract class Topping implements Pizza {

    Pizza pizza;

    Topping(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract public String getDescription();

    abstract public double getPrice();
}