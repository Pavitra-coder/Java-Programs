public class EmpUtil3
{
	static int isPartTime=1;
        static int isFullTime=2;
	static int empRatePerHr=20;
	static  int empHrs;
	static int salary;
	 
	static double empCheck=Math.floor(Math.random()*10)%3;
	public static void checkTime()
	{
		if (isFullTime == empCheck)
		{
			empHrs=8;
		}
                else if(isPartTime == empCheck)
		{
		    empHrs=4;
		}
		else
		{
		 empHrs=0;
	        }
        }
	 public static void calculate()
	{
		 salary=empHrs*empRatePerHr;
		 System.out.println(salary);
	}

}
public class  EmpDailyWage3
{
	public static void main(String[] args) 
	{
		EmpUtil3 emp=new EmpUtil3();
		emp.checkTime();
		emp.calculate();
	}
}
