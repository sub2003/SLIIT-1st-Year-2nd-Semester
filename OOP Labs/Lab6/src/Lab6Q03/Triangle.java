package Lab6Q03;

public class Triangle extends Shape {
    double base;
    double height;

    public Triangle() {
        super();
        this.base = 0.0;
        this.height = 0.0;
    }

    public Triangle(String shapeName, double base, double height) {
        super(shapeName);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (1 / 2.0) * base * height;
    }

    @Override
    public void displayShapeDetails() {
        super.displayShapeDetails();
        System.out.println("Base : " + base);
        System.out.println("Height : " + height);
        System.out.println("Area : " + calculateArea());
    }
}


