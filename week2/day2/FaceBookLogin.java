package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin 
{

	public static void main(String[] args) 
	{
		//Launch the Driver
		ChromeDriver driver=new ChromeDriver();	
		//Launch the URL
		driver.get("https://www.facebook.com/");		
		//Maximize the Browser
		driver.manage().window().maximize();		
		//Enter email- findElement-sendkeys
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");		
		//Enter password- findElement-sendkeys
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");		
		//Click on the Login Button 
		driver.findElement(By.name("login")).click();
		//Click on the link
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//Find Your Account
		WebElement text = driver.findElement(By.className("uiHeaderTitle"));
		String title=text.getText();
		
		//check Page Title
		if (title.contains("Find Your Account"))
		{	
		  System.out.println("Page Title is Matching"+":- "+ title);
		  //System.out.println("Title of Current Web page:" + " "+text.getText());
		}
		else
		{
		 System.out.println("Page Title is not Matching");
		}
	}

}
