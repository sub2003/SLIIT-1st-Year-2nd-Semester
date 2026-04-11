package controller;
import dao.TicketDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

/** Cancel (invalidate) an active ticket */
@WebServlet("/CancelTicketServlet")
public class CancelTicketServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        new TicketDAO().cancelTicket(id);
        req.getSession().setAttribute("ticketMsg", "Ticket cancelled.");
        res.sendRedirect("ticketsAdmin.jsp");
    }
}
