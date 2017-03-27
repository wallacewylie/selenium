package testsalesforce;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverSetUp {
	
	public static WebDriver driver;
	
	@Before
	public void setUpDriver () {
	System.setProperty("webdriver.ie.driver", "U:\\Tools\\WebDrivers\\IE\\x32\\IEDriverServer.exe");
	 driver = new InternetExplorerDriver();
	 driver.get("https://test.salesforce.com/");
	 driver.manage().window().maximize();
	}
	 
//	@Test
//	public void runTest()
//	{
//		setUpDriver();
//	}
	
	@After
	public void cleanUp()
	{
		driver.close();
	}
}

