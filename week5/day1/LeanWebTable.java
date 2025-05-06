package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeanWebTable {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
	    //Launch the URL
		driver.get("https://leafground.com/table.xhtml");
		//Maximize the Browser
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver. means entire table
		//table. means particular table
		
		WebElement tablerow=driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		List<WebElement> findElements=tablerow.findElements(By.tagName("tr"));
		int tablerowCount=findElements.size();
		System.out.println("No Of Rows in the table is " + tablerowCount );
		
		
		WebElement tablecolumn=driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr"));
		List<WebElement> findElements1=tablecolumn.findElements(By.tagName("td"));
		int tableCloumnCount=findElements1.size();
		System.out.println("No Of Column in the table is " + tableCloumnCount );
		
		//Retrieve a particular data
		WebElement row1col1Data=driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td[1]"));
		String row1col1value=row1col1Data.getText();
		System.out.println("row1 col1 value is " + row1col1value );
		
		//Retrieve 1 entire data
		List<WebElement> row2data=driver.findElements((By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td")));
		
		for (int i=0;i<row2data.size();i++)
		{
		String text=row2data.get(i).getText();
		System.out.println("Row2 Data: " + text);
		}
		
        List<WebElement> entireData=driver.findElements((By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[2]")));
        int trainNameCount=entireData.size();
        System.out.println(trainNameCount);
		for (int i=0;i<entireData.size();i++)
		{
		String text1=entireData.get(i).getText();
		System.out.println("entireData: " + text1);
		}
		
		
	}

}
