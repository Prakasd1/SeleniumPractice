package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Prakas");
		driver.findElement(By.name("password")).sendKeys("Shiva@12345");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		//System.out.println(driver.findElement(By.linkText("Welcome Prakas")).getText());
		//System.out.println(driver.findElement(By.linkText("Your account was created successfully. You are now logged in.")).getText());

	}

}
