package ArrayList1;

import java.util.ArrayList;

public class GuestList {
    static void main(String[] args) {


        ArrayList<Integer> guests = new ArrayList<Integer>();
        guests.add(12);

        for (int i = 0; i < guests.size(); i++) {
            System.out.println(guests.get(i));
        }

        guests.remove(Integer.valueOf(12));

        for (int i = 0; i < guests.size(); i++) {
            System.out.println(guests.get(i)+" sndngisngoi");
        }

        guests.remove(1);
    }
}