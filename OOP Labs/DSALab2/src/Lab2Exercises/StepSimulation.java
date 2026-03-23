package Lab2Exercises;

import java.util.Scanner;
public class StepSimulation {
    public int []insertionSortAscendingOrder(int array[]){//sort the array in ascending order.

        System.out.print("Initial List: ");//printing initial list
        System.out.print("[");
        for (int a=0;a<array.length;a++){
            System.out.print(array[a]);
            if (!(a==(array.length-1))){
                System.out.print(", ");
            }

        }

        //printing steps
        System.out.println("]");

        for (int j =1;j<array.length;j++){
            int key =array[j];
            int i=j-1;
            while (i>=0 && array[i]>key){
                array[i+1]=array[i];
                i=i-1;
            }
            array[i+1]=key;

            System.out.print("Step "+j+" :");
            System.out.print("[");
            for (int a=0;a<array.length;a++){
                System.out.print(array[a]);
                if (!(a==(array.length-1))){
                    System.out.print(", ");
                }

            }
            System.out.println("]");



        }
        return array;
    }

    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        StepSimulation ss=new StepSimulation();

        System.out.print("Enter the number of elements: ");
        int elements[]=new int[scn.nextInt()];

        System.out.print("Enter the elements: ");

        for (int i=0;i<elements.length;i++){//Entering elements or values to the array
            elements[i]=scn.nextInt();
        }

        int ascendingList[]=new int[elements.length];
        ascendingList= ss.insertionSortAscendingOrder(elements.clone());

        System.out.println();

        System.out.print("Sorted List: ");  //printing sorted list
        System.out.print("[");
        for (int a=0;a<elements.length;a++){
            System.out.print(ascendingList[a]);
            if (!(a==(ascendingList.length-1))){
                System.out.print(", ");
            }

        }
        System.out.println("]");

    }

}
