package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Ajio
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://www.ajio.com/"); 
		//Maximize the Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys(Keys.ENTER);

		
    }
}
