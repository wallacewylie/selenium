package testsalesforce;

import org.junit.Test;
import org.openqa.selenium.By;

public class AgentTech extends DriverSetUp {

	String name = "Phil Lynott";
	String agencyCode = "First Test ID (7893)";
	String newID = "ID1234";
	String pass = "Pass1234";
	
	
	@Test
	//public void runTest(WebDriver driver)
	public void runTest() {
		
		logIn();
		goToCustomer();
		createAgencyAssignment();
		goToNewCase();
		completeChips();
		completeTivoli();
		completeLDAP();
		closeCase();
		enableSurety();
		deactivate();
		reactivate();
		completeChips();
		completeTivoli();
		completeLDAP();
		closeCase();
	}
	
		
		
	public void logIn()  {
		// Logging in
		driver.findElement(By.linkText("wallace.wylie@wnins.com.devint")).click();
		driver.findElement(By.id("Login")).click();
		
	}
	
	public void goToCustomer() {
		
		// Go to Customers
		driver.findElement(By.id("Account_Tab")).click();
		//driver.findElement(By.linkText("Customers")).click();
		driver.findElement(By.name("fcf")).click();
		driver.findElement(By.cssSelector("#fcf > option:nth-child(3)")).click();
		driver.findElement(By.name("go")).click();
		driver.findElement(By.id("0015B00000FGMoz_Name")).click();

		driver.findElement(By.xpath("//*[@id='efpViews_0015B00000FGMoz_option1']/span[2]")).click();
		
	}
	
	public void createAgencyAssignment() { 
		
		// Create Agency Assignment
		driver.findElement(By.name("new00N60000002t7rc")).click();
		driver.findElement(By.name("CF00N60000002t7rt")).sendKeys(name);
		driver.findElement(By.id("00N60000002tBW1")).click();
		driver.findElement(By.xpath("//*[@id='00N60000002tBW1']/option[2]")).click();
		driver.findElement(By.xpath("//*[@id='00N60000002tBW7']/option[2]")).click();
		driver.findElement(By.xpath("//*[@id='00N60000002tBWD']/option[3]")).click();
		driver.findElement(By.xpath("//*[@id='00N60000002tBW4']/option[2]")).click();
		driver.findElement(By.xpath("//*[@id='00N60000002zgkL']/option[2]")).click();
		driver.findElement(By.xpath("//*[@id='00N60000002zgkM']/option[2]")).click();
		driver.findElement(By.xpath("//*[@id='00N5B000000bKGs']/option[3]")).click();
		driver.findElement(By.name("CF00N60000002tBW3")).sendKeys(agencyCode);
		driver.findElement(By.name("save")).click();
		
	}
	
	public void goToNewCase() {
		
		// Go to new case
		driver.findElement(By.linkText("New Agent Technology Setup")).click();
		driver.findElement(By.linkText("Details")).click();
		
	}
	
	public void completeChips() {
		
		// Complete Chips task
		driver.findElement(By.linkText("Chips Setup")).click();
		driver.findElement(By.linkText("Details")).click();
		driver.findElement(By.name("edit")).click();
		driver.findElement(By.name("00N60000003ClCz")).sendKeys(newID);
		driver.findElement(By.name("00N60000003ClCv")).click();
		driver.findElement(By.xpath("//*[@id='00N60000003ClCv']/option[5]")).click();
		driver.findElement(By.name("save")).click();
		//driver.findElement(By.id("CF00N60000003ClBv_ileinner")).click();
		driver.findElement(By.linkText("Details")).click();
		//driver.findElement(By.cssSelector("#lookup5005B000002D6tJ00N60000003ClBv")).click();
		//driver.findElement(By.xpath("//*[@id='lookup5005B000002D6tJ00N60000003ClBv']")).click();
		//#lookup5005B000002D6tJ00N60000003ClBv
		driver.findElement(By.cssSelector("a[href*='5005B']")).click();
		driver.findElement(By.linkText("Details")).click();
		
	}
	
	public void completeTivoli() {
		
		// Complete Tivoli task
		driver.findElement(By.linkText("Tivoli Setup")).click();
		driver.findElement(By.linkText("Details")).click();
		driver.findElement(By.name("edit")).click();
		driver.findElement(By.name("00N60000003ClCx")).sendKeys(pass);
		driver.findElement(By.name("00N60000003ClCv")).click();
		driver.findElement(By.xpath("//*[@id='00N60000003ClCv']/option[5]")).click();
		driver.findElement(By.name("save")).click();
		driver.findElement(By.cssSelector("a[href*='5005B']")).click();
		driver.findElement(By.linkText("Details")).click();
		
	}
	
	public void completeLDAP() {
		
		// Complete LDAP task
		//driver.findElement(By.cssSelector("a[href*='00SDNv']")).click();
		driver.findElement(By.linkText("LDAP Setup")).click();
		driver.findElement(By.linkText("Details")).click();
		driver.findElement(By.name("edit")).click();
		driver.findElement(By.name("00N60000003ClCv")).click();
		driver.findElement(By.xpath("//*[@id='00N60000003ClCv']/option[5]")).click();
		driver.findElement(By.name("save")).click();
		driver.findElement(By.cssSelector("a[href*='/5005B']")).click();	
		
	}
	
	public void closeCase() {
		
		// Close case
		driver.findElement(By.name("edit")).click();
		driver.findElement(By.xpath("//*[@id='cas7']/option[3]")).click();
		driver.findElement(By.name("save")).click();
	}
	
	public void enableSurety() {
		
		// Enable surety access
		driver.findElement(By.cssSelector("a[href*='2G5B']")).click();
		//driver.findElement(By.xpath("//*[@id='lookupa2G5B000000hpB400N60000003ClC1']")).click();
		driver.findElement(By.name("edit")).click();
		driver.findElement(By.xpath("//*[@id='00N60000002tBWD']/option[1]")).click();
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Enable Surety Access")).click();
		driver.findElement(By.name("close_case_stay_on_page")).click();
		
	}
	
	public void deactivate() {
		
		// Deactivate
		driver.findElement(By.cssSelector("a[href*='2G5B']")).click();
		driver.findElement(By.name("edit")).click();
		driver.findElement(By.xpath("//*[@id='00N60000002tBW1']/option[2]")).click();
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Agent Termination: Deactivate Tivoli Account")).click();
		driver.findElement(By.name("close_case_stay_on_page")).click();
		
	}
		
	
	public void reactivate() {
		// Reactivate
		driver.findElement(By.cssSelector("a[href*='2G5B']")).click();
		driver.findElement(By.name("edit")).click();
		driver.findElement(By.xpath("//*[@id='00N60000002tBW1']/option[1]")).click();
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("This Agent is being Re-Activated")).click();
		driver.findElement(By.linkText("Details")).click();
		
	}
	
}
