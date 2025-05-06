package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	@BeforeTest
	public void setvalues()
	{
		filename="CreateLead";
	}
	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String company,String fname, String lname) {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		
		driver.findElement(By.name("submitButton")).click();
	
		
	}
	
//@BeforeTest
//@BeforeMethod - Precondition()
//@DataProvider
//@Test -runCreateLead()
//@AfterMethod - Postcondition()
//@AfterTest
}






