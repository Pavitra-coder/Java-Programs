public class  EmpWageBuilderObject
{
        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;

	    private final String company;
        private final int empRatePerHour;
        private final int numOfworkingDays;
        private final int maxHoursPerMonth;
	    private int totalEmpWage;
        

        public EmpWageBuilderObject(String company,int empRatePerHour ,int numOfworkingDays,int maxHoursPerMonth) {
			this.company=company;
			this.empRatePerHour=empRatePerHour;
			this.numOfworkingDays=numOfworkingDays;
			this.maxHoursPerMonth=maxHoursPerMonth;
		}
        
	    private int computeEmpWage(){
        int totalEmpHrs=0;
        int totalWorkingDays=0;
        int empHrs=0;

        while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfworkingDays ){
                totalWorkingDays++;
                int empCheck=(int)Math.floor(Math.random()*10)%3;
                switch(empCheck){
                case IS_PART_TIME :empHrs=4;
                         break;
                case IS_FULL_TIME :empHrs=8;
                        break;
                default:
                        empHrs=0;

                }
         totalEmpHrs=totalEmpHrs+empRatePerHour;
         System.out.println("Day#:"+totalWorkingDays+"Emp Hr:"+empHrs);
         }

         int totalEmpWage=totalEmpHrs*empRatePerHour;
         return totalEmpWage;
     }
         public static void main(String args[]){
			 EmpWageBuilderObject dMart=new EmpWageBuilderObject("DMart",20,2,10);
			 EmpWageBuilderObject bigBasket=new EmpWageBuilderObject("BigBasket",10,4,30);
			 System.out.println("Total Emp Wage for company: "+dMart.company+" is:"+dMart.computeEmpWage());
			 System.out.println("Total Emp Wage for company: "+bigBasket.company+" is:"+bigBasket.computeEmpWage());
		 }
}
			 

			 


