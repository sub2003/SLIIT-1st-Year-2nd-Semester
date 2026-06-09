package Q4q1;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieRentalShop {
    static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        ArrayList<Movie> catelog = new ArrayList<Movie>();

        while (true) {
            System.out.print("Enter movie ID : ");
            String id = scn.nextLine();
            if (id.equalsIgnoreCase("S")) {
                break;
            }
            System.out.print("Enter movie title : ");
            String title = scn.nextLine();

            System.out.print("Enter price : ");
            double price = scn.nextDouble();
            scn.nextLine();

            Movie m = new Movie(id, price, title);
            catelog.add(m);
        }


        System.out.print("Enter movie ID to remove : ");
        String removeID = scn.nextLine();

        for (int i=0;i<catelog.size();i++) {
            if (catelog.get(i).getMovieID().equalsIgnoreCase(removeID)){
                catelog.remove(i);


                System.out.println("Movie removed successfully.");
                break;
            }
            else{
                System.out.println("Movie ID not found. No movie removed.");
            }
        }

        System.out.println("Total number of movies currently in the catalog: " + catelog.size());

        System.out.println("Remaining movies:");

        for(Movie movie:catelog){
            movie.displayDetails();
        }

        scn.close();
    }
}
