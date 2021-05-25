
interface IComputeEmpWage {
    public void addCompanyEmpWage(String company,int ratePerHour, int numOfWorkingDays,int maxHoursPerMonth);
    public void computeEmpWage();
}
public class CompanyEmpWage {
    public final String company;
    public final int ratePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;

    public CompanyEmpWage(String company, int ratePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.ratePerHour = ratePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
}
    @Override
    public String toString(){
        return "Total Emp Wage for Company "+ company + " is: "+ totalEmpWage;
        
    }
}
