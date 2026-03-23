package servlet;

import model.Booking;
import service.BookingService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/bookEvent")
public class BookingServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int userId = Integer.parseInt(request.getParameter("userId"));
        int eventId = Integer.parseInt(request.getParameter("eventId"));
        int tickets = Integer.parseInt(request.getParameter("tickets"));

        Booking booking = new Booking(userId,eventId,tickets);

        BookingService service = new BookingService();
        service.bookEvent(booking);

        response.sendRedirect("bookings.html");
    }
}