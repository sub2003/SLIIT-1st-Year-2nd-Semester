<%@ page import="model.User" %>
<%@ page import="model.Event" %>
<%@ page import="dao.EventDAO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // Get logged-in user (null means guest — guests can still browse)
    User currentUser = (User) session.getAttribute("loggedInUser");

    // Load all events from database
    EventDAO eventDAO = new EventDAO();
    String categoryFilter = request.getParameter("category");
    List<Event> events = eventDAO.getAllEvents(categoryFilter);

    // Success/error messages from booking
    String successMsg = (String) session.getAttribute("successMsg");
    String errorMsg   = (String) session.getAttribute("errorMsg");
    session.removeAttribute("successMsg");
    session.removeAttribute("errorMsg");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Events - EventHorizon</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@300;400;500;600;700;800&display=swap');
        * { font-family: 'Plus Jakarta Sans', sans-serif; }
        .event-card { transition: all 0.3s; }
        .event-card:hover { transform: translateY(-6px); box-shadow: 0 20px 40px rgba(99,102,241,0.15); }
    </style>
</head>
<body class="bg-slate-50 min-h-screen">

<!-- Navbar -->
<nav class="bg-white border-b border-slate-200 px-6 py-4 sticky top-0 z-50 shadow-sm">
    <div class="max-w-7xl mx-auto flex justify-between items-center">
        <a href="index.jsp" class="text-2xl font-black text-indigo-600 italic">EventHorizon</a>
        <div class="flex items-center gap-3">
            <% if (currentUser != null) { %>
                <% if ("customer".equals(currentUser.getRole())) { %>
                    <a href="userDashboard.jsp"  class="px-4 py-2 text-slate-600 font-semibold text-sm hover:text-indigo-600 transition">My Bookings</a>
                <% } else { %>
                    <a href="adminDashboard.jsp" class="px-4 py-2 text-slate-600 font-semibold text-sm hover:text-indigo-600 transition">Admin Panel</a>
                <% } %>
                <a href="LogoutServlet" class="px-4 py-2 bg-slate-100 text-slate-600 rounded-xl text-sm font-bold hover:bg-red-50 hover:text-red-500 transition">Log Out</a>
            <% } else { %>
                <a href="login.jsp"  class="px-4 py-2 text-slate-600 font-semibold text-sm hover:text-indigo-600 transition">Log In</a>
                <a href="signup.jsp" class="px-5 py-2 bg-indigo-600 text-white rounded-xl text-sm font-bold hover:bg-indigo-700 transition">Sign Up</a>
            <% } %>
        </div>
    </div>
</nav>

<div class="max-w-7xl mx-auto px-6 py-10">

    <!-- Page Header -->
    <div class="mb-8">
        <h1 class="text-4xl font-black text-slate-900 mb-2">Upcoming <span class="text-indigo-600">Events</span></h1>
        <p class="text-slate-500">Discover and book amazing experiences across Sri Lanka</p>
    </div>

    <!-- Success / Error Toast -->
    <% if (successMsg != null) { %>
    <div class="mb-6 p-4 bg-emerald-50 border-l-4 border-emerald-500 text-emerald-700 rounded-xl font-semibold text-sm">
        ✅ <%= successMsg %>
    </div>
    <% } %>
    <% if (errorMsg != null) { %>
    <div class="mb-6 p-4 bg-red-50 border-l-4 border-red-500 text-red-700 rounded-xl font-semibold text-sm">
        ⚠️ <%= errorMsg %>
    </div>
    <% } %>

    <!-- Category Filter Tabs -->
    <div class="flex flex-wrap gap-2 mb-8">
        <a href="events.jsp" class="px-5 py-2.5 rounded-full text-sm font-bold transition <%= categoryFilter == null ? "bg-indigo-600 text-white shadow-lg shadow-indigo-500/25" : "bg-white border border-slate-200 text-slate-600 hover:border-indigo-400" %>">All Events</a>
        <a href="events.jsp?category=music"  class="px-5 py-2.5 rounded-full text-sm font-bold transition <% if("music" .equals(categoryFilter)){%>bg-indigo-600 text-white shadow-lg shadow-indigo-500/25<%}else{%>bg-white border border-slate-200 text-slate-600 hover:border-indigo-400<%}%>">🎵 Music</a>
        <a href="events.jsp?category=sports" class="px-5 py-2.5 rounded-full text-sm font-bold transition <% if("sports".equals(categoryFilter)){%>bg-indigo-600 text-white shadow-lg shadow-indigo-500/25<%}else{%>bg-white border border-slate-200 text-slate-600 hover:border-indigo-400<%}%>">⚽ Sports</a>
        <a href="events.jsp?category=tech"   class="px-5 py-2.5 rounded-full text-sm font-bold transition <% if("tech"  .equals(categoryFilter)){%>bg-indigo-600 text-white shadow-lg shadow-indigo-500/25<%}else{%>bg-white border border-slate-200 text-slate-600 hover:border-indigo-400<%}%>">💻 Tech</a>
        <a href="events.jsp?category=arts"   class="px-5 py-2.5 rounded-full text-sm font-bold transition <% if("arts"  .equals(categoryFilter)){%>bg-indigo-600 text-white shadow-lg shadow-indigo-500/25<%}else{%>bg-white border border-slate-200 text-slate-600 hover:border-indigo-400<%}%>">🎨 Arts</a>
        <a href="events.jsp?category=food"   class="px-5 py-2.5 rounded-full text-sm font-bold transition <% if("food"  .equals(categoryFilter)){%>bg-indigo-600 text-white shadow-lg shadow-indigo-500/25<%}else{%>bg-white border border-slate-200 text-slate-600 hover:border-indigo-400<%}%>">🍽️ Food</a>
    </div>

    <!-- Events Grid -->
    <% if (events.isEmpty()) { %>
    <div class="text-center py-20">
        <div class="text-5xl mb-4">🔍</div>
        <h3 class="text-xl font-bold text-slate-700 mb-2">No events found</h3>
        <p class="text-slate-500">Try a different category or check back later.</p>
    </div>
    <% } else { %>
    <div class="grid md:grid-cols-2 lg:grid-cols-3 gap-6">
        <% for (Event event : events) { %>
        <div class="event-card bg-white rounded-2xl overflow-hidden border border-slate-100 shadow-sm">

            <!-- Event image / colour band -->
            <div class="h-44 flex items-end relative overflow-hidden
                <%  if("music" .equals(event.getCategory())) out.print("bg-gradient-to-br from-purple-600 to-pink-600");
                    else if("sports".equals(event.getCategory())) out.print("bg-gradient-to-br from-emerald-500 to-teal-600");
                    else if("tech"  .equals(event.getCategory())) out.print("bg-gradient-to-br from-blue-600 to-cyan-600");
                    else if("arts"  .equals(event.getCategory())) out.print("bg-gradient-to-br from-orange-500 to-red-500");
                    else if("food"  .equals(event.getCategory())) out.print("bg-gradient-to-br from-yellow-400 to-orange-500");
                    else out.print("bg-gradient-to-br from-indigo-500 to-purple-600"); %>">
                <div class="absolute top-3 left-3">
                    <span class="bg-black/30 backdrop-blur-sm text-white text-xs font-bold px-3 py-1 rounded-full capitalize"><%= event.getCategory() %></span>
                </div>
                <% if (event.getAvailableTickets() == 0) { %>
                <div class="absolute top-3 right-3">
                    <span class="bg-red-500 text-white text-xs font-bold px-3 py-1 rounded-full">SOLD OUT</span>
                </div>
                <% } else if (event.getAvailableTickets() < 30) { %>
                <div class="absolute top-3 right-3">
                    <span class="bg-amber-500 text-white text-xs font-bold px-2 py-1 rounded-full animate-pulse">🔥 Almost Gone</span>
                </div>
                <% } %>
                <div class="p-4 w-full">
                    <div class="text-white font-black text-2xl">LKR <%= String.format("%,.0f", event.getPrice()) %></div>
                    <div class="text-white/70 text-xs"><%= event.getAvailableTickets() %> / <%= event.getTotalTickets() %> seats left</div>
                </div>
            </div>

            <!-- Event details -->
            <div class="p-5">
                <h3 class="font-black text-slate-900 text-base mb-2 leading-snug"><%= event.getTitle() %></h3>
                <p class="text-slate-500 text-xs mb-3 line-clamp-2"><%= event.getDescription() != null ? event.getDescription() : "" %></p>
                <div class="space-y-1 mb-4">
                    <div class="flex items-center gap-2 text-xs text-slate-500">
                        <span>📅</span> <%= event.getEventDate() %>
                    </div>
                    <div class="flex items-center gap-2 text-xs text-slate-500">
                        <span>📍</span> <%= event.getVenue() %>
                    </div>
                </div>

                <!-- Availability bar -->
                <div class="mb-4">
                    <div class="w-full bg-slate-100 rounded-full h-1.5">
                        <div class="h-1.5 rounded-full bg-indigo-500"
                             style="width:<%= event.getTotalTickets() > 0 ? Math.min(100, (int)(((double)(event.getTotalTickets()-event.getAvailableTickets())/event.getTotalTickets())*100)) : 0 %>%"></div>
                    </div>
                </div>

                <!-- Book button -->
                <% if (event.getAvailableTickets() == 0) { %>
                    <button disabled class="w-full py-2.5 bg-slate-200 text-slate-400 rounded-xl font-bold text-sm cursor-not-allowed">Sold Out</button>
                <% } else if (currentUser == null) { %>
                    <a href="login.jsp" class="block w-full py-2.5 bg-indigo-600 hover:bg-indigo-700 text-white rounded-xl font-bold text-sm text-center transition">Login to Book</a>
                <% } else if ("customer".equals(currentUser.getRole())) { %>
                    <button onclick="openBookingModal(<%= event.getId() %>, '<%= event.getTitle().replace("'","") %>', <%= event.getPrice() %>, <%= event.getAvailableTickets() %>)"
                            class="w-full py-2.5 bg-indigo-600 hover:bg-indigo-700 text-white rounded-xl font-bold text-sm transition">Book Now →</button>
                <% } else { %>
                    <button disabled class="w-full py-2.5 bg-slate-200 text-slate-400 rounded-xl font-bold text-sm cursor-not-allowed">Admin accounts cannot book</button>
                <% } %>
            </div>
        </div>
        <% } %>
    </div>
    <% } %>
</div>

<!-- Booking Modal -->
<div id="bookingModal" class="fixed inset-0 z-50 hidden items-center justify-center bg-slate-900/60 backdrop-blur-sm p-4">
    <div class="bg-white rounded-3xl shadow-2xl w-full max-w-md p-8 relative">
        <button onclick="closeBookingModal()" class="absolute top-4 right-4 w-9 h-9 flex items-center justify-center rounded-full bg-slate-100 hover:bg-slate-200 text-slate-500 font-bold text-lg transition">✕</button>

        <h3 class="text-2xl font-black text-slate-900 mb-1">🎟️ Book Tickets</h3>
        <p id="modalEventTitle" class="text-slate-500 text-sm mb-6"></p>

        <form action="BookEventServlet" method="POST">
            <input type="hidden" id="modalEventId"   name="eventId">
            <input type="hidden" id="modalEventPrice" name="eventPrice">

            <label class="block text-sm font-bold text-slate-700 mb-3 text-center">Number of Tickets</label>
            <div class="flex items-center justify-center gap-5 mb-2">
                <button type="button" onclick="changeQty(-1)" class="w-12 h-12 rounded-full bg-slate-100 hover:bg-indigo-100 hover:text-indigo-600 text-2xl font-black transition">−</button>
                <span id="qtyDisplay" class="text-4xl font-black text-slate-900 w-14 text-center">1</span>
                <button type="button" onclick="changeQty(1)"  class="w-12 h-12 rounded-full bg-slate-100 hover:bg-indigo-100 hover:text-indigo-600 text-2xl font-black transition">+</button>
            </div>
            <input type="hidden" id="qtyInput" name="quantity" value="1">
            <p class="text-center text-xs text-slate-400 mb-6">Available: <span id="availDisplay" class="font-bold text-indigo-600"></span> seats</p>

            <div class="flex justify-between items-center mb-6 p-4 bg-indigo-50 rounded-2xl border border-indigo-100">
                <span class="text-slate-600 font-semibold text-sm">Total Amount</span>
                <span id="totalDisplay" class="text-2xl font-black text-indigo-600">LKR 0</span>
            </div>

            <div class="flex gap-3">
                <button type="button" onclick="closeBookingModal()" class="flex-1 py-3 bg-slate-100 text-slate-600 rounded-xl font-bold text-sm hover:bg-slate-200 transition">Cancel</button>
                <button type="submit" class="flex-1 py-3 bg-indigo-600 text-white rounded-xl font-bold text-sm hover:bg-indigo-700 transition">Confirm Booking</button>
            </div>
        </form>
    </div>
</div>

<script>
    let maxAvail = 0, pricePerTicket = 0, currentQty = 1;

    function openBookingModal(id, title, price, avail) {
        maxAvail = avail; pricePerTicket = price; currentQty = 1;
        document.getElementById('modalEventId').value    = id;
        document.getElementById('modalEventPrice').value = price;
        document.getElementById('modalEventTitle').textContent = title;
        document.getElementById('availDisplay').textContent    = avail;
        updateQty();
        document.getElementById('bookingModal').classList.remove('hidden');
        document.getElementById('bookingModal').classList.add('flex');
    }

    function closeBookingModal() {
        document.getElementById('bookingModal').classList.add('hidden');
        document.getElementById('bookingModal').classList.remove('flex');
    }

    function changeQty(d) {
        currentQty = Math.max(1, Math.min(maxAvail, currentQty + d));
        updateQty();
    }

    function updateQty() {
        document.getElementById('qtyDisplay').textContent = currentQty;
        document.getElementById('qtyInput').value         = currentQty;
        document.getElementById('totalDisplay').textContent = 'LKR ' + (pricePerTicket * currentQty).toLocaleString();
    }

    // Close on backdrop click
    document.getElementById('bookingModal').addEventListener('click', function(e) {
        if (e.target === this) closeBookingModal();
    });
</script>
</body>
</html>
