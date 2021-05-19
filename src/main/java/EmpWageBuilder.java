import javax.swing.*;

public class EmpWageBuilder
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation");
        int IS_FULL_TiME = 1;
        int IS_PART_TIME = 2;
        int RatePerHour = 20;
        int FullHour = 8;
        int PartHour = 4;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        System.out.println(empCheck);
        if (empCheck == IS_FULL_TiME)
        {
            System.out.println("Employee is Full Time Present");
            int Wage = (RatePerHour * FullHour);
            System.out.println("Wage of Employee = " + Wage);
        }
        else if (empCheck == IS_PART_TIME)
        {
            System.out.println("Employee is Part Time Present");
            int Wage = (RatePerHour * PartHour);
            System.out.println("Wage for Part Time= " + Wage);
        }
        else
        {
            System.out.println("Employee is Absent");
            System.out.println("Wage = 0");
        }
    }
}