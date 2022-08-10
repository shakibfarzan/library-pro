package controllers;

import models.Category;
import utils.FileIO;

import java.util.Collection;
import java.util.HashMap;

public class CategoryController {
    private static final String PATH = "categories";
    private static CategoryController instance;
    private HashMap<String, Category> categories;
    private CategoryController() {
        categories = (HashMap<String, Category>) FileIO.getInstance().readObjFile(PATH);
        if (categories == null) categories = new HashMap<>();
    }

    public static CategoryController getInstance() {
        if (instance == null) instance = new CategoryController();
        return instance;
    }

    public Collection<Category> getCategories(){
        return categories.values();
    }

    public void addCategory(String name) throws Exception {
        if (categories.get(name) != null) throw new Exception("Category with name "+name+" exists!");
        if (name.isEmpty()) throw new Exception("Category cannot be blank!");
        Category category = new Category(name);
        categories.put(name, category);
    }

    public void removeCategoryByName(String name) throws Exception {
        Category category = categories.remove(name);
        if (category == null) throw new Exception("Category with name "+name+" was not found!");
    }

    public void updateCategory(String currentName, String newName) throws Exception {
        Category category = categories.remove(currentName);
        if (category == null) throw new Exception("Category with name "+currentName+" was not found!");
        category.setName(newName);
        categories.put(newName, category);
    }

    public Category getCategoryByName(String name) throws Exception {
        Category category = categories.get(name);
        if (category == null) throw new Exception("Category with name "+name+" was not found!");
        return category;
    }

    public void writeToFile() {
        FileIO.getInstance().writeObjToFile(PATH, categories);
    }
}
