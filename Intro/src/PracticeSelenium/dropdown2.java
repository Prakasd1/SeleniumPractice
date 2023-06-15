package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Prakash/Automation/chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div/div/div[contains(text(),'Bengaluru')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Hyderabad')]")).click();*/
		//driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73\"])[2]").
		driver.findElement(By.cssSelector("div.css-1dbjc4n.r-akgwms.r-13awgt0.r-1pi2tsx.r-p1pxzi.r-sa2ff0.r-1udh08x div.css-1dbjc4n.r-1niwhzg.r-1jgb5lz.r-r0h9e2.r-13qz1uu div.css-1dbjc4n.r-14lw9ot:nth-child(1) div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-11ict49.r-8uuktl.r-136ojw6:nth-child(3) div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim:nth-child(2) div.css-1dbjc4n.r-18u37iz.r-19h5ruw.r-184en5c:nth-child(5) > div.css-1dbjc4n:nth-child(1)")).click();
		Thread.sleep(3000);
		for (int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid\"])[1]")).click();

		}
		
		//driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]")).click();
		for (int j=0;j<3;j++)
		{
			driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid\"])[2]")).click();
		}
		int k=0;
		while(k<2)
		{
			driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid\"])[3]")).click();
			k++;
		}
		
		System.out.println(driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid\"])[1]")).getText());
		System.out.println(driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid\"])[2]")).getText());
		System.out.println(driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid\"])[3]")).getText());
	}

}
