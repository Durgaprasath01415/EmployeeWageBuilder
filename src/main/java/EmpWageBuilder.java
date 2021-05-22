import javax.imageio.stream.ImageInputStream;

public class EmpWageBuilder {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public final String Company;
    public final int ratePerHour;
    public final int no_of_Working_Days;
    public final int maxHour;

    public EmpWageBuilder(String company, int ratePerHour, int no_of_Working_Days, int maxHour) {
        this.Company = company;
        this.ratePerHour = ratePerHour;
        this.no_of_Working_Days = no_of_Working_Days;
        this.maxHour = maxHour;
    }
        public int calculationEmpWage ( ) {
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
                int Wage = (ratePerHour * empHrs);
                totalSalary += Wage;
            }
            return totalSalary;
        }
    public static void main(String[] args) {
        EmpWageBuilder Dmart = new EmpWageBuilder ("Dmart", 20, 20, 100);
        EmpWageBuilder Infosys = new EmpWageBuilder("Infosys", 20, 25, 150);
        System.out.println("Employee Wage for Dmart " + Dmart.calculationEmpWage());
        System.out.println("Employee Wage for Infosys " + Infosys.calculationEmpWage());
    }
}

