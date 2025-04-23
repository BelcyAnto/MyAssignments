package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlerts {

	public static void main(String[] args)
	{
	ChromeDriver driver=new ChromeDriver();
    //Launch the URL
	driver.get("https://leafground.com/alert.xhtml");
	//Maximize the Browser
     driver.manage().window().maximize();

	//Click Show Button  
     driver.findElement(By.xpath("//span[text()='Show']")).click();
     
     Alert simpleAlert=driver.switchTo().alert();
     //simpleAlert.accept();
     //
     
    // driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();

	}

}
