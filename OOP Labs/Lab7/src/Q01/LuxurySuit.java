package Q01;

public class LuxurySuit extends Room{
    private boolean brakfastIncluded;
    private boolean airportPickupIncluded;

    public LuxurySuit() {
        super();
        this.brakfastIncluded=false;
        this.airportPickupIncluded = false;
    }

    public LuxurySuit(String guestName, int numberOfNightsStayed, int roomNumber, boolean airportPickupIncluded, boolean brakfastIncluded) {
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
        super.displayRoomDetails();
        System.out.println("Breakfast Included : "+((brakfastIncluded)?"Included":"Not Included"));
        System.out.println("Airpost pickup : "+((airportPickupIncluded)?"Included":"Not Included"));
        System.out.println("Total room cost : "+calculateRoomCost());
        System.out.println("Discounted Cost (per night $15 off): "+super.calculateRoomCost(15));
    }
}
