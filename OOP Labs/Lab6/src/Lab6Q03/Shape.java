package Lab6Q03;

public class Shape {
    protected String shapeName;

    public Shape() {
        this.shapeName="";
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public void displayShapeDetails(){
        System.out.println("Shape is : "+shapeName);
    }

    public double calculateArea(){
        return 0.0;
    }

    public double calculateArea(double factor){
        return calculateArea()*factor;
    }

}
