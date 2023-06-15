package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2EjetAirlines {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Ahmedabad']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[text()='MAA']")).click();
		
		/*while (!driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-rs99b7 r-6koalj r-eqz5dr r-1pi2tsx r-pm9dpa r-1knelpx r-13qz1uu'])[1]")).getText().contains("July"));
		
		//while (!driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]")).getText().contains("July"));
		{
			driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[1]")).click();
		}*/
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector('div.css-1dbjc4n.r-akgwms.r-13awgt0.r-1pi2tsx.r-p1pxzi.r-sa2ff0.r-1udh08x div.css-1dbjc4n.r-1niwhzg.r-1jgb5lz.r-r0h9e2.r-13qz1uu div.css-1dbjc4n.r-14lw9ot:nth-child(1) div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-11ict49.r-8uuktl.r-136ojw6:nth-child(3) div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim:nth-child(2) div.css-1dbjc4n.r-19h5ruw.r-136ojw6:nth-child(4) div:nth-child(1) div.css-1dbjc4n.r-1niwhzg.r-z2wwpe.r-17b9qp5.r-1g94qm0.r-h3f8nf.r-u8s1d.r-u3yave.r-8fdsdq:nth-child(2) div.css-1dbjc4n.r-14lw9ot.r-11u4nky.r-rs99b7.r-6koalj.r-eqz5dr.r-1pi2tsx.r-pm9dpa.r-1knelpx.r-13qz1uu:nth-child(2) div.css-1dbjc4n.r-1euycsn:nth-child(3) > div.css-1dbjc4n.r-150rngu.r-18u37iz.r-16y2uox.r-1wbh5a2.r-lltvgl.r-buy8e9.r-1sncvnh:nth-child(2)').scrollLeft=1000");
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'][normalize-space()='September 2023']"));
		
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']"));
		int count = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']")).size();
		
		for (int i=0; i<count; i++)
		{
			String text = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']")).get(i).getText();
			
			if (text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']")).get(i).click();
				break;
			}
		}
		
		
		//driver.findElement(By.xpath("(//div[@class='css-1dbjc4n'])[58]")).click();
		driver.findElement(By.cssSelector("div.css-1dbjc4n.r-akgwms.r-13awgt0.r-1pi2tsx.r-p1pxzi.r-sa2ff0.r-1udh08x div.css-1dbjc4n.r-1niwhzg.r-1jgb5lz.r-r0h9e2.r-13qz1uu div.css-1dbjc4n.r-14lw9ot:nth-child(1) div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-11ict49.r-8uuktl.r-136ojw6:nth-child(3) div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim:nth-child(2) div.css-1dbjc4n.r-18u37iz.r-19h5ruw.r-184en5c:nth-child(5) > div.css-1dbjc4n:nth-child(1)")).click();
		
		for (int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid\"])[1]")).click();

		}
		
		
		
		
		
		

	}

}
