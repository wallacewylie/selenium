package testsalesforce;

import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class runTest extends DriverSetUp {

	// WebDiver d = driver;
	
	@Test
	//public void runTest(WebDriver driver)
	public void runTest() 
	{
		
	//	DriverSetUp.setUpDriver();
		
		driver.findElement(By.linkText("wallace.wylie@wnins.com.devint")).click();
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.linkText("Remind Me Later")).click();
		driver.findElement(By.linkText("Customers")).click();
		driver.findElement(By.id("fcf")).click();
		driver.findElement(By.cssSelector("#fcf > option:nth-child(4)")).click();
		driver.findElement(By.name("go")).click();
		driver.findElement(By.name("new")).click();
		driver.findElement(By.name("p3")).click();
		driver.findElement(By.cssSelector("#p3 > option:nth-child(3)")).click();
		driver.findElement(By.cssSelector("input.btn:nth-child(1)")).click();
		
		
		Random rand = new Random();

		int  n = rand.nextInt(500) + 1;
		int  m = rand.nextInt(500) + 1;
		
		String firstName = "Firstname" + m;
		String lastName = "Lastname" + n;
		
		driver.findElement(By.id("name_firstacc2")).sendKeys(firstName);
		driver.findElement(By.id("name_lastacc2")).sendKeys(lastName);
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Details")).click();
	}
	
}
