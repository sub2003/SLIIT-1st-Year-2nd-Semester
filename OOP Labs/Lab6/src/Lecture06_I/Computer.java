package Lecture06_I;

public class Computer {
    private Processor processor;
    private Memory memory;
    private String brand;

    public Computer(String pbrand, String pProcessorModel, int pmemorySize) {
        this.brand = pbrand;
        processor = new Processor(pProcessorModel);
        memory = new Memory(pmemorySize);
    }

    public void displayComputerDetails() {
        System.out.println("Computer Brand: " + brand);
        processor.displayProcessor();
        memory.displayMemory();
    }
}
