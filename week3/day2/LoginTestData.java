package week3.day2;
//Superclass
class TestData
{
  public void enterCredentials() 
   {
    System.out.println("Credentials entered");
   }
   public void navigateToHomePage()
   {
    System.out.println("HomepageNavigated");
   }
} 
//Subclass1 extend Superclass
class LoginTestData1 extends TestData
{
  public void enterstate()
   {
   System.out.println("State entered");
   }
  public void enterCountry()
  {
  System.out.println("Country entered");
  }
}	
//Subclass2 extend Superclass
public class LoginTestData extends TestData
  {
    public void enterUsername()
     {
     System.out.println("Username entered");
     }
    public void enterPassword()
    {
     System.out.println("Password entered");
    }
	
 public static void main(String[] args)
	 {
		
		LoginTestData b= new LoginTestData();
		System.out.println("Superclass Method Outputs from Subclass1");
		System.out.println("----------------------------------------");
		b.enterCredentials();
		b.navigateToHomePage();
		System.out.println();
		System.out.println( "Subclass1 Method Outputs");
		System.out.println("--------------------------");
		b.enterUsername();
		b.enterPassword();
		System.out.println();
		System.out.println("*************************************************");
		System.out.println();
		LoginTestData1 c= new LoginTestData1();
		System.out.println("Superclass Method Outputs from Subclass2");
		System.out.println("-----------------------------------------");
		c.enterCredentials();
		c.navigateToHomePage();
		System.out.println();
		System.out.println("Subclass2 Method Outputs");
		System.out.println("------------------------");
		c.enterstate();
		c.enterCountry();
		  
	}	

}


