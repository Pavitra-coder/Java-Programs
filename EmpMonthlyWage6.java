public class  EmpUtil6
{
	static int IS_PART_TIME=1;
        static int IS_FULL_TIME=2;
        static int MAX_HRS_IN_MONTH=100;
	static int EMP_RATE_PER_HRS=20;
	static int NUM_WORKING_DAYS=20;

	static int totalEmpHrs=0;
	static int totalWorkingDays=0;

	static int empHrs;
	static int salary;
        
	public static void checkTime(){
	while(totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS){
		totalWorkingDays++;
		double empCheck=Math.floor(Math.random()*10)%3;
		int value=(int)empCheck;
		switch(value){
		case 1 :empHrs=4;
		break;
		case 2 :empHrs=8;
		break;
		default:
        empHrs=0;
		break;
		}
	}
}
	 public static void calculate(){
	 totalEmpHrs=totalEmpHrs+empHrs;
	 System.out.println(totalEmpHrs);
         int totalSalary=totalEmpHrs*EMP_RATE_PER_HRS;
	 System.out.println(totalSalary);
	}
}
class MonthlyWage6
{
	public static void main(String[] args) 
	{
		EmpUtil6 emp=new EmpUtil6();
		emp.checkTime();
		emp.calculate();
	}
}

