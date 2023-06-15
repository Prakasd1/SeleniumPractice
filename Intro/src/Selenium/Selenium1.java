 package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
					
				System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
				//System.setProperty(null, null)
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
				Select options = new Select(dropdown);
				
				if (options.isMultiple())
				{
					System.out.println("It is multiselect dropdown");
				}
				else
				{
					System.out.println("It is single select dropdown");
				}
				
				
				
				List<WebElement> allops = options.getOptions();
				System.out.println("Total Options Count: " + allops.size());
				for (int i = 0; i<allops.size(); i++)
				{
					System.out.println(allops.get(i));
				}
				
				WebElement wrap = options.getWrappedElement();
				System.out.println(wrap.getText());
				
				options.deselectAll();
				for (int j=0; j<allops.size()-1; j++)
				{
					System.out.println(allops.get(j));
					options.deselectByIndex(j);
					Thread.sleep(3000);
				}
				
				
				
				
				

			}

		}

	