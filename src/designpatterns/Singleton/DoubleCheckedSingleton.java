package designpatterns.Singleton;

// Considered an antipattern, long read here: https://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
// Also see https://github.com/iluwatar/java-design-patterns/blob/master/singleton/src/main/java/com/iluwatar/singleton/ThreadSafeDoubleCheckLocking.java for commented example
public class DoubleCheckedSingleton {

    private volatile static DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {}

    public void doWork() {
        System.out.println("Doing double checked singleton work");
    }

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
