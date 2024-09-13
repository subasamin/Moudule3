package com.example.test.controller;

import com.example.test.model.Book;
import com.example.test.repository.BookRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import static com.example.test.repository.BookRepository.listBook;

@WebServlet(name = "BookServlet", urlPatterns = {"/books"})
public class BookServlet extends HttpServlet {
    BookRepository bookRepository = new BookRepository();
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "listBook":
                listBook(request, response);
                break;
            case "borrowBook":
                borrowBook(request, response);
                break;
            case "returnBook":
                returnBook(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "listBook":
                listBook(request, response);
                break;
            case "borrowBook":
                borrowBook(request, response);
                break;
            case "returndBook":
                returnBook(request, response);
                break;
            default:
                break;
        }
    }
    protected void listBook(HttpServletRequest request, HttpServletResponse response){
        List<Book> listBook = bookRepository.findAll();
        request.setAttribute("listBook", listBook);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listBook.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    protected void borrowBook(HttpServletRequest request, HttpServletResponse response){

    }
    protected void returnBook(HttpServletRequest request, HttpServletResponse response){

    }
    }


