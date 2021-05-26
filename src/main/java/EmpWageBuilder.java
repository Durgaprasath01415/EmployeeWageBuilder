import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilder {
    //Constant
    public static final int IS_FULL_TIME = 1 ;
    public static final int IS_PART_TIME = 2 ;

    //Initializing LinkList and Map
   private LinkedList < CompanyEmpWage > computeEmpWageList ;
   private Map < String , CompanyEmpWage > companyEmpWageMap ;

   //Created Objects for LinkList and Map
   public EmpWageBuilder () {
        computeEmpWageList = new LinkedList < > () ;
        companyEmpWageMap = new HashMap < > () ;
   }

   //Initializing company , ratePerHour , numOfWorkingDays , maxHoursPerMonth and creating object of companyEmpWage and computing it then adding it to LinkList and putting into Map
   public void addCompanyEmpWage ( String company , int ratePerHour , int numOfWorkingDays , int maxHoursPerMonth ) {
       CompanyEmpWage companyEmpWage = new CompanyEmpWage( company , ratePerHour , numOfWorkingDays , maxHoursPerMonth ) ;
       computeEmpWageList.add ( companyEmpWage ) ;
       companyEmpWageMap.put ( company , companyEmpWage ) ;
   }

    //Getting value from addCompanyEmpWage and calling calculationEmpWage and calculating the Employee wage then is sets the totalEmpWage
    public void computeEmpWage () {
        for ( int i = 0 ; i < computeEmpWageList.size() ; i++ ) {
            CompanyEmpWage companyEmpWage = computeEmpWageList.get ( i ) ;
            companyEmpWage.setTotalEmpWage ( this.calculationEmpWage ( companyEmpWage ) ) ;

        }
    }

    //To get the TotalWage of a company
    public int getTotalWage ( String company ) {
       return companyEmpWageMap.get ( company ).totalEmpWage ;
    }

    //To calculate the Wage by checking Full time or Half time for each day nd returns the totalEmpWage value to computeEmpWage
    public int calculationEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0 , totalEmpHrs = 0 , totalWorkingDays = 0 ;
        while ( totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays ) {
            totalWorkingDays ++ ;
            int empCheck = ( int ) Math.floor ( Math.random() * 10 ) % 3 ;
            switch ( empCheck ) {
                case IS_FULL_TIME:
                    empHrs = 8 ;
                    break ;
                case IS_PART_TIME:
                    empHrs = 4 ;
                    break;
                default:
                    empHrs = 0 ;
                    break;
            }
            totalEmpHrs += empHrs ;
            System.out.println (" Day: " + totalWorkingDays + " Emp Hr: " + empHrs ) ;
        }
        return totalEmpHrs * companyEmpWage.ratePerHour ;
           }

    //All the company details like company name , ratePerHour , numOfWorkingDays , maxHoursPerMonth are given and it is added to LinkList and Map then called computeEmpWage
    public static void main ( String[] args ) {
        EmpWageBuilder empwagebuilder = new EmpWageBuilder ();
        empwagebuilder.addCompanyEmpWage ("Dmart", 20, 20, 100 ) ;
        empwagebuilder.addCompanyEmpWage ("Infosys", 20, 25, 150 ) ;
        empwagebuilder.computeEmpWage () ;
        System.out.println ("Total Wage for Dmart Company: " +empwagebuilder.getTotalWage ("Dmart" ) ) ;
        System.out.println ("Total Wage for Infosys Company: " +empwagebuilder.getTotalWage ("Infosys" ) ) ;
    }
}

