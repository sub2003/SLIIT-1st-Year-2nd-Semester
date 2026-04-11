package controller;
import dao.UserDAO;
import model.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

/** Delete a sub-admin account. Only main_admin can do this. */
@WebServlet("/DeleteAdminServlet")
public class DeleteAdminServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        User cu = (User) req.getSession().getAttribute("loggedInUser");
        if (cu == null || !"main_admin".equals(cu.getRole())) {
            res.sendRedirect("login.jsp"); return;
        }
        int id = Integer.parseInt(req.getParameter("id"));
        new UserDAO().deleteUserById(id);
        res.sendRedirect("userManagement.jsp");
    }
}
