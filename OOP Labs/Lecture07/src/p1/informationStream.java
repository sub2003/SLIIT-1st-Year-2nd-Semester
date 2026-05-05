package p1;

import java.util.ArrayList;

public class informationStream {

    static void main(String[] args) {

        ArrayList<Integer> info=new ArrayList<Integer>();

        info.add(52);
        info.add(34);
        info.add(45);
        info.add(49);
        info.add(34);
        info.add(56);
        info.add(57);
        info.add(100);
        info.set(3,56);

        System.out.println(info.isEmpty());

        for (int i =0;i<info.size();i++){
            System.out.println(info.get(i));
        }
        System.out.println(info);

        System.out.println(info.contains(56));
        System.out.println(info.indexOf(56));

        //System.out.println(info);

        System.out.println(info.get(4));

        if(info.contains(100)){
            System.out.println("it contains 100%");
        }
    }
}
