package servlet;

import database.DBConnection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/viewBookings")
public class ViewBookingsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM bookings");

            while(rs.next()){

                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getInt("user_id") + " " +
                                rs.getInt("event_id")
                );

            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}