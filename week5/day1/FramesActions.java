package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesActions
{
	public static void main(String[] args)
	{
	ChromeDriver driver=new ChromeDriver();
    //Launch the URL
	driver.get("https://leafground.com/frame.xhtml");
	//Maximize the Browser
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//Tramsfer the focs to Frame
	driver.switchTo().frame(0);
	
	//Click the Click Me Button
	driver.findElement(By.id("Click")).click();


	}
}
