/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FineDine;

import javax.swing.*;

/**
 *
 * @author Admin
 */
    // DatabaseHelper.java
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/finedineresturant";
    private static final String USER = "root";
    private static final String PASS = "Unam@123#";

    

    public static Connection getConnection() throws SQLException {
    
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static void createTable() {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            String usersTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "full_name VARCHAR(255) NOT NULL, " +
                "email VARCHAR(255) UNIQUE NOT NULL, " +
                "password VARCHAR(255) NOT NULL," +
                  "role VARCHAR(50) NOT NULL DEFAULT 'Customer'," + 
                "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP," +
                "updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP" +
                ") ENGINE=InnoDB";  
            
            // Create reservations table
            String reservationsTableSQL = "CREATE TABLE IF NOT EXISTS reservations (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "user_id INT NOT NULL, " +
                "reservation_date DATETIME NOT NULL, " +
                "party_size INT NOT NULL, " +
                "special_requests TEXT, " +
                "FOREIGN KEY (user_id) REFERENCES users(id))";

            // Execute both SQL statements
            stmt.executeUpdate(usersTableSQL);
            stmt.executeUpdate(reservationsTableSQL);
            
            System.out.println("Tables created successfully!");
            
        } catch (SQLException e) {
            System.err.println("Error creating tables: " + e.getMessage());
        }
    }
        }
    


