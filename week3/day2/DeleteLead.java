package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {
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
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("95");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		String firstlead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The first Lead Id in the page is" +" "+firstlead);
		System.out.println();
		System.out.println("Not getting first Lead ID");
		//driver.findElement(By.xpath("//a[@class,'linktext'])[4]")).click();	
		//driver.findElement(By.linkText("Delete")).click();
		

}
}
