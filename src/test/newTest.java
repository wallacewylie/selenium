package test;

import java.util.Random;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class newTest extends DriverSetUp {

public void newTest() {

	DriverSetUp.setUpDriver();
	driver.findElement(By.linkText("wallace.wylie@wnins.com.staging")).click();
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.linkText("Remind Me Later")).click();
	
	int count = 10;
	
	while (count < 15) {	
		
	driver.switchTo().defaultContent();
	randomGenerator();
	count++;
	
	System.out.println(count);
	}
}


// randomGenerator switches between creating a new account and a new note
public void randomGenerator() {
	
	Random ifrand = new Random();
	
	int a = ifrand.nextInt(2);
	
	
	if (a == 1) {
		newAccount();
	}  
		else {
	    newNote();	
	}
	System.out.println(a);
}

public void newAccount() {
	
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
	
	driver.findElement(By.id("FirstName")).sendKeys(firstName);
	driver.findElement(By.id("LastName")).sendKeys(lastName);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Phone")).sendKeys(phone);
	
	driver.findElement(By.id("SaveBtn")).click();
	
	
    driver.switchTo().defaultContent();
	
    driver.findElement(By.className("x-btn-mc")).click();
}

public void newNote() {
	
	driver.findElement(By.id("ext-gen97")).click();
	driver.switchTo().frame("scc_widget_Notes");
	
	String testWords = " This is a test. ";
	
	
	driver.findElement(By.id("notesInput")).sendKeys(testWords);
	driver.findElement(By.id("saveButton")).click();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("ext-gen97")).click();
}

}