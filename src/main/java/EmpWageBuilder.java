public class EmpWageBuilder {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static int calculationEmpWage(String company , int ratePerHour, int no_of_Working_Days, int maxHour) {
        System.out.println("Welcome to Employee Wage Computation");
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
            System.out.println("Day: " +totalWorkingDays +" Emp Hr: " +empHrs);
        }
        int totalEmpWage = totalEmpHrs * ratePerHour;
        System.out.println("Total Emp Wage for Company: " +company + "is: " +totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        calculationEmpWage( "Dmart",20,20,100);
        calculationEmpWage( "Infosys",18,25,80);


    }
}