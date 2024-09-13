package com.example.test.repository;

import com.example.test.model.Book;

import java.util.HashMap;
import java.util.List;

public interface IBookRepository {
    public List<Book> findAll();
    public Book borrowBook(Book book);
    public Book returnBook(Book book);
}
