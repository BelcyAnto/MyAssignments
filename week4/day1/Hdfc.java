package week4.day1;

//Abstract Class 
public abstract class Hdfc implements RBI 
{   //own Method
	public void goldLoan()
	{
		System.out.println("upto 1 Lakh");
		
	}
	//Unimplemented Method
	public void mandatoryKYC()
	{
		System.out.println("Driving Licence is Mandatory");
		
	}
	//Own Unimplemented Method using "abstract" keyword inside abstract class
	public abstract void houseLoan();
	

}
