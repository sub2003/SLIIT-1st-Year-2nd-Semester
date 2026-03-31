package Lab6Q02;

public class Membership {
    protected String membershipID;
    protected String memberName;
    protected int durationMonths;

    public Membership() {
        this.membershipID = "";
        this.memberName = "";
        this.durationMonths = 0;
    }

    public Membership(int durationMonths, String membershipID, String memberName) {
        this.durationMonths = durationMonths;
        this.membershipID = membershipID;
        this.memberName = memberName;
    }

    public void displayMembershipDetails(){
        System.out.println("Membership ID : "+membershipID);
        System.out.println("Membership Name : "+memberName);
        System.out.println("Duration : "+durationMonths+" months");
    }

    public double calculateFee(){
        return 5000.00;
    }
    public double calculateFee(double discountPercentage){
        return calculateFee()-calculateFee()*discountPercentage;
    }
}
