package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecficParam
{
	public EdgeDriver driver; //Globally assign the browser
	
	public String filename;
	
	@Parameters({"url","username","password"})
	 
    @BeforeMethod
    public void Precondition(String URL,String user, String pass)
	{
		
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	//driver.get("https://login.salesforce.com/");
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
	//driver.findElement(By.id("password")).sendKeys("Sales@123");
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
    }
	
    
    @AfterMethod
	public void Postcondition()
	{
	//driver.close();	
	}
	
}
