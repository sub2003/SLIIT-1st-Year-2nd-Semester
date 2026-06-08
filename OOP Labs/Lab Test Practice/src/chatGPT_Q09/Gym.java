package chatGPT_Q09;

public class Gym {
    private String gymName;
    private Member[] members;
    private int mermbersCount;

    public Gym(String gymName, int size) {
        this.gymName = gymName;
        this.members = new Member[size];
        this.mermbersCount = 0;
    }

    public String getGymName() {
        return gymName;
    }

    public void addMember(Member member1){
        if (mermbersCount<members.length){
            members[mermbersCount]=member1;
            member1.setGym(this);
            mermbersCount++;
        }
        else{
            System.out.println("Gym ember limit reached.");
        }
    }

    public void displayGyMembers(){
        System.out.println("Gym : "+gymName+"\n\n");

        for (int i=0;i<mermbersCount;i++){
            members[i].displayMember();
            System.out.println();
        }
        System.out.println();

    }
}
