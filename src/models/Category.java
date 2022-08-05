package models;

import utils.Generator;

import java.io.Serializable;
import java.util.Objects;

import static utils.Generator.idGenerator;

public class Category implements Serializable {
    private final int id;
    private String name;

    public Category(String name) {
        this.name = name;
        this.id = idGenerator(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
