package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceStepsDefn
{
	 
	public EdgeDriver driver;
	@Given("Launch the Webbrowser")
	public void launch_the_webbrowser() 
	{
		 driver = new EdgeDriver();
	}
	
	@Given("Load the url page")
	public void load_the_url_page() 
	{
		driver.get(" https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	@Given("Enter the username as {string}")
	public void enter_the_username_as(String user) 
	{
		driver.findElement(By.id("username")).sendKeys(user);
	}
	
	@Given("Enter the password as {string}")
	public void enter_the_password_as(String pass) 
	{
		driver.findElement(By.id("password")).sendKeys(pass);

	}
	
	@When("Click on Login button")
	public void click_on_login_button() 
	{
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
	}
	
	@Then("It should navigate to the home page")
	public void it_should_navigate_to_the_home_page() 
	{
		System.out.println("login succesfully"); 
	}
	
	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() 
	{
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
	}
	
	@Then("It should show menu option")
	public void it_should_show_menu_option() 
	{
		System.out.println("Menu Option clicked succesfully");
	}
	
	@When("Click view All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher() throws InterruptedException 
	{
	   driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
	   driver.findElement(By.xpath("//button[text()='View All']")).click();
	   Thread.sleep(500);

	   WebElement sales=driver.findElement(By.xpath("(//p[@class='slds-truncate'])[8]"));
       sales.click();

	}
	
	@Then("It should navigate to the Sales page")
	public void it_should_navigate_to_the_sales_page()
	{
		System.out.println("Navigated to Sales page"); 
	}
	
	@When("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException  
	{
	  Thread.sleep(1000);
	  WebElement account=driver.findElement(By.xpath("(//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none'])[6]"));
	  Thread.sleep(1000);
	  account.click();
	}
	
	@Then("It should navigate to the Accounts tab")
	public void it_should_navigate_to_the_accounts_tab()   
	{
		System.out.println("Navigated to Account tab");
	}
	
	@When("Click on New button")
	public void click_on_new_button() 
	{
		 driver.findElement(By.xpath("//div[@title='New']")).click();
	}
	
	@Then("It should navigate to the New Accounts page")
	public void it_should_navigate_to_the_new_accounts_page() 
	{
		System.out.println("Navigated to New Account page");
	}
	
	@When("Enter account name as {string}")
	public void enter_account_name_as(String name) 
	{
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}
	
	@When("Select Ownership as Public")
	public void select_ownership_as_public()
	{
		WebElement owner =driver.findElement(By.xpath("//label[text()='Ownership']"));
		owner.click();
					
		WebElement owner1 = driver.findElement(By.xpath("//span[text()='Public']")); 
		owner1.click(); 
	}
	
	@When("Click on save button")
	public void click_on_save_button()  
	{
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	
	@Then("It should navigate to the Accounts created page")
	public void it_should_navigate_to_the_accounts_created_page()
	{
		System.out.println("New Account got cretaed");
	}
	
	@When("verify the Accounts name {string}")
	public void verify_the_accounts_name(String name1) throws InterruptedException
	 
	{
		Thread.sleep(1000);
		WebElement accountname=driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']"));
		String Accname=accountname.getText();
		System.out.println("New Account name is " + Accname);  
		if (name1.contains(Accname))
		{
			System.out.println("New Account name is correct");	    
		}
		else
		{
			System.out.println("New Account name is not correct");	  
		}
	}
	
	@Then("It should validdate the Accout name")
	public void it_should_validdate_the_accout_name() 
	{
		System.out.println("Account name is verified");	  
	}

}
