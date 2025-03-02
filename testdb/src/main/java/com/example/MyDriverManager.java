package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDriverManager {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=master;trustServerCertificate=true;";
    private static final String USER = "sa";
    private static final String PASSWORD = "B!ng_2023";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
