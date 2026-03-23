package servlet;

import database.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,email);
            ps.setString(2,password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){

                String role = rs.getString("role");

                HttpSession session = request.getSession();
                session.setAttribute("user", email);
                session.setAttribute("role", role);

                if(role.equals("admin")){
                    response.sendRedirect("admin-dashboard.html");
                } else {
                    response.sendRedirect("events.html");
                }

            } else {
                response.sendRedirect("user-login.html");
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}