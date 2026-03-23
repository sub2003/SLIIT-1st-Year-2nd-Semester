package Lab2Exercises;

import java.util.Scanner;
        public class InsertionSort {



            public int []insertionSortAscendingOrder(int array[]){//sort the array in ascending order.
                for (int j =1;j<array.length;j++){
                    int key =array[j];
                    int i=j-1;
                    while (i>=0 && array[i]>key){
                        array[i+1]=array[i];
                        i=i-1;
                    }
                    array[i+1]=key;
                }
                return array;
            }



            public int []insertionSortDescendingorder(int array[]){//sort the array in descending order.
                for (int j =1;j<array.length;j++){
                    int key =array[j];
                    int i=j-1;
                    while (i>=0 && array[i]<key){
                        array[i+1]=array[i];

                        i=i-1;
                    }
                    array[i+1]=key;
                }
                return array;
            }




            public int AscendinShifts(int array[]){
                int shifts=0;
                for (int j =1;j<array.length;j++){
                    int key =array[j];
                    int i=j-1;
                    while (i>=0 && array[i]>key){
                        shifts++;
                        array[i+1]=array[i];
                        i=i-1;
                    }
                    array[i+1]=key;
                }
                return shifts;
            }




            public int DescendingShifts(int array[]){
                int shifts=0;
                for (int j =1;j<array.length;j++){
                    int key =array[j];
                    int i=j-1;
                    while (i>=0 && array[i]<key){
                        shifts++;
                        array[i+1]=array[i];
                        i=i-1;
                    }
                    array[i+1]=key;
                }
                return shifts;
            }




            public static void main(String[]args){
                Scanner scn=new Scanner(System.in);

                System.out.print("Enter the array size : ");
                int arraySize= scn.nextInt();

                int array[]=new int[arraySize];

                for (int i=0;i<array.length;i++){
                    System.out.print("Enter "+(i+1)+" number : ");
                    array[i]=scn.nextInt();
                }



                System.out.println("You entered : ");
                System.out.print("[");
                for (int i=0;i<array.length;i++){
                    System.out.print(array[i]);
                    if (!(i==(array.length-1))){
                        System.out.print(", ");
                    }

                }
                System.out.println("]");

                //we cant use like this
                /*
                int AscendingArray[]=new int[arraySize];
                AscendingArray=array;
                int DescendingArray[]=new int[arraySize];
                DescendingArray=array;
                */
                /*Because,
                      We clone an array to create a separate copy of the data, so that changes made to one array do not affect the original array.
                      In Java, when you assign one array to another like this:
                      int b[] = a;
                      you are not copying the array values.
                      Instead, both variables point to the same array in memory.
                      So if you change b, the original array a also changes.
                */

                int AscendingArray[] = array.clone();
                int DescendingArray[] = array.clone();


                Lab2Exercises.InsertionSort is=new Lab2Exercises.InsertionSort();
                AscendingArray=is.insertionSortAscendingOrder(AscendingArray);


                System.out.println("----Insertion sort----");
                System.out.println("Accending Order");
                System.out.print("[");
                for (int i=0;i<array.length;i++){
                    System.out.print(AscendingArray[i]);
                    if (!(i==(array.length-1))){
                        System.out.print(", ");
                    }
                }
                System.out.println("]");

                System.out.println("\n\n\n\n");


                //Checking the array remain the same as user entered.
                System.out.print("[");
                for (int i=0;i<array.length;i++){
                    System.out.print(array[i]);
                    if (!(i==(array.length-1))){
                        System.out.print(", ");
                    }

                }
                System.out.println("]");
                //


                System.out.println("\n\n\n\n");

                DescendingArray=is.insertionSortDescendingorder(DescendingArray);

                System.out.println("Decending Order");
                System.out.print("[");
                for (int i=0;i<array.length;i++){
                    System.out.print(DescendingArray[i]);
                    if (!(i==(array.length-1))){
                        System.out.print(", ");
                    }
                }
                System.out.println("]");

                System.out.println("\n\n\n\n");

                //Checking the array remain the same as user entered.
                System.out.print("[");
                for (int i=0;i<array.length;i++){
                    System.out.print(array[i]);
                    if (!(i==(array.length-1))){
                        System.out.print(", ");
                    }

                }
                System.out.println("]");
                //

                System.out.println("\n\n\n\n");

                System.out.println();

                int aShifts[] = array.clone();
                int dShifts[] = array.clone();

                System.out.println("Ascending shifts are : "+is.AscendinShifts(aShifts));
                System.out.println("Descending shifts are : "+is.DescendingShifts(dShifts));

            }
        }



