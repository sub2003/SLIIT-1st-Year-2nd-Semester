package service;

import database.DBConnection;
import model.Booking;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookingService {

    public void bookEvent(Booking booking) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO bookings(user_id,event_id,tickets) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, booking.getUserId());
            ps.setInt(2, booking.getEventId());
            ps.setInt(3, booking.getTickets());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}