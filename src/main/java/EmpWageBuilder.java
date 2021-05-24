import javax.imageio.stream.ImageInputStream;

public class EmpWageBuilder {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final int ratePerHour;
    private final int no_of_Working_Days;
    private final int maxHour;
    private final String Company;
    private int totalEmpWage;

    public EmpWageBuilder(String company, int ratePerHour, int no_of_Working_Days, int maxHour) {
        this.Company = company;
        this.ratePerHour = ratePerHour;
        this.no_of_Working_Days = no_of_Working_Days;
        this.maxHour = maxHour;
    }

    public void calculationEmpWage() {
        int empHrs = 0, totalSalary = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= maxHour && totalWorkingDays < no_of_Working_Days) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * ratePerHour;
    }

    @Override
    public String toString(){
        return "Total Emp Wage for Company: " +Company + " is: "+totalEmpWage;
    }
    public static void main(String[] args) {
        EmpWageBuilder dMart = new EmpWageBuilder ("Dmart", 20, 20, 100);
        EmpWageBuilder Infosys = new EmpWageBuilder("Infosys", 20, 25, 150);
        dMart.calculationEmpWage();
        System.out.println(dMart);
        Infosys.calculationEmpWage();
        System.out.println(Infosys);
    }
}
