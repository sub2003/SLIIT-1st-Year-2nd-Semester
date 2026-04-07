package Q1;

class B extends A {
    private int a;
    public B() {
        super(10);
        System.out.println("B");
    }

    public B(int a) {
        super(15);
        this.a=a;
        System.out.println("BC");
    }

    public B(int a, int a1) {
        super(20);
        this.a = a1;
    }

    public void display(){
        super.display();

    }

}
