<%@ page import="model.User, model.AdminUser, dao.TicketDAO, model.Ticket, java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User currentUser = (User) session.getAttribute("loggedInUser");
    if (currentUser == null || (!"main_admin".equals(currentUser.getRole()) && !"sub_admin".equals(currentUser.getRole()))) {
        response.sendRedirect("login.jsp"); return;
    }
    AdminUser admin = (AdminUser) currentUser;
    TicketDAO ticketDAO = new TicketDAO();
    List<Ticket> allTickets = ticketDAO.getAllTickets();

    String successMsg = (String) session.getAttribute("ticketMsg");
    session.removeAttribute("ticketMsg");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tickets - EventHorizon</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>@import url('https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@400;600;700;800&display=swap'); *{font-family:'Plus Jakarta Sans',sans-serif;}</style>
</head>
<body class="bg-slate-50 flex h-screen overflow-hidden">

<!-- Sidebar -->
<aside class="w-64 bg-slate-900 text-white flex flex-col flex-shrink-0">
    <div class="p-6"><h2 class="text-2xl font-bold italic text-indigo-400">EventHorizon.</h2><p class="text-xs text-slate-400 mt-1">Admin Control Panel</p></div>
    <nav class="flex-1 px-4 space-y-1">
        <a href="adminDashboard.jsp" class="block px-4 py-3 text-slate-300 hover:bg-slate-800 rounded-xl text-sm transition">📊 Dashboard</a>
        <% if (admin.isCanManageEvents())  { %><a href="events.jsp"    class="block px-4 py-3 text-slate-300 hover:bg-slate-800 rounded-xl text-sm transition">🎪 Manage Events</a><% } %>
        <% if (admin.isCanApproveBookings()){ %><a href="bookings.jsp" class="block px-4 py-3 text-slate-300 hover:bg-slate-800 rounded-xl text-sm transition">🎟️ Booking Requests</a><% } %>
        <a href="ticketsAdmin.jsp" class="block px-4 py-3 bg-indigo-600 rounded-xl font-semibold text-sm shadow-lg shadow-indigo-500/30">🎫 Tickets</a>
        <% if ("main_admin".equals(currentUser.getRole())) { %>
        <div class="pt-4 mt-4 border-t border-slate-700">
            <a href="userManagement.jsp" class="block px-4 py-3 text-slate-300 hover:bg-red-500/10 hover:text-red-400 rounded-xl text-sm transition">👥 User Management</a>
        </div>
        <% } %>
    </nav>
    <div class="p-4 border-t border-slate-800"><a href="LogoutServlet" class="block w-full text-center py-3 bg-slate-800 hover:bg-red-600 rounded-xl text-sm font-bold text-white transition">Log Out</a></div>
</aside>

<main class="flex-1 flex flex-col h-screen overflow-y-auto">
    <header class="bg-white border-b border-slate-200 px-8 py-5">
        <h1 class="text-2xl font-bold text-slate-800">🎫 Ticket Management</h1>
        <p class="text-sm text-slate-400 mt-1">Mark tickets as used at the entry gate, or cancel if needed</p>
    </header>

    <div class="p-8">
        <% if (successMsg != null) { %>
        <div class="mb-6 p-4 bg-emerald-50 border-l-4 border-emerald-500 text-emerald-700 rounded-xl text-sm font-semibold">✅ <%= successMsg %></div>
        <% } %>

        <!-- Stats -->
        <div class="grid grid-cols-3 gap-4 mb-8">
            <%
                long activeCount    = allTickets.stream().filter(t -> "active"   .equals(t.getStatus())).count();
                long usedCount      = allTickets.stream().filter(t -> "used"     .equals(t.getStatus())).count();
                long cancelledCount = allTickets.stream().filter(t -> "cancelled".equals(t.getStatus())).count();
            %>
            <div class="bg-white rounded-2xl p-5 border border-slate-100 text-center shadow-sm">
                <div class="text-3xl font-black text-emerald-500"><%= activeCount %></div>
                <div class="text-xs text-slate-400 font-semibold uppercase mt-1">Active</div>
            </div>
            <div class="bg-white rounded-2xl p-5 border border-slate-100 text-center shadow-sm">
                <div class="text-3xl font-black text-purple-500"><%= usedCount %></div>
                <div class="text-xs text-slate-400 font-semibold uppercase mt-1">Used</div>
            </div>
            <div class="bg-white rounded-2xl p-5 border border-slate-100 text-center shadow-sm">
                <div class="text-3xl font-black text-slate-400"><%= cancelledCount %></div>
                <div class="text-xs text-slate-400 font-semibold uppercase mt-1">Cancelled</div>
            </div>
        </div>

        <!-- Ticket Table -->
        <div class="bg-white rounded-2xl shadow-sm border border-slate-100 overflow-hidden">
            <% if (allTickets.isEmpty()) { %>
            <div class="text-center py-20 text-slate-400">
                <div class="text-4xl mb-3">🎫</div>
                <p class="font-semibold">No tickets generated yet</p>
                <p class="text-sm mt-1">Tickets appear here when bookings are approved</p>
            </div>
            <% } else { %>
            <div class="overflow-x-auto">
                <table class="w-full">
                    <thead>
                        <tr class="text-xs text-slate-400 uppercase font-bold border-b border-slate-100 bg-slate-50">
                            <th class="px-5 py-3 text-left">Ticket Code</th>
                            <th class="px-5 py-3 text-left">Event</th>
                            <th class="px-5 py-3 text-left">Status</th>
                            <th class="px-5 py-3 text-left">Issued</th>
                            <th class="px-5 py-3 text-left">Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                    <% for (Ticket t : allTickets) { %>
                    <tr class="border-b border-slate-50 hover:bg-slate-50 transition">
                        <td class="px-5 py-3 font-black font-mono text-indigo-600 text-sm tracking-widest"><%= t.getTicketCode() %></td>
                        <td class="px-5 py-3 text-slate-700 text-sm font-semibold"><%= t.getEventTitle() != null ? t.getEventTitle() : "Event #"+t.getEventId() %></td>
                        <td class="px-5 py-3">
                            <% String tc = "bg-slate-100 text-slate-500";
                               if ("active"   .equals(t.getStatus())) tc = "bg-emerald-100 text-emerald-700";
                               if ("used"     .equals(t.getStatus())) tc = "bg-purple-100 text-purple-700";
                               if ("cancelled".equals(t.getStatus())) tc = "bg-red-100 text-red-600"; %>
                            <span class="px-3 py-1 rounded-full text-xs font-bold <%= tc %>"><%= t.getStatus().toUpperCase() %></span>
                        </td>
                        <td class="px-5 py-3 text-xs text-slate-400"><%= t.getIssuedAt() != null ? t.getIssuedAt().substring(0,10) : "-" %></td>
                        <td class="px-5 py-3">
                            <% if ("active".equals(t.getStatus())) { %>
                            <div class="flex gap-2">
                                <a href="MarkTicketUsedServlet?id=<%= t.getId() %>"  class="px-3 py-1.5 bg-purple-500 hover:bg-purple-600 text-white rounded-lg text-xs font-bold transition">✓ Mark Used</a>
                                <a href="CancelTicketServlet?id=<%= t.getId() %>"    class="px-3 py-1.5 bg-red-400 hover:bg-red-500 text-white rounded-lg text-xs font-bold transition">Cancel</a>
                            </div>
                            <% } else { %><span class="text-xs text-slate-400">—</span><% } %>
                        </td>
                    </tr>
                    <% } %>
                    </tbody>
                </table>
            </div>
            <% } %>
        </div>
    </div>
</main>
</body>
</html>
