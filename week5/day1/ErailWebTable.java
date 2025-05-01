package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailWebTable {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://erail.in/");
		//Maximize the Browser
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//From Station
		Thread.sleep(2000);
		WebElement From=driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		From.clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys(Keys.ENTER);
		//To Station
		Thread.sleep(2000);
		WebElement To=driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		To.clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//Uncheck the Checkbox
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
		checkbox.click();
		Thread.sleep(2000);
		
		//Get Train names
	    List<WebElement> TrainName=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
	    int TrainNameCount=TrainName.size();
	    ArrayList<String> allTrains=new ArrayList<String>();
	    for (int i=0;i<TrainNameCount;i++)
		 {
		  String text1=TrainName.get(i).getText();
		  System.out.println("Train Name before Sorting: " + text1); 
		  allTrains.add(text1);
		 }
	    
	    //Check Duplicates
	    Collections.sort(allTrains);
	    int sizeofList= allTrains.size();
	    System.out.println("\nTotal no of Train Count is "+ sizeofList ); 
	    System.out.println("\n");
	    for (int j=0;j<sizeofList-1;j++)
	    {
	    	 System.out.println("Train Name after Sorting: " + allTrains.get(j));  
	         if(allTrains.get(j)==allTrains.get(j+1))
	          { 
		        System.out.println("Duplicate Train Name Found " + allTrains.get(j));  
		      }
	         else
	         {
	    	  continue;
	         }
	    }
	   
	    System.out.println("\nNo Duplicate Train Name Found");
 
	}

}
