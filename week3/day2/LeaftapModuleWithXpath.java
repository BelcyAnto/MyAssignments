package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LeaftapModuleWithXpath {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		
	    //Launch the URL
		driver.get("http://leaftaps.com/opentaps");
		//Maximize the Browser
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter username- findElement-sendkeys
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

}
