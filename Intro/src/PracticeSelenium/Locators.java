package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(5000);
		//driver.findElement(By.name("username")).sendKeys("Prakas");
		driver.findElement(By.linkText("Register")).click();
		System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
		//Assert.assertEquals(driver.findElement(By.xpath("//div/h1")), "Signing up is easy!");
		driver.findElement(By.id("customer.firstName")).sendKeys("Prakas");
		driver.findElement(By.name("customer.lastName")).sendKeys("das");
		driver.findElement(By.name("customer.address.street")).sendKeys("patia");
		driver.findElement(By.cssSelector("input[name=\"customer.address.city\"]")).sendKeys("BBSR");
		driver.findElement(By.xpath("//input[@name=\"customer.address.state\"]")).sendKeys("Odisha");
		driver.findElement(By.cssSelector("input[name=\"customer.address.zipCode\"]")).sendKeys("767678");
		driver.findElement(By.xpath("//input[@name=\"customer.phoneNumber\"]")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name=\"customer.ssn\"]")).sendKeys("789654345");
		driver.findElement(By.cssSelector("input[name=\"customer.username\"]")).sendKeys("Prakas");
		driver.findElement(By.cssSelector("input[name=\"customer.password\"]")).sendKeys("Shiva@12345");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Shiva@12345");
		driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
		//System.out.println(driver.findElement(By.linkText("Welcome Prakas")).getText());
		//System.out.println(driver.findElement(By.linkText("Your account was created successfully. You are now logged in.")).getText());
		
}
}
