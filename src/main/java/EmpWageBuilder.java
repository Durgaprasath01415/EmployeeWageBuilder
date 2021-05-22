public class EmpWageBuilder {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static int calculationEmpWage(int ratePerHour, int no_of_Working_Days, int maxHour) {
        System.out.println("Welcome to Employee Wage Computation");
        int empHrs = 0, totalSalary = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS)
        {
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
        int empWage= calculationEmpWage(20,20,100);
        System.out.println("Employee wage = " +empWage);
        }
    }
}
