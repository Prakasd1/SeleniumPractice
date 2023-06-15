package PracticeSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create an Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Prakash");
		driver.findElement(By.id("lastname")).sendKeys("Das");
		driver.findElement(By.name("email")).sendKeys("prakash11@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Shivay@12345");
		driver.findElement(By.name("password_confirmation")).sendKeys("Shivay@12345");
		driver.findElement(By.xpath("//button[@title=\"Create an Account\"]")).click();	
		/*driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.cssSelector("input[title=\"Email\"]")).sendKeys("roni_cost@example.com");
		driver.findElement(By.xpath("//input[@title=\"Password\"]")).sendKeys("roni_cost3@example.com");
		//driver.findElement(By.xpath("//span[@xpath=\"1\"]")).click();
		driver.findElement(By.linkText("Sign In")).click();
		//driver.findElement(By.linkText("Forgot Your Password?")).click();*/
		
	}


}
