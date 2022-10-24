package designpatterns.Singleton;

public class App {
    public static void main(String[] args) {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        simpleSingleton.doWork();

        DoubleCheckedSingleton doubleCheckedSingleton = DoubleCheckedSingleton.getInstance();
        doubleCheckedSingleton.doWork();

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.doWork();
    }
}
