package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnBrowser 
{

	public static void main(String[] args) 
	{
     //Launch the Browser- Chrome
		ChromeDriver driver=new ChromeDriver();
	   // EdgeDriver driver=new EdgeDriver();
     //Load URL
		driver.get("https://www.facebook.com");
	
		//Maximize the Browser
		//driver.manage().window().maximize();

	}

}
