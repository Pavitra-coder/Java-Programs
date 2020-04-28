public class EmpUtil{
	public static boolean isPresent(){
		int IS_FULL_TIME=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck == IS_FULL_TIME){
			return true;
		}
		else {
		return false;
		}
    } 
}
public class  EmployeeWageComputation1
{
	public static void main(String[] args) 
	{
		final EmpUtil emp=new EmpUtil();
		if(EmpUtil.isPresent()){
			System.out.println("Employee is Present");
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}


