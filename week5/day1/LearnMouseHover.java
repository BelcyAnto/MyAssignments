package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://www.amazon.in");
		//Maximize the Browser
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Step1: Create object for Action class
		Actions mouseHover=new Actions(driver);
		//Step2: Finding element
		WebElement moreElement=driver.findElement(By.xpath("//span[text()='Fresh"));
		
		//Step3: use the method - move to Element
		mouseHover.moveToElement(moreElement).perform();
		
		

	}

}
