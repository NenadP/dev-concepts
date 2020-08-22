package designpatterns.decorator;

class PepperoniTopping extends Topping {

    PepperoniTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", added Pepperoni";
    }

    public double getPrice() {
        return pizza.getPrice() + 0.30;
    }
}