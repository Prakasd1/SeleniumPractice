package seleniummethodpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipcartmouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		Actions m  = new Actions(driver);
		m.moveToElement(driver.findElement(By.cssSelector("span[id=nav-link-accountList-nav-line-1]"))).build().perform();
		
		m.keyDown(driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]")), Keys.SHIFT).sendKeys("hello").build().perform();
		driver.close();
		

	}

}
