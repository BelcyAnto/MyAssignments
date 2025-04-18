package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnImplicitWait {

	public static void main(String[] args) {
	
		EdgeDriver driver=new EdgeDriver();
			
		    //Launch the URL
			driver.get("https://omni.axisbank.co.in/axisretailbanking/");
			//Maximize the Browser
			driver.manage().window().maximize();
			//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Enter username- findElement-sendkeys
			driver.findElement(By.id("APPREGI")).click();
			
			//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCRM");
	}

}
