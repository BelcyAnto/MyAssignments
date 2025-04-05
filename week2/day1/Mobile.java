package week2.day1;

public class Mobile 
{
	//makeCall, sendSms, takePhoto
	//Naming Convention - camelCase
	//Access Modifier- return- methodName
	public void makeCall()
	{
		System.out.println("Call");
	}
	public void sendSms()
	{
		System.out.println("Message");
	}
	public static void main(String[] args)
	{
		//ClassName objName=new ClassName()
		Mobile mobileOptions=new Mobile();
		mobileOptions.makeCall();
		mobileOptions.sendSms();
		
		//System.out.println("Is is main Method");
	}
		
	

}
