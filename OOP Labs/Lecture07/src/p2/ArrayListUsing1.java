package p2;

import java.util.ArrayList;

public class ArrayListUsing1 {

    static void main(String[] args) {

        //ArrayList<Integer> arrayList = new ArrayList<Integer>();

        ArrayList arrayList = new ArrayList();

        //arrayList.add(123);
        //arrayList.add(1234556);
        arrayList.add("Subhanu");
        //arrayList.add(12.23);
        //arrayList.add('c');

        //arrayList.set(3,24);

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println();

        for (String t:arrayList){  //(:Array List object reference name)
            System.out.println();
        }
    }
}