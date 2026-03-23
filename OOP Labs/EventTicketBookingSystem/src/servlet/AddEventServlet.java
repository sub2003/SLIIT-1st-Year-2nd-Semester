package servlet;

import model.Event;
import service.EventService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/addEvent")
public class AddEventServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String title = request.getParameter("title");
        String location = request.getParameter("location");
        String date = request.getParameter("date");
        String description = request.getParameter("description");

        Event event = new Event(title,location,date,description);

        EventService service = new EventService();
        service.addEvent(event);

        response.sendRedirect("admin-dashboard.html");
    }
}