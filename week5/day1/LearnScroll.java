package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScroll {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://www.amazon.in");
		//Maximize the Browser
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Step1: Create object for Action class
		Actions act=new Actions(driver);
		//Step2: Finding element
		WebElement conditions=driver.findElement(By.linkText("Conditions of Use & Sale"));
		
		act.scrollToElement(conditions).perform();
		Thread.sleep(500);
		conditions.click();

	}

}
