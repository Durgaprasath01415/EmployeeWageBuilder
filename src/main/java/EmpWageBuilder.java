import javax.imageio.stream.ImageInputStream;
import java.util.LinkedList;

public class EmpWageBuilder implements IComputeEmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

   private LinkedList<CompanyEmpWage> computeEmpWageList;

   public EmpWageBuilder(){
        computeEmpWageList = new LinkedList<>();
   }
public void addCompanyEmpWage(String company, int ratePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
       CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,ratePerHour,numOfWorkingDays,maxHoursPerMonth);
       computeEmpWageList.add(companyEmpWage);
}

    public void computeEmpWage() {
        for (int i = 0; i < computeEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = computeEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.calculationEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }


    public int calculationEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
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
        return totalEmpHrs * companyEmpWage.ratePerHour;
           }

    public static void main(String[] args) {
        EmpWageBuilder empwagebuilder = new EmpWageBuilder();
        empwagebuilder.addCompanyEmpWage("Dmart", 20, 20, 100);
        empwagebuilder.addCompanyEmpWage("Infosys", 20, 25, 150);
        empwagebuilder.computeEmpWage();
    }
}
