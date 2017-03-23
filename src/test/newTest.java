package test;

import java.util.Random;

import org.openqa.selenium.By;

public class newTest extends DriverSetUp {

public void newTest() {

	DriverSetUp.setUpDriver();
	
	driver.findElement(By.linkText("wallace.wylie@wnins.com.staging")).click();
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.linkText("Remind Me Later")).click();
	
	driver.findElement(By.className("x-btn-mc")).click();
	driver.switchTo().frame("scc_widget_CreateAccount");
	
	Random rand = new Random();

	int  n = rand.nextInt(500) + 1;
	int  m = rand.nextInt(500) + 1;
	
	String firstName = "Firstname" + m;
	String lastName = "Lastname" + n;
	
	driver.findElement(By.id("FirstName")).sendKeys(firstName);
	driver.findElement(By.id("LastName")).sendKeys(lastName);
	driver.findElement(By.id("SaveBtn")).click();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("ext-gen97")).click();
	driver.switchTo().frame("scc_widget_Notes");
	
	String testWords = "This is a test.";
	
	driver.findElement(By.id("notesInput")).sendKeys(testWords);
	driver.findElement(By.id("saveButton")).click();
	driver.findElement(By.id("notesInput")).clear();
	driver.findElement(By.id("saveButton")).click();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.className("x-btn-mc")).click();
	driver.switchTo().frame("scc_widget_CreateAccount");
	
	
	driver.findElement(By.id("FirstName")).sendKeys(firstName);
	driver.findElement(By.id("LastName")).sendKeys(lastName);
	driver.findElement(By.id("SaveBtn")).click();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("ext-gen97")).click();
	driver.switchTo().frame("scc_widget_Notes");
	
	driver.findElement(By.id("notesInput")).sendKeys(testWords);
	driver.findElement(By.id("saveButton")).click();
	driver.findElement(By.id("notesInput")).clear();
	driver.findElement(By.id("saveButton")).click();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.className("x-btn-mc")).click();
	driver.switchTo().frame("scc_widget_CreateAccount");
	
	
	driver.findElement(By.id("FirstName")).sendKeys(firstName);
	driver.findElement(By.id("LastName")).sendKeys(lastName);
	driver.findElement(By.id("SaveBtn")).click();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("ext-gen97")).click();
	driver.switchTo().frame("scc_widget_Notes");
	
	driver.findElement(By.id("notesInput")).sendKeys(testWords);
	driver.findElement(By.id("saveButton")).click();
	driver.findElement(By.id("notesInput")).clear();
	driver.findElement(By.id("saveButton")).click();
	
}
}