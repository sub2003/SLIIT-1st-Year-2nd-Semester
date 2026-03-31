package Lab6Q03;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle() {
        super();
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(String shapeName, double length, double width) {
        super(shapeName);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public void displayShapeDetails() {
        super.displayShapeDetails();
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
        System.out.println("Area : "+calculateArea());
    }
}
