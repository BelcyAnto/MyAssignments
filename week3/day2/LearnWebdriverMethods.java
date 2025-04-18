package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnWebdriverMethods
{
	
public static void main(String[] args) 
  {
	EdgeDriver driver=new EdgeDriver();
	
    //Launch the URL
	driver.get("http://leaftaps.com/opentaps");
	//Maximize the Browser
	driver.manage().window().maximize();
	//Implicit Wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//getTitle
	String titleOfpage=driver.getTitle();
	System.out.println("Title of the page is " + titleOfpage);
	
	//GetURL
	String Url=driver.getCurrentUrl();
	System.out.println("URL is " + Url);
	//gettext()
	
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	

  }
}
