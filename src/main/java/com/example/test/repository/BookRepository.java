package com.example.test.repository;

import com.example.test.model.Book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.oracle.graal.enterprise.hotspot.javacodegen.k.ps;


public class BookRepository implements IBookRepository {
    public static final List<Book> listBook = new ArrayList<>();
    private static final String INSERT_BOOK_SQL = "INSERT INTO users (nameBook, author, describee, quantity) VALUES (?, ?, ?, ?);";
    private static final String SELECT_BOOK_BY_ID = "select idBook,nameBook,author,describee, quantity from book where idBook =?";
    private static final String SELECT_ALL_BOOK = "select * from book";
    private static final String DELETE_BOOK_SQL = "delete from users where idBook = ?;";
    private static final String UPDATE_BOOK_SQL = "update users set nameBook= ?,author= ?, describee =?, quantity=? where idBook = ?;";
    private DB_Repository db_Repository;
    private Connection connection;

    @Override
    public List<Book> findAll() {
        try {
            connection = db_Repository.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_BOOK);
            while (resultSet.next()) {
                int id = resultSet.getInt("idBook");
                String name = resultSet.getString("nameBook");
                String author = resultSet.getString("author");
                String describe = resultSet.getString("describee");
                int quantity = Integer.parseInt(resultSet.getString("quantity"));
                Book book = new Book(id, name, author, describe, quantity);
                listBook.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listBook;
    }

    public BookRepository() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Book returnBook(Book book) {
        return null;
    }

    @Override
    public Book borrowBook(Book book) {
        return null;
    }
}


