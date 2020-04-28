public class  EmpUtil5 
{
	static int isPartTime=1;
        static int isFullTime=2;
        static int empRatePerHr=20;
	static int totalSalary=0;
	static int numWorkingDays=20;
	static int empHrs;
	static int salary;
	static double empCheck=Math.floor(Math.random()*10)%3;
	static int value=(int)empCheck;
	public static void checkTime()
		{
			for ( int day=1; day<=numWorkingDays; day++ )
				{
				switch(value){
				case 1 :empHrs=4;
				break;
			        case 2 :empHrs=8;
				break;
				default:
				empHrs=0;
				break;}
			        }
		}
	public static void calculate()
		{
	        System.out.println(empHrs);
	        salary=empHrs*empRatePerHr;
	        System.out.println(salary);
	        totalSalary=totalSalary+salary;
	        System.out.println(totalSalary);
		}
}
class EmpMonthlyWage5
{
	public static void main(String[] args) 
	{
		EmpUtil5  emp=new EmpUtil5();
		emp.checkTime();
		emp.calculate();
	}
}
