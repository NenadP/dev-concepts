package designpatterns.decorator;

class CheeseTopping extends Topping {

    CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", added Cheese";
    }

    public double getPrice() {
        return pizza.getPrice() + 0.50;
    }
}