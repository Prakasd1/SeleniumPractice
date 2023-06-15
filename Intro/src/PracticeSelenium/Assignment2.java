package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(Options);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys("Prakash");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("prakas@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Prakash1");
		driver.findElement(By.id("exampleCheck1")).click();
		

		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select as = new Select(dropdown);
		as.selectByVisibleText("Female");
		
		driver.findElement(By.xpath("(//input[@class=\"form-check-input\"]) [2]")).isSelected();
		driver.findElement(By.name("bday")).sendKeys("02/02/1992");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
