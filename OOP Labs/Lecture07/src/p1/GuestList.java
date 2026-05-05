package p1;

import java.util.ArrayList;

public class GuestList {
    static void main(String[] args) {

        ArrayList guests=new ArrayList();

        guests.add("Amali Gunasekara");
        guests.add("Saman Rathnayaka");
        guests.add("Kalani Gamage");
        guests.add(1,"Kamal Rathnayaka");
        guests.add("Roshel Fernando");
        guests.add("Nihal fernando");

        for(int i=0;i< guests.size();i++){
            System.out.println("Guest "+(i+1)+" - "+guests.get(i));
        }

        System.out.println();
    }
}
