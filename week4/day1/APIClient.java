package week4.day1;

public class APIClient
{
	public void sendRequest(String endpoint) 
	{
		System.out.println("EndPoint is " + endpoint);
	}	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) 
	{
		if(requestStatus)
			{
			System.out.println("EndPoint is " + endpoint + " and RequestBody is "+ requestBody + " and RequestStatus is successful ");
			}
		else
		   {
			System.out.println("EndPoint is " + endpoint + " and RequestBody is "+ requestBody + " and RequestStatus is not successful");
		   }
	}

	public static void main(String[] args)
	{
		APIClient API=new APIClient();
		API.sendRequest("URL");
		API.sendRequest("URL","Username&Password",true);
		API.sendRequest("URL","Username&Password",false);
	}
	
		
}
