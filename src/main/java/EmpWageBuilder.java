import javax.imageio.stream.ImageInputStream;
public class EmpWageBuilder implements IComputeEmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int numOfCompany = 0;
   private CompanyEmpWage[] companyEmpWageArray;

   public EmpWageBuilder(){
        companyEmpWageArray = new CompanyEmpWage[5];
   }
public void addCompanyEmpWage(String company, int ratePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
       companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,ratePerHour,numOfWorkingDays,maxHoursPerMonth);
       numOfCompany++;
}

    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.calculationEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    @Override
    public int getTotalWage(String company) {
        return 0;
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
