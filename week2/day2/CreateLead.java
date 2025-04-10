package week2.day2;
import java.time.Duration;

//import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		//Launch the Driver
		//ChromeDriver driver=new ChromeDriver();
	
		//ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("prefs", Map.of("credentials_enable_service", false, "profile.password_manager_enabled", false));
        //ChromeDriver driver = new ChromeDriver(options);
		
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaptaps");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Belcy");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Antony");
		
		//1.Dropdown -Find Element
	    WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    //2.Create Object
		Select dropdown=new Select(sourceElement);
		//3.select options in dropdown
		//dropdown.selectByIndex(1);
		dropdown.selectByValue("LEAD_CONFERENCE");
		//dropdown.selectByVisibleText("Public Relations");
		//driver.findElement(By.xpath("//input[@name='SubmitButton']"));
		//Enter Tile
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Engineer");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify that the Title is displayed correctly.
		WebElement text = driver.findElement(By.id("viewLead_generalProfTitle_sp"));

		String title=text.getText();
	
		//check Title
		if (title.contains("Eng"))
		{	
		  System.out.println("Title is displayed correctly"+":- "+ title);
		  //System.out.println("Title of Current Web page:" + " "+text.getText());
		}
		else
		{
			  System.out.println("Title is not displayed correctly"+":- "+ title);
		}
					
		//Close the browser window.
		driver.findElement(By.linkText("Logout")).click();
	  
     
	}

}
