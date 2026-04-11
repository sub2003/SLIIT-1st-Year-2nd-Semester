<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%
    if (session.getAttribute("userId") == null || !"ADMIN".equals(session.getAttribute("role"))) {
        response.sendRedirect("../login.jsp"); return;
    }
%>
<%@ page import="com.eventhorizon.service.EventService, java.util.List, com.eventhorizon.model.Event" %>
<%
    EventService es = new EventService();
    List<Event> allEvents = es.getAllEvents();
    pageContext.setAttribute("events", allEvents);
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Events – EventHorizon Admin</title>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>

<nav class="navbar">
    <a href="../index.jsp" class="navbar-brand">⬡ EVENTHORIZON</a>
    <ul class="navbar-links">
        <li><a href="../index.jsp">← Public Site</a></li>
        <li><a href="../user?action=logout" class="btn-nav">Logout</a></li>
    </ul>
</nav>

<div class="admin-wrapper">
    <aside class="sidebar">
        <div class="sidebar-title">Admin Panel</div>
        <a href="dashboard.jsp" class="sidebar-link"><span>📊</span> Dashboard</a>
        <a href="events.jsp"    class="sidebar-link active"><span>🎟️</span> Manage Events</a>
        <a href="bookings.jsp"  class="sidebar-link"><span>📋</span> All Bookings</a>
        <a href="users.jsp"     class="sidebar-link"><span>👥</span> Manage Users</a>
        <a href="addEvent.jsp"  class="sidebar-link"><span>➕</span> Add New Event</a>
    </aside>

    <main class="admin-content">
        <div class="page-header">
            <h1 class="page-title">🎟️ Manage Events</h1>
            <a href="addEvent.jsp" class="btn btn-primary">➕ Add New Event</a>
        </div>

        <% if ("added".equals(request.getParameter("msg"))) { %>
            <div class="alert alert-success" data-auto-dismiss>✅ Event added successfully!</div>
        <% } %>
        <% if ("updated".equals(request.getParameter("msg"))) { %>
            <div class="alert alert-success" data-auto-dismiss>✅ Event updated successfully!</div>
        <% } %>
        <% if ("deleted".equals(request.getParameter("msg"))) { %>
            <div class="alert alert-info" data-auto-dismiss>🗑️ Event deleted.</div>
        <% } %>
        <% if ("cancelled".equals(request.getParameter("msg"))) { %>
            <div class="alert alert-warning" data-auto-dismiss>⚠️ Event cancelled.</div>
        <% } %>

        <div class="table-wrapper">
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Category</th>
                        <th>Date</th>
                        <th>Venue</th>
                        <th>Price (LKR)</th>
                        <th>Seats</th>
                        <th>Status</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="e" items="${events}">
                        <tr>
                            <td style="font-family:'Orbitron',monospace;font-size:0.75rem;color:var(--accent-teal);">${e.eventId}</td>
                            <td style="font-weight:600;max-width:180px;">${e.title}</td>
                            <td><span class="badge badge-purple">${e.category}</span></td>
                            <td>${e.date}</td>
                            <td style="max-width:140px;font-size:0.85rem;">${e.venue}</td>
                            <td>${e.ticketPrice}</td>
                            <td>${e.availableSeats}/${e.totalSeats}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${e.status == 'ACTIVE'}">
                                        <span class="badge badge-success">ACTIVE</span>
                                    </c:when>
                                    <c:otherwise>
                                        <span class="badge badge-danger">CANCELLED</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td>
                                <div style="display:flex;gap:6px;flex-wrap:wrap;">
                                    <a href="editEvent.jsp?id=${e.eventId}" class="btn btn-outline btn-sm">✏️ Edit</a>
                                    <c:if test="${e.status == 'ACTIVE'}">
                                        <form action="../event" method="post" style="display:inline;">
                                            <input type="hidden" name="action" value="cancel">
                                            <input type="hidden" name="eventId" value="${e.eventId}">
                                            <button type="submit" class="btn btn-sm"
                                                    style="background:var(--warning);color:#000;font-weight:700;"
                                                    data-confirm-delete="Cancel this event?">
                                                ⚠️ Cancel
                                            </button>
                                        </form>
                                    </c:if>
                                    <form action="../event" method="post" style="display:inline;">
                                        <input type="hidden" name="action" value="delete">
                                        <input type="hidden" name="eventId" value="${e.eventId}">
                                        <button type="submit" class="btn btn-danger btn-sm"
                                                data-confirm-delete="Permanently delete this event?">
                                            🗑️ Delete
                                        </button>
                                    </form>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                    <c:if test="${empty events}">
                        <tr><td colspan="9" style="text-align:center;color:var(--text-muted);padding:48px;">
                            No events yet. <a href="addEvent.jsp" style="color:var(--accent-teal);">Add one!</a>
                        </td></tr>
                    </c:if>
                </tbody>
            </table>
        </div>
    </main>
</div>

<script src="../js/main.js"></script>
</body>
</html>
