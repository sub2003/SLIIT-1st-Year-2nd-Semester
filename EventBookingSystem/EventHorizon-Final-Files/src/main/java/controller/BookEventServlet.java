package controller;

import dao.BookingDAO;
import dao.EventDAO;
import model.Booking;
import model.Event;
import model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

/**
 * BookEventServlet - Member 03
 * Handles form submission from events.jsp booking modal.
 * Creates a new PENDING booking and reserves seats.
 */
@WebServlet("/BookEventServlet")
public class BookEventServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        User currentUser = (session != null) ? (User) session.getAttribute("loggedInUser") : null;

        // Security check — must be logged in as customer
        if (currentUser == null || !"customer".equals(currentUser.getRole())) {
            res.sendRedirect("login.jsp");
            return;
        }

        try {
            int    eventId  = Integer.parseInt(req.getParameter("eventId"));
            int    quantity = Integer.parseInt(req.getParameter("quantity"));
            double price    = Double.parseDouble(req.getParameter("eventPrice"));

            // Validate quantity
            if (quantity < 1 || quantity > 10) {
                session.setAttribute("errorMsg", "Invalid ticket quantity.");
                res.sendRedirect("events.jsp");
                return;
            }

            // Check event still has seats
            EventDAO eventDAO = new EventDAO();
            Event event = eventDAO.getEventById(eventId);

            if (event == null) {
                session.setAttribute("errorMsg", "Event not found.");
                res.sendRedirect("events.jsp");
                return;
            }

            if (event.getAvailableTickets() < quantity) {
                session.setAttribute("errorMsg",
                    "Sorry, only " + event.getAvailableTickets() + " seats left.");
                res.sendRedirect("events.jsp");
                return;
            }

            // Create the booking
            Booking booking = new Booking(currentUser.getId(), eventId, quantity, price * quantity);

            BookingDAO bookingDAO = new BookingDAO();
            boolean ok = bookingDAO.addBooking(booking);

            if (ok) {
                session.setAttribute("successMsg",
                    "Booking submitted! Awaiting admin approval. Check your dashboard.");
            } else {
                session.setAttribute("errorMsg", "Booking failed. Please try again.");
            }

        } catch (NumberFormatException e) {
            session.setAttribute("errorMsg", "Invalid booking data.");
        }

        res.sendRedirect("events.jsp");
    }
}
