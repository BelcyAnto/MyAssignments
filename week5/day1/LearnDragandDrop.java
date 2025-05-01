package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://jqueryui.com/droppable/");
		//Maximize the Browser
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Step1: Create object for Action class
		Actions act=new Actions(driver);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		
		WebElement sourceEle=driver.findElement(By.id("draggable"));

		WebElement targetEle=driver.findElement(By.id("droppable"));
		
		
		act.dragAndDrop(sourceEle, targetEle).perform();


	}

}
