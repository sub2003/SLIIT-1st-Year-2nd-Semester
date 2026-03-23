package Q3;

public class Driver {
    private String driverId;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    public Driver(String driverId, String driverName) {
        this.driverId = driverId;
        this.driverName = driverName;
    }

    public Driver(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Driver(String driverId, String driverName, double baseSalary, int performanceScore) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        this.performanceScore = performanceScore;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        if (performanceScore > 1) {
            this.performanceScore = performanceScore;
        }
        else
            this.performanceScore=1;
    }
    public double calculateBonus(){
        double Bonus=0.0;
        if(getPerformanceScore()==5){
            Bonus=baseSalary*0.25;
        } else if (getPerformanceScore()==4) {
            Bonus=baseSalary*0.2;
        } else if (getPerformanceScore()==3) {
            Bonus=baseSalary*0.15;
        } else if (getPerformanceScore()==2) {
            Bonus=baseSalary*0.1;
        }
        return Bonus;
    }
    public double calculateBonus(double customRatingBonus){
        double crb=calculateBonus()+customRatingBonus;
        return crb;

    }
    public double calculateTotalSalary(){
        double TotalSalary=baseSalary+calculateBonus();
        return TotalSalary;
    }

    public void displayDetails(){
        System.out.println("Driver ID: "+getDriverId());
        System.out.println("Name: "+driverName);
        System.out.println("Base Salary: "+baseSalary);
        System.out.println("Performance Score: "+getPerformanceScore());
        System.out.println("Bonus: "+calculateBonus());
        System.out.println("Total Salary: "+calculateTotalSalary());
        System.out.println();
    }

    public static void main(String[] args) {

        Driver d1=new Driver("D1001","John Smith");
        d1.baseSalary=4000;
        d1.performanceScore=5;

        Driver d2=new Driver(3500);
        d2.setDriverId("D1002");
        d2.driverName="Emily Davis";
        d2.performanceScore=3;

        Driver d3=new Driver("D1003","Michael Johnson",5000,1);

        d1.displayDetails();
        d2.displayDetails();
        d3.displayDetails();

        System.out.println("Bonus for driver3 with custom rating 4: "+d3.calculateBonus(1000));
    }
}
