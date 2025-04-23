package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcWindow {

	public static void main(String[] args) {
	
			ChromeDriver driver=new ChromeDriver();
		    //Launch the URL
			driver.get("https://www.irctc.co.in");
			//Maximize the Browser
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.findElement(By.linkText("FLIGHTS")).click();		 
			 //getWindowHandle
             String parentAddress1= driver.getWindowHandle();  
		     //getWindowHandles
		     Set<String> allsetAddress= driver.getWindowHandles();    		       
		     //SwitchWindows
		   	 List<String> allListAddress=new ArrayList<String>(allsetAddress);	      
             String titleofParent=driver.getTitle();
		     System.out.println("Before Switching: "+ titleofParent);     
		     //transfer the driver focus
		     driver.switchTo().window(allListAddress.get(1));    
		     String titleofChild=driver.getTitle();
		 	 System.out.println("After Switching: "+ titleofChild);
		 	 //Moving to parent Window
		 	 driver.switchTo().window(allListAddress.get(0)); 	     
		   	 //close the parent window
		 	 driver.close();

	}

}
