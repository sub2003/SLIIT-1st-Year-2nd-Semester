package Tute06Aggregationpage08;

public class UniversityApp {

    static void main(String[] args) {

        Professor p1=new Professor("Subhanu Ravisankha","Advanced  Machine Learning");
        Professor p2=new Professor("Yenuka Rodrigo","Deep Learning");
        Professor p3=new Professor("Kalith Dabare","Natural Language Processing");

        Professor[] professors={p1,p2,p3};

        University uni=new University("Artificial Inteligence Department",professors,"SLIIT");

        uni.displayUniversityDetails();
    }
}
