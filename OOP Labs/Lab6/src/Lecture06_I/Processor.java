package Lecture06_I;

public class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    public void displayProcessor() {
        System.out.println("Processor Model: " + model);
    }
}