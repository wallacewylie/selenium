package testsalesforce;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewAccount {
	/*
	driver.findElement(By.className("x-btn-mc")).click();
	driver.switchTo().frame("scc_widget_CreateAccount");
	
	Random rand = new Random();

	int m = rand.nextInt(500) + 1;
	int n = rand.nextInt(500) + 1;
	int o = rand.nextInt(500) + 1;
	
	String firstName = "Firstname" + m;
	String lastName = "Testname" + n;
	String email = "randomemail" + o + "@mail.com";
	String phone = "651-111-0000";
	*/
	
	public static void enter_FirstName(String firstName, WebDriver driver)
	{
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
	}
	
	public static void enter_LasttName(String lastName, WebDriver driver)
	{
		driver.findElement(By.id("LastName")).sendKeys(lastName);
	}
	/*
	public static void enter_FirstName(WebDriver driver)
	{
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
	}
	
	public static void enter_FirstName(WebDriver driver)
	{
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
	}
		driver.findElement(By.id("LastName")).sendKeys(lastName);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Phone")).sendKeys(phone);
	
	driver.findElement(By.id("SaveBtn")).click();
	
	
    driver.switchTo().defaultContent();
	
    driver.findElement(By.className("x-btn-mc")).click();
*/
}
