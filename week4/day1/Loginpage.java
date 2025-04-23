package week4.day1;

public class Loginpage extends Basepage
{
	@Override
	public void performCommonTasks()
	{
		System.out.println("CommonTasks are performed from Subclass");
		super.performCommonTasks();
		
	}
	public static void main(String[] args)
	{
		Loginpage page=new Loginpage();
		page.findElement();
		page.clickElement();
		page.enterText();
		page.performCommonTasks();
		

	}

}
