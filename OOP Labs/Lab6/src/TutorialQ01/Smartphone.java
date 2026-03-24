package TutorialQ01;

public class Smartphone {
    private String brand;
    private Battery b;
    private Processor p;



    public Smartphone(int bty,String pr,String br){
        brand=br;
        b=new Battery(bty);
        p=new Processor(pr);
    }

    public void displaySmartPhoneDetails(){

        System.out.println("Smart phone brand : "+brand);
        b.displayBatteryDetails();
        p.displayProcessorDetails();
    }



















}
