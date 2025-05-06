package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNGSample
{
	public  EdgeDriver	driver;
	@Test
	 public void loginPage() 
	{
		 	driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			String Title=driver.getTitle();
			System.out.println(Title);
		
   }  
	
}
