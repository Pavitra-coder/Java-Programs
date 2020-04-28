public class  EmpUtil4
{
    static int isPartTime=1;
    static int isFullTime=2;
    static int empRatePerHr=20;
    static int empHrs;
    static int salary;
    static double empCheck=Math.floor(Math.random()*10)%3;
    static int value=(int)empCheck;
    public static void checkTime(){
		switch(value)
		{
		  case 1 :empHrs=4;
		  break;
		  case 2 :empHrs=8;
		  break;
		  default:empHrs=0;
		  break;
		}
        }
	public static void calculate(){
	System.out.println(empHrs);
	salary=empHrs*empRatePerHr;
	System.out.println(salary);
	}
}
class  EmpDailyWage4
{
	public static void main(String[] args) 
	{
		EmpUtil4 emp=new EmpUtil4();
		emp.checkTime();
		emp.calculate();
	}
}


