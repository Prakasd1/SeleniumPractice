package PracticeSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.cssSelector("a[target=\"_blank\"]")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid =  it.next();
		
		driver.switchTo().window(childid);
		driver.findElement(By.name("emailid")).sendKeys("prakas@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'mngr100910')]")));
		
		
		/*Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'mngr100910')]")).getText());
		System.out.println(driver.findElement(By.xpath("//td[contains(text(),'ErenAve')]")).getText());
		System.out.println("Userid of " + user);
		System.out.println("Password of "+ password);*/
		driver.close();
		driver.switchTo().window(parentid);
		
		
		
		
		
		
		
		

	}

}
