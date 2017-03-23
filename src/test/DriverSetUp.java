package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverSetUp {
	
	public static WebDriver driver;
	
	//@Before
	public static void setUpDriver () {
	System.setProperty("webdriver.ie.driver", "U:\\Tools\\WebDrivers\\IE\\x32\\IEDriverServer.exe");
	 driver = new InternetExplorerDriver();
	 driver.get("https://test.salesforce.com/");
	}
	 
//	@Test
//	public void runTest()
//	{
//		setUpDriver();
//	}
	
	@Test
	public void newTest()
	{
		setUpDriver();
	}
}

