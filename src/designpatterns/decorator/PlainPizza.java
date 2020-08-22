package designpatterns.decorator;

class PlainPizza implements Pizza {

    public String getDescription() {
        return "Pizza";
    }

    public double getPrice() {
        return 3.00;
    }
}