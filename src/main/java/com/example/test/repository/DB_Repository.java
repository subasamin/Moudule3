package com.example.test.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DB_Repository {
    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Duy3092000";
    protected Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
return connection;
    }
}
