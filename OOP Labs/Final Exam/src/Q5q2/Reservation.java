package Q5q2;

public class Reservation {

    private String reservationID;
    private String roomType;
    private double roomCharge;
    private Guest guest;

    public Reservation(Guest guest, String reservationID, double roomCharge, String roomType) {
        this.guest = guest;
        this.reservationID = reservationID;
        this.roomCharge = roomCharge;
        this.roomType = roomType;
    }

    public double getRoomCharge() {
        return roomCharge;
    }

    public String getReservationID() {
        return reservationID;
    }

    public String getRoomType() {
        return roomType;
    }

    public double calculateTotalBill(){
        double serviceCharge=0.0;

        if(guest.getStayDays()>5){
            serviceCharge=3000.00;
        }
        return getRoomCharge()+serviceCharge;
    }

    public  void reservationInformation(){

        System.out.println("Guest name : "+guest.getGuestName());
        System.out.println("Guest ID : "+guest.getGuestID());
        System.out.println("Number of stay days, : "+guest.getStayDays());
        System.out.println("Room Type : "+getRoomType());
        System.out.println("Reservation ID : "+getReservationID());
        System.out.println("Total bill : "+calculateTotalBill());

    }
}
