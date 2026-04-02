package Q01;

public class Room {
    protected int roomNumber;
    protected String guestName;
    protected int numberOfNightsStayed;

    public Room() {
        this.guestName = "";
        this.numberOfNightsStayed = 0;
        this.roomNumber = 0;
    }

    public Room(String guestName, int numberOfNightsStayed, int roomNumber) {
        this.guestName = guestName;
        this.numberOfNightsStayed = numberOfNightsStayed;
        this.roomNumber = roomNumber;
    }

    public void displayRoomDetails(){
        System.out.println("Room number : "+roomNumber);
        System.out.println("Guest Name : "+guestName);
        System.out.println("Number of nights stayed : "+numberOfNightsStayed);
    }

    public double calculateRoomCost(){
        return 150.00*numberOfNightsStayed;
    }
    public double calculateRoomCost(int discountPerNight){
        return calculateRoomCost()-discountPerNight*numberOfNightsStayed;
    }

}
