package Lab07;

import java.util.Scanner;

public class Algorithms {

    public void bubbleSort(int[] array){
        int n= array.length;

        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){

                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

    }



    static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        Algorithms algo=new Algorithms();

        int [] arr=new int[8];

        for (int i=0;i<8;i++){
            System.out.print("Enter "+(i+1)+" number : ");
            arr[i]=scn.nextInt();

        }

        algo.bubbleSort(arr);

        System.out.print("Sorted Array is : ");
        for (int i=0;i<8;i++){
            System.out.print(arr[i]);
            if (i!=7){
                System.out.print(", ");
            }

        }
    }
}
