package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://leafground.com/frame.xhtml");
		//Maximize the Browser
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Transfer the focus to 2 Frame
		driver.switchTo().frame(2);
		
		//Transfer the focus to Inner Frame 
	     //driver.switchTo().frame("0");
	     
	     //By WebElement
	     WebElement findElement=driver.findElement(By.id("frame2"));
	    driver.switchTo().frame(findElement);
	     
		//Click the Click Me Button
		driver.findElement(By.id("Click")).click();
		
		//Transfer the focus to parentFrame
		driver.switchTo().parentFrame();
		
		//Transfer the focus to MainPage
		driver.switchTo().defaultContent();
		


	}

}
