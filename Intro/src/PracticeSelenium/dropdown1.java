package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		
		/*for (int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}*/
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		for (int j=0;j<3;j++)
		{
			driver.findElement(By.id("hrefIncChd")).click();
		}
		
		for (int k=0; k<2;k++)
		{
			driver.findElement(By.id("hrefIncInf")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.print(driver.findElement(By.id("divpaxinfo")).getText());
		System.out.print(driver.findElement(By.id("hrefIncChd")).getText());
		System.out.print(driver.findElement(By.id("hrefIncInf")).getText());

	}

}
