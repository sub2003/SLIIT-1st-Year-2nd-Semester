package Lab6Q02;

import Lab6Q01.PremiumCourse;

public class MembershipApp {
    static void main(String[] args) {

        BasicMembership bm=new BasicMembership();
        PremiumMembership pm=new PremiumMembership(6,"PM1023","Subhanu Ravisankha",true);


        System.out.println("__________________Basic Membership-------------------- ");
        bm.calculateFee();
        bm.displayMembershipDetails();

        System.out.println();

        System.out.println("__________________Premium Membership------------------ ");
        pm.calculateFee();
        pm.displayMembershipDetails();

    }
}
