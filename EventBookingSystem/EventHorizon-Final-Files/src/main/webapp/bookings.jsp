<%@ page import="model.User, model.AdminUser, dao.BookingDAO, model.Booking, java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User currentUser = (User) session.getAttribute("loggedInUser");
    if (currentUser == null || (!"main_admin".equals(currentUser.getRole()) && !"sub_admin".equals(currentUser.getRole()))) {
        response.sendRedirect("login.jsp"); return;
    }
    AdminUser admin = (AdminUser) currentUser;
    if (!admin.isCanApproveBookings()) {
        response.sendRedirect("adminDashboard.jsp"); return;
    }
    BookingDAO dao = new BookingDAO();
    List<Booking> allBookings = dao.getAllBookings();

    String successMsg = (String) session.getAttribute("successMsg");
    session.removeAttribute("successMsg");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Booking Requests - EventHorizon</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>@import url('https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@400;600;700;800&display=swap'); *{font-family:'Plus Jakarta Sans',sans-serif;}</style>
</head>
<body class="bg-slate-50 flex h-screen overflow-hidden">

<!-- Sidebar -->
<aside class="w-64 bg-slate-900 text-white flex flex-col flex-shrink-0">
    <div class="p-6"><h2 class="text-2xl font-bold italic text-indigo-400">EventHorizon.</h2><p class="text-xs text-slate-400 mt-1">Admin Control Panel</p></div>
    <nav class="flex-1 px-4 space-y-1">
        <a href="adminDashboard.jsp" class="block px-4 py-3 text-slate-300 hover:bg-slate-800 rounded-xl text-sm transition">📊 Dashboard</a>
        <% if (admin.isCanManageEvents())  { %><a href="events.jsp"     class="block px-4 py-3 text-slate-300 hover:bg-slate-800 rounded-xl text-sm transition">🎪 Manage Events</a><% } %>
        <a href="bookings.jsp" class="block px-4 py-3 bg-indigo-600 rounded-xl font-semibold text-sm shadow-lg shadow-indigo-500/30">🎟️ Booking Requests</a>
        <a href="ticketsAdmin.jsp" class="block px-4 py-3 text-slate-300 hover:bg-slate-800 rounded-xl text-sm transition">🎫 Tickets</a>
        <% if ("main_admin".equals(currentUser.getRole())) { %>
        <div class="pt-4 mt-4 border-t border-slate-700">
            <a href="userManagement.jsp" class="block px-4 py-3 text-slate-300 hover:bg-red-500/10 hover:text-red-400 rounded-xl text-sm transition">👥 User Management</a>
        </div>
        <% } %>
    </nav>
    <div class="p-4 border-t border-slate-800"><a href="LogoutServlet" class="block w-full text-center py-3 bg-slate-800 hover:bg-red-600 rounded-xl text-sm font-bold text-white transition">Log Out</a></div>
</aside>

<main class="flex-1 flex flex-col h-screen overflow-y-auto">
    <header class="bg-white border-b border-slate-200 px-8 py-5 flex justify-between items-center">
        <h1 class="text-2xl font-bold text-slate-800">Booking Requests</h1>
        <span class="text-sm text-slate-500 font-medium">Logged in as: <strong class="text-slate-800"><%= currentUser.getName() %></strong></span>
    </header>

    <div class="p-8">
        <% if (successMsg != null) { %>
        <div class="mb-6 p-4 bg-emerald-50 border-l-4 border-emerald-500 text-emerald-700 rounded-xl text-sm font-semibold">✅ <%= successMsg %></div>
        <% } %>

        <!-- Filter Tabs -->
        <div class="flex gap-2 mb-6">
            <button onclick="filterTable('all')"       class="filter-tab px-4 py-2 rounded-full text-xs font-bold bg-indigo-600 text-white" data-filter="all">All</button>
            <button onclick="filterTable('pending')"   class="filter-tab px-4 py-2 rounded-full text-xs font-bold bg-white border border-slate-200 text-slate-600 hover:border-amber-400"   data-filter="pending">Pending</button>
            <button onclick="filterTable('approved')"  class="filter-tab px-4 py-2 rounded-full text-xs font-bold bg-white border border-slate-200 text-slate-600 hover:border-emerald-400" data-filter="approved">Approved</button>
            <button onclick="filterTable('rejected')"  class="filter-tab px-4 py-2 rounded-full text-xs font-bold bg-white border border-slate-200 text-slate-600 hover:border-red-400"     data-filter="rejected">Rejected</button>
        </div>

        <div class="bg-white rounded-2xl shadow-sm border border-slate-100 overflow-hidden">
            <% if (allBookings.isEmpty()) { %>
            <div class="text-center py-20 text-slate-400">
                <div class="text-4xl mb-3">📭</div>
                <p class="font-semibold">No bookings yet</p>
            </div>
            <% } else { %>
            <div class="overflow-x-auto">
                <table class="w-full" id="bookingsTable">
                    <thead>
                        <tr class="text-xs text-slate-400 uppercase font-bold border-b border-slate-100 bg-slate-50">
                            <th class="px-5 py-3 text-left">ID</th>
                            <th class="px-5 py-3 text-left">Customer</th>
                            <th class="px-5 py-3 text-left">Event</th>
                            <th class="px-5 py-3 text-left">Qty</th>
                            <th class="px-5 py-3 text-left">Total</th>
                            <th class="px-5 py-3 text-left">Status</th>
                            <th class="px-5 py-3 text-left">Date</th>
                            <th class="px-5 py-3 text-left">Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                    <% for (Booking b : allBookings) { %>
                    <tr class="border-b border-slate-50 hover:bg-slate-50 transition booking-row" data-status="<%= b.getStatus() %>">
                        <td class="px-5 py-3 text-xs text-indigo-500 font-mono font-bold">#<%= b.getId() %></td>
                        <td class="px-5 py-3 font-semibold text-slate-800 text-sm"><%= b.getUserName() != null ? b.getUserName() : "User #"+b.getUserId() %></td>
                        <td class="px-5 py-3 text-slate-600 text-sm"><%= b.getEventTitle() != null ? b.getEventTitle() : "Event #"+b.getEventId() %></td>
                        <td class="px-5 py-3 text-slate-600 text-sm font-bold"><%= b.getQuantity() %></td>
                        <td class="px-5 py-3 text-indigo-600 font-black text-sm">LKR <%= String.format("%,.0f", b.getTotalAmount()) %></td>
                        <td class="px-5 py-3">
                            <%  String sc = "bg-slate-100 text-slate-600";
                                if ("pending" .equals(b.getStatus())) sc = "bg-amber-100 text-amber-700";
                                if ("approved".equals(b.getStatus())) sc = "bg-emerald-100 text-emerald-700";
                                if ("rejected".equals(b.getStatus())) sc = "bg-red-100 text-red-700"; %>
                            <span class="px-3 py-1 rounded-full text-xs font-bold <%= sc %>"><%= b.getStatus().toUpperCase() %></span>
                        </td>
                        <td class="px-5 py-3 text-xs text-slate-400"><%= b.getBookedAt() != null ? b.getBookedAt().substring(0,10) : "-" %></td>
                        <td class="px-5 py-3">
                            <% if ("pending".equals(b.getStatus())) { %>
                            <div class="flex gap-2">
                                <a href="ApproveBookingServlet?id=<%= b.getId() %>" class="px-3 py-1.5 bg-emerald-500 hover:bg-emerald-600 text-white rounded-lg text-xs font-bold transition">✓ Approve</a>
                                <a href="RejectBookingServlet?id=<%= b.getId() %>"  class="px-3 py-1.5 bg-red-500 hover:bg-red-600 text-white rounded-lg text-xs font-bold transition">✗ Reject</a>
                            </div>
                            <% } else { %>
                            <span class="text-xs text-slate-400">Processed</span>
                            <% } %>
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

<script>
function filterTable(status) {
    document.querySelectorAll('.booking-row').forEach(row => {
        row.style.display = (status === 'all' || row.dataset.status === status) ? '' : 'none';
    });
    document.querySelectorAll('.filter-tab').forEach(btn => {
        const active = btn.dataset.filter === status;
        btn.className = 'filter-tab px-4 py-2 rounded-full text-xs font-bold transition ' +
            (active ? 'bg-indigo-600 text-white' : 'bg-white border border-slate-200 text-slate-600 hover:border-indigo-400');
    });
}
</script>
</body>
</html>
