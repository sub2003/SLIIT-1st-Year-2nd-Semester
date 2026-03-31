package Lab6Q02;

public class BasicMembership extends Membership {
    boolean hasGymAccess;

    public BasicMembership() {
        this.hasGymAccess = false;
        super();
    }

    public BasicMembership(int durationMonths, String membershipID, String memberName, boolean hasGymAccess) {
        super(durationMonths, membershipID, memberName);
        this.hasGymAccess = hasGymAccess;
    }

    @Override
    public double calculateFee() {
        return 200*durationMonths;
    }

    @Override
    public void displayMembershipDetails() {
        super.displayMembershipDetails();
        System.out.println("Total Fee : "+calculateFee());
        System.out.println("Gym access : "+((hasGymAccess)?"Yes":"No"));
    }
}
