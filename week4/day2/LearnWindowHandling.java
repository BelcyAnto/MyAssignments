package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://leafground.com/window.xhtml");
		//Maximize the Browser
		driver.manage().window().maximize();

	//Click Open Button
       driver.findElement(By.xpath("//span[text()='Open']")).click();
       
       //getWindowHandle
       String parentAddress= driver.getWindowHandle();
       System.out.println("Parent Address is:"+parentAddress);
       //5C9CDBBE962566F21D7FBD3B5A3A5276
       //6400ED802AD81C5B37B1F8ABEB758B63

     //getWindowHandles
       Set<String> allsetAddress= driver.getWindowHandles();
       System.out.println("All Windows Address are:"+ allsetAddress);
       //86537DF10BCE235D93DE891FC16C667D
       //[86537DF10BCE235D93DE891FC16C667D, A4276CD7630F7E6DA251DE1B55A3FE97]
       
       //SwitchWindows
   	     List<String> allListAddress=new ArrayList<String>(allsetAddress);
   	      System.out.println("The List Windows Address are:"+ allsetAddress);
   	      
   	      String titleofParent=driver.getTitle();
   	     System.out.println("BeforeSwitching: "+ titleofParent);
   	      
   	      
   	      //String address1=allAddress.get(1);
   	      
   	      //transfer the driver focus
   	      driver.switchTo().window(allListAddress.get(1));
   	      
   	   String titleofChild=driver.getTitle();
 	   System.out.println("AfterSwitching: "+ titleofChild);
   	      
   	   //close the current window
 	   //driver.close();
 	   
 	   //To close all windows
 	  driver.quit();
 	   
   	      
   	      
	}

}
