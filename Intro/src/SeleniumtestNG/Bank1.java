package SeleniumtestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bank1 {
	
	@Test(groups= {"Smoke"})
	public void savingAccount()
	{
		System.out.println("i am saving account");
	}
	@Test(enabled=false)
	public void carloan()
	{
		System.out.println("CarloanLogin");
	}
	
	@Test(dependsOnMethods={"savingAccount"})
	public void homeloan()
	{
		System.out.println("homeloanLogin");
	}
	@Test
	public void personalloan()
	{
		System.out.println("PersonalloanLogin");
	}
	
	@BeforeTest
	public void personalloanlgn()
	{
		System.out.println("PersonalloanLogin should be first");
	}
	
	@AfterTest
	public void personalloanglugt()
	{
		System.out.println("PersonalloanLogout should be last");
	}
	
	@BeforeMethod
	public void bfrclass() 
	{
		System.out.println("I am before mthod annotation");
	}
	@AfterMethod
	public void aftrclass()
	{
		System.out.println("I am after method annotations");
	}
	@BeforeSuite
	public void bfrSuite()
	{
		System.out.println("I am before suite method annotations");
	}
	
	@AfterSuite
	public void atrSuite()
	{
		System.out.println("I am after suite method annotations");
	}
	
	@BeforeClass
	public void bfrclassmethod()
	{
		System.out.println("I am before class method");
	}
	
	@AfterClass
	public void afterclassmethod()
	{
		System.out.println("I am after class method");
	}





}
