package models;

import utils.Generator;

import java.io.Serializable;

public class Category implements Serializable {
    private int id;
    private String name;

    public Category(String name) {
        this.name = name;
        this.id = Generator.idGenerator(name);
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
