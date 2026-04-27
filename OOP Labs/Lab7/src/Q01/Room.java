package Q01;

public class Room {
    protected String roomNumber;
    protected String guestName;
    protected int numberOfNightsStayed;

    public Room() {
        this.guestName = "Unknown";
        this.numberOfNightsStayed = 0;
        this.roomNumber = "000";
    }

    public Room(String guestName, int numberOfNightsStayed, String roomNumber) {
        this.guestName = guestName;
        this.numberOfNightsStayed = numberOfNightsStayed;
        this.roomNumber = roomNumber;
    }

    public void displayRoomDetails(){
        System.out.println("Room number : "+roomNumber);
        System.out.println("Guest Name : "+guestName);
        System.out.println("Nights : "+numberOfNightsStayed);
    }

    public double calculateRoomCost(){
        return 150.00*numberOfNightsStayed;
    }
    public double calculateRoomCost(int discountPerNight){
        return calculateRoomCost()-discountPerNight*numberOfNightsStayed;
    }

}
