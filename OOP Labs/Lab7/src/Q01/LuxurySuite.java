package Q01;

public class LuxurySuite extends Room{
    private boolean brakfastIncluded;
    private boolean airportPickupIncluded;

    public LuxurySuite() {
        super();
        this.brakfastIncluded=false;
        this.airportPickupIncluded = false;
    }

    public LuxurySuite(String guestName, int numberOfNightsStayed, String roomNumber, boolean airportPickupIncluded, boolean brakfastIncluded) {
        super(guestName, numberOfNightsStayed, roomNumber);
        this.airportPickupIncluded = airportPickupIncluded;
        this.brakfastIncluded = brakfastIncluded;
    }

    @Override
    public double calculateRoomCost() {
        if (airportPickupIncluded || brakfastIncluded) {
            return 200 * numberOfNightsStayed + 75;
        }
        else{
            return 200 * numberOfNightsStayed;
        }
    }
    @Override
    public void displayRoomDetails() {
        System.out.println("--- Luxury Suite ---");
        super.displayRoomDetails();
        System.out.println("Breakfast & Airport Pickup : "+((brakfastIncluded||airportPickupIncluded)?"Included":"No"));
        System.out.println("Total Cost : $"+calculateRoomCost());
        System.out.println("Discounted Cost (per night $15 off): $"+super.calculateRoomCost(15));
    }
}
