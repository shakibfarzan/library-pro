package controllers;

import models.Author;
import models.Book;
import models.Category;
import models.ReadingStatus;
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

    public void addBook(String title, String fileUrl, ReadingStatus readingStatus, String categoryName, int authorId) throws Exception {
        Category category = CategoryController.getInstance().getCategoryByName(categoryName);
        Author author = AuthorController.getInstance().getAuthorById(authorId);
        Book book = new Book(title, fileUrl, category, author, readingStatus);
        books.put(book.getId(), book);
    }

    public void removeBookById(int id) throws Exception {
        Book book = books.remove(id);
        if (book == null) throw new Exception("Book with id "+id+" was not found!");
    }

    public void updateBook(String title, String fileUrl, ReadingStatus readingStatus, String categoryName, int authorId, int id) throws Exception {
        Book book = getBookById(id);
        book.setTitle(title);
        book.setFileUrl(fileUrl);
        book.setReadingStatus(readingStatus);
        book.setAuthor(AuthorController.getInstance().getAuthorById(authorId));
        book.setCategory(CategoryController.getInstance().getCategoryByName(categoryName));
        books.put(id, book);
    }

    public void updateReadingStatus(ReadingStatus readingStatus, int id) throws Exception {
        Book book = getBookById(id);
        book.setReadingStatus(readingStatus);
        books.put(id, book);
    }

    public Book getBookById(int id) throws Exception {
        Book book = books.get(id);
        if (book == null) throw new Exception("Book with id "+id+" was not found!");
        return book;
    }

    public Collection<Book> getBooksByFiltering(String categoryName, Integer authorId, String readingStatus) throws Exception {
        Collection<Book> filteredBooks = new ArrayList<>();
        Category category = null;
        Author author = null;
        if (categoryName != null) category = CategoryController.getInstance().getCategoryByName(categoryName);
        if (authorId != null) author = AuthorController.getInstance().getAuthorById(authorId);
        if (categoryName != null && authorId != null && readingStatus != null) {
            for (Book book: books.values())
                if (book.getAuthor().equals(author) && book.getCategory().equals(category) && book.getReadingStatus().toString().equals(readingStatus))
                    filteredBooks.add(book);
        } else if (categoryName != null && authorId != null) {
            for (Book book: books.values())
                if (book.getAuthor().equals(author) && book.getCategory().equals(category))
                    filteredBooks.add(book);
        } else if (categoryName != null && readingStatus != null) {
            for (Book book: books.values())
                if (book.getCategory().equals(category) && book.getReadingStatus().toString().equals(readingStatus))
                    filteredBooks.add(book);
        } else if (authorId != null && readingStatus != null) {
            for (Book book: books.values())
                if (book.getAuthor().equals(author) && book.getReadingStatus().toString().equals(readingStatus))
                    filteredBooks.add(book);
        }else if (categoryName != null) {
            for (Book book: books.values())
                if (book.getCategory().equals(category))
                    filteredBooks.add(book);
        }else if (authorId != null) {
            for (Book book: books.values())
                if (book.getAuthor().equals(author))
                    filteredBooks.add(book);
        }else if (readingStatus != null) {
            for (Book book: books.values())
                if (book.getReadingStatus().toString().equals(readingStatus))
                    filteredBooks.add(book);
        } else return books.values();
        return filteredBooks;
    }

    public void writeToFile() {
        FileIO.getInstance().writeObjToFile(PATH, books);
    }

}
