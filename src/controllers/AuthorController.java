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

    public void addAuthor(String firstName, String lastName) {
        Author author = new Author(firstName, lastName);
        authors.put(author.getId(), author);
    }

    public void removeAuthorById(int id) throws Exception {
        Author author = authors.remove(id);
        if (author == null) throw new Exception("Author with id "+id+" was not found!");
    }

    public void updateAuthorName(String firstName, String lastName, int id) throws Exception {
        Author author = authors.get(id);
        if (author == null) throw new Exception("Author with id "+id+" was not found!");
        author.setFirstName(firstName);
        author.setLastName(lastName);
        authors.put(id, author);
    }

    public void writeToFile() {
        FileIO.getInstance().writeObjToFile(path, authors);
    }
}