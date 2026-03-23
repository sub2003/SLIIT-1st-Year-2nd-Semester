package Q5;

public class Calculator {
    public static int add(int a,int b) {
        return a+b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }

    public static int square(int a){
        return a*a;
    }

    public static void main(String[] args) {

        int p1=square(add(multiply(3,4),multiply(5,7)));
        int p2=add(square(add(4,7)),square(add(8,3)));

        System.out.println("(3*4+5*7)^2 = "+p1);
        System.out.println("(4+7)^2+(8+3)^2 = "+p2);
    }
}