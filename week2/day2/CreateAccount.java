package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount 
{

	public static void main(String[] args) 
	{
		//Launch the Driver
				//ChromeDriver driver=new ChromeDriver();
				EdgeDriver driver=new EdgeDriver();
				
			    //Launch the URL
				driver.get("http://leaftaps.com/opentaps");
				//Maximize the Browser
				driver.manage().window().maximize();
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Enter username- findElement-sendkeys
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				//Enter password- findElement-sendkeys
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Click on the Login Button 
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Creeate Account
				driver.findElement(By.linkText("Accounts")).click();
				driver.findElement(By.linkText("Create Account")).click();
				//Enter Details
				driver.findElement(By.id("accountName")).sendKeys("AutomationTesting7");
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				
				//select drodpdown values
				//Select Industry
			    WebElement industry = driver.findElement(By.name("industryEnumId"));
				Select industry1=new Select(industry);
				industry1.selectByValue("IND_SOFTWARE");
				//Select ownership -SelectByVisibleText.
				WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
				Select ownership1=new Select(ownership);
				ownership1.selectByVisibleText("S-Corporation");
				//Select "Employee" - SelectByValue
				WebElement source1 = driver.findElement(By.name("dataSourceId"));
				Select source2=new Select(source1);
				source2.selectByValue("LEAD_EMPLOYEE");
				//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
				WebElement marketing = driver.findElement(By.name("marketingCampaignId"));
				Select marketing1=new Select(marketing);
				marketing1.selectByValue("9000");
				//Select "Texas" as the state/province using SelectByValue.
				WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
				Select state1=new Select(state);
				state1.selectByValue("TX");
				//Click the "Create Account" button
				driver.findElement(By.className("smallSubmit")).click();
				
				//Verify that the account name is displayed correctly.
				WebElement text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		
				String accName=text.getText();
			
				//check AccountName
				if (accName.contains("Automation"))
				{	
				  System.out.println("AccountName is displayed correctly"+":- "+ accName);
				  //System.out.println("Title of Current Web page:" + " "+text.getText());
				}
				else
				{
					  System.out.println("AccountName is not displayed correctly"+":- "+ accName);
				}
							
				//Close the browser window.
				driver.findElement(By.linkText("Logout")).click();
	}		

}	


