package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBrowser 
{

	public static void main(String[] args) 
	{
     //Launch the Browser- Chrome
		ChromeDriver driver=new ChromeDriver();
     //Load URL
		driver.get("https://www.facebook.com");
	
		//Maximize the Browser
		driver.manage().window().maximize();

	}

}
