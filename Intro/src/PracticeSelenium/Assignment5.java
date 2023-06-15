package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String abc=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText(abc);
		driver.findElement(By.id("name")).sendKeys(abc);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		 if(text.contains(abc))

	     {

	    System.out.println("Alert message success");

	     }

	     else

	    System.out.println("Something wrong with execution");

	

	} 

}
