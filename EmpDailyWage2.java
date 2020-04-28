public class EmpUtil2
{
	public static boolean isPresent(){
	double isPresent=1.00;
	double empCheck=Math.floor(Math.random()*10)%2;
	if (isPresent == empCheck)
		{
			return true;
		}
	else
			return false;
    } 
}

public class  EmpDailyWage2
{
	public static void main(String[] args) 
	{
		int  salary=0;
		final EmpUtil2 emp=new EmpUtil2();
		if(emp.isPresent()){
			int empRatePerHr=20;
                        int empHrs=8;
                        salary=empHrs*empRatePerHr;
			System.out.println(salary);
		}
		else{
			System.out.println(salary);
		}
        }
}

