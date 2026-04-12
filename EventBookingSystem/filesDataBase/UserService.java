package com.eventhorizon.service;

import com.eventhorizon.model.Admin;
import com.eventhorizon.model.Customer;
import com.eventhorizon.model.User;
import com.eventhorizon.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * UserService - CRUD operations for Users using MySQL.
 *
 * CREATE → registerCustomer(), registerAdmin()
 * READ   → getAllUsers(), getUserById(), getUserByEmail(), login()
 * UPDATE → updateUser()
 * DELETE → deleteUser()
 */
public class UserService {

    // ==================== CREATE ====================

    /** Register a new Customer. Returns false if email already exists. */
    public boolean registerCustomer(String name, String email,
                                    String password, String phone) {
        if (getUserByEmail(email) != null) return false;

        String id  = generateId("USR");
        String sql = "INSERT INTO users (user_id, name, email, password, phone, role) "
                   + "VALUES (?, ?, ?, ?, ?, 'CUSTOMER')";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, phone);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.err.println("registerCustomer error: " + e.getMessage());
            return false;
        }
    }

    /** Register a new Admin. */
    public boolean registerAdmin(String name, String email,
                                 String password, String phone) {
        if (getUserByEmail(email) != null) return false;

        String id  = generateId("ADM");
        String sql = "INSERT INTO users (user_id, name, email, password, phone, role) "
                   + "VALUES (?, ?, ?, ?, ?, 'ADMIN')";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, phone);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.err.println("registerAdmin error: " + e.getMessage());
            return false;
        }
    }

    // ==================== READ ====================

    /** Get all users from the database. */
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                users.add(mapRowToUser(rs));
            }

        } catch (SQLException e) {
            System.err.println("getAllUsers error: " + e.getMessage());
        }
        return users;
    }

    /** Get only Customer users. */
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT * FROM users WHERE role = 'CUSTOMER'";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                customers.add(new Customer(
                    rs.getString("user_id"), rs.getString("name"),
                    rs.getString("email"),   rs.getString("password"),
                    rs.getString("phone")
                ));
            }

        } catch (SQLException e) {
            System.err.println("getAllCustomers error: " + e.getMessage());
        }
        return customers;
    }

    /** Find user by ID. */
    public User getUserById(String userId) {
        String sql = "SELECT * FROM users WHERE user_id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, userId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return mapRowToUser(rs);

        } catch (SQLException e) {
            System.err.println("getUserById error: " + e.getMessage());
        }
        return null;
    }

    /** Find user by email — used for login and duplicate check. */
    public User getUserByEmail(String email) {
        String sql = "SELECT * FROM users WHERE email = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return mapRowToUser(rs);

        } catch (SQLException e) {
            System.err.println("getUserByEmail error: " + e.getMessage());
        }
        return null;
    }

    /** Login: validate email + password. Returns User or null. */
    public User login(String email, String password) {
        User user = getUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    // ==================== UPDATE ====================

    /** Update a user's name, phone, and password. */
    public boolean updateUser(String userId, String newName,
                              String newPhone, String newPassword) {
        String sql = "UPDATE users SET name=?, phone=?, password=? WHERE user_id=?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, newName);
            ps.setString(2, newPhone);
            ps.setString(3, newPassword);
            ps.setString(4, userId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("updateUser error: " + e.getMessage());
            return false;
        }
    }

    // ==================== DELETE ====================

    /** Delete a user by ID. */
    public boolean deleteUser(String userId) {
        String sql = "DELETE FROM users WHERE user_id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, userId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("deleteUser error: " + e.getMessage());
            return false;
        }
    }

    // ==================== HELPERS ====================

    /** Build a User (Customer or Admin) from a database row. */
    private User mapRowToUser(ResultSet rs) throws SQLException {
        String role = rs.getString("role");
        String id   = rs.getString("user_id");
        String name = rs.getString("name");
        String email= rs.getString("email");
        String pass = rs.getString("password");
        String phone= rs.getString("phone");

        // POLYMORPHISM - returns the correct subclass based on role
        if ("ADMIN".equals(role)) {
            return new Admin(id, name, email, pass, phone);
        } else {
            return new Customer(id, name, email, pass, phone);
        }
    }

    /** Generate a unique ID like USR001, USR002... */
    private String generateId(String prefix) {
        String sql = "SELECT COUNT(*) FROM users";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            if (rs.next()) {
                int count = rs.getInt(1) + 1;
                return String.format("%s%03d", prefix, count);
            }
        } catch (SQLException e) {
            System.err.println("generateId error: " + e.getMessage());
        }
        return prefix + System.currentTimeMillis();
    }
}
