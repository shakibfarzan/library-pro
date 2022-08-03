package controllers;

import models.Book;
import utils.FileIO;

import java.util.Collection;
import java.util.HashMap;

public class BookController {
    public static final String path = "books";
    private static BookController instance;
    private HashMap<Integer, Book> books;
    private BookController() {
        books = (HashMap<Integer, Book>) FileIO.getInstance().readObjFile(path);
        if (books == null) books = new HashMap<>();
    }
    public static BookController getInstance() {
        if (instance == null) instance = new BookController();
        return instance;
    }

    public Collection<Book> getBooks() {
        return books.values();
    }


}
