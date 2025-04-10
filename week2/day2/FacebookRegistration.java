package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration
{

	public static void main(String[] args) 
	{
		//Launch the Driver
				ChromeDriver driver=new ChromeDriver();	
				//Launch the URL
				driver.get("https://en-gb.facebook.com/");		
				//Maximize the Browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Create new account - Button
				driver.findElement(By.linkText("Create new account")).click();
				//Enter Firstname and Surname
				driver.findElement(By.name("firstname")).sendKeys("TestLeaf");
				driver.findElement(By.name("lastname")).sendKeys("Chennaibranch");
				
				//1.birthday_day- Dropdown 
			    WebElement dayValue = driver.findElement(By.id("day"));
				Select daydropdown=new Select(dayValue);
				daydropdown.selectByValue("25");
				
				//2.Month- Dropdown 
				WebElement monthValue = driver.findElement(By.id("month"));
				Select monthdropdown=new Select(monthValue);
				monthdropdown.selectByValue("4");
				
				//3.year- Dropdown 
				WebElement yearValue = driver.findElement(By.id("year"));
				Select yeardropdown=new Select(yearValue);
				yeardropdown.selectByValue("2000");
				
				//Gender
				WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
			    gender.click();
			    
			    //MobileNumber/Email address
			    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Testleaf7.chennai@gmail.com");
				
			    //New Password
			   driver.findElement(By.id("password_step_input")).sendKeys("Welcome123");
			   
			    //Submit
			   driver.findElement(By.name("websubmit")).click();
				
		}



	}


