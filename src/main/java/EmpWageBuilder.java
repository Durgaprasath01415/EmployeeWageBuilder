import javax.swing.*;

public class EmpWageBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int IS_FULL_TiME = 1;
        int RatePerHour = 20;
        int FullHour = 8;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TiME) {
            System.out.println("Employee is Full Time Present");
            int Wage = (RatePerHour * FullHour);
            System.out.println("Wage of Employee = " +Wage);
        }
        else {
            System.out.println("Employee is Absent");
            System.out.println("Wage = 0");
        }
    }
}