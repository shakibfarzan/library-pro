package models;

import java.util.Objects;

import static utils.Generator.idGenerator;

public class Book {
    private final int id;
    private String title;
    private String fileUrl;
    private ReadingStatus readingStatus;
    private Category category;
    private Author author;

    public Book(String title, String fileUrl, Category category, Author author, ReadingStatus readingStatus){
        id = idGenerator(title);
        this.title = title;
        this.fileUrl = fileUrl;
        this.category = category;
        this.author = author;
        this.readingStatus = readingStatus;
    }

    public int getId() {
        return id;
    }

    public ReadingStatus getReadingStatus() {
        return readingStatus;
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

    public void setReadingStatus(ReadingStatus readingStatus) {
        this.readingStatus = readingStatus;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
