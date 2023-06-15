package seleniummethodpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.xpath("//input[@id=\"ap_customer_name\"]")).sendKeys("Prakash");
		driver.findElement(By.id("ap_phone_number")).sendKeys("7897897899");
		driver.findElement(By.id("ap_email")).sendKeys("prakash@gmail.com");
		driver.findElement(By.name("password")).sendKeys("asdf@123");
		driver.findElement(By.className("a-button-input")).click();
		System.out.println(driver.findElement(By.className("a-button-input")).getText());
		

	}

}
