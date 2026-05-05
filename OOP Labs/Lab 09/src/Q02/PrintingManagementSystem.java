package Q02;

public class PrintingManagementSystem {
    static void main(String[] args) {

        Printable[] printItems=new Printable[4];

        printItems[0] = new Report("OOP Assignment Report", "Subhanu");
        printItems[1] = new Report("Database Project Report", "Ravisankha");

        printItems[2] = new Invoice( 2500.00,"INV-001");
        printItems[3] = new Invoice( 4750.00,"INV-002");

        for (int i = 0; i < printItems.length; i++) {
            printItems[i].printDetails();
        }
    }
}
