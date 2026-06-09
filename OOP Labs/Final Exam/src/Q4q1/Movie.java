package Q4q1;

public class Movie {
    String movieID;
    String title;
    double rentalPricePerDay;

    public Movie(String movieID, double rentalPricePerDay, String title) {
        this.movieID = movieID;
        this.rentalPricePerDay = rentalPricePerDay;
        this.title = title;
    }

    public String getMovieID(){
        return movieID;
    }
    public void displayDetails(){
        System.out.println("Movie title : "+title);
        System.out.println("Movie ID : "+movieID);
        System.out.println("Rental Price Per Day : "+rentalPricePerDay);
    }

}
