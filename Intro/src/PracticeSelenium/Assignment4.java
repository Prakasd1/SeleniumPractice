package PracticeSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set <String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String Parentid = it.next();
		String Childid = it.next();
		driver.switchTo().window(Childid);
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		driver.switchTo().window(Parentid);
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		
		
		

	}

}
