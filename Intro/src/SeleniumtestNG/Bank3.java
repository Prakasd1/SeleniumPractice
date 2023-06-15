package SeleniumtestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Bank3 {

	
	@Test
	public void loan()
	{
		System.out.println("Login to bank account");
	}
	
	@Test
	public void applyLoan()
	{
		System.out.println("Apply for Loan");
	}
}
