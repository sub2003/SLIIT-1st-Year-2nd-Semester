package Q05;

public class EmployeePayrollSystem {

    static void main(String[] args) {

        PermanentEmployee pe1=new PermanentEmployee("PE1001","Subhanu Ravisankha Aththanayaka",450000);
        ContractEmployee ce1=new ContractEmployee("CE3425","Ravindu Kalhara",100);

        pe1.generatePaySlip();
        ce1.generatePaySlip();
    }
}
