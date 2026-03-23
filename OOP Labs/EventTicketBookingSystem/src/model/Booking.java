package model;

public class Booking {

    private int userId;
    private int eventId;
    private int tickets;

    public Booking(int userId, int eventId, int tickets) {
        this.userId = userId;
        this.eventId = eventId;
        this.tickets = tickets;
    }

    public int getUserId() {
        return userId;
    }

    public int getEventId() {
        return eventId;
    }

    public int getTickets() {
        return tickets;
    }
}