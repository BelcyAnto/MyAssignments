package week6.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesForceStaticParam extends ProjectSpecficParam
{
	
	@Test
	public void runSalesForce() throws InterruptedException 

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
			driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
			driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Salesforces");
			WebElement sourceElement = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
			sourceElement.click();
			Thread.sleep(500);
			WebElement sourceElement1 = driver.findElement(By.xpath("//span[@title='Active']"));
			sourceElement1.click(); 
			Thread.sleep(500);
			WebElement SaveButton = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
			SaveButton.click();
			Thread.sleep(500);
			WebElement errordialog = driver.findElement(By.xpath("//button[@title='Close error dialog']"));
			errordialog.click();
			Thread.sleep(500);
			WebElement Alert = driver.findElement(By.xpath("//div[@data-name='Name']"));
			String msg=Alert.getText();
			Thread.sleep(500);
			String substring1=msg.substring(17);
			System.out.println("Alert Error message is found:"+substring1);   
	        
	 
		}

	}



