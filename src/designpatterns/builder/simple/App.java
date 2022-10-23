package designpatterns.builder.simple;

public class App {
    public static void main(String[] args) {
        User joe = new User.Builder()
                .withFirstName("Joe")
                .withLastName("Blogs")
                .build();

        joe.sayFullName();

        User mary = new User.Builder()
                .withFirstName("Mary")
                .withLastName("Howard")
                .build();

        mary.sayFullName();
    }
}
