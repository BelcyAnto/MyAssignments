package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlingInteraction 
{

	public static void main(String[] args) throws InterruptedException
	{
	    EdgeDriver driver=new EdgeDriver();
	    //Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
				
		//Maximize the Browser
	    driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 	
	 	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter password- findElement-sendkeys
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the Login Button 
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		Thread.sleep(3000);
		
		//partyIdFrom Img
		 driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		
		 //String parentAddress1= driver.getWindowHandle();  
	     //getWindowHandles
	     Set<String> allsetAddress= driver.getWindowHandles(); 
	     List<String> allListAddress=new ArrayList<String>(allsetAddress);
	     //System.out.println(allListAddress);
	     driver.switchTo().window(allListAddress.get(1));  
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     //fetching 1st text	     
	 	// driver.findElement(By.xpath("//a[@class='linktext']")).click();
	 	 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
	 	 driver.switchTo().window(allListAddress.get(0)); 
	 	 Thread.sleep(3000); 
	 	 
	 	 //partyIdTo Img
		 driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
	     //getWindowHandles
	     Set<String> allsetAddress1= driver.getWindowHandles(); 
	     List<String> allListAddress1=new ArrayList<String>(allsetAddress1);
	     //System.out.println(allListAddress1);
	     driver.switchTo().window(allListAddress1.get(1));  
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     //fetching 2nd text
        // driver.findElement(By.xpath("//a[@class='linktext']")).click();
	     driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
         
	   	 Thread.sleep(3000);
	 	 driver.switchTo().window(allListAddress.get(0)); 
	
		 //Merge Button
	 	 Thread.sleep(3000);
	 	 driver.findElement(By.linkText("Merge")).click();
	 	
	 	Thread.sleep(3000);
	 	//Switch to alert
		Alert mergeAlert=driver.switchTo().alert();
		mergeAlert.accept();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("Title of the page is " + title);
		

	}

}
