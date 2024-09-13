package com.example.test.model;

public class Book {
    private int idBook;
    private String nameBook;
    private String author;
    private String description;
    private int quantity;

    public Book(int idBook, String nameBook, String author, String description, int quantity) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.author = author;
        this.description = description;
        this.quantity = quantity;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
