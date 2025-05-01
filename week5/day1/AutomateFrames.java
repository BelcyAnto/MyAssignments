package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFrames
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//Maximize the Browser
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Transfer the focus to Frame
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		//Click the Click Me Button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		////Transfer the focus to Frame
        Alert action=driver.switchTo().alert();
        Thread.sleep(1000);
        action.accept();
        //action.dismiss();
        String text1 =driver.findElement(By.xpath("//p[@id='demo']")).getText();  
	    System.out.println("The Alert response is " + text1); 
		
		
	
	   
	}

}
