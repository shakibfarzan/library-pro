package controllers;

import models.Author;
import models.Book;
import models.Category;
import utils.FileIO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class BookController {
    private static final String PATH = "books";
    public static final String FILES_BASE_URL = "files/";
    private static BookController instance;
    private HashMap<Integer, Book> books;
    private BookController() {
        books = (HashMap<Integer, Book>) FileIO.getInstance().readObjFile(PATH);
        if (books == null) books = new HashMap<>();
    }
    public static BookController getInstance() {
        if (instance == null) instance = new BookController();
        return instance;
    }

    public Collection<Book> getBooks() {
        return books.values();
    }

    public void addBook(String title, String fileUrl, String categoryName, int authorId) throws Exception {
        Category category = CategoryController.getInstance().getCategoryByName(categoryName);
        Author author = AuthorController.getInstance().getAuthorById(authorId);
        Book book = new Book(title, fileUrl, category, author);
        books.put(book.getId(), book);
    }

    public void removeBookById(int id) throws Exception {
        Book book = books.remove(id);
        if (book == null) throw new Exception("Book with id "+id+" was not found!");
    }

    public void updateBook(String title, String fileUrl, String categoryName, int authorId, int id) throws Exception {
        Book book = getBookById(id);
        book.setTitle(title);
        book.setFileUrl(fileUrl);
        book.setAuthor(AuthorController.getInstance().getAuthorById(authorId));
        book.setCategory(CategoryController.getInstance().getCategoryByName(categoryName));
        books.put(id, book);
    }

    public void updateHasReadBook(boolean hasRead, int id) throws Exception {
        Book book = getBookById(id);
        book.setHasRead(hasRead);
        books.put(id, book);
    }

    public Book getBookById(int id) throws Exception {
        Book book = books.get(id);
        if (book == null) throw new Exception("Book with id "+id+" was not found!");
        return book;
    }

    public ArrayList<Book> getBooksByCategoryName(String categoryName) throws Exception {
        Category category = CategoryController.getInstance().getCategoryByName(categoryName);
        ArrayList<Book> filteredBooks = new ArrayList<>();
        for (Book book: books.values()) {
            if (book.getCategory().equals(category)) filteredBooks.add(book);
        }
        return filteredBooks;
    }

    public ArrayList<Book> getBooksByAuthorId(int authorId) throws Exception {
        Author author = AuthorController.getInstance().getAuthorById(authorId);
        ArrayList<Book> filteredBooks = new ArrayList<>();
        for (Book book: books.values()) {
            if (book.getAuthor().equals(author)) filteredBooks.add(book);
        }
        return filteredBooks;
    }

    public void writeToFile() {
        FileIO.getInstance().writeObjToFile(PATH, books);
    }

}
