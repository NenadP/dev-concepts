package designpatterns.builder.simple;

public class User {
    private final String firstName;
    private final String lastName;

    public User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public void sayFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public static class Builder {
        private String firstName;
        private String lastName;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
