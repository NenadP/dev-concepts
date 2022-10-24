package designpatterns.Singleton;

// Thread safe singleton implementation (see Joshua Bloch Effective Java)
// See https://stackoverflow.com/questions/26285520/implementing-singleton-with-an-enum-in-java
public enum EnumSingleton {
    INSTANCE;

    public void doWork() {
        System.out.println("Doing enum singleton work");
    }
}
