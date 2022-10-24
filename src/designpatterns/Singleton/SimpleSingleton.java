package designpatterns.Singleton;

// Suitable for single threaded use
public class SimpleSingleton {

    // thread safety could be achieved if instance is obtained here:
    // Approach 1: private static SimpleSingleton simpleSingleton = new SimpleSingleton();
    // Downside: eagerly creates an instance even if it's not ever used
    private static SimpleSingleton instance;

    private SimpleSingleton() {}

    public void doWork() {
        System.out.println("Doing singleton work");
    }

    // Approach 2: synchronized public static SimpleSingleton getInstance()
    // Downside: using expensive synchronize
    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
