package Q01;

public class StandardRoom extends Room{
    private boolean wifiIncluded;

    public StandardRoom() {
        super();
        this.wifiIncluded = false;
    }

    public StandardRoom(String guestName, int numberOfNightsStayed, String roomNumber, boolean wifiIncluded) {
        super(guestName, numberOfNightsStayed, roomNumber);
        this.wifiIncluded = wifiIncluded;
    }

    @Override
    public double calculateRoomCost() {
        return 100*numberOfNightsStayed;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("--- Standard Room ---");
        super.displayRoomDetails();
        System.out.println("Wi-Fi Included : "+((wifiIncluded)?"Included":"No"));
        System.out.println("Total Cost : $"+calculateRoomCost());
        System.out.println("Discounted Cost (per night $10 off): "+super.calculateRoomCost(10));
    }
}
