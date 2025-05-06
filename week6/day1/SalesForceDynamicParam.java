package week6.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcases.ReadExcel;

public class SalesForceDynamicParam extends ProjectSpecficParam
{ 
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException
	{
		String[][] data=new String[3][3];
		data[0][0]="Salesforce Automation by Team A";
		data[0][1]="TestLeaf";
		data[0][2]="Team A-TestLeaf Salesforce Automation";
		
		data[1][0]="Salesforce Automation by Team B";
		data[1][1]="Qeagle";
		data[1][2]="Team B-Qeagle Salesforce Automation";
		
		data[2][0]="Salesforce Automation by Team C";
		data[2][1]="Github";
		data[2][2]="Team C-Github Salesforce Automation";
		
		return data;
		}
  
	
 @Test(dataProvider="fetchData")	
  public void runSalesForce(String name1,String company, String desc) throws InterruptedException
  {
			
	driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	Thread.sleep(500);
				
	WebElement conditions= driver.findElement(By.xpath("//h2[@class='slds-text-heading--medium slds-p-horizontal--large slds-p-bottom--large']"));
	String text=conditions.getText();
    System.out.println("Check for Title: "+ text); 
			 
	Thread.sleep(500);		 
	WebElement link=driver.findElement(By.xpath("(//p[@class='slds-truncate'])[96]"));
	Actions act=new Actions(driver);
	act.scrollToElement(link).perform(); 
	link.click(); 
				 
	//New Legal Entity Window
	WebElement link1=driver.findElement(By.xpath("//div[@title='New']")); 
	link1.click(); 
				
	//New Window
	
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name1);
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(company);
	driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys(desc);
	WebElement sourceElement = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
	sourceElement.click();
				
	WebElement sourceElement1 = driver.findElement(By.xpath("//span[@title='Active']"));
	sourceElement1.click(); 
				
	WebElement SaveButton = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
	SaveButton.click();
	
	WebElement leName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
	String leName1 = leName.getText(); 
	System.out.println("Legal Entity Name is :" + leName1);
	if (leName1.contains(name1))	
	{
	System.out.println("Legal Entity Name is verified :" + leName1); 

    }

	else
	{
	System.out.println("Legal Entity Name is verified :" + leName1); 
	}
	
  }
 
}






