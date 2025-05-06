package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod 
{

	 public EdgeDriver driver; //Globally assign the browser
	    @BeforeMethod
		public void Precondition()
		{
			
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
	    }
	    
	    @AfterMethod
		public void Postcondition()
		{
		//driver.close();	
		}
		
		
}



