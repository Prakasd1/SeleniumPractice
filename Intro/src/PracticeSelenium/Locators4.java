package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String name = "Prakas";
		String email = "ppp@gmail.com";
		String phnum= "98765456";
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Prakas");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		//System.out.println(driver.findElement(By.xpath("//form/p")).getText());
		
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());*/
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder=\"Name\"]")).sendKeys("name");
		driver.findElement(By.cssSelector("form input[placeholder=\"Email\"]")).sendKeys("email");
		driver.findElement(By.xpath("//input[@type=\"text\"][3]")).sendKeys("phnum");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class=\"infoMsg\"]")).getText());
	}
	
	private static String getPassword(WebDriver driver) throws InterruptedException
	{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext = driver.findElement(By.xpath("//p[@class=\"infoMsg\"]")).getText();
		String[] passwordarray = passwordtext.split("'");
		String password = passwordarray[1].split("'")[0];
		return password;
		
	}

}
