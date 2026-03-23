package service;

import database.DBConnection;
import model.Event;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EventService {

    public void addEvent(Event event) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO events(title,location,event_date,description) VALUES(?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, event.getTitle());
            ps.setString(2, event.getLocation());
            ps.setString(3, event.getDate());
            ps.setString(4, event.getDescription());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}