package Lab6Q02;

public class PremiumMembership extends Membership {
    boolean includePersonalTraining;

    public PremiumMembership() {
        super();
        this.includePersonalTraining = false;
    }

    public PremiumMembership(int durationMonths, String membershipID, String memberName, boolean includePersonalTraining) {
        super(durationMonths, membershipID, memberName);
        this.includePersonalTraining = includePersonalTraining;
    }

    @Override
    public double calculateFee() {
        return (300*durationMonths)+((includePersonalTraining)?100:0);
    }

    @Override
    public void displayMembershipDetails() {
        super.displayMembershipDetails();
        System.out.println("Total Fee : "+calculateFee());
        System.out.println("Provide Personal Training ? "+((includePersonalTraining)?"Yes":"No"));
    }
}
