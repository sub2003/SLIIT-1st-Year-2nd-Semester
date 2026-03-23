package Q2;

import java.util.Scanner;
public class ProductApp{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);

        Product prd=new Product();

        System.out.print("Enter product name : ");
        prd.setProductName(scn.nextLine());

        System.out.print("Enter product ID : ");
        prd.setProductId(scn.nextInt());

        System.out.print("Enter product price : ");
        prd.setPrice(scn.nextDouble());

        System.out.print("Enter product quantity : ");
        prd.setQuantity(scn.nextInt());

        System.out.println();

        prd.displayDetails();




    }
}
