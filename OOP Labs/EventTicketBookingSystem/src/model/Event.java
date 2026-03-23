package model;

public class Event {

    private int id;
    private String title;
    private String location;
    private String date;
    private String description;

    public Event(String title, String location, String date, String description) {
        this.title = title;
        this.location = location;
        this.date = date;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}