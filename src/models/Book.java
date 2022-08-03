package models;

import static utils.Generator.idGenerator;

public class Book {
    private final int id;
    private String title;
    private String fileUrl;
    private boolean hasRead;
    private Category category;
    private Author author;

    public Book(String title, String fileUrl, Category category, Author author){
        id = idGenerator(title);
        this.title = title;
        this.fileUrl = fileUrl;
        this.category = category;
        this.author = author;
        hasRead = false;
    }

    public int getId() {
        return id;
    }

    public boolean hasRead() {
        return hasRead;
    }

    public Category getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public Author getAuthor() {
        return author;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setHasRead(boolean hasRead) {
        this.hasRead = hasRead;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return title;
    }
}
