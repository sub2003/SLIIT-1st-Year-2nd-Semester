package TutorialQ01;

public class Processor {

    private String model;

    Processor(String m){
        model=m;
    }

    public void displayProcessorDetails(){
        System.out.println("Processor model is : "+model);
    }
}
