package Q5q2;

public class Guest {
    private String guestID;
    private String guestName;
    private int stayDays;


    public Guest(String guestID, String guestName,int stayDays) {
        this.guestID = guestID;
        this.guestName = guestName;
        setStayDays(stayDays);
    }

    public String getGuestID() {
        return guestID;
    }

    public void setGuestID(String guestID) {
        this.guestID = guestID;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getStayDays() {
        return stayDays;
    }

    public void setStayDays(int stayDays) {
        if (stayDays > 0) {
            this.stayDays = stayDays;
        } else {
            System.out.println("Invalid Stay Duration! Defaulting to 1 Day");
            this.stayDays = 1;
        }
    }
}
