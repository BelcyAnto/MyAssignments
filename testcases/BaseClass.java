package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass
{
	
  public EdgeDriver driver; //Globally assign the browser
  
  public String filename;
  
  @Parameters({"url","username","password"})
  
  @BeforeMethod
  public void Precondition(String URL,String user, String pass)
  {
		
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	//driver.get("http://leaftaps.com/opentaps/");
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	//driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();

   }
  
   @DataProvider(name="fetchData")
	public String[][] sendData() throws IOException
	{
		/*String[][] data=new String[2][3];
		data[0][0]="Testleaf";
		data[0][1]="ABC";
		data[0][2]="CDE";
		
		data[1][0]="Qeagle";
		data[1][1]="XYZ";
		data[1][2]="LMN";*/
		String[][] readData=ReadExcel.readData(filename);
		return readData;
	}
  
    @AfterMethod
    public void Postcondition()
     {
	  driver.close();	
     }
	
	
}
