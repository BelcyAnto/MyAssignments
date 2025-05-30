package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://leafground.com/alert.xhtml");
		//Maximize the Browser
	     driver.manage().window().maximize();

		//Click Show Button  
	     driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	     
	     Alert promptAlert=driver.switchTo().alert();
	     
	     promptAlert.sendKeys("checking Alert");
	     
	     String text=promptAlert.getText();
	     
	     System.out.println(text);
	     

	}

}
