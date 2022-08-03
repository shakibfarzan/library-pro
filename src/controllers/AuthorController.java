package controllers;

import models.Author;
import utils.FileIO;

import java.util.Collection;
import java.util.HashMap;

public class AuthorController {
    private final static String path = "authors";
    private static AuthorController instance;
    private HashMap<Integer, Author> authors;
    private AuthorController() {
        authors = (HashMap<Integer, Author>) FileIO.getInstance().readObjFile(path);
        if (authors == null) authors = new HashMap<>();
    }

    public static AuthorController getInstance(){
        if (instance == null) instance = new AuthorController();
        return instance;
    }

    public Collection<Author> getAuthors() {
        return authors.values();
    }

    public boolean addAuthor(String firstName, String lastName) {
        Author author = new Author(firstName, lastName);
        authors.put(author.getId(), author);
        return true;
    }

    public boolean removeAuthorById(int id) {
        return authors.remove(id) != null;
    }

    public boolean updateAuthorName(String firstName, String lastName, int id){
        Author author = authors.get(id);
        if (author == null) return false;
        author.setFirstName(firstName);
        author.setLastName(lastName);
        authors.put(id, author);
        return true;
    }

    public void writeToFile() {
        FileIO.getInstance().writeObjToFile(path, authors);
    }
}
