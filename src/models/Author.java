package models;

import static utils.Generator.idGenerator;

public class Author {
    private final int id;
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        id = idGenerator(firstName+lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
