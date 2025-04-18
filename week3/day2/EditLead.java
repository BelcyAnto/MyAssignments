package week3.day2;
import java.time.Duration;

//import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) { 
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    //Launch the URL
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the Browser
		driver.manage().window().maximize();
		//Implicit Wait
		
		//Enter username- findElement-sendkeys
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter password- findElement-sendkeys
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the Login Button 
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//CreadLead page
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_firstName')]")).sendKeys("first11");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_lastName')]")).sendKeys("last1");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_firstNameLocal')]")).sendKeys("firstlocal");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Engineering");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Testleaf Engineering ");
	    
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("first1.testleaf@gmail.com");
	    
	    WebElement stateField = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select option=new Select(stateField);
	    option.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Edit lead
		//driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
	    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note to Testleaf");
	    driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("smallSubmit")).click();
	
	    String title = driver.getTitle();
	    System.out.println(title);
	    		
	  //Close the browser window.
	  //diver.findElement(By.linkText("Logout")).click();
	  
	}

}
