public class  EmpWageBuilderProceduralApproach
{
        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;
        public static final int MAX_HRS=100;
        public static final int EMP_RATE=20;
        public static final int NUM_OF_DAYS=20;


        public static int calcEmpWageForCompany(String company,int empRate, int numOfDays,int maxHrs) {
			int totalEmpHrs=0;
            int totalWorkingDays=0;
            int empHrs=0;

        while(totalEmpHrs < MAX_HRS && totalWorkingDays < NUM_OF_DAYS){
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
         totalEmpHrs=totalEmpHrs+empHrs;
         System.out.println("Day#:"+totalWorkingDays+"Emp Hr:"+empHrs);
         }

         int totalEmpWage=totalEmpHrs*EMP_RATE;
         System.out.println("Total Emp Wage for company: " +company+" is: "+totalEmpWage);
         return totalEmpWage;
		}
		public static void main(String args[]){
		calcEmpWageForCompany("Dmart",20,2,10);
		calcEmpWageForCompany("Reliance",10,4,20);
        
     }
}
