package week5.day1;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AmazonActions 
{
public static void main(String[] args) throws InterruptedException, IOException
  {
	ChromeDriver driver=new ChromeDriver();
    //Launch the URL
	driver.get("https://www.amazon.in");
	//Maximize the Browser
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro"); 
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
	Thread.sleep(500);
	//Amount
	WebElement Amount=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]"));
	String Amount1=Amount.getText();
	System.out.println("First product Amount is "+ Amount1);
	
	//Star
	Thread.sleep(3000);
	WebElement rating = driver.findElement(By.xpath("//span[@class='a-icon-alt']"));
	//WebElement rating = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result']//span[@class='a-icon-alt'])[1]"));   
	String rating1=rating.getText();
    System.out.println("Rating of first product: " + rating1);
	
	//First Product
    Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']")).click();
	
	//Focus to secondWindow
	Set<String> allsetAddress1= driver.getWindowHandles(); 
    List<String> allListAddress1=new ArrayList<String>(allsetAddress1);
    driver.switchTo().window(allListAddress1.get(1));  
    driver.manage().window().maximize();
    Thread.sleep(3000);
    
    //Screenshot
   	WebElement image = driver.findElement(By.xpath("//img[@id='landingImage']"));
   	File srcFile=image.getScreenshotAs(OutputType.FILE);
   	File destFile = new File("firstproductimage.png");
    FileUtils.copyFile(srcFile, destFile);
    System.out.println("Screenshot of image saved: firstproductimage.png");
    
   //Click the 'Add to Cart' button.    
    Thread.sleep(3000);
    WebElement addToCartBtn=driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
    addToCartBtn.click();
    Thread.sleep(3000);
    
    //Get the cart subtotal and verify if it is correct. 
    WebElement subTotal=driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
    String text=subTotal.getText();
    System.out.println("Cart Sub Total is: "+ text);
    Thread.sleep(3000);
    
    //Close the window
    //driver.close();
    //driver.quit(); 
    	
   
    
  
	 

	
  }

	
	
	
  
}
