package week4.day1;

public class AxisBank implements RBI
{
	public void mandatoryKYC()
	{
		System.out.println("Aadhar is Mandatory");
		
	}
	public void deposit()
	{
		System.out.println("Deposit Amount - Rs 50,000");
		
	}
	public static void main(String[] args) 
	{
		AxisBank AB=new AxisBank();
		AB.mandatoryKYC();
		AB.deposit();
	}

}
