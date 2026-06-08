package chatGPT_Q09;

public class Member {
    private String memberName;
    private String membershipType;
    private double monthlyFee;
    private Gym gym;

    public Member( String memberName, String membershipType, double monthlyFee) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.monthlyFee = monthlyFee;
    }

    public void setGym(Gym gym1) {
        this.gym = gym;
    }

    public void displayMember(){
        System.out.println("Name : "+memberName);
        System.out.println("Membership Type : "+membershipType);
        System.out.println("Monthly Fee : "+monthlyFee);
        System.out.println("Gym : "+gym.getGymName());
    }
}
