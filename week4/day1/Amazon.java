package week4.day1;
public class Amazon extends CanaraBank {
	public void cashOnDelivery() 
	{
		System.out.println("cashOnDelivery");
		
	}
	public void upiPayments() 
	{
			System.out.println("upiPayments");
			
	}		
	public void cardPayments() 
	{
		System.out.println("cardPayments");
		
	}
	public void internetBanking() 
	{
		System.out.println("internetBanking");
		
	}	
	public void recordPaymentDetails()
	{
		System.out.println("PaymentDetails recorded in Amazon class");
		super.recordPaymentDetails();
	}
	
public static void main(String[] args) 
{
	Amazon AZ=new Amazon();
    AZ.cashOnDelivery();
    AZ.upiPayments();
    AZ.cardPayments();
    AZ.internetBanking();
    AZ.recordPaymentDetails();
	}

}
