package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_6_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,600)");
		
		WebElement product = driver.findElement(By.cssSelector(".table-display"));
		System.out.println(product.findElements(By.tagName("tr")).size());
		System.out.println(product.findElements(By.tagName("th")).size());
		
		System.out.println(driver.findElement(By.cssSelector(".table-display tbody tr:nth-child(3)")).getText());
		
		
	}

}
