package week6.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshots 
{

	public static void main(String[] args) throws IOException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/main");
		
		//screenshot of Entire WEEBPAGE
		
	   	File srcFile=driver.getScreenshotAs(OutputType.FILE); //Source
	   	File destFile = new File("./Screenshot/loginpage.png");    //Destination
	    FileUtils.copyFile(srcFile, destFile);
	    System.out.println("Screenshot of webpage saved: loginpage.png");
	    
	    //screenshot of particular Element
	    
	    WebElement image = driver.findElement(By.id("username"));
	   	File srcFile1=image.getScreenshotAs(OutputType.FILE); //Source
	   	File destFile1 = new File("./Screenshot/username.png");    //Destination
	    FileUtils.copyFile(srcFile1, destFile1);
	    System.out.println("Screenshot of WebElement saved: username.png");
	    
	    

	}

}
