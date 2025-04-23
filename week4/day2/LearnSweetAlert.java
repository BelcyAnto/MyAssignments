package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://leafground.com/alert.xhtml");
		//Maximize the Browser
	     driver.manage().window().maximize();

		//Click Show Button  
	     driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	     
	     driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	  
	     


	}

}
