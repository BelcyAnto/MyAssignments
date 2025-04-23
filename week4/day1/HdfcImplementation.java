package week4.day1;

public class HdfcImplementation extends Hdfc
{
	public void deposit() 
	{
		System.out.println("50 Lakhs");
		
	}

	public void houseLoan() 
	{
		System.out.println("1 Crore");
		
	}
	public void goldLoan()
	{
		System.out.println("upto 15 Lakh");
		super.goldLoan(); 
	}
	public static void main(String[] args) 
	{
		HdfcImplementation HF=new HdfcImplementation();
		HF.houseLoan();
		HF.deposit();
		HF.goldLoan();
	}
}
