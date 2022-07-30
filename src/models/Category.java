package models;

import utils.Generator;

import java.io.Serializable;
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
}
