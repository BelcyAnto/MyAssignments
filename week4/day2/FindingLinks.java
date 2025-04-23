package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
	    //Launch the URL
		driver.get("https://facebook.com");
		//Maximize the Browser
		driver.manage().window().maximize();
		//Get the total number of link
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		//[WebElement1, WebElement2,WebElement3,-------WebElement42]
		int numberOfLinks=allLinks.size();
		System.out.println("The numbe of link is: "+numberOfLinks);
		
		//Print the links
		List<String> allStrings=new ArrayList<String>();
		
		for (int i=0;i<numberOfLinks;i++)
		{
         String text=allLinks.get(i).getText();
         allStrings.add(text);
	    }
		System.out.println("The links are: "+allStrings);
}
}
