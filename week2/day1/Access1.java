package week2.day1;

public class Access1 {
	public void depositAmount()
	{
		System.out.println("DepositAmount is "+ " " +"10000");
	}
	private void withdrawAmount()
	{	System.out.println("WithdrawAmount is"+ "" + "50000");
	}

	public static void main(String[] args) {
     Access1 AccessName=new  Access1();
     AccessName.depositAmount();
     AccessName.withdrawAmount();
	}

}
