package seleniummethodpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		Thread.sleep(3000);
		act.click(driver.findElement(By.cssSelector("a"))).build().perform();
		
		//act.clickAndHold(driver.findElement(By.cssSelector("input[placeholder=\"Enter Your Name\"]"))).keyDown(null)
		act.keyDown(driver.findElement(By.cssSelector("input[placeholder=\"Enter Your Name\"]")), Keys.SHIFT).sendKeys("hello").build().perform();
		
		
		driver.get("https://www.facebook.com/");
		
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("hello");
		//Thread.sleep(2000);
		ac.sendKeys(Keys.CONTROL,"c");
			
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys(Keys.CONTROL, "v");
		*/
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		

	}

}
