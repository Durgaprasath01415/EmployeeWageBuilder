import javax.swing.*;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int RatePerHour = 20;
        final int No_Of_Working_Days = 20;
        int empHrs = 0;
        int TotalSalary = 0;
        for (int day = 1; day <= No_Of_Working_Days; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(empCheck);
            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Full Time Employee");
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Part Time Employee");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }
            int Wage = (RatePerHour * empHrs);
            System.out.println("Wage of Employee = " + Wage);
            TotalSalary += Wage;
        }
        System.out.println("Total Salary =" + TotalSalary);
    }
}