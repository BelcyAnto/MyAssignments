package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//Maximize the Browser
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Step1: Create object for Action class
		Actions act=new Actions(driver);
		//Step2: Finding element
		WebElement rightClickEvent=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		act.contextClick(rightClickEvent).perform();
		
	

	}

}
