package service;

import database.DBConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserService {

    public void registerUser(User user) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(name,email,password) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}