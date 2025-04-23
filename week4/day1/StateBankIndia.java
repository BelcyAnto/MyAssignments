package week4.day1;

public class StateBankIndia implements RBI
{

	public void mandatoryKYC()
	{
		System.out.println("PAN Card is Mandatory");
		
	}
	public static void main(String[] args) 
	{
		StateBankIndia SBI=new StateBankIndia();
		SBI.mandatoryKYC();
		
	}
	
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

}
