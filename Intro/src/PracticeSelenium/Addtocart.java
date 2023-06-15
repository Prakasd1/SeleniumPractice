package PracticeSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(Options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] vegetable = { "Brocolli", "Cucumber", "Brinjal" };
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//Thread.sleep(3000);
		addItems(driver, vegetable);
		driver.findElement(By.cssSelector(".cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("India");
		
		driver.findElement(By.cssSelector(".chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		
		
	}

	public static void addItems(WebDriver driver, String[] vegetable) {
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();
			List vegNeededList = Arrays.asList(vegetable);
			if (vegNeededList.contains(formattedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == vegetable.length) {
					break;
				}
			}
		}
	}
	
	

}
