package controller;
import dao.TicketDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

/** Mark a ticket as USED at the entry gate */
@WebServlet("/MarkTicketUsedServlet")
public class MarkTicketUsedServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        new TicketDAO().markAsUsed(id);
        req.getSession().setAttribute("ticketMsg", "Ticket marked as used.");
        res.sendRedirect("ticketsAdmin.jsp");
    }
}
