package designpatterns.decorator;

class Main {
    public static void main(String[] args) {
        Pizza pizza = new PepperoniTopping(new CheeseTopping(new PlainPizza()));
        
        System.out.println("*****************************************************");
        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Price: " + pizza.getPrice());
        System.out.println("*****************************************************");
        }
}
