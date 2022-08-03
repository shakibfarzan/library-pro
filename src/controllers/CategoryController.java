package controllers;

import models.Category;
import utils.FileIO;

import java.util.Collection;
import java.util.HashMap;

public class CategoryController {
    private static final String path = "categories";
    private static CategoryController instance;
    private HashMap<String, Category> categories;
    private CategoryController() {
        categories = (HashMap<String, Category>) FileIO.getInstance().readObjFile(path);
        if (categories == null) categories = new HashMap<>();
    }

    public static CategoryController getInstance() {
        if (instance == null) instance = new CategoryController();
        return instance;
    }

    public Collection<Category> getCategories(){
        return categories.values();
    }

    public boolean addCategory(String name) {
        if (categories.get(name) != null) return false;
        Category category = new Category(name);
        categories.put(name, category);
        return true;
    }

    public boolean removeCategoryByName(String name) {
        Category category = categories.remove(name);
        return category != null;
    }

    public boolean updateCategory(String currentName, String newName) {
        Category category = categories.remove(currentName);
        if (category == null) return false;
        category.setName(newName);
        categories.put(newName, category);
        return true;
    }

    public void writeToFile() {
        FileIO.getInstance().writeObjToFile(path, categories);
    }
}
